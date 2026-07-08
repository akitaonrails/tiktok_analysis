package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.page.ECMixMallPageDTO;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS11S0220000_4;
import kotlin.jvm.internal.AwS17S0120000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1771530wCV extends C09AY implements Function2<C1515820pY4<C1515870pY9<ECMixMallPageDTO>>, Throwable, Unit> {
    public final /* synthetic */ C094D<C1771660wCi> LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ ShopMallMixViewModel LLILZIL;
    public final /* synthetic */ C1771590wCb LLILZLL;
    public final /* synthetic */ long LLIZ;
    public final /* synthetic */ n LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1771530wCV(C094D<? super C1771660wCi> c094d, boolean z, boolean z2, boolean z3, ShopMallMixViewModel shopMallMixViewModel, C1771590wCb c1771590wCb, long j, n nVar) {
        super(2);
        this.LL = c094d;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = shopMallMixViewModel;
        this.LLILZLL = c1771590wCb;
        this.LLIZ = j;
        this.LLIZLLLIL = nVar;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [T, X.0ozq] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C1515820pY4<C1515870pY9<ECMixMallPageDTO>> c1515820pY4, Throwable th) {
        ?? r4;
        final C1515820pY4<C1515870pY9<ECMixMallPageDTO>> c1515820pY42 = c1515820pY4;
        Throwable th2 = th;
        new AwS11S0220000_4(this.LLILLJJLI, this.LLILLL, (boolean) c1515820pY42, (C1515820pY4<C1515870pY9<ECMixMallPageDTO>>) th2, (Throwable) 0);
        C034X.LIZIZ();
        final C013C c013c = new C013C();
        c013c.element = true;
        final C118300cf c118300cf = new C118300cf();
        final C259800zU c259800zU = new C259800zU();
        final C259800zU c259800zU2 = new C259800zU();
        C1494600ozq requestInfo = null;
        if (c1515820pY42 == null) {
            this.LL.LJIIIIZZ(new C1771660wCi(EnumC1771610wCd.FAIL, null, th2));
        } else {
            try {
                requestInfo = c1515820pY42.getRequestInfo();
                r4 = requestInfo;
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                r4 = requestInfo;
            }
            c259800zU.element = r4;
            new C1771820wCy(this.LLILLJJLI, this.LLILLL, c1515820pY42, r4);
            C034X.LIZIZ();
            final boolean z = this.LLILZ;
            final ShopMallMixViewModel shopMallMixViewModel = this.LLILZIL;
            final C1771590wCb c1771590wCb = this.LLILZLL;
            final C094D<C1771660wCi> c094d = this.LL;
            final boolean z2 = this.LLILLJJLI;
            final boolean z3 = this.LLILLL;
            final long j = this.LLIZ;
            final n nVar = this.LLIZLLLIL;
            c1515820pY42.LIZLLL(new C0POE<C1515870pY9<ECMixMallPageDTO>>() { // from class: X.0wCU
                @Override // X.C0POE
                public final void onComplete() throws JSONException {
                    c094d.LJIIIIZZ(new C1771660wCi(EnumC1771610wCd.COMPLETE, null, null));
                    C1515950pYH c1515950pYH = c259800zU2.element;
                    if (c1515950pYH != null) {
                        C259800zU<C1494600ozq<?>> c259800zU3 = c259800zU;
                        long j2 = j;
                        ShopMallMixViewModel shopMallMixViewModel2 = shopMallMixViewModel;
                        c1515950pYH.LJIIJ = true;
                        c1515950pYH.LJIILIIL = c259800zU3.element;
                        c1515950pYH.LJIILJJIL = Long.valueOf(j2);
                        c1515950pYH.LJIILLIIL = Boolean.valueOf(shopMallMixViewModel2.LLILLL.LJJJLIIL);
                        C1772750wET c1772750wET = shopMallMixViewModel2.LLILLL;
                        if (c1772750wET.LJJJJIZL) {
                            c1515950pYH.LJIILL = Long.valueOf(c1772750wET.LJJIJIL);
                        }
                    }
                    C1515940pYG.LIZJ(c1771590wCb.LJIIJJI, null);
                    c094d.LJIIJJI(null);
                }

                @Override // X.C0POE
                public final void onFailed(Throwable th4) throws JSONException {
                    c094d.LJIIIIZZ(new C1771660wCi(EnumC1771610wCd.FAIL, null, th4));
                    C1515950pYH c1515950pYH = c259800zU2.element;
                    if (c1515950pYH != null) {
                        C259800zU<C1494600ozq<?>> c259800zU3 = c259800zU;
                        long j2 = j;
                        ShopMallMixViewModel shopMallMixViewModel2 = shopMallMixViewModel;
                        c1515950pYH.LJIIJ = true;
                        c1515950pYH.LJIILIIL = c259800zU3.element;
                        c1515950pYH.LJIILJJIL = Long.valueOf(j2);
                        c1515950pYH.LJIILLIIL = Boolean.valueOf(shopMallMixViewModel2.LLILLL.LJJJLIIL);
                        C1772750wET c1772750wET = shopMallMixViewModel2.LLILLL;
                        if (c1772750wET.LJJJJIZL) {
                            c1515950pYH.LJIILL = Long.valueOf(c1772750wET.LJJIJIL);
                        }
                    }
                    C1515940pYG.LIZJ(c1771590wCb.LJIIJJI, null);
                    c094d.LJIIJJI(th4);
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r8v0, types: [T, X.0pYH, java.lang.Object] */
                @Override // X.C0POE
                public final void onNext(C1515870pY9<ECMixMallPageDTO> c1515870pY9) {
                    String str;
                    ConcurrentHashMap<String, C1515950pYH> concurrentHashMapPutIfAbsent;
                    ECMixMallPageDTO eCMixMallPageDTO;
                    ECMixMallPageDTO eCMixMallPageDTO2;
                    boolean z4;
                    List<C080U> listLIZIZ;
                    String str2;
                    C1515870pY9<ECMixMallPageDTO> c1515870pY92 = c1515870pY9;
                    C599820Nfo.LIZ.getClass();
                    C599820Nfo.LIZLLL();
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    String string = null;
                    JSONObject jSONObject = null;
                    if (c013c.element) {
                        new AwS17S0120000_26(z2, z3, (boolean) c259800zU, (C259800zU<C1494600ozq<?>>) 1);
                        C034X.LIZIZ();
                        if (c1515870pY92 != null) {
                            eCMixMallPageDTO2 = c1515870pY92.data;
                        } else {
                            eCMixMallPageDTO2 = null;
                        }
                        if (eCMixMallPageDTO2 != null && c1515870pY92.isCodeOK()) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z) {
                            C1772750wET c1772750wET = shopMallMixViewModel.LLILLL;
                            c1772750wET.LJJJJ = jCurrentTimeMillis;
                            c1772750wET.LJJJJI = Boolean.valueOf(z4);
                            if (!z4) {
                                shopMallMixViewModel.LLILLL.LIZIZ(null, false, false);
                            }
                        }
                        C1494600ozq<?> c1494600ozq = c259800zU.element;
                        if (c1494600ozq != null && (str2 = c1494600ozq.LJJIJ) != null) {
                            jSONObject = new JSONObject(str2);
                            C0XLG c0xlg = new C0XLG();
                            Iterator<String> itKeys = jSONObject.keys();
                            while (itKeys.hasNext()) {
                                String next = itKeys.next();
                                c0xlg.LIZ(next, jSONObject.optString(next));
                            }
                            listLIZIZ = c0xlg.LIZIZ();
                            String strOptString = jSONObject.optString("x-tt-logid");
                            if (strOptString != null && strOptString.length() > 0) {
                                c1771590wCb.LJIIL.put("log_id", strOptString);
                            }
                        } else {
                            listLIZIZ = null;
                        }
                        c1771590wCb.LJIIL.put("api_path", "api/v1/mall/homepage/bff/stream/get");
                        C23250099c.LIZLLL(c094d, C2126308Ur.LIZ, null, new C1771360wCE(z2, shopMallMixViewModel, z3, c259800zU, z4, c1771590wCb, c1515870pY92, jCurrentTimeMillis, j, z, jSONObject, listLIZIZ, nVar, null), 2);
                        string = null;
                        c013c.element = false;
                        c094d.LJIIIIZZ(new C1771660wCi(EnumC1771610wCd.FIRST_CHUNK, c1515870pY92, null));
                    } else {
                        c094d.LJIIIIZZ(new C1771660wCi(EnumC1771610wCd.SECOND_CHUNK, c1515870pY92, null));
                    }
                    Long l = c1771590wCb.LJIIJJI;
                    if (c1515870pY92 != null && (eCMixMallPageDTO = c1515870pY92.data) != null) {
                        str = eCMixMallPageDTO.chunkName;
                    } else {
                        str = string;
                    }
                    int i = c118300cf.element;
                    C0PQA c0pqaLIZIZ = c1515820pY42.LIZIZ();
                    if (l != null) {
                        l.longValue();
                        if (str != null && !C1515940pYG.LIZIZ.containsKey(l)) {
                            ConcurrentHashMap<Long, ConcurrentHashMap<String, C1515950pYH>> concurrentHashMap = C1515940pYG.LIZ;
                            ConcurrentHashMap<String, C1515950pYH> concurrentHashMap2 = concurrentHashMap.get(l);
                            if (concurrentHashMap2 == null && (concurrentHashMapPutIfAbsent = concurrentHashMap.putIfAbsent(l, (concurrentHashMap2 = new ConcurrentHashMap<>()))) != null) {
                                concurrentHashMap2 = concurrentHashMapPutIfAbsent;
                            }
                            ?? c1515950pYH = new C1515950pYH(l.longValue(), str, i, c0pqaLIZIZ);
                            concurrentHashMap2.put(str, c1515950pYH);
                            C1771590wCb c1771590wCb2 = c1771590wCb;
                            c1515950pYH.LJ = jCurrentTimeMillis;
                            Object obj = c1771590wCb2.LJIIL.get("log_id");
                            if (obj != null) {
                                string = obj.toString();
                            }
                            c1515950pYH.LJIIL = string;
                            c259800zU2.element = c1515950pYH;
                        }
                    }
                    c118300cf.element++;
                }
            });
        }
        return Unit.LIZ;
    }
}
