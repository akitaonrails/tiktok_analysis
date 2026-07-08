package X;

import com.ss.android.ugc.aweme.music.model.MusicGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OqJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631810OqJ implements InterfaceC0148002o {
    public final C291001Au<MusicGroup> LL;

    public C631810OqJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C631810OqJ) && Intrinsics.LJFF(this.LL, ((C631810OqJ) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighlightSharedState(highlightedMusic=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C631810OqJ(int i) {
        this((C291001Au<MusicGroup>) new C291001Au(null));
    }

    public C631810OqJ(C291001Au<MusicGroup> c291001Au) {
        this.LL = c291001Au;
    }
}
