package X;

import com.ss.android.ugc.aweme.services.story.SimplePublishModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SPF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPF {
    public final SimplePublishModel LIZ;
    public final C729450SjP LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0SPF)) {
            return false;
        }
        C0SPF c0spf = (C0SPF) obj;
        return Intrinsics.LJFF(this.LIZ, c0spf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0spf.LIZIZ);
    }

    public C0SPF(SimplePublishModel simplePublishModel, C729450SjP c729450SjP) {
        this.LIZ = simplePublishModel;
        this.LIZIZ = c729450SjP;
    }
}
