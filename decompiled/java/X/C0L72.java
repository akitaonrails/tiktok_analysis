package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.IAVServiceProxy;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L72, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.toolbar.ReplaceMusicServiceImpl$doReeditRequest$1$2$1", f = "ReplaceMusicServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0L72 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0L72(Context context, InterfaceC1364105Vn<? super C0L72> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0L72(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG c19eg;
        InterfaceC376620Epg applicationService;
        C1C7U.LIZ("ReplaceMusicServiceImpl@cb3a.doReeditRequest$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Context context = this.LL;
        if ((context instanceof C19EG) && (c19eg = (C19EG) context) != null) {
            IAVServiceProxy iAVServiceProxy = (IAVServiceProxy) PluggableExtentionKt.pluggableSpi$default(IAVServiceProxy.class, false, false, false, 14, null);
            if (iAVServiceProxy != null && (applicationService = iAVServiceProxy.getApplicationService()) != null) {
                ((C19221910Hx) applicationService).LJII(c19eg);
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doReeditRequest$1$2$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("ReplaceMusicServiceImpl@cb3a.doReeditRequest$1$2$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
