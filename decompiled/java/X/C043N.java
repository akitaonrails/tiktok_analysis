package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.core.services.cartservice.CartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.043N, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043N extends C09AY implements Function0<Unit> {
    public final /* synthetic */ CartService LL;
    public final /* synthetic */ C043Y LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ AnonymousClass0431 LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ EnterCartParam LLILZLL;
    public final /* synthetic */ InterfaceC1748810vbr LLIZ = null;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C043N(CartService cartService, C043Y c043y, boolean z, AnonymousClass0431 anonymousClass0431, View view, EnterCartParam enterCartParam) {
        super(0);
        this.LL = cartService;
        this.LLILLJJLI = c043y;
        this.LLILLL = z;
        this.LLILZ = anonymousClass0431;
        this.LLILZIL = view;
        this.LLILZLL = enterCartParam;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C23250099c.LIZLLL(C817503Hh.LL, null, null, new AnonymousClass0438(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, null), 3);
        return Unit.LIZ;
    }
}
