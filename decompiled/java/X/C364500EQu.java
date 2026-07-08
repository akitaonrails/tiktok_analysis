package X;

import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EQu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C364500EQu {
    public final C364490EQt LIZ;
    public final List<TextStickerData> LIZIZ;
    public final List<C0EVA> LIZJ;
    public final EnumC364790ERx LIZLLL;
    public final List<Pair<Integer, TextStickerData>> LJ;
    public boolean LJFF;
    public final String LJI;
    public final C375830EoP<Unit> LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C364500EQu)) {
            return false;
        }
        C364500EQu c364500EQu = (C364500EQu) obj;
        return Intrinsics.LJFF(this.LIZ, c364500EQu.LIZ) && Intrinsics.LJFF(this.LIZIZ, c364500EQu.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c364500EQu.LIZJ) && this.LIZLLL == c364500EQu.LIZLLL && Intrinsics.LJFF(this.LJ, c364500EQu.LJ) && this.LJFF == c364500EQu.LJFF && Intrinsics.LJFF(this.LJI, c364500EQu.LJI) && Intrinsics.LJFF(this.LJII, c364500EQu.LJII);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + this.LJI.hashCode()) * 31;
        C375830EoP<Unit> c375830EoP = this.LJII;
        return iHashCode + (c375830EoP == null ? 0 : c375830EoP.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CaptionFillerWordContentStates(contextData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", captionList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", filterWordTypes=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", loadingState=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", currentFilterWords=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showCancelDialog=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", currentLanguage=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", sheetShownEvent=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C364500EQu LIZ(C364500EQu c364500EQu, List list, List list2, EnumC364790ERx enumC364790ERx, boolean z, C375830EoP c375830EoP, int i) {
        C364490EQt c364490EQt;
        List<Pair<Integer, TextStickerData>> list3;
        boolean z2 = z;
        C375830EoP c375830EoP2 = c375830EoP;
        EnumC364790ERx enumC364790ERx2 = enumC364790ERx;
        List list4 = list2;
        List list5 = list;
        String str = null;
        if ((i & 1) != 0) {
            c364490EQt = c364500EQu.LIZ;
        } else {
            c364490EQt = null;
        }
        if ((i & 2) != 0) {
            list5 = c364500EQu.LIZIZ;
        }
        if ((i & 4) != 0) {
            list4 = c364500EQu.LIZJ;
        }
        if ((i & 8) != 0) {
            enumC364790ERx2 = c364500EQu.LIZLLL;
        }
        if ((i & 16) != 0) {
            list3 = c364500EQu.LJ;
        } else {
            list3 = null;
        }
        if ((i & 32) != 0) {
            z2 = c364500EQu.LJFF;
        }
        if ((i & 64) != 0) {
            str = c364500EQu.LJI;
        }
        if ((i & 128) != 0) {
            c375830EoP2 = c364500EQu.LJII;
        }
        c364500EQu.getClass();
        return new C364500EQu(c364490EQt, list5, list4, enumC364790ERx2, list3, z2, str, c375830EoP2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C364500EQu(C364490EQt c364490EQt, List<TextStickerData> list, List<? extends C0EVA> list2, EnumC364790ERx enumC364790ERx, List<Pair<Integer, TextStickerData>> list3, boolean z, String str, C375830EoP<Unit> c375830EoP) {
        this.LIZ = c364490EQt;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = enumC364790ERx;
        this.LJ = list3;
        this.LJFF = z;
        this.LJI = str;
        this.LJII = c375830EoP;
    }
}
