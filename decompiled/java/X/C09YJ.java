package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.sea.creatorfeed.SeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.ISeaPdpCreatorVideoFeedDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendImpressionItem;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.RecommendSessionInfo;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.detailfeed.WriteImpressionRequest;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09YJ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.manager.videocreator.SeaPdpCreatorVideoMgr$writeImpression$1", f = "SeaPdpCreatorVideoMgr.kt", l = {260}, m = "invokeSuspend")
public final class C09YJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09YH LLILLJJLI;
    public final /* synthetic */ List<RecommendImpressionItem> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09YJ(C09YH c09yh, List<RecommendImpressionItem> list, InterfaceC1364105Vn<? super C09YJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09yh;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09YJ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C1C7U.LIZ("SeaPdpCreatorVideoMgr@e5e1.writeImpression$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin = SeaPdpCreatorVideoFeedDependencyService.createISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = ISeaPdpCreatorVideoFeedDependencyService.class.getName();
                    if (anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ISeaPdpCreatorVideoFeedDependencyService.class);
                }
                WriteImpressionRequest writeImpressionRequest = new WriteImpressionRequest(this.LLILLJJLI.LJII, this.LLILLL, new RecommendSessionInfo(this.LLILLJJLI.LJI));
                this.LL = 1;
                if (((ISeaPdpCreatorVideoFeedDependencyService) anonymousClass0317CreateISeaPdpCreatorVideoFeedDependencyServicebyMonsterPlugin).reportRecommendImpression(writeImpressionRequest, this) == objLJFF) {
                    C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.writeImpression$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("sea creator video report impression fail ");
            sbLIZ.append(e.getMessage());
            C1AF0.LJFF(e, C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCreatorVideoMgr@e5e1.writeImpression$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
