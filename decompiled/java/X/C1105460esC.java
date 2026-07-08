package X;

import com.bytedance.android.live.base.model.user.User;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0esC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105460esC {
    public final User LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final EnumC187400no LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1105460esC)) {
            return false;
        }
        C1105460esC c1105460esC = (C1105460esC) obj;
        return Intrinsics.LJFF(this.LIZ, c1105460esC.LIZ) && this.LIZIZ == c1105460esC.LIZIZ && this.LIZJ == c1105460esC.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1105460esC.LIZLLL) && this.LJ == c1105460esC.LJ && this.LJFF == c1105460esC.LJFF;
    }

    public /* synthetic */ C1105460esC(User user, long j, long j2, String str, long j3) {
        this(user, j, j2, str, j3, EnumC187400no.TOP_VIEWER);
    }

    public C1105460esC(User user, long j, long j2, String str, long j3, EnumC187400no enumC187400no) {
        this.LIZ = user;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = str;
        this.LJ = j3;
        this.LJFF = enumC187400no;
    }
}
