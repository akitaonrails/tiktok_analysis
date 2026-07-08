package X;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0zEV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1888090zEV extends AbstractC1888070zET {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Activity activityLJFF;
        C19EG c19eg;
        String containerID;
        Aweme aweme;
        AnchorCommonStruct anchorCommonStruct;
        String str;
        String str2;
        Integer num;
        C1888100zEW c1888100zEW;
        View view;
        Context context;
        InterfaceC1888080zEU interfaceC1888080zEU = (InterfaceC1888080zEU) xBaseParamModel;
        C1544050qHb c1544050qHb = C1544050qHb.LIZ;
        String jsbSecureDataflowId = interfaceC1888080zEU.getJsbSecureDataflowId();
        String name = getName();
        c1544050qHb.getClass();
        C443120HZe c443120HZeLIZ = C1544050qHb.LIZ(jsbSecureDataflowId, name);
        Integer num2 = (Integer) c443120HZeLIZ.getSecond();
        if (num2 == null) {
            C2382909Vj.LIZ(completionBlock, 0, (String) c443120HZeLIZ.getThird(), null, 4);
            return;
        }
        String schema = interfaceC1888080zEU.getSchema();
        if (schema.length() == 0) {
            C2382909Vj.LIZ(completionBlock, 0, "empty url", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC == null || (view = interfaceC634840OvC.getView()) == null || (context = view.getContext()) == null || (activityLJFF = C715020S2y.LIZ(context)) == null) {
            activityLJFF = C2214201BlK.LJFF();
        }
        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null) {
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ != null && (c1888100zEW = (C1888100zEW) c1537480q70LIZIZ.LJFF(C1888100zEW.class)) != null) {
                aweme = c1888100zEW.LIZ;
                anchorCommonStruct = c1888100zEW.LIZIZ;
                str = c1888100zEW.LIZJ;
                str2 = c1888100zEW.LIZLLL;
                num = c1888100zEW.LJ;
            } else {
                aweme = null;
                anchorCommonStruct = null;
                str = null;
                str2 = null;
                num = null;
            }
            ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJ(c19eg, schema, anchorCommonStruct, aweme, str, str2, num2, num);
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1888110zEX.class, null), "success");
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "activity is null ", null, 4);
    }
}
