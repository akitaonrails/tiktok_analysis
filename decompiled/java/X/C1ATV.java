package X;

import android.graphics.Bitmap;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.vesdk.algorithm.VEFaceExpressionDetectResult;
import com.ss.android.vesdk.algorithm.s;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetect;
import com.ss.android.vesdk.bachfaceinfo.VEFaceDetectInfo;
import java.util.List;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.1ATV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1ATV implements C1ATX {
    public final C1DK1 LIZ;
    public final InterfaceC2179881ATa LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(new AwS577S0100000_33(this, 4193));

    @Override // X.C1ATX
    public final void release() {
    }

    @Override // X.C1ATX
    public final void init() {
        C565620MGi.LIZ.LIZ();
    }

    public static boolean LIZIZ(Bitmap bitmap) {
        List<s> listScanPicture;
        VEFaceExpressionDetectResult vEFaceExpressionDetectResult;
        VEFaceDetectInfo faceDetectInfo;
        VEFaceDetect[] info;
        C439450HLb c439450HLb = new C439450HLb("{\"version\":\"1.0\",\"mode\":2,\"name\":\"AlgorithmGraph_XycsbOBc\",\"model_names\":{\"alg_model\":[\"tt_face\",\"tt_face_attribute_age\",\"tt_face_extra\",\"tt_face_attribute_exp\"]},\"nodes\":[{\"name\":\"blit_0\",\"type\":\"blit\",\"config\":{\"size\":{\"width\":360,\"height\":640},\"keyMaps\":{\"intParam\":{},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"expression_detect_0\",\"type\":\"expression_detect\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_attr_detect_ability\":23,\"face_attr_force_detect\":1},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}},{\"name\":\"face_0\",\"type\":\"face\",\"config\":{\"keyMaps\":{\"intParam\":{\"face_max_num\":10,\"face_fast_mode\":0,\"face_detect_mode\":524288,\"face_detect_ability\":2304},\"floatParam\":{},\"stringParam\":{},\"pathParam\":{}}}}],\"links\":[{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":0},{\"fromNode\":\"blit_0\",\"fromIndex\":0,\"toNode\":\"face_0\",\"toIndex\":0},{\"fromNode\":\"face_0\",\"fromIndex\":0,\"toNode\":\"expression_detect_0\",\"toIndex\":1}]}");
        c439450HLb.bitmap = bitmap;
        s sVar = null;
        try {
            listScanPicture = TEVideoUtils.scanPicture(c439450HLb);
        } catch (NullPointerException e) {
            TryCatchGuardChecker.doCheck(e);
            listScanPicture = null;
        }
        if (listScanPicture != null) {
            sVar = (s) C13LP.LJJJLZIJ(0, listScanPicture);
        }
        if (!(sVar instanceof VEFaceExpressionDetectResult) || (vEFaceExpressionDetectResult = (VEFaceExpressionDetectResult) sVar) == null || (faceDetectInfo = vEFaceExpressionDetectResult.getFaceDetectInfo()) == null || (info = faceDetectInfo.getInfo()) == null || C13LQ.LJJIIZ(0, info) == null) {
            return false;
        }
        return true;
    }

    public C1ATV(C1DK1 c1dk1, InterfaceC2179881ATa interfaceC2179881ATa) {
        this.LIZ = c1dk1;
        this.LIZIZ = interfaceC2179881ATa;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    @Override // X.C1ATX
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(final X.C1ATZ r9, X.InterfaceC1364105Vn<? super java.lang.String> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C2226108nr
            if (r0 == 0) goto L9e
            r4 = r10
            X.08nr r4 = (X.C2226108nr) r4
            int r2 = r4.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L9e
            int r2 = r2 - r1
            r4.LLILZIL = r2
        L12:
            java.lang.Object r7 = r4.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r1 = r4.LLILZIL
            r5 = 2
            r0 = 1
            if (r1 == 0) goto L28
            if (r1 == r0) goto L78
            if (r1 != r5) goto La5
            java.lang.Object r6 = r4.LLILLJJLI
            X.C155000ia.LIZIZ(r7)
        L27:
            return r6
        L28:
            X.C155000ia.LIZIZ(r7)
            r4.LLILZIL = r0
            X.099m r6 = new X.099m
            X.05Vn r0 = X.C099M.LIZLLL(r4)
            r6.<init>(r0)
            X.0Mn7 r7 = new X.0Mn7
            r7.<init>()
            X.1AO8 r0 = X.C1AO8.NORMAL_GET_FRAME_MODE
            X.1DLr r1 = r7.LIZ
            r1.LIZ = r0
            X.0Mmv r0 = X.EnumC578750Mmv.FULL_EFFECT
            r1.LJ = r0
            X.0wQS r0 = X.EnumC1780180wQS.CENTER_CROP
            r1.LJI = r0
            com.ss.android.vesdk.VESize r2 = new com.ss.android.vesdk.VESize
            X.1ATc r0 = r9.LIZIZ
            int r1 = r0.LIZ
            int r0 = r0.LIZIZ
            r2.<init>(r1, r0)
            X.1DLr r1 = r7.LIZ
            r1.LIZIZ = r2
            X.1ATW r0 = new X.1ATW
            r0.<init>()
            r1.LJII = r0
            X.1DK1 r0 = r8.LIZ
            com.ss.android.vesdk.VERecorder r0 = r0.LIZIZ()
            r0.LJIIJJI(r1)
            java.lang.Object r7 = r6.LIZ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r7 != r0) goto L75
            X.C099Q.LIZJ(r4)
        L75:
            if (r7 != r3) goto L7b
            return r3
        L78:
            X.C155000ia.LIZIZ(r7)
        L7b:
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            X.01GW r0 = r8.LIZJ
            java.lang.Object r0 = r0.getValue()
            X.1DIy r0 = (X.InterfaceC2253701DIy) r0
            java.lang.String r6 = r0.LIZ()
            X.1DFB r2 = X.C0PEM.LIZJ
            X.08nq r1 = new X.08nq
            r0 = 0
            r1.<init>(r7, r6, r0)
            r4.LL = r7
            r4.LLILLJJLI = r6
            r4.LLILZIL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r4, r2, r1)
            if (r0 != r3) goto L27
            return r3
        L9e:
            X.08nr r4 = new X.08nr
            r4.<init>(r8, r10)
            goto L12
        La5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1ATV.LIZ(X.1ATZ, X.05Vn):java.lang.Object");
    }
}
