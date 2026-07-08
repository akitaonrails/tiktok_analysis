package X;

import com.bytedance.scene.Scene;
import com.google.gson.n;
import com.ss.android.ugc.aweme.arch.widgets.base.NextLiveData;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AwS28S0000100_10;
import kotlin.jvm.internal.AwS47S0100100_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Qgg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C676800Qgg implements InterfaceC677820QiK {
    public final MixShopSearchBizVM LIZ;
    public final C675270QeD LIZIZ;
    public final EnumC675160Qe2 LIZJ;
    public final MixPageViewModel LIZLLL;
    public long LJ = System.currentTimeMillis();
    public String LJFF;

    @Override // X.InterfaceC677820QiK
    public final void onFailed(Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Performance monitoring failed: ");
        if (th != null) {
            message = th.getMessage();
        } else {
            message = null;
        }
        sbLIZ.append(message);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC677820QiK
    public final void LJ(int i, n nVar) {
        C675150Qe1 c675150Qe1 = (C675150Qe1) this.LIZIZ;
        C676810Qgh c676810Qgh = C676810Qgh.LIZ;
        int iHashCode = c675150Qe1.LJFF.hashCode();
        c676810Qgh.getClass();
        C676820Qgi c676820QgiLIZJ = C676810Qgh.LIZJ(iHashCode);
        if (c676820QgiLIZJ != null) {
            c676820QgiLIZJ.LJFF = i + 1;
        }
    }

    @Override // X.InterfaceC677820QiK
    public final void LJI(int i, List<String> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("mix_v_search_first_screen_render_chunkIndex{");
        sbLIZ.append(i);
        sbLIZ.append('}');
        C678710Qjl.LIZ(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZ(int i, n nVar, boolean z) {
        C678710Qjl.LIZ("ec_search_mix_parse_data");
    }

    public C676800Qgg(MixShopSearchBizVM mixShopSearchBizVM, C675270QeD c675270QeD, EnumC675160Qe2 enumC675160Qe2, MixPageViewModel mixPageViewModel) {
        this.LIZ = mixShopSearchBizVM;
        this.LIZIZ = c675270QeD;
        this.LIZJ = enumC675160Qe2;
        this.LIZLLL = mixPageViewModel;
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZIZ(n nVar, C1422405hW c1422405hW, int i, boolean z) {
        C678710Qjl.LIZIZ("ec_search_mix_parse_data");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    @Override // X.InterfaceC677820QiK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(com.google.gson.n r29, X.C1422405hW r30, int r31, boolean r32, long r33, long r35) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 992
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C676800Qgg.LIZJ(com.google.gson.n, X.05hW, int, boolean, long, long):void");
    }

    @Override // X.InterfaceC677820QiK
    public final void LIZLLL(int i, String str, Integer num, long j, long j2, long j3) throws JSONException {
        NextLiveData<EnumC669690QOp> nextLiveData;
        C675150Qe1 c675150Qe1 = (C675150Qe1) this.LIZIZ;
        if (str != null) {
            C676810Qgh c676810Qgh = C676810Qgh.LIZ;
            int iHashCode = c675150Qe1.LJFF.hashCode();
            c676810Qgh.getClass();
            C676820Qgi c676820QgiLIZJ = C676810Qgh.LIZJ(iHashCode);
            if (c676820QgiLIZJ != null) {
                Long lValueOf = Long.valueOf(j - j2);
                ConcurrentHashMap<String, Long> concurrentHashMap = c676820QgiLIZJ.LJII;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_lynx_render");
                concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), lValueOf);
                c676820QgiLIZJ.LIZ(j, str);
            }
        }
        Integer numValueOf = null;
        if (num != null) {
            if (num.intValue() == 1) {
                this.LIZ.LLJLIL = 2;
                C676810Qgh c676810Qgh2 = C676810Qgh.LIZ;
                int iHashCode2 = c675150Qe1.LJFF.hashCode();
                c676810Qgh2.getClass();
                C676820Qgi c676820QgiLIZJ2 = C676810Qgh.LIZJ(iHashCode2);
                if (c676820QgiLIZJ2 != null) {
                    c676820QgiLIZJ2.LJIIJ = j - c676820QgiLIZJ2.LIZLLL;
                }
                C671610QVz.LIZ(C0QW1.MEANINGFUL, Integer.valueOf(c675150Qe1.LJFF.hashCode()), new AwS28S0000100_10(j, 1));
                if (this.LIZJ == EnumC675160Qe2.PHOTO_SEARCH) {
                    C676320Qfu.LIZJ(new AwS47S0100100_10(j, this, 5));
                    C676320Qfu.LIZIZ();
                }
                int i2 = C675170Qe3.LIZ[this.LIZJ.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        numValueOf = 1804085333;
                    }
                } else {
                    numValueOf = Integer.valueOf(c675150Qe1.LJFF.hashCode());
                }
                C676810Qgh.LIZ(numValueOf, this.LJFF, this.LIZ.vQ2());
                MixPageViewModel mixPageViewModel = this.LIZLLL;
                if (mixPageViewModel != null) {
                    C676810Qgh.LIZIZ(j, mixPageViewModel.LLILLJJLI);
                }
            } else if (num.intValue() == 2) {
                this.LIZ.LLJLIL = 3;
                C676810Qgh c676810Qgh3 = C676810Qgh.LIZ;
                int iHashCode3 = c675150Qe1.LJFF.hashCode();
                c676810Qgh3.getClass();
                ConcurrentHashMap<Integer, C676820Qgi> concurrentHashMap2 = C676810Qgh.LJ;
                C676820Qgi c676820Qgi = concurrentHashMap2.get(Integer.valueOf(iHashCode3));
                if (c676820Qgi != null || (c676820Qgi = C676810Qgh.LIZJ) != null) {
                    c676820Qgi.LJIIJJI = j - c676820Qgi.LIZLLL;
                }
                Integer numValueOf2 = Integer.valueOf(c675150Qe1.LJFF.hashCode());
                if (str == null) {
                    str = "";
                }
                HashMap<String, Integer> mapVQ2 = this.LIZ.vQ2();
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("MixPerfMonitor end key=");
                sbLIZ2.append(numValueOf2);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                if (numValueOf2 != null) {
                    numValueOf2.intValue();
                    C676820Qgi c676820QgiRemove = concurrentHashMap2.remove(numValueOf2);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("MixPerfMonitor end event=");
                    sbLIZ3.append(c676820QgiRemove);
                    C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
                    if (c676820QgiRemove != null) {
                        C2341109Fh.LIZ("MixPerfMonitor end report");
                        C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Scene.SCENE_SERVICE, c676820QgiRemove.LIZ);
                        jSONObject.put("page_name", c676820QgiRemove.LIZJ);
                        for (Map.Entry<String, Integer> entry : c676820QgiRemove.LJ.entrySet()) {
                            String key = entry.getKey();
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(str);
                            sbLIZ4.append("_index");
                            if (Intrinsics.LJFF(key, C2188811AlT.LIZIZ(sbLIZ4))) {
                                jSONObject.put(entry.getKey(), entry.getValue().intValue());
                            }
                        }
                        jSONObject.put("chunk_count", c676820QgiRemove.LJFF);
                        for (Map.Entry<String, Long> entry2 : c676820QgiRemove.LJI.entrySet()) {
                            String key2 = entry2.getKey();
                            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                            sbLIZ5.append(str);
                            sbLIZ5.append("_cost");
                            if (Intrinsics.LJFF(key2, C2188811AlT.LIZIZ(sbLIZ5))) {
                                jSONObject.put(entry2.getKey(), entry2.getValue().longValue());
                            }
                        }
                        for (Map.Entry<String, Long> entry3 : c676820QgiRemove.LJII.entrySet()) {
                            String key3 = entry3.getKey();
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append(str);
                            sbLIZ6.append("_lynx_render");
                            if (Intrinsics.LJFF(key3, C2188811AlT.LIZIZ(sbLIZ6))) {
                                jSONObject.put(entry3.getKey(), entry3.getValue().longValue());
                            }
                        }
                        for (Map.Entry<String, Long> entry4 : c676820QgiRemove.LJIIIIZZ.entrySet()) {
                            String key4 = entry4.getKey();
                            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                            sbLIZ7.append(str);
                            sbLIZ7.append("_render");
                            if (Intrinsics.LJFF(key4, C2188811AlT.LIZIZ(sbLIZ7))) {
                                jSONObject.put(entry4.getKey(), entry4.getValue().longValue());
                            }
                        }
                        jSONObject.put("final_chunk_total_cost", c676820QgiRemove.LJIIJJI);
                        jSONObject.put("root_enter_from_type", c676820QgiRemove.LJIIL);
                        jSONObject.put("enter_method", c676820QgiRemove.LJIILIIL);
                        jSONObject.put("client_request_id", c676820QgiRemove.LJIILJJIL);
                        jSONObject.put("search_id", c676820QgiRemove.LJIILL);
                        jSONObject.put("rd_mixed_page", c676820QgiRemove.LJIILLIIL);
                        jSONObject.put("is_re_search", c676820QgiRemove.LJIIZILJ);
                        Map<String, Long> map = c676820QgiRemove.LJIJ;
                        if (map != null) {
                            for (Map.Entry<String, Long> entry5 : map.entrySet()) {
                                jSONObject.put(entry5.getKey(), entry5.getValue().longValue());
                            }
                        }
                        jSONObject.put("performance_info", c676820QgiRemove.LJIJI);
                        c676820QgiRemove.LJIJI = "";
                        jSONObject.put("performance_info_server", c676820QgiRemove.LJIJJ);
                        c676820QgiRemove.LJIJJ = "";
                        Map<String, Long> map2 = c676820QgiRemove.LJIJJLI;
                        if (map2 != null) {
                            for (Map.Entry<String, Long> entry6 : map2.entrySet()) {
                                jSONObject.put(entry6.getKey(), entry6.getValue().longValue());
                            }
                        }
                        Map<String, Long> map3 = c676820QgiRemove.LJIL;
                        if (map3 != null) {
                            for (Map.Entry<String, Long> entry7 : map3.entrySet()) {
                                jSONObject.put(entry7.getKey(), entry7.getValue().longValue());
                            }
                        }
                        for (Map.Entry<String, Integer> entry8 : mapVQ2.entrySet()) {
                            jSONObject.put(entry8.getKey(), entry8.getValue().intValue());
                        }
                        c1507790pL7.getClass();
                        C1507790pL7.LIZLLL("rd_tiktokec_search_trace", jSONObject);
                    }
                }
                C676810Qgh.LIZJ = null;
                MixPageViewModel mixPageViewModel2 = this.LIZLLL;
                if (mixPageViewModel2 != null && (nextLiveData = mixPageViewModel2.LLJILJILJ) != null) {
                    nextLiveData.postValue(EnumC669690QOp.RENDER_FINISH);
                }
            }
        }
        C678710Qjl.LIZJ("mix_v_search_first_screen_render_chunkIndex{" + i + '}');
    }

    @Override // X.InterfaceC677820QiK
    public final void LJFF(int i, String str, Integer num, long j, long j2, long j3) throws JSONException {
        Integer numValueOf;
        C675150Qe1 c675150Qe1 = (C675150Qe1) this.LIZIZ;
        if (str != null) {
            C676810Qgh c676810Qgh = C676810Qgh.LIZ;
            int iHashCode = c675150Qe1.LJFF.hashCode();
            c676810Qgh.getClass();
            C676820Qgi c676820QgiLIZJ = C676810Qgh.LIZJ(iHashCode);
            if (c676820QgiLIZJ != null) {
                Long lValueOf = Long.valueOf(j - j2);
                ConcurrentHashMap<String, Long> concurrentHashMap = c676820QgiLIZJ.LJII;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str);
                sbLIZ.append("_lynx_render");
                concurrentHashMap.put(C2188811AlT.LIZIZ(sbLIZ), lValueOf);
                c676820QgiLIZJ.LIZ(j, str);
                c676820QgiLIZJ.LJIIIZ = j - c676820QgiLIZJ.LIZLLL;
            }
        }
        if (num != null && num.intValue() == 1) {
            this.LIZ.LLJLIL = 2;
            C676810Qgh c676810Qgh2 = C676810Qgh.LIZ;
            int iHashCode2 = c675150Qe1.LJFF.hashCode();
            c676810Qgh2.getClass();
            C676820Qgi c676820QgiLIZJ2 = C676810Qgh.LIZJ(iHashCode2);
            if (c676820QgiLIZJ2 != null) {
                c676820QgiLIZJ2.LJIIJ = j - c676820QgiLIZJ2.LIZLLL;
            }
            C671610QVz.LIZ(C0QW1.MEANINGFUL, Integer.valueOf(c675150Qe1.LJFF.hashCode()), new AwS28S0000100_10(j, 0));
            if (this.LIZJ == EnumC675160Qe2.PHOTO_SEARCH) {
                C676320Qfu.LIZJ(new AwS47S0100100_10(j, this, 4));
                C676320Qfu.LIZIZ();
            }
            int i2 = C675170Qe3.LIZ[this.LIZJ.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    numValueOf = null;
                } else {
                    numValueOf = 1804085333;
                }
            } else {
                numValueOf = Integer.valueOf(c675150Qe1.LJFF.hashCode());
            }
            C676810Qgh.LIZ(numValueOf, this.LJFF, this.LIZ.vQ2());
            MixPageViewModel mixPageViewModel = this.LIZLLL;
            if (mixPageViewModel != null) {
                C676810Qgh.LIZIZ(j, mixPageViewModel.LLILLJJLI);
            }
        }
        C678710Qjl.LIZJ("mix_v_search_first_screen_render_chunkIndex{" + i + '}');
    }
}
