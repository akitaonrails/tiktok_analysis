package X;

import androidx.lifecycle.Lifecycle;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.1Ctv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2245011Ctv extends AbstractC616030OEf<VideoItemParams> implements InterfaceC2245031Ctx {
    public final Lifecycle LLILZIL;
    public final InterfaceC2245031Ctx LLILZLL;

    @Override // X.InterfaceC2245031Ctx
    public final boolean LIZIZ(VideoItemParams videoItemParams, boolean z) {
        return this.LLILZLL.LIZIZ(videoItemParams, z);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC616030OEf, X.InterfaceC702500Rh2
    public final void rr(Object obj) {
        VideoItemParams videoItemParams = (VideoItemParams) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onBind, data=");
        sbLIZ.append(videoItemParams);
        C2188811AlT.LIZIZ(sbLIZ);
        LJ(LIZIZ(videoItemParams, false));
    }

    public C2245011Ctv(Lifecycle lifecycle, C2244871Cth c2244871Cth) {
        super("bottom_button_been_here_post");
        this.LLILZIL = lifecycle;
        this.LLILZLL = c2244871Cth;
    }
}
