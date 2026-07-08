package X;

import Y.ARunnableS48S0300000_15;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0bff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982370bff extends C09AY implements Function1<Throwable, Unit> {
    public final /* synthetic */ AbstractC981980bf2<? extends InterfaceC983270bh7> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL = false;
    public final /* synthetic */ InterfaceC983270bh7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C982370bff(AbstractC981980bf2 abstractC981980bf2, int i, InterfaceC983270bh7 interfaceC983270bh7) {
        super(1);
        this.LL = abstractC981980bf2;
        this.LLILLJJLI = i;
        this.LLILZ = interfaceC983270bh7;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        Throwable th2 = th;
        AbstractC981980bf2<? extends InterfaceC983270bh7> abstractC981980bf2 = this.LL;
        abstractC981980bf2.LJI = false;
        EnumC974260bSa enumC974260bSaY2 = abstractC981980bf2.LIZ.Y2();
        if (this.LLILLJJLI >= 10) {
            if (enumC974260bSaY2 == EnumC974260bSa.SETTLE) {
                this.LL.LJJIII().LJJIJ.LJIIIZ = EnumC973680bRe.TIME_OUT;
                AbstractC981450beB.LJJIJL(this.LL, "multi_finish_retry", null, false, 14);
            }
        } else {
            C118300cf c118300cf = new C118300cf();
            c118300cf.element = this.LLILLJJLI + 1;
            if ((th2 instanceof C501520Jle) && ((C501520Jle) th2).getErrorCode() == 4029004) {
                c118300cf.element = 0;
            }
            if (!this.LLILLL && (enumC974260bSaY2 == EnumC974260bSa.SETTLE || enumC974260bSaY2 == EnumC974260bSa.START)) {
                AbstractC981980bf2<? extends InterfaceC983270bh7> abstractC981980bf22 = this.LL;
                C786410Ut5.LJLIIL(1000L, abstractC981980bf22.LJ, new ARunnableS48S0300000_15(c118300cf, abstractC981980bf22, this.LLILZ, 11));
            }
        }
        return Unit.LIZ;
    }
}
