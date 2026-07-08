package X;

import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.ttvideoengine.TTVideoEngine;
import fyo.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0oPU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1472060oPU extends C1469760oLm {
    public InterfaceC1471870oPB LLILLL;
    public String LLILZ;
    public Map<String, Object> LLILZIL;
    public String LLILZLL;

    public final Map<String, String> LJ() {
        C1473210oRL c1473210oRL;
        HashMap map = new HashMap();
        map.put("vr_projection_model_type", CardStruct.IStatusCode.DEFAULT);
        map.put("is_from_cache", CardStruct.IStatusCode.DEFAULT);
        map.put("video_resolution", this.LLILZLL);
        Map<String, Object> map2 = this.LLILZIL;
        if (map2 != null && (c1473210oRL = (C1473210oRL) C1472050oPT.LIZ("meta_info", map2)) != null) {
            map.put("strategy_tokens", c1473210oRL.getStrategyTokens());
            if (!C1474810oTv.LJIILJJIL()) {
                map.put("video_meta", c1473210oRL.getMetaStr());
            }
            C1472100oPY vidToken = c1473210oRL.getVidToken();
            if (vidToken == null) {
                map.put("is_video_id", CardStruct.IStatusCode.DEFAULT);
            } else if (vidToken.isValid()) {
                map.put("is_video_id", "-2");
            } else {
                map.put("is_video_id", "-1");
            }
        }
        InterfaceC1471870oPB interfaceC1471870oPB = this.LLILLL;
        if (interfaceC1471870oPB != null) {
            interfaceC1471870oPB.LIZLLL(map);
        }
        Object objLIZ = C1472050oPT.LIZ("header_enable_report_url", this.LLILZIL);
        if (objLIZ != null && !((Boolean) objLIZ).booleanValue()) {
            map.remove("current_url");
        }
        return map;
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJI() {
        final C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        player.LLJJJJJIL(new InterfaceC1469360oL8() { // from class: X.0oPV
            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            }

            public final void LIZLLL() {
                C1472060oPU c1472060oPU = this.LLILLJJLI;
                SimRadar.keyScan("EngineDataSourceHelper", "replayWhenVidFailed", c1472060oPU.LLILLL, player, c1472060oPU.LLILZ);
                C1472990oQz c1472990oQz = (C1472990oQz) C1472050oPT.LIZ("header_dashinfo", this.LLILLJJLI.LLILZIL);
                if (c1472990oQz != null) {
                    c1472990oQz.LJ = null;
                }
                String strLIZIZ = C1472050oPT.LIZIZ("header_url", this.LLILLJJLI.LLILZIL);
                try {
                    C1472060oPU c1472060oPU2 = this.LLILLJJLI;
                    ((C1472250oPn) c1472060oPU2.LLILLJJLI).LJJLIIIJJI(null, strLIZIZ, c1472060oPU2.LLILZIL);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1472060oPU c1472060oPU3 = this.LLILLJJLI;
                    SimRadar.keyScan("EngineDataSourceHelper", "replayWhenVidFailed - Error", c1472060oPU3.LLILLL, player, c1472060oPU3.LLILZ);
                }
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJFF(int i, EnumC2281151EQn enumC2281151EQn) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIIZ(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILIIL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIILL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJI(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIJJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJIL(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJII(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIIJ(int i, int i2) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJIJ(Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJ(TTVideoEngine tTVideoEngine, int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJJL(TTVideoEngine tTVideoEngine, int i, long j, long j2, Map map) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJJLL(TTVideoEngine tTVideoEngine) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLIIL(int i, int i2, int i3) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJJLZIJ(TTVideoEngine tTVideoEngine, int i, C1467860oIi c1467860oIi) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJL(e eVar, String str) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIIJ(int i) {
            }

            @Override // X.InterfaceC1469360oL8
            public final /* synthetic */ void LJJLIIIJJIZ(TTVideoEngine tTVideoEngine) {
            }

            public final boolean LIZ() {
                String strLIZIZ = C1472050oPT.LIZIZ("header_url", this.LLILLJJLI.LLILZIL);
                C1472990oQz c1472990oQz = (C1472990oQz) C1472050oPT.LIZ("header_dashinfo", this.LLILLJJLI.LLILZIL);
                return (TextUtils.isEmpty(strLIZIZ) ^ true) && (c1472990oQz != null && !TextUtils.isEmpty(c1472990oQz.LJ)) && ((Boolean) C1474810oTv.LJJZZI.getValue()).booleanValue();
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJI(e eVar) {
                C1472060oPU c1472060oPU = this.LLILLJJLI;
                SimRadar.keyScan("EngineDataSourceHelper", "onError", c1472060oPU.LLILLL, player, c1472060oPU.LLILZ, eVar);
                if (LIZ()) {
                    LIZLLL();
                    return;
                }
                SimRadar.errorScan("TTPlayer", "onError", new C1473310oRV(eVar.toString()), new Object[0]);
                SimRadar.analyzer().getClass();
                C1472910oQr.LIZIZ("PF-Error1");
                if (C1481110oe5.LIZ) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onError() called with: error = [");
                    sbLIZ.append(eVar);
                    sbLIZ.append(e3.f);
                    C1481110oe5.LIZIZ("EngineDataSourceHelper", C2188811AlT.LIZIZ(sbLIZ));
                }
                this.LLILLJJLI.LLILLJJLI.LJJIJL().LJLJL(eVar.LIZ, eVar.LIZIZ, eVar, eVar.LJ);
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
            @Override // X.InterfaceC1469360oL8
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LJIJJLI(int r8) {
                /*
                    r7 = this;
                    r0 = 5
                    java.lang.Object[] r3 = new java.lang.Object[r0]
                    X.0oPU r2 = r7.LLILLJJLI
                    X.0oPB r0 = r2.LLILLL
                    r5 = 0
                    r3[r5] = r0
                    r1 = 1
                    X.0oPd r0 = r2
                    r3[r1] = r0
                    r1 = 2
                    java.lang.String r0 = r2.LLILZ
                    r3[r1] = r0
                    r2 = 3
                    java.lang.String r0 = "status"
                    r3[r2] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
                    r1 = 4
                    r3[r1] = r0
                    java.lang.String r0 = "EngineDataSourceHelper"
                    java.lang.String r6 = "onVideoStatusException"
                    com.ss.android.ugc.playerkit.radar.SimRadar.keyScan(r0, r6, r3)
                    boolean r0 = r7.LIZ()
                    if (r0 == 0) goto L31
                    r7.LIZLLL()
                    return
                L31:
                    r4 = 0
                    if (r8 == r2) goto L86
                    if (r8 == r1) goto L86
                    r0 = 20
                    if (r8 == r0) goto L86
                    r0 = 30
                    if (r8 == r0) goto L86
                    r0 = 40
                    if (r8 == r0) goto L83
                    r0 = 1000(0x3e8, float:1.401E-42)
                    if (r8 == r0) goto L86
                    r0 = 1002(0x3ea, float:1.404E-42)
                    if (r8 == r0) goto L83
                    r3 = r4
                L4b:
                    X.0oRV r2 = new X.0oRV
                    if (r3 != 0) goto L81
                    java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
                    java.lang.String r0 = ""
                    r1.append(r0)
                    r1.append(r8)
                    java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
                L5f:
                    r2.<init>(r0)
                    java.lang.Object[] r1 = new java.lang.Object[r5]
                    java.lang.String r0 = "TTPlayer"
                    com.ss.android.ugc.playerkit.radar.SimRadar.errorScan(r0, r6, r2, r1)
                    X.0oQr r0 = com.ss.android.ugc.playerkit.radar.SimRadar.analyzer()
                    r0.getClass()
                    java.lang.String r0 = "PF-Error2"
                    X.C1472910oQr.LIZIZ(r0)
                    X.0oPU r0 = r7.LLILLJJLI
                    X.0oPK r0 = r0.LLILLJJLI
                    X.0oPZ r0 = r0.LJJIJL()
                    r0.LJLJL(r8, r5, r3, r4)
                    return
                L81:
                    r0 = r3
                    goto L5f
                L83:
                    java.lang.String r3 = "Video deleted, play failed."
                    goto L4b
                L86:
                    java.lang.String r3 = "Transcoding, play failed."
                    goto L4b
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1472070oPV.LJIJJLI(int):void");
            }

            @Override // X.InterfaceC1469360oL8
            public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
                C1472060oPU c1472060oPU = this.LLILLJJLI;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(i);
                sbLIZ.append("*");
                sbLIZ.append(i2);
                c1472060oPU.LLILZLL = C2188811AlT.LIZIZ(sbLIZ);
            }
        });
    }

    @Override // X.C1469760oLm, X.InterfaceC1472340oPw
    public final Map<String, String> LJIILLIIL() {
        return LJ();
    }

    @Override // X.C1469760oLm, X.InterfaceC1472340oPw
    public final Map<String, String> LJIIZILJ() {
        return LJ();
    }

    @Override // X.C1469760oLm, X.InterfaceC1472340oPw
    public final Map<String, String> LJIL() {
        return LJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b0  */
    @Override // X.C1469760oLm, X.InterfaceC1472340oPw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, java.lang.String> LJJIII() {
        /*
            r7 = this;
            java.util.Map r6 = r7.LJ()
            java.util.Map<java.lang.String, java.lang.Object> r1 = r7.LLILZIL
            if (r1 == 0) goto L76
            java.lang.String r0 = "key"
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r3 = r0.toString()
            X.0jWY r5 = X.C1284250jWZ.LIZ
            r5.getClass()
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lb0
            java.lang.String r0 = "_"
            java.lang.String[] r4 = r3.split(r0)
            r2 = 0
            if (r4 == 0) goto Lad
            int r1 = r4.length
            r0 = 1
            if (r1 <= r0) goto Lad
            r1 = r4[r2]
        L2c:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb0
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7a
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto Lb0
            java.util.Map<java.lang.String, java.util.List<X.0jWa>> r0 = r5.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Lb0
            java.util.Map<java.lang.String, java.util.List<X.0jWa>> r0 = r5.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto Lb0
            int r0 = r1.size()
            if (r0 <= 0) goto Lb0
        L5a:
            int r0 = r1.size()
            if (r2 >= r0) goto Lb0
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r1, r2)
            X.0jWa r0 = (X.C1284260jWa) r0
            if (r0 == 0) goto L77
            long r0 = r0.LIZIZ
        L6a:
            java.lang.String r2 = java.lang.String.valueOf(r0)
            r1 = r6
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.String r0 = "video_cache_size"
            r1.put(r0, r2)
        L76:
            return r6
        L77:
            int r2 = r2 + 1
            goto L5a
        L7a:
            java.util.Map<java.lang.String, java.util.List<X.0jWa>> r0 = r5.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Lb0
            java.util.Map<java.lang.String, java.util.List<X.0jWa>> r0 = r5.LIZ
            java.util.concurrent.ConcurrentHashMap r0 = (java.util.concurrent.ConcurrentHashMap) r0
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto Lb0
            java.util.Iterator r2 = r0.iterator()
        L94:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb0
            java.lang.Object r1 = r2.next()
            X.0jWa r1 = (X.C1284260jWa) r1
            if (r1 == 0) goto L94
            java.lang.String r0 = r1.LIZ
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L94
            long r0 = r1.LIZIZ
            goto L6a
        Lad:
            r1 = r3
            goto L2c
        Lb0:
            r0 = -1
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1472060oPU.LJJIII():java.util.Map");
    }

    public C1472060oPU(InterfaceC1471960oPK interfaceC1471960oPK) {
        super(interfaceC1471960oPK);
        this.LLILZLL = "";
    }

    public final void LIZLLL(Map<String, Object> map) {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player == null) {
            return;
        }
        this.LLILZIL = map;
        String strLIZIZ = C1472050oPT.LIZIZ("header_url", map);
        C1472990oQz c1472990oQz = (C1472990oQz) C1472050oPT.LIZ("header_dashinfo", map);
        C1472900oQq c1472900oQq = (C1472900oQq) C1472050oPT.LIZ("video_extra", map);
        if (((Boolean) C1474810oTv.S5.getValue()).booleanValue()) {
            Object obj = map.get("header_play_video_bitrate_width");
            if (obj instanceof Integer) {
                player.LIZJ(1506, ((Integer) obj).intValue());
            }
            Object obj2 = map.get("header_play_video_bitrate_height");
            if (obj2 instanceof Integer) {
                player.LIZJ(1507, ((Integer) obj2).intValue());
            }
            if (c1472900oQq != null && c1472900oQq.getPsInfo() != null && !c1472900oQq.getPsInfo().isEmpty()) {
                player.LIZ(1505, c1472900oQq.getPsInfo());
            }
        }
        player.LIZJ(34, 0);
        player.LIZJ(29, 0);
        final InterfaceC1471960oPK interfaceC1471960oPK = this.LLILLJJLI;
        InterfaceC1471870oPB c1472020oPQ = new InterfaceC1471870oPB(interfaceC1471960oPK) { // from class: X.0oP8
            public final InterfaceC1471960oPK LL;
            public List<C1471890oPD> LLILLJJLI;

            @Override // X.InterfaceC1471870oPB
            public final /* synthetic */ void LIZJ(C1472150oPd c1472150oPd) {
            }

            @Override // X.InterfaceC1471870oPB
            public final /* synthetic */ void LIZLLL(Map map2) {
            }

            public final String toString() {
                return "UrlDataSource";
            }

            @Override // X.InterfaceC1471870oPB
            public final List<C1471890oPD> LIZIZ() {
                return this.LLILLJJLI;
            }

            {
                this.LL = interfaceC1471960oPK;
            }

            public static int LJ(String str, String str2, Map map2) {
                if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                    SimAudioBitrate simAudioBitrateLJIJ = C1477400oY6.LJJJJI.LJIJ(str2);
                    if (simAudioBitrateLJIJ != null && str.equals(simAudioBitrateLJIJ.getAudioMeta().getLanguageCode())) {
                        return simAudioBitrateLJIJ.getBitRate();
                    }
                    if (map2.get("video_extra") != null && (map2.get("video_extra") instanceof C1472900oQq)) {
                        return ((C1472900oQq) map2.get("video_extra")).getAudioBitrate();
                    }
                    return 0;
                }
                return 0;
            }

            /* JADX WARN: Removed duplicated region for block: B:101:0x01cf A[PHI: r4 r7 r11
              0x01cf: PHI (r4v7 java.util.List<X.0oPD>) = (r4v6 java.util.List<X.0oPD>), (r4v10 java.util.List<X.0oPD>) binds: [B:98:0x01cb, B:100:0x01ce] A[DONT_GENERATE, DONT_INLINE]
              0x01cf: PHI (r7v4 X.0oPD) = (r7v5 X.0oPD), (r7v9 X.0oPD) binds: [B:98:0x01cb, B:100:0x01ce] A[DONT_GENERATE, DONT_INLINE]
              0x01cf: PHI (r11v6 X.0oc7) = (r11v7 X.0oc7), (r11v13 X.0oc7) binds: [B:98:0x01cb, B:100:0x01ce] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:103:0x01d3 A[PHI: r4 r7
              0x01d3: PHI (r4v9 java.util.List<X.0oPD>) = (r4v7 java.util.List<X.0oPD>), (r4v6 java.util.List<X.0oPD>), (r4v6 java.util.List<X.0oPD>) binds: [B:102:0x01d1, B:98:0x01cb, B:92:0x01c1] A[DONT_GENERATE, DONT_INLINE]
              0x01d3: PHI (r7v7 X.0oPD) = (r7v4 X.0oPD), (r7v5 X.0oPD), (r7v12 X.0oPD) binds: [B:102:0x01d1, B:98:0x01cb, B:92:0x01c1] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:105:0x01d7  */
            /* JADX WARN: Removed duplicated region for block: B:109:0x0205  */
            /* JADX WARN: Removed duplicated region for block: B:142:0x02a8  */
            /* JADX WARN: Removed duplicated region for block: B:195:0x03cd  */
            @Override // X.InterfaceC1471870oPB
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZ(X.C1472150oPd r27, java.lang.String r28, X.C1472990oQz r29, java.util.Map<java.lang.String, java.lang.Object> r30) {
                /*
                    Method dump skipped, instruction units count: 1015
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C1471840oP8.LIZ(X.0oPd, java.lang.String, X.0oQz, java.util.Map):void");
            }
        };
        if (!TextUtils.isEmpty(strLIZIZ) && !strLIZIZ.startsWith("http") && !strLIZIZ.startsWith("mdl:")) {
            c1472020oPQ = new InterfaceC1471870oPB() { // from class: X.0oPC
                public String LL;

                @Override // X.InterfaceC1471870oPB
                public final /* synthetic */ List LIZIZ() {
                    return null;
                }

                @Override // X.InterfaceC1471870oPB
                public final /* synthetic */ void LIZJ(C1472150oPd c1472150oPd) {
                }

                public final String toString() {
                    return "LocalUrlDataSource";
                }

                @Override // X.InterfaceC1471870oPB
                public final void LIZLLL(Map<String, String> map2) {
                    HashMap map3 = (HashMap) map2;
                    map3.put("is_from_cache", "1");
                    String str = this.LL;
                    if (!TextUtils.isEmpty(str)) {
                        if (str.length() > 1024) {
                            map3.put("current_url", str.substring(0, 1024));
                        } else {
                            map3.put("current_url", str);
                        }
                    }
                }

                @Override // X.InterfaceC1471870oPB
                public final void LIZ(C1472150oPd c1472150oPd, String str, C1472990oQz c1472990oQz2, Map<String, Object> map2) {
                    c1472150oPd.LIZJ(203, 0);
                    c1472150oPd.LJIJ(str);
                    this.LL = str;
                }
            };
        } else if (c1472990oQz != null) {
            if (c1472990oQz.LIZIZ != null) {
                c1472020oPQ = new AbstractC1472980oQy() { // from class: X.0oPH
                    public C1470240oMY LL;
                    public String LLILLJJLI;

                    public final String toString() {
                        return "VideoModelDataSource";
                    }

                    @Override // X.AbstractC1472980oQy, X.InterfaceC1471870oPB
                    public final List<C1471890oPD> LIZIZ() {
                        String strLIZ;
                        if (this.LL == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (C1474520oTS c1474520oTS : this.LL.LJIILL()) {
                            if (c1474520oTS != null && c1474520oTS.LJFF() == 1 && (strLIZ = c1474520oTS.LIZ(55)) != null && strLIZ.length() != 0) {
                                arrayList.add(new C1471890oPD(EnumC1046760dLW.AUDIO.ordinal(), c1474520oTS.LJIIJ()[0], Arrays.asList(c1474520oTS.LJIIJ()), Integer.valueOf(c1474520oTS.LIZIZ(3)), strLIZ, c1474520oTS.LIZIZ(42), Float.valueOf(c1474520oTS.LJIIIIZZ(39)), Float.valueOf(c1474520oTS.LJIIIIZZ(40)), c1474520oTS.LIZ(15), c1474520oTS.LIZ(6), null, Boolean.valueOf(c1474520oTS.LJII())));
                            }
                        }
                        return arrayList;
                    }

                    @Override // X.InterfaceC1471870oPB
                    public final void LIZLLL(Map<String, String> map2) {
                        ((HashMap) map2).put("bitrate_set", this.LLILLJJLI);
                    }

                    public static C1474520oTS LJFF(C1472990oQz c1472990oQz2, C1470240oMY c1470240oMY) {
                        if (!TextUtils.isEmpty(c1472990oQz2.LJJII) && c1470240oMY != null) {
                            List<C1474520oTS> listLJIILL = c1470240oMY.LJIILL();
                            for (C1474520oTS c1474520oTS : listLJIILL) {
                                if (c1474520oTS != null && c1474520oTS.LJFF() == 1 && c1472990oQz2.LJJII.equals(c1474520oTS.LIZ(28))) {
                                    return c1474520oTS;
                                }
                            }
                            if (C1474810oTv.LLJL()) {
                                for (C1474520oTS c1474520oTS2 : listLJIILL) {
                                    if (c1474520oTS2 != null && c1474520oTS2.LJFF() == 1 && c1472990oQz2.LJJII.equals(c1474520oTS2.LIZ(15))) {
                                        return c1474520oTS2;
                                    }
                                }
                            }
                        }
                        return null;
                    }

                    public static EnumC2281151EQn LJI(C1472990oQz c1472990oQz2, C1470240oMY c1470240oMY) {
                        EnumC2281141EQm enumC2281141EQm = c1472990oQz2.LJIIIZ;
                        if (enumC2281141EQm != null) {
                            return C2281201EQs.LIZ(enumC2281141EQm);
                        }
                        return TTVideoEngine.LJJIJL(c1470240oMY, EnumC2281151EQn.H_High, 1);
                    }

                    @Override // X.InterfaceC1471870oPB
                    public final void LIZ(C1472150oPd c1472150oPd, String str, C1472990oQz c1472990oQz2, Map<String, Object> map2) {
                        C1474520oTS c1474520oTSLJFF;
                        C1474520oTS c1474520oTSLJFF2;
                        C1474520oTS c1474520oTSLJFF3;
                        C1474520oTS c1474520oTSLJFF4;
                        c1472150oPd.LIZJ(203, 1);
                        c1472150oPd.LIZJ(160, 1);
                        C1470240oMY c1470240oMYLIZ = C1471940oPI.LIZ(c1472990oQz2.LIZIZ);
                        C1474600oTa c1474600oTa = c1472990oQz2.LIZIZ;
                        JSONArray jSONArray = new JSONArray();
                        Iterator it2 = ((ArrayList) c1474600oTa.LJ()).iterator();
                        while (it2.hasNext()) {
                            Object obj3 = ((Pair) it2.next()).first;
                            if (obj3 != null) {
                                jSONArray.put(((EnumC2281141EQm) obj3).toString());
                            }
                        }
                        this.LLILLJJLI = jSONArray.toString();
                        c1472150oPd.LLJJIJI(c1470240oMYLIZ);
                        if (c1472990oQz2.LJIILJJIL) {
                            c1472150oPd.LIZJ(29, 1);
                            AbstractC1472980oQy.LJ(c1472150oPd, c1472990oQz2);
                        } else if (C1474810oTv.LJZL() && !((Boolean) C1474810oTv.I0.getValue()).booleanValue()) {
                            HashMap map3 = new HashMap();
                            EnumC2281151EQn resolution = EnumC2281151EQn.H_High;
                            if (c1472990oQz2.LJIIIZ != null && !TextUtils.isEmpty(c1472990oQz2.LJIIJ)) {
                                resolution = C2281201EQs.LIZ(c1472990oQz2.LJIIIZ);
                                map3.put(18, c1472990oQz2.LJIIJ);
                            } else {
                                EnumC2281141EQm enumC2281141EQm = c1472990oQz2.LJIIIZ;
                                if (enumC2281141EQm != null) {
                                    resolution = C2281201EQs.LIZ(enumC2281141EQm);
                                } else {
                                    C1474520oTS c1474520oTSLJJIJLIJ = TTVideoEngine.LJJIJLIJ(c1470240oMYLIZ, 0);
                                    if (c1474520oTSLJJIJLIJ != null) {
                                        if (c1474520oTSLJJIJLIJ.getResolution() != null) {
                                            resolution = c1474520oTSLJJIJLIJ.getResolution();
                                        }
                                        String strLIZ = c1474520oTSLJJIJLIJ.LIZ(18);
                                        if (!TextUtils.isEmpty(strLIZ)) {
                                            map3.put(18, strLIZ);
                                        }
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty(c1472990oQz2.LJJII) && (c1474520oTSLJFF4 = LJFF(c1472990oQz2, c1470240oMYLIZ)) != null) {
                                c1472150oPd.LIZJ(675, c1474520oTSLJFF4.LIZIZ(42));
                                if (c1474520oTSLJFF4.LJII()) {
                                    c1472150oPd.LIZJ(4328, c1474520oTSLJFF4.LIZIZ(3));
                                    c1472150oPd.LIZ(4327, c1474520oTSLJFF4.LIZ(15));
                                }
                            }
                            c1472150oPd.LJIIL(resolution, map3);
                        } else if (!TextUtils.isEmpty(c1472990oQz2.LJIIJJI) && ((Boolean) C1474810oTv.I0.getValue()).booleanValue()) {
                            HashMap map4 = new HashMap();
                            map4.put(15, c1472990oQz2.LJIIJJI);
                            if (!TextUtils.isEmpty(c1472990oQz2.LJJII) && (c1474520oTSLJFF3 = LJFF(c1472990oQz2, c1470240oMYLIZ)) != null) {
                                c1472150oPd.LIZJ(675, c1474520oTSLJFF3.LIZIZ(42));
                                if (c1474520oTSLJFF3.LJII()) {
                                    c1472150oPd.LIZJ(4328, c1474520oTSLJFF3.LIZIZ(3));
                                    c1472150oPd.LIZ(4327, c1474520oTSLJFF3.LIZ(15));
                                }
                            }
                            c1472150oPd.LJIIL(LJI(c1472990oQz2, c1470240oMYLIZ), map4);
                        } else if (!TextUtils.isEmpty(c1472990oQz2.LJIIJ)) {
                            HashMap map5 = new HashMap();
                            map5.put(18, c1472990oQz2.LJIIJ);
                            if (!TextUtils.isEmpty(c1472990oQz2.LJJII) && (c1474520oTSLJFF2 = LJFF(c1472990oQz2, c1470240oMYLIZ)) != null) {
                                c1472150oPd.LIZJ(675, c1474520oTSLJFF2.LIZIZ(42));
                                if (c1474520oTSLJFF2.LJII()) {
                                    c1472150oPd.LIZJ(4328, c1474520oTSLJFF2.LIZIZ(3));
                                    c1472150oPd.LIZ(4327, c1474520oTSLJFF2.LIZ(15));
                                }
                            }
                            c1472150oPd.LJIIL(LJI(c1472990oQz2, c1470240oMYLIZ), map5);
                        } else {
                            if (C1474810oTv.LLJL() && !TextUtils.isEmpty(c1472990oQz2.LJJII) && (c1474520oTSLJFF = LJFF(c1472990oQz2, c1470240oMYLIZ)) != null) {
                                c1472150oPd.LIZJ(675, c1474520oTSLJFF.LIZIZ(42));
                                if (c1474520oTSLJFF.LJII()) {
                                    c1472150oPd.LIZJ(4328, c1474520oTSLJFF.LIZIZ(3));
                                    c1472150oPd.LIZ(4327, c1474520oTSLJFF.LIZ(15));
                                }
                            }
                            c1472150oPd.LJIILIIL(LJI(c1472990oQz2, c1470240oMYLIZ));
                        }
                        c1472150oPd.LIZJ(33, 1);
                        c1472150oPd.LIZJ(17, 1);
                        this.LL = c1470240oMYLIZ;
                    }
                };
            } else if (!TextUtils.isEmpty(c1472990oQz.LJ)) {
                c1472020oPQ = new C1472020oPQ();
            }
        }
        this.LLILLL = c1472020oPQ;
        String sourceId = this.LLILLJJLI.getSourceId();
        this.LLILZ = sourceId;
        SimRadar.keyScan("EngineDataSourceHelper", "doPrepare", "newDataSourceHelper", c1472020oPQ, "mPlayer", player, "sourceID", sourceId);
        c1472020oPQ.LIZ(player, strLIZIZ, c1472990oQz, map);
    }

    @Override // X.C1469760oLm, X.InterfaceC1472290oPr
    public final void LJJIL(boolean z) {
        C1472150oPd player = this.LLILLJJLI.getPlayer();
        if (player != null && z && this.LLILLL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onBeforeReset: lastDataSourceHelper: ");
            sbLIZ.append(this.LLILLL);
            sbLIZ.append("; mPlayer: ");
            sbLIZ.append(player);
            sbLIZ.append("; sourceID: ");
            sbLIZ.append(this.LLILZ);
            SimRadar.keyScan("TTPlayer", "EngineDataSourceHelper", C2188811AlT.LIZIZ(sbLIZ));
            this.LLILLL.LIZJ(player);
        }
    }
}
