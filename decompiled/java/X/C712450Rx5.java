package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Rx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712450Rx5 implements InterfaceC1891350zJl, InterfaceC714040Rze {
    public final Aweme LL;

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryGuideCardSkylightItem(storyCollection=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
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

    public C712450Rx5(Aweme aweme) {
        this.LL = aweme;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C712450Rx5)) {
            return false;
        }
        return Intrinsics.LJFF(this.LL, ((C712450Rx5) interfaceC1891350zJl).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C712450Rx5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1891350zJl)) {
            return false;
        }
        return obj instanceof C712450Rx5;
    }
}
