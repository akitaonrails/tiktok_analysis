package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PzV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C662990PzV implements InterfaceC652490PiZ {
    public final SearchMixFeed LL;
    public final Aweme LLILLJJLI;
    public final boolean LLILLL;

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return new C650430PfF(new AwS589S0100000_10(this, 20));
    }

    @Override // X.InterfaceC436740HAq
    public final SearchMixFeed LIZ() {
        return this.LL;
    }

    @Override // X.InterfaceC435460H5s
    public final Aweme getAweme() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C662990PzV(SearchMixFeed searchMixFeed, Aweme aweme, boolean z) {
        this.LL = searchMixFeed;
        this.LLILLJJLI = aweme;
        this.LLILLL = z;
    }
}
