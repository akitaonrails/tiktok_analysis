package X;

import android.content.Context;
import android.media.MediaPlayer;
import android.widget.FrameLayout;
import android.widget.VideoView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.social.creation.mediapicker.data.SocMediaResource;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0MAM, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MAM extends C09AY implements Function1<Context, VideoView> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SocMediaResource LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ C259800zU<VideoView> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0MAM(int i, int i2, SocMediaResource socMediaResource, boolean z, C259800zU<VideoView> c259800zU) {
        super(1);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = socMediaResource;
        this.LLILZ = z;
        this.LLILZIL = c259800zU;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [T, android.view.View, android.widget.VideoView, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ VideoView invoke(Context context) {
        final ?? videoView = new VideoView(context);
        int i = this.LL;
        int i2 = this.LLILLJJLI;
        SocMediaResource socMediaResource = this.LLILLL;
        final boolean z = this.LLILZ;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i, i2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(videoView);
        videoView.setLayoutParams(layoutParams);
        videoView.setVideoURI(UriProtector.parse(socMediaResource.LIZ()));
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: X.0MAO
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                if (z) {
                    videoView.start();
                }
            }
        });
        this.LLILZIL.element = videoView;
        return videoView;
    }
}
