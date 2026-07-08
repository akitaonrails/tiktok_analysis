package X;

import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.poi.detail.container.newarchi.cache.PoiDetailDataCacheExp;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS167S1100000_18;
import kotlin.jvm.internal.AwS262S0300000_18;
import kotlin.jvm.internal.AwS419S0200000_18;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185530gxL extends AbstractC1181640gr4 implements InterfaceC1181500gqq, InterfaceC1181380gqe {
    public String LLILLJJLI;
    public String LLILLL;
    public C1185690gxb LLILZ;
    public final C1185520gxK LLILZIL = new C1185520gxK(0);

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onAttach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onCreate() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDetach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onHiddenChanged(boolean z) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onPause() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onResume() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStart() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStop() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroy() {
        C1185520gxK c1185520gxK = this.LLILZIL;
        C19487011Lw c19487011Lw = c1185520gxK.LIZJ;
        if (c19487011Lw != null) {
            c19487011Lw.dispose();
        }
        c1185520gxK.LIZJ = null;
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(final C1180620gpQ c1180620gpQ, String str) {
        if (this.LLILLJJLI != null) {
            if (C13LP.LJJJJ(this.LLILLJJLI, PoiDetailDataCacheExp.LIZ().industries)) {
                final C1185520gxK c1185520gxK = this.LLILZIL;
                final C1185690gxb c1185690gxb = this.LLILZ;
                final String str2 = this.LLILLL;
                c1185520gxK.getClass();
                if (c1180620gpQ != null && str2 != null) {
                    Boolean bool = (Boolean) ((Map) C07NQ.LIZIZ.getValue()).get("chunk_data_diff_report");
                    if (bool != null && !bool.booleanValue()) {
                        return;
                    }
                    c1185520gxK.LIZJ = AbstractC19486711Lt.LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0gxM
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                            List<C1180920gpu> listLIZ;
                            InterfaceC1185760gxi next;
                            String strLIZIZ;
                            C1181190gqL c1181190gqL = c1180620gpQ.LL;
                            if (c1181190gqL == null || (listLIZ = c1181190gqL.LIZ()) == null) {
                                return;
                            }
                            C1185520gxK c1185520gxK2 = c1185520gxK;
                            String str3 = str2;
                            C1185690gxb c1185690gxb2 = c1185690gxb;
                            C1180620gpQ c1180620gpQ2 = c1180620gpQ;
                            for (C1180920gpu c1180920gpu : listLIZ) {
                                if (!c1185520gxK2.LIZIZ.contains(c1180920gpu.LIZ)) {
                                    Iterator<InterfaceC1185760gxi> it2 = c1185520gxK2.LIZ.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            next = it2.next();
                                            if (next.LIZ(c1180920gpu.LIZ, c1180920gpu.LIZLLL)) {
                                                break;
                                            }
                                        } else {
                                            next = null;
                                            break;
                                        }
                                    }
                                    InterfaceC1185760gxi interfaceC1185760gxi = next;
                                    if (interfaceC1185760gxi != null) {
                                        Map<String, String> mapLIZIZ = interfaceC1185760gxi.LIZIZ(c1180920gpu.LIZLLL);
                                        if (mapLIZIZ.isEmpty()) {
                                            continue;
                                        } else {
                                            c1185520gxK2.LIZIZ.add(c1180920gpu.LIZ);
                                            C1185690gxb c1185690gxbLIZIZ = C1185470gxF.LIZIZ(str3);
                                            if (c1185690gxbLIZIZ != null) {
                                                synchronized (c1185690gxbLIZIZ) {
                                                    try {
                                                        Map<String, Map<String, String>> map = c1185690gxbLIZIZ.LIZLLL;
                                                        if (map == null) {
                                                            c1185690gxbLIZIZ.LIZLLL = C2097608Jq.LJIIJ(new Pair(c1180920gpu.LIZ, new LinkedHashMap(mapLIZIZ)));
                                                        } else {
                                                            map.put(c1180920gpu.LIZ, new LinkedHashMap(mapLIZIZ));
                                                        }
                                                    } catch (Throwable th) {
                                                        TryCatchGuardChecker.doCheck(th);
                                                        throw th;
                                                    }
                                                }
                                            }
                                            Map<String, String> mapLIZ = c1185520gxK2.LIZ(c1185690gxb2, c1180920gpu.LIZ);
                                            if (c1185690gxb2 == null) {
                                                strLIZIZ = "lastCacheEntry is null";
                                            } else if (mapLIZ != null) {
                                                ArrayList arrayList = new ArrayList();
                                                ArrayList arrayList2 = new ArrayList();
                                                for (Map.Entry<String, String> entry : mapLIZIZ.entrySet()) {
                                                    String key = entry.getKey();
                                                    if (Intrinsics.LJFF(mapLIZ.get(key), entry.getValue())) {
                                                        arrayList.add(key);
                                                    } else {
                                                        arrayList2.add(key);
                                                    }
                                                }
                                                for (Object obj : mapLIZ.keySet()) {
                                                    if (!mapLIZIZ.containsKey(obj)) {
                                                        arrayList2.add(obj);
                                                    }
                                                }
                                                new AwS419S0200000_18(c1185690gxb2, c1180620gpQ2, 146);
                                                new AwS262S0300000_18(c1180920gpu, (C1180920gpu) arrayList, (List<String>) arrayList2, (List<String>) 21);
                                                String str4 = c1180920gpu.LIZ;
                                                if (C1185550gxN.LIZ()) {
                                                    C1185040gwY c1185040gwY = C1185040gwY.LIZ;
                                                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                                                    linkedHashMap.put("poi_id", str3);
                                                    linkedHashMap.put("action_type", "ttls_rd_poi_detail_cache_diff");
                                                    linkedHashMap.put("instance_id", str4);
                                                    linkedHashMap.put("same", arrayList.toString());
                                                    linkedHashMap.put("diff", arrayList2.toString());
                                                    linkedHashMap.put("has_diff", arrayList2.isEmpty() ? CardStruct.IStatusCode.DEFAULT : "1");
                                                    c1185040gwY.getClass();
                                                    C1185040gwY.LIZIZ("ttls_rd_poi_detail_cache_track", linkedHashMap, null);
                                                }
                                            } else {
                                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                                sbLIZ.append("scope extras is null for instanceId=");
                                                sbLIZ.append(c1180920gpu.LIZ);
                                                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                                            }
                                            new AwS167S1100000_18(c1180920gpu, strLIZIZ, 27);
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }).LJIJJLI(C11S5.LIZ()).LJIJI(new C09JN() { // from class: X.00JQ
                        @Override // X.C09JN
                        public final void accept(Object obj) {
                            C1C7U.LIZ("PoiDetailCacheDiffCalculator@5dac.calculateDiff$3");
                            new C5182020e((Throwable) obj, 510);
                            C1C7U.LIZIZ("PoiDetailCacheDiffCalculator@5dac.calculateDiff$3");
                        }
                    }, new InterfaceC781210Ukh() { // from class: X.0gy1
                        @Override // X.InterfaceC781210Ukh
                        public final void run() {
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0085 A[Catch: Exception -> 0x009b, TryCatch #0 {Exception -> 0x009b, blocks: (B:27:0x003b, B:29:0x0041, B:31:0x0047, B:32:0x004b, B:42:0x0069, B:44:0x006d, B:46:0x0071, B:48:0x007b, B:49:0x007f, B:51:0x0085, B:52:0x008d, B:38:0x0058, B:40:0x0063), top: B:67:0x003b }] */
    @Override // X.InterfaceC1181380gqe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void up(com.ss.android.ugc.aweme.slash.data.SlashApiResponse r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185530gxL.up(com.ss.android.ugc.aweme.slash.data.SlashApiResponse, java.lang.String):void");
    }
}
