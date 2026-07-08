package X;

import com.bytedance.scene.Scene;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.utils.FollowAddRedDotHelper$mobTriggerClientRedDot$1", f = "FollowAddRedDotHelper.kt", l = {}, m = "invokeSuspend")
public final class C059A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C059B LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C059A(boolean z, C059B c059b, InterfaceC1364105Vn<? super C059A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c059b;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C059A(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FollowAddRedDotHelper@bdeb.mobTriggerClientRedDot$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean z = this.LL;
        C059B c059b = this.LLILLJJLI;
        linkedHashMap.put("has_main_activity", String.valueOf(z ? 1 : 0));
        linkedHashMap.put(Scene.SCENE_SERVICE, c059b.getEventField());
        C20684815ws.LJIILLIIL("following_add_red_dot_trigger", linkedHashMap);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("FollowAddRedDotHelper@bdeb.mobTriggerClientRedDot$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
