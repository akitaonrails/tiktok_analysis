package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.message.content.BaseContent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IAN, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0IAN implements C0IAQ {
    public final Aweme LIZ;
    public final BaseContent.ReferenceSceneType LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IAN)) {
            return false;
        }
        C0IAN c0ian = (C0IAN) obj;
        return Intrinsics.LJFF(this.LIZ, c0ian.LIZ) && this.LIZIZ == c0ian.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Video(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", referenceSceneType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IAN(Aweme aweme, BaseContent.ReferenceSceneType referenceSceneType) {
        this.LIZ = aweme;
        this.LIZIZ = referenceSceneType;
    }
}
