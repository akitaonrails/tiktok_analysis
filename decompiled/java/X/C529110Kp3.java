package X;

import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kp3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C529110Kp3 {
    public final List<TikTokMediaModel> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C529110Kp3)) {
            return false;
        }
        C529110Kp3 c529110Kp3 = (C529110Kp3) obj;
        return Intrinsics.LJFF(this.LIZ, c529110Kp3.LIZ) && this.LIZIZ == c529110Kp3.LIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C529110Kp3(List<? extends TikTokMediaModel> list, long j) {
        this.LIZ = list;
        this.LIZIZ = j;
    }
}
