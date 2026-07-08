package X;

import com.bytedance.android.livesdk.livesetting.gift.GiftReceiveFlowFluencyOptSetting;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fnL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1140890fnL {
    public static final C01GW LIZ;
    public static boolean LIZIZ;

    static {
        if (!GiftReceiveFlowFluencyOptSetting.INSTANCE.getLazyInitRenderSDK()) {
            LIZIZ();
        }
        LIZ = C452501pT.LIZIZ(AFwS205S0000000_17.get$arr$(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0fo3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ() {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1140890fnL.LIZIZ():void");
    }

    public static void LIZJ() {
        if (GiftReceiveFlowFluencyOptSetting.INSTANCE.getLazyInitRenderSDK()) {
            LIZIZ();
        }
    }

    public static C1138360fjG LIZLLL() {
        return (C1138360fjG) LIZ.getValue();
    }

    public static InterfaceC1138060fim LIZ(C1140340fmS c1140340fmS) {
        C1140830fnF c1140830fnFLIZ;
        LIZJ();
        InterfaceC1140880fnK interfaceC1140880fnK = (InterfaceC1140880fnK) C2043807zY.LIZ(InterfaceC1140880fnK.class);
        if (interfaceC1140880fnK != null) {
            c1140830fnFLIZ = interfaceC1140880fnK.LIZ(c1140340fmS);
            if (c1140830fnFLIZ == null) {
            }
            return c1140830fnFLIZ;
        }
        c1140830fnFLIZ = null;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftRender#create composition call failed, request = ");
        sbLIZ.append(c1140340fmS);
        sbLIZ.append(", service=");
        sbLIZ.append(interfaceC1140880fnK);
        C20441214yg.LJ("GiftRenderer", C2188811AlT.LIZIZ(sbLIZ));
        return c1140830fnFLIZ;
    }
}
