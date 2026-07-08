package X;

import android.content.Context;
import android.net.Uri;
import com.ss.android.ugc.aweme.commercialize.depend.AdRouterHandlerDependImpl;
import com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0cqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1027460cqO implements IAdRouterHandlerDepend {
    public static final C1027460cqO LIZIZ = new C1027460cqO();
    public final /* synthetic */ IAdRouterHandlerDepend LIZ = AdRouterHandlerDependImpl.LIZIZ();

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LIZ(String str) {
        this.LIZ.LIZ(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LIZJ(Context context, String str) {
        return this.LIZ.LIZJ(context, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final String LIZLLL() {
        return this.LIZ.LIZLLL();
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJ(Function1<? super Boolean, Unit> function1) {
        return this.LIZ.LJ(function1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJFF(Function1<? super Boolean, Unit> function1) {
        return this.LIZ.LJFF(function1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJI(String str, String str2, String str3) {
        this.LIZ.LJI(str, str2, str3);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJII(int i, Context context, Aweme aweme, boolean z) {
        return this.LIZ.LJII(i, context, aweme, z);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJIIIIZZ(Function1<? super Boolean, Unit> function1) {
        return this.LIZ.LJIIIIZZ(function1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIIZ(C19EG c19eg, String str) {
        return this.LIZ.LJIIIZ(c19eg, str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean LJIIJ(Context context, String str, Uri uri, C1027480cqQ c1027480cqQ) {
        return this.LIZ.LJIIJ(context, str, uri, c1027480cqQ);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJIIJJI(Function1<? super Boolean, Unit> function1) {
        return this.LIZ.LJIIJJI(function1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJIIL(String str, String str2, String str3, String str4, Context context) {
        this.LIZ.LJIIL(str, str2, str3, str4, context);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final AbstractC1027370cqF LJIILIIL(Function1<? super Boolean, Unit> function1) {
        return this.LIZ.LJIILIIL(function1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void LJIILJJIL(Function1<? super Boolean, Unit> function1) {
        this.LIZ.LJIILJJIL(function1);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final boolean open(String str) {
        return this.LIZ.open(str);
    }

    @Override // com.ss.android.ugc.aweme.commercialize.util.adrouter.IAdRouterHandlerDepend
    public final void pendingDeepLinkLog(Function1<? super Boolean, Unit> function1) {
        this.LIZ.pendingDeepLinkLog(function1);
    }
}
