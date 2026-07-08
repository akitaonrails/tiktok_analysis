package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.monitor.StreakResMonitor$onLoadStreakUnlockAnimRes$1", f = "StreakResMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1511605vu extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AnonymousClass0664 LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511605vu(AnonymousClass0664 anonymousClass0664, String str, int i, String str2, int i2, InterfaceC1364105Vn<? super C1511605vu> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = anonymousClass0664;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1511605vu(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakResMonitor@1a60.onLoadStreakUnlockAnimRes$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0I0B.LJFF.LIZIZ();
        AnonymousClass0664 anonymousClass0664 = this.LL;
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        int i2 = this.LLILZIL;
        anonymousClass0664.getClass();
        C20684815ws.LJIILLIIL("streak_unlock_anim_load_status", AnonymousClass0664.LIZ(i, i2, str, str2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakResMonitor@1a60.onLoadStreakUnlockAnimRes$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
