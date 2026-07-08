package X;

import com.ss.android.ugc.aweme.settings.EcomLynxVideoPlayerSettings;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14TW, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14TW extends C09AY implements Function0<C0N0Y> {
    public final /* synthetic */ C14TU LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14TW(C14TU c14tu) {
        super(0);
        this.LL = c14tu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0N0Y invoke() {
        C0N0Y c0n0yLJ = this.LL.LJ();
        if (c0n0yLJ != null) {
            return c0n0yLJ;
        }
        if (!this.LL.LLIZ) {
            EcomLynxVideoPlayerSettings.LIZ.getClass();
            return EcomLynxVideoPlayerSettings.LIZIZ();
        }
        SoftReference<C0N0Y> softReference = C14TU.LLJZIJLIL;
        if (softReference == null || softReference.get() == null) {
            EcomLynxVideoPlayerSettings.LIZ.getClass();
            C14TU.LLJZIJLIL = new SoftReference<>(EcomLynxVideoPlayerSettings.LIZIZ());
        }
        SoftReference<C0N0Y> softReference2 = C14TU.LLJZIJLIL;
        if (softReference2 != null) {
            return softReference2.get();
        }
        return null;
    }
}
