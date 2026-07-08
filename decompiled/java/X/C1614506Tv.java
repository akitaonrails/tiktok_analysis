package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Tv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1614506Tv {
    public final String LIZ;
    public final List<String> LIZIZ;
    public final String LIZJ;
    public final Aweme LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1614506Tv)) {
            return false;
        }
        C1614506Tv c1614506Tv = (C1614506Tv) obj;
        return Intrinsics.LJFF(this.LIZ, c1614506Tv.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1614506Tv.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1614506Tv.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1614506Tv.LIZLLL);
    }

    public C1614506Tv(Aweme aweme, String str, String str2, List list) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = str2;
        this.LIZLLL = aweme;
    }
}
