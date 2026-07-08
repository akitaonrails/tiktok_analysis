package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.model.IMusicRequestParamKt;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineTags;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.IPipelineListener;
import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import com.ss.android.ugc.aweme.music.understanding.PipelineTag;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2257508sv implements IPipelineListener {
    public static final C2257508sv LIZ = new C2257508sv();
    public static final ConcurrentHashMap<PipelineTag, C2258208t2> LIZIZ = new ConcurrentHashMap<>();

    public static void LIZ(C2258208t2 c2258208t2) {
        int iIntValue;
        long jLongValue;
        long jLongValue2;
        C2257808sy c2257808sy = c2258208t2.LIZIZ;
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("understanding_type", "local_understanding");
        c0lab.LJ("network_state", c2257808sy.LIZIZ);
        c0lab.LJ("understanding_key", c2257808sy.LIZJ);
        c0lab.LJ("understanding_biz_type", c2257808sy.LIZLLL);
        c0lab.LIZLLL(c2257808sy.LJ, "is_story");
        c0lab.LJ("error_msg", c2257808sy.LJFF);
        Integer num = c2257808sy.LJI;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c0lab.LIZ(iIntValue, "error_code");
        c0lab.LJ("shoot_way", c2257808sy.LJII);
        c0lab.LJ("content_type", c2257808sy.LJIIIIZZ);
        c0lab.LJ("content_source", c2257808sy.LJIIIZ);
        c0lab.LJ("enter_from", c2257808sy.LJIIJ);
        c0lab.LIZLLL(c2257808sy.LJIIJJI, "total_time");
        long jLongValue3 = 0;
        c0lab.LIZIZ(0L, "extraction_time");
        Long l = c2257808sy.LJIIL;
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        c0lab.LIZIZ(jLongValue, "compress_time");
        c0lab.LIZLLL(c2257808sy.LJIILIIL, "zip_time");
        Long l2 = c2257808sy.LJIILJJIL;
        if (l2 != null) {
            jLongValue2 = l2.longValue();
        } else {
            jLongValue2 = 0;
        }
        c0lab.LIZIZ(jLongValue2, "wait_zip_time");
        c0lab.LIZLLL(c2257808sy.LJIILL, "cloud_understanding_time");
        c0lab.LIZLLL(c2257808sy.LJIILLIIL, "total_size");
        c0lab.LIZLLL(c2257808sy.LJIIZILJ, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0lab.LIZLLL(c2257808sy.LJIJ, "video_count");
        c0lab.LIZLLL(c2257808sy.LJIJI, "image_count");
        c0lab.LIZLLL(c2257808sy.LJIJJ, "capsule_has_music");
        c0lab.LIZLLL(c2257808sy.LJIJJLI, "music_server_cost_ms");
        c0lab.LIZLLL(c2257808sy.LJIL, "music_server_call_recommend_cost_ms");
        c0lab.LIZLLL(c2257808sy.LJJ, "recommend_understanding_cost_ms");
        c0lab.LIZLLL(c2257808sy.LJJI, "is_editor_pro");
        Integer num2 = c2257808sy.LJJIFFI;
        if (num2 != null) {
            c0lab.LIZ(num2.intValue(), "is_async_understanding");
        }
        Long l3 = c2258208t2.LJ;
        if (l3 != null) {
            jLongValue3 = l3.longValue();
        }
        c0lab.LIZIZ(jLongValue3, "local_emb_analysis_time");
        C20684815ws.LJIILLIIL("monitor_ies_frame_understanding_monitor", c0lab.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeStart-R6Iu3AI */
    public final void mo17onNodeStartR6Iu3AI(PipelineTag pipelineTag, String str) {
        C2258208t2 c2258208t2 = LIZIZ.get(pipelineTag);
        if (c2258208t2 == null) {
            return;
        }
        IMusicRequestParamKt.safePutIfAbsent(c2258208t2.LIZLLL, NodeTag.m282boximpl(str), Long.valueOf(SystemClock.elapsedRealtime()));
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onStart(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest) {
        int i;
        Integer num;
        String str;
        String str2;
        Integer num2;
        String str3;
        EnumC325100Com networkStatus;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String strName = null;
        INetworkStateService iNetworkStateService = (INetworkStateService) PluggableExtentionKt.pluggableSpi$default(INetworkStateService.class, false, false, false, 14, null);
        Integer num3 = null;
        if (iNetworkStateService != null && (networkStatus = iNetworkStateService.getNetworkStatus()) != null) {
            strName = networkStatus.name();
        }
        C2257908sz c2257908sz = contentUnderstandingRequest.mobData;
        int i2 = 0;
        if (c2257908sz != null) {
            i = c2257908sz.LJI;
        } else {
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        C2257908sz c2257908sz2 = contentUnderstandingRequest.mobData;
        if (c2257908sz2 != null) {
            i2 = c2257908sz2.LJFF;
        }
        Pair pair = new Pair(numValueOf, Integer.valueOf(i2));
        int iIntValue = ((Number) pair.getFirst()).intValue();
        int iIntValue2 = ((Number) pair.getSecond()).intValue();
        C2257808sy c2257808sy = new C2257808sy();
        c2257808sy.LIZLLL = pipelineTag.getValue();
        c2257808sy.LIZIZ = strName;
        c2257808sy.LJIIIIZZ = contentUnderstandingRequest.contentType;
        c2257808sy.LJIIIZ = contentUnderstandingRequest.contentSource;
        c2257808sy.LJIJ = Integer.valueOf(iIntValue);
        c2257808sy.LJIJI = Integer.valueOf(iIntValue2);
        C2257908sz c2257908sz3 = contentUnderstandingRequest.mobData;
        if (c2257908sz3 != null) {
            num = c2257908sz3.LIZLLL;
        } else {
            num = null;
        }
        c2257808sy.LJ = num;
        if (c2257908sz3 != null) {
            str = c2257908sz3.LIZ;
        } else {
            str = null;
        }
        c2257808sy.LJII = str;
        if (c2257908sz3 != null) {
            str2 = c2257908sz3.LIZIZ;
        } else {
            str2 = null;
        }
        c2257808sy.LJIIJ = str2;
        if (c2257908sz3 != null) {
            num2 = c2257908sz3.LIZJ;
        } else {
            num2 = null;
        }
        c2257808sy.LJIJJ = num2;
        if (c2257908sz3 != null) {
            str3 = c2257908sz3.LJ;
        } else {
            str3 = null;
        }
        c2257808sy.LIZ = str3;
        if (c2257908sz3 != null) {
            num3 = c2257908sz3.LJIIIIZZ;
        }
        c2257808sy.LJJI = num3;
        c2257808sy.LIZJ = contentUnderstandingRequest.understandingKey;
        LIZIZ.put(pipelineTag, new C2258208t2(contentUnderstandingRequest, c2257808sy, jElapsedRealtime));
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onFinishSuccess(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult) {
        C2258208t2 c2258208t2 = LIZIZ.get(pipelineTag);
        if (c2258208t2 == null) {
            return;
        }
        c2258208t2.LJFF = Long.valueOf(SystemClock.elapsedRealtime() - c2258208t2.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(com.ss.android.ugc.aweme.music.understanding.PipelineTag r5, com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse r6, java.lang.Throwable r7, long r8) {
        /*
            java.util.concurrent.ConcurrentHashMap<com.ss.android.ugc.aweme.music.understanding.PipelineTag, X.08t2> r0 = X.C2257508sv.LIZIZ
            java.lang.Object r4 = r0.remove(r5)
            X.08t2 r4 = (X.C2258208t2) r4
            if (r4 != 0) goto Lb
            return
        Lb:
            X.08sy r1 = r4.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.LJIILL = r0
            r5 = 1
            r2 = 0
            if (r7 != 0) goto L95
            if (r6 == 0) goto L95
            int r0 = r6.status_code
            if (r0 != 0) goto L95
            r0 = 1
        L1e:
            r3 = 0
            if (r0 == 0) goto L51
            X.08sy r1 = r4.LIZIZ
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r1.LJIIZILJ = r0
        L29:
            java.lang.Long r0 = r4.LJFF
            if (r0 == 0) goto L49
            long r5 = r0.longValue()
        L31:
            X.08sy r1 = r4.LIZIZ
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1.LJIIJJI = r0
            X.08sy r1 = r4.LIZIZ
            com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest r0 = r4.LIZ
            X.08sz r0 = r0.mobData
            if (r0 == 0) goto L43
            java.lang.Integer r3 = r0.LJIIIZ
        L43:
            r1.LJJIFFI = r3
            LIZ(r4)
            return
        L49:
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.LIZJ
            long r5 = r5 - r0
            goto L31
        L51:
            X.08sy r2 = r4.LIZIZ
            java.lang.Integer r0 = r2.LJI
            if (r0 != 0) goto L29
            if (r6 == 0) goto L93
            int r0 = r6.status_code
        L5b:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.LJI = r0
            if (r7 == 0) goto L84
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.Class r0 = r7.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            r0 = 58
            r1.append(r0)
            java.lang.String r0 = r7.getMessage()
            r1.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            if (r0 != 0) goto L88
        L84:
            if (r6 == 0) goto L91
            java.lang.String r0 = r6.status_msg
        L88:
            r2.LJFF = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r2.LJIIZILJ = r0
            goto L29
        L91:
            r0 = r3
            goto L88
        L93:
            r0 = -1
            goto L5b
        L95:
            r0 = 0
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257508sv.LIZIZ(com.ss.android.ugc.aweme.music.understanding.PipelineTag, com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse, java.lang.Throwable, long):void");
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onFinishFailed(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, Throwable th, int i) {
        Integer num;
        C2258208t2 c2258208t2Remove = LIZIZ.remove(pipelineTag);
        if (c2258208t2Remove == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - c2258208t2Remove.LIZJ;
        c2258208t2Remove.LJFF = Long.valueOf(jElapsedRealtime);
        C2257808sy c2257808sy = c2258208t2Remove.LIZIZ;
        if (c2257808sy.LJI == null) {
            c2257808sy.LJI = Integer.valueOf(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getClass().getSimpleName());
            sbLIZ.append(':');
            sbLIZ.append(th.getMessage());
            c2257808sy.LJFF = C2188811AlT.LIZIZ(sbLIZ);
            c2257808sy.LJIIZILJ = 1;
        }
        C2257808sy c2257808sy2 = c2258208t2Remove.LIZIZ;
        c2257808sy2.LJIIJJI = Long.valueOf(jElapsedRealtime);
        C2257908sz c2257908sz = c2258208t2Remove.LIZ.mobData;
        if (c2257908sz != null) {
            num = c2257908sz.LJIIIZ;
        } else {
            num = null;
        }
        c2257808sy2.LJJIFFI = num;
        LIZ(c2258208t2Remove);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeFailed-qawT-gY */
    public final void mo16onNodeFailedqawTgY(PipelineTag pipelineTag, String str, Throwable th, int i) {
        C2258208t2 c2258208t2 = LIZIZ.get(pipelineTag);
        if (c2258208t2 == null) {
            return;
        }
        C2257808sy c2257808sy = c2258208t2.LIZIZ;
        if (c2257808sy.LJI == null) {
            c2257808sy.LJI = Integer.valueOf(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getClass().getSimpleName());
            sbLIZ.append(':');
            sbLIZ.append(th.getMessage());
            c2257808sy.LJFF = C2188811AlT.LIZIZ(sbLIZ);
            c2257808sy.LJIIZILJ = 1;
        }
        if (Intrinsics.LJFF(str, ContentPipelineTags.INSTANCE.m274getNODE_LOCAL_EMB_SCANq0GeycQ())) {
            c2258208t2.LJ = -1L;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeSuccess-qawT-gY */
    public final void mo18onNodeSuccessqawTgY(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult, boolean z) {
        Long lValueOf;
        long jValueOf;
        C2258208t2 c2258208t2 = LIZIZ.get(pipelineTag);
        if (c2258208t2 == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
        long jLongValue = 0;
        if (Intrinsics.LJFF(str, contentPipelineTags.m274getNODE_LOCAL_EMB_SCANq0GeycQ())) {
            Long l = c2258208t2.LIZLLL.get(NodeTag.m282boximpl(str));
            if (l == null || (jValueOf = Long.valueOf(jElapsedRealtime - l.longValue())) == null) {
                jValueOf = 0L;
            }
            c2258208t2.LJ = jValueOf;
            return;
        }
        if (!Intrinsics.LJFF(str, contentPipelineTags.m275getNODE_LOCAL_EMB_UNDERSTANDq0GeycQ())) {
            return;
        }
        C2257808sy c2257808sy = c2258208t2.LIZIZ;
        Long l2 = c2258208t2.LIZLLL.get(NodeTag.m282boximpl(str));
        if (l2 != null && (lValueOf = Long.valueOf(jElapsedRealtime - l2.longValue())) != null) {
            jLongValue = lValueOf.longValue();
        }
        c2257808sy.LJIILL = Long.valueOf(jLongValue);
    }
}
