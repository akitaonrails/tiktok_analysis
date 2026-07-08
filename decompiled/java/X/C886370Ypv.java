package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.guidebanner.DmAutoArchiveGuideBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ypv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.archive.guidebanner.DmAutoArchiveGuideBannerAssem$onCreate$1", f = "DmAutoArchiveGuideBannerAssem.kt", l = {47}, m = "invokeSuspend")
public final class C886370Ypv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ DmAutoArchiveGuideBannerAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C886370Ypv(DmAutoArchiveGuideBannerAssem dmAutoArchiveGuideBannerAssem, InterfaceC1364105Vn<? super C886370Ypv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = dmAutoArchiveGuideBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C886370Ypv(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("DmAutoArchiveGuideBannerAssem@6e03.onCreate$1");
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
            C886310Ypp c886310Ypp = C886310Ypp.LIZ;
            C05RH c05rh = new C05RH(C886310Ypp.LJ);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 8);
            this.LL = 1;
            if (c05rh.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("DmAutoArchiveGuideBannerAssem@6e03.onCreate$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DmAutoArchiveGuideBannerAssem@6e03.onCreate$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
