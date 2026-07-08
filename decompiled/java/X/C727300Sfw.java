package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C727300Sfw implements InterfaceC0148002o {
    public final List<C727310Sfx> LL;
    public final int LLILLJJLI;
    public final Aweme LLILLL;
    public final C291001Au<Integer> LLILZ;
    public final C291001Au<C727320Sfy> LLILZIL;

    public C727300Sfw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C727300Sfw)) {
            return false;
        }
        C727300Sfw c727300Sfw = (C727300Sfw) obj;
        return Intrinsics.LJFF(this.LL, c727300Sfw.LL) && this.LLILLJJLI == c727300Sfw.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c727300Sfw.LLILLL) && Intrinsics.LJFF(this.LLILZ, c727300Sfw.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c727300Sfw.LLILZIL);
    }

    public final int hashCode() {
        int iHashCode = ((this.LL.hashCode() * 31) + this.LLILLJJLI) * 31;
        Aweme aweme = this.LLILLL;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        C291001Au<Integer> c291001Au = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<C727320Sfy> c291001Au2 = this.LLILZIL;
        return iHashCode3 + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryGalleryListState(items=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", selectedPosition=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", selectedStory=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", scrollToPositionEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", exitActivityWithAnimationEvent=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C727300Sfw(int i) {
        this(C13BV.INSTANCE, 0, null, null, null);
    }

    public C727300Sfw(List<C727310Sfx> list, int i, Aweme aweme, C291001Au<Integer> c291001Au, C291001Au<C727320Sfy> c291001Au2) {
        this.LL = list;
        this.LLILLJJLI = i;
        this.LLILLL = aweme;
        this.LLILZ = c291001Au;
        this.LLILZIL = c291001Au2;
    }

    public static C727300Sfw LIZ(C727300Sfw c727300Sfw, List list, int i, Aweme aweme, C291001Au c291001Au, C291001Au c291001Au2, int i2) {
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        Aweme aweme2 = aweme;
        int i3 = i;
        List list2 = list;
        if ((i2 & 1) != 0) {
            list2 = c727300Sfw.LL;
        }
        if ((i2 & 2) != 0) {
            i3 = c727300Sfw.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            aweme2 = c727300Sfw.LLILLL;
        }
        if ((i2 & 8) != 0) {
            c291001Au4 = c727300Sfw.LLILZ;
        }
        if ((i2 & 16) != 0) {
            c291001Au3 = c727300Sfw.LLILZIL;
        }
        c727300Sfw.getClass();
        return new C727300Sfw(list2, i3, aweme2, c291001Au4, c291001Au3);
    }
}
