package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Oxv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.ui.innerskylight.FollowingInnerSkylightMobHelper$reportSkylightInnerCellClick$1$1", f = "FollowingInnerSkylightMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C636530Oxv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C636530Oxv(int i, String str, InterfaceC1364105Vn<? super C636530Oxv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C636530Oxv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws JSONException {
        C1C7U.LIZ("FollowingInnerSkylightMobHelper@384e.reportSkylightInnerCellClick$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = new JSONObject();
        int i = this.LL;
        String str = this.LLILLJJLI;
        jSONObject.put("enter_from", "homepage_follow");
        jSONObject.put("enter_method", "inner_feed_click");
        jSONObject.put("cell_type", "frequent_following");
        jSONObject.put("rank", i + 1);
        if (str != null) {
            jSONObject.put("author_id", str);
        }
        C20684815ws.LJIJ("topwindow_cell_click", jSONObject);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowingInnerSkylightMobHelper@384e.reportSkylightInnerCellClick$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
