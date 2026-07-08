package X;

import com.ss.android.ugc.aweme.feed.ui.share.SharedVideoDeepLinkHelper;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0O0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C612480O0o extends C09AY implements Function0<C612470O0n> {
    public final /* synthetic */ SharedVideoDeepLinkHelper LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C612480O0o(SharedVideoDeepLinkHelper sharedVideoDeepLinkHelper) {
        super(0);
        this.LL = sharedVideoDeepLinkHelper;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C612470O0n invoke() {
        return new C612470O0n(this.LL.LL);
    }
}
