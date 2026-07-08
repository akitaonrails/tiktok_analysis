package X;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.zhihu.matisse.internal.entity.Album;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.13sd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20148913sd implements InterfaceC20148313sX<Cursor> {
    public WeakReference<Context> LIZ;
    public AbstractC20148113sV LIZIZ;
    public InterfaceC20149113sf LIZJ;

    @Override // X.InterfaceC20148313sX
    public final void LIZJ() {
        if (this.LIZ.get() == null) {
            return;
        }
        this.LIZJ.yy();
    }

    @Override // X.InterfaceC20148313sX
    public final void LIZ(Object obj) {
        Cursor cursor = (Cursor) obj;
        if (this.LIZ.get() != null) {
            this.LIZJ.Xi(cursor);
        }
    }

    @Override // X.InterfaceC20148313sX
    public final C20147913sT LIZIZ(Bundle bundle) {
        Album album;
        boolean z;
        String[] strArr;
        String str;
        Context context = this.LIZ.get();
        if (context == null || (album = (Album) bundle.getParcelable("args_album")) == null) {
            return null;
        }
        boolean z2 = false;
        if (album.LIZIZ() && bundle.getBoolean("args_enable_capture", false)) {
            z = true;
        } else {
            z = false;
        }
        Uri uri = C20148713sb.LJIJJ;
        if (album.LIZIZ()) {
            C201963140r c201963140r = C20149313sh.LIZ;
            str = "media_type=? AND _size>0";
            if (c201963140r.LIZ()) {
                strArr = new String[]{String.valueOf(1)};
            } else if (c201963140r.LIZIZ()) {
                strArr = new String[]{String.valueOf(3)};
            } else {
                strArr = C20148713sb.LJIL;
                str = "(media_type=? OR media_type=?) AND _size>0";
            }
            z2 = z;
        } else {
            C201963140r c201963140r2 = C20149313sh.LIZ;
            if (c201963140r2.LIZ()) {
                strArr = new String[]{String.valueOf(1), album.mId};
            } else if (c201963140r2.LIZIZ()) {
                strArr = new String[]{String.valueOf(3), album.mId};
            } else {
                strArr = new String[]{String.valueOf(1), String.valueOf(3), album.mId};
                str = "(media_type=? OR media_type=?) AND  bucket_id=? AND _size>0";
            }
            str = "media_type=? AND  bucket_id=? AND _size>0";
        }
        return new C20148713sb(context, str, strArr, z2);
    }
}
