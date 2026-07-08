package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.algorithm.VEFaceExpressionDetectResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttribute;
import com.ss.android.vesdk.bachfaceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetect;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import com.ss.ugc.android.editor.track.viewmodels.FrameCacheViewModel;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.09qU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2497209qU {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(Bitmap bitmap) {
        VEFaceExpressionDetectResult vEFaceExpressionDetectResult;
        VEFaceDetectInfo faceDetectInfo;
        VEFaceDetect[] info;
        VEFaceAttributeInfo faceAttributeInfo;
        VEFaceAttribute[] info2;
        C439450HLb c439450HLb = new C439450HLb("{\"version\":\"1.0\",\"mode\":2,\"name\":\"AlgorithmGraph_XycsbOBc\",\"model_names\":{\"alg_model\":[\"tt_face\"]},\"nodes\":[{\"name\":\"blit_0\",\"type\":\"blit\",\"config\":{\"size\":{\"width\":360,\"height\":640},\"keyMaps\":{\"intParam\":{},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"expression_detect_0\",\"type\":\"expression_detect\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_attr_detect_ability\":23,\"face_attr_force_detect\":1},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"face_0\",\"type\":\"face\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_max_num\":10,\"face_fast_mode\":0,\"face_detect_mode\":524288,\"face_detect_ability\":2304},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}}],\"links\":[{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":0},{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"face_0\",\"toIndex\":0},{\"fromNode\":\"face_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":1}]}");
        c439450HLb.bitmap = bitmap;
        try {
            List<s> listScanPicture = TEVideoUtils.scanPicture(c439450HLb);
            s sVar = null;
            if (listScanPicture != null) {
                sVar = (s) C13LP.LJJJLZIJ(0, listScanPicture);
            }
            if (!(sVar instanceof VEFaceExpressionDetectResult) || (vEFaceExpressionDetectResult = (VEFaceExpressionDetectResult) sVar) == null || (faceDetectInfo = vEFaceExpressionDetectResult.getFaceDetectInfo()) == null || (info = faceDetectInfo.getInfo()) == null || C13LQ.LJJIIZ(0, info) == null || (faceAttributeInfo = vEFaceExpressionDetectResult.getFaceAttributeInfo()) == null || (info2 = faceAttributeInfo.getInfo()) == null || C13LQ.LJJIIZ(0, info2) == null) {
                return false;
            }
            return true;
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }

    public static boolean LIZIZ(List list) throws Throwable {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Bitmap bitmapLIZLLL = C2471909mP.LIZLLL((String) it2.next(), null);
                if (bitmapLIZLLL != null) {
                    boolean zLIZ = LIZ(bitmapLIZLLL);
                    bitmapLIZLLL.recycle();
                    BitmapCrashChecker.recordBitmapRecyclePoint(bitmapLIZLLL);
                    if (zLIZ) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean LIZJ(String str, long j, long j2, FrameCacheViewModel frameCacheViewModel, String str2) {
        Bitmap bitmapVQ2;
        Object c098200Yq;
        if (j2 == Long.MAX_VALUE) {
            return false;
        }
        if (j < 0) {
            j = 0;
        }
        if (j2 <= j) {
            return false;
        }
        long j3 = (j / 1000) * 1000;
        while (true) {
            Object obj = null;
            if (j3 <= j2) {
                if (frameCacheViewModel != null && (bitmapVQ2 = frameCacheViewModel.vQ2((int) j3, str)) != null && (!bitmapVQ2.isRecycled())) {
                    try {
                        c098200Yq = bitmapVQ2.copy(Bitmap.Config.ARGB_8888, false);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                        obj = c098200Yq;
                    }
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap != null) {
                        try {
                            boolean zLIZ = LIZ(bitmap);
                            bitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                            if (zLIZ) {
                                return true;
                            }
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            bitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmap);
                            throw th2;
                        }
                    } else {
                        continue;
                    }
                }
                j3 += 1000;
            } else {
                if (str2 == null || !(!a0.LJJJIL(str2)) || !LIZIZ(Collections.singletonList(str2))) {
                    return false;
                }
                return true;
            }
        }
    }
}
