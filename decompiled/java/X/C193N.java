package X;

import X.C05YF;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.193N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C193N<API extends C05YF, STATE, ACTION> extends C193O<API, STATE, ACTION> {
    @Override // X.C193O
    public abstract ACTION B3();

    @Override // X.C193O
    public abstract InterfaceC1738600vLO E3();

    public AnonymousClass1931<?, STATE, ACTION> F4() {
        return null;
    }

    public abstract C10J3 H4();

    @Override // X.C193O
    public abstract void Q3();

    @Override // X.C193O, X.AbstractC1664470tPp
    public abstract Function0<STATE> o2();

    @Override // X.C193O
    public void e4() {
        AnonymousClass1931<?, STATE, ACTION> anonymousClass1931F4 = F4();
        if (anonymousClass1931F4 != null) {
            o4(anonymousClass1931F4, C19223210Ik.LIZ);
        }
    }

    @Override // X.C193O
    public void v3() {
        q3(H4());
    }

    public C193N(C1DRG c1drg) {
        super(c1drg);
    }
}
