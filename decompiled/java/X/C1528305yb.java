package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05yb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tracker.OnboardingCardTracker$report$1", f = "OnboardingCardTracker.kt", l = {}, m = "invokeSuspend")
public final class C1528305yb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Integer LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1528305yb(String str, String str2, String str3, Integer num, String str4, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = num;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1528305yb(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZIL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("OnboardingCardTracker@ef26.report$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0I0B.LJFF.LIZIZ();
        String str = this.LL;
        JSONObject jSONObject = new JSONObject();
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        String str4 = this.LLILZ;
        Integer num = this.LLILZIL;
        jSONObject.put(Scene.SCENE_SERVICE, str2);
        jSONObject.put("conversation_id", str3);
        jSONObject.put("chat_type", C1229100i5c.LIZLLL(str3));
        if (str4 != null) {
            jSONObject.put("button_name", str4);
        }
        jSONObject.put("group_type", C1229100i5c.LJI(str3));
        jSONObject.put("group_owner_account_type", C1528505yd.LIZ(C461720I8s.LIZIZ()));
        jSONObject.put("group_role", EnumC045800Em.OWNER.getValue());
        if (num != null) {
            jSONObject.put("progress_status", num.intValue());
        }
        C20684815ws.LJIJ(str, jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("OnboardingCardTracker@ef26.report$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
