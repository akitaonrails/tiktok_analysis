package X;

import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment$onCreateView$1$1$processUpdate$1$3$1", f = "MessageNotificationToneChooseFragment.kt", l = {}, m = "invokeSuspend")
public final class C1410005fW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageNotificationToneChooseFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1410005fW(MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, InterfaceC1364105Vn<? super C1410005fW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageNotificationToneChooseFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1410005fW(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL);
        c1389890mGx.LJIIIZ(R.string.m25);
        c1389890mGx.LJIIJJI();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
