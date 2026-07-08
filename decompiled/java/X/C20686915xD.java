package X;

import com.ss.android.ugc.aweme.feed.assem.usercard.VideoUserCardAssem;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.15xD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20686915xD extends C09AY implements Function2<VideoUserCardAssem, C291001Au<? extends Unit>, Unit> {
    public C20686915xD() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoUserCardAssem videoUserCardAssem, C291001Au<? extends Unit> c291001Au) {
        VideoUserCardAssem videoUserCardAssem2 = videoUserCardAssem;
        C291001Au<? extends Unit> c291001Au2 = c291001Au;
        if (c291001Au2 != null && c291001Au2.LIZ() != null) {
            ((InterfaceC1262810ixz) videoUserCardAssem2.getContentView().findViewById(R.id.userCardLayout)).LLFZ(false);
        }
        return Unit.LIZ;
    }
}
