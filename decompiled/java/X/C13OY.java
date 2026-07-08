package X;

import Y.ARunnableS99S0200000_30;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.CategoryPageModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectChannelResponse;
import com.ss.android.ugc.effectmanager.effect.model.EffectKt;
import com.ss.android.ugc.effectmanager.effect.model.EffectQRCode;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.ss.android.ugc.effectmanager.effect.model.net.EffectListResponse;
import com.ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.ss.ugc.effectplatform.ICKResourceVEPluginStatusService;
import com.ss.ugc.effectplatform.VEPluginNotLoadedExceptionInCKResources;
import com.ss.ugc.effectplatform.model.net.UpdateUseEffectResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS574S0100000_30;
import kotlin.jvm.internal.AwS81S0210000_30;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import v2p.m1;
import w1p.a;

/* JADX INFO: renamed from: X.13OY, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13OY {
    public static final List<InterfaceC20004913Pb> LJIIJ = Collections.synchronizedList(new ArrayList());
    public final C13RD LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 440));
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 439));
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS574S0100000_30(this, 444));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 437));
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS574S0100000_30(this, 443));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(335));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS574S0100000_30(this, 442));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 441));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS574S0100000_30(this, 438));

    public final void LIZIZ() {
        if (C13QU.LIZIZ.LIZIZ()) {
            C13SS.LIZ.getClass();
            C13SS.LIZ("isEffectReadyWithCache", "clean effect ready cache");
            ((ConcurrentHashMap) C13NE.LIZ.getValue()).clear();
        }
        InterfaceC20004513Ox interfaceC20004513OxLIZ = C19996613Lw.LIZ(this.LIZ.LJJIJL);
        if (interfaceC20004513OxLIZ != null) {
            interfaceC20004513OxLIZ.clear();
        }
    }

    public final C20005513Ph LJIILJJIL() {
        return (C20005513Ph) this.LJ.getValue();
    }

    public final C20002413Oc LJIILL() {
        return (C20002413Oc) this.LIZJ.getValue();
    }

    public final C20000613Nk LJIILLIIL() {
        return (C20000613Nk) this.LIZIZ.getValue();
    }

    public final C13P0 LJIIZILJ() {
        return (C13P0) this.LJII.getValue();
    }

    public C13OY(C13RD c13rd) {
        InterfaceC20004513Ox interfaceC20004513OxLIZ;
        this.LIZ = c13rd;
        if (c13rd != null) {
            if (c13rd.LJJIIJZLJL != null) {
                if (c13rd.LJIJI != null) {
                    if (!C504670Jqj.LIZIZ(c13rd.LJII)) {
                        if (!C13SB.LJ(c13rd.LJII)) {
                            C13SB.LJIIJ(c13rd.LJII);
                            if (!C13SB.LJ(c13rd.LJII)) {
                                C13SS c13ss = C13SS.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("Cache directory error");
                                sbLIZ.append(c13rd.LJII);
                                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                c13ss.getClass();
                                C13SS.LIZIZ("EffectPlatform", strLIZIZ, null);
                            }
                        }
                        if (!C13SB.LJ(c13rd.LJJIJIL)) {
                            C13SB.LJIIJ(c13rd.LJJIJIL);
                        }
                        if (c13rd.LJJIIJ == null) {
                            InterfaceExecutorC740550T3d interfaceExecutorC740550T3d = c13rd.LJIL;
                            C20002513Od c20002513Od = new C20002513Od();
                            c20002513Od.LIZIZ = c13rd.LJJ;
                            c20002513Od.LIZ = interfaceExecutorC740550T3d == null ? new C13QJ() : interfaceExecutorC740550T3d;
                            c13rd.LJJIIJ = c20002513Od.LIZ();
                        }
                        InterfaceC20004913Pb interfaceC20004913Pb = new InterfaceC20004913Pb() { // from class: X.13PY
                            @Override // X.InterfaceC20004913Pb
                            public final void LIZ(int i, List<String> list, long j, long j2, long j3, long j4) {
                                C13RD c13rd2 = this.LIZ.LIZ;
                                InterfaceC1633730scF interfaceC1633730scF = c13rd2.LJIJJLI;
                                if (interfaceC1633730scF != null) {
                                    float f = 1024;
                                    interfaceC1633730scF.monitorStatusRate("effect_platform_lru_clean_cache", 0, C2097608Jq.LJIIIIZZ(new Pair("clean_type", a0.LJJLJLI(c13rd2.LJII, "/", "default_effect")), new Pair("clean_strategy", Integer.valueOf(i)), new Pair("clean_num", Integer.valueOf(list.size())), new Pair("clean_size", Float.valueOf(((j3 * 1.0f) / f) / f)), new Pair("current_size", Float.valueOf(((j * 1.0f) / f) / f)), new Pair("max_size", Float.valueOf(((j2 * 1.0f) / f) / f)), new Pair("duration", Long.valueOf(j4))));
                                }
                                C13SS c13ss2 = C13SS.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("onCleanLRUCache, cleanKeys: ");
                                sbLIZ2.append(list);
                                sbLIZ2.append(", currentSize: ");
                                sbLIZ2.append(j);
                                sbLIZ2.append(", maxSize: ");
                                sbLIZ2.append(j2);
                                sbLIZ2.append(", cleanSize: ");
                                sbLIZ2.append(j3);
                                sbLIZ2.append(", timeCost: ");
                                sbLIZ2.append(j4);
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                c13ss2.getClass();
                                C13SS.LIZ("EffectDiskLruCache", strLIZIZ2);
                                Iterator<InterfaceC20004913Pb> it2 = C13OY.LJIIJ.iterator();
                                while (it2.hasNext()) {
                                    it2.next().LIZ(i, list, j, j2, j3, j4);
                                }
                            }
                        };
                        String str = c13rd.LJII;
                        if (!C13SB.LJ(str)) {
                            C13SB.LJIIJ(c13rd.LJII);
                            if (!C13SB.LJ(c13rd.LJII)) {
                                C13SS c13ss2 = C13SS.LIZ;
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("Cache directory error");
                                sbLIZ2.append(c13rd.LJII);
                                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                                c13ss2.getClass();
                                C13SS.LIZIZ("EffectPlatform", strLIZIZ2, null);
                            }
                        }
                        InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
                        if (interfaceC20004513Ox == null) {
                            if (C19996613Lw.LIZ(str) == null) {
                                C13MX c13mx = new C13MX(c13rd);
                                InterfaceExecutorC740550T3d interfaceExecutorC740550T3d2 = c13rd.LJIL;
                                if (interfaceExecutorC740550T3d2 != null) {
                                    interfaceExecutorC740550T3d2.execute(new ARunnableS99S0200000_30(c13mx, interfaceC20004913Pb, 35));
                                }
                                C19996613Lw.LIZ.put(str, c13mx);
                            }
                            List<String> list = c13rd.LJJIIZ;
                            if (list != null && (interfaceC20004513OxLIZ = C19996613Lw.LIZ(str)) != null) {
                                interfaceC20004513OxLIZ.LJIIL(list);
                            }
                            c13rd.LJJIFFI = C19996613Lw.LIZ(str);
                        } else {
                            C19996613Lw.LIZ.put(str, interfaceC20004513Ox);
                        }
                        C13RH.LIZLLL = c13rd.LJIJJLI;
                        if (C0UER.LIZ == null) {
                            C0UER.LIZ = new C0UES() { // from class: X.13Oe
                                @Override // X.C0UES
                                public final String decrypt(String str2) {
                                    return C13RH.LIZ(str2);
                                }
                            };
                            return;
                        }
                        return;
                    }
                    throw new IllegalArgumentException("EffectConfiguration Error! Cache directory error");
                }
                throw new IllegalArgumentException("EffectConfiguration Error! Not set json convert");
            }
            throw new IllegalArgumentException("EffectConfiguration Error! Not set host !!!");
        }
        throw new IllegalArgumentException("EffectConfiguration Error! Not set configuration");
    }

    public final void LIZ(Effect effect) {
        String str;
        C20000613Nk c20000613NkLJIILLIIL = LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        String strExpectedMd5 = EffectKt.expectedMd5(effect);
        if (!C504670Jqj.LIZIZ(strExpectedMd5) && (str = c20000613NkLJIILLIIL.LIZIZ.get(strExpectedMd5)) != null) {
            C20001113Np c20001113Np = c20000613NkLJIILLIIL.LIZ.LJJIIJ;
            if (c20001113Np != null) {
                c20001113Np.LIZ(str);
            }
            C19719512Dh.LIZJ(c20000613NkLJIILLIIL.LIZIZ).remove(strExpectedMd5);
        }
    }

    public final boolean LJIJ(Effect effect) {
        if (a0.LJJJIL(effect.getUnzipPath())) {
            return false;
        }
        this.LIZ.LJJJI.getClass();
        boolean zLIZJ = C13MG.LIZJ(effect);
        if (!zLIZJ) {
            return false;
        }
        UrlModel trans_file_url = effect.getTrans_file_url();
        if (trans_file_url != null && trans_file_url.getUri() != null) {
            String str = this.LIZ.LJII;
            if (a0.LJJJIL(effect.getTransResPath())) {
                C13LD.LIZ.getClass();
                C13LD.LJIIL(effect, str);
            }
            C13SS.LIZ.getClass();
            C13SS.LIZ("checkEffect", "effect has trans res");
            if (C13SB.LJ(effect.getTransResPath())) {
                zLIZJ = true;
                CopyOnWriteArrayList<String> copyOnWriteArrayList = C20007213Py.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(effect.getUnzipPath());
                sbLIZ.append("_trans_");
                copyOnWriteArrayList.remove(C2188811AlT.LIZIZ(sbLIZ));
            } else {
                zLIZJ = false;
            }
        } else {
            CopyOnWriteArrayList<String> copyOnWriteArrayList2 = C20007213Py.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(effect.getUnzipPath());
            sbLIZ2.append("_trans_");
            copyOnWriteArrayList2.add(C2188811AlT.LIZIZ(sbLIZ2));
        }
        LJIILLIIL().LIZLLL(effect, true, false, false, false, null, false);
        if (!zLIZJ) {
            return false;
        }
        C13LD.LIZ.getClass();
        if (!C13LD.LJI(effect)) {
            return false;
        }
        return true;
    }

    public final boolean LJIJI(Effect effect) {
        if (LJIJ(effect)) {
            return LJIILJJIL().LIZ(effect);
        }
        return false;
    }

    public final void LJIJJ(Effect effect) {
        C13SS c13ss = C13SS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("markEffectUsed: id: ");
        sbLIZ.append(effect.getEffect_id());
        sbLIZ.append(", name: ");
        sbLIZ.append(effect.getName());
        sbLIZ.append(", panel: ");
        sbLIZ.append(effect.getPanel());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c13ss.getClass();
        C13SS.LIZ("CKResource", strLIZIZ);
        LJIILLIIL().LJIIIZ(effect);
        C20005513Ph c20005513PhLJIILJJIL = LJIILJJIL();
        c20005513PhLJIILJJIL.getClass();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("effect: ");
        sbLIZ2.append(effect.getEffect_id());
        sbLIZ2.append(", name: ");
        sbLIZ2.append(effect.getName());
        sbLIZ2.append(" markModelUsed");
        C13SS.LIZ("AlgorithmRepository", C2188811AlT.LIZIZ(sbLIZ2));
        if (C19996913Lz.LIZJ(effect)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("decrypt error effect: ");
            sbLIZ3.append(effect.getEffect_id());
            sbLIZ3.append(", name: ");
            sbLIZ3.append(effect.getName());
            sbLIZ3.append(", requirements_sec: ");
            sbLIZ3.append(effect.getRequirements_sec());
            C13SS.LIZIZ("AlgorithmRepository", C2188811AlT.LIZIZ(sbLIZ3), null);
            return;
        }
        String[] strArrLIZIZ = C19996913Lz.LIZIZ(effect, c20005513PhLJIILJJIL.LIZ.LJIJI);
        if (strArrLIZIZ != null && strArrLIZIZ.length != 0) {
            C089E c089e = new C089E(strArrLIZIZ);
            while (c089e.hasNext()) {
                String str = (String) c089e.next();
                C13SS c13ss2 = C13SS.LIZ;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("markModelUsed: resourceName: ");
                sbLIZ4.append(str);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ4);
                c13ss2.getClass();
                C13SS.LIZ("AlgorithmRepository", strLIZIZ2);
                c20005513PhLJIILJJIL.LIZLLL().markModelUsed(str);
            }
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("effect: ");
        sbLIZ5.append(effect.getEffect_id());
        sbLIZ5.append(", name: ");
        sbLIZ5.append(effect.getName());
        sbLIZ5.append(" returned empty resourceNameArrayOfEffect");
        C13SS.LIZ("AlgorithmRepository", C2188811AlT.LIZIZ(sbLIZ5));
    }

    public final void LJIL(Effect effect) {
        String str;
        C20001113Np c20001113Np;
        C20000613Nk c20000613NkLJIILLIIL = LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        String strExpectedMd5 = EffectKt.expectedMd5(effect);
        if (!C504670Jqj.LIZIZ(strExpectedMd5) && (str = c20000613NkLJIILLIIL.LIZIZ.get(strExpectedMd5)) != null && (c20001113Np = c20000613NkLJIILLIIL.LIZ.LJJIIJ) != null) {
            InterfaceC20001313Nr interfaceC20001313Nr = c20001113Np.LIZLLL.get(str);
            if (interfaceC20001313Nr != null) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("[Pause][TaskManager][ExecutingList][");
                sbLIZ.append(str);
                sbLIZ.append(']');
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LJ("JKL", strLIZIZ);
                interfaceC20001313Nr.pause(false);
                c20001113Np.LJIIIZ.put(str, interfaceC20001313Nr);
                return;
            }
            if (!C0C0N.LIZ() && !a.LIZ().taskManagerQueueOptBugfixEnabled) {
                for (InterfaceC20001313Nr interfaceC20001313Nr2 : c20001113Np.LJ) {
                    if (Intrinsics.LJFF(interfaceC20001313Nr2.getId(), str)) {
                        C13SS c13ss2 = C13SS.LIZ;
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("[Pause][TaskManager][WaitingList][");
                        sbLIZ2.append(str);
                        sbLIZ2.append(']');
                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                        c13ss2.getClass();
                        C13SS.LIZ("JKL", strLIZIZ2);
                        interfaceC20001313Nr2.pause(false);
                        c20001113Np.LJ.remove(interfaceC20001313Nr2);
                        return;
                    }
                }
                return;
            }
            for (InterfaceC20001313Nr interfaceC20001313Nr3 : c20001113Np.LJFF) {
                if (Intrinsics.LJFF(interfaceC20001313Nr3.getId(), str)) {
                    C13SS c13ss3 = C13SS.LIZ;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("[Pause][TaskManager][WaitingList][");
                    sbLIZ3.append(str);
                    sbLIZ3.append(']');
                    String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
                    c13ss3.getClass();
                    C13SS.LIZ("JKL", strLIZIZ3);
                    interfaceC20001313Nr3.pause(false);
                    c20001113Np.LJFF.remove(interfaceC20001313Nr3);
                    return;
                }
            }
        }
    }

    public final void LJ(Effect effect, C13NY c13ny) {
        boolean zLJI = MethodIDManager.LJI(137867);
        LJIILLIIL().LIZLLL(effect, false, false, false, false, c13ny, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final C13MA<EffectChannelResponse> LIZJ(final boolean z, final C13MA<EffectChannelResponse> c13ma, final boolean z2) {
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService;
        if (z2) {
            iCKResourceVEPluginStatusService = null;
        } else {
            iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null);
        }
        if (z && iCKResourceVEPluginStatusService != null) {
            if (iCKResourceVEPluginStatusService.LIZIZ()) {
                if (c13ma != null) {
                    c13ma.onFail(null, new C1662010tLr(10031, new VEPluginNotLoadedExceptionInCKResources("createFetchEffectListListener")));
                }
                return new C13MA<EffectChannelResponse>() { // from class: X.13ME
                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void onSuccess(EffectChannelResponse effectChannelResponse) {
                    }

                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void preProcess(EffectChannelResponse effectChannelResponse) {
                    }

                    @Override // X.C13MA
                    public final /* bridge */ /* synthetic */ void onFail(EffectChannelResponse effectChannelResponse, C1662010tLr c1662010tLr) {
                    }
                };
            }
            iCKResourceVEPluginStatusService.LIZ();
        }
        return new C13MA<EffectChannelResponse>() { // from class: X.13MC
            @Override // X.C13MA
            public final void onSuccess(EffectChannelResponse effectChannelResponse) {
                final EffectChannelResponse effectChannelResponse2 = effectChannelResponse;
                ((C194402113w) this.LIZ.LJI.getValue()).LIZ = effectChannelResponse2;
                if (z) {
                    C13OY c13oy = this.LIZ;
                    List<Effect> all_category_effects = effectChannelResponse2.getAll_category_effects();
                    c13oy.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Effect effect : all_category_effects) {
                        C13MG c13mg = c13oy.LIZ.LJJJI;
                        String strExpectedMd5 = EffectKt.expectedMd5(effect);
                        c13mg.getClass();
                        if (!C13MG.LIZLLL(strExpectedMd5)) {
                            arrayList.add(effect);
                        }
                    }
                    final C13OY c13oy2 = this.LIZ;
                    final C13MA<EffectChannelResponse> c13ma2 = c13ma;
                    c13oy2.LJIILLIIL().LJFF(arrayList, null, new C13M4<List<? extends Effect>>() { // from class: X.13M3
                        public String LIZ;

                        @Override // X.C13M4
                        public final void onFinally() {
                            String str = this.LIZ;
                            if (str != null) {
                                C13OY c13oy3 = c13oy2;
                                EffectChannelResponse effectChannelResponse3 = effectChannelResponse2;
                                C13RD c13rd = c13oy3.LIZ;
                                InterfaceC20004513Ox interfaceC20004513Ox = c13rd.LJJIFFI;
                                if (interfaceC20004513Ox != null) {
                                    interfaceC20004513Ox.LJIIJ(C13OQ.LJIILLIIL(c13rd, effectChannelResponse3.getPanel()), str, "");
                                }
                            }
                        }

                        @Override // X.C13M4
                        public final void onStart() {
                            String strLJIILLIIL = C13OQ.LJIILLIIL(c13oy2.LIZ, effectChannelResponse2.getPanel());
                            InterfaceC20004513Ox interfaceC20004513Ox = c13oy2.LIZ.LJJIFFI;
                            this.LIZ = interfaceC20004513Ox != null ? interfaceC20004513Ox.LJFF(strLJIILLIIL) : null;
                            InterfaceC20004513Ox interfaceC20004513Ox2 = c13oy2.LIZ.LJJIFFI;
                            if (interfaceC20004513Ox2 != null) {
                                interfaceC20004513Ox2.remove(strLJIILLIIL);
                            }
                        }

                        @Override // X.C13MA
                        public final void onSuccess(Object obj) {
                            List<? extends Effect> list = (List) obj;
                            EffectChannelResponse effectChannelResponse3 = effectChannelResponse2;
                            effectChannelResponse3.setAll_category_effects(list);
                            for (EffectCategoryResponse effectCategoryResponse : effectChannelResponse3.getCategory_responses()) {
                                ArrayList arrayList2 = new ArrayList();
                                List<Effect> total_effects = effectCategoryResponse.getTotal_effects();
                                if (total_effects != null) {
                                    for (Effect effect2 : total_effects) {
                                        if (list.contains(effect2)) {
                                            arrayList2.add(effect2);
                                        }
                                    }
                                }
                                effectCategoryResponse.setTotal_effects(arrayList2);
                            }
                            C13MA<EffectChannelResponse> c13ma3 = c13ma2;
                            if (c13ma3 != null) {
                                c13ma3.onSuccess(effectChannelResponse3);
                            }
                        }

                        @Override // X.C13MA
                        public final /* bridge */ /* synthetic */ void preProcess(Object obj) {
                        }

                        @Override // X.C13MA
                        public final void onFail(Object obj, C1662010tLr c1662010tLr) {
                            C13MA<EffectChannelResponse> c13ma3 = c13ma2;
                            if (c13ma3 != null) {
                                c13ma3.onFail(null, c1662010tLr);
                            }
                        }
                    }, z2);
                    return;
                }
                C13MA<EffectChannelResponse> c13ma3 = c13ma;
                if (c13ma3 != null) {
                    c13ma3.onSuccess(effectChannelResponse2);
                }
            }

            @Override // X.C13MA
            public final void preProcess(EffectChannelResponse effectChannelResponse) {
                C13MA<EffectChannelResponse> c13ma2 = c13ma;
                if (c13ma2 != null) {
                    c13ma2.preProcess(effectChannelResponse);
                }
            }

            @Override // X.C13MA
            public final void onFail(EffectChannelResponse effectChannelResponse, C1662010tLr c1662010tLr) {
                C13MA<EffectChannelResponse> c13ma2 = c13ma;
                if (c13ma2 != null) {
                    c13ma2.onFail(effectChannelResponse, c1662010tLr);
                }
            }
        };
    }

    public final void LJFF(EffectQRCode effectQRCode, final C13MA<Effect> c13ma, boolean z) {
        final AwS81S0210000_30 awS81S0210000_30 = new AwS81S0210000_30(this, c13ma, z, 1);
        C13MA<Effect> c13ma2 = new C13MA<Effect>() { // from class: X.13MF
            @Override // X.C13MA
            public final void onSuccess(Effect effect) {
                awS81S0210000_30.invoke(effect);
            }

            @Override // X.C13MA
            public final /* bridge */ /* synthetic */ void preProcess(Effect effect) {
            }

            @Override // X.C13MA
            public final void onFail(Effect effect, C1662010tLr c1662010tLr) {
                C13MA<Effect> c13ma3 = c13ma;
                if (c13ma3 != null) {
                    c13ma3.onFail(effect, c1662010tLr);
                }
            }
        };
        C20002413Oc c20002413OcLJIILL = LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma2);
        C20002713Of c20002713Of = new C20002713Of(c20002413OcLJIILL.LIZ, effectQRCode, strLIZ);
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c20002713Of);
        }
    }

    public final void LJIIIIZZ(ArrayList<String> arrayList, Map<String, String> map, C13MA<EffectListResponse> c13ma) {
        boolean zLJI = MethodIDManager.LJI(202044);
        C20000613Nk c20000613NkLJIILLIIL = LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c20000613NkLJIILLIIL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C13RD c13rd = c20000613NkLJIILLIIL.LIZ;
        C20001113Np c20001113Np = c13rd.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(new C20001913Nx(c13rd, arrayList, strLIZ, map, true, c20000613NkLJIILLIIL.LIZJ, false));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIIJ(String str, Map<String, String> map, C13MA<FetchFavoriteListResponse> c13ma) {
        boolean zLJI = MethodIDManager.LJI(202047);
        C13P1 c13p1 = (C13P1) this.LIZLLL.getValue();
        c13p1.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c13p1.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        m1 m1Var = new m1(c13p1.LIZ, str, strLIZ, map);
        C20001113Np c20001113Np = c13p1.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(m1Var);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJJ(Effect effect, boolean z, boolean z2) {
        String str;
        C13NY c13ny;
        C20000613Nk c20000613NkLJIILLIIL = LJIILLIIL();
        c20000613NkLJIILLIIL.getClass();
        String strExpectedMd5 = EffectKt.expectedMd5(effect);
        if (!C504670Jqj.LIZIZ(strExpectedMd5) && (str = c20000613NkLJIILLIIL.LIZIZ.get(strExpectedMd5)) != null) {
            C13MA c13maLIZ = c20000613NkLJIILLIIL.LIZ.LJJJIL.LIZ(str);
            if (c13maLIZ instanceof C13NY) {
                c13ny = (C13NY) c13maLIZ;
            } else {
                c13ny = null;
            }
            c20000613NkLJIILLIIL.LIZLLL(effect, false, z, z2, true, c13ny, false);
        }
    }

    public final void LJII(String str, boolean z, Map<String, String> map, C13MA<EffectChannelResponse> c13ma) {
        boolean zLJI = MethodIDManager.LJI(202043);
        C13MA<EffectChannelResponse> c13maLIZJ = LIZJ(z, c13ma, false);
        if (!C504670Jqj.LIZIZ(str)) {
            LJIILL().LIZJ(str, false, map, c13maLIZJ);
        } else {
            LJIILL().LIZJ("default", false, map, c13maLIZJ);
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIJJLI(String str, List list, boolean z, C13MA c13ma) {
        C13P1 c13p1 = (C13P1) this.LIZLLL.getValue();
        c13p1.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c13p1.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        C20003713Op c20003713Op = new C20003713Op(c13p1.LIZ, str, strLIZ, list, z);
        C20001113Np c20001113Np = c13p1.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c20003713Op);
        }
    }

    public final void LJI(Effect effect, boolean z, boolean z2, boolean z3, C13NY c13ny) {
        boolean zLJI = MethodIDManager.LJI(137960);
        LJIILLIIL().LIZLLL(effect, false, z, z2, z3, c13ny, false);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIIIZ(List<String> list, boolean z, Map<String, String> map, final C13MA<List<Effect>> c13ma, final boolean z2) {
        ICKResourceVEPluginStatusService iCKResourceVEPluginStatusService;
        if (z) {
            if (!z2 && (iCKResourceVEPluginStatusService = (ICKResourceVEPluginStatusService) PluggableExtentionKt.pluggableSpi$default(ICKResourceVEPluginStatusService.class, false, false, false, 14, null)) != null) {
                if (iCKResourceVEPluginStatusService.LIZIZ()) {
                    if (c13ma != null) {
                        c13ma.onFail(null, new C1662010tLr(10031, new VEPluginNotLoadedExceptionInCKResources("fetchEffectList")));
                        return;
                    }
                    return;
                }
                iCKResourceVEPluginStatusService.LIZ();
            }
            LJIILLIIL().LJI(list, map, new C13MA<List<? extends Effect>>() { // from class: X.13MD
                @Override // X.C13MA
                public final void onSuccess(List<? extends Effect> list2) {
                    this.LIZ.LJIILLIIL().LJFF(list2, null, c13ma, z2);
                }

                @Override // X.C13MA
                public final /* bridge */ /* synthetic */ void preProcess(List<? extends Effect> list2) {
                }

                @Override // X.C13MA
                public final void onFail(List<? extends Effect> list2, C1662010tLr c1662010tLr) {
                    C13MA<List<Effect>> c13ma2 = c13ma;
                    if (c13ma2 != null) {
                        c13ma2.onFail(list2, c1662010tLr);
                    }
                }
            });
            return;
        }
        LJIILLIIL().LJI(list, map, c13ma);
    }

    public final void LJJI(final String str, final List<String> list, final boolean z, final long j, final Map<String, String> map, C13MA c13ma) {
        C20002413Oc c20002413OcLJIILL = LJIILL();
        c20002413OcLJIILL.getClass();
        final String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        final C13RD c13rd = c20002413OcLJIILL.LIZ;
        C13OD c13od = new C13OD(c13rd, str, strLIZ, list, z, j, map) { // from class: X.13Ob
            public final C13RD LIZ;
            public final String LIZIZ;
            public final List<String> LIZJ;
            public final boolean LIZLLL;
            public final long LJ;
            public final Map<String, String> LJFF;

            @Override // X.C13OD
            public final int getFailCode() {
                return 10002;
            }

            @Override // X.C13OD
            public final C0XSU buildRequest() {
                HashMap map2 = new HashMap();
                map2.putAll(C13RE.LIZ(this.LIZ, true));
                map2.put("panel", this.LIZIZ);
                map2.put("effect_ids", this.LIZJ);
                map2.put("type", Integer.valueOf(this.LIZLLL ? 1 : 0));
                map2.put("expiration_time", Long.valueOf(this.LJ));
                Map<String, String> map3 = this.LJFF;
                if (map3 != null) {
                    map2.putAll(map3);
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(this.LIZ.LJJIIJZLJL);
                this.LIZ.getClass();
                sbLIZ.append("/effect/api");
                sbLIZ.append("/effect/user/use");
                return new C0XSU(C2188811AlT.LIZIZ(sbLIZ), null, C0XSV.POST, map2, "application/json", false, null, null, 970);
            }

            @Override // X.C13OD
            public final int getRetryCount() {
                return this.LIZ.LJIILL;
            }

            @Override // X.C13OD
            public final C13OE parseResponse(C13R7 c13r7, String str2) {
                return (C13OE) c13r7.LIZ.convertJsonToObj(str2, UpdateUseEffectResponse.class);
            }

            @Override // X.C13OD
            public final void onFailure(String str2, String str3, C1662010tLr c1662010tLr) {
                C13SS c13ss = C13SS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Failed: ");
                sbLIZ.append(c1662010tLr);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c13ss.getClass();
                C13SS.LIZIZ("UpdateUsedEffectTask", strLIZIZ, null);
                c1662010tLr.LIZ(str2, this.LIZ.LJJIIJZLJL, str3);
                super.onFailure(str2, str3, c1662010tLr);
            }

            {
                super(c13rd.LJIJJ, c13rd.LJIJI, c13rd.LJJJIL, strLIZ, null);
                this.LIZ = c13rd;
                this.LIZIZ = str;
                this.LIZJ = list;
                this.LIZLLL = z;
                this.LJ = j;
                this.LJFF = map;
            }
        };
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13od);
        }
    }

    public final void LJIIJJI(String str, boolean z, String str2, int i, int i2, int i3, Map<String, String> map, C13MA<PanelInfoModel> c13ma) {
        boolean zLJI = MethodIDManager.LJI(202049);
        LJIILL().LJ(str, z, str2, i, i2, false, i3, map, c13ma);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIIL(String str, boolean z, String str2, int i, int i2, boolean z2, Map<String, String> map, C13MA<PanelInfoModel> c13ma) {
        InterfaceC20001313Nr c13ow;
        C20002413Oc c20002413OcLJIILL = LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        if (z2) {
            c13ow = new C20002213Oa(c20002413OcLJIILL.LIZ, str, strLIZ, z, str2, i, i2);
        } else {
            c13ow = new C13OW(c20002413OcLJIILL.LIZ, str, strLIZ, z, str2, i, i2, map);
        }
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13ow);
        }
    }

    public final void LIZLLL(String str, String str2, int i, int i2, int i3, String str3, int i4, Map<String, String> map, C13MA<CategoryPageModel> c13ma) {
        boolean zLJI = MethodIDManager.LJI(202039);
        LJIILL().LIZ(str, str2, i, i2, i3, str3, false, i4, map, c13ma);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    public final void LJIILIIL(String str, String str2, int i, int i2, int i3, String str3, boolean z, Map<String, String> map, C13MA<PanelInfoModel> c13ma) {
        InterfaceC20001313Nr c13ox;
        C20002413Oc c20002413OcLJIILL = LJIILL();
        c20002413OcLJIILL.getClass();
        String strLIZ = C1528550psb.LIZ();
        if (c13ma != null) {
            c20002413OcLJIILL.LIZ.LJJJIL.LIZIZ(strLIZ, c13ma);
        }
        if (z) {
            c13ox = new C13OZ(c20002413OcLJIILL.LIZ, str, strLIZ, str2, i, i2, i3, str3);
        } else {
            c13ox = new C13OX(i, i2, i3, c20002413OcLJIILL.LIZ, str, strLIZ, str2, str3, map);
        }
        C20001113Np c20001113Np = c20002413OcLJIILL.LIZ.LJJIIJ;
        if (c20001113Np != null) {
            c20001113Np.LIZIZ(c13ox);
        }
    }
}
