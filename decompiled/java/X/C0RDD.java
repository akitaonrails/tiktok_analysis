package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.PostModeEntranceMechanism;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RDD, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RDD implements InterfaceC0148002o {
    public final C291001Au<Pair<String, C291001Au<Boolean>>> LL;
    public final C291001Au<Pair<String, C291001Au<Pair<Aweme, PostModeEntranceMechanism>>>> LLILLJJLI;
    public final C291001Au<Pair<String, C291001Au<Unit>>> LLILLL;

    public C0RDD() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0RDD)) {
            return false;
        }
        C0RDD c0rdd = (C0RDD) obj;
        return Intrinsics.LJFF(this.LL, c0rdd.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0rdd.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0rdd.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Pair<String, C291001Au<Boolean>>> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Pair<String, C291001Au<Pair<Aweme, PostModeEntranceMechanism>>>> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Pair<String, C291001Au<Unit>>> c291001Au3 = this.LLILLL;
        return iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoViewModelWrapState(onSeeMoreClickEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", requestNavigationToPhotoModeDetailPageEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onHolderResumeEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0RDD(Object obj) {
        this.LL = null;
        this.LLILLJJLI = null;
        this.LLILLL = null;
    }
}
