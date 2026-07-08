package X;

import android.animation.Animator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0abp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941550abp {
    public final Animator LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C941550abp)) {
            return false;
        }
        C941550abp c941550abp = (C941550abp) obj;
        return Intrinsics.LJFF(this.LIZ, c941550abp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c941550abp.LIZIZ) && this.LIZJ == c941550abp.LIZJ;
    }

    public C941550abp(Animator animator, String str, long j) {
        this.LIZ = animator;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
