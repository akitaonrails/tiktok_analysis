package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS246S0300000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS633S0100000_19;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.05vo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment$onCreateView$1$1$processUpdate$1", f = "MessageNotificationToneChooseFragment.kt", l = {215, 218}, m = "invokeSuspend")
public final class C1511005vo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageNotificationToneChooseFragment LLILLJJLI;
    public final /* synthetic */ AlertToneValueItem LLILLL;
    public final /* synthetic */ C05P0<String> LLILZ;
    public final /* synthetic */ C05P0<String> LLILZIL;
    public final /* synthetic */ C05P0<Boolean> LLILZLL;
    public final /* synthetic */ C05P0<AlertToneValueItem> LLIZ;
    public final /* synthetic */ InterfaceC497601wk LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511005vo(MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, AlertToneValueItem alertToneValueItem, C05P0<String> c05p0, C05P0<String> c05p02, C05P0<Boolean> c05p03, C05P0<AlertToneValueItem> c05p04, InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1511005vo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageNotificationToneChooseFragment;
        this.LLILLL = alertToneValueItem;
        this.LLILZ = c05p0;
        this.LLILZIL = c05p02;
        this.LLILZLL = c05p03;
        this.LLIZ = c05p04;
        this.LLIZLLLIL = interfaceC497601wk;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1511005vo(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AlertToneValueItem value;
        C1C7U.LIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZLL.setValue(Boolean.FALSE);
                    value = this.LLIZ.getValue();
                    this.LLIZ.setValue(null);
                    this.LLILLJJLI.LLJILLL = null;
                    if (value != null && !Intrinsics.LJFF(value.alertToneValue, this.LLILZ.getValue())) {
                        AwS633S0100000_19.LIZ$1(this.LLILLJJLI, this.LLIZLLLIL, this.LLILZLL, this.LLILZ, this.LLILZIL, this.LLIZ, value);
                    }
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MessageNotificationToneChooseFragment messageNotificationToneChooseFragment = this.LLILLJJLI;
            AlertToneValueItem alertToneValueItem = this.LLILLL;
            this.LL = 1;
            if (messageNotificationToneChooseFragment.hS(alertToneValueItem, this) == objLJFF) {
                C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1");
                return objLJFF;
            }
        }
        this.LLILZ.getValue();
        MessageNotificationToneChooseFragment messageNotificationToneChooseFragment2 = this.LLILLJJLI;
        String str = messageNotificationToneChooseFragment2.VR().alertToneScene;
        if (str == null) {
            str = "";
        }
        AlertToneValueItem alertToneValueItem2 = this.LLILLL;
        AwS246S0300000_2 awS246S0300000_2 = new AwS246S0300000_2(alertToneValueItem2, (AlertToneValueItem) this.LLILLJJLI, (MessageNotificationToneChooseFragment) this.LLILZIL, (C05P0<String>) 5);
        AwS246S0300000_2 awS246S0300000_22 = new AwS246S0300000_2(this.LLILLL, (AlertToneValueItem) this.LLILLJJLI, (MessageNotificationToneChooseFragment) this.LLILZ, (C05P0<String>) 6);
        AwS403S0200000_2 awS403S0200000_2 = new AwS403S0200000_2(this.LLILLL, this.LLILLJJLI, 18);
        this.LL = 2;
        if (messageNotificationToneChooseFragment2.kS(str, alertToneValueItem2, awS246S0300000_2, awS246S0300000_22, awS403S0200000_2, this) == objLJFF) {
            C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1");
            return objLJFF;
        }
        this.LLILZLL.setValue(Boolean.FALSE);
        value = this.LLIZ.getValue();
        this.LLIZ.setValue(null);
        this.LLILLJJLI.LLJILLL = null;
        if (value != null) {
            AwS633S0100000_19.LIZ$1(this.LLILLJJLI, this.LLIZLLLIL, this.LLILZLL, this.LLILZ, this.LLILZIL, this.LLIZ, value);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.onCreateView$1$1$processUpdate$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
