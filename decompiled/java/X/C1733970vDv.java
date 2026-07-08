package X;

import android.view.View;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0vDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.livewindow.WindowLivePlayerCompat$playPrepared$1", f = "WindowLivePlayerCompat.kt", l = {}, m = "invokeSuspend")
public final class C1733970vDv extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C16E0 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1733970vDv(C16E0 c16e0, InterfaceC1364105Vn<? super C1733970vDv> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c16e0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("WindowLivePlayerCompat@3896.playPrepared$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJ(!r2.LLILZIL, true);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("WindowLivePlayerCompat@3896.playPrepared$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1733970vDv(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
