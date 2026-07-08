package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.longvideonotification.LongVideoNotificationApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08im, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.longvideonotification.LongVideoPopupNotificationManager$reportServerPopupShown$1", f = "LongVideoPopupNotificationManager.kt", l = {91}, m = "invokeSuspend")
public final class C2194608im extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2194608im(long j, InterfaceC1364105Vn<? super C2194608im> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2194608im(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LongVideoPopupNotificationManager@441a.reportServerPopupShown$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                LongVideoNotificationApi.API api = LongVideoNotificationApi.LIZ;
                long j = this.LLILLJJLI;
                this.LL = 1;
                if (api.reportPopupDisplay(j, this) == objLJFF) {
                    C1C7U.LIZIZ("LongVideoPopupNotificationManager@441a.reportServerPopupShown$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("exception", e.toString());
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
            C1637890six.LIZ.LIZ("long_video_popup_report_api_error", jSONObject, null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LongVideoPopupNotificationManager@441a.reportServerPopupShown$1");
        return unit;
    }
}
