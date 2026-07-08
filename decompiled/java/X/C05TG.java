package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS246S0300000_2;
import njp.a;

/* JADX INFO: renamed from: X.05TG, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.alerttone.settings.MessageNotificationToneChooseFragmentKt$MessageNotificationToneChooseContent$4$1", f = "MessageNotificationToneChooseFragment.kt", l = {744, 748}, m = "invokeSuspend")
public final class C05TG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1689390u41 LLILLL;
    public final /* synthetic */ View LLILZ;
    public final /* synthetic */ InterfaceC1676320tiw LLILZIL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05TG(boolean z, C1689390u41 c1689390u41, View view, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1676320tiw interfaceC1676320tiw2, InterfaceC1364105Vn<? super C05TG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1689390u41;
        this.LLILZ = view;
        this.LLILZIL = interfaceC1676320tiw;
        this.LLILZLL = interfaceC1676320tiw2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05TG(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$4$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$4$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLJJLI) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$4$1");
                return unit2;
            }
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS246S0300000_2(this.LLILLL, this.LLILZIL, this.LLILZLL, 7));
            C1310205Au c1310205Au = new C1310205Au(null);
            this.LL = 1;
            if (C09IC.LJIJ(c095dLJIIIZ, this, c1310205Au) == objLJFF) {
                C1C7U.LIZIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$4$1");
                return objLJFF;
            }
        }
        int iLJ = C13LZ.LJ(((this.LLILZIL.LIZLLL() + this.LLILLL.LJII()) + (this.LLILZLL.LIZLLL() / 2)) - (this.LLILZ.getHeight() / 2), 0, this.LLILLL.LJI());
        C1689390u41 c1689390u41 = this.LLILLL;
        this.LL = 2;
        if (c1689390u41.LJIIIIZZ(iLJ, this) == objLJFF) {
            C1C7U.LIZIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$4$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MessageNotificationToneChooseFragmentKt@7991.MessageNotificationToneChooseContent$4$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
