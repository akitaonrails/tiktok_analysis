package X;

import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GyX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.chatroomeasteregg.assem.EasterEggForShareAssem$onShareEffectNotifyEvent$1", f = "EasterEggForShareAssem.kt", l = {}, m = "invokeSuspend")
public final class C433070GyX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C433080GyY LL;
    public final /* synthetic */ EasterEggForShareAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433070GyX(C433080GyY c433080GyY, EasterEggForShareAssem easterEggForShareAssem, InterfaceC1364105Vn<? super C433070GyX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c433080GyY;
        this.LLILLJJLI = easterEggForShareAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433070GyX(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FrameLayout frameLayout;
        C1C7U.LIZ("EasterEggForShareAssem@d88a.onShareEffectNotifyEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        int i = this.LL.LIZIZ;
        if (i != 1) {
            if (i == 2) {
                View viewLJJIJL = this.LLILLJJLI.LJJIJL();
                if ((viewLJJIJL instanceof FrameLayout) && (frameLayout = (FrameLayout) viewLJJIJL) != null) {
                    C786410Ut5.LJJJZ(this.LLILLJJLI.LLJJIJI, frameLayout);
                }
            }
        } else {
            Function0 function0 = (Function0) ((Map) this.LLILLJJLI.LLJJI.getValue()).get(this.LL.LIZ);
            if (function0 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("EasterEggForShareAssem@d88a.onShareEffectNotifyEvent$1");
                return unit;
            }
            function0.invoke();
            ((Map) this.LLILLJJLI.LLJJI.getValue()).remove(this.LL.LIZ);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EasterEggForShareAssem@d88a.onShareEffectNotifyEvent$1");
        return unit2;
    }
}
