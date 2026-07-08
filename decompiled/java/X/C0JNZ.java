package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.TextureView;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0JNZ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JNZ extends C0JN0 implements C0JN2 {
    public View LLILLL;
    public TextureView LLILZ;
    public C417600GZa LLILZIL;

    public final C417600GZa getCover() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_cover);
            this.LLILZIL = (C417600GZa) callbackFindViewById;
        }
        return (C417600GZa) callbackFindViewById;
    }

    public final View getVideoContainer() {
        View view = this.LLILLL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.video_container);
        this.LLILLL = viewFindViewById;
        return viewFindViewById;
    }

    public Rect getVideoRect() {
        View videoContainer = getVideoContainer();
        int left = videoContainer != null ? videoContainer.getLeft() : 0;
        View videoContainer2 = getVideoContainer();
        int top = videoContainer2 != null ? videoContainer2.getTop() : 0;
        View videoContainer3 = getVideoContainer();
        int right = videoContainer3 != null ? videoContainer3.getRight() : 0;
        View videoContainer4 = getVideoContainer();
        return new Rect(left, top, right, videoContainer4 != null ? videoContainer4.getBottom() : 0);
    }

    public final TextureView getVideoTexture() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.video_texture);
            this.LLILZ = (TextureView) callbackFindViewById;
        }
        return (TextureView) callbackFindViewById;
    }

    @Override // X.C0JN0
    public final void LIZ() {
        C23250099c.LIZLLL(getCoroutineScope(), null, null, new C490920JNa(this, null), 3);
    }

    @Override // X.C0JN0
    public final void LIZIZ() {
        UrlModel cover;
        String uri;
        Video video = getPlayerChannel().LIZ;
        if (video == null || (cover = video.getCover()) == null || (uri = cover.getUri()) == null) {
            return;
        }
        C1819620xS4.LIZ().setUrl(uri).LJJI(getCover());
    }

    public TextureView getTextureView() {
        return getVideoTexture();
    }

    public C0JNZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.dfk, this, true);
    }
}
