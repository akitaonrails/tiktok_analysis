package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.service;

import X.C01GW;
import X.C20441214yg;
import X.C2188811AlT;
import X.C452501pT;
import X.InterfaceC1106030et7;
import X.InterfaceC771550UOj;
import X.InterfaceC948500an2;
import java.util.Map;
import kotlin.jvm.internal.AFwS203S0000000_15;
import webcast.data.MultiGuestPlayInfo;

/* JADX INFO: loaded from: classes16.dex */
@InterfaceC948500an2(name = "ANCHOR_SETTING_DISTRIBUTE_FROM_SERVER_MANAGER")
public final class AnchorSettingDistributeFromServerManager implements InterfaceC771550UOj {
    public static final C01GW<AnchorSettingDistributeFromServerManager> LIZJ = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(61));
    public Map<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig> LIZ;
    public boolean LIZIZ = true;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Integer LIZIZ() {
        /*
            r8 = this;
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r6 = "getMultiGuestPlaySceneConfigList playScene"
            r1.append(r6)
            r3 = 2
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r1.append(r3)
            java.lang.String r0 = " readOnce:"
            r1.append(r0)
            boolean r0 = r8.LIZIZ
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r4 = "AnchorSettingDistributeFromServerManager"
            X.C20441214yg.LIZIZ(r4, r0)
            boolean r0 = r8.LIZIZ
            r5 = 0
            if (r0 == 0) goto L39
            java.util.Map<java.lang.Integer, webcast.data.MultiGuestPlayInfo$MultiGuestPlayConfig> r0 = r8.LIZ
            if (r0 != 0) goto L37
            X.14i1<java.util.Map<java.lang.Integer, webcast.data.MultiGuestPlayInfo$MultiGuestPlayConfig>> r0 = X.InterfaceC1106030et7.D5
            java.lang.Object r0 = r0.LIZIZ()
            java.util.Map r0 = (java.util.Map) r0
            r8.LIZ = r0
        L37:
            r8.LIZIZ = r5
        L39:
            java.util.Map<java.lang.Integer, webcast.data.MultiGuestPlayInfo$MultiGuestPlayConfig> r1 = r8.LIZ
            r2 = 0
            if (r1 != 0) goto L3f
            return r2
        L3f:
            boolean r0 = r1.containsKey(r7)
            if (r0 != 0) goto L5c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r6)
            r1.append(r3)
            java.lang.String r0 = " not contains"
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r4, r0)
            return r2
        L5c:
            java.lang.Object r0 = r1.get(r7)
            webcast.data.MultiGuestPlayInfo$MultiGuestPlayConfig r0 = (webcast.data.MultiGuestPlayInfo.MultiGuestPlayConfig) r0
            if (r0 == 0) goto Lac
            java.util.Map<java.lang.Integer, java.lang.Integer> r1 = r0.featureConfigMap
            if (r1 == 0) goto Lac
            r0 = 1001(0x3e9, float:1.403E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r2 = r1.get(r0)
            java.lang.Integer r2 = (java.lang.Integer) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "getMultiGuestPlaySceneConfigList playScene："
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " value:"
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r4, r0)
            if (r2 == 0) goto Laa
            int r1 = r2.intValue()
            r0 = 10010001(0x98bd91, float:1.4026999E-38)
            if (r1 != r0) goto La0
            r3 = 1
        L9b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            return r0
        La0:
            int r1 = r2.intValue()
            r0 = 10010002(0x98bd92, float:1.4027E-38)
            if (r1 != r0) goto Laa
            goto L9b
        Laa:
            r3 = 0
            goto L9b
        Lac:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.service.AnchorSettingDistributeFromServerManager.LIZIZ():java.lang.Integer");
    }

    @Override // X.InterfaceC771550UOj
    public final void LIZ(MultiGuestPlayInfo multiGuestPlayInfo) {
        Boolean boolValueOf;
        this.LIZIZ = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("receiveDistributeFromServer packSuccFlag：");
        Map<Integer, MultiGuestPlayInfo.MultiGuestPlayConfig> map = null;
        if (multiGuestPlayInfo != null) {
            boolValueOf = Boolean.valueOf(multiGuestPlayInfo.packSuccFlag);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        C20441214yg.LIZIZ("AnchorSettingDistributeFromServerManager", C2188811AlT.LIZIZ(sbLIZ));
        if (multiGuestPlayInfo != null && multiGuestPlayInfo.packSuccFlag) {
            InterfaceC1106030et7.D5.LJFF(multiGuestPlayInfo.playSceneToConfigMap);
            map = multiGuestPlayInfo.playSceneToConfigMap;
        }
        this.LIZ = map;
    }
}
