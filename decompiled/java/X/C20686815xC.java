package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15xC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20686815xC extends C09AY implements Function2<VideoUserCardAssem, Boolean, Unit> {
    public C20686815xC() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoUserCardAssem videoUserCardAssem, Boolean bool) {
        VideoUserCardAssem videoUserCardAssem2 = videoUserCardAssem;
        if (bool.booleanValue()) {
            videoUserCardAssem2.getContentView().clearAnimation();
            videoUserCardAssem2.up(false, false);
        }
        return Unit.LIZ;
    }
}
