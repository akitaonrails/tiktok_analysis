package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.verticalsearch.dynamictab.fragment.BaseSearchDynamicTabFragment$mobRefreshData$1", f = "BaseSearchDynamicTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C647150PZx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ BaseSearchDynamicTabFragment<Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C647150PZx(String str, BaseSearchDynamicTabFragment<Object> baseSearchDynamicTabFragment, InterfaceC1364105Vn<? super C647150PZx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = baseSearchDynamicTabFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C647150PZx(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSearchDynamicTabFragment@6d6b.mobRefreshData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key_word", this.LL);
            String str = ((C646670PYb) C0Q3E.LIZIZ(this.LLILLJJLI).Jh0().LIZJ()).LLILZLL;
            if (Intrinsics.LJFF(str, "search_history")) {
                C0Q3E.LIZIZ(this.LLILLJJLI).fe(new C647160PZy("search_history"));
            } else if (Intrinsics.LJFF(str, "search_sug")) {
                C0Q3E.LIZIZ(this.LLILLJJLI).fe(new C647160PZy("search_sug"));
            } else {
                C0Q3E.LIZIZ(this.LLILLJJLI).fe(new C647160PZy("normal_search"));
            }
            jSONObject.put("enter_from", str);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        MobClick mobClickObtain = MobClick.obtain();
        mobClickObtain.setEventName("search");
        mobClickObtain.setLabelName(this.LLILLJJLI.cS().searchType);
        mobClickObtain.setJsonObject(jSONObject);
        C20684815ws.onEvent(mobClickObtain);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseSearchDynamicTabFragment@6d6b.mobRefreshData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
