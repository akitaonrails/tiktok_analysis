package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.adapter.live.BaseMMKLiveAdapterDelegate$trackRdPerfMedia$1", f = "BaseMMKLiveAdapterDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1775340wIe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1775370wIh LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775340wIe(AbstractC1775370wIh abstractC1775370wIh, String str, Integer num, String str2, InterfaceC1364105Vn<? super C1775340wIe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1775370wIh;
        this.LLILLJJLI = str;
        this.LLILLL = num;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1775340wIe(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        C1772690wEN c1772690wEN;
        C1772690wEN c1772690wEN2;
        C1C7U.LIZ("BaseMMKLiveAdapterDelegate@f1b0.trackRdPerfMedia$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1775180wIO c1775180wIOLJII = this.LL.LJII();
        String str2 = this.LLILLJJLI;
        long jLongValue = 0;
        if (!Intrinsics.LJFF(str2, "card_exposure") && !Intrinsics.LJFF(str2, "card_emit_play")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lN2 = this.LL.LJI().N2();
            if (lN2 != null) {
                jLongValue = lN2.longValue();
            }
            jLongValue = jCurrentTimeMillis - jLongValue;
        }
        InterfaceC1773850wGF interfaceC1773850wGF = this.LL.LIZIZ;
        if (interfaceC1773850wGF != null) {
            Pair[] pairArr = new Pair[15];
            int i5 = 0;
            pairArr[0] = new Pair("media_type", "live");
            pairArr[1] = new Pair("last_stage", this.LL.LJI().Q2());
            pairArr[2] = new Pair("stage", this.LLILLJJLI);
            pairArr[3] = new Pair("duration", C2286608xc.LJFF(jLongValue));
            if (c1775180wIOLJII != null) {
                i = c1775180wIOLJII.LJIILJJIL;
            } else {
                i = 1;
            }
            pairArr[4] = new Pair("play_times", C2286608xc.LJ(i));
            pairArr[5] = new Pair("src", this.LL.LJI().LIZIZ());
            if (c1775180wIOLJII != null) {
                i2 = c1775180wIOLJII.LJIILL;
            } else {
                i2 = 1;
            }
            pairArr[6] = new Pair("rd_exposure_times", C2286608xc.LJ(i2));
            if (c1775180wIOLJII != null) {
                i3 = c1775180wIOLJII.LJIIJJI;
            } else {
                i3 = 0;
            }
            pairArr[7] = new Pair("item_order", C2286608xc.LJ(i3));
            if (c1775180wIOLJII != null) {
                i4 = c1775180wIOLJII.LJIILIIL;
            } else {
                i4 = 0;
            }
            pairArr[8] = new Pair("is_first_screen", C2286608xc.LJ(i4));
            String str3 = "";
            if (c1775180wIOLJII == null || (c1772690wEN2 = c1775180wIOLJII.LIZ) == null || (str = c1772690wEN2.LJIIJJI) == null) {
                str = "";
            }
            pairArr[9] = new Pair("list_name", str);
            if (c1775180wIOLJII != null && (c1772690wEN = c1775180wIOLJII.LIZ) != null) {
                i5 = c1772690wEN.LJIIJ;
            }
            pairArr[10] = new Pair("list_order", C2286608xc.LJ(i5 + 1));
            String strLIZ = this.LL.LJI().LIZ();
            if (strLIZ == null) {
                strLIZ = "";
            }
            pairArr[11] = new Pair("enter_from_merge", strLIZ);
            String strLLIIJI = this.LL.LJI().LLIIJI();
            if (strLLIIJI == null) {
                strLLIIJI = "";
            }
            pairArr[12] = new Pair("enter_method", strLLIIJI);
            String strLJIIJ = this.LL.LJI().LJIIJ();
            if (strLJIIJ != null) {
                str3 = strLJIIJ;
            }
            pairArr[13] = new Pair("action_type", str3);
            JSONObject jSONObject = new JSONObject();
            AbstractC1775370wIh abstractC1775370wIh = this.LL;
            Long lO2 = abstractC1775370wIh.LJI().O2();
            if (lO2 != null) {
                jSONObject.put("setup_player_duration", lO2.longValue());
            }
            Long lP2 = abstractC1775370wIh.LJI().P2();
            if (lP2 != null) {
                jSONObject.put("play_action_duration", lP2.longValue());
            }
            Long lM2 = abstractC1775370wIh.LJI().M2();
            if (lM2 != null) {
                jSONObject.put("pause_action_duration", lM2.longValue());
            }
            pairArr[14] = new Pair("trace_info", C786410Ut5.J3(jSONObject));
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Integer num = this.LLILLL;
            String str4 = this.LLILZ;
            if (num != null) {
                num.intValue();
                mapLJIIJ.put("err_code", num);
            }
            if (str4 != null) {
                mapLJIIJ.put("err_msg", str4);
            }
            Boolean.valueOf(interfaceC1773850wGF.LJFF(new C1774950wI1("rd_mixmall_perf_media", mapLJIIJ, 0, 0, null, 100).LIZ(), null));
        }
        this.LL.LJI().L2(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMMKLiveAdapterDelegate@f1b0.trackRdPerfMedia$1");
        return unit;
    }
}
