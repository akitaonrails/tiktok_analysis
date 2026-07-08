package X;

import Y.ARunnableS127S0100000_27;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xDw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.rank.impl.list.bulletin.BulletinView$startDisplay$1$1$1$onMarqueeEnd$2", f = "BulletinView.kt", l = {314}, m = "invokeSuspend")
public final class C1810860xDw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1810810xDr LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1810860xDw(C1810810xDr c1810810xDr, InterfaceC1364105Vn<? super C1810860xDw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1810810xDr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1810860xDw(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BulletinView@89c6.startDisplay$1$1$1$onMarqueeEnd$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(8000L, this) == objLJFF) {
                C1C7U.LIZIZ("BulletinView@89c6.startDisplay$1$1$1$onMarqueeEnd$2");
                return objLJFF;
            }
        }
        C1810810xDr c1810810xDr = this.LLILLJJLI;
        c1810810xDr.LIZJ(new ARunnableS127S0100000_27(c1810810xDr, 2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BulletinView@89c6.startDisplay$1$1$1$onMarqueeEnd$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
