package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GyU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$showVideoRain$1$3$1$3$1", f = "EasterEggForShareAssem.kt", l = {}, m = "invokeSuspend")
public final class C433040GyU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EasterEggForShareAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433040GyU(EasterEggForShareAssem easterEggForShareAssem, InterfaceC1364105Vn<? super C433040GyU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = easterEggForShareAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433040GyU(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout frameLayout;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        View viewLJJIJL = this.LL.LJJIJL();
        if ((viewLJJIJL instanceof FrameLayout) && (frameLayout = (FrameLayout) viewLJJIJL) != null) {
            C786410Ut5.LJJJZ(this.LL.LLJJIJI, frameLayout);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.showVideoRain$1$3$1$3$1");
        return unit;
    }
}
