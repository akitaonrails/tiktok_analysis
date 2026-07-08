package X;

import android.graphics.Bitmap;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.services.effect.IEffectService;

/* JADX INFO: renamed from: X.0MZD, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZD implements IEffectService.OnVideoCoverCallback {
    public final /* synthetic */ C0MZA LIZ;
    public final /* synthetic */ AwemeDraft LIZIZ;

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverFailed(int i) {
        C0MZ9.LJIIJ(this.LIZIZ, this.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.effect.IEffectService.OnVideoCoverCallback
    public final void onGetVideoCoverSuccess(Bitmap bitmap) {
        this.LIZ.onGetVideoCoverSuccess(bitmap);
    }

    public C0MZD(C0MZA c0mza, AwemeDraft awemeDraft) {
        this.LIZ = c0mza;
        this.LIZIZ = awemeDraft;
    }
}
