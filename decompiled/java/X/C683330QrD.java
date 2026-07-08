package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.model.CartRefreshEvent;
import com.ss.android.ugc.aweme.ecommerce.search.cart.SearchCartAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QrD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.cart.SearchCartAssem$onReceiveJsEvent$2", f = "SearchCartAssem.kt", l = {212, 217}, m = "invokeSuspend")
public final class C683330QrD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SearchCartAssem LL;
    public Object LLILLJJLI;
    public Object LLILLL;
    public int LLILZ;
    public final /* synthetic */ SearchCartAssem LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ CartRefreshEvent LLIZ;
    public final /* synthetic */ View LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C683330QrD(SearchCartAssem searchCartAssem, int i, CartRefreshEvent cartRefreshEvent, View view, InterfaceC1364105Vn<? super C683330QrD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = searchCartAssem;
        this.LLILZLL = i;
        this.LLIZ = cartRefreshEvent;
        this.LLIZLLLIL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C683330QrD(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0180  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C683330QrD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
