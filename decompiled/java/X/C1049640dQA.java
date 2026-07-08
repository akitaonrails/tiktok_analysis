package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.ad.subpage.ICommerceLandPageService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;

/* JADX INFO: renamed from: X.0dQA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1049640dQA extends AbstractC1049650dQB {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        SparkContext sparkContext;
        InterfaceC1049660dQC interfaceC1049660dQC = (InterfaceC1049660dQC) xBaseParamModel;
        ICommerceLandPageService iCommerceLandPageServiceLIZ = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ();
        String destructionTiming = interfaceC1049660dQC.getDestructionTiming();
        C1529880puk c1529880puk = SparkContext.Companion;
        String sparkContainerId = interfaceC1049660dQC.getSparkContainerId();
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(sparkContainerId);
        if (c1537480q70LIZIZ instanceof SparkContext) {
            sparkContext = (SparkContext) c1537480q70LIZIZ;
        } else {
            sparkContext = null;
        }
        iCommerceLandPageServiceLIZ.wK1(sparkContext, destructionTiming);
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1049670dQD.class, null), "");
    }
}
