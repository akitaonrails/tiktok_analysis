package X;

/* JADX INFO: renamed from: X.0Qdb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674890Qdb {
    public static C674940Qdg LIZ(C674850QdX c674850QdX, Integer num) {
        String str;
        String str2;
        int value;
        String imageByteHash;
        C676050QfT c676050QfT = c674850QdX.photoSearch;
        String str3 = null;
        if (c676050QfT != null) {
            str3 = c676050QfT.imageTosUri;
            str = c676050QfT.detection;
            str2 = c676050QfT.detectionIdx;
        } else {
            str = null;
            str2 = null;
        }
        Long l = c674850QdX.cursor;
        String str4 = c674850QdX.enterFrom;
        String str5 = c674850QdX.source;
        String str6 = c674850QdX.searchSource;
        if (num != null) {
            value = num.intValue();
        } else {
            value = EnumC676230Qfl.USER_INTERACTION_TYPE_FIRST_REQUEST.getValue();
        }
        if (((Boolean) C133700f9.LIZ.getValue()).booleanValue()) {
            imageByteHash = c674850QdX.imageKey;
        } else {
            imageByteHash = c674850QdX.getImageByteHash();
        }
        return new C674940Qdg(str3, str, str2, l, str4, str5, str6, value, imageByteHash, c674850QdX.rootEnterFromType);
    }
}
