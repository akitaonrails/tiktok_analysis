package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.commercialize.video.IVideoPlayTaskManager;
import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0StN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C735630StN implements InterfaceC990590bsv {
    public final IVideoPlayTaskManager LIZ;
    public final Aweme LIZIZ;
    public final Fragment LIZJ;
    public final ViewGroup LIZLLL;
    public final ViewGroup LJ;
    public final ViewGroup LJFF;
    public final ViewGroup LJI;
    public final C998390c5V LJII;
    public final C735770Stb LJIIIIZZ;

    @Override // X.InterfaceC1000860c9U
    public final Context getContext() {
        return getFragment().getContext();
    }

    @Override // X.InterfaceC988560bpe
    public final IVideoPlayTaskManager LIZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC990590bsv
    public final ViewGroup LIZIZ() {
        return this.LJI;
    }

    @Override // X.InterfaceC990590bsv
    public final C998390c5V LJIIL() {
        return this.LJII;
    }

    @Override // X.InterfaceC990590bsv
    public final ViewGroup LJIIZILJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC990590bsv
    public final C735770Stb LJJIFFI() {
        return this.LJIIIIZZ;
    }

    @Override // X.InterfaceC998290c5L
    public final ViewModelStoreOwner LLIIIILZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC988550bpd
    public final Aweme getAweme() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC998380c5U
    public final Fragment getFragment() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC998380c5U, X.InterfaceC20507615Mk
    public final LifecycleOwner getLifecycleOwner() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1065900dqO
    public final void LJIIIZ(InterfaceC856250XiR interfaceC856250XiR) {
        C1065890dqN.LIZ(this, interfaceC856250XiR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C735630StN(android.view.View r13, androidx.fragment.app.Fragment r14, com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager r15, X.C0RAE r16, com.ss.android.ugc.aweme.feed.model.Aweme r17) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C735630StN.<init>(android.view.View, androidx.fragment.app.Fragment, com.ss.android.ugc.aweme.commercialize.utils.video.VideoPlayTaskManager, X.0RAE, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }
}
