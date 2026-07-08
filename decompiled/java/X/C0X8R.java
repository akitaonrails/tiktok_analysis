package X;

import android.util.Pair;
import com.bytedance.android.livesdk.comp.impl.game.partnership.GameAttributionAPI;
import com.bytedance.android.livesdk.game.api.GameLivePartnershipRetrofitApi;
import com.bytedance.bpea.net3rd.api.I3rdRetrofitFactory;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0X8R, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.game.partnership.utils.GameAttributionReportHelper$reportC2SInternal$2", f = "GameAttributionReportHelper.kt", l = {}, m = "invokeSuspend")
public final class C0X8R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0X8R(String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn, Function2 function2) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0X8R(this.LL, this.LLILLJJLI, interfaceC1364105Vn, this.LLILLL);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x01b7: IGET (r0 I:java.lang.String) = (r6 I:X.0X8R) (LINE:16777655) X.0X8R.LLILLJJLI java.lang.String, block:B:27:0x01ad */
    /* JADX WARN: Type inference failed for: r6v0, types: [X.0X8R] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ?? r6;
        String str;
        String str2;
        C1C7U.LIZ("GameAttributionReportHelper@2972.reportC2SInternal$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Pair<String, String> pairLIZJ = C2088908Gh.LIZJ(this.LL, linkedHashMap);
            str = (String) pairLIZJ.first;
            str2 = (String) pairLIZJ.second;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[reportC2SInternal] ");
            sbLIZ.append(r6.LLILLJJLI);
            sbLIZ.append(" report attribution by C2S error: ");
            sbLIZ.append(e.getMessage());
            C20441214yg.LJ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ));
            Function2<Boolean, String, Unit> function2 = r6.LLILLL;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("exception: ");
            sbLIZ2.append(e.getMessage());
            function2.invoke(false, C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (C839620Wwi.LIZLLL) {
            C0X52<TypedInput> c0x52Execute = ((GameAttributionAPI) ((I3rdRetrofitFactory) ServiceManager.get().getService(I3rdRetrofitFactory.class)).LIZ(str).create(GameAttributionAPI.class)).performGet(str2, linkedHashMap).execute();
            if (c0x52Execute == null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("[reportC2SInternal] ");
                sbLIZ3.append(this.LLILLJJLI);
                sbLIZ3.append(" report attribution by C2S fail, response is null.");
                C20441214yg.LJ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ3));
                this.LLILLL.invoke(false, "response is null");
            } else {
                C2175508fh c2175508fh = c0x52Execute.LIZ;
                if (c2175508fh.LIZJ() && c2175508fh.LIZIZ == 200) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("[reportC2SInternal] ");
                    sbLIZ4.append(this.LLILLJJLI);
                    sbLIZ4.append(" report attribution by C2S success");
                    C20441214yg.LIZIZ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ4));
                    this.LLILLL.invoke(true, "");
                } else {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("[reportC2SInternal] ");
                    sbLIZ5.append(this.LLILLJJLI);
                    sbLIZ5.append(" report attribution by C2S failed, error code = ");
                    sbLIZ5.append(c2175508fh.LIZIZ);
                    sbLIZ5.append(", reason = ");
                    sbLIZ5.append(c2175508fh.LIZJ);
                    C20441214yg.LJ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ5));
                    Function2<Boolean, String, Unit> function22 = this.LLILLL;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("response status = ");
                    sbLIZ6.append(c2175508fh.LIZIZ);
                    sbLIZ6.append(", reason = ");
                    sbLIZ6.append(c2175508fh.LIZJ);
                    function22.invoke(false, C2188811AlT.LIZIZ(sbLIZ6));
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportC2SInternal$2");
            return unit;
        }
        GameLivePartnershipRetrofitApi gameLivePartnershipRetrofitApi = (GameLivePartnershipRetrofitApi) C1515120pWw.LJIIIZ(GameLivePartnershipRetrofitApi.class, str);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("x-metasec-bypass-ttnet-features", "1");
        C0X52<TypedInput> c0x52Execute2 = gameLivePartnershipRetrofitApi.performGet(str2, linkedHashMap, linkedHashMap2, false).execute();
        if (c0x52Execute2 == null) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("[reportC2SInternal] ");
            sbLIZ7.append(this.LLILLJJLI);
            sbLIZ7.append(" report attribution by C2S fail, response is null.");
            C20441214yg.LJ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ7));
            this.LLILLL.invoke(false, "response is null");
        } else {
            C2175508fh c2175508fh2 = c0x52Execute2.LIZ;
            if (c2175508fh2.LIZJ() && c2175508fh2.LIZIZ == 200) {
                StringBuilder sbLIZ8 = C2188811AlT.LIZ();
                sbLIZ8.append("[reportC2SInternal] ");
                sbLIZ8.append(this.LLILLJJLI);
                sbLIZ8.append(" report attribution by C2S success");
                C20441214yg.LIZIZ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ8));
                this.LLILLL.invoke(true, "");
            } else {
                StringBuilder sbLIZ9 = C2188811AlT.LIZ();
                sbLIZ9.append("[reportC2SInternal] ");
                sbLIZ9.append(this.LLILLJJLI);
                sbLIZ9.append(" report attribution by C2S fail, error code = ");
                sbLIZ9.append(c2175508fh2.LIZIZ);
                sbLIZ9.append(", reason = ");
                sbLIZ9.append(c2175508fh2.LIZJ);
                C20441214yg.LJ("GameAttributionReportHelper", C2188811AlT.LIZIZ(sbLIZ9));
                Function2<Boolean, String, Unit> function23 = this.LLILLL;
                StringBuilder sbLIZ10 = C2188811AlT.LIZ();
                sbLIZ10.append("response status = ");
                sbLIZ10.append(c2175508fh2.LIZIZ);
                sbLIZ10.append(", reason = ");
                sbLIZ10.append(c2175508fh2.LIZJ);
                function23.invoke(false, C2188811AlT.LIZIZ(sbLIZ10));
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GameAttributionReportHelper@2972.reportC2SInternal$2");
        return unit2;
    }
}
