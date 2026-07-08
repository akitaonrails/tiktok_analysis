package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.effectmanager.DownloadableModelSupport;
import com.ss.android.ugc.effectmanager.IFetchResourceListener;
import com.ss.android.vesdk.algorithm.VEFaceExpressionDetectResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttribute;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetect;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import com.ss.ugc.effectplatform.algorithm.AlgorithmModelResourceFinder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.09qT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2497109qT {
    public static final C2497109qT LIZ = new C2497109qT();
    public static final CountDownLatch LIZIZ = new CountDownLatch(1);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final String[] LIZLLL = {""};
    public static final Map<String, List<String>> LJ;

    static {
        HashMap map = new HashMap();
        map.put("1", Collections.singletonList("tt_face"));
        map.put("2", Collections.singletonList("tt_face_extra"));
        map.put("3", Collections.singletonList("tt_face_attribute_exp"));
        map.put("4", Collections.singletonList("tt_face_attribute_age"));
        LJ = map;
    }

    public static void LIZIZ() {
        DownloadableModelSupport.getInstance().fetchResourcesByRequirementsAndModelNames(LIZLLL, LJ, new IFetchResourceListener() { // from class: X.098j
            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onFailure(Exception exc) {
                C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("exception ");
                sbLIZ.append(exc.getMessage());
                C201955140j.LJIILL(c533790Kwb, "PhotoFaceDetectUtils", C2188811AlT.LIZIZ(sbLIZ));
                C2497109qT.LIZIZ.countDown();
            }

            @Override // com.ss.android.ugc.effectmanager.IFetchResourceListener
            public final void onSuccess(long j) {
                C201955140j.LJIILL(C533790Kwb.LIZIZ, "PhotoFaceDetectUtils", "success downloading models");
                C2497109qT.LIZJ.set(true);
                C2497109qT.LIZIZ.countDown();
            }
        });
    }

    public static boolean LIZJ() {
        Object c098200Yq;
        boolean z;
        try {
            if (C13Q5.LIZJ()) {
                AlgorithmModelResourceFinder algorithmModelResourceFinderLIZLLL = C13Q5.LIZ().LIZLLL();
                ArrayList arrayList = (ArrayList) C15438062q.LJIJJLI(((HashMap) LJ).values());
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (!algorithmModelResourceFinderLIZLLL.isResourceAvailable((String) it2.next())) {
                            z = false;
                            break;
                        }
                    }
                }
                z = true;
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            } else {
                z = false;
                c098200Yq = Boolean.valueOf(z);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Boolean bool = Boolean.FALSE;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = bool;
        }
        return ((Boolean) c098200Yq).booleanValue();
    }

    public static EnumC23225098d LIZ(Bitmap bitmap) {
        List<s> listScanPicture;
        VEFaceExpressionDetectResult vEFaceExpressionDetectResult;
        VEFaceDetect[] info;
        VEFaceAttribute[] info2;
        C201955140j.LJIILL(C533790Kwb.LIZIZ, "PhotoFaceDetectUtils", "start face detect");
        C439450HLb c439450HLb = new C439450HLb("{\"version\":\"1.0\",\"mode\":2,\"name\":\"AlgorithmGraph_XycsbOBc\",\"model_names\":{\"alg_model\":[\"tt_face\",\"tt_face_attribute_age\",\"tt_face_extra\",\"tt_face_attribute_exp\"]},\"nodes\":[{\"name\":\"blit_0\",\"type\":\"blit\",\"config\":{\"size\":{\"width\":360,\"height\":640},\"keyMaps\":{\"intParam\":{},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"expression_detect_0\",\"type\":\"expression_detect\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_attr_detect_ability\":23,\"face_attr_force_detect\":1},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"face_0\",\"type\":\"face\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_max_num\":10,\"face_fast_mode\":0,\"face_detect_mode\":524288,\"face_detect_ability\":2304},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}}],\"links\":[{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":0},{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"face_0\",\"toIndex\":0},{\"fromNode\":\"face_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":1}]}");
        c439450HLb.bitmap = bitmap;
        s sVar = null;
        try {
            listScanPicture = TEVideoUtils.scanPicture(c439450HLb);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            C201955140j.LJIIIIZZ(C533790Kwb.LIZIZ, "PhotoFaceDetectUtils", "VE detect fail");
            listScanPicture = null;
        }
        if (listScanPicture != null) {
            sVar = (s) C13LP.LJJJLZIJ(0, listScanPicture);
        }
        if ((sVar instanceof VEFaceExpressionDetectResult) && (vEFaceExpressionDetectResult = (VEFaceExpressionDetectResult) sVar) != null) {
            VEFaceDetectInfo faceDetectInfo = vEFaceExpressionDetectResult.getFaceDetectInfo();
            if (faceDetectInfo != null && (info = faceDetectInfo.getInfo()) != null && C13LQ.LJJIIZ(0, info) != null) {
                VEFaceAttributeInfo faceAttributeInfo = vEFaceExpressionDetectResult.getFaceAttributeInfo();
                if (faceAttributeInfo != null && (info2 = faceAttributeInfo.getInfo()) != null && C13LQ.LJJIIZ(0, info2) != null) {
                    C201955140j.LJIILL(C533790Kwb.LIZIZ, "PhotoFaceDetectUtils", "detect success");
                    return EnumC23225098d.HAS_FACE;
                }
                return EnumC23225098d.ATTR_MISSING;
            }
            return EnumC23225098d.NO_FACE;
        }
        return EnumC23225098d.SCAN_ERROR;
    }
}
