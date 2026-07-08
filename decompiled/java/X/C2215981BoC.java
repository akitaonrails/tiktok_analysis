package X;

import Y.AfS56S1100000_34;
import com.bytedance.ies.nle.editor_jni.INLEVQScoreWrapperListener;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEVQScoreTimeRange;
import com.bytedance.ies.nle.editor_jni.NLEVQScoreWrapper;
import com.bytedance.ies.nle.editor_jni.VecDouble;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.preview.api.PostEventData;
import com.ss.android.ugc.aweme.preview.api.QualityAdvisorApi;
import com.ss.android.ugc.aweme.preview.api.QualityAdvisorSubmitEventRequest;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.upload.UploadSpeedInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BoC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2215981BoC {
    public static final C2215981BoC LIZ = new C2215981BoC();
    public static final List<C2216041BoI> LIZIZ = C1697810uHb.LJIIJJI(new C2216041BoI(15000, 20000, 120000), new C2216041BoI(60000, 40000, 180000), new C2216041BoI(180000, 80000, 300000), new C2216041BoI(3600000, 600000, 3600000), new C2216041BoI(Long.MAX_VALUE, 1200000, 7200000));
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));
    public static final ConcurrentHashMap<String, C2216011BoF> LIZLLL = new ConcurrentHashMap<>();

    public static void LJFF(C2216021BoG c2216021BoG) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("is_success", c2216021BoG.LIZ);
            jSONObject.put("total_count", c2216021BoG.LIZJ);
            jSONObject.put("video_clarity_p90_score", c2216021BoG.LJI);
            jSONObject.put("video_width", c2216021BoG.LJIIIZ);
            jSONObject.put("video_height", c2216021BoG.LJIIJ);
            jSONObject.put("video_duration", c2216021BoG.LIZIZ);
            jSONObject.put("achieve_score_time", c2216021BoG.LJII);
            jSONObject.put("video_clarity_p50_score", c2216021BoG.LJ);
            jSONObject.put("video_clarity_p75_score", c2216021BoG.LJFF);
            jSONObject.put("video_clarity_avg_score", c2216021BoG.LIZLLL);
            String str = c2216021BoG.LJIIJJI;
            if (str == null) {
                str = "";
            }
            jSONObject.put("failure_reason", str);
            AppLogNewUtils.onEventV3("publish_finish_quality", jSONObject);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception while reporting AppLog event: ");
            sbLIZ.append(e);
            C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public static void LJI(C2216011BoF c2216011BoF) throws JSONException {
        String str = c2216011BoF.LIZIZ;
        if (str.length() == 0 || c2216011BoF.LJIILIIL) {
            return;
        }
        c2216011BoF.LJIILIIL = true;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("has_enter_cover_editor", c2216011BoF.LIZJ ? 1 : 0);
        String strJ3 = C786410Ut5.J3(jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("original_width", c2216011BoF.LIZLLL);
        jSONObject2.put("original_height", c2216011BoF.LJ);
        jSONObject2.put("enable_high_clarity_post", c2216011BoF.LJFF);
        String strJ32 = C786410Ut5.J3(jSONObject2);
        try {
            PostEventData postEventData = new PostEventData(2, strJ3);
            PostEventData postEventData2 = new PostEventData(1, strJ32);
            QualityAdvisorApi.LIZ.getClass();
            C2194091Atz.LIZIZ.getValue().submitEvent(new QualityAdvisorSubmitEventRequest(str, C1697810uHb.LJIIJJI(postEventData, postEventData2))).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new AfS56S1100000_34(str, c2216011BoF, 0), new AfS56S1100000_34(str, c2216011BoF, 1));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C201955140j.LJIIIIZZ(C830690WiJ.LIZIZ, "PostPublishClarityScoreScheduler", "exception while submitting quality advisor initial events postItemId=" + str + " publishId=" + c2216011BoF.LIZ + ": " + th);
        }
    }

    public final synchronized void LIZJ(C2216011BoF c2216011BoF) {
        String str = c2216011BoF.LIZ;
        ConcurrentHashMap<String, C2216011BoF> concurrentHashMap = LIZLLL;
        if (concurrentHashMap.get(str) == c2216011BoF) {
            concurrentHashMap.remove(str);
        }
        c2216011BoF.LJIILLIIL = null;
        AnonymousClass0956 anonymousClass0956 = c2216011BoF.LJIIZILJ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        c2216011BoF.LJIIZILJ = null;
    }

    public final void LJIIL(C2216011BoF c2216011BoF) {
        if (!c2216011BoF.LJIJ) {
            return;
        }
        if (c2216011BoF.LJIJI || c2216011BoF.LJIJJLI || c2216011BoF.LJIJJ) {
            LIZJ(c2216011BoF);
        }
    }

    public static double LJ(double d, List list) {
        if (list.isEmpty()) {
            return 0.0d;
        }
        if (list.size() == 1) {
            return ((Number) ListProtector.get(list, 0)).doubleValue();
        }
        return ((Number) ListProtector.get(list, C13LZ.LJ((int) (((double) (list.size() - 1)) * d), 0, list.size() - 1))).doubleValue();
    }

    public static void LJII(C2216011BoF c2216011BoF, C2216021BoG c2216021BoG) {
        synchronized (c2216011BoF) {
            try {
                if (c2216011BoF.LJIJ) {
                    return;
                }
                LIZ.getClass();
                LJFF(c2216021BoG);
                LJIIIIZZ(c2216011BoF, c2216021BoG);
                c2216011BoF.LJIJ = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIIIZZ(C2216011BoF c2216011BoF, C2216021BoG c2216021BoG) throws JSONException {
        String str = c2216011BoF.LIZIZ;
        if (str.length() == 0 || !c2216021BoG.LIZ) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("pct90_score", c2216021BoG.LJI);
        jSONObject.put("pct75_score", c2216021BoG.LJFF);
        jSONObject.put("pct50_score", c2216021BoG.LJ);
        jSONObject.put("avg_score", c2216021BoG.LIZLLL);
        try {
            PostEventData postEventData = new PostEventData(1, C786410Ut5.J3(jSONObject));
            QualityAdvisorApi.LIZ.getClass();
            C2194091Atz.LIZIZ.getValue().submitEvent(new QualityAdvisorSubmitEventRequest(str, Collections.singletonList(postEventData))).LJJIJIIJI(C11S5.LIZ()).LJJ(C11S5.LIZ()).LJJIIZ(new AfS56S1100000_34(str, c2216011BoF, 2), new AfS56S1100000_34(str, c2216011BoF, 3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception while submitting quality advisor score event postItemId=");
            sbLIZ.append(str);
            sbLIZ.append(" publishId=");
            sbLIZ.append(c2216011BoF.LIZ);
            sbLIZ.append(": ");
            sbLIZ.append(th);
            C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0017 A[Catch: all -> 0x001c, TRY_LEAVE, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x0004, B:6:0x000c, B:8:0x0011, B:10:0x0017), top: B:17:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r6, com.bytedance.ies.nle.editor_jni.NLEModel r7) {
        /*
            r2 = 0
            if (r7 == 0) goto L11
            long r4 = r7.getDuration()     // Catch: java.lang.Throwable -> L1c
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L11
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r4 / r0
            return r2
        L11:
            int r0 = r6.getVideoLength()     // Catch: java.lang.Throwable -> L1c
            if (r0 <= 0) goto L42
            int r0 = r6.getVideoLength()     // Catch: java.lang.Throwable -> L1c
            goto L41
        L1c:
            r5 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r5)
            X.0WiJ r4 = X.C830690WiJ.LIZIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "resolveRawDurationMs exception: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "PostPublishClarityScoreScheduler"
            X.C201955140j.LJIIIIZZ(r4, r0, r1)
            int r0 = r6.getVideoLength()
            if (r0 <= 0) goto L42
            int r0 = r6.getVideoLength()
        L41:
            long r2 = (long) r0
        L42:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2215981BoC.LJIIIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, com.bytedance.ies.nle.editor_jni.NLEModel):long");
    }

    public final synchronized void LIZIZ(String str, String str2, boolean z) {
        C2216011BoF c2216011BoF = LIZLLL.get(str);
        if (c2216011BoF == null) {
            return;
        }
        c2216011BoF.LJIJJ = true;
        AnonymousClass0956 anonymousClass0956 = c2216011BoF.LJIILLIIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        if (z) {
            long j = c2216011BoF.LJII;
            long j2 = c2216011BoF.LJI;
            int i = c2216011BoF.LJIIIIZZ;
            int i2 = c2216011BoF.LJIIIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cancelled_");
            sbLIZ.append(str2);
            LJII(c2216011BoF, LIZLLL(j, j2, 0L, C2188811AlT.LIZIZ(sbLIZ), i, i2));
        }
        c2216011BoF.LJIJI = true;
        LIZJ(c2216011BoF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.1BoH, com.bytedance.ies.nle.editor_jni.INLEVQScoreWrapperListener] */
    public final void LJIIJ(C2216011BoF c2216011BoF, NLEVQScoreWrapper nLEVQScoreWrapper, NLEModel nLEModel, NLEVQScoreTimeRange nLEVQScoreTimeRange) {
        final WeakReference weakReference = new WeakReference(c2216011BoF);
        ?? r11 = new INLEVQScoreWrapperListener() { // from class: X.1BoH
            @Override // com.bytedance.ies.nle.editor_jni.INLEVQScoreWrapperListener
            public final void onProgress(int i, int i2, double d) {
            }

            @Override // com.bytedance.ies.nle.editor_jni.INLEVQScoreWrapperListener
            public final void onFinished(VecDouble vecDouble) {
                C2216011BoF c2216011BoF2 = weakReference.get();
                if (c2216011BoF2 == null) {
                    return;
                }
                c2216011BoF2.LJIJI = true;
                if (!c2216011BoF2.LJIIL.isCompleted()) {
                    c2216011BoF2.LJIIL.LJJLIIIJILLIZJL(vecDouble);
                }
                C2215981BoC.LIZ.LJIIL(c2216011BoF2);
            }
        };
        c2216011BoF.LJIILL = r11;
        try {
            int iStartVQScore = nLEVQScoreWrapper.startVQScore(nLEModel, nLEVQScoreTimeRange, 720, 1280, r11);
            if (iStartVQScore != 0) {
                c2216011BoF.LJIJI = true;
                if (!c2216011BoF.LJIIL.isCompleted()) {
                    C099F c099f = c2216011BoF.LJIIL;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("startVQScore failed with ret=");
                    sbLIZ.append(iStartVQScore);
                    c099f.LJJJJJ(new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ)));
                }
                LJIIL(c2216011BoF);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c2216011BoF.LJIJI = true;
            if (!c2216011BoF.LJIIL.isCompleted()) {
                c2216011BoF.LJIIL.LJJJJJ(th);
            }
            LJIIL(c2216011BoF);
        }
    }

    public final synchronized void LJIIJJI(VideoPublishEditModel videoPublishEditModel, String str, String str2, boolean z) {
        int width;
        int height;
        long speed;
        String localFinalPath;
        VideoFileInfo videoFileInfoLIZJ;
        String localFinalPath2;
        VideoFileInfo videoFileInfoLIZJ2;
        LIZIZ(str, "resubmit", false);
        long videoLength = videoPublishEditModel.getVideoLength();
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            localFinalPath2 = videoPublishEditModel.getLocalFinalPath();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resolveVideoWidth exception: ");
            sbLIZ.append(th);
            C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
        }
        if ((localFinalPath2 != null || (localFinalPath2 = videoPublishEditModel.getOutputFile()) != null) && localFinalPath2.length() != 0 && (videoFileInfoLIZJ2 = C1404710mer.LIZJ(localFinalPath2)) != null) {
            width = videoFileInfoLIZJ2.getWidth();
        } else {
            width = 0;
        }
        try {
            localFinalPath = videoPublishEditModel.getLocalFinalPath();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C830690WiJ c830690WiJ2 = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resolveVideoHeight exception: ");
            sbLIZ2.append(th2);
            C201955140j.LJIIIIZZ(c830690WiJ2, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ2));
        }
        if ((localFinalPath != null || (localFinalPath = videoPublishEditModel.getOutputFile()) != null) && localFinalPath.length() != 0 && (videoFileInfoLIZJ = C1404710mer.LIZJ(localFinalPath)) != null) {
            height = videoFileInfoLIZJ.getHeight();
        } else {
            height = 0;
        }
        int iSourceVideoWidth = videoPublishEditModel.sourceVideoWidth();
        int iSourceVideoHeight = videoPublishEditModel.sourceVideoHeight();
        UploadSpeedInfo uploadSpeedInfo = videoPublishEditModel.getUploadSpeedInfo();
        if (uploadSpeedInfo != null) {
            speed = uploadSpeedInfo.getSpeed();
        } else {
            speed = -6;
        }
        boolean zLIZJ = C1441320nbu.LIZJ(speed);
        long j = 0;
        if (videoLength >= 0) {
            j = videoLength;
        }
        for (C2216041BoI c2216041BoI : LIZIZ) {
            if (j <= c2216041BoI.LIZ) {
                C2216011BoF c2216011BoF = new C2216011BoF(str, str2, z, iSourceVideoWidth, iSourceVideoHeight, zLIZJ, jCurrentTimeMillis, videoLength, width, height, c2216041BoI.LIZIZ, c2216041BoI.LIZJ);
                LIZLLL.put(str, c2216011BoF);
                LJI(c2216011BoF);
                C054G c054g = LIZJ;
                c2216011BoF.LJIIZILJ = C23250099c.LIZLLL(c054g, null, null, new C2216001BoE(c2216011BoF, str, null), 3);
                c2216011BoF.LJIILLIIL = C23250099c.LIZLLL(c054g, null, null, new C2215991BoD(videoPublishEditModel, c2216011BoF, videoLength, jCurrentTimeMillis, width, height, str, null), 3);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0082: MOVE (r25 I:??[long, double]) = (r17 I:??[long, double]) (LINE:100663426), block:B:12:0x0080 */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0084: MOVE (r28 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r19 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:100663428), block:B:12:0x0080 */
    /* JADX WARN: Not initialized variable reg: 20, insn: 0x0086: MOVE (r29 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r20 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:100663430), block:B:12:0x0080 */
    /* JADX WARN: Not initialized variable reg: 23, insn: 0x0088: INVOKE (r2 I:X.1BoG) = (r21v0 ?? I:long), (r23 I:long), (r25 I:long), (r27 I:java.lang.String), (r28 I:int), (r29 I:int) STATIC call: X.1BoC.LIZLLL(long, long, long, java.lang.String, int, int):X.1BoG A[MD:(long, long, long, java.lang.String, int, int):X.1BoG (m)] (LINE:100663432), block:B:12:0x0080 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0080: MOVE (r21 I:??[long, double]) = (r4 I:??[long, double]) (LINE:100663424), block:B:12:0x0080 */
    /* JADX WARN: Type inference failed for: r23v0, types: [long] */
    public static C2216021BoG LIZ(VecDouble vecDouble, long j, long j2, long j3, int i, int i2) {
        long j4;
        long j5;
        int i3;
        int i4;
        ?? LIZLLL2;
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(vecDouble);
            if (arrayList.isEmpty()) {
                return LIZLLL(j, j2, j3, "empty_scores", i, i2);
            }
            List listLJLLJ = C13LP.LJLLJ(arrayList);
            int size = listLJLLJ.size();
            return new C2216021BoG(true, j, size, C13LP.LJLZ(listLJLLJ) / ((double) size), LJ(0.5d, listLJLLJ), LJ(0.25d, listLJLLJ), LJ(0.1d, listLJLLJ), System.currentTimeMillis() - j2, j3, i, i2, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C830690WiJ c830690WiJ = C830690WiJ.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("buildMetrics failed: ");
            sbLIZ.append(e);
            C201955140j.LJIIIIZZ(c830690WiJ, "PostPublishClarityScoreScheduler", C2188811AlT.LIZIZ(sbLIZ));
            String message = e.getMessage();
            if (message == null) {
                message = e.toString();
            }
            return LIZLLL(j4, LIZLLL2, j5, message, i3, i4);
        }
    }

    public static C2216021BoG LIZLLL(long j, long j2, long j3, String str, int i, int i2) {
        return new C2216021BoG(false, j, 0, 0.0d, 0.0d, 0.0d, 0.0d, System.currentTimeMillis() - j2, j3, i, i2, str);
    }
}
