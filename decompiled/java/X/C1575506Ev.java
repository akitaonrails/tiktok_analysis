package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.streak.impl.pet.widget.StreakPetWidget$notifyWidgetVisibilityChange$1", f = "StreakPetWidget.kt", l = {}, m = "invokeSuspend")
public final class C1575506Ev extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ C06HD LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1575506Ev(C06HD c06hd, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = c06hd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1575506Ev(this.LLILLJJLI, interfaceC1364105Vn, this.LL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StreakPetWidget@92f0.notifyWidgetVisibilityChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL) {
            this.LLILLJJLI.LLILZ.LIZJ();
            C06HD c06hd = this.LLILLJJLI;
            if (!c06hd.LLJJI) {
                C066Y c066y = C066Y.LIZIZ;
                String str = c06hd.LLILLL;
                InterfaceC1493505sz interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
                c066y.getClass();
                C23250099c.LIZLLL(C066Y.LJ, null, null, new C1514105wJ(interfaceC1493505szLIZIZ, str, null), 3);
                this.LLILLJJLI.LLJJI = true;
            }
        } else {
            this.LLILLJJLI.LLILZ.LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StreakPetWidget@92f0.notifyWidgetVisibilityChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
