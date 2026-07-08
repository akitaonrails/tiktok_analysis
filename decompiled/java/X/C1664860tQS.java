package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.LifecycleKt;
import com.bytedance.scene.Scene;
import lnn.q;

/* JADX INFO: renamed from: X.0tQS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664860tQS extends Scene {
    public final q LLJI;
    public final C19A3 LLJIJIL;
    public AnonymousClass0956 LLJILJIL;

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        AnonymousClass0956 anonymousClass0956 = this.LLJILJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public C1664860tQS(q qVar, C19A3 c19a3) {
        this.LLJI = qVar;
        this.LLJIJIL = c19a3;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLLII(X.InterfaceC1157420gE0 r14, X.InterfaceC1680500tpg r15, int r16) {
        /*
            Method dump skipped, instruction units count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1664860tQS.LLLII(X.0gE0, X.0tpg, int):void");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Context contextRequireSceneContext = requireSceneContext();
        FrameLayout frameLayout = new FrameLayout(contextRequireSceneContext);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 81;
        C786410Ut5.a6(frameLayout, layoutParams);
        this.LLJILJIL = C23250099c.LIZLLL(LifecycleKt.androidx_lifecycle_LifecycleKt_com_ss_android_ugc_aweme_main_lancet_SAFTikTokLancet_getCoroutineScope(getLifecycle()), null, null, new C1627550sSH(contextRequireSceneContext, frameLayout, this, null), 3);
        return frameLayout;
    }
}
