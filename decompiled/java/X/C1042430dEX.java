package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.log.AdWebEventLogger;
import com.ss.android.ugc.aweme.recording.js.RecordingNativeContextHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS6S3100000_16;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dEX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.recording.js.RecordingJsHandler$onRecordingJsEvent$1", f = "RecordingJsHandler.kt", l = {330}, m = "invokeSuspend")
public final class C1042430dEX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1042410dEV LLILLJJLI;
    public final /* synthetic */ JSONObject LLILLL;
    public final /* synthetic */ C1035880d3y LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1042430dEX(C1042410dEV c1042410dEV, JSONObject jSONObject, C1035880d3y c1035880d3y, InterfaceC1364105Vn<? super C1042430dEX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1042410dEV;
        this.LLILLL = jSONObject;
        this.LLILZ = c1035880d3y;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1042430dEX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        JSONObject jSONObject;
        String strJ3;
        String creativeIdStr;
        C1C7U.LIZ("RecordingJsHandler@c4f4.onRecordingJsEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(50L, this) == objLJFF) {
                C1C7U.LIZIZ("RecordingJsHandler@c4f4.onRecordingJsEvent$1");
                return objLJFF;
            }
        }
        C1042450dEZ c1042450dEZ = C1042450dEZ.LIZ;
        C1042410dEV c1042410dEV = this.LLILLJJLI;
        JSONObject jSONObject2 = this.LLILLL;
        C1035880d3y c1035880d3y = this.LLILZ;
        c1042450dEZ.getClass();
        try {
            String strOptString = jSONObject2.optString("ad_extra_data");
            String str = "";
            if (strOptString == null) {
                strOptString = "";
            }
            if (strOptString.length() != 0) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                try {
                    jSONObject = new JSONObject(strOptString);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    String strOptString2 = jSONObject.optString("event_label");
                    if (strOptString2 == null) {
                        strOptString2 = "null";
                    }
                    long jOptLong = jSONObject.optLong("timestamp");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("web_context");
                    if (jSONObjectOptJSONObject == null || (strJ3 = C786410Ut5.J3(jSONObjectOptJSONObject)) == null) {
                        strJ3 = "";
                    }
                    if (jOptLong > 0) {
                        c1042410dEV.LJIIJ = jOptLong;
                    }
                    RecordingNativeContextHandler recordingNativeContextHandler = C1042450dEZ.LIZJ;
                    long j = c1042410dEV.LJIIJ;
                    AwemeRawAd awemeRawAd = c1035880d3y.getAwemeRawAd();
                    if (awemeRawAd != null && (creativeIdStr = awemeRawAd.getCreativeIdStr()) != null) {
                        str = creativeIdStr;
                    }
                    new AdWebEventLogger(c1035880d3y).logAd(C2274571E1f.LIZ, c1035880d3y.getAwemeRawAd(), new AwS6S3100000_16(recordingNativeContextHandler.LIZ(j, str), strOptString2, strJ3, c1042410dEV, 0));
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRecordingJsEvent failed, ");
            sbLIZ.append(th2);
            C1AF0.LJFF(th2, C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordingJsHandler@c4f4.onRecordingJsEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
