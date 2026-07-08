package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jmp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1294330jmp implements InterfaceC1294390jmv {
    public final Context LIZ;
    public final Function0<Bitmap> LIZIZ;

    @Override // X.InterfaceC1294390jmv
    public final Bitmap LIZ(C1294320jmo c1294320jmo) {
        boolean z;
        if (!Intrinsics.LJFF(c1294320jmo.LIZJ, "Avatar.png") && !Intrinsics.LJFF(c1294320jmo.LIZLLL, "Avatar.png")) {
            z = false;
        } else {
            z = true;
        }
        Bitmap bitmapInvoke = this.LIZIZ.invoke();
        if (z && bitmapInvoke != null && !bitmapInvoke.isRecycled()) {
            return bitmapInvoke;
        }
        try {
            return BitmapFactory.decodeResource(this.LIZ.getResources(), R.drawable.c5w);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C1294330jmp(Context context, Function0<Bitmap> function0) {
        this.LIZ = context;
        this.LIZIZ = function0;
    }
}
