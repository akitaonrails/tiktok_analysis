package X;

import com.ss.android.ugc.aweme.creative.model.editorpro.aigc.EditorProAIGCMediaItemModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ez9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C382490Ez9 {
    public final EnumC378720Et4 LIZ;
    public final EnumC378320EsQ LIZIZ;
    public final C375830EoP<Boolean> LIZJ;
    public final C375830EoP<Unit> LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C375830EoP<Unit> LJFF;
    public final EditorProAIGCMediaItemModel LJI;
    public final String LJII;
    public final List<String> LJIIIIZZ;

    public C382490Ez9() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C382490Ez9)) {
            return false;
        }
        C382490Ez9 c382490Ez9 = (C382490Ez9) obj;
        return this.LIZ == c382490Ez9.LIZ && this.LIZIZ == c382490Ez9.LIZIZ && Intrinsics.LJFF(this.LIZJ, c382490Ez9.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c382490Ez9.LIZLLL) && Intrinsics.LJFF(this.LJ, c382490Ez9.LJ) && Intrinsics.LJFF(this.LJFF, c382490Ez9.LJFF) && Intrinsics.LJFF(this.LJI, c382490Ez9.LJI) && Intrinsics.LJFF(this.LJII, c382490Ez9.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c382490Ez9.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C375830EoP<Boolean> c375830EoP = this.LIZJ;
        int iHashCode2 = (iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP3 = this.LJ;
        int iHashCode4 = (iHashCode3 + (c375830EoP3 == null ? 0 : c375830EoP3.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP4 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (c375830EoP4 == null ? 0 : c375830EoP4.hashCode())) * 31;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel = this.LJI;
        int iHashCode6 = (iHashCode5 + (editorProAIGCMediaItemModel == null ? 0 : editorProAIGCMediaItemModel.hashCode())) * 31;
        String str = this.LJII;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.LJIIIIZZ;
        return iHashCode7 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditorProAIGCReportPanelStates(panelUIType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", panelUIState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", showLoading=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", openKeyboard=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", closeKeyboard=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", clearData=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", itemModelState=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", reportInputState=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", reportInputSelectionsState=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C382490Ez9(int i) {
        this(EnumC378720Et4.NONE, EnumC378320EsQ.NONE, null, null, null, null, null, null, null);
    }

    public C382490Ez9(EnumC378720Et4 enumC378720Et4, EnumC378320EsQ enumC378320EsQ, C375830EoP<Boolean> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<Unit> c375830EoP3, C375830EoP<Unit> c375830EoP4, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, String str, List<String> list) {
        this.LIZ = enumC378720Et4;
        this.LIZIZ = enumC378320EsQ;
        this.LIZJ = c375830EoP;
        this.LIZLLL = c375830EoP2;
        this.LJ = c375830EoP3;
        this.LJFF = c375830EoP4;
        this.LJI = editorProAIGCMediaItemModel;
        this.LJII = str;
        this.LJIIIIZZ = list;
    }

    public static C382490Ez9 LIZ(C382490Ez9 c382490Ez9, EnumC378720Et4 enumC378720Et4, EnumC378320EsQ enumC378320EsQ, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, C375830EoP c375830EoP4, EditorProAIGCMediaItemModel editorProAIGCMediaItemModel, String str, List list, int i) {
        List list2 = list;
        String str2 = str;
        EditorProAIGCMediaItemModel editorProAIGCMediaItemModel2 = editorProAIGCMediaItemModel;
        C375830EoP c375830EoP5 = c375830EoP4;
        C375830EoP c375830EoP6 = c375830EoP3;
        C375830EoP c375830EoP7 = c375830EoP2;
        C375830EoP c375830EoP8 = c375830EoP;
        EnumC378320EsQ enumC378320EsQ2 = enumC378320EsQ;
        EnumC378720Et4 enumC378720Et42 = enumC378720Et4;
        if ((i & 1) != 0) {
            enumC378720Et42 = c382490Ez9.LIZ;
        }
        if ((i & 2) != 0) {
            enumC378320EsQ2 = c382490Ez9.LIZIZ;
        }
        if ((i & 4) != 0) {
            c375830EoP8 = c382490Ez9.LIZJ;
        }
        if ((i & 8) != 0) {
            c375830EoP7 = c382490Ez9.LIZLLL;
        }
        if ((i & 16) != 0) {
            c375830EoP6 = c382490Ez9.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP5 = c382490Ez9.LJFF;
        }
        if ((i & 64) != 0) {
            editorProAIGCMediaItemModel2 = c382490Ez9.LJI;
        }
        if ((i & 128) != 0) {
            str2 = c382490Ez9.LJII;
        }
        if ((i & 256) != 0) {
            list2 = c382490Ez9.LJIIIIZZ;
        }
        c382490Ez9.getClass();
        return new C382490Ez9(enumC378720Et42, enumC378320EsQ2, c375830EoP8, c375830EoP7, c375830EoP6, c375830EoP5, editorProAIGCMediaItemModel2, str2, list2);
    }
}
