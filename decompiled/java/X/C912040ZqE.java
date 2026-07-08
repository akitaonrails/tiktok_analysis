package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZqE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912040ZqE extends AbstractC912050ZqF {
    public final List<String> LIZIZ;
    public final BaseShortVideoContext LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C912040ZqE)) {
            return false;
        }
        C912040ZqE c912040ZqE = (C912040ZqE) obj;
        return Intrinsics.LJFF(this.LIZIZ, c912040ZqE.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c912040ZqE.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c912040ZqE.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CreateData(sessionIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", editModel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC912050ZqF
    public final BaseShortVideoContext LIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC912050ZqF
    public final List<String> LIZIZ() {
        return this.LIZIZ;
    }

    @Override // X.AbstractC912050ZqF
    public final String LIZJ() {
        return this.LIZLLL;
    }

    public C912040ZqE(List<String> list, BaseShortVideoContext baseShortVideoContext, String str) {
        super(list, baseShortVideoContext, str);
        this.LIZIZ = list;
        this.LIZJ = baseShortVideoContext;
        this.LIZLLL = str;
    }
}
