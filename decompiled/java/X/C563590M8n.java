package X;

import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M8n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563590M8n {
    public final C563580M8m LIZ;
    public final SocMediaResource LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C563590M8n)) {
            return false;
        }
        C563590M8n c563590M8n = (C563590M8n) obj;
        return Intrinsics.LJFF(this.LIZ, c563590M8n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c563590M8n.LIZIZ);
    }

    public C563590M8n(C563580M8m c563580M8m, SocMediaResource socMediaResource) {
        this.LIZ = c563580M8m;
        this.LIZIZ = socMediaResource;
    }

    public static C563590M8n LIZ(C563590M8n c563590M8n, C563580M8m c563580M8m, SocMediaResource socMediaResource, int i) {
        if ((i & 1) != 0) {
            c563580M8m = c563590M8n.LIZ;
        }
        if ((i & 2) != 0) {
            socMediaResource = c563590M8n.LIZIZ;
        }
        c563590M8n.getClass();
        return new C563590M8n(c563580M8m, socMediaResource);
    }
}
