package X;

import com.bytedance.android.livesdk.livesetting.game.GameBroadcastFusionIdFixedTimeSetting;
import com.bytedance.android.livesdk.livesetting.game.GameRestRecognitionLiveSetting;
import com.bytedance.android.livesdk.livesetting.game.VirtualSexualFunctionSwitcherSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.scene.Scene;
import java.util.Map;

/* JADX INFO: renamed from: X.151U, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C151U {
    public final Room LIZ;
    public InterfaceC779640UiA LIZIZ;
    public int LIZJ = 2;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public final C151F LJI;
    public boolean LJII;
    public final C151X LJIIIIZZ;

    /* JADX WARN: Type inference failed for: r0v2, types: [X.151Z] */
    public C151U(Room room) {
        long id;
        this.LIZ = room;
        if (room != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LJI = new C151F("dynamic_model_modify", id);
        this.LJIIIIZZ = new C151X(new InterfaceC204520151a() { // from class: X.151Z
            @Override // X.InterfaceC204520151a
            public final void LIZ() {
                C151U c151u = this.LIZ;
                c151u.LIZJ = 2;
                c151u.LJFF++;
                Map<String, Object> map = C1338270kvh.LIZ;
            }

            @Override // X.InterfaceC204520151a
            public final void LIZIZ() {
                this.LIZ.LIZJ = 1;
                Map<String, Object> map = C1338270kvh.LIZ;
            }

            @Override // X.InterfaceC204520151a
            public final void LIZJ() {
                this.LIZ.LIZJ = 0;
                Map<String, Object> map = C1338270kvh.LIZ;
            }
        });
    }

    public final void LIZ(Room room) {
        String strLIZLLL;
        if (GameRestRecognitionLiveSetting.INSTANCE.getValue().enableFunction) {
            Map<String, Object> map = C1338270kvh.LIZ;
            if (this.LIZIZ instanceof AnonymousClass1511) {
                return;
            }
            AnonymousClass1517 anonymousClass1517 = new AnonymousClass1517(System.currentTimeMillis());
            InterfaceC779640UiA interfaceC779640UiA = this.LIZIZ;
            if (interfaceC779640UiA != null) {
                interfaceC779640UiA.LJI();
            }
            InterfaceC779640UiA interfaceC779640UiA2 = this.LIZIZ;
            if (interfaceC779640UiA2 == null || (strLIZLLL = interfaceC779640UiA2.LIZLLL()) == null) {
                strLIZLLL = "unknow";
            }
            anonymousClass1517.LIZ(System.currentTimeMillis());
            InterfaceC779640UiA interfaceC779640UiA3 = this.LIZIZ;
            boolean z = false;
            if (interfaceC779640UiA3 != null && interfaceC779640UiA3.LJFF()) {
                z = true;
            }
            this.LIZIZ = null;
            this.LIZIZ = new AnonymousClass1511(room);
            LIZJ(anonymousClass1517);
            LIZLLL(anonymousClass1517, strLIZLLL, z);
            C151F c151f = this.LJI;
            if (c151f != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.KEY_GAP));
                sbLIZ.append("_dynamic");
                C2188811AlT.LIZIZ(sbLIZ);
                c151f.LIZ = c151f.LIZ;
            }
        }
    }

    public final void LIZIZ(Room room) {
        String strLIZLLL;
        if (VirtualSexualFunctionSwitcherSetting.INSTANCE.isEnable()) {
            Map<String, Object> map = C1338270kvh.LIZ;
            if (this.LIZIZ instanceof AnonymousClass1515) {
                return;
            }
            AnonymousClass1517 anonymousClass1517 = new AnonymousClass1517(System.currentTimeMillis());
            InterfaceC779640UiA interfaceC779640UiA = this.LIZIZ;
            if (interfaceC779640UiA != null) {
                interfaceC779640UiA.LJI();
            }
            InterfaceC779640UiA interfaceC779640UiA2 = this.LIZIZ;
            if (interfaceC779640UiA2 == null || (strLIZLLL = interfaceC779640UiA2.LIZLLL()) == null) {
                strLIZLLL = "unknow";
            }
            anonymousClass1517.LIZ(System.currentTimeMillis());
            InterfaceC779640UiA interfaceC779640UiA3 = this.LIZIZ;
            boolean z = false;
            if (interfaceC779640UiA3 != null && interfaceC779640UiA3.LJFF()) {
                z = true;
            }
            this.LIZIZ = null;
            this.LIZIZ = new AnonymousClass1515(room);
            LIZJ(anonymousClass1517);
            LIZLLL(anonymousClass1517, strLIZLLL, z);
            C151F c151f = this.LJI;
            if (c151f != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).yh2(C151B.SEXUAL));
                sbLIZ.append("_dynamic");
                C2188811AlT.LIZIZ(sbLIZ);
                c151f.LIZ = c151f.LIZ;
            }
        }
    }

    public final void LIZJ(AnonymousClass1517 anonymousClass1517) {
        InterfaceC779640UiA interfaceC779640UiA;
        InterfaceC779640UiA interfaceC779640UiA2;
        if ((!this.LJII && (interfaceC779640UiA2 = this.LIZIZ) != null && interfaceC779640UiA2.LJII()) || (interfaceC779640UiA = this.LIZIZ) == null || !interfaceC779640UiA.LJII()) {
            InterfaceC779640UiA interfaceC779640UiA3 = this.LIZIZ;
            if (interfaceC779640UiA3 != null) {
                interfaceC779640UiA3.LJ();
            }
            this.LIZLLL++;
            anonymousClass1517.LIZIZ();
        }
    }

    public static void LJ(InterfaceC779640UiA interfaceC779640UiA, String str) {
        String strScene = interfaceC779640UiA.scene();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_client_intelligent_fusion_id");
        c474500IjALIZ.LJJII(strScene, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(str, "fusion_id");
        c474500IjALIZ.LJJII(Long.valueOf(GameBroadcastFusionIdFixedTimeSetting.INSTANCE.getValue()), "delay_time");
    }

    public static void LJFF(String str, boolean z) {
        String string;
        String string2;
        Object objQM = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).QM("cpu_speed");
        String str2 = "";
        if (objQM == null || (string = objQM.toString()) == null) {
            string = "";
        }
        Object objQM2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).QM("mem_usage");
        if (objQM2 != null && (string2 = objQM2.toString()) != null) {
            str2 = string2;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_client_intelligent_offload");
        c474500IjALIZ.LJJII(str, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "offload");
        c474500IjALIZ.LJJII(string, "cpu_speed");
        c474500IjALIZ.LJJII(str2, "mem_usage");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(X.AnonymousClass1517 r9, java.lang.String r10, boolean r11) {
        /*
            r8 = this;
            X.0N5B r0 = X.C0N5B.CLIENT_2_CLIENT
            java.lang.String r2 = r0.getValue()
            boolean r0 = r8.LJII
            r1 = 1
            if (r0 == 0) goto L15
            X.0UiA r0 = r8.LIZIZ
            if (r0 == 0) goto L61
            boolean r0 = r0.LJFF()
            if (r0 != r1) goto L61
        L15:
            boolean r0 = r8.LJII
            if (r0 == 0) goto L4e
            X.0UiA r0 = r8.LIZIZ
            if (r0 == 0) goto L4e
            boolean r0 = r0.LJFF()
            if (r0 != r1) goto L4e
            if (r11 == 0) goto L50
            X.0N5B r0 = X.C0N5B.CLOUD_2_CLOUD
            java.lang.String r2 = r0.getValue()
        L2b:
            X.0UiA r0 = r8.LIZIZ
            if (r0 == 0) goto L35
            java.lang.String r0 = r0.LIZLLL()
            if (r0 != 0) goto L37
        L35:
            java.lang.String r0 = "unknow"
        L37:
            r3 = r9
            r3.LJII = r2
            r3.LJIIIIZZ = r0
            r3.LJIIIZ = r10
            X.151F r2 = r8.LJI
            if (r2 == 0) goto L4d
            X.151X r0 = r8.LJIIIIZZ
            java.lang.String r6 = r0.LIZJ
            r4 = 0
            java.lang.String r5 = "dynamic_model_modify"
            r7 = 0
            r2.LIZLLL(r3, r4, r5, r6, r7)
        L4d:
            return
        L4e:
            if (r11 != 0) goto L2b
        L50:
            X.0UiA r0 = r8.LIZIZ
            if (r0 == 0) goto L2b
            boolean r0 = r0.LJFF()
            if (r0 != r1) goto L2b
            X.0N5B r0 = X.C0N5B.CLIENT_2_CLOUD
            java.lang.String r2 = r0.getValue()
            goto L2b
        L61:
            if (r11 != 0) goto L15
            X.0N5B r0 = X.C0N5B.CLOUD_2_CLIENT
            java.lang.String r2 = r0.getValue()
            goto L2b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151U.LIZLLL(X.1517, java.lang.String, boolean):void");
    }
}
