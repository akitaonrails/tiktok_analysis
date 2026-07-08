package X;

import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xqh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.effect.userlevel.flow.BaseBannerRequestFlow$emitBannerData$1", f = "BaseBannerRequestFlow.kt", l = {DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE}, m = "invokeSuspend")
public final class C861370Xqh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC889770YvP LLILLJJLI;
    public final /* synthetic */ C11X2 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C861370Xqh(AbstractC889770YvP abstractC889770YvP, C11X2 c11x2, InterfaceC1364105Vn<? super C861370Xqh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC889770YvP;
        this.LLILLL = c11x2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C861370Xqh(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseBannerRequestFlow@8482.emitBannerData$1");
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
            C05YC<C11X2> c05yc = this.LLILLJJLI.LIZIZ;
            if (c05yc != null) {
                C11X2 c11x2 = this.LLILLL;
                this.LL = 1;
                if (c05yc.emit(c11x2, this) == objLJFF) {
                    C1C7U.LIZIZ("BaseBannerRequestFlow@8482.emitBannerData$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseBannerRequestFlow@8482.emitBannerData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
