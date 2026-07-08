package X;

import X.AbstractC1521100pga;
import android.view.View;
import com.bytedance.android.monitorV2.hybridSetting.entity.HybridSettingInitConfig;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AwS567S0100000_23;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public abstract class AbstractC1514820pWS<T extends AbstractC1521100pga> {
    public WeakReference<View> LL;
    public final C01GW LLILLJJLI;
    public boolean LLIZ;
    public boolean LLJ;
    public boolean LLJI;
    public T LLJIJIL;
    public T LLJILJIL;
    public Double LLJILJILJ;
    public final Map<String, Object> LLILLL = new LinkedHashMap();
    public final Map<String, Object> LLILZ = new LinkedHashMap();
    public String LLILZIL = "";
    public String LLILZLL = "";
    public boolean LLIZLLLIL = true;

    public abstract EnumC1520910pgH LIZJ();

    public final void LJ() {
        this.LLIZLLLIL = false;
        LIZIZ().LIZLLL(EnumC1521120pgc.VIEW_IS_FIRST_PAGE_VISIT.getKey(), Boolean.FALSE);
    }

    public final C1491800ovK LIZ() {
        return new C1491800ovK(this.LLILLL);
    }

    public final C1491690ov9 LIZIZ() {
        return (C1491690ov9) this.LLILLJJLI.getValue();
    }

    public final void LJFF() throws JSONException {
        View view;
        String str;
        if (a0.LJJJIL(this.LLILZIL) && (view = this.LL.get()) != null) {
            ArrayList arrayList = new ArrayList();
            C1514770pWN c1514770pWN = C1514790pWP.LIZIZ.LIZIZ.get(view);
            if (c1514770pWN != null && (str = c1514770pWN.LIZ) != null) {
                arrayList.add(str);
            }
            String str2 = (String) C13LP.LJJJLL(arrayList);
            if (str2 == null) {
                str2 = "";
            }
            this.LLILZIL = str2;
        }
        EnumC1521110pgb.Companion.getClass();
        Map<String, Object> map = EnumC1521110pgb.cachedEntries.get(this.LLILZIL);
        if (map == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        for (EnumC1521110pgb enumC1521110pgb : EnumC1521110pgb.values()) {
            Object obj = map.get(enumC1521110pgb.getKey());
            if (obj != null) {
                int type = enumC1521110pgb.getType();
                if (type == 1) {
                    this.LLILLL.put(enumC1521110pgb.getSlardarKey(), obj);
                } else if (type == 2) {
                    this.LLILZ.put(enumC1521110pgb.getSlardarKey(), obj);
                } else if (type == 3) {
                    jSONObject.putOpt(enumC1521110pgb.getSlardarKey(), obj);
                }
            }
        }
        this.LLILLL.put("context", jSONObject);
        LJI();
    }

    public final void LJI() {
        if (this.LLJILJILJ == null) {
            C1520380pfQ.LIZ.getClass();
            InterfaceC1514780pWO interfaceC1514780pWO = C1520380pfQ.LJIIIZ;
            this.LLJILJILJ = interfaceC1514780pWO != null ? Double.valueOf(interfaceC1514780pWO.getSampleRatio(this.LLILZIL)) : null;
        }
        if (this.LLJILJILJ != null) {
            try {
                Pair[] pairArr = new Pair[2];
                pairArr[0] = new Pair(EnumC1521120pgc.SAMPLE_RATIO.getKey(), this.LLJILJILJ);
                String key = EnumC1521120pgc.SAMPLE_ID.getKey();
                C1520380pfQ.LIZ.getClass();
                HybridSettingInitConfig hybridSettingInitConfigLJ = C1520380pfQ.LIZJ().LJ();
                pairArr[1] = new Pair(key, hybridSettingInitConfigLJ != null ? hybridSettingInitConfigLJ.LJ : null);
                Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(pairArr);
                C1491570oux c1491570oux = C1491570oux.LIZ;
                String str = LIZIZ().LIZ;
                EnumC1491540ouu enumC1491540ouu = EnumC1491540ouu.IMPORTANT;
                EnumC1491530out enumC1491530out = EnumC1491530out.MEMORY_ONLY;
                c1491570oux.getClass();
                C1491570oux.LJIILL(str, mapLJIIIIZZ, enumC1491540ouu, enumC1491530out);
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public AbstractC1514820pWS(View view) {
        this.LL = new WeakReference<>(view);
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS567S0100000_23(view, 37));
    }

    public final void LIZLLL(View view, String str) {
        if (this.LL.get() == null) {
            this.LL = new WeakReference<>(view);
        } else if (!Intrinsics.LJFF(this.LL.get(), view)) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unexpected view instance attached with container id: ");
            sbLIZ.append(str);
            C1521730phb.LIZIZ("MonitorViewSession", C2188811AlT.LIZIZ(sbLIZ));
        }
        LIZIZ().LIZ(str);
        LJFF();
    }
}
