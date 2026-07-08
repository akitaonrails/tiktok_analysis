package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel;
import com.ss.android.ugc.aweme.ecommerce.resource.EcomResourceBystander;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixShopSearchBizVM;
import com.ss.android.ugc.aweme.ecommerce.search.result.api.EcSearchMixApi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS624S0100000_10;

/* JADX INFO: renamed from: X.0Qhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public abstract class AbstractC677510Qhp extends AbstractC677860QiO {
    public final MixShopSearchBizVM LIZ;
    public final Function0<C675270QeD> LIZIZ;
    public final Function2<C1422405hW, Throwable, Unit> LIZJ;
    public final Function0<Integer> LIZLLL;
    public final Map<String, Long> LJ = new LinkedHashMap();

    public abstract C15O7<C1515820pY4<n>> LIZLLL(Map<String, String> map, Map<String, String> map2);

    public abstract Map<String, String> LJII(C675150Qe1 c675150Qe1);

    public abstract Map<String, Object> LJIIIIZZ(C675150Qe1 c675150Qe1);

    public abstract void LJIIIZ(n nVar, C1422405hW c1422405hW, C675150Qe1 c675150Qe1, boolean z);

    @Override // X.AbstractC677860QiO
    public final C675270QeD LIZ() {
        Function0<C675270QeD> function0 = this.LIZIZ;
        if (function0 != null) {
            return function0.invoke();
        }
        return null;
    }

    public Map<String, Object> LJ(C675150Qe1 c675150Qe1) {
        return new LinkedHashMap();
    }

    public static void LJIIJJI(String str, Map map) {
        if (C678580QjY.LIZIZ.length != 0) {
            try {
                EcomResourceBystander.LIZ.getClass();
                EcomResourceBystander.LJIILLIIL(map, str, null, null, null);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public n LJI(Map<String, Object> map, C675150Qe1 c675150Qe1) {
        String str = EcSearchMixApi.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
        Iterator<T> it2 = map.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            linkedHashMap.put(entry.getKey(), entry.getValue().toString());
        }
        Map<String, Object> mapLIZ = C674840QdW.LIZ(c675150Qe1.LJFF);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(C2097908Jt.LIZIZ(mapLIZ.size()));
        for (Map.Entry entry2 : ((LinkedHashMap) mapLIZ).entrySet()) {
            linkedHashMap2.put(entry2.getKey(), entry2.getValue().toString());
        }
        return EcSearchMixApi.LIZIZ(linkedHashMap, linkedHashMap2);
    }

    public AbstractC677510Qhp(MixShopSearchBizVM mixShopSearchBizVM, Function0 function0, AwS624S0100000_10 awS624S0100000_10, AwS554S0100000_10 awS554S0100000_10) {
        this.LIZ = mixShopSearchBizVM;
        this.LIZIZ = function0;
        this.LIZJ = awS624S0100000_10;
        this.LIZLLL = awS554S0100000_10;
    }

    @Override // X.AbstractC677860QiO
    public final C095D LIZIZ(Context context, C677540Qhs c677540Qhs, MixPageViewModel mixPageViewModel, C675270QeD c675270QeD) {
        return new C095D(new C675260QeC(context, c677540Qhs, mixPageViewModel, c675270QeD, this, null));
    }

    public final void LJIIJ(Map<String, Object> map, n nVar, C1422405hW c1422405hW, MixPageViewModel mixPageViewModel) throws Throwable {
        n nVar2;
        this.LIZ.xQ2(nVar);
        LogPbBean logPbBean = c1422405hW.LJII;
        if (logPbBean != null) {
            this.LIZ.LLJ.postValue(logPbBean);
            n nVar3 = new n();
            nVar3.LJJIFFI("log_pb", logPbBean.toJsonObject());
            nVar3.LJJII(Boolean.FALSE, "isFirstRequest");
            nVar3.LJJII(Boolean.valueOf(this.LIZ.LLJIJIL), "isFirstEnterPageSearch");
            mixPageViewModel.wQ2(nVar3, "page_data");
        }
        EComSearchBffResp eComSearchBffResp = c1422405hW.LIZ;
        if (eComSearchBffResp != null && (nVar2 = eComSearchBffResp.globalDoodleConfig) != null) {
            this.LIZ.LLJI.postValue(nVar2);
            mixPageViewModel.wQ2(nVar2, "global_doodle_config");
        }
        String str = null;
        if (C07P7.LIZ(c1422405hW)) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LJ), null, null, new C08WB(nVar, this, null), 3);
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C08VZ("/aweme/v1/search/ecom/stream/load_more/bff/", nVar, null), 3);
        Function2<C1422405hW, Throwable, Unit> function2 = this.LIZJ;
        if (function2 != null) {
            function2.invoke(c1422405hW, null);
        }
        if (c1422405hW.LIZLLL == 0) {
            mixPageViewModel.LLJ.postValue(Integer.valueOf(EnumC677800QiI.NO_MORE.getValue()));
        }
        if ((!c1422405hW.LIZJ.isEmpty()) && (!c1422405hW.LIZIZ.isEmpty())) {
            if (c1422405hW.LIZLLL > 0) {
                mixPageViewModel.LLJ.postValue(Integer.valueOf(EnumC677800QiI.LOADING.getValue()));
            }
            C23250099c.LJ(C23271099x.INSTANCE, new C677590Qhx(mixPageViewModel, c1422405hW, null));
        }
        C678510QjR c678510QjR = this.LIZ.LLJL;
        if (c678510QjR != null) {
            Object obj = map.get("search_id");
            if (obj instanceof String) {
                str = (String) obj;
            }
            c678510QjR.LIZ(str, c1422405hW.LIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d1  */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.AbstractC677510Qhp r18, X.C675270QeD r19, X.C677540Qhs r20, com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel r21, X.InterfaceC346701Wf r22, X.InterfaceC1364105Vn r23) {
        /*
            Method dump skipped, instruction units count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC677510Qhp.LJFF(X.0Qhp, X.0QeD, X.0Qhs, com.ss.android.ugc.aweme.ecommerce.arch.MixPageViewModel, X.01Wf, X.05Vn):java.lang.Object");
    }
}
