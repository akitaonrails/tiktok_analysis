package X;

import X.C033V;
import java.util.List;
import kotlin.jvm.internal.AFwS185S0000000_1;

/* JADX INFO: renamed from: X.032O, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C032O<BO extends C033V> implements C033T<BO> {
    public final String LIZ;
    public final String LIZIZ;

    public void LIZ(C032F c032f) {
    }

    public abstract List<AbstractC723102s1> LIZIZ(C770802zi c770802zi, BO bo);

    public C032O(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }

    public final List<AbstractC723102s1> LIZJ(C032F c032f, BO bo) {
        LIZ(c032f);
        C032J c032jLIZ = c032f.LIZLLL.LIZ(this.LIZ, this.LIZIZ);
        if (c032jLIZ != null) {
            c032jLIZ.LIZ = bo;
        }
        List<AbstractC723102s1> listLIZIZ = LIZIZ(c032f.LIZ, bo);
        InterfaceC769902zZ interfaceC769902zZLIZ = c032f.LIZIZ.LIZ(C032N.class);
        if (!(interfaceC769902zZLIZ instanceof C032N) || interfaceC769902zZLIZ == null) {
            C035T c035t = C035T.LIZ;
            AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(312);
            c035t.getClass();
            C035T.LIZ(aFwS185S0000000_1);
        }
        return listLIZIZ;
    }
}
