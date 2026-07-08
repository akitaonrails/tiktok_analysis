package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS163S1100000_14;
import njp.a;

/* JADX INFO: renamed from: X.0Yy5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment$onDestroyView$1$1", f = "MessageNotificationToneChooseFragment.kt", l = {416}, m = "invokeSuspend")
public final class C891430Yy5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageNotificationToneChooseFragment LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ AlertToneValueItem LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891430Yy5(MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, String str, AlertToneValueItem alertToneValueItem, InterfaceC1364105Vn<? super C891430Yy5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageNotificationToneChooseFragment;
        this.LLILLL = str;
        this.LLILZ = alertToneValueItem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891430Yy5(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageNotificationToneChooseFragment@ad8e.onDestroyView$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                MessageNotificationToneChooseFragment messageNotificationToneChooseFragment = this.LLILLJJLI;
                String str = this.LLILLL;
                AlertToneValueItem alertToneValueItem = this.LLILZ;
                AFwS201S0000000_14 aFwS201S0000000_14 = AFwS201S0000000_14.get$arr$(153);
                AwS163S1100000_14 awS163S1100000_14 = new AwS163S1100000_14(str, alertToneValueItem, 1);
                AFwS201S0000000_14 aFwS201S0000000_142 = AFwS201S0000000_14.get$arr$(154);
                this.LL = 1;
                if (messageNotificationToneChooseFragment.kS(str, alertToneValueItem, aFwS201S0000000_14, awS163S1100000_14, aFwS201S0000000_142, this) == objLJFF) {
                    C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onDestroyView$1$1");
                    return objLJFF;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onDestroyView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
