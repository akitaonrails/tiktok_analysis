package X;

import android.graphics.Bitmap;
import com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS64S0100100_5;

/* JADX INFO: renamed from: X.0E2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C358160E2k implements C0F3A, INLEListenerVideoOutput {
    public final /* synthetic */ C0E3T LL;

    public C358160E2k(C0E3T c0e3t) {
        this.LL = c0e3t;
    }

    @Override // X.C0F3A
    public final void LIZ(C0F35 c0f35) {
        ((ArrayList) this.LL.LLJJIJIL.LJ).remove(c0f35);
    }

    @Override // X.C0F3A
    public final void LIZJ(InterfaceC358400E3i interfaceC358400E3i) {
        ((ArrayList) this.LL.LLJJIJIL.LJ).add(interfaceC358400E3i);
    }

    @Override // X.C0F3A
    public final Bitmap LIZIZ(long j, String str) {
        return this.LL.LLJJIJIIJIL.vQ2((int) j, str);
    }

    @Override // com.bytedance.ies.nle.editor_jni.INLEListenerVideoOutput
    public final void onRefresh(int i, long j) {
        if (i != 0) {
            return;
        }
        C354270Duj.LIZJ(0L, new AwS64S0100100_5(this, j, 1));
    }
}
