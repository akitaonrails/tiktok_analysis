package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;

/* JADX INFO: renamed from: X.0DuP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354070DuP {
    public static Long LIZ;

    public static String LIZ(CreativeInfo creativeInfo) {
        if (((Boolean) C280810AzX.LIZ.getValue()).booleanValue()) {
            return C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, String.valueOf(System.nanoTime()), 4);
        }
        return C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, String.valueOf(System.currentTimeMillis()), 4);
    }

    public static String LIZIZ(CreativeInfo creativeInfo) {
        if (((Boolean) C280810AzX.LIZ.getValue()).booleanValue()) {
            return C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, String.valueOf(System.nanoTime()), 4);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        LIZ = Long.valueOf(jCurrentTimeMillis);
        return C354080DuQ.LIZ(C0CHQ.LIZ().LJJIIJZLJL().getPathService(), creativeInfo, String.valueOf(jCurrentTimeMillis), 4);
    }
}
