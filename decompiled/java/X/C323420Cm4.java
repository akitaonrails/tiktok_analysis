package X;

import com.bytedance.ies.powerlist.page.config.PowerPageSource;
import kotlin.Pair;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: renamed from: X.0Cm4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C323420Cm4<T> implements InterfaceC1361890lXn<T>, InterfaceC497601wk {
    public final PowerPageSource<T> LL;
    public C2252611DEt LLILLJJLI;
    public Pair<? extends T, ? extends T> LLILLL = new Pair<>(null, null);
    public final C2238608ps LLILZ = C2107508Nl.LIZ;

    @Override // X.InterfaceC1361890lXn
    public final void LIZJ(EnumC323450Cm7 enumC323450Cm7, AbstractC316870CbV<T> abstractC316870CbV, boolean z) {
    }

    @Override // X.InterfaceC1361890lXn
    public final void refresh() {
        C2252611DEt c2252611DEt = this.LLILLJJLI;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        C23250099c.LIZLLL(this, null, null, new C323390Cm1(this, null), 3);
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILZ;
    }

    public C323420Cm4(AbstractC329610Cw3 abstractC329610Cw3) {
        this.LL = abstractC329610Cw3;
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZ(T t) {
        C2252611DEt c2252611DEt = this.LLILLJJLI;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        C23250099c.LIZLLL(this, null, null, new C323410Cm3(this, t, null), 3);
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZIZ(EnumC323450Cm7 enumC323450Cm7) {
        int i = C323430Cm5.LIZ[enumC323450Cm7.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    refresh();
                    return;
                }
                throw new C1954807lC();
            }
            LIZLLL(null);
            return;
        }
        LIZ(null);
    }

    @Override // X.InterfaceC1361890lXn
    public final void LIZLLL(T t) {
        C2252611DEt c2252611DEt = this.LLILLJJLI;
        if (c2252611DEt != null) {
            c2252611DEt.LJJIIZ(null);
        }
        C23250099c.LIZLLL(this, null, null, new C323400Cm2(this, t, null), 3);
    }
}
