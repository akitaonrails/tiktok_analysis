package X;

import com.ss.android.ugc.aweme.im.streak.api.IStreakService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.jsb.SelectConversationMethodIDL$dataItemToJSBModel$1", f = "SelectConversationMethodIDL.kt", l = {}, m = "invokeSuspend")
public final class C1500805uA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1500805uA(String str, InterfaceC1364105Vn<? super C1500805uA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1500805uA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SelectConversationMethodIDL@a126.dataItemToJSBModel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IStreakService.LJJIIZ.getClass();
        C06LY.LIZ().q(this.LL, null);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SelectConversationMethodIDL@a126.dataItemToJSBModel$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
