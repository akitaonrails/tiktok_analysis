package X;

import com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback;

/* JADX INFO: renamed from: X.0n3J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1419870n3J extends NLESingleResourceDownloadCallback {
    public final NLESingleResourceDownloadCallback LIZ;
    public final C1418510n17 LIZIZ = new C1418510n17();
    public final long LIZJ;

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onProgress(int i) {
        this.LIZ.onProgress(i);
    }

    public C1419870n3J(C1419910n3N c1419910n3N, Object... objArr) {
        this.LIZ = c1419910n3N;
        this.LIZJ = C1418510n17.LIZIZ(objArr, c1419910n3N, this);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onFailure(String str, int i, String str2) {
        this.LIZ.onFailure(str, i, str2);
        C1418510n17 c1418510n17 = this.LIZIZ;
        long j = this.LIZJ;
        c1418510n17.getClass();
        C1418510n17.LIZ(j);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLESingleResourceDownloadCallback
    public final void onSuccess(String str, String str2, boolean z) {
        this.LIZ.onSuccess(str, str2, z);
        C1418510n17 c1418510n17 = this.LIZIZ;
        long j = this.LIZJ;
        c1418510n17.getClass();
        C1418510n17.LIZ(j);
    }
}
