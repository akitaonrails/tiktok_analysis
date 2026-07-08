package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;
import com.bytedance.ies.smartmovie.jni.UnorderedMapStrStr;
import com.bytedance.ies.smartmovie.jni.VecMeta;
import com.bytedance.ies.smartmovie.jni.VecStr;

/* JADX INFO: renamed from: X.0n0r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418350n0r extends NLEModelRequestProgressCallback {
    public final NLEModelRequestProgressCallback LIZ;
    public final C1418510n17 LIZIZ = new C1418510n17();
    public final long LIZJ;

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressDone(VecMeta vecMeta) {
        this.LIZ.onCompressDone(vecMeta);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onCompressProgress(float f) {
        this.LIZ.onCompressProgress(f);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFetchProgress(float f) {
        this.LIZ.onFetchProgress(f);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onNeedFetch(VecStr vecStr) {
        this.LIZ.onNeedFetch(vecStr);
    }

    public C1418350n0r(NLEModelRequestProgressCallback nLEModelRequestProgressCallback, Object... objArr) {
        this.LIZ = nLEModelRequestProgressCallback;
        this.LIZJ = C1418510n17.LIZIZ(objArr, nLEModelRequestProgressCallback, this);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onResponse(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZ.onResponse(nLEModel, unorderedMapStrStr);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onSuccess(NLEModel nLEModel, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZ.onSuccess(nLEModel, unorderedMapStrStr);
        C1418510n17 c1418510n17 = this.LIZIZ;
        long j = this.LIZJ;
        c1418510n17.getClass();
        C1418510n17.LIZ(j);
    }

    @Override // com.bytedance.ies.smartmovie.jni.NLEModelRequestProgressCallback
    public final void onFailure(String str, int i, String str2, UnorderedMapStrStr unorderedMapStrStr) {
        this.LIZ.onFailure(str, i, str2, unorderedMapStrStr);
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C1418510n17 c1418510n17 = this.LIZIZ;
            long j = this.LIZJ;
            c1418510n17.getClass();
            C1418510n17.LIZ(j);
        }
    }
}
