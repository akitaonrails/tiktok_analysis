package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01Km, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.vm.StoryToPostShareVM$sendEventTrackingAsync$2$1", f = "StoryToPostShareVM.kt", l = {}, m = "invokeSuspend")
public final class C316201Km extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316201Km(String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316201Km(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryToPostShareVM@1e14.sendEventTrackingAsync$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C20684815ws.LJIJ(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoryToPostShareVM@1e14.sendEventTrackingAsync$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
