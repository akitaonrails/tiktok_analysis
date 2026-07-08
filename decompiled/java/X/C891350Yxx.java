package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneItem;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yxx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneMsgTypeFragmentKt$MessageNotificationToneMsgTypeContent$3$2$1", f = "MessageNotificationToneMsgTypeFragment.kt", l = {}, m = "invokeSuspend")
public final class C891350Yxx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ List<AlertToneItem> LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891350Yxx(Context context, List<AlertToneItem> list, Function0<Unit> function0, InterfaceC1364105Vn<? super C891350Yxx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = list;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891350Yxx(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Activity activity;
        C1C7U.LIZ("MessageNotificationToneMsgTypeFragmentKt@8244.MessageNotificationToneMsgTypeContent$3$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C891440Yy6 c891440Yy6 = MessageNotificationToneChooseFragment.LLJJIJIL;
        Context context = this.LL;
        AlertToneItem alertToneItemLIZ = AlertToneItem.LIZ((AlertToneItem) C13LP.LJJJJZI(this.LLILLJJLI), this.LL.getString(2131827521), null, 13);
        c891440Yy6.getClass();
        C891440Yy6.LIZ(context, alertToneItemLIZ);
        Context context2 = this.LL;
        if ((context2 instanceof Activity) && (activity = (Activity) context2) != null) {
            activity.finish();
            C786410Ut5.ae(0, activity, 0);
        } else {
            this.LLILLL.invoke();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneMsgTypeFragmentKt@8244.MessageNotificationToneMsgTypeContent$3$2$1");
        return unit;
    }
}
