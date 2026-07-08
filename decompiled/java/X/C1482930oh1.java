package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oh1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1482930oh1 implements InterfaceC583260MuC {
    public final List<AbstractC1482950oh3> LIZ;

    @Override // X.InterfaceC583260MuC
    public final List<String> LIZ() {
        return null;
    }

    @Override // X.InterfaceC583260MuC
    public final void LIZIZ(Object obj, String str) {
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public C1482930oh1(final C1483080ohG c1483080ohG) {
        ArrayList arrayList = new ArrayList();
        this.LIZ = arrayList;
        arrayList.addAll(new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        String str = c1483080ohG.LIZ.LIZJ;
        str.getClass();
        switch (str.hashCode()) {
            case -1856834309:
                if (str.equals("ONLY_LIST_PRELOAD")) {
                    C1482960oh4.LIZ(arrayList2, new C1482880ogw(c1483080ohG));
                }
                break;
            case -1765292583:
                if (str.equals("LOUDNESS_STRATEGY_MODE")) {
                    C1482960oh4.LIZ(arrayList2, new AbstractC1482950oh3(c1483080ohG) { // from class: X.0oh0
                        @Override // X.InterfaceC583260MuC
                        public final List<String> LIZ() {
                            return Arrays.asList("PlayerManager_PRERENDER");
                        }

                        @Override // X.AbstractC1482950oh3
                        public final boolean LIZJ() {
                            this.LIZ.LIZJ.getClass();
                            return C1474810oTv.LJJLIIIJILLIZJL() != 0;
                        }

                        @Override // X.InterfaceC583260MuC
                        public final void LIZIZ(Object obj, String str2) {
                            str2.getClass();
                            if (str2.equals("PlayerManager_PRERENDER")) {
                                String str3 = (String) obj;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("LoudnessStrategy::handlePrerender: sending trigger, sourceId=");
                                sbLIZ.append(str3);
                                sbLIZ.append(", sceneId=");
                                sbLIZ.append(this.LIZ.LIZ.LIZ);
                                C2188811AlT.LIZIZ(sbLIZ);
                                TTVideoEngine.LJIIJJI(1008, str3);
                            }
                        }
                    });
                }
                break;
            case -1632291488:
                if (str.equals("LIVE_ULTRA_FAST_MODE")) {
                    C1482960oh4.LIZ(arrayList2, new AbstractC1482950oh3(c1483080ohG) { // from class: X.0oh2
                        public final String LIZIZ = "LiveUltraFastModeStrategy";

                        @Override // X.AbstractC1482950oh3
                        public final boolean LIZJ() {
                            return true;
                        }

                        @Override // X.InterfaceC583260MuC
                        public final List<String> LIZ() {
                            return Collections.singletonList("StrategyScene_ON_LIVE_ULTRA_FAST_VALUE");
                        }

                        @Override // X.AbstractC1482950oh3
                        public final String LJFF() {
                            return this.LIZIZ;
                        }

                        @Override // X.InterfaceC583260MuC
                        public final void LIZIZ(Object obj, String str2) {
                            C1483220ohU c1483220ohU;
                            if (Intrinsics.LJFF(str2, "StrategyScene_ON_LIVE_ULTRA_FAST_VALUE") && (obj instanceof C1483220ohU) && (c1483220ohU = (C1483220ohU) obj) != null) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("handleLiveUltraFastModeEvent:");
                                sbLIZ.append(c1483220ohU.LIZ);
                                sbLIZ.append(' ');
                                sbLIZ.append(c1483220ohU.LIZIZ);
                                C2188811AlT.LIZIZ(sbLIZ);
                                InterfaceC1482870ogv interfaceC1482870ogvLIZ = C1478160oZK.LIZ();
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("current_level", c1483220ohU.LIZ);
                                    jSONObject.put("check_level", c1483220ohU.LIZIZ);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                }
                                interfaceC1482870ogvLIZ.LJJL(jSONObject);
                            }
                        }
                    });
                }
                break;
            case 32942469:
                if (str.equals("LIVE_DATA_MODE")) {
                    C1482960oh4.LIZ(arrayList2, new AbstractC1482950oh3(c1483080ohG) { // from class: X.0ogx
                        public final String LIZIZ;
                        public int LIZJ;
                        public final int LIZLLL;
                        public final CopyOnWriteArrayList<InterfaceC1479620obg> LJ;
                        public Long LJFF;

                        @Override // X.InterfaceC583260MuC
                        public final List<String> LIZ() {
                            return C1697810uHb.LJIIJJI("StrategyScene_SET_PLAY_LIST", "StrategyScene_ON_PAGE_SELECTED_PASS_VALUE");
                        }

                        @Override // X.AbstractC1482950oh3
                        public final boolean LIZJ() {
                            this.LIZ.LIZJ.getClass();
                            return true;
                        }

                        @Override // X.AbstractC1482950oh3
                        public final void LIZLLL() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onSceneDestroy:");
                            sbLIZ.append(this.LIZ.LIZ.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1478160oZK.LIZ().LJJIJLIJ(this.LIZ.LIZ.LIZ);
                        }

                        @Override // X.AbstractC1482950oh3
                        public final void LJ() {
                            super.LJ();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onSceneMoveTo:");
                            sbLIZ.append(this.LIZ.LIZ.LIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            C1478160oZK.LIZ().LJJJ(this.LIZ.LIZ.LIZ);
                        }

                        @Override // X.AbstractC1482950oh3
                        public final String LJFF() {
                            return this.LIZIZ;
                        }

                        {
                            String strJ3;
                            super(c1483080ohG);
                            this.LIZIZ = "LiveDataStrategy";
                            this.LIZLLL = 30;
                            this.LJ = new CopyOnWriteArrayList<>();
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("onSceneCreate:");
                            sbLIZ.append(c1483080ohG.LIZ.LIZ);
                            sbLIZ.append(", ");
                            sbLIZ.append(c1483080ohG.LIZ.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ);
                            if (TextUtils.isEmpty(c1483080ohG.LIZ.LIZIZ)) {
                                strJ3 = null;
                            } else {
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("entrance", c1483080ohG.LIZ.LIZIZ);
                                strJ3 = C786410Ut5.J3(jSONObject);
                            }
                            C1475700oVM.LIZ().LJJJI(c1483080ohG.LIZ.LIZ, strJ3);
                        }

                        public static final List<SimVideoUrlModel> LJI(List<? extends InterfaceC1479620obg> list) {
                            SimVideoUrlModel simVideoUrlModelLIZ;
                            String strLIZ;
                            ArrayList arrayList3 = new ArrayList();
                            for (InterfaceC1479620obg interfaceC1479620obg : list) {
                                SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
                                simVideoUrlModel.isLive = 1;
                                if ((interfaceC1479620obg.LJIIJJI() != null || interfaceC1479620obg.LJII() != null) && (simVideoUrlModelLIZ = C1477760oYg.LIZ(C1479540obY.LIZIZ(interfaceC1479620obg), C1480850odf.LIZJ.getPlayerType())) != null) {
                                    if (interfaceC1479620obg.LIZLLL() != null) {
                                        simVideoUrlModelLIZ.setBusinessUrlExpiredTime(0L);
                                    }
                                    simVideoUrlModelLIZ.isLive = 2;
                                    simVideoUrlModel = simVideoUrlModelLIZ;
                                }
                                simVideoUrlModel.setSourceId(interfaceC1479620obg.getKey());
                                InterfaceC1483230ohV interfaceC1483230ohVLJIIIIZZ = interfaceC1479620obg.LJIIIIZZ();
                                if (interfaceC1483230ohVLJIIIIZZ != null) {
                                    strLIZ = interfaceC1483230ohVLJIIIIZZ.LIZ();
                                } else {
                                    strLIZ = null;
                                }
                                simVideoUrlModel.setLiveJsonStringData(strLIZ);
                                arrayList3.add(simVideoUrlModel);
                            }
                            return arrayList3;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:136:0x02c2  */
                        /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
                        /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
                        @Override // X.InterfaceC583260MuC
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZIZ(java.lang.Object r9, java.lang.String r10) {
                            /*
                                Method dump skipped, instruction units count: 923
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C1482890ogx.LIZIZ(java.lang.Object, java.lang.String):void");
                        }
                    });
                }
                break;
            case 2129562405:
                if (str.equals("LIST_ONE")) {
                    C1482960oh4.LIZ(arrayList2, new AbstractC1482950oh3(c1483080ohG) { // from class: X.0ogz
                        public final C1482720ogg LIZIZ;

                        @Override // X.AbstractC1482950oh3
                        public final boolean LIZJ() {
                            return true;
                        }

                        @Override // X.AbstractC1482950oh3
                        public final String LJFF() {
                            return "PlayRequestManageStrategy";
                        }

                        @Override // X.InterfaceC583260MuC
                        public final List<String> LIZ() {
                            return Arrays.asList("SimKitPlayer_PLAY", "StrategyScene_SET_PLAY_LIST");
                        }

                        {
                            super(c1483080ohG);
                            C1482720ogg c1482720ogg = new C1482720ogg();
                            this.LIZIZ = c1482720ogg;
                            c1483080ohG.LIZIZ = c1482720ogg;
                        }

                        @Override // X.InterfaceC583260MuC
                        public final void LIZIZ(Object obj, String str2) {
                            Object obj2;
                            str2.getClass();
                            if (!str2.equals("StrategyScene_SET_PLAY_LIST")) {
                                if (str2.equals("SimKitPlayer_PLAY")) {
                                    this.LIZIZ.LJIIIIZZ((InterfaceC1479620obg) obj);
                                    return;
                                }
                                return;
                            }
                            C1483110ohJ c1483110ohJ = (C1483110ohJ) obj;
                            if (c1483110ohJ == null || (obj2 = c1483110ohJ.LIZIZ) == null) {
                                return;
                            }
                            List<InterfaceC1479620obg> list = (List) obj2;
                            String str3 = c1483110ohJ.LIZ;
                            if (!TextUtils.equals(str3, this.LIZ.LIZ.LIZ)) {
                                return;
                            }
                            this.LIZIZ.LJIIIZ(str3, list);
                        }
                    });
                    C1482960oh4.LIZ(arrayList2, new C1482670ogb(c1483080ohG));
                    C1482960oh4.LIZ(arrayList2, new C1482880ogw(c1483080ohG));
                    C1482960oh4.LIZ(arrayList2, new C1482970oh5(c1483080ohG));
                    C1482960oh4.LIZ(arrayList2, new AbstractC1482950oh3(c1483080ohG) { // from class: X.0ogP
                        public InterfaceC1479620obg LIZIZ;

                        @Override // X.AbstractC1482950oh3
                        public final String LJFF() {
                            return "ByteVC1RetryStrategy";
                        }

                        @Override // X.InterfaceC583260MuC
                        public final List<String> LIZ() {
                            return Arrays.asList("PlayerCallback_FAILED", "SimKitPlayer_PLAY");
                        }

                        @Override // X.AbstractC1482950oh3
                        public final boolean LIZJ() {
                            return C1479110oar.LIZ.LIZ.getPlayerGlobalConfig().isEnableByteVC1AutoRetry();
                        }

                        @Override // X.InterfaceC583260MuC
                        public final void LIZIZ(Object obj, String str2) {
                            InterfaceC1479620obg interfaceC1479620obg;
                            str2.getClass();
                            if (!str2.equals("SimKitPlayer_PLAY")) {
                                if (str2.equals("PlayerCallback_FAILED")) {
                                    C585010Mx1 c585010Mx1 = (C585010Mx1) obj;
                                    String str3 = c585010Mx1.LIZ;
                                    if (!TextUtils.isEmpty(str3) && (interfaceC1479620obg = this.LIZIZ) != null && TextUtils.equals(interfaceC1479620obg.getKey(), str3)) {
                                        if (1 == c585010Mx1.LIZIZ.LIZJ) {
                                            if (C1479540obY.LJ(C1479540obY.LIZ(this.LIZIZ, null)) == null) {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("onPlayFailed: playRequest null, return. ");
                                                sbLIZ.append(str3);
                                                C2188811AlT.LIZIZ(sbLIZ);
                                                return;
                                            }
                                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                            sbLIZ2.append("onPlayFailed: retry with 264. ");
                                            sbLIZ2.append(str3);
                                            C2188811AlT.LIZIZ(sbLIZ2);
                                            throw null;
                                        }
                                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                        sbLIZ3.append("onPlayFailed: not bytevc1, return. ");
                                        sbLIZ3.append(str3);
                                        C2188811AlT.LIZIZ(sbLIZ3);
                                        return;
                                    }
                                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                                    sbLIZ4.append("onPlayFailed: not same video, return. ");
                                    sbLIZ4.append(str3);
                                    C2188811AlT.LIZIZ(sbLIZ4);
                                    return;
                                }
                                return;
                            }
                            this.LIZIZ = (InterfaceC1479620obg) obj;
                        }
                    });
                }
                break;
        }
        arrayList.addAll(arrayList2);
        C786410Ut5.j4("StrategyManager init. %s strategies in effect, they are:%s", new Object[]{Integer.valueOf(arrayList.size()), arrayList});
    }
}
