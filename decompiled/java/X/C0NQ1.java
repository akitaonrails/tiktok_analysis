package X;

import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.AlertToneViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NQ1, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneMsgTypeFragmentKt$MessageNotificationToneMsgTypeContent$2$1", f = "MessageNotificationToneMsgTypeFragment.kt", l = {}, m = "invokeSuspend")
public final class C0NQ1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AlertToneViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NQ1(AlertToneViewModel alertToneViewModel, InterfaceC1364105Vn<? super C0NQ1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = alertToneViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NQ1(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageNotificationToneMsgTypeFragmentKt@8244.MessageNotificationToneMsgTypeContent$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.vQ2();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneMsgTypeFragmentKt@8244.MessageNotificationToneMsgTypeContent$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
