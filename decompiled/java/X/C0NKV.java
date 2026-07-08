package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS158S1100000_9;
import njp.a;

/* JADX INFO: renamed from: X.0NKV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.customdot.bottomtab.BottomTabCustomDotHandler$tryToShowCustomIcon$1$1$2", f = "BottomTabCustomDotHandler.kt", l = {}, m = "invokeSuspend")
public final class C0NKV extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BottomTabCustomDotHandler LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NKV(BottomTabCustomDotHandler bottomTabCustomDotHandler, Bitmap bitmap, String str, InterfaceC1364105Vn<? super C0NKV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bottomTabCustomDotHandler;
        this.LLILLJJLI = bitmap;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NKV(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomTabCustomDotHandler@3c8b.tryToShowCustomIcon$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        BottomTabCustomDotHandler bottomTabCustomDotHandler = this.LL;
        bottomTabCustomDotHandler.LJIIIIZZ(EnumC1769360w90.SCALE, new AwS158S1100000_9(bottomTabCustomDotHandler, this.LLILLL, 7));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BottomTabCustomDotHandler@3c8b.tryToShowCustomIcon$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
