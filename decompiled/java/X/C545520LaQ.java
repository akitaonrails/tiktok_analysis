package X;

import com.ss.android.ugc.aweme.aigc.asynctask.Source;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0LaQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C545520LaQ<T> extends AbstractC551020LjI<T> {
    public final Source LIZ;
    public final Map<String, C544530LXf> LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final long LJ;
    public final String LJFF;
    public final T LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C545520LaQ)) {
            return false;
        }
        C545520LaQ c545520LaQ = (C545520LaQ) obj;
        return this.LIZ == c545520LaQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c545520LaQ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c545520LaQ.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c545520LaQ.LIZLLL) && this.LJ == c545520LaQ.LJ && Intrinsics.LJFF(this.LJFF, c545520LaQ.LJFF) && Intrinsics.LJFF(this.LJI, c545520LaQ.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Y2(this.LJ)) * 31;
        String str = this.LJFF;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        T t = this.LJI;
        return iHashCode2 + (t != null ? t.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCWorkflowNewBasicInput(source=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", inputItemsByResourceKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", businessScene=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", taskType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", serverWorkflowId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", extra=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", businessExtra=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC551020LjI
    public final T LIZ() {
        return this.LJI;
    }

    @Override // X.AbstractC551020LjI
    public final String LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC551020LjI
    public final String LIZJ() {
        return this.LJFF;
    }

    @Override // X.AbstractC551020LjI
    public final Source LIZLLL() {
        return this.LIZ;
    }

    @Override // X.AbstractC551020LjI
    public final String LJ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C545520LaQ(Source source, Map map, String str, String str2, long j, String str3, C550580Lia c550580Lia) {
        this.LIZ = source;
        this.LIZIZ = map;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = j;
        this.LJFF = str3;
        this.LJI = c550580Lia;
    }
}
