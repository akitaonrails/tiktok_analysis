package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1646520sws {
    public static final /* synthetic */ int LIZ = 0;

    public static final String LIZ(Object obj) {
        C1631530sYh c1631530sYh = C1631530sYh.LIZ;
        c1631530sYh.getClass();
        if (Intrinsics.LJFF(obj, C1631530sYh.LIZIZ)) {
            return "video_15";
        }
        c1631530sYh.getClass();
        if (Intrinsics.LJFF(obj, C1631530sYh.LIZJ)) {
            return "video_60";
        }
        c1631530sYh.getClass();
        if (Intrinsics.LJFF(obj, C1631530sYh.LIZLLL)) {
            return "video_180";
        }
        c1631530sYh.getClass();
        if (Intrinsics.LJFF(obj, C1631530sYh.LJ)) {
            return "video_600";
        }
        if (Intrinsics.LJFF(obj, EnumC1647570syZ.RECORD_NOW.getTag())) {
            return "photo";
        }
        if (Intrinsics.LJFF(obj, EnumC1647570syZ.RECORD_LIGHTENING_TEXT.getTag())) {
            return "text";
        }
        if (Intrinsics.LJFF(obj, "RecordBottomStory") || Intrinsics.LJFF(obj, "RecordBottomDMCamera")) {
            return "quick_video";
        }
        if (Intrinsics.LJFF(obj, "record_mode_mv")) {
            return "mv";
        }
        if (Intrinsics.LJFF(obj, "AISelf")) {
            return "aime_tab";
        }
        return "by_default";
    }
}
