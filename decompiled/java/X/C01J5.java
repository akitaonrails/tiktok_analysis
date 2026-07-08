package X;

import com.bytedance.android.livesdk.goal.model.GetResponse;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01J5, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.wishlistv2.LiveStreamGoalPresenter$getGoalInfo$1$2$1$data$1", f = "LiveStreamGoalPresenter.kt", l = {}, m = "invokeSuspend")
public final class C01J5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super GetResponse.Data>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01J5(String str, InterfaceC1364105Vn<? super C01J5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C01J5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        GetResponse.Data data;
        C1C7U.LIZ("LiveStreamGoalPresenter@dd38.getGoalInfo$1$2$1$data$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            data = (GetResponse.Data) C19748512Ol.LIZJ.LJII(JSONObjectProtectorUtils.getString(new JSONObject(this.LL), "live_goal_indicator_stream_goal"), GetResponse.Data.class);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C20441214yg.LJII(th);
            data = null;
        }
        C1C7U.LIZIZ("LiveStreamGoalPresenter@dd38.getGoalInfo$1$2$1$data$1");
        return data;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super GetResponse.Data> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
