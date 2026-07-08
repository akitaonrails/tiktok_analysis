package X;

import com.ss.android.ugc.feed.platform.ab.LivePreviewSlideModel;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.14eH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20314714eH extends C09AY implements Function0<LivePreviewSlideModel> {
    public C20314714eH() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.ss.android.ugc.feed.platform.ab.LivePreviewSlideModel, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final LivePreviewSlideModel invoke() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        LivePreviewSlideModel livePreviewSlideModel = C20314614eG.LIZ;
        ?? LJJII = c0c64LJIILLIIL.LJJII(LivePreviewSlideModel.class, livePreviewSlideModel, "live_preview_slide_angle_setting", true);
        return LJJII != 0 ? LJJII : livePreviewSlideModel;
    }
}
