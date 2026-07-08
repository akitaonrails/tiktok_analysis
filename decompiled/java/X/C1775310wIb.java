package X;

import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wIb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKSingleVideoView$trackRdPerfMedia$1", f = "MMKSingleVideoView.kt", l = {}, m = "invokeSuspend")
public final class C1775310wIb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1775300wIa LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775310wIb(String str, C1775300wIa c1775300wIa, Integer num, String str2, InterfaceC1364105Vn<? super C1775310wIb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1775300wIa;
        this.LLILLL = num;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1775310wIb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1775180wIO c1775180wIO;
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        C1772690wEN c1772690wEN;
        C1772690wEN c1772690wEN2;
        C1773330wFP data;
        C1775190wIP c1775190wIP;
        C1C7U.LIZ("MMKSingleVideoView@a724.trackRdPerfMedia$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL;
        long jLongValue = 0;
        if (!Intrinsics.LJFF(str2, "card_exposure") && !Intrinsics.LJFF(str2, "card_emit_play")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.LLILLJJLI.LLLIILIL;
            if (l != null) {
                jLongValue = l.longValue();
            }
            jLongValue = jCurrentTimeMillis - jLongValue;
        }
        InterfaceC1775450wIp<C1773330wFP> containerCallback = this.LLILLJJLI.getContainerCallback();
        if (containerCallback != null && (data = containerCallback.getData()) != null && (c1775190wIP = data.LJII) != null) {
            c1775180wIO = c1775190wIP.LIZIZ;
        } else {
            c1775180wIO = null;
        }
        InterfaceC1773850wGF reporterService = this.LLILLJJLI.getReporterService();
        if (reporterService != null) {
            Pair[] pairArr = new Pair[14];
            this.LLILLJJLI.getClass();
            int i5 = 0;
            pairArr[0] = new Pair("media_type", "video");
            pairArr[1] = new Pair("stage", this.LL);
            pairArr[2] = new Pair("last_stage", this.LLILLJJLI.LLLJIL);
            pairArr[3] = new Pair("duration", C2286608xc.LJFF(jLongValue));
            if (c1775180wIO != null) {
                i = c1775180wIO.LJIILJJIL;
            } else {
                i = 1;
            }
            pairArr[4] = new Pair("play_times", C2286608xc.LJ(i));
            pairArr[5] = new Pair("src", this.LLILLJJLI.getSrc());
            if (c1775180wIO != null) {
                i2 = c1775180wIO.LJIILL;
            } else {
                i2 = 1;
            }
            pairArr[6] = new Pair("rd_exposure_times", C2286608xc.LJ(i2));
            if (c1775180wIO != null) {
                i3 = c1775180wIO.LJIIJJI;
            } else {
                i3 = 0;
            }
            pairArr[7] = new Pair("item_order", C2286608xc.LJ(i3));
            if (c1775180wIO != null) {
                i4 = c1775180wIO.LJIILIIL;
            } else {
                i4 = 0;
            }
            pairArr[8] = new Pair("is_first_screen", C2286608xc.LJ(i4));
            String str3 = "";
            if (c1775180wIO == null || (c1772690wEN2 = c1775180wIO.LIZ) == null || (str = c1772690wEN2.LJIIJJI) == null) {
                str = "";
            }
            pairArr[9] = new Pair("list_name", str);
            if (c1775180wIO != null && (c1772690wEN = c1775180wIO.LIZ) != null) {
                i5 = c1772690wEN.LJIIJ;
            }
            pairArr[10] = new Pair("list_order", C2286608xc.LJ(i5 + 1));
            String vodTag = this.LLILLJJLI.getVodTag();
            if (vodTag == null) {
                vodTag = "";
            }
            pairArr[11] = new Pair("vod_tag", vodTag);
            String vodSceneTag = this.LLILLJJLI.getVodSceneTag();
            if (vodSceneTag != null) {
                str3 = vodSceneTag;
            }
            pairArr[12] = new Pair("vod_scenes", str3);
            JSONObject jSONObject = new JSONObject();
            C1775300wIa c1775300wIa = this.LLILLJJLI;
            Long l2 = c1775300wIa.LLLJL;
            if (l2 != null) {
                jSONObject.put("setup_player_duration", l2.longValue());
            }
            Long l3 = c1775300wIa.LLLL;
            if (l3 != null) {
                jSONObject.put("play_action_duration", l3.longValue());
            }
            Long l4 = c1775300wIa.LLLLII;
            if (l4 != null) {
                jSONObject.put("pause_action_duration", l4.longValue());
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
            Boolean.valueOf(reporterService.LJFF(new C1774950wI1("rd_mixmall_perf_media", mapLJIIJ, 0, 0, null, 100).LIZ(), null));
        }
        this.LLILLJJLI.LLLJIL = this.LL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MMKSingleVideoView@a724.trackRdPerfMedia$1");
        return unit;
    }
}
