package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676950tjx<S> extends AbstractC1676900tjs<S> {
    public S LIZIZ;
    public C1676910tjt<S> LIZJ;

    @Override // X.AbstractC1676900tjs
    public final void LJ() {
        this.LIZJ = null;
        ((C20029113Yj) C1676860tjo.LIZIZ.getValue()).LIZJ(this);
    }

    static {
        new C1677280tkU(0.0f);
        new C1677280tkU(1.0f);
    }

    @Override // X.AbstractC1676900tjs
    public final S LIZ() {
        throw null;
    }

    @Override // X.AbstractC1676900tjs
    public final S LIZIZ() {
        throw null;
    }

    @Override // X.AbstractC1676900tjs
    public final void LIZJ(S s) {
        throw null;
    }

    @Override // X.AbstractC1676900tjs
    public final void LIZLLL(C1676910tjt<S> c1676910tjt) {
        C1676910tjt<S> c1676910tjt2 = this.LIZJ;
        if (c1676910tjt2 != null && !Intrinsics.LJFF(c1676910tjt, c1676910tjt2)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: ");
            sbLIZ.append(this.LIZJ);
            sbLIZ.append(", new instance: ");
            sbLIZ.append(c1676910tjt);
            C1676960tjy.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        this.LIZJ = c1676910tjt;
    }
}
