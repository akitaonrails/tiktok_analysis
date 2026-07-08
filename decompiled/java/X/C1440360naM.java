package X;

import Y.ARunnableS91S0200000_22;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceAV;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.share.IShareToStoryVideoStreamController;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.AFwS261S0000000_22;

/* JADX INFO: renamed from: X.0naM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440360naM extends AbstractC1434490nQt {
    public static final C01GW<ExecutorService> LLIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(541));
    public final VideoPublishEditModel LLILZLL;

    public final boolean LJIILL() {
        Object c098200Yq;
        Object c098200Yq2;
        String str;
        String str2;
        String str3;
        NLEModel nLEModel = this.LLILZLL.creativeModel.nleInfoModel.nleModel;
        if (nLEModel == null) {
            return true;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (NLEResourceNode nLEResourceNode : nLEModel.getAllResources()) {
            if (nLEResourceNode.hasResourceFile() && C348750Dlp.LIZIZ(nLEResourceNode.getResourceFile())) {
                linkedHashSet.add(nLEResourceNode.getResourceFile());
            }
            NLEResourceAV nLEResourceAVDynamicCast = NLEResourceAV.dynamicCast((NLENode) nLEResourceNode);
            if (nLEResourceAVDynamicCast != null) {
                if (nLEResourceAVDynamicCast.hasFileInfo() && C348750Dlp.LIZIZ(nLEResourceAVDynamicCast.getFileInfo())) {
                    linkedHashSet.add(nLEResourceAVDynamicCast.getFileInfo());
                }
                if (nLEResourceAVDynamicCast.hasReverseResourceFile() && C348750Dlp.LIZIZ(nLEResourceAVDynamicCast.getReverseResourceFile())) {
                    linkedHashSet.add(nLEResourceAVDynamicCast.getReverseResourceFile());
                }
            }
        }
        if (linkedHashSet.isEmpty()) {
            return true;
        }
        C201950140e c201950140e = C201950140e.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("found ");
        sbLIZ.append(linkedHashSet.size());
        sbLIZ.append(" HTTP URL(s) in NLE model");
        C201955140j.LIZLLL(c201950140e, "StreamingDownloadWaitTask", C2188811AlT.LIZIZ(sbLIZ));
        IShareToStoryVideoStreamController iShareToStoryVideoStreamController = (IShareToStoryVideoStreamController) PluggableExtentionKt.pluggableSpi$default(IShareToStoryVideoStreamController.class, false, false, false, 14, null);
        if (iShareToStoryVideoStreamController == null) {
            C201955140j.LJIJJ(c201950140e, "StreamingDownloadWaitTask", "IShareToStoryVideoStreamController SPI is null");
            C110200bM.LIZ("compile_patch", "spi_null", LJIILJJIL(new Pair<>("url_count", Integer.valueOf(linkedHashSet.size()))));
            return false;
        }
        try {
            c098200Yq = iShareToStoryVideoStreamController.LIZ(linkedHashSet);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C201950140e c201950140e2 = C201950140e.LIZIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("awaitDownloads threw, treating all urls as unresolved err=");
            sbLIZ2.append(thM5exceptionOrNullimpl.getMessage());
            C201955140j.LJIJJ(c201950140e2, "StreamingDownloadWaitTask", C2188811AlT.LIZIZ(sbLIZ2));
            Pair<String, ? extends Object>[] pairArr = new Pair[2];
            pairArr[0] = new Pair<>("url_count", Integer.valueOf(linkedHashSet.size()));
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "";
            }
            pairArr[1] = new Pair<>("err", message);
            C110200bM.LIZ("compile_patch", "await_threw", LJIILJJIL(pairArr));
        }
        Map mapLJ = C2097608Jq.LJ();
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = mapLJ;
        }
        HashMap map = new HashMap((Map) c098200Yq);
        Set setLJII = C15442062u.LJII(linkedHashSet, map.keySet());
        if (!setLJII.isEmpty()) {
            C201955140j.LJIJJ(C201950140e.LIZIZ, "StreamingDownloadWaitTask", setLJII.size() + " URL(s) unresolved after wait, failing publish");
            C110200bM.LIZ("compile_patch", "unresolved_after_wait", LJIILJJIL(new Pair<>("unresolved_count", Integer.valueOf(setLJII.size())), new Pair<>("url_count", Integer.valueOf(linkedHashSet.size()))));
            return false;
        }
        Map<String, Object> mapLJIILJJIL = LJIILJJIL(new Pair<>("resolved_count", Integer.valueOf(map.size())), new Pair<>("url_count", Integer.valueOf(linkedHashSet.size())));
        C110200bM.LIZ.getClass();
        C110200bM.LIZIZ("compile_patch", "success", "", mapLJIILJJIL);
        for (NLEResourceNode nLEResourceNode2 : nLEModel.getAllResources()) {
            if (nLEResourceNode2.hasResourceFile() && (str3 = (String) map.get(nLEResourceNode2.getResourceFile())) != null) {
                nLEResourceNode2.setResourceFile(str3);
            }
            NLEResourceAV nLEResourceAVDynamicCast2 = NLEResourceAV.dynamicCast((NLENode) nLEResourceNode2);
            if (nLEResourceAVDynamicCast2 != null) {
                if (nLEResourceAVDynamicCast2.hasFileInfo() && (str2 = (String) map.get(nLEResourceAVDynamicCast2.getFileInfo())) != null) {
                    nLEResourceAVDynamicCast2.setFileInfo(str2);
                }
                if (nLEResourceAVDynamicCast2.hasReverseResourceFile() && (str = (String) map.get(nLEResourceAVDynamicCast2.getReverseResourceFile())) != null) {
                    nLEResourceAVDynamicCast2.setReverseResourceFile(str);
                }
            }
        }
        C201950140e c201950140e3 = C201950140e.LIZIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("replaced ");
        sbLIZ3.append(map.size());
        sbLIZ3.append(" URL(s) with local paths");
        C201955140j.LIZLLL(c201950140e3, "StreamingDownloadWaitTask", C2188811AlT.LIZIZ(sbLIZ3));
        if (map.isEmpty()) {
            return true;
        }
        try {
            String nleData = this.LLILZLL.getNleData();
            if (nleData != null && nleData.length() != 0) {
                C0FGC.LIZ(2);
                NLEEditor nLEEditorLIZ = C346630DiP.LIZ();
                try {
                    nLEEditorLIZ.restore(nleData);
                    C347030Dj3.LIZ(nLEEditorLIZ, map, AFwS261S0000000_22.get$arr$(373));
                    this.LLILZLL.setNleData(nLEEditorLIZ.store());
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("refreshed editModel.nleData with ");
                    sbLIZ4.append(map.size());
                    sbLIZ4.append(" local path(s)");
                    C201955140j.LIZLLL(c201950140e3, "StreamingDownloadWaitTask", C2188811AlT.LIZIZ(sbLIZ4));
                    try {
                        nLEEditorLIZ.delete();
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                } finally {
                }
            }
            c098200Yq2 = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq2 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
        if (thM5exceptionOrNullimpl2 != null) {
            C201950140e c201950140e4 = C201950140e.LIZIZ;
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("refresh nleData failed err=");
            sbLIZ5.append(thM5exceptionOrNullimpl2.getMessage());
            C201955140j.LJIJJ(c201950140e4, "StreamingDownloadWaitTask", C2188811AlT.LIZIZ(sbLIZ5));
            Pair<String, ? extends Object>[] pairArr2 = new Pair[2];
            pairArr2[0] = new Pair<>("replaced_count", Integer.valueOf(map.size()));
            String message2 = thM5exceptionOrNullimpl2.getMessage();
            pairArr2[1] = new Pair<>("err", message2 != null ? message2 : "");
            C110200bM.LIZ("compile_patch", "nledata_refresh_failed", LJIILJJIL(pairArr2));
        }
        return true;
    }

    @Override // X.AbstractC1434490nQt
    public final EnumC1434810nRP LJIIJJI() {
        return EnumC1434810nRP.STREAMING_DOWNLOAD_WAIT;
    }

    public C1440360naM(VideoPublishEditModel videoPublishEditModel) {
        this.LLILZLL = videoPublishEditModel;
    }

    public final Map<String, Object> LJIILJJIL(Pair<String, ? extends Object>... pairArr) {
        C13DA c13da = new C13DA();
        c13da.put("creation_id", this.LLILZLL.getCreationId());
        String str = this.LLILZLL.mShootWay;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c13da.put("shoot_way", str);
        String enterFrom = this.LLILZLL.getEnterFrom();
        if (enterFrom != null) {
            str2 = enterFrom;
        }
        c13da.put("enter_from", str2);
        c13da.put("content_source", C1428470nHB.LJIILIIL(this.LLILZLL));
        for (Pair<String, ? extends Object> pair : pairArr) {
            c13da.put(pair.getFirst(), pair.getSecond());
        }
        return c13da.build();
    }

    @Override // X.AbstractC1434490nQt
    public final void LJII(C1404610meh c1404610meh, C1431070nLN c1431070nLN) {
        Object next;
        PublishModel publishModel;
        Iterator<Object> it2 = c1404610meh.LIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next instanceof C1434970nRf) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        if (!(next instanceof C1434970nRf)) {
            next = null;
        }
        C1434970nRf c1434970nRf = (C1434970nRf) next;
        if (c1434970nRf != null) {
            publishModel = c1434970nRf.LIZ;
        } else {
            publishModel = null;
        }
        if (!C1440380naO.LIZ(this.LLILZLL)) {
            c1431070nLN.LJ(null, true);
        } else if (publishModel != null && publishModel.isEditPrePublish) {
            C201955140j.LIZLLL(C201950140e.LIZIZ, "StreamingDownloadWaitTask", "skip wait for edit pre-publish (result discarded)");
            c1431070nLN.LJ(null, true);
        } else {
            LLIZ.getValue().execute(new ARunnableS91S0200000_22(this, c1431070nLN, 45));
        }
    }
}
