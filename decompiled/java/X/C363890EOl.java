package X;

import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.PairIntInt;

/* JADX INFO: renamed from: X.0EOl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C363890EOl {
    public final C0EOK LIZ;
    public final C0E48 LIZIZ;
    public boolean LIZJ;
    public final PairIntInt LIZLLL;

    public C363890EOl(C0EOK c0eok, C0E48 c0e48) {
        INLEMediaSession iNLEMediaSessionF1;
        INLEMediaRuntime mediaRuntimeApi;
        PairIntInt initSize;
        this.LIZ = c0eok;
        this.LIZIZ = c0e48;
        this.LIZLLL = (c0e48 == null || (iNLEMediaSessionF1 = c0e48.f1()) == null || (mediaRuntimeApi = iNLEMediaSessionF1.getMediaRuntimeApi()) == null || (initSize = mediaRuntimeApi.getInitSize()) == null) ? new PairIntInt(0, 0) : initSize;
    }
}
