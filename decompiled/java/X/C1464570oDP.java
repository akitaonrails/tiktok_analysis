package X;

import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.services.external.ability.IAVTransformService;
import com.ss.android.ugc.aweme.share.gif.VideoShare2GifEditContext;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oDP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1464570oDP implements IVideo2GifService.ConvertListener {
    public final /* synthetic */ VideoShare2GifEditContext LIZ;
    public final /* synthetic */ IAVTransformService.ITransformProgress LIZIZ;
    public final /* synthetic */ IAVTransformService.ITransformCallback<Boolean> LIZJ;

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onStart() {
    }

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onConfigured(C1464620oDU c1464620oDU) {
        C1444880nhe c1444880nhe = new C1444880nhe();
        c1444880nhe.LIZ("height", String.valueOf(c1464620oDU.LIZIZ));
        c1444880nhe.LIZ("width", String.valueOf(c1464620oDU.LIZ));
        c1444880nhe.LIZ("gif_length_in_video", String.valueOf(c1464620oDU.LIZLLL - c1464620oDU.LIZJ));
        c1444880nhe.LIZ("gif_offset", String.valueOf(c1464620oDU.LIZJ));
        c1444880nhe.LIZ("group_id", this.LIZ.awemeId);
        c1444880nhe.LIZ("author_id", this.LIZ.authorId);
        c1444880nhe.LIZ("speed", String.valueOf(2.5f));
        C20684815ws.LJIJ("gif_generate", new JSONObject(c1444880nhe.LIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onDone(boolean z) {
        IAVTransformService.ITransformCallback<Boolean> iTransformCallback = this.LIZJ;
        if (iTransformCallback != null) {
            iTransformCallback.finish(Boolean.valueOf(z));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.IVideo2GifService.ConvertListener
    public final void onUpdateProgress(int i) {
        IAVTransformService.ITransformProgress iTransformProgress = this.LIZIZ;
        if (iTransformProgress != null) {
            iTransformProgress.update(i);
        }
    }

    public C1464570oDP(VideoShare2GifEditContext videoShare2GifEditContext, IAVTransformService.ITransformProgress iTransformProgress, IAVTransformService.ITransformCallback<Boolean> iTransformCallback) {
        this.LIZ = videoShare2GifEditContext;
        this.LIZIZ = iTransformProgress;
        this.LIZJ = iTransformCallback;
    }
}
