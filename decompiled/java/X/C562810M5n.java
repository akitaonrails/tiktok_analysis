package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS134S0201000_8;
import njp.a;

/* JADX INFO: renamed from: X.0M5n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ugc.DraftBoxTidyViewHolder$updateDraftBottomStatus$1", f = "DraftBoxTidyViewHolder.kt", l = {307}, m = "invokeSuspend")
public final class C562810M5n extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C562830M5p LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C553680Lna LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C562810M5n(C562830M5p c562830M5p, int i, C553680Lna c553680Lna, InterfaceC1364105Vn<? super C562810M5n> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c562830M5p;
        this.LLILLL = i;
        this.LLILZ = c553680Lna;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C562810M5n(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DraftBoxTidyViewHolder@e9d6.updateDraftBottomStatus$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC562800M5m interfaceC562800M5mLIZIZ = this.LLILLJJLI.P5().LIZIZ();
            if (interfaceC562800M5mLIZIZ != null) {
                this.LL = 1;
                obj = interfaceC562800M5mLIZIZ.LIZJ(this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("DraftBoxTidyViewHolder@e9d6.updateDraftBottomStatus$1");
                    return objLJFF;
                }
            }
            C01TT.LIZLLL(new AwS134S0201000_8(this.LLILLL, this.LLILZ, this.LLILLJJLI, 11));
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("DraftBoxTidyViewHolder@e9d6.updateDraftBottomStatus$1");
            return unit;
        }
        if (((Boolean) obj).booleanValue() && this.LLILLJJLI.LLIZLLLIL.LIZIZ()) {
            C01TT.LIZLLL(new AwS134S0201000_8(this.LLILLL, this.LLILZ, this.LLILLJJLI, 12));
        } else {
            C01TT.LIZLLL(new AwS134S0201000_8(this.LLILLL, this.LLILZ, this.LLILLJJLI, 11));
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("DraftBoxTidyViewHolder@e9d6.updateDraftBottomStatus$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
