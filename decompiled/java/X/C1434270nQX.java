package X;

import com.ss.android.ugc.aweme.creative.model.publish.CompileLevel;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nQX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1434270nQX {
    public final CompileLevel LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final Map<String, String> LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1434270nQX)) {
            return false;
        }
        C1434270nQX c1434270nQX = (C1434270nQX) obj;
        return this.LIZ == c1434270nQX.LIZ && Intrinsics.LJFF(this.LIZIZ, c1434270nQX.LIZIZ) && this.LIZJ == c1434270nQX.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1434270nQX.LIZLLL) && Intrinsics.LJFF(this.LJ, c1434270nQX.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CompileParams(compileLevel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sourceFilePath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", removeSourceMetadata=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", metaData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", nleModel=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1434270nQX(CompileLevel compileLevel) {
        this(compileLevel, "", false, C2097608Jq.LJ(), null);
    }

    public C1434270nQX(CompileLevel compileLevel, String str, boolean z, Map<String, String> map, String str2) {
        this.LIZ = compileLevel;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = map;
        this.LJ = str2;
    }
}
