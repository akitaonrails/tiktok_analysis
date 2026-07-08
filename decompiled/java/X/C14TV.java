package X;

import com.ss.android.ugc.aweme.settings.EcomLynxVideoPlayerSettings;
import java.lang.ref.SoftReference;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14TV, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14TV extends C09AY implements Function0<C0N0Y> {
    public final /* synthetic */ C14TT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14TV(C14TT c14tt) {
        super(0);
        this.LL = c14tt;
    }

    @Override // kotlin.jvm.functions.Function0
    public final C0N0Y invoke() {
        C0N0Y c0n0yLJIIIZ = this.LL.LJIIIZ();
        if (c0n0yLJIIIZ != null) {
            return c0n0yLJIIIZ;
        }
        if (!this.LL.LLIZLLLIL) {
            EcomLynxVideoPlayerSettings.LIZ.getClass();
            return EcomLynxVideoPlayerSettings.LIZIZ();
        }
        SoftReference<C0N0Y> softReference = C14TT.LLJZIJLIL;
        if (softReference == null || softReference.get() == null) {
            EcomLynxVideoPlayerSettings.LIZ.getClass();
            C14TT.LLJZIJLIL = new SoftReference<>(EcomLynxVideoPlayerSettings.LIZIZ());
        }
        SoftReference<C0N0Y> softReference2 = C14TT.LLJZIJLIL;
        if (softReference2 != null) {
            return softReference2.get();
        }
        return null;
    }
}
