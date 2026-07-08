package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import kotlin.jvm.internal.AwS37S0200100_5;

/* JADX INFO: renamed from: X.0Eem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C369860Eem implements INLEListenerVideoOutput {
    public long LL;
    public final long LLILLJJLI;
    public final /* synthetic */ C369740Eea LLILLL;

    public C369860Eem(C369740Eea c369740Eea) {
        long maxTargetEnd;
        INLEMediaSession iNLEMediaSessionF1;
        NLEModel dataSource;
        this.LLILLL = c369740Eea;
        C0E48 c0e48F4 = c369740Eea.F4();
        if (c0e48F4 != null && (iNLEMediaSessionF1 = c0e48F4.f1()) != null && (dataSource = iNLEMediaSessionF1.getDataSource()) != null) {
            maxTargetEnd = dataSource.getMaxTargetEnd();
        } else {
            maxTargetEnd = 0;
        }
        this.LLILLJJLI = maxTargetEnd;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
    public final void onRefresh(int i, long j) {
        if (i != 0) {
            return;
        }
        C354270Duj.LIZJ(0L, new AwS37S0200100_5(this, j, this.LLILLL, 3));
    }
}
