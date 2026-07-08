package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.model.StoryInsertUser;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SiX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C728910SiX {
    public final Aweme LIZ;
    public final List<StoryInsertUser> LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C728910SiX)) {
            return false;
        }
        C728910SiX c728910SiX = (C728910SiX) obj;
        return Intrinsics.LJFF(this.LIZ, c728910SiX.LIZ) && Intrinsics.LJFF(this.LIZIZ, c728910SiX.LIZIZ) && this.LIZJ == c728910SiX.LIZJ && this.LIZLLL == c728910SiX.LIZLLL && this.LJ == c728910SiX.LJ && this.LJFF == c728910SiX.LJFF && this.LJI == c728910SiX.LJI;
    }

    public static C728910SiX LIZ(C728910SiX c728910SiX, boolean z, boolean z2) {
        Aweme aweme = c728910SiX.LIZ;
        List<StoryInsertUser> list = c728910SiX.LIZIZ;
        boolean z3 = c728910SiX.LIZJ;
        boolean z4 = c728910SiX.LJFF;
        boolean z5 = c728910SiX.LJI;
        c728910SiX.getClass();
        return new C728910SiX(aweme, list, z3, z, z2, z4, z5);
    }

    public C728910SiX(Aweme aweme, List<StoryInsertUser> list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.LIZ = aweme;
        this.LIZIZ = list;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = z3;
        this.LJFF = z4;
        this.LJI = z5;
    }
}
