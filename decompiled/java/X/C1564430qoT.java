package X;

import Y.ARunnableS124S0100000_24;
import com.ss.android.ugc.feed.platform.panel.loadmorepanel.LoadMorePerfComponent;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0qoT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1564430qoT extends C09AY implements Function0<ARunnableS124S0100000_24> {
    public final /* synthetic */ LoadMorePerfComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1564430qoT(LoadMorePerfComponent loadMorePerfComponent) {
        super(0);
        this.LL = loadMorePerfComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ARunnableS124S0100000_24 invoke() {
        return new ARunnableS124S0100000_24(this.LL, 83);
    }
}
