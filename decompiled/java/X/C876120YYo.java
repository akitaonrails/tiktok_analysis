package X;

import android.os.SystemClock;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tts.pigeon.paas.detailpage.container.PigeonConversationDetailContainer;
import com.ss.android.ugc.aweme.ecommerce.dependency.localtest.LocalTestDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.localtest.ILocalTestDependencyService;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YYo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C876120YYo extends AbstractC876070YYj {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        AnonymousClass0317 anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin;
        String containerID;
        String containerID2;
        SparkActivity sparkActivity;
        SparkContext sparkContext;
        String containerID3;
        boolean z;
        String name;
        InterfaceC876060YYi interfaceC876060YYi = (InterfaceC876060YYi) xBaseParamModel;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin = LocalTestDependencyService.createILocalTestDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILocalTestDependencyService.class.getName();
            if (anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocalTestDependencyService.class);
        }
        ILocalTestDependencyService iLocalTestDependencyService = (ILocalTestDependencyService) anonymousClass0317CreateILocalTestDependencyServicebyMonsterPlugin;
        if (Intrinsics.LJFF(interfaceC876060YYi.getTenantId(), "5341") && (Intrinsics.LJFF(iLocalTestDependencyService.isPPEEnable(), Boolean.TRUE) || iLocalTestDependencyService.enableBoe())) {
            C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
            C1537410q6t c1537410q6tLIZIZ = C1161970gLL.LIZIZ();
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            String str = "";
            if (interfaceC634840OvC == null || (containerID = interfaceC634840OvC.getContainerID()) == null) {
                containerID = "";
            }
            Object objLIZLLL = c1537410q6tLIZIZ.LIZLLL(PigeonConversationDetailContainer.class, containerID);
            C1537410q6t c1537410q6tLIZIZ2 = C1161970gLL.LIZIZ();
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 == null || (containerID2 = interfaceC634840OvC2.getContainerID()) == null) {
                containerID2 = "";
            }
            Object objLIZLLL2 = c1537410q6tLIZIZ2.LIZLLL(C0YXO.class, containerID2);
            if (objLIZLLL == null && objLIZLLL2 == null) {
                C1537410q6t c1537410q6tLIZIZ3 = C1161970gLL.LIZIZ();
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null && (containerID3 = interfaceC634840OvC3.getContainerID()) != null) {
                    str = containerID3;
                }
                Object objLIZLLL3 = c1537410q6tLIZIZ3.LIZLLL(InterfaceC1059280dfi.class, str);
                if ((objLIZLLL3 instanceof SparkActivity) && (sparkActivity = (SparkActivity) objLIZLLL3) != null && (sparkContext = sparkActivity.LL) != null) {
                    new C876150YYr().LIZJ(sparkContext, UriProtector.parse("http://test.com").buildUpon().appendQueryParameter("surl", C876100YYm.LLJILJILJ.LLILLL).toString(), true);
                } else {
                    C2382909Vj.LIZ(completionBlock, 9999, "spark activity is null", null, 4);
                    return;
                }
            }
        }
        C876050YYh.LIZ(this, completionBlock, interfaceC876060YYi.getTenantId(), interfaceC876060YYi.getContainerId(), "", new C914200Zti(interfaceC876060YYi, this, 2));
    }
}
