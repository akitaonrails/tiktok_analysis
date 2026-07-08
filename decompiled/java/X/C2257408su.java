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
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08su, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2257408su implements IPipelineListener {
    public static final C2257408su LIZ = new C2257408su();
    public static final ConcurrentHashMap<PipelineTag, C2258008t0> LIZIZ = new ConcurrentHashMap<>();

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeStart-R6Iu3AI */
    public final void mo17onNodeStartR6Iu3AI(PipelineTag pipelineTag, String str) {
        C2258008t0 c2258008t0 = LIZIZ.get(pipelineTag);
        if (c2258008t0 == null) {
            return;
        }
        IMusicRequestParamKt.safePutIfAbsent(c2258008t0.LIZLLL, NodeTag.m282boximpl(str), Long.valueOf(SystemClock.elapsedRealtime()));
        if (Intrinsics.LJFF(str, ContentPipelineTags.INSTANCE.m276getNODE_REQUESTq0GeycQ())) {
            c2258008t0.LJFF = true;
        }
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
        LIZIZ.put(pipelineTag, new C2258008t0(contentUnderstandingRequest, c2257808sy, jElapsedRealtime));
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onFinishSuccess(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, ContentUnderstandingResult contentUnderstandingResult) {
        C2258008t0 c2258008t0 = LIZIZ.get(pipelineTag);
        if (c2258008t0 == null) {
            return;
        }
        c2258008t0.LJ = Long.valueOf(SystemClock.elapsedRealtime() - c2258008t0.LIZJ);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(com.ss.android.ugc.aweme.music.understanding.PipelineTag r6, com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse r7, java.lang.Throwable r8, long r9) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2257408su.LIZ(com.ss.android.ugc.aweme.music.understanding.PipelineTag, com.ss.android.ugc.aweme.music.understanding.api.ContentUnderstandingResponse, java.lang.Throwable, long):void");
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    public final void onFinishFailed(PipelineTag pipelineTag, ContentUnderstandingRequest contentUnderstandingRequest, Throwable th, int i) {
        Integer num;
        ConcurrentHashMap<PipelineTag, C2258008t0> concurrentHashMap = LIZIZ;
        C2258008t0 c2258008t0 = concurrentHashMap.get(pipelineTag);
        if (c2258008t0 == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - c2258008t0.LIZJ;
        c2258008t0.LJ = Long.valueOf(jElapsedRealtime);
        if (c2258008t0.LJFF) {
            return;
        }
        concurrentHashMap.remove(pipelineTag);
        C2257808sy c2257808sy = c2258008t0.LIZIZ;
        if (c2257808sy.LJI == null) {
            c2257808sy.LJI = Integer.valueOf(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getClass().getSimpleName());
            sbLIZ.append(':');
            sbLIZ.append(th.getMessage());
            c2257808sy.LJFF = C2188811AlT.LIZIZ(sbLIZ);
            c2257808sy.LJIIZILJ = 1;
        }
        C2257808sy c2257808sy2 = c2258008t0.LIZIZ;
        String str = c2257808sy2.LIZJ;
        if (str == null) {
            str = c2258008t0.LIZ.understandingKey;
        }
        c2257808sy2.LIZJ = str;
        c2257808sy2.LJIIJJI = Long.valueOf(jElapsedRealtime);
        C2257908sz c2257908sz = c2258008t0.LIZ.mobData;
        if (c2257908sz != null) {
            num = c2257908sz.LJIIIZ;
        } else {
            num = null;
        }
        c2257808sy2.LJJIFFI = num;
        C2257708sx c2257708sx = C2257708sx.LIZ;
        C2257808sy c2257808sy3 = c2258008t0.LIZIZ;
        c2257708sx.getClass();
        C2257708sx.LIZ(c2257808sy3);
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeFailed-qawT-gY */
    public final void mo16onNodeFailedqawTgY(PipelineTag pipelineTag, String str, Throwable th, int i) {
        C2258008t0 c2258008t0 = LIZIZ.get(pipelineTag);
        if (c2258008t0 == null) {
            return;
        }
        C2257808sy c2257808sy = c2258008t0.LIZIZ;
        if (c2257808sy.LJI == null) {
            c2257808sy.LJI = Integer.valueOf(i);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(th.getClass().getSimpleName());
            sbLIZ.append(':');
            sbLIZ.append(th.getMessage());
            c2257808sy.LJFF = C2188811AlT.LIZIZ(sbLIZ);
            c2257808sy.LJIIZILJ = 1;
        }
    }

    @Override // com.ss.android.ugc.aweme.music.understanding.IPipelineListener
    /* JADX INFO: renamed from: onNodeSuccess-qawT-gY */
    public final void mo18onNodeSuccessqawTgY(PipelineTag pipelineTag, String str, ContentUnderstandingResult contentUnderstandingResult, boolean z) {
        long jLongValue;
        ContentUnderstandingResult.RequestResult requestResult;
        long jLongValue2;
        long jLongValue3;
        String str2;
        Long lLJIILIIL;
        String str3;
        Long lLJIILIIL2;
        String str4;
        Long lLJIILIIL3;
        long jLongValue4;
        String zipFilePath;
        ContentUnderstandingResult.ZipBundle zipBundle;
        long jLongValue5;
        String zipFilePath2;
        ContentUnderstandingResult.ZipBundle zipBundle2;
        long jLongValue6;
        C2258008t0 c2258008t0 = LIZIZ.get(pipelineTag);
        if (c2258008t0 == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
        long jLongValue7 = 0;
        if (Intrinsics.LJFF(str, contentPipelineTags.m273getNODE_COMPRESSq0GeycQ())) {
            Long lLIZ = c2258008t0.LIZ(jElapsedRealtime, str);
            if (lLIZ != null) {
                jLongValue6 = lLIZ.longValue();
            } else {
                jLongValue6 = 0;
            }
            C2257808sy c2257808sy = c2258008t0.LIZIZ;
            if (!z) {
                jLongValue7 = jLongValue6;
            }
            c2257808sy.LJIIL = Long.valueOf(jLongValue7);
            return;
        }
        Long lValueOf = null;
        if (Intrinsics.LJFF(str, contentPipelineTags.m278getNODE_ZIPq0GeycQ())) {
            Long lLIZ2 = c2258008t0.LIZ(jElapsedRealtime, str);
            if (lLIZ2 != null) {
                jLongValue5 = lLIZ2.longValue();
            } else {
                jLongValue5 = 0;
            }
            C2257808sy c2257808sy2 = c2258008t0.LIZIZ;
            if (!z) {
                jLongValue7 = jLongValue5;
            }
            c2257808sy2.LJIILIIL = Long.valueOf(jLongValue7);
            if ((contentUnderstandingResult instanceof ContentUnderstandingResult.ZipBundle) && (zipBundle2 = (ContentUnderstandingResult.ZipBundle) contentUnderstandingResult) != null) {
                zipFilePath2 = zipBundle2.getZipFilePath();
            } else {
                zipFilePath2 = null;
            }
            C2257808sy c2257808sy3 = c2258008t0.LIZIZ;
            if (zipFilePath2 != null) {
                C0VSJ c0vsj = new C0VSJ(zipFilePath2);
                if (c0vsj.exists()) {
                    lValueOf = Long.valueOf(c0vsj.length());
                }
            }
            c2257808sy3.LJIILLIIL = lValueOf;
            return;
        }
        if (Intrinsics.LJFF(str, contentPipelineTags.m277getNODE_WAIT_EXTRACTq0GeycQ())) {
            Long lLIZ3 = c2258008t0.LIZ(jElapsedRealtime, str);
            if (lLIZ3 != null) {
                jLongValue4 = lLIZ3.longValue();
            } else {
                jLongValue4 = 0;
            }
            C2257808sy c2257808sy4 = c2258008t0.LIZIZ;
            if (!z) {
                jLongValue7 = jLongValue4;
            }
            c2257808sy4.LJIILJJIL = Long.valueOf(jLongValue7);
            if ((contentUnderstandingResult instanceof ContentUnderstandingResult.ZipBundle) && (zipBundle = (ContentUnderstandingResult.ZipBundle) contentUnderstandingResult) != null) {
                zipFilePath = zipBundle.getZipFilePath();
            } else {
                zipFilePath = null;
            }
            C2257808sy c2257808sy5 = c2258008t0.LIZIZ;
            if (zipFilePath != null) {
                C0VSJ c0vsj2 = new C0VSJ(zipFilePath);
                if (c0vsj2.exists()) {
                    lValueOf = Long.valueOf(c0vsj2.length());
                }
            }
            c2257808sy5.LJIILLIIL = lValueOf;
            return;
        }
        if (!Intrinsics.LJFF(str, contentPipelineTags.m276getNODE_REQUESTq0GeycQ())) {
            return;
        }
        Long lLIZ4 = c2258008t0.LIZ(jElapsedRealtime, str);
        if (lLIZ4 != null) {
            jLongValue = lLIZ4.longValue();
        } else {
            jLongValue = 0;
        }
        C2257808sy c2257808sy6 = c2258008t0.LIZIZ;
        if (z) {
            jLongValue = 0;
        }
        c2257808sy6.LJIILL = Long.valueOf(jLongValue);
        if (!(contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) || (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) == null) {
            return;
        }
        C2257808sy c2257808sy7 = c2258008t0.LIZIZ;
        String understandingKey = c2257808sy7.LIZJ;
        if (understandingKey == null) {
            understandingKey = requestResult.getUnderstandingKey();
        }
        c2257808sy7.LIZJ = understandingKey;
        c2257808sy7.LJIIZILJ = 0;
        ContentUnderstandingResult.CostInfo costInfo = requestResult.getCostInfo();
        if (costInfo != null && (str4 = costInfo.musicServerCostMs) != null && (lLJIILIIL3 = C2095008Iq.LJIILIIL(str4)) != null) {
            jLongValue2 = lLJIILIIL3.longValue();
        } else {
            jLongValue2 = 0;
        }
        c2257808sy7.LJIJJLI = Long.valueOf(jLongValue2);
        ContentUnderstandingResult.CostInfo costInfo2 = requestResult.getCostInfo();
        if (costInfo2 != null && (str3 = costInfo2.musicServerCallRecommendCostMs) != null && (lLJIILIIL2 = C2095008Iq.LJIILIIL(str3)) != null) {
            jLongValue3 = lLJIILIIL2.longValue();
        } else {
            jLongValue3 = 0;
        }
        c2257808sy7.LJIL = Long.valueOf(jLongValue3);
        ContentUnderstandingResult.CostInfo costInfo3 = requestResult.getCostInfo();
        if (costInfo3 != null && (str2 = costInfo3.recommendUnderstandingCostMs) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(str2)) != null) {
            jLongValue7 = lLJIILIIL.longValue();
        }
        c2257808sy7.LJJ = Long.valueOf(jLongValue7);
    }
}
