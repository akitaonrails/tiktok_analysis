package X;

import com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage;
import com.ss.android.ugc.aweme.favorites.base.ui.VisibilityAware;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ns4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.favorites.base.ui.BaseFavoritePage$onPageUnSelected$1", f = "BaseFavoritePage.kt", l = {}, m = "invokeSuspend")
public final class C607420Ns4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BaseFavoritePage LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C607420Ns4(BaseFavoritePage baseFavoritePage, InterfaceC1364105Vn<? super C607420Ns4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = baseFavoritePage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C607420Ns4(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseFavoritePage@5f8e.onPageUnSelected$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        VisibilityAware visibilityAware = (VisibilityAware) C1558520qew.LIZ(C1558360qeg.LJFF(this.LL, null), VisibilityAware.class, null);
        if (visibilityAware != null) {
            visibilityAware.onVisibilityChanged(false);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BaseFavoritePage@5f8e.onPageUnSelected$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
