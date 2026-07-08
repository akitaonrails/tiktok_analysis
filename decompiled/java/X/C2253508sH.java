package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.music.understanding.ContentPipelineTags;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingRequest;
import com.ss.android.ugc.aweme.music.understanding.ContentUnderstandingResult;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingService;
import com.ss.android.ugc.aweme.music.understanding.IContentUnderstandingServiceWrap;
import com.ss.android.ugc.aweme.music.understanding.NodeTag;
import com.ss.android.ugc.aweme.music.understanding.ProcessedPipelineSnapshot;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS286S0000000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08sH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2253508sH {
    public static final C2253508sH LIZ = new C2253508sH();
    public static final Map<String, String> LIZIZ = new ConcurrentHashMap();

    public static Integer LIZJ() {
        ContentUnderstandingResult contentUnderstandingResult;
        ContentUnderstandingResult.RequestResult requestResult;
        ContentUnderstandingRequest initRequest;
        C2257908sz c2257908sz;
        IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
        if (iContentUnderstandingService == null || (contentUnderstandingResult = (ContentUnderstandingResult) iContentUnderstandingService.LIZIZ(C2253208sE.LIZ).get(NodeTag.m282boximpl(ContentPipelineTags.INSTANCE.m276getNODE_REQUESTq0GeycQ()))) == null || !(contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) || (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) == null || (initRequest = requestResult.getInitRequest()) == null || (c2257908sz = initRequest.mobData) == null) {
            return null;
        }
        return c2257908sz.LJIIIZ;
    }

    public static long LIZLLL() {
        IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
        if (iContentUnderstandingService == null) {
            return 0L;
        }
        return iContentUnderstandingService.LIZJ(C2253208sE.LIZ);
    }

    public static String LJFF() {
        ContentUnderstandingResult contentUnderstandingResult;
        ContentUnderstandingResult.RequestResult requestResult;
        String understandingKey;
        IContentUnderstandingServiceWrap iContentUnderstandingServiceWrap = (IContentUnderstandingServiceWrap) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingServiceWrap.class, false, false, false, 14, null);
        String strLIZJ = iContentUnderstandingServiceWrap != null ? iContentUnderstandingServiceWrap.LIZJ() : null;
        if (!C123100dR.LIZ(strLIZJ)) {
            IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
            return (iContentUnderstandingService == null || (contentUnderstandingResult = (ContentUnderstandingResult) iContentUnderstandingService.LIZIZ(C2253208sE.LIZ).get(NodeTag.m282boximpl(ContentPipelineTags.INSTANCE.m276getNODE_REQUESTq0GeycQ()))) == null || !(contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) || (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) == null || (understandingKey = requestResult.getUnderstandingKey()) == null) ? "" : understandingKey;
        }
        C1673840tew c1673840tew = C1673840tew.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("findRecommendMusicUnderstandingKey bestMatchKey:");
        sbLIZ.append(strLIZJ);
        C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
        return strLIZJ;
    }

    public static C11NZ LJIIIIZZ() {
        ProcessedPipelineSnapshot next;
        C11NZ c11nzLJII;
        IContentUnderstandingServiceWrap iContentUnderstandingServiceWrap = (IContentUnderstandingServiceWrap) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingServiceWrap.class, false, false, false, 14, null);
        String strLIZJ = iContentUnderstandingServiceWrap != null ? iContentUnderstandingServiceWrap.LIZJ() : null;
        if (C123100dR.LIZ(strLIZJ)) {
            C1673840tew c1673840tew = C1673840tew.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onlyObserveMusicUnderstandingKeyTask bestMatchKey:");
            sbLIZ.append(strLIZJ);
            C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
            return C11NZ.LJJJJZ(strLIZJ);
        }
        C2253208sE c2253208sE = C2253208sE.LIZ;
        AFwS286S0000000_3 aFwS286S0000000_3 = AFwS286S0000000_3.get$arr$(3);
        C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startOrObservePipeline pipelineTag=");
        sbLIZ2.append(c2253208sE.getValue());
        C201955140j.LJIILJJIL(c1673840tew2, C2188811AlT.LIZIZ(sbLIZ2));
        IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
        if (iContentUnderstandingService == null) {
            return null;
        }
        Iterator<ProcessedPipelineSnapshot> it2 = iContentUnderstandingService.LJFF().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            ProcessedPipelineSnapshot processedPipelineSnapshot = next;
            if (((Boolean) aFwS286S0000000_3.invoke(processedPipelineSnapshot.pipelineTag, processedPipelineSnapshot.request)).booleanValue()) {
                break;
            }
        }
        ProcessedPipelineSnapshot processedPipelineSnapshot2 = next;
        if (processedPipelineSnapshot2 != null) {
            C1673840tew c1673840tew3 = C1673840tew.LIZIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startOrObservePipeline use cache:");
            sbLIZ3.append(processedPipelineSnapshot2.result);
            C201955140j.LJIILJJIL(c1673840tew3, C2188811AlT.LIZIZ(sbLIZ3));
            c11nzLJII = C11NZ.LJJJJZ(processedPipelineSnapshot2.result);
        } else {
            if (!iContentUnderstandingService.LJI(c2253208sE)) {
                C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "startOrObservePipeline observe");
                return null;
            }
            C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "startOrObservePipeline isPipelineRunning");
            c11nzLJII = iContentUnderstandingService.LJII(c2253208sE);
        }
        if (c11nzLJII != null) {
            return c11nzLJII.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.08sI
                @Override // X.InterfaceC1487280oo2
                public final Object apply(Object obj) {
                    ContentUnderstandingResult.RequestResult requestResult;
                    ContentUnderstandingResult contentUnderstandingResult = (ContentUnderstandingResult) obj;
                    if (!(contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) || (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) == null) {
                        return null;
                    }
                    return requestResult.getUnderstandingKey();
                }
            });
        }
        return null;
    }

    public static String LIZ(String str) {
        boolean z;
        IContentUnderstandingService iContentUnderstandingService;
        ContentUnderstandingResult.ZipBundle zipBundle;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null)) == null) {
            return "";
        }
        C2253208sE c2253208sE = C2253208sE.LIZ;
        ContentPipelineTags contentPipelineTags = ContentPipelineTags.INSTANCE;
        Iterator it2 = C1697810uHb.LJIIJJI(NodeTag.m282boximpl(contentPipelineTags.m278getNODE_ZIPq0GeycQ()), NodeTag.m282boximpl(contentPipelineTags.m277getNODE_WAIT_EXTRACTq0GeycQ())).iterator();
        while (it2.hasNext()) {
            String strM288unboximpl = ((NodeTag) it2.next()).m288unboximpl();
            ContentUnderstandingResult contentUnderstandingResultLJIIIIZZ = iContentUnderstandingService.LJIIIIZZ(c2253208sE, strM288unboximpl);
            String str2 = null;
            if ((contentUnderstandingResultLJIIIIZZ instanceof ContentUnderstandingResult.ZipBundle) && (zipBundle = (ContentUnderstandingResult.ZipBundle) contentUnderstandingResultLJIIIIZZ) != null) {
                ContentUnderstandingRequest initRequest = zipBundle.getInitRequest();
                if (initRequest != null) {
                    str2 = initRequest.understandingKey;
                }
                if (Intrinsics.LJFF(str2, str) && zipBundle.getZipFilePath().length() > 0 && new C0VSJ(zipBundle.getZipFilePath()).exists()) {
                    C1673840tew c1673840tew = C1673840tew.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("findFrameFilePathByUnderstandingKey hit node=");
                    sbLIZ.append(strM288unboximpl);
                    sbLIZ.append(", path=");
                    sbLIZ.append(zipBundle.getZipFilePath());
                    C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
                    return zipBundle.getZipFilePath();
                }
            }
        }
        return "";
    }

    public static String LIZIZ(String str) {
        boolean z;
        IContentUnderstandingService iContentUnderstandingService;
        C2250308rl c2250308rl;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || (iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null)) == null) {
            return "";
        }
        ContentUnderstandingResult contentUnderstandingResultLJIIIIZZ = iContentUnderstandingService.LJIIIIZZ(C2250708rp.LIZ, ContentPipelineTags.INSTANCE.m274getNODE_LOCAL_EMB_SCANq0GeycQ());
        if (!(contentUnderstandingResultLJIIIIZZ instanceof C2250308rl) || (c2250308rl = (C2250308rl) contentUnderstandingResultLJIIIIZZ) == null || !Intrinsics.LJFF(c2250308rl.LIZ, str)) {
            return "";
        }
        return c2250308rl.LIZ();
    }

    public static long LJ(String str) {
        if (str.length() == 0) {
            return LIZLLL();
        }
        IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
        if (iContentUnderstandingService == null) {
            return LIZLLL();
        }
        long jLIZLLL = iContentUnderstandingService.LIZLLL(C2253208sE.LIZ, str);
        if (jLIZLLL <= 0) {
            return LIZLLL();
        }
        return jLIZLLL;
    }

    public static String LJI(String str) {
        boolean z;
        String str2;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z || (str2 = (String) ((ConcurrentHashMap) LIZIZ).get(str)) == null) {
            return "demotion";
        }
        return str2;
    }

    public static C11NZ LJII(ContentUnderstandingRequest contentUnderstandingRequest) {
        String strLIZJ;
        C11NZ c11nzLJII;
        if (!C461720I8s.LJ()) {
            return C11NZ.LJJJJZ("");
        }
        IContentUnderstandingServiceWrap iContentUnderstandingServiceWrap = (IContentUnderstandingServiceWrap) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingServiceWrap.class, false, false, false, 14, null);
        ProcessedPipelineSnapshot processedPipelineSnapshot = null;
        if (iContentUnderstandingServiceWrap != null) {
            strLIZJ = iContentUnderstandingServiceWrap.LIZJ();
        } else {
            strLIZJ = null;
        }
        if (C123100dR.LIZ(strLIZJ)) {
            C1673840tew c1673840tew = C1673840tew.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getOrStartMusicUnderstandingKeyTask bestMatchKey:");
            sbLIZ.append(strLIZJ);
            C201955140j.LJIILJJIL(c1673840tew, C2188811AlT.LIZIZ(sbLIZ));
            return C11NZ.LJJJJZ(strLIZJ);
        }
        C2253208sE c2253208sE = C2253208sE.LIZ;
        C2253308sF c2253308sF = new C2253308sF(contentUnderstandingRequest, strLIZJ);
        C1673840tew c1673840tew2 = C1673840tew.LIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startOrObservePipeline pipelineTag=");
        sbLIZ2.append(c2253208sE.getValue());
        sbLIZ2.append(", sourcesSize=");
        sbLIZ2.append(contentUnderstandingRequest.sources.size());
        sbLIZ2.append(", sourcesHash=");
        sbLIZ2.append(contentUnderstandingRequest.sources.hashCode());
        C201955140j.LJIILJJIL(c1673840tew2, C2188811AlT.LIZIZ(sbLIZ2));
        IContentUnderstandingService iContentUnderstandingService = (IContentUnderstandingService) PluggableExtentionKt.pluggableSpi$default(IContentUnderstandingService.class, false, false, false, 14, null);
        if (iContentUnderstandingService == null) {
            c11nzLJII = C11NZ.LJJIJLIJ(new IllegalStateException("IContentUnderstandingService not found"));
        } else {
            Iterator<ProcessedPipelineSnapshot> it2 = iContentUnderstandingService.LJFF().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                ProcessedPipelineSnapshot next = it2.next();
                ProcessedPipelineSnapshot processedPipelineSnapshot2 = next;
                if (((Boolean) c2253308sF.invoke(processedPipelineSnapshot2.pipelineTag, processedPipelineSnapshot2.request, processedPipelineSnapshot2.result)).booleanValue()) {
                    processedPipelineSnapshot = next;
                    break;
                }
            }
            ProcessedPipelineSnapshot processedPipelineSnapshot3 = processedPipelineSnapshot;
            if (processedPipelineSnapshot3 != null) {
                C1673840tew c1673840tew3 = C1673840tew.LIZIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("startOrObservePipeline use cache:");
                sbLIZ3.append(processedPipelineSnapshot3.result);
                C201955140j.LJIILJJIL(c1673840tew3, C2188811AlT.LIZIZ(sbLIZ3));
                c11nzLJII = C11NZ.LJJJJZ(processedPipelineSnapshot3.result);
            } else if (iContentUnderstandingService.LJI(c2253208sE)) {
                C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "startOrObservePipeline isPipelineRunning");
                c11nzLJII = iContentUnderstandingService.LJII(c2253208sE);
            } else {
                C201955140j.LJIILJJIL(C1673840tew.LIZIZ, "startOrObservePipeline startPipeline");
                iContentUnderstandingService.LJ(c2253208sE, contentUnderstandingRequest);
                c11nzLJII = iContentUnderstandingService.LJII(c2253208sE);
            }
        }
        return c11nzLJII.LJJJJZI(new InterfaceC1487280oo2() { // from class: X.08sG
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                ContentUnderstandingResult.RequestResult requestResult;
                ContentUnderstandingResult contentUnderstandingResult = (ContentUnderstandingResult) obj;
                if (!(contentUnderstandingResult instanceof ContentUnderstandingResult.RequestResult) || (requestResult = (ContentUnderstandingResult.RequestResult) contentUnderstandingResult) == null) {
                    requestResult = new ContentUnderstandingResult.RequestResult("", null, null, null, null, null, null);
                }
                return requestResult.getUnderstandingKey();
            }
        });
    }
}
