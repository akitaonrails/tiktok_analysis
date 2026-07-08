package X;

import android.content.res.AssetManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05ZA, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lancet.CookieManagerOptHelper$checkAndFixAssetsInMainThread$1$1$1", f = "CookieManagerOptHelper.kt", l = {}, m = "invokeSuspend")
public final class C05ZA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C013C LL;
    public final /* synthetic */ AssetManager LLILLJJLI;
    public final /* synthetic */ Runnable LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05ZA(C013C c013c, AssetManager assetManager, Runnable runnable, InterfaceC1364105Vn<? super C05ZA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c013c;
        this.LLILLJJLI = assetManager;
        this.LLILLL = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05ZA(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CookieManagerOptHelper@8555.checkAndFixAssetsInMainThread$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.element = C05ZB.LIZIZ(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CookieManagerOptHelper@8555.checkAndFixAssetsInMainThread$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
