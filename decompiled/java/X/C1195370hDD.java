package X;

import com.ss.android.ugc.aweme.poi.PoiDataStruct;

/* JADX INFO: renamed from: X.0hDD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1195370hDD extends AbstractC1196150hET {
    public static final C1195370hDD LIZ = new C1195370hDD();
    public static final String LIZIZ = "poi_anchor";

    @Override // X.AbstractC1196150hET
    public final String LIZIZ() {
        return LIZIZ;
    }

    public static void LJ(C1195400hDG c1195400hDG, String str, String str2) {
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1195360hDC(c1195400hDG, str, str2, null), 3);
    }

    public static void LIZLLL(String str, String str2, String str3, PoiDataStruct poiDataStruct, String str4) {
        EnumC1195380hDE enumC1195380hDE;
        if (poiDataStruct == null) {
            enumC1195380hDE = EnumC1195380hDE.LLILLJJLI;
        } else if (poiDataStruct.poiId == null) {
            enumC1195380hDE = EnumC1195380hDE.LLILLL;
        } else if (poiDataStruct.poiName == null) {
            enumC1195380hDE = EnumC1195380hDE.LLILZ;
        } else if (poiDataStruct.icon != null) {
            return;
        } else {
            enumC1195380hDE = EnumC1195380hDE.LLILZIL;
        }
        if (enumC1195380hDE != null) {
            LIZ.LIZJ("poi_anchor_poidata_error", new C1195390hDF(enumC1195380hDE, str, str2, str3, str4));
        }
    }
}
