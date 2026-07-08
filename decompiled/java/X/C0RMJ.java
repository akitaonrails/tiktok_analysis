package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.right.center.StoryRevealOptOutComponent;

/* JADX INFO: renamed from: X.0RMJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RMJ implements InterfaceC445610Hdf {
    @Override // X.InterfaceC445610Hdf
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(StoryRevealOptOutComponent.class);
    }

    @Override // X.InterfaceC445610Hdf
    public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        Aweme aweme = videoItemParams.getAweme();
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ() && C729510SjV.LJIJI(aweme) && !C729510SjV.LJJIJIIJI(aweme)) {
            return true;
        }
        return false;
    }
}
