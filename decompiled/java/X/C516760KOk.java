package X;

import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePlayerMuteSetting;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;

/* JADX INFO: renamed from: X.0KOk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C516760KOk extends AbstractC516770KOl {
    public boolean LLILLL;
    public boolean LLILZ = true;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        SparkContext sparkContext;
        String containerID = null;
        XBaseResultModel xBaseResultModel = (XBaseResultModel) C1909107dp.LIZJ(InterfaceC516790KOn.class, null);
        boolean zIsMute = ((InterfaceC516780KOm) xBaseParamModel).isMute();
        if (GameLivePlayerMuteSetting.INSTANCE.getEnable()) {
            C500260Jjc.LJJLIIIJILLIZJL(new C0IGZ(zIsMute));
            this.LLILLL = zIsMute;
        }
        if (this.LLILZ) {
            this.LLILZ = false;
            C1529880puk c1529880puk = SparkContext.Companion;
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC != null) {
                containerID = interfaceC634840OvC.getContainerID();
            }
            c1529880puk.getClass();
            C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
            if ((c1537480q70LIZIZ instanceof SparkContext) && (sparkContext = (SparkContext) c1537480q70LIZIZ) != null) {
                sparkContext.LJJLIIIJJIZ(new C521880KdO(this, 1));
            }
        }
        completionBlock.onSuccess(xBaseResultModel, "");
    }
}
