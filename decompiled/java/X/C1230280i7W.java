package X;

import com.ss.android.ugc.aweme.publicgroup.data.GroupJoinCheckItemResult;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i7W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1230280i7W {
    public final List<GroupJoinCheckItemResult> LIZ;
    public final List<GroupJoinCheckItemResult> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1230280i7W)) {
            return false;
        }
        C1230280i7W c1230280i7W = (C1230280i7W) obj;
        return Intrinsics.LJFF(this.LIZ, c1230280i7W.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1230280i7W.LIZIZ);
    }

    public C1230280i7W(List<GroupJoinCheckItemResult> list, List<GroupJoinCheckItemResult> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
