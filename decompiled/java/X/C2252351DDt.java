package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.1DDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2252351DDt implements InterfaceC2238208po {
    public final C2252331DDr<?> LL;
    public final long LLILLJJLI;
    public final Object LLILLL;
    public final InterfaceC1364105Vn<Unit> LLILZ;

    @Override // X.InterfaceC2238208po
    public final void dispose() {
        C2252331DDr<?> c2252331DDr = this.LL;
        synchronized (c2252331DDr) {
            if (this.LLILLJJLI < c2252331DDr.LJIILJJIL()) {
                return;
            }
            Object[] objArr = c2252331DDr.LLIZLLLIL;
            int i = (int) this.LLILLJJLI;
            if (objArr[(objArr.length - 1) & i] != this) {
                return;
            }
            objArr[i & (objArr.length - 1)] = C09IR.LIZ;
            c2252331DDr.LJIIIZ();
        }
    }

    public C2252351DDt(C2252331DDr c2252331DDr, long j, Object obj, C2252611DEt c2252611DEt) {
        this.LL = c2252331DDr;
        this.LLILLJJLI = j;
        this.LLILLL = obj;
        this.LLILZ = c2252611DEt;
    }
}
