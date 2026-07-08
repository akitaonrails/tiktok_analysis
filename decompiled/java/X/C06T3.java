package X;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06T3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06T3 implements InterfaceC111300bX {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final Map<String, String> LLILZIL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C06T3)) {
            return false;
        }
        C06T3 c06t3 = (C06T3) obj;
        return this.LL == c06t3.LL && this.LLILLJJLI == c06t3.LLILLJJLI && this.LLILLL == c06t3.LLILLL && this.LLILZ == c06t3.LLILZ && Intrinsics.LJFF(this.LLILZIL, c06t3.LLILZIL);
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + this.LLILZIL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChooseSearchMusicHierarchyData(optimizeMusicSearch=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", placeholderMusicSearch=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showFilterButton=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showVoiceSearchButton=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", mobParams=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C06T3(boolean z, boolean z2, boolean z3, boolean z4, Map<String, String> map) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = z3;
        this.LLILZ = z4;
        this.LLILZIL = map;
    }
}
