package X;

import com.bytedance.hybrid.spark.page.SparkActivity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.GetShopHomepageData;
import com.ss.android.ugc.aweme.ecommerce.showcase.service.api.ShopLiveInfo;
import com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor;
import com.ss.android.ugc.aweme.feed.model.live.StreamUrlStruct;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vMA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.ShopPrefetchDataManager$startPrefetch$4", f = "ShopPrefetchDataManager.kt", l = {87}, m = "invokeSuspend")
public final class C1739080vMA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1739060vM8 LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public C1211320hcw LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ C1739060vM8 LLIZ;
    public final /* synthetic */ Map<String, Object> LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ C1738990vM1 LLJIJIL;
    public final /* synthetic */ C1211320hcw LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1739080vMA(C1739060vM8 c1739060vM8, Map<String, Object> map, String str, boolean z, C1738990vM1 c1738990vM1, C1211320hcw c1211320hcw, InterfaceC1364105Vn<? super C1739080vMA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = c1739060vM8;
        this.LLIZLLLIL = map;
        this.LLJ = str;
        this.LLJI = z;
        this.LLJIJIL = c1738990vM1;
        this.LLJILJIL = c1211320hcw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1739080vMA(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1739060vM8 c1739060vM8;
        Map<String, Object> map;
        String str;
        boolean z;
        C1211320hcw c1211320hcw;
        Throwable th;
        n nVar;
        n nVarLJJIJ;
        GetShopHomepageData getShopHomepageData;
        String str2;
        StreamUrlStruct streamUrlStruct;
        SparkActivity sparkActivity;
        Type type;
        String strLJIIIIZZ;
        boolean z2;
        Type type2;
        C1C7U.LIZ("ShopPrefetchDataManager@c051.startPrefetch$4");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZLL;
        String str3 = null;
        boolean z3 = true;
        try {
            try {
                if (i != 0) {
                    if (i == 1) {
                        z = this.LLILZIL;
                        c1211320hcw = this.LLILZ;
                        str = (String) this.LLILLL;
                        map = (Map) this.LLILLJJLI;
                        c1739060vM8 = this.LL;
                        try {
                            C155000ia.LIZIZ(obj);
                        } catch (Throwable th2) {
                            th = th2;
                            TryCatchGuardChecker.doCheck(th);
                            nVar = null;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    C155000ia.LIZIZ(obj);
                    c1739060vM8 = this.LLIZ;
                    map = this.LLIZLLLIL;
                    str = this.LLJ;
                    z = this.LLJI;
                    C1738990vM1 c1738990vM1 = this.LLJIJIL;
                    c1211320hcw = this.LLJILJIL;
                    try {
                        this.LL = c1739060vM8;
                        this.LLILLJJLI = map;
                        this.LLILLL = str;
                        this.LLILZ = c1211320hcw;
                        this.LLILZIL = z;
                        this.LLILZLL = 1;
                        c1739060vM8.getClass();
                        obj = C2399409ai.LIZ("shop", "homepage_get", c1738990vM1.LIZIZ, new C324050Cn5(str, c1738990vM1, null), this);
                        if (obj == objLJFF) {
                            C1C7U.LIZIZ("ShopPrefetchDataManager@c051.startPrefetch$4");
                            return objLJFF;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        TryCatchGuardChecker.doCheck(th);
                        nVar = null;
                    }
                }
                nVar = (n) obj;
                if (nVar != null) {
                    nVarLJJIJ = nVar.LJJIJ("data");
                } else {
                    nVarLJJIJ = null;
                }
                try {
                    Gson gsonLJFF = C1741890vQh.LJFF();
                    C1120604Zw.LIZ.getClass();
                    C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                    if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        type2 = C2371409Qy.LIZJ(C13LE.LJII(GetShopHomepageData.class));
                    } else {
                        type2 = new TypeToken<GetShopHomepageData>() { // from class: X.0vMD
                        }.getType();
                    }
                    Object objLIZLLL = gsonLJFF.LIZLLL(nVarLJJIJ, type2);
                    if (!(objLIZLLL instanceof GetShopHomepageData)) {
                        objLIZLLL = null;
                    }
                    getShopHomepageData = (GetShopHomepageData) objLIZLLL;
                } catch (s e) {
                    TryCatchGuardChecker.doCheck(e);
                    getShopHomepageData = null;
                }
            } catch (CancellationException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw e2;
            }
        } catch (CancellationException e3) {
            TryCatchGuardChecker.doCheck(e3);
            throw e3;
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
        }
        if (getShopHomepageData == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ShopPrefetchDataManager@c051.startPrefetch$4");
            return unit;
        }
        c1739060vM8.getClass();
        C1739060vM8.LIZIZ(getShopHomepageData, map, str);
        String str4 = "";
        if (z) {
            map.put("mini_window_on", C2286608xc.LJ(0));
        } else {
            map.put("mini_window_on", C2286608xc.LJ(1));
            ShopLiveInfo shopLiveInfo = getShopHomepageData.liveInfo;
            if (shopLiveInfo == null || (str2 = shopLiveInfo.roomId) == null) {
                str2 = "";
            }
            C1008603wy.LIZIZ(map, "room_id", str2);
            ShopLiveInfo shopLiveInfo2 = getShopHomepageData.liveInfo;
            if (shopLiveInfo2 != null) {
                str3 = shopLiveInfo2.streamData;
            }
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 == null || !c1121904a9LIZIZ2.LJII) {
                    z3 = false;
                }
                if (z3) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(StreamUrlStruct.class));
                } else {
                    type = new TypeToken<StreamUrlStruct>() { // from class: X.0vMC
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF2.LJIIIIZZ(str3, type);
                if (!(objLJIIIIZZ instanceof StreamUrlStruct)) {
                    objLJIIIIZZ = null;
                }
                streamUrlStruct = (StreamUrlStruct) objLJIIIIZZ;
            } catch (s e4) {
                TryCatchGuardChecker.doCheck(e4);
                streamUrlStruct = null;
            }
            if (streamUrlStruct != null && (sparkActivity = c1211320hcw.LLILLJJLI) != null) {
                StoreInterceptor.LL.getClass();
                Boolean.valueOf(StoreInterceptor.LJII(sparkActivity, streamUrlStruct, map, str, str2));
            }
        }
        ConcurrentHashMap<String, Object> concurrentHashMap = c1739060vM8.LIZIZ;
        if (nVar != null && (strLJIIIIZZ = C1741890vQh.LJIIIIZZ(nVar)) != null) {
            str4 = strLJIIIIZZ;
        }
        concurrentHashMap.put("homepage_data", str4);
        c1739060vM8.LIZIZ.put("shop_name", getShopHomepageData.shop.shopName);
        c1739060vM8.LIZIZ.put("shop_status", C2286608xc.LJ(getShopHomepageData.shop.status));
        c1739060vM8.LIZIZ.put("trackParams", C1741890vQh.LJIIIIZZ(map));
        c1739060vM8.LIZJ("homepage_data");
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ShopPrefetchDataManager@c051.startPrefetch$4");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
