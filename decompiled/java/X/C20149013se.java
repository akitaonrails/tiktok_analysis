package X;

import Y.ARunnableS99S0200000_30;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.zhihu.matisse.ui.MatisseActivity;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.13se, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20149013se implements InterfaceC20148313sX<Cursor> {
    public WeakReference<Context> LIZ;
    public AbstractC20148113sV LIZIZ;
    public InterfaceC20149213sg LIZJ;
    public int LIZLLL;
    public boolean LJ;

    @Override // X.InterfaceC20148313sX
    public final void LIZJ() {
        if (this.LIZ.get() == null) {
            return;
        }
        ((MatisseActivity) this.LIZJ).LLILZIL.swapCursor(null);
    }

    @Override // X.InterfaceC20148313sX
    public final void LIZ(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.LIZ.get() != null && !this.LJ) {
            this.LJ = true;
            MatisseActivity matisseActivity = (MatisseActivity) this.LIZJ;
            matisseActivity.LLILZIL.swapCursor(cursor);
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS99S0200000_30(cursor, matisseActivity, 24));
        }
    }

    @Override // X.InterfaceC20148313sX
    public final C20147913sT LIZIZ(Bundle bundle) {
        String[] strArr;
        Context context = this.LIZ.get();
        if (context == null) {
            return null;
        }
        this.LJ = false;
        Uri uri = C20148813sc.LJIJI;
        C201963140r c201963140r = C20149313sh.LIZ;
        String str = "media_type=? AND _size>0) GROUP BY (bucket_id";
        if (c201963140r.LIZ()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = new String[]{String.valueOf(1)};
        } else if (c201963140r.LIZIZ()) {
            if (Build.VERSION.SDK_INT >= 29) {
                str = "media_type=? AND _size>0";
            }
            strArr = new String[]{String.valueOf(3)};
        } else {
            if (Build.VERSION.SDK_INT < 29) {
                str = "(media_type=? OR media_type=?) AND _size>0) GROUP BY (bucket_id";
            } else {
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            strArr = C20148813sc.LJJ;
        }
        return new C20148813sc(context, str, strArr);
    }
}
