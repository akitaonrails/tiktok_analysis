package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2275508vp extends AbstractC1921407fo {
    public final List<String> LIZ;
    public final CreativeInfo LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2275508vp)) {
            return false;
        }
        C2275508vp c2275508vp = (C2275508vp) obj;
        return Intrinsics.LJFF(this.LIZ, c2275508vp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2275508vp.LIZIZ) && this.LIZJ == c2275508vp.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoModeUploadFrameTaskParam(imageList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", creativeInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", forceWebp=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1921407fo
    public final boolean LIZ(AbstractC1921407fo abstractC1921407fo) {
        if (Intrinsics.LJFF(abstractC1921407fo, this)) {
            return true;
        }
        if (!(abstractC1921407fo instanceof C2275508vp)) {
            return false;
        }
        C2275508vp c2275508vp = (C2275508vp) abstractC1921407fo;
        if (c2275508vp.LIZ.size() != this.LIZ.size()) {
            return false;
        }
        return Intrinsics.LJFF(C13LP.LLIIJI(this.LIZ), C13LP.LLIIJI(c2275508vp.LIZ));
    }

    public C2275508vp(List<String> list, CreativeInfo creativeInfo, boolean z) {
        this.LIZ = list;
        this.LIZIZ = creativeInfo;
        this.LIZJ = z;
    }
}
