package X;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: renamed from: X.0Wcr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C827310Wcr {
    public final Context LIZ;
    public String LIZLLL;
    public String LJ;
    public boolean LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJJI;
    public int LIZIZ = 20971520;
    public int LIZJ = 1048576;
    public boolean LJFF = true;
    public boolean LJI = true;
    public int LJIIJ = 256;

    public final C827360Wcw LIZ() {
        C827360Wcw c827360Wcw = new C827360Wcw();
        c827360Wcw.LIZ = this.LIZ;
        c827360Wcw.LIZIZ = 14;
        c827360Wcw.LIZJ = this.LIZIZ;
        c827360Wcw.LJIILL = 0.1f;
        c827360Wcw.LIZLLL = this.LIZJ;
        c827360Wcw.LJ = TextUtils.isEmpty(this.LIZLLL) ? C08OV.LIZIZ(this.LIZ) : this.LIZLLL;
        c827360Wcw.LJFF = TextUtils.isEmpty(this.LJ) ? C08OV.LIZJ(this.LIZ).getAbsolutePath() : this.LJ;
        c827360Wcw.LJI = this.LJFF;
        c827360Wcw.LJII = this.LJI;
        c827360Wcw.LJIIIIZZ = 3;
        c827360Wcw.LJIIIZ = "fecbb32b759120b672045f74edc41d159b6a426ffc863b9e0be9ad4be12824546f549959b838993a430344f15197221e87bd362298814c75f5068148b980306f";
        c827360Wcw.LJIIJ = true;
        c827360Wcw.LJIIJJI = this.LJII;
        c827360Wcw.LJIILIIL = this.LJIIIZ;
        c827360Wcw.LJIIL = this.LJIIIIZZ;
        c827360Wcw.LJIILJJIL = this.LJIIJ;
        c827360Wcw.LJIILLIIL = this.LJIIJJI;
        return c827360Wcw;
    }

    public C827310Wcr(Context context) {
        if (context != null) {
            Context contextN3 = C786410Ut5.N3(context);
            this.LIZ = contextN3 != null ? contextN3 : context;
            return;
        }
        throw new RuntimeException("context must not be null");
    }
}
