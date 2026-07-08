package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PzW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663000PzW implements InterfaceC652490PiZ {
    public final SearchMixFeed LL;
    public final Aweme LLILLJJLI;

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
        return new C650430PfF(new AwS589S0100000_10(this, 670));
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

    public C663000PzW(Aweme aweme, SearchMixFeed searchMixFeed) {
        this.LL = searchMixFeed;
        this.LLILLJJLI = aweme;
    }
}
