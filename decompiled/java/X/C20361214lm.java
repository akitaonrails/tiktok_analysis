package X;

import com.bytedance.android.livesdk.entity.PlayRule;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14lm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20361214lm {
    public final String LIZ;
    public final long LIZIZ;
    public C20361314ln LIZJ;
    public final PlayRule LIZLLL;
    public final long LJ;
    public final CopyOnWriteArraySet<Function1<C20361214lm, Unit>> LJFF;
    public String LJI;
    public String LJII;
    public final String LJIIIIZZ;
    public boolean LJIIIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20361214lm)) {
            return false;
        }
        C20361214lm c20361214lm = (C20361214lm) obj;
        return Intrinsics.LJFF(this.LIZ, c20361214lm.LIZ) && this.LIZIZ == c20361214lm.LIZIZ && Intrinsics.LJFF(this.LIZJ, c20361214lm.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20361214lm.LIZLLL) && this.LJ == c20361214lm.LJ;
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31;
        PlayRule playRule = this.LIZLLL;
        return ((iHashCode + (playRule == null ? 0 : playRule.hashCode())) * 31) + C786410Ut5.Y2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlaybookTask(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", stateId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", playEntity=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", branchId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C20361214lm LIZ() {
        String str = this.LIZ;
        String str2 = this.LJI;
        String str3 = this.LJII;
        long j = this.LIZIZ;
        C20361314ln c20361314ln = this.LIZJ;
        c20361314ln.getClass();
        return new C20361214lm(str, str2, str3, j, new C20361314ln(c20361314ln.LIZ, c20361314ln.LIZIZ, c20361314ln.LIZJ, c20361314ln.LIZLLL, C13LP.LLIIII(c20361314ln.LJ), c20361314ln.LJFF, c20361314ln.LJI, c20361314ln.LJII, c20361314ln.LJIIIIZZ, c20361314ln.LJIIIZ, 3072), this.LIZLLL, this.LJ, this.LJIIIIZZ, this.LJIIIZ);
    }

    public final void LIZIZ(String str) {
        this.LJI = str;
        PlayRule playRule = this.LIZLLL;
        if (playRule != null) {
            playRule.LJIILLIIL(str);
        }
        Iterator<Function1<C20361214lm, Unit>> it2 = this.LJFF.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(this);
        }
    }

    public C20361214lm(String str, long j, C20361314ln c20361314ln, PlayRule playRule, long j2) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = c20361314ln;
        this.LIZLLL = playRule;
        this.LJ = j2;
        this.LJFF = new CopyOnWriteArraySet<>();
    }

    public C20361214lm(String str, String str2, long j, C20361314ln c20361314ln, PlayRule playRule) {
        this(str, j, c20361314ln, playRule, -1L);
        LIZIZ(str2);
    }

    public C20361214lm(String str, String str2, String str3, long j, C20361314ln c20361314ln, PlayRule playRule, long j2, String str4, boolean z) {
        this(str, j, c20361314ln, playRule, j2);
        LIZIZ(str2);
        this.LJII = str3;
        this.LJIIIIZZ = str4;
        this.LJIIIZ = z;
    }
}
