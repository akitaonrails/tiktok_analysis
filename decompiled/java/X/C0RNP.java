package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.story.feed.immersive.component.toparea.centerrow2.p1.StoryRevealTagComponent;

/* JADX INFO: renamed from: X.0RNP, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RNP implements InterfaceC445610Hdf {
    @Override // X.InterfaceC445610Hdf
    public final C13IQ<? extends ReusedUIAssem<? extends C03H5>> getType() {
        return C13LE.LIZ(StoryRevealTagComponent.class);
    }

    @Override // X.InterfaceC445610Hdf
    public final boolean Fc(VideoItemParams videoItemParams, C690870R8b c690870R8b) {
        C728010Sh5.LIZ.getClass();
        if (C728010Sh5.LIZIZ() && C729510SjV.LJIJI(videoItemParams.getAweme())) {
            return true;
        }
        return false;
    }
}
