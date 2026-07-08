package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback;
import com.bytedance.ies.nle.editor_jni.VecString;
import com.bytedance.ies.smartmovie.jni.SmartMovieErrorCode;

/* JADX INFO: renamed from: X.0n0s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418360n0s extends NLEResourceDownloadCallback {
    public final NLEResourceDownloadCallback LIZ;
    public final C1418510n17 LIZIZ = new C1418510n17();
    public final long LIZJ;

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onNeedFetch(VecString vecString) {
        this.LIZ.onNeedFetch(vecString);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onProgress(float f) {
        this.LIZ.onProgress(f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onSuccess(NLEModel nLEModel) {
        this.LIZ.onSuccess(nLEModel);
        C1418510n17 c1418510n17 = this.LIZIZ;
        long j = this.LIZJ;
        c1418510n17.getClass();
        C1418510n17.LIZ(j);
    }

    public C1418360n0s(NLEResourceDownloadCallback nLEResourceDownloadCallback, Object... objArr) {
        this.LIZ = nLEResourceDownloadCallback;
        this.LIZJ = C1418510n17.LIZIZ(objArr, nLEResourceDownloadCallback, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLEResourceDownloadCallback
    public final void onFailure(String str, int i, String str2) {
        this.LIZ.onFailure(str, i, str2);
        if (i != SmartMovieErrorCode.FETCH_NLEMODEL_FAILURE.swigValue()) {
            C1418510n17 c1418510n17 = this.LIZIZ;
            long j = this.LIZJ;
            c1418510n17.getClass();
            C1418510n17.LIZ(j);
        }
    }
}
