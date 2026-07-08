package X;

import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import kotlin.jvm.internal.AwS37S0200100_5;

/* JADX INFO: renamed from: X.0E3O, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3O implements INLEListenerVideoOutput {
    public volatile long LL;
    public final /* synthetic */ C0E3M LLILLJJLI;

    public C0E3O(C0E3M c0e3m) {
        this.LLILLJJLI = c0e3m;
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
    public final void onRefresh(int i, long j) {
        if (i != 0) {
            return;
        }
        C354270Duj.LIZJ(0L, new AwS37S0200100_5(this, j, this.LLILLJJLI, 0));
    }
}
