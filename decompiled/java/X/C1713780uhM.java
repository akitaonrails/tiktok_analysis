package X;

import com.bytedance.pipo.verify.base.model.VerifyDetail;
import com.bytedance.pipo.verify.base.model.VerifyInfo;
import com.bytedance.pipo.verify.base.tracking.VerifyAnalysisSession;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.verify.ab.PipoVcAndroidMinimalLayoutConfigSettings;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0uhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1713780uhM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C1713750uhJ LL;
    public final /* synthetic */ Map<String, String> LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1713520ugw LLILZLL;
    public final /* synthetic */ Map<String, String> LLIZ;
    public final /* synthetic */ boolean LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1713780uhM(C1713750uhJ c1713750uhJ, Map<String, String> map, String str, String str2, String str3, C1713520ugw c1713520ugw, Map<String, String> map2, boolean z) {
        super(0);
        this.LL = c1713750uhJ;
        this.LLILLJJLI = map;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = c1713520ugw;
        this.LLIZ = map2;
        this.LLIZLLLIL = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        String str2;
        VerifyDetail verifyDetailLJIIIIZZ;
        VerifyInfo verifyInfoLJIIIZ;
        VerifyDetail verifyDetail;
        Unit unit;
        if (this.LL.LJI > 0 && this.LL.LJII.compareAndSet(false, true)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Map<String, String> map = this.LLILLJJLI;
            LinkedHashMap linkedHashMap = map != null ? new LinkedHashMap(map) : new LinkedHashMap();
            linkedHashMap.put("start_timestamp", String.valueOf(this.LL.LJI));
            linkedHashMap.put("finish_timestamp", String.valueOf(jCurrentTimeMillis));
            for (Pair pair : (ArrayList) this.LL.LJFF()) {
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            for (Map.Entry<String, String> entry : this.LL.LIZLLL().entrySet()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put("finish_type", this.LLILLL);
            if (C1714240ui6.LIZ()) {
                C1713750uhJ c1713750uhJ = this.LL;
                Map<String, String> map2 = this.LLIZ;
                boolean z = this.LLIZLLLIL;
                try {
                    linkedHashMap.put("duration", String.valueOf(jCurrentTimeMillis - c1713750uhJ.LJI));
                    if (map2 != null) {
                        for (Map.Entry<String, String> entry2 : map2.entrySet()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    VerifyAnalysisSession verifyAnalysisSessionLIZ = c1713750uhJ.LIZ();
                    if (verifyAnalysisSessionLIZ != null) {
                        for (Map.Entry entry3 : ((LinkedHashMap) verifyAnalysisSessionLIZ.LJII(jCurrentTimeMillis)).entrySet()) {
                            linkedHashMap.put(entry3.getKey(), entry3.getValue());
                        }
                        if (z) {
                            C1707060uWW c1707060uWW = C1707060uWW.LIZ;
                            String str3 = verifyAnalysisSessionLIZ.LIZ;
                            c1707060uWW.getClass();
                            C1707060uWW.LIZIZ(str3);
                        }
                        unit = Unit.LIZ;
                    } else {
                        unit = null;
                    }
                    C189200o6.m2constructorimpl(unit);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            String str4 = this.LLILZ;
            if (str4 != null) {
                linkedHashMap.put("err_code", str4);
            }
            String str5 = this.LLILZIL;
            if (str5 != null) {
                linkedHashMap.put("err_msg", str5);
            }
            linkedHashMap.put("capability", "");
            C1713570uh1 c1713570uh1 = this.LL.LIZIZ;
            if (c1713570uh1 == null || (verifyInfoLJIIIZ = c1713570uh1.LJIIIZ()) == null || (verifyDetail = verifyInfoLJIIIZ.verifyDetail) == null || (str = verifyDetail.paymentMethod) == null) {
                str = "";
            }
            linkedHashMap.put("payment_method", str);
            C1713570uh1 c1713570uh12 = this.LL.LIZIZ;
            if (c1713570uh12 == null || (verifyDetailLJIIIIZZ = c1713570uh12.LJIIIIZZ()) == null || (str2 = verifyDetailLJIIIIZZ.verifyMethod) == null) {
                str2 = "";
            }
            linkedHashMap.put("verify_method", str2);
            this.LL.getClass();
            linkedHashMap.put("jailbroken_or_rooted", C1713750uhJ.LJ());
            if (!C123100dR.LIZ((String) linkedHashMap.get("payment_method"))) {
                linkedHashMap.put("arg1", "");
            } else if (this.LLILZLL.LIZIZ.LIZJ == EnumC925903jd.MINIMAL) {
                PipoVcAndroidMinimalLayoutConfigSettings.PipoVcAndroidMinimalLayoutConfigModel pipoVcAndroidMinimalLayoutConfigModelLIZ = PipoVcAndroidMinimalLayoutConfigSettings.LIZ();
                String str6 = (String) linkedHashMap.get("verify_type");
                if (pipoVcAndroidMinimalLayoutConfigModelLIZ.pairs == null || str6 == null || !pipoVcAndroidMinimalLayoutConfigModelLIZ.LIZ(str6)) {
                    linkedHashMap.put("arg1", "layout_minimal_inactive");
                } else {
                    linkedHashMap.put("arg1", "layout_minimal_active");
                }
            }
            InterfaceC1713820uhQ interfaceC1713820uhQ = C1713600uh4.LIZJ;
            if (interfaceC1713820uhQ != null) {
                interfaceC1713820uhQ.onEventV3("rd_pipo_veri_center_finish", linkedHashMap);
            }
        }
        return Unit.LIZ;
    }
}
