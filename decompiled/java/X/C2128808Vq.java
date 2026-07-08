package X;

import android.content.Context;
import com.bytedance.ies.ugc.aweme.plugin.service.IPluginService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.legoImp.task.SplitCompatInstall;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import com.tiktok.ef.i18n.service.manager.I18nServiceApi;
import com.tiktok.ef.i18nmanagerapi.service.i18n.I18nManagerServiceApi;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.08Vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.legoImp.task.SplitCompatInstall$run$1$1", f = "SplitCompatInstall.kt", l = {}, m = "invokeSuspend")
public final class C2128808Vq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2128808Vq(Context context, InterfaceC1364105Vn<? super C2128808Vq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2128808Vq(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Locale localeLJIIZILJ;
        I18nManagerServiceApi i18nManagerServiceApiLIZ;
        C1C7U.LIZ("SplitCompatInstall@3407.run$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SplitCompatInstall splitCompatInstall = SplitCompatInstall.LL;
        Context context = this.LL;
        splitCompatInstall.getClass();
        I18nServiceApi i18nServiceApi = (I18nServiceApi) PluggableExtentionKt.pluggableSpi$default(I18nServiceApi.class, false, false, false, 14, null);
        if (i18nServiceApi == null || (i18nManagerServiceApiLIZ = i18nServiceApi.LIZ()) == null || (localeLJIIZILJ = i18nManagerServiceApiLIZ.LJIIZILJ(context)) == null) {
            localeLJIIZILJ = context.getResources().getConfiguration().locale;
        }
        String strT2 = C786410Ut5.t2(localeLJIIZILJ);
        if (!Intrinsics.LJFF(strT2, "en")) {
            ((IPluginService) ServiceManager.get().getService(IPluginService.class)).LIZLLL().getClass();
            C2109608Og.LIZIZ(context, strT2, true);
            NxRewordManager.LJ(localeLJIIZILJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SplitCompatInstall@3407.run$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
