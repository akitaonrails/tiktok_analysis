package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wId, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.player.MMKLynxLiveView$trackRdPerfMedia$1", f = "MMKLynxLiveView.kt", l = {}, m = "invokeSuspend")
public final class C1775330wId extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ MMKLynxLiveView LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1775330wId(String str, MMKLynxLiveView mMKLynxLiveView, Integer num, String str2, InterfaceC1364105Vn<? super C1775330wId> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = mMKLynxLiveView;
        this.LLILLL = num;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1775330wId(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
        C1C7U.LIZ("MMKLynxLiveView@8b4d.trackRdPerfMedia$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str2 = this.LL;
        long jLongValue = 0;
        if (!Intrinsics.LJFF(str2, "card_exposure") && !Intrinsics.LJFF(str2, "card_emit_play")) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l = this.LLILLJJLI.LLJJJJ;
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
        InterfaceC1773850wGF interfaceC1773850wGFLJJIJIL = this.LLILLJJLI.LJJIJIL();
        if (interfaceC1773850wGFLJJIJIL != null) {
            Pair[] pairArr = new Pair[15];
            this.LLILLJJLI.getClass();
            int i5 = 0;
            pairArr[0] = new Pair("media_type", "live");
            pairArr[1] = new Pair("last_stage", this.LLILLJJLI.LLJL);
            pairArr[2] = new Pair("stage", this.LL);
            pairArr[3] = new Pair("duration", C2286608xc.LJFF(jLongValue));
            if (c1775180wIO != null) {
                i = c1775180wIO.LJIILJJIL;
            } else {
                i = 1;
            }
            pairArr[4] = new Pair("play_times", C2286608xc.LJ(i));
            pairArr[5] = new Pair("src", this.LLILLJJLI.getMediaSrc());
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
            String str4 = this.LLILLJJLI.LLJLIL;
            if (str4 == null) {
                str4 = "";
            }
            pairArr[11] = new Pair("enter_from_merge", str4);
            String str5 = this.LLILLJJLI.LLJLILLLLZIIL;
            if (str5 == null) {
                str5 = "";
            }
            pairArr[12] = new Pair("enter_method", str5);
            String str6 = this.LLILLJJLI.LLJLL;
            if (str6 != null) {
                str3 = str6;
            }
            pairArr[13] = new Pair("action_type", str3);
            JSONObject jSONObject = new JSONObject();
            MMKLynxLiveView mMKLynxLiveView = this.LLILLJJLI;
            Long l2 = mMKLynxLiveView.LLJLLIL;
            if (l2 != null) {
                jSONObject.put("setup_player_duration", l2.longValue());
            }
            Long l3 = mMKLynxLiveView.LLJLLL;
            if (l3 != null) {
                jSONObject.put("play_action_duration", l3.longValue());
            }
            Long l4 = mMKLynxLiveView.LLJZ;
            if (l4 != null) {
                jSONObject.put("pause_action_duration", l4.longValue());
            }
            pairArr[14] = new Pair("trace_info", C786410Ut5.J3(jSONObject));
            Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
            Integer num = this.LLILLL;
            String str7 = this.LLILZ;
            if (num != null) {
                num.intValue();
                mapLJIIJ.put("err_code", num);
            }
            if (str7 != null) {
                mapLJIIJ.put("err_msg", str7);
            }
            Boolean.valueOf(interfaceC1773850wGFLJJIJIL.LJFF(new C1774950wI1("rd_mixmall_perf_media", mapLJIIJ, 0, 0, null, 100).LIZ(), null));
        }
        this.LLILLJJLI.LLJL = this.LL;
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MMKLynxLiveView@8b4d.trackRdPerfMedia$1");
        return unit;
    }
}
