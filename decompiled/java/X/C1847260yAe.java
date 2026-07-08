package X;

import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansLynxStickerExtra;
import com.bytedance.android.livesdk.revenue.level.impl.fansclub.sticker.FansStickerViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS205S0000000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yAe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847260yAe extends AbstractC1847270yAf {
    public final void LIZJ(CompletionBlock<InterfaceC1506900pJg> completionBlock) {
        String containerID;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1506900pJg.class, containerID);
        ((InterfaceC1506900pJg) xBaseModelLIZJ).setCode(1);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String resourceId;
        InterfaceC1847280yAg interfaceC1847280yAg = (InterfaceC1847280yAg) xBaseParamModel;
        if (Intrinsics.LJFF(interfaceC1847280yAg.getType(), 13)) {
            try {
                Number maxWidth = interfaceC1847280yAg.getMaxWidth();
                if (maxWidth == null) {
                    maxWidth = 0;
                }
                int iIntValue = ((Integer) maxWidth).intValue();
                Number maxHeight = interfaceC1847280yAg.getMaxHeight();
                if (maxHeight == null) {
                    maxHeight = 0;
                }
                int iIntValue2 = ((Integer) maxHeight).intValue();
                Number stickerId = interfaceC1847280yAg.getStickerId();
                if (stickerId == null) {
                    stickerId = 0;
                }
                int iIntValue3 = ((Integer) stickerId).intValue();
                if (Intrinsics.LJFF(interfaceC1847280yAg.getType(), 13) && (resourceId = interfaceC1847280yAg.getResourceId()) != null && resourceId.length() != 0 && interfaceC1847280yAg.getStickerId() != null && iIntValue > 0 && iIntValue2 > 0) {
                    FansStickerViewModel fansStickerViewModel = C1094930ebD.LIZ.get();
                    if (fansStickerViewModel == null) {
                        C2382909Vj.LIZ(completionBlock, -100, "stickerManage is not initialized", null, 4);
                        return;
                    }
                    FansLynxStickerExtra fansLynxStickerExtra = new FansLynxStickerExtra();
                    fansLynxStickerExtra.type = 13;
                    String resourceId2 = interfaceC1847280yAg.getResourceId();
                    String str = "";
                    if (resourceId2 == null) {
                        resourceId2 = "";
                    }
                    fansLynxStickerExtra.resourceId = resourceId2;
                    fansLynxStickerExtra.stickerId = iIntValue3;
                    fansLynxStickerExtra.maxWidth = iIntValue;
                    fansLynxStickerExtra.maxHeight = iIntValue2;
                    String content1 = interfaceC1847280yAg.getContent1();
                    if (content1 == null) {
                        content1 = "";
                    }
                    fansLynxStickerExtra.content1 = content1;
                    String content2 = interfaceC1847280yAg.getContent2();
                    if (content2 == null) {
                        content2 = "";
                    }
                    fansLynxStickerExtra.content2 = content2;
                    String content3 = interfaceC1847280yAg.getContent3();
                    if (content3 == null) {
                        content3 = "";
                    }
                    fansLynxStickerExtra.content3 = content3;
                    String content4 = interfaceC1847280yAg.getContent4();
                    if (content4 != null) {
                        str = content4;
                    }
                    fansLynxStickerExtra.content4 = str;
                    DataChannel dataChannel = fansStickerViewModel.getDataChannel();
                    if (dataChannel != null && C500260Jjc.LJIIZILJ(dataChannel)) {
                        C1DFH c1dfh = C0PEM.LIZ;
                        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1847230yAb(fansStickerViewModel, fansLynxStickerExtra, null), 3);
                    }
                    LIZJ(completionBlock);
                    return;
                }
                C2382909Vj.LIZ(completionBlock, -100, "invalid params", null, 4);
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C2382909Vj.LIZ(completionBlock, -100, "invalid params", null, 4);
                return;
            }
        }
        if (Intrinsics.LJFF(interfaceC1847280yAg.getType(), 9)) {
            C500260Jjc.LJJLIIIJILLIZJL(AFwS205S0000000_17.get$arr$(186));
            LIZJ(completionBlock);
        } else {
            C2382909Vj.LIZ(completionBlock, -100, "invalid sticker type", null, 4);
        }
    }
}
