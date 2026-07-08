package X;

import X.C033V;
import X.InterfaceC769902zZ;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.032P, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public abstract class C032P<BO extends C033V, P extends InterfaceC769902zZ> extends C032O<BO> {
    public final Class<P> LIZJ;
    public P LIZLLL;

    @Override // X.C032O
    public final void LIZ(C032F c032f) {
        P p = (P) c032f.LIZIZ.LIZ(this.LIZJ);
        if (!(p instanceof InterfaceC769902zZ)) {
            p = null;
        }
        this.LIZLLL = p;
        if (p == null) {
            C035T c035t = C035T.LIZ;
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(this, 1567);
            c035t.getClass();
            C035T.LIZ(awS545S0100000_1);
        }
    }

    public C032P(Class cls, String str, String str2) {
        super(str, str2);
        this.LIZJ = cls;
    }
}
