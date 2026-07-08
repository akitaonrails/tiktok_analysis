package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.karaoke.viewmodels.KaraokeViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0U1C, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U1C {
    public final DataChannel LIZ;
    public final LifecycleOwner LIZIZ;
    public final KaraokeViewModel LIZJ;
    public AnonymousClass0956 LIZLLL;

    public final void LIZ() {
        AnonymousClass0956 anonymousClass0956;
        C20441214yg.LIZIZ("KLazy#release", "");
        DataChannelGlobal.LLILZ.zQ2(this);
        KaraokeViewModel karaokeViewModel = this.LIZJ;
        if (karaokeViewModel != null) {
            C20441214yg.LIZIZ("KLazy#reset", "");
            ((LinkedHashMap) C0U1G.LJI).clear();
            karaokeViewModel.LLILZLL.LIZJ.clear();
        }
        AnonymousClass0956 anonymousClass09562 = this.LIZLLL;
        if (anonymousClass09562 == null || !anonymousClass09562.isActive() || (anonymousClass0956 = this.LIZLLL) == null) {
            return;
        }
        anonymousClass0956.LIZIZ(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0U1C(androidx.lifecycle.LifecycleOwner r15, com.bytedance.ies.sdk.datachannel.DataChannel r16, boolean r17) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U1C.<init>(androidx.lifecycle.LifecycleOwner, com.bytedance.ies.sdk.datachannel.DataChannel, boolean):void");
    }
}
