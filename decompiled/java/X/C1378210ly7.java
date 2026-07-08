package X;

import java.io.File;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ly7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1378210ly7 implements InterfaceC0148002o {
    public final EnumC1378200ly6 LL;
    public final File LLILLJJLI;
    public final Exception LLILLL;

    public C1378210ly7() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1378210ly7)) {
            return false;
        }
        C1378210ly7 c1378210ly7 = (C1378210ly7) obj;
        return this.LL == c1378210ly7.LL && Intrinsics.LJFF(this.LLILLJJLI, c1378210ly7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1378210ly7.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        File file = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (file == null ? 0 : file.hashCode())) * 31;
        Exception exc = this.LLILLL;
        return iHashCode2 + (exc != null ? exc.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarDownloadShareState(pageStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", downloadedVideo=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", exception=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1378210ly7(int i) {
        this(EnumC1378200ly6.INITIALIZED, null, null);
    }

    public C1378210ly7(EnumC1378200ly6 enumC1378200ly6, File file, Exception exc) {
        this.LL = enumC1378200ly6;
        this.LLILLJJLI = file;
        this.LLILLL = exc;
    }
}
