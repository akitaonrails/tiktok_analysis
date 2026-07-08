package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.dynamic.card.api.config.IMSparkViewReuseConfig;
import com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01br, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.feature.actionbar.resource.DMGeckoCommonChannelManager$fetchLynxChannel$2", f = "DMGeckoCommonChannelManager.kt", l = {}, m = "invokeSuspend")
public final class C368101br extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> LL;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C368101br(InterfaceC1631620sYq<? super String, ? super RequestParams, ? super Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C368101br> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631620sYq;
        this.LLILLJJLI = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C368101br(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IMSparkViewReuseConfig iMSparkViewReuseConfig;
        C1C7U.LIZ("DMGeckoCommonChannelManager@7bf7.fetchLynxChannel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IMSparkViewReuseConfig iMSparkViewReuseConfig2 = C368301bt.LIZ;
        try {
            SettingsManager.LIZLLL().getClass();
            iMSparkViewReuseConfig = (IMSparkViewReuseConfig) SettingsManager.LJII("im_spark_view_reuse_settings", IMSparkViewReuseConfig.class);
            if (iMSparkViewReuseConfig == null) {
                iMSparkViewReuseConfig = C368301bt.LIZ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            iMSparkViewReuseConfig = C368301bt.LIZ;
        }
        List listLJLIIIL = C13LP.LJLIIIL("tiktok_im_message_template_lynx", iMSparkViewReuseConfig.lynxResourceChannels);
        InterfaceC1631620sYq<String, RequestParams, Function1<? super C1533790q13, Unit>, C1533910q1F> interfaceC1631620sYq = this.LL;
        Function2<Boolean, String, Unit> function2 = this.LLILLJJLI;
        for (String str : (ArrayList) listLJLIIIL) {
            DMGeckoCommonChannelManager dMGeckoCommonChannelManager = DMGeckoCommonChannelManager.LIZ;
            DMGeckoCommonChannelManager.LJIILL(str, interfaceC1631620sYq, function2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("DMGeckoCommonChannelManager@7bf7.fetchLynxChannel$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
