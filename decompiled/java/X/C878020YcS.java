package X;

import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0YcS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C878020YcS extends AbstractC878010YcR {
    public final BaseTemplate LIZ;
    public final String LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C878020YcS)) {
            return false;
        }
        C878020YcS c878020YcS = (C878020YcS) obj;
        return Intrinsics.LJFF(this.LIZ, c878020YcS.LIZ) && Intrinsics.LJFF(this.LIZIZ, c878020YcS.LIZIZ) && this.LIZJ == c878020YcS.LIZJ;
    }

    public final int hashCode() {
        BaseTemplate baseTemplate = this.LIZ;
        return ((((baseTemplate == null ? 0 : baseTemplate.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SendStarted(template=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", numberOfSharedContacts=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C878020YcS(BaseTemplate baseTemplate, String str, int i) {
        this.LIZ = baseTemplate;
        this.LIZIZ = str;
        this.LIZJ = i;
    }
}
