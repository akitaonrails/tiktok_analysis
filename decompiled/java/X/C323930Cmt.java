package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Cmt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.publish.campaign.AMEPublishCampaignRepo$fetchAMEPublishCampaignList$1", f = "AMEPublishCampaignService.kt", l = {81}, m = "invokeSuspend")
public final class C323930Cmt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C323930Cmt(InterfaceC1364105Vn<? super C323930Cmt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C323930Cmt(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AMEPublishCampaignRepo@2949.fetchAMEPublishCampaignList$1");
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
            C323950Cmv.LIZIZ.setValue(new C1623706Xj());
            C323950Cmv c323950Cmv = C323950Cmv.LIZ;
            this.LL = 1;
            obj = c323950Cmv.LIZIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("AMEPublishCampaignRepo@2949.fetchAMEPublishCampaignList$1");
                return objLJFF;
            }
        }
        C323950Cmv.LIZIZ.setValue(obj);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AMEPublishCampaignRepo@2949.fetchAMEPublishCampaignList$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C323930Cmt(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
