package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fAK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1116700fAK extends AbstractC1116720fAM {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String str;
        long jLongValue;
        long jLongValue2;
        int iIntValue;
        InterfaceC1116710fAL interfaceC1116710fAL = (InterfaceC1116710fAL) xBaseParamModel;
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        C974210bSV c974210bSV = new C974210bSV("start_co_host", null);
        String enterFrom = interfaceC1116710fAL.getEnterFrom();
        if (enterFrom != null) {
            c974210bSV.LJFF = enterFrom;
        }
        List<String> autoCohostRoomIDs = interfaceC1116710fAL.getAutoCohostRoomIDs();
        if (autoCohostRoomIDs != null) {
            int i = 0;
            for (String str2 : autoCohostRoomIDs) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str3 = str2;
                    List<String> autoCohostUIDs = interfaceC1116710fAL.getAutoCohostUIDs();
                    if (autoCohostUIDs != null && (str = (String) C13LP.LJJJLZIJ(i, autoCohostUIDs)) != null) {
                        List<C943950afh> list = c974210bSV.LIZLLL;
                        Long lLJIILIIL = C2095008Iq.LJIILIIL(str);
                        if (lLJIILIIL != null) {
                            jLongValue = lLJIILIIL.longValue();
                        } else {
                            jLongValue = 0;
                        }
                        Long lLJIILIIL2 = C2095008Iq.LJIILIIL(str3);
                        if (lLJIILIIL2 != null) {
                            jLongValue2 = lLJIILIIL2.longValue();
                        } else {
                            jLongValue2 = 0;
                        }
                        Number autoCohostSourceType = interfaceC1116710fAL.getAutoCohostSourceType();
                        if (autoCohostSourceType != null) {
                            iIntValue = autoCohostSourceType.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        ((ArrayList) list).add(new C943950afh(jLongValue, jLongValue2, C915200ZvK.LIZ(Integer.valueOf(iIntValue)), C500260Jjc.LJJIFFI(interfaceC1116710fAL.getNotOpenPanelWhenAutoCohostFailure()), C500260Jjc.LJJIJIL(interfaceC1116710fAL.getShowAnimationForAutoCohostUser())));
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        c974210bSV.LJIILIIL = Intrinsics.LJFF(interfaceC1116710fAL.getAutoQuickCohostInvite(), Boolean.TRUE);
        c974210bSV.LJIILJJIL = interfaceC1116710fAL.getAutoMatchScene();
        c974210bSV.LJIILL = interfaceC1116710fAL.getAutoMatchEntrance();
        Map<String, Object> trackParams = interfaceC1116710fAL.getTrackParams();
        if (trackParams != null) {
            for (Map.Entry<String, Object> entry : trackParams.entrySet()) {
                c974210bSV.LJIILLIIL.put(entry.getKey(), entry.getValue().toString());
            }
        }
        ((LinkedHashMap) c974210bSV.LJIILLIIL).get("tip_or_tag_id");
        c974210bSV.LJ = new AwS383S0200000_17((InterfaceC1116730fAN) C1909107dp.LIZJ(InterfaceC1116730fAN.class, null), (InterfaceC1116730fAN) completionBlock, (CompletionBlock<InterfaceC1116730fAN>) 50);
        c784440UpuLIZ.LIZIZ(c974210bSV);
    }
}
