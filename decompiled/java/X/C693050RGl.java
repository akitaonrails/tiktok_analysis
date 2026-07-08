package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C693050RGl implements InterfaceC693060RGm {
    public final Aweme LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C693050RGl)) {
            return false;
        }
        C693050RGl c693050RGl = (C693050RGl) obj;
        return Intrinsics.LJFF(this.LIZ, c693050RGl.LIZ) && this.LIZIZ == c693050RGl.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryAwemeParam(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", storyPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C693050RGl(Aweme aweme, int i) {
        this.LIZ = aweme;
        this.LIZIZ = i;
    }
}
