package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.saas.host.api.im.IMHostApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Aq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragmentKt$MessageNotificationToneChooseContent$3$1", f = "MessageNotificationToneChooseFragment.kt", l = {}, m = "invokeSuspend")
public final class C1309805Aq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EnumC12978056a LL;
    public final /* synthetic */ C056Y LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C05P0<String> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309805Aq(EnumC12978056a enumC12978056a, C056Y c056y, String str, String str2, String str3, C05P0<String> c05p0, InterfaceC1364105Vn<? super C1309805Aq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = enumC12978056a;
        this.LLILLJJLI = c056y;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
        this.LLILZLL = c05p0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309805Aq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        long jCurrentTimeMillis2;
        C1C7U.LIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC12978056a enumC12978056a = this.LL;
        if (enumC12978056a != null) {
            C056Y c056y = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            C05P0<String> c05p0 = this.LLILZLL;
            if (c05p0.getValue() == null) {
                c05p0.setValue(enumC12978056a.name());
                C056X.LIZ.getClass();
                InterfaceC1411705fn interfaceC1411705fnLIZIZ = C056X.LIZIZ(c056y, enumC12978056a);
                if (interfaceC1411705fnLIZIZ != null) {
                    IMHostApi iMHostApi = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi != null) {
                        jCurrentTimeMillis = iMHostApi.LIZIZ();
                    } else {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    IMHostApi iMHostApi2 = (IMHostApi) PluggableExtentionKt.pluggableSpiForReal(IMHostApi.class);
                    if (iMHostApi2 != null) {
                        jCurrentTimeMillis2 = iMHostApi2.LIZIZ();
                    } else {
                        jCurrentTimeMillis2 = System.currentTimeMillis();
                    }
                    interfaceC1411705fnLIZIZ.LIZLLL(jCurrentTimeMillis, jCurrentTimeMillis2, "");
                }
                C1495805tM.LIZ.getClass();
                C1495805tM.LJ("ttsocial_alert_tones_settings_banner_show", C1495805tM.LIZ(str, str2, str3, enumC12978056a));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
