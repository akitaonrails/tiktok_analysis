package X;

import android.content.Context;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Kg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.assem.StreakPetWidgetAssem$restoreWidgetPosition$1$1", f = "StreakPetWidgetAssem.kt", l = {}, m = "invokeSuspend")
public final class C1589606Kg extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ StreakPetWidgetAssem LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1589606Kg(StreakPetWidgetAssem streakPetWidgetAssem, int i, int i2, InterfaceC1364105Vn<? super C1589606Kg> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = streakPetWidgetAssem;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1589606Kg(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("StreakPetWidgetAssem@8027.restoreWidgetPosition$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StreakPetWidgetAssem streakPetWidgetAssem = this.LL;
        int width = this.LLILLJJLI;
        if (width == -1) {
            width = (streakPetWidgetAssem.LJJIJL().getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(this.LL.LLJJI.width)))) - this.LL.LLJJIII.right;
        }
        streakPetWidgetAssem.LLJLILLLLZIIL = width;
        StreakPetWidgetAssem streakPetWidgetAssem2 = this.LL;
        int i = this.LLILLL;
        if (i == -1) {
            i = streakPetWidgetAssem2.LLJJIJI;
        }
        streakPetWidgetAssem2.LLJLL = i;
        streakPetWidgetAssem2.kp(streakPetWidgetAssem2.LLJLILLLLZIIL, i);
        C06HD c06hdIp = this.LL.ip();
        int scaledTouchSlop = 0;
        if (c06hdIp != null) {
            if (this.LLILLJJLI == C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(this.LL.LLJJIII.left)))) {
                z = true;
            } else {
                z = false;
            }
            c06hdIp.LJFF(true, z);
        }
        C06HD c06hdIp2 = this.LL.ip();
        if (c06hdIp2 != null) {
            C23250099c.LIZLLL(c06hdIp2.LLJJIII, null, null, new C1575406Eu(c06hdIp2, null), 3);
        }
        StreakPetWidgetAssem streakPetWidgetAssem3 = this.LL;
        C06MJ c06mj = streakPetWidgetAssem3.LLJJJIL;
        if (c06mj != null) {
            HandlerHook.viewPost(c06mj, new RunnableC1590106Kl(streakPetWidgetAssem3));
        }
        StreakPetWidgetAssem streakPetWidgetAssem4 = this.LL;
        streakPetWidgetAssem4.LLJLLIL = streakPetWidgetAssem4.LJJIJL().getWidth();
        StreakPetWidgetAssem streakPetWidgetAssem5 = this.LL;
        streakPetWidgetAssem5.LLJLLL = streakPetWidgetAssem5.LJJIJL().getHeight();
        this.LL.LJJIJL().addOnLayoutChangeListener(this.LL.LLLFZ);
        StreakPetWidgetAssem streakPetWidgetAssem6 = this.LL;
        Context context = streakPetWidgetAssem6.getContext();
        if (context != null) {
            scaledTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop() / 2;
        }
        streakPetWidgetAssem6.LLJZ = Math.max(10, scaledTouchSlop);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidgetAssem@8027.restoreWidgetPosition$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
