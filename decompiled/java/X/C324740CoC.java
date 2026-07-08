package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$fetchEnterSug$1", f = "MessageViewModel.kt", l = {4032}, m = "invokeSuspend")
public final class C324740CoC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<TakoSug, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C324740CoC(MessageViewModel messageViewModel, String str, boolean z, boolean z2, Function1<? super TakoSug, Unit> function1, InterfaceC1364105Vn<? super C324740CoC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = str;
        this.LLILZ = z;
        this.LLILZIL = z2;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324740CoC(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        Map<String, String> commonParams;
        C1C7U.LIZ("MessageViewModel@9229.fetchEnterSug$1");
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
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            TakoEnterParams takoEnterParams = this.LLILLJJLI.LLILLL;
            if (takoEnterParams != null) {
                commonParams = takoEnterParams.getCommonParams();
            } else {
                commonParams = null;
            }
            c1862330yYx.getClass();
            C20235014Fo c20235014Fo = C1862330yYx.LIZLLL;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("time_stamp", System.currentTimeMillis());
            C1862330yYx.LLII(jSONObject, commonParams);
            c20235014Fo.LIZIZ("tikbot_fetch_first_round_sug", jSONObject);
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                String str = this.LLILLL;
                boolean z = this.LLILZ;
                boolean z2 = this.LLILZIL;
                Function1<TakoSug, Unit> function1 = this.LLILZLL;
                this.LL = 1;
                if (c1863380yae.LJIIIZ(str, z, false, null, z2, function1, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.fetchEnterSug$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.fetchEnterSug$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
