package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.preload.api.IIMPreloadService;
import java.util.Collections;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZX5, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.skeleton.content.VoiceAssem$triggerPreloadIfNeeded$1", f = "VoiceAssem.kt", l = {}, m = "invokeSuspend")
public final class C0ZX5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0ZXC LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0ZX5(C0ZXC c0zxc, InterfaceC1364105Vn<? super C0ZX5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0zxc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0ZX5(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceAssem@7e6f.triggerPreloadIfNeeded$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        IIMPreloadService iIMPreloadService = (IIMPreloadService) PluggableExtentionKt.pluggableSpiForReal(IIMPreloadService.class);
        if (iIMPreloadService != null && iIMPreloadService.LIZ() != null) {
            C1329305Id.LIZJ(Collections.singletonList(new C047900Fh(C0I6Y.LIZ(this.LL).getUuid(), C2097908Jt.LIZJ(new Pair("MESSAGE", C0I6Y.LIZ(this.LL))))));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceAssem@7e6f.triggerPreloadIfNeeded$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
