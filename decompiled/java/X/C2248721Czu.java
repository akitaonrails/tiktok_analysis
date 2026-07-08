package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.BigThumb;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1Czu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2248721Czu extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ C2248671Czp LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2248721Czu(C2248671Czp c2248671Czp) {
        super(1);
        this.LL = c2248671Czp;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        long j;
        Video video;
        List<BigThumb> bigThumbs;
        BigThumb bigThumb;
        Video video2;
        List<BigThumb> bigThumbs2;
        BigThumb bigThumb2;
        View view2 = view;
        if (this.LL.LJIIIIZZ()) {
            C2248671Czp c2248671Czp = this.LL;
            if (c2248671Czp.LLLI == null) {
                Context context = this.LL.LLILZ.getContext();
                C2248671Czp c2248671Czp2 = this.LL;
                c2248671Czp.LLLI = new C09MI(context, c2248671Czp2.LLJJIJI, c2248671Czp2.LLILZ);
            }
            C2248671Czp c2248671Czp3 = this.LL;
            C09MI c09mi = c2248671Czp3.LLLI;
            if (c09mi != null) {
                c09mi.LIZ = c2248671Czp3.LLJJIJI;
                c09mi.LIZLLL();
            }
            C09MI c09mi2 = this.LL.LLLI;
            if (c09mi2 != null && c09mi2.LIZ()) {
                C2248671Czp c2248671Czp4 = this.LL;
                ImageView imageView = c2248671Czp4.LLILZ;
                if (imageView instanceof C389030FNd) {
                    C389030FNd c389030FNd = (C389030FNd) imageView;
                    Aweme aweme = c2248671Czp4.LLJJIJI;
                    long j2 = 100;
                    if (aweme != null && (video2 = aweme.getVideo()) != null && (bigThumbs2 = video2.getBigThumbs()) != null && (bigThumb2 = (BigThumb) ListProtector.get(bigThumbs2, 0)) != null) {
                        j = bigThumb2.imgXSize;
                    } else {
                        j = 100;
                    }
                    Aweme aweme2 = this.LL.LLJJIJI;
                    if (aweme2 != null && (video = aweme2.getVideo()) != null && (bigThumbs = video.getBigThumbs()) != null && (bigThumb = (BigThumb) ListProtector.get(bigThumbs, 0)) != null) {
                        j2 = bigThumb.imgYSize;
                    }
                    c389030FNd.LIZ(j, j2);
                    ((C389030FNd) this.LL.LLILZ).setStrokeColor(R.attr.a0w);
                    ((C389030FNd) this.LL.LLILZ).setCornerRadiusDp(8.0f);
                    ((C389030FNd) this.LL.LLILZ).setStrokeWidthDp(1.0f);
                    if (view2 != null) {
                        C426750GoL.LJIIIZ(view2, null, null, null, Integer.valueOf(this.LL.LJIJJLI()), false, 23);
                    }
                }
            }
        }
        return Unit.LIZ;
    }
}
