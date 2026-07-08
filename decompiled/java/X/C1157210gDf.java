package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gDf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157210gDf extends AbstractC1157040gDO {
    public final String LL;
    public final String LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157210gDf)) {
            return false;
        }
        C1157210gDf c1157210gDf = (C1157210gDf) obj;
        return Intrinsics.LJFF(this.LL, c1157210gDf.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1157210gDf.LLILLJJLI) && this.LLILLL == c1157210gDf.LLILLL && this.LLILZ == c1157210gDf.LLILZ;
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StoryArchiveV2ListStoryItem(collectionAwemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", realAwemeId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isRealAwemeLoaded=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isThoughtPage=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1157040gDO, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C1157210gDf)) {
            return false;
        }
        return Intrinsics.LJFF(this.LLILLJJLI, ((C1157210gDf) interfaceC1891350zJl).LLILLJJLI);
    }

    public C1157210gDf(String str, String str2, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
