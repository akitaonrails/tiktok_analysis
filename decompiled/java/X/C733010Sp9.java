package X;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.ss.android.ugc.aweme.feed.assem.videocomment.VideoCommentAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Sp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C733010Sp9 extends C09AY implements Function2<VideoCommentAssem, Drawable, Unit> {
    public C733010Sp9() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(VideoCommentAssem videoCommentAssem, Drawable drawable) {
        Drawable drawable2 = drawable;
        ImageView imageView = videoCommentAssem.LLLIIIIL;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setImageDrawable(drawable2);
        return Unit.LIZ;
    }
}
