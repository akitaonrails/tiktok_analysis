package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LLA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LLA extends C09JG {
    public final Source LIZ;
    public final List<String> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0LLA)) {
            return false;
        }
        C0LLA c0lla = (C0LLA) obj;
        return this.LIZ == c0lla.LIZ && Intrinsics.LJFF(this.LIZIZ, c0lla.LIZIZ);
    }

    public final int hashCode() {
        Source source = this.LIZ;
        return ((source == null ? 0 : source.hashCode()) * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ImagesUploadTaskInput(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", imageUriList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0LLA() {
        this(null, C13BV.INSTANCE);
    }

    public C0LLA(Source source, List<String> list) {
        this.LIZ = source;
        this.LIZIZ = list;
    }
}
