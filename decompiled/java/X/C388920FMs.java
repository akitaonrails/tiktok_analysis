package X;

import com.bytedance.tux.input.TuxTextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0FMs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.poi.anchor.banner.PoiReTagBottomBarScene$setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1", f = "PoiRetagBottomBarAssem.kt", l = {723}, m = "invokeSuspend")
public final class C388920FMs extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1201010hMJ LLILLJJLI;
    public final /* synthetic */ TuxTextView LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C388920FMs(TuxTextView tuxTextView, C1201010hMJ c1201010hMJ, String str, String str2, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1201010hMJ;
        this.LLILLL = tuxTextView;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C388920FMs(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("PoiReTagBottomBarScene@a3f1.setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            C388910FMr c388910FMr = new C388910FMr(this.LLILLL, this.LLILLJJLI, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            obj = C23250099c.LJI(this, c1dfh, c388910FMr);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PoiReTagBottomBarScene@a3f1.setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1");
                return objLJFF;
            }
        }
        C443120HZe c443120HZe = (C443120HZe) obj;
        Object first = c443120HZe.getFirst();
        this.LLILLJJLI.LJFF(this.LLILLL, String.valueOf(first), ((Number) c443120HZe.getSecond()).intValue(), ((Number) c443120HZe.getThird()).intValue());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PoiReTagBottomBarScene@a3f1.setExpTitleTv$1$globalLayoutListener$1$onGlobalLayout$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
