package X;

import android.R;
import android.app.Activity;
import android.os.Bundle;
import com.bytedance.scene.Scene;

/* JADX INFO: renamed from: X.197f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C214873197f {
    public final Activity LIZ;
    public final Class<? extends Scene> LIZIZ;
    public Bundle LIZJ;
    public boolean LJI;
    public InterfaceC214877197j LJII;
    public boolean LIZLLL = true;
    public boolean LJ = true;
    public int LJFF = R.id.content;
    public String LJIIIIZZ = "LifeCycleFragment";
    public boolean LJIIIZ = true;

    public final InterfaceC1655610tBX LIZ() {
        C214936199q c214936199q = new C214936199q(this.LIZJ, this.LIZIZ);
        c214936199q.LIZJ = this.LIZLLL;
        c214936199q.LIZLLL = this.LJ;
        c214936199q.LJ = 0;
        c214936199q.LJI = 0.0f;
        c214936199q.LJFF = false;
        c214936199q.LJIIZILJ = false;
        return C19CA.LIZIZ(this.LIZ, this.LJFF, c214936199q, this.LJII, this.LJI, this.LJIIIIZZ, this.LJIIIZ);
    }

    public C214873197f(Activity activity, Class cls) {
        C19BL.LJI(activity, "Activity can't be null");
        this.LIZ = activity;
        C19BL.LJI(cls, "Root Scene class can't be null");
        this.LIZIZ = cls;
    }
}
