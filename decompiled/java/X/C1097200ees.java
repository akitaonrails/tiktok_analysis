package X;

import com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ees, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.chatroom.viewmodule.MiddleTouchWidget$createSparkViewOnDemand$3", f = "MiddleTouchWidget.kt", l = {}, m = "invokeSuspend")
public final class C1097200ees extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MiddleTouchWidget LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1097200ees(MiddleTouchWidget middleTouchWidget, InterfaceC1364105Vn<? super C1097200ees> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = middleTouchWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1097200ees(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MiddleTouchWidget@3b6f.createSparkViewOnDemand$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.O1();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MiddleTouchWidget@3b6f.createSparkViewOnDemand$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
