package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.lynx.OgcLynxPrefetchConfig;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxCache;
import com.ss.android.ugc.aweme.ogccampaign.OgcLynxPrefetchApi;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import njp.a;

/* JADX INFO: renamed from: X.01Lk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ogccampaign.OgcLynxPrefetcher$prefetch$2", f = "OgcLynxPrefetcher.kt", l = {90, 92}, m = "invokeSuspend")
public final class C318601Lk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ OgcLynxPrefetchConfig LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318601Lk(OgcLynxPrefetchConfig ogcLynxPrefetchConfig, String str, String str2, String str3, int i, InterfaceC1364105Vn<? super C318601Lk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = ogcLynxPrefetchConfig;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C318601Lk c318601Lk = new C318601Lk(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c318601Lk.LLILLJJLI = obj;
        return c318601Lk;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        C1C7U.LIZ("OgcLynxPrefetcher@171.prefetch$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C155000ia.LIZIZ(obj);
                        str = (String) obj;
                    } else {
                        C155000ia.LIZIZ(obj);
                        str = (String) obj;
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    C335801Sa.LIZ.getClass();
                    OgcLynxPrefetchApi ogcLynxPrefetchApi = (OgcLynxPrefetchApi) C335801Sa.LIZLLL.getValue();
                    if (ogcLynxPrefetchApi == null) {
                        String str2 = this.LLILZ;
                        String str3 = this.LLILZIL;
                        C01VP.LIZ.getClass();
                        C01VP.LIZIZ(0, str2, str3, "api_null");
                        Unit unit = Unit.LIZ;
                        C335801Sa.LIZJ.remove(this.LLILZ);
                        C1C7U.LIZIZ("OgcLynxPrefetcher@171.prefetch$2");
                        return unit;
                    }
                    Map<String, String> map = this.LLILLL.params;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!a0.LJJJIL(entry.getValue())) {
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                        }
                    }
                    String upperCase = this.LLILLL.method.toUpperCase(Locale.ROOT);
                    String str4 = this.LLILZLL;
                    if (Intrinsics.LJFF(upperCase, "POST")) {
                        this.LLILLJJLI = upperCase;
                        this.LL = 1;
                        obj = ogcLynxPrefetchApi.prefetchPost(str4, linkedHashMap, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("OgcLynxPrefetcher@171.prefetch$2");
                            return objLJFF;
                        }
                        str = (String) obj;
                    } else {
                        this.LLILLJJLI = upperCase;
                        this.LL = 2;
                        obj = ogcLynxPrefetchApi.prefetchGet(str4, linkedHashMap, this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("OgcLynxPrefetcher@171.prefetch$2");
                            return objLJFF;
                        }
                        str = (String) obj;
                    }
                }
                C335801Sa.LIZ.getClass();
                c098200Yq = new Pair(C2286608xc.LJ(C335801Sa.LIZ(str)), str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            String str5 = this.LLILZ;
            String str6 = this.LLILZIL;
            int i2 = this.LLIZ;
            if (C189200o6.m8isSuccessimpl(c098200Yq)) {
                Pair pair = (Pair) c098200Yq;
                int iIntValue = ((Number) pair.getFirst()).intValue();
                String str7 = (String) pair.getSecond();
                if (iIntValue == 0) {
                    C01VP.LIZ.getClass();
                    C01VP.LIZIZ(1, str5, str6, "");
                    OgcLynxCache.LIZ.LJI(i2, str5, str7, "psp");
                } else {
                    C01VP c01vp = C01VP.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("status_code=");
                    sbLIZ.append(iIntValue);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    c01vp.getClass();
                    C01VP.LIZIZ(0, str5, str6, strLIZIZ);
                }
            }
            String str8 = this.LLILZ;
            String str9 = this.LLILZIL;
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C01VP c01vp2 = C01VP.LIZ;
                String message = thM5exceptionOrNullimpl.getMessage();
                if (message == null) {
                    message = "unknown";
                }
                c01vp2.getClass();
                C01VP.LIZIZ(0, str8, str9, message);
            }
            C335801Sa.LIZJ.remove(this.LLILZ);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("OgcLynxPrefetcher@171.prefetch$2");
            return unit2;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C335801Sa.LIZJ.remove(this.LLILZ);
            throw th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
