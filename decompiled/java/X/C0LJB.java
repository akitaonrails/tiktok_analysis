package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LJB, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LJB {
    public final List<SocMediaResource> LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LJB)) {
            return false;
        }
        C0LJB c0ljb = (C0LJB) obj;
        return Intrinsics.LJFF(this.LIZ, c0ljb.LIZ) && this.LIZIZ == c0ljb.LIZIZ;
    }

    public C0LJB(List<SocMediaResource> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }

    public static C0LJB LIZ(C0LJB c0ljb, List list, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = c0ljb.LIZ;
        }
        if ((i2 & 2) != 0) {
            i = c0ljb.LIZIZ;
        }
        c0ljb.getClass();
        return new C0LJB(list, i);
    }
}
