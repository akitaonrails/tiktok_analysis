package X;

import android.app.Activity;
import android.util.LruCache;
import com.ss.android.ugc.aweme.feed.experiment.FeedPlayProgressContinueConfig;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.feed.platform.panel.autoscroll.IAutoAScrollAbility;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import xtc.l1;

/* JADX INFO: renamed from: X.0Mv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C583820Mv6 {
    public static C582220MsW LJ;
    public static String LJFF;
    public static String LJII;
    public static String LJIIIIZZ;
    public static final C583820Mv6 LIZ = new C583820Mv6();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C583810Mv5());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C583110Mtx());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C583100Mtw());
    public static final HashMap<String, LruCache<String, Long>> LJI = new HashMap<>();

    public static C582220MsW LIZ(String str) {
        if (str == null) {
            return null;
        }
        if (Intrinsics.LJFF(LJFF, str)) {
            return LJ;
        }
        C582220MsW c582220MsW = (C582220MsW) ((LruCache) LIZLLL.getValue()).get(str);
        LJ = c582220MsW;
        LJFF = str;
        return c582220MsW;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r8 != null) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004d A[PHI: r6
      0x004d: PHI (r6v3 java.lang.Long) = (r6v0 java.lang.Long), (r6v1 java.lang.Long), (r6v2 java.lang.Long), (r6v4 java.lang.Long) binds: [B:38:0x0071, B:26:0x004b, B:20:0x003d, B:14:0x002f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Long LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme r8, java.lang.String r9) {
        /*
            java.lang.String r2 = "poi_recommend_feature_detail"
            java.lang.String r1 = "poi_detail"
            java.lang.String r0 = "poi_secondary_page"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0, r2}
            java.util.List r0 = X.C1697810uHb.LJIIJJI(r0)
            boolean r0 = X.C13LP.LJJJJ(r9, r0)
            r7 = 0
            if (r0 == 0) goto L73
            if (r8 == 0) goto L73
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r8.getPoiDataStruct()
            if (r0 == 0) goto L31
            com.ss.android.ugc.aweme.poi.PoiAmusementModel r0 = r0.poiAmusement
            if (r0 == 0) goto L31
            java.util.List<com.ss.android.ugc.aweme.poi.PoiAwemeInfo> r0 = r0.poiAwemeInfos
            if (r0 == 0) goto L31
            java.lang.Object r0 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.poi.PoiAwemeInfo r0 = (com.ss.android.ugc.aweme.poi.PoiAwemeInfo) r0
            if (r0 == 0) goto L31
            java.lang.Long r6 = r0.startPlayTime
            if (r6 != 0) goto L4d
        L31:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r8.getPoiDataStruct()
            if (r0 == 0) goto L41
            com.ss.android.ugc.aweme.poi.AiSubSummary r0 = r0.aiSubSummary
            if (r0 == 0) goto L41
            java.lang.Long r6 = r0.startMs
            if (r6 != 0) goto L4d
            if (r8 == 0) goto L73
        L41:
            com.ss.android.ugc.aweme.poi.PoiDataStruct r0 = r8.getPoiDataStruct()
            if (r0 == 0) goto L71
            com.ss.android.ugc.aweme.poi.PoiAwemeConfig r0 = r0.poiAwemeConfig
            if (r0 == 0) goto L71
            java.lang.Long r6 = r0.startMs
        L4d:
            if (r8 == 0) goto L6f
            com.ss.android.ugc.aweme.feed.model.Video r0 = r8.getVideo()
            if (r0 == 0) goto L6f
            int r5 = r0.getDuration()
        L59:
            if (r6 == 0) goto L73
            long r3 = r6.longValue()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L73
            long r3 = r6.longValue()
            long r1 = (long) r5
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L73
            return r6
        L6f:
            r5 = 0
            goto L59
        L71:
            r6 = r7
            goto L4d
        L73:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C583820Mv6.LIZIZ(com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.String):java.lang.Long");
    }

    public static final long LIZJ(Aweme aweme, String str) {
        String aid;
        EnumC584570MwJ enumC584570MwJXo1;
        LIZ.getClass();
        Long lLIZIZ = LIZIZ(aweme, str);
        Activity activityLIZIZ = null;
        if (C08A4.LIZIZ(lLIZIZ) && lLIZIZ != null) {
            return lLIZIZ.longValue();
        }
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        if (aid != null && str != null && ((!Intrinsics.LJFF(LJII, aweme.getAid()) || !Intrinsics.LJFF(LJIIIIZZ, str) || (aweme.getMobParams() != null && (Intrinsics.LJFF(aweme.getMobParams().get("landscape_change_keep_tag"), "true") || Intrinsics.LJFF(aweme.getMobParams().get("landscape_continue_selected"), "true") || Intrinsics.LJFF(aweme.getMobParams().get("landscape_continue_texture"), "true")))) && ((Boolean) LIZJ.getValue()).booleanValue())) {
            C582220MsW c582220MsWLIZ = LIZ(aweme.getAid());
            if (((FeedPlayProgressContinueConfig) LIZIZ.getValue()).event_type_list.contains(str) && c582220MsWLIZ != null) {
                l1.LIZ.getClass();
                if (l1.LIZ()) {
                    IAutoAScrollAbility iAutoAScrollAbilityLIZIZ = C1386360mBG.LIZIZ(null);
                    if (iAutoAScrollAbilityLIZIZ != null) {
                        enumC584570MwJXo1 = iAutoAScrollAbilityLIZIZ.xo1();
                    } else {
                        enumC584570MwJXo1 = null;
                    }
                    if (enumC584570MwJXo1 == EnumC584570MwJ.AUTO_SCROLL_STATE_START && Math.abs(c582220MsWLIZ.LIZ - c582220MsWLIZ.LIZIZ) <= 2000) {
                        return 0L;
                    }
                }
                AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                if (abstractC1387200mCcLJ != null) {
                    activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                }
                if (C0SXF.LJIL(activityLIZIZ) && Math.abs(c582220MsWLIZ.LIZ - c582220MsWLIZ.LIZIZ) <= 2000) {
                    return 0L;
                }
                return c582220MsWLIZ.LIZ;
            }
        }
        return 0L;
    }
}
