package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eux, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379890Eux {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final EnumC378720Et4 LIZLLL;
    public final List<EditorProAIGCMediaItemModel> LJ;
    public final List<C379910Euz> LJFF;
    public final List<String> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C379890Eux)) {
            return false;
        }
        C379890Eux c379890Eux = (C379890Eux) obj;
        return Intrinsics.LJFF(this.LIZ, c379890Eux.LIZ) && Intrinsics.LJFF(this.LIZIZ, c379890Eux.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c379890Eux.LIZJ) && this.LIZLLL == c379890Eux.LIZLLL && Intrinsics.LJFF(this.LJ, c379890Eux.LJ) && Intrinsics.LJFF(this.LJFF, c379890Eux.LJFF) && Intrinsics.LJFF(this.LJI, c379890Eux.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        return ((((((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGCResultItemModel(firstCoverPath=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", lastCoverPath=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemName=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", panelType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", aigcMediaList=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", functionList=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", topBarCoverPaths=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C379890Eux(String str, String str2, String str3, EnumC378720Et4 enumC378720Et4, List<EditorProAIGCMediaItemModel> list, List<C379910Euz> list2, List<String> list3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = enumC378720Et4;
        this.LJ = list;
        this.LJFF = list2;
        this.LJI = list3;
    }
}
