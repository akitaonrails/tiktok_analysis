package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563580M8m {
    public final String LIZ;
    public final String LIZIZ;
    public final List<SocMediaResource> LIZJ;
    public final List<SocMediaResource> LIZLLL;
    public final List<SocMediaResource> LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C563580M8m)) {
            return false;
        }
        C563580M8m c563580M8m = (C563580M8m) obj;
        return Intrinsics.LJFF(this.LIZ, c563580M8m.LIZ) && Intrinsics.LJFF(this.LIZIZ, c563580M8m.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c563580M8m.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c563580M8m.LIZLLL) && Intrinsics.LJFF(this.LJ, c563580M8m.LJ);
    }

    public C563580M8m(String str, String str2, List<SocMediaResource> list, List<SocMediaResource> list2, List<SocMediaResource> list3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
    }
}
