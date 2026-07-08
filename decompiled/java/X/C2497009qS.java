package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.vesdk.algorithm.VEFaceExpressionDetectResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetect;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.09qS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.customize.album.AIPortraitFaceCountDetector$detectFaceCount$2", f = "AIPortraitFaceCountDetector.kt", l = {}, m = "invokeSuspend")
public final class C2497009qS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ MediaModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2497009qS(MediaModel mediaModel, InterfaceC1364105Vn<? super C2497009qS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = mediaModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2497009qS(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<s> listScanPicture;
        s sVar;
        VEFaceDetect[] info;
        C1C7U.LIZ("AIPortraitFaceCountDetector@9f9e.detectFaceCount$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2497109qT.LIZ.getClass();
        C2497109qT.LIZIZ.await();
        ConcurrentHashMap<C12837050p, Integer> concurrentHashMap = C2496809qQ.LIZIZ;
        MediaModel mediaModel = this.LL;
        Object obj2 = new Object(mediaModel.id, mediaModel.modify) { // from class: X.050p
            public final String LIZ;
            public final long LIZIZ;

            public final boolean equals(Object obj3) {
                if (this == obj3) {
                    return true;
                }
                if (!(obj3 instanceof C12837050p)) {
                    return false;
                }
                C12837050p c12837050p = (C12837050p) obj3;
                return Intrinsics.LJFF(this.LIZ, c12837050p.LIZ) && this.LIZIZ == c12837050p.LIZIZ;
            }

            public final int hashCode() {
                return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Key(id=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", modifyTime=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = str;
                this.LIZIZ = j;
            }
        };
        Integer numLJ = concurrentHashMap.get(obj2);
        if (numLJ == null) {
            VEFaceExpressionDetectResult vEFaceExpressionDetectResult = null;
            Bitmap bitmapLIZLLL = C2471909mP.LIZLLL(C2471909mP.LJIJ(mediaModel), null);
            int length = 0;
            if (bitmapLIZLLL != null) {
                C201955140j.LJIILL(C533790Kwb.LIZIZ, "PhotoFaceDetectUtils", "start face count detect");
                C439450HLb c439450HLb = new C439450HLb("{\"version\":\"1.0\",\"mode\":2,\"name\":\"AlgorithmGraph_XycsbOBc\",\"model_names\":{\"alg_model\":[\"tt_face\",\"tt_face_attribute_age\",\"tt_face_extra\",\"tt_face_attribute_exp\"]},\"nodes\":[{\"name\":\"blit_0\",\"type\":\"blit\",\"config\":{\"size\":{\"width\":360,\"height\":640},\"keyMaps\":{\"intParam\":{},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"expression_detect_0\",\"type\":\"expression_detect\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_attr_detect_ability\":23,\"face_attr_force_detect\":1},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"face_0\",\"type\":\"face\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_max_num\":10,\"face_fast_mode\":0,\"face_detect_mode\":524288,\"face_detect_ability\":2304},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}}],\"links\":[{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":0},{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"face_0\",\"toIndex\":0},{\"fromNode\":\"face_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":1}]}");
                c439450HLb.bitmap = bitmapLIZLLL;
                try {
                    listScanPicture = TEVideoUtils.scanPicture(c439450HLb);
                } catch (NullPointerException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C201955140j.LJIIIIZZ(C533790Kwb.LIZIZ, "PhotoFaceDetectUtils", "VE detect fail");
                    listScanPicture = null;
                }
                if (listScanPicture != null) {
                    sVar = (s) C13LP.LJJJLZIJ(0, listScanPicture);
                } else {
                    sVar = null;
                }
                if (sVar instanceof VEFaceExpressionDetectResult) {
                    vEFaceExpressionDetectResult = (VEFaceExpressionDetectResult) sVar;
                }
                if (vEFaceExpressionDetectResult != null) {
                    VEFaceDetectInfo faceDetectInfo = vEFaceExpressionDetectResult.getFaceDetectInfo();
                    if (faceDetectInfo != null && (info = faceDetectInfo.getInfo()) != null) {
                        length = info.length;
                    }
                    C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("detect success, face count=");
                    sbLIZ.append(length);
                    C201955140j.LJIILL(c533790Kwb, "PhotoFaceDetectUtils", C2188811AlT.LIZIZ(sbLIZ));
                }
            }
            numLJ = C2286608xc.LJ(length);
            Integer numPutIfAbsent = concurrentHashMap.putIfAbsent((C12837050p) obj2, numLJ);
            if (numPutIfAbsent != null) {
                numLJ = numPutIfAbsent;
            }
        }
        C1C7U.LIZIZ("AIPortraitFaceCountDetector@9f9e.detectFaceCount$2");
        return numLJ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
