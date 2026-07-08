package X;

import android.graphics.Bitmap;
import com.bytedance.common.utility.BitmapUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfig;
import com.ss.android.ugc.aweme.shortvideo.model.VideoCoverConfigKt;

/* JADX INFO: renamed from: X.0MZA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZA implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ VideoCoverConfig LIZ;
    public final /* synthetic */ IEffectService.OnVideoCoverCallback LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        this.LIZIZ.onGetVideoCoverFailed(i);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        VideoCoverConfig videoCoverConfig;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "draft_cover_resize_switch", true, false) && (videoCoverConfig = this.LIZ) != null && VideoCoverConfigKt.isValid(videoCoverConfig)) {
            try {
                Bitmap bitmapResizeBitmap = BitmapUtils.resizeBitmap(bitmap, (int) (this.LIZ.displayWidth * C0C64.LJIILLIIL().LJIILL(31744, "draft_cover_resize_factor", true, 2.0f)), (int) (this.LIZ.displayHeight * C0C64.LJIILLIIL().LJIILL(31744, "draft_cover_resize_factor", true, 2.0f)));
                if (bitmapResizeBitmap != null) {
                    this.LIZIZ.onGetVideoCoverSuccess(bitmapResizeBitmap);
                    return;
                }
            } catch (RuntimeException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            this.LIZIZ.onGetVideoCoverFailed(-1);
            return;
        }
        this.LIZIZ.onGetVideoCoverSuccess(bitmap);
    }

    public C0MZA(VideoCoverConfig videoCoverConfig, IEffectService.OnVideoCoverCallback onVideoCoverCallback) {
        this.LIZ = videoCoverConfig;
        this.LIZIZ = onVideoCoverCallback;
    }
}
