package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS87S1000000_2;
import njp.a;

/* JADX INFO: renamed from: X.0Rqq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.bytedance.touchpoint.core.feedbanner.manager.SpecialCardPictureManager$loadImgFile$1$1$1", f = "SpecialCardPictureManager.kt", l = {}, m = "invokeSuspend")
public final class C708580Rqq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1322110kVd LLILLJJLI;
    public final /* synthetic */ C1897290zTL LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C708580Rqq(String str, C1322110kVd c1322110kVd, C1897290zTL c1897290zTL, InterfaceC1364105Vn<? super C708580Rqq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1322110kVd;
        this.LLILLL = c1897290zTL;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C708580Rqq(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SpecialCardPictureManager@8a59.loadImgFile$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            String str = this.LL;
            if (str == null) {
                str = "";
            }
            C0VSJ c0vsj = new C0VSJ(str);
            C1322110kVd c1322110kVd = this.LLILLJJLI;
            final C1897290zTL c1897290zTL = this.LLILLL;
            final String str2 = this.LL;
            interfaceC1897260zTILIZIZ.LIZLLL(c0vsj, c1322110kVd, "SpecialCardPictureManager", new InterfaceC1910160zo6() { // from class: X.0Rqr
                @Override // X.InterfaceC1910160zo6
                public final void onFailed(Throwable th) {
                }

                @Override // X.InterfaceC1910160zo6
                public final void onComplete() {
                    C1897290zTL c1897290zTL2 = c1897290zTL;
                    new AwS87S1000000_2(str2, 46);
                    c1897290zTL2.getClass();
                }
            });
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SpecialCardPictureManager@8a59.loadImgFile$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
