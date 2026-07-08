package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSchema;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.01GU, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01GU {
    public static final C01GU LIZ = new C01GU();

    public static final void LIZ(Context context, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        boolean z = !InterfaceC772390URp.LLZZZIL.LIZIZ().booleanValue();
        C480460Ism.LIZ().getClass();
        ((GameLivePartnershipRetrofitApi) C480460Ism.LIZLLL(GameLivePartnershipRetrofitApi.class)).getAnchorCheckPartnershipJump(1, z).LJFF(new C0UO0()).LJJIIZ(new C515801zg(linkedHashMap, context, 24), new C516201zk(context, 123));
    }

    public static final void LIZIZ(Context context, Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsHostList;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    public static final void LIZJ(Context context, Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsGuide;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    public static final void LIZLLL(Context context, Map<String, String> map) {
        String str = C1152420g5w.LIZ.pageDropList;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    public static final void LJ(Context context, Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsHostList;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    public static final void LJFF(Context context, Map<String, String> map) {
        String str = GameLivePartnershipDropsSchema.INSTANCE.getConfig().dropsHostTaskPanel;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    public static final void LJI(Context context, Map<String, String> map) {
        String str = C1152420g5w.LIZ.promoteList;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJIJJLI("bottom");
        c760370TsBLIZ.LJJ((int) C497740JfY.LJJI(C497740JfY.LJIIZILJ()), EnumC760350Ts9.DP);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    public static final void LJII(Context context, Map<String, String> map) {
        String str = C1152420g5w.LIZ.eventQualification;
        if (str.length() == 0) {
            return;
        }
        C760370TsB c760370TsBLIZ = C0KYL.LIZ(str);
        c760370TsBLIZ.LJIJI(8, EnumC760350Ts9.DP);
        c760370TsBLIZ.LJJII(map);
        ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, c760370TsBLIZ.LIZ().toString(), null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000e A[PHI: r5
      0x000e: PHI (r5v3 java.lang.Object) = (r5v0 java.lang.Object), (r5v4 java.lang.Object) binds: [B:6:0x000c, B:4:0x0008] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016 A[PHI: r5
      0x0016: PHI (r5v2 java.lang.Object) = (r5v0 java.lang.Object), (r5v3 java.lang.Object) binds: [B:6:0x000c, B:8:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJIIIIZZ(android.content.Context r6, final java.util.Map<java.lang.String, ? extends java.lang.Object> r7) {
        /*
            if (r7 == 0) goto La
            java.lang.String r0 = "scene"
            java.lang.Object r5 = r7.get(r0)
            if (r5 != 0) goto Le
        La:
            java.lang.String r5 = "before_live"
            if (r7 == 0) goto L16
        Le:
            java.lang.String r0 = "gameName"
            java.lang.Object r4 = r7.get(r0)
            if (r4 != 0) goto L18
        L16:
            java.lang.String r4 = ""
        L18:
            r0 = 2131841824(0x7f115320, float:1.9316967E38)
            java.lang.String r3 = X.C497740JfY.LJIJI(r0)
            java.lang.String r2 = r4.toString()
            r1 = 1
            java.lang.String r0 = "{game_name}"
            java.lang.String r1 = kotlin.text.u.LJJIFFI(r3, r0, r2, r1)
            X.0Um9 r2 = new X.0Um9
            r2.<init>(r6)
            r0 = 2131841826(0x7f115322, float:1.931697E38)
            r2.LJIIZILJ(r0)
            r2.LJIIIZ(r1)
            X.015Y r1 = new X.015Y
            r1.<init>()
            r0 = 2131841827(0x7f115323, float:1.9316973E38)
            r2.LJIILIIL(r0, r1)
            X.01za r1 = new X.01za
            r0 = 3
            r1.<init>(r5, r0)
            r0 = 2131841825(0x7f115321, float:1.9316969E38)
            r2.LJIIJ(r0, r1)
            r0 = 0
            r2.LJIILLIIL = r0
            com.bytedance.android.live.design.app.LiveDialog r0 = r2.LIZ()
            X.C786410Ut5.E4(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01GU.LJIIIIZZ(android.content.Context, java.util.Map):void");
    }
}
