package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Cb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1568306Cb extends AbstractC1568406Cc {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        String petName;
        InterfaceC1568506Cd interfaceC1568506Cd = (InterfaceC1568506Cd) xBaseParamModel;
        String cid = interfaceC1568506Cd.getCid();
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1568606Ce.class);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        final InterfaceC1568606Ce interfaceC1568606Ce = (InterfaceC1568606Ce) C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
        interfaceC1568606Ce.setClickType(interfaceC1568506Cd.getClickType());
        interfaceC1568606Ce.setCid(interfaceC1568506Cd.getCid());
        Number clickType = interfaceC1568506Cd.getClickType();
        boolean zLJFF = false;
        if (Intrinsics.LJFF(clickType, 3)) {
            InterfaceC1568906Ch clickData = interfaceC1568506Cd.getClickData();
            if (clickData != null) {
                zLJFF = Intrinsics.LJFF(clickData.getPetShow(), 0);
            }
            C1569106Cj.LJ.getClass();
            C1569106Cj c1569106Cj = C1569106Cj.LJI;
            C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C06C5(c1569106Cj, cid, zLJFF, null), 3);
            completionBlock.onSuccess(interfaceC1568606Ce, "");
            return;
        }
        if (Intrinsics.LJFF(clickType, 2)) {
            C1569106Cj.LJ.getClass();
            C1569106Cj c1569106Cj2 = C1569106Cj.LJI;
            C23250099c.LIZLLL(c1569106Cj2.LIZ, null, null, new C06CD(cid, c1569106Cj2, new C06CJ() { // from class: X.06Cf
                @Override // X.C06CJ
                public final void LIZ(Integer num, String str) {
                    CompletionBlock<InterfaceC1568606Ce> completionBlock2 = completionBlock;
                    InterfaceC1568606Ce interfaceC1568606Ce2 = interfaceC1568606Ce;
                    interfaceC1568606Ce2.setServerStatusCode(num);
                    interfaceC1568606Ce2.setServerStatusMsg(str);
                    completionBlock2.onSuccess(interfaceC1568606Ce2, str);
                }

                @Override // X.C06CJ
                public final void LIZIZ(Integer num, String str) {
                    CompletionBlock<InterfaceC1568606Ce> completionBlock2 = completionBlock;
                    InterfaceC1568606Ce interfaceC1568606Ce2 = interfaceC1568606Ce;
                    interfaceC1568606Ce2.setServerStatusCode(num);
                    interfaceC1568606Ce2.setServerStatusMsg(str);
                    completionBlock2.onSuccess(interfaceC1568606Ce2, str);
                }
            }, null), 3);
        } else {
            if (!Intrinsics.LJFF(clickType, 1)) {
                return;
            }
            InterfaceC1568906Ch clickData2 = interfaceC1568506Cd.getClickData();
            if (clickData2 != null && (petName = clickData2.getPetName()) != null && petName.length() != 0) {
                C1569106Cj.LJ.getClass();
                C1569106Cj c1569106Cj3 = C1569106Cj.LJI;
                C23250099c.LIZLLL(c1569106Cj3.LIZ, null, null, new C06CE(cid, c1569106Cj3, petName, new C06CJ() { // from class: X.06Cg
                    @Override // X.C06CJ
                    public final void LIZ(Integer num, String str) {
                        CompletionBlock<InterfaceC1568606Ce> completionBlock2 = completionBlock;
                        InterfaceC1568606Ce interfaceC1568606Ce2 = interfaceC1568606Ce;
                        interfaceC1568606Ce2.setServerStatusCode(num);
                        interfaceC1568606Ce2.setServerStatusMsg(str);
                        completionBlock2.onSuccess(interfaceC1568606Ce2, str);
                    }

                    @Override // X.C06CJ
                    public final void LIZIZ(Integer num, String str) {
                        CompletionBlock<InterfaceC1568606Ce> completionBlock2 = completionBlock;
                        InterfaceC1568606Ce interfaceC1568606Ce2 = interfaceC1568606Ce;
                        interfaceC1568606Ce2.setServerStatusCode(num);
                        interfaceC1568606Ce2.setServerStatusMsg(str);
                        completionBlock2.onSuccess(interfaceC1568606Ce2, str);
                    }
                }, null), 3);
                return;
            }
            C1590806Ks.LIZIZ("ClickStreakPetPanelCtaMethodIDL rename null or empty");
        }
    }
}
