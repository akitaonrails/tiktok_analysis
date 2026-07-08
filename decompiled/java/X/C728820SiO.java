package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SiO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728820SiO implements InterfaceC1891350zJl, InterfaceC714040Rze {
    public final Aweme LL;
    public final String LLILLJJLI;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    @Override // X.InterfaceC714040Rze
    public final boolean hasUnreadStory() {
        return C712780Rxc.LIZ(this);
    }

    @Override // X.InterfaceC714040Rze
    public final Aweme getStoryCollection() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C728820SiO)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C728820SiO) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C728820SiO;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return obj instanceof C728820SiO;
    }

    public C728820SiO(Aweme aweme, String str) {
        this.LL = aweme;
        this.LLILLJJLI = str;
    }
}
