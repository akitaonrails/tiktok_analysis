package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wIc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.player.adapter.video.BaseMMKVideoAdapterDelegate$trackRdPerfMedia$1", f = "BaseMMKVideoAdapterDelegate.kt", l = {}, m = "invokeSuspend")
public final class C1775320wIc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ AbstractC1775220wIS LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775320wIc(String str, AbstractC1775220wIS abstractC1775220wIS, Integer num, String str2, InterfaceC1364105Vn<? super C1775320wIc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = abstractC1775220wIS;
        this.LLILLL = num;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1775320wIc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
        C1C7U.LIZ("BaseMMKVideoAdapterDelegate@ec2f.trackRdPerfMedia$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL;
        long jLongValue = 0;
        if (!Intrinsics.LJFF(str2, "card_exposure") && !Intrinsics.LJFF(str2, "card_emit_play")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long lN2 = this.LLILLJJLI.LJII().N2();
            if (lN2 != null) {
                jLongValue = lN2.longValue();
            }
            jLongValue = jCurrentTimeMillis - jLongValue;
        }
        C1775180wIO c1775180wIOLJI = this.LLILLJJLI.LJI();
        InterfaceC1773850wGF interfaceC1773850wGF = this.LLILLJJLI.LIZIZ;
        if (interfaceC1773850wGF != null) {
            Pair[] pairArr = new Pair[14];
            int i5 = 0;
            pairArr[0] = new Pair("media_type", "video");
            pairArr[1] = new Pair("stage", this.LL);
            pairArr[2] = new Pair("last_stage", this.LLILLJJLI.LJII().Q2());
            pairArr[3] = new Pair("duration", C2286608xc.LJFF(jLongValue));
            if (c1775180wIOLJI != null) {
                i = c1775180wIOLJI.LJIILJJIL;
            } else {
                i = 1;
            }
            pairArr[4] = new Pair("play_times", C2286608xc.LJ(i));
            pairArr[5] = new Pair("src", this.LLILLJJLI.LJII().T2());
            if (c1775180wIOLJI != null) {
                i2 = c1775180wIOLJI.LJIILL;
            } else {
                i2 = 1;
            }
            pairArr[6] = new Pair("rd_exposure_times", C2286608xc.LJ(i2));
            if (c1775180wIOLJI != null) {
                i3 = c1775180wIOLJI.LJIIJJI;
            } else {
                i3 = 0;
            }
            pairArr[7] = new Pair("item_order", C2286608xc.LJ(i3));
            if (c1775180wIOLJI != null) {
                i4 = c1775180wIOLJI.LJIILIIL;
            } else {
                i4 = 0;
            }
            pairArr[8] = new Pair("is_first_screen", C2286608xc.LJ(i4));
            String str3 = "";
            if (c1775180wIOLJI == null || (c1772690wEN2 = c1775180wIOLJI.LIZ) == null || (str = c1772690wEN2.LJIIJJI) == null) {
                str = "";
            }
            pairArr[9] = new Pair("list_name", str);
            if (c1775180wIOLJI != null && (c1772690wEN = c1775180wIOLJI.LIZ) != null) {
                i5 = c1772690wEN.LJIIJ;
            }
            pairArr[10] = new Pair("list_order", C2286608xc.LJ(i5 + 1));
            String strS2 = this.LLILLJJLI.LJII().S2();
            if (strS2 == null) {
                strS2 = "";
            }
            pairArr[11] = new Pair("vod_tag", strS2);
            String strR2 = this.LLILLJJLI.LJII().R2();
            if (strR2 != null) {
                str3 = strR2;
            }
            pairArr[12] = new Pair("vod_scenes", str3);
            JSONObject jSONObject = new JSONObject();
            AbstractC1775220wIS abstractC1775220wIS = this.LLILLJJLI;
            Long lO2 = abstractC1775220wIS.LJII().O2();
            if (lO2 != null) {
                jSONObject.put("setup_player_duration", lO2.longValue());
            }
            Long lP2 = abstractC1775220wIS.LJII().P2();
            if (lP2 != null) {
                jSONObject.put("play_action_duration", lP2.longValue());
            }
            Long lM2 = abstractC1775220wIS.LJII().M2();
            if (lM2 != null) {
                jSONObject.put("pause_action_duration", lM2.longValue());
            }
            pairArr[13] = new Pair("trace_info", C786410Ut5.J3(jSONObject));
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
        this.LLILLJJLI.LJII().L2(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseMMKVideoAdapterDelegate@ec2f.trackRdPerfMedia$1");
        return unit;
    }
}
