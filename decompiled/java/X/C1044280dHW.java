package X;

import android.content.Context;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044280dHW extends AbstractC1044290dHX {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        View view;
        String containerID;
        C1035880d3y c1035880d3y;
        String name;
        int iHashCode;
        Context context;
        InterfaceC1044300dHY interfaceC1044300dHY = (InterfaceC1044300dHY) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            view = interfaceC634840OvC.getView();
        } else {
            view = null;
        }
        if (view instanceof WebKitView) {
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null) {
                containerID = interfaceC634840OvC2.getContainerID();
            } else {
                containerID = null;
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if (c1537480q70LIZIZ != null) {
                c1035880d3y = (C1035880d3y) c1537480q70LIZIZ.LJFF(C1035880d3y.class);
            } else {
                c1035880d3y = null;
            }
            if (Intrinsics.LJFF(interfaceC1044300dHY.getEvent(), "webapi") && ((iHashCode = (name = interfaceC1044300dHY.getMessage().getName()).hashCode()) == -1757019252 ? name.equals("getCurrentPosition") : iHashCode == -740751742 ? name.equals("clearWatch") : !(iHashCode != 628720408 || !name.equals("watchPosition")))) {
                String name2 = interfaceC1044300dHY.getMessage().getName();
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null) {
                    context = interfaceC634840OvC3.getContext();
                } else {
                    context = null;
                }
                C1047370dMV.LIZLLL(c1035880d3y, "location", name2, C145T.LIZ(context));
                if (Intrinsics.LJFF(interfaceC1044300dHY.getMessage().getAction(), "block")) {
                    C1047370dMV.LJ(c1035880d3y, "location", 0, 0);
                }
            }
            completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1044320dHa.class, null), "");
            return;
        }
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(InterfaceC1044320dHa.class, null), "");
    }
}
