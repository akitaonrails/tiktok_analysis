package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Tco, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.frequency.FeedbackSurveyUtils$saveLocalAwemeData$1", f = "FeedbackSurveyUtils.kt", l = {}, m = "invokeSuspend")
public final class C750840Tco extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C750840Tco(InterfaceC1364105Vn<? super C750840Tco> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750840Tco(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FeedbackSurveyUtils@4f45.saveLocalAwemeData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Keva keva = C20291414aW.LJ;
            Gson gson = C7740030o.LIZ().getGson();
            C20291414aW.LIZ.getClass();
            keva.storeString("local_aweme_data", gson.LJIILL(C20291414aW.LIZJ.LIZ(16)));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FeedbackSurveyUtils@4f45.saveLocalAwemeData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C750840Tco(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
