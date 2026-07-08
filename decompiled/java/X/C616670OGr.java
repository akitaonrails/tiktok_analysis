package X;

import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OGr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C616670OGr implements InterfaceC0148002o {
    public final EnumC1177720gkk LL;
    public final EnumC1076160e6w LLILLJJLI;
    public final C291001Au<Pair<Boolean, List<String>>> LLILLL;
    public final C291001Au<Pair<PoiRevisitApi.PoiRevisitCardModel, Integer>> LLILZ;

    public C616670OGr() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C616670OGr)) {
            return false;
        }
        C616670OGr c616670OGr = (C616670OGr) obj;
        return this.LL == c616670OGr.LL && this.LLILLJJLI == c616670OGr.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c616670OGr.LLILLL) && Intrinsics.LJFF(this.LLILZ, c616670OGr.LLILZ);
    }

    public final int hashCode() {
        EnumC1177720gkk enumC1177720gkk = this.LL;
        int iHashCode = (enumC1177720gkk == null ? 0 : enumC1177720gkk.hashCode()) * 31;
        EnumC1076160e6w enumC1076160e6w = this.LLILLJJLI;
        int iHashCode2 = (((iHashCode + (enumC1076160e6w == null ? 0 : enumC1076160e6w.hashCode())) * 31) + this.LLILLL.hashCode()) * 31;
        C291001Au<Pair<PoiRevisitApi.PoiRevisitCardModel, Integer>> c291001Au = this.LLILZ;
        return iHashCode2 + (c291001Au != null ? c291001Au.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiRevisitPageState(newUIState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", newDataState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", updatePoiList=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", updateSpecificCard=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C616670OGr(int i) {
        this(null, null, new C291001Au(new Pair(Boolean.FALSE, C13BV.INSTANCE)), null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C616670OGr(EnumC1177720gkk enumC1177720gkk, EnumC1076160e6w enumC1076160e6w, C291001Au<? extends Pair<Boolean, ? extends List<String>>> c291001Au, C291001Au<Pair<PoiRevisitApi.PoiRevisitCardModel, Integer>> c291001Au2) {
        this.LL = enumC1177720gkk;
        this.LLILLJJLI = enumC1076160e6w;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
    }

    public static C616670OGr LIZ(C616670OGr c616670OGr, EnumC1177720gkk enumC1177720gkk, EnumC1076160e6w enumC1076160e6w, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            enumC1177720gkk = c616670OGr.LL;
        }
        if ((i & 2) != 0) {
            enumC1076160e6w = c616670OGr.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c616670OGr.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c616670OGr.LLILZ;
        }
        c616670OGr.getClass();
        return new C616670OGr(enumC1177720gkk, enumC1076160e6w, c291001Au, c291001Au2);
    }
}
