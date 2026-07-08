package X;

import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tfm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1674360tfm {
    public final List<StoryHighlightAwemePreview> LIZ;
    public final List<StoryHighlightAwemePreview> LIZIZ;
    public final List<StoryHighlightAwemePreview> LIZJ;
    public final EnumC1674300tfg LIZLLL;
    public final Long LJ;

    public C1674360tfm() {
        this(null, null, 31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1674360tfm)) {
            return false;
        }
        C1674360tfm c1674360tfm = (C1674360tfm) obj;
        return Intrinsics.LJFF(this.LIZ, c1674360tfm.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1674360tfm.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1674360tfm.LIZJ) && this.LIZLLL == c1674360tfm.LIZLLL && Intrinsics.LJFF(this.LJ, c1674360tfm.LJ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1674360tfm(List list, List list2, int i) {
        C13BV c13bv;
        List list3 = list2;
        List list4 = list;
        if ((i & 1) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        this(c13bv, (i & 2) != 0 ? C13BV.INSTANCE : list4, (i & 4) != 0 ? C13BV.INSTANCE : list3, (i & 8) != 0 ? EnumC1674300tfg.INITIAL : null, null);
    }

    public C1674360tfm(List<StoryHighlightAwemePreview> list, List<StoryHighlightAwemePreview> list2, List<StoryHighlightAwemePreview> list3, EnumC1674300tfg enumC1674300tfg, Long l) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = enumC1674300tfg;
        this.LJ = l;
    }

    public static C1674360tfm LIZ(C1674360tfm c1674360tfm, List list, List list2, List list3, EnumC1674300tfg enumC1674300tfg, Long l, int i) {
        Long l2 = l;
        EnumC1674300tfg enumC1674300tfg2 = enumC1674300tfg;
        List list4 = list3;
        List list5 = list2;
        List list6 = list;
        if ((i & 1) != 0) {
            list6 = c1674360tfm.LIZ;
        }
        if ((i & 2) != 0) {
            list5 = c1674360tfm.LIZIZ;
        }
        if ((i & 4) != 0) {
            list4 = c1674360tfm.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC1674300tfg2 = c1674360tfm.LIZLLL;
        }
        if ((i & 16) != 0) {
            l2 = c1674360tfm.LJ;
        }
        c1674360tfm.getClass();
        return new C1674360tfm(list6, list5, list4, enumC1674300tfg2, l2);
    }
}
