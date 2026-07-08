package X;

import com.ss.android.ugc.aweme.shortvideo.BaseShortVideoContext;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZqD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C912030ZqD extends AbstractC912050ZqF {
    public final List<String> LIZIZ;
    public final BaseShortVideoContext LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final Long LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C912030ZqD)) {
            return false;
        }
        C912030ZqD c912030ZqD = (C912030ZqD) obj;
        return Intrinsics.LJFF(this.LIZIZ, c912030ZqD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c912030ZqD.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c912030ZqD.LIZLLL) && Intrinsics.LJFF(this.LJ, c912030ZqD.LJ) && Intrinsics.LJFF(this.LJFF, c912030ZqD.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZIZ.hashCode() * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Long l = this.LJFF;
        return iHashCode + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("JoinData(sessionIds=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", editModel=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", templateId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", refMessageId=");
        sbLIZ.append(this.LJFF);
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

    public C912030ZqD(List<String> list, BaseShortVideoContext baseShortVideoContext, String str, String str2, Long l) {
        super(list, baseShortVideoContext, str);
        this.LIZIZ = list;
        this.LIZJ = baseShortVideoContext;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = l;
    }
}
