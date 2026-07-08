package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10ZU, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10ZU {
    public final String LIZ = "push_video_preload";
    public final String LIZIZ;
    public Boolean LIZJ;

    public final boolean LIZ() {
        if (this.LIZJ == null) {
            this.LIZJ = Boolean.valueOf(Intrinsics.LJFF(C10ZP.LIZ(this.LIZ, this.LIZIZ), "1"));
        }
        return Intrinsics.LJFF(this.LIZJ, Boolean.TRUE);
    }

    public final boolean LIZIZ() {
        C10UB c10ub = C10UB.LIZ;
        String str = this.LIZIZ;
        c10ub.getClass();
        boolean z = C10UB.LIZIZ(str) == 1;
        this.LIZJ = Boolean.valueOf(z);
        C10ZP.LIZJ(this.LIZ, this.LIZIZ, z ? "1" : CardStruct.IStatusCode.DEFAULT);
        return z;
    }

    public C10ZU(String str) {
        this.LIZIZ = str;
    }
}
