package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tjq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1676880tjq<S> extends AbstractC1676900tjs<S> {
    public final C05P0 LIZIZ;
    public final C05P0 LIZJ;

    @Override // X.AbstractC1676900tjs
    public final void LIZLLL(C1676910tjt<S> c1676910tjt) {
    }

    @Override // X.AbstractC1676900tjs
    public final void LJ() {
    }

    @Override // X.AbstractC1676900tjs
    public final S LIZ() {
        return (S) this.LIZIZ.getValue();
    }

    @Override // X.AbstractC1676900tjs
    public final S LIZIZ() {
        return (S) this.LIZJ.getValue();
    }

    public final boolean LJFF() {
        return Intrinsics.LJFF(LIZ(), LIZIZ()) && !((Boolean) ((C13FE) this.LIZ).getValue()).booleanValue();
    }

    public C1676880tjq(S s) {
        this.LIZIZ = C20028913Yh.LJI(s);
        this.LIZJ = C20028913Yh.LJI(s);
    }

    @Override // X.AbstractC1676900tjs
    public final void LIZJ(S s) {
        ((C13FE) this.LIZIZ).setValue(s);
    }

    public final void LJI(S s) {
        ((C13FE) this.LIZJ).setValue(s);
    }
}
