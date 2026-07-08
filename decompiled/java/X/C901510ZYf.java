package X;

import com.ss.android.ugc.aweme.im.message.template.component.interactive.task.aigroupshot.AIGroupShotUserInfoComponent;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C901510ZYf implements C0ZQ8 {
    public final List<AIGroupShotUserInfoComponent> LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C901510ZYf)) {
            return false;
        }
        C901510ZYf c901510ZYf = (C901510ZYf) obj;
        return Intrinsics.LJFF(this.LIZ, c901510ZYf.LIZ) && this.LIZIZ == c901510ZYf.LIZIZ && Intrinsics.LJFF(this.LIZJ, c901510ZYf.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c901510ZYf.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ProgressStyleData(joinedUserInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalProgress=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C901510ZYf(List<AIGroupShotUserInfoComponent> list, int i, String str, String str2) {
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = str2;
    }
}
