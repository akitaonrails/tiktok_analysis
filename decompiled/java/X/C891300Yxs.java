package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import com.ss.android.ugc.aweme.im.push.api.alerttone.service.IMessageAlertToneService;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.impl.MessageAlertToneService;
import com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment;
import com.ss.android.ugc.awemepushapi.IPushApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0Yxs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragment$playAlertTone$2", f = "MessageNotificationToneChooseFragment.kt", l = {}, m = "invokeSuspend")
public final class C891300Yxs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AlertToneValueItem LL;
    public final /* synthetic */ MessageNotificationToneChooseFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C891300Yxs(AlertToneValueItem alertToneValueItem, MessageNotificationToneChooseFragment messageNotificationToneChooseFragment, InterfaceC1364105Vn<? super C891300Yxs> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = alertToneValueItem;
        this.LLILLJJLI = messageNotificationToneChooseFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C891300Yxs(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMessageAlertToneService iMessageAlertToneServiceLIZ;
        Uri defaultPushSoundUri;
        C1C7U.LIZ("MessageNotificationToneChooseFragment@ad8e.playAlertTone$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            IMessageAlertToneService.LIZ.getClass();
            iMessageAlertToneServiceLIZ = C891310Yxt.LIZ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (iMessageAlertToneServiceLIZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.playAlertTone$2");
            return unit;
        }
        String str = this.LL.alertToneValueUrl;
        if (str != null && str.length() > 0) {
            MessageNotificationToneChooseFragment messageNotificationToneChooseFragment = this.LLILLJJLI;
            String str2 = this.LL.alertToneValue;
            String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            messageNotificationToneChooseFragment.iS(str2, str);
            MessageNotificationToneChooseFragment messageNotificationToneChooseFragment2 = this.LLILLJJLI;
            String str4 = this.LL.alertToneValue;
            if (str4 != null) {
                str3 = str4;
            }
            MessageAlertToneService.LJ.getClass();
            iMessageAlertToneServiceLIZ.LJIIIIZZ(str, messageNotificationToneChooseFragment2, str3, C891040YxS.LIZ());
        } else if (Intrinsics.LJFF(this.LL.alertToneValue, EnumC891100YxY.DEFAULT.getAlertValue())) {
            IPushApi.Companion.getClass();
            IPushApi value = C815820VzQ.LIZIZ.getValue();
            if (value != null && (defaultPushSoundUri = value.getDefaultPushSoundUri()) != null) {
                MessageNotificationToneChooseFragment messageNotificationToneChooseFragment3 = this.LLILLJJLI;
                MessageAlertToneService.LJ.getClass();
                iMessageAlertToneServiceLIZ.LJIILJJIL(defaultPushSoundUri, messageNotificationToneChooseFragment3, C891040YxS.LIZ());
            } else {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.playAlertTone$2");
                return unit2;
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneChooseFragment@ad8e.playAlertTone$2");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
