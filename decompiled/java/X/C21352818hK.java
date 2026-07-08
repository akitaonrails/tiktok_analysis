package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.lynxecomvideo.model.VideoInfo;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS424S0200000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18hK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21352818hK extends FrameLayout {
    public final C1488750oqP LL;
    public final SmartImageView LLILLJJLI;
    public Aweme LLILLL;
    public VideoInfo LLILZ;
    public Image LLILZIL;
    public String LLILZLL;
    public LinearLayout LLIZ;
    public final C01GW LLIZLLLIL;
    public TuxTextView LLJ;

    private final boolean getDebugInfoEnable() {
        return ((Boolean) this.LLIZLLLIL.getValue()).booleanValue();
    }

    public final void LIZ() {
        Aweme aweme = this.LLILLL;
        if (aweme == null) {
            VideoInfo videoInfo = this.LLILZ;
            if (videoInfo != null) {
                this.LL.LJFF(videoInfo, false);
                return;
            }
            return;
        }
        C1488750oqP c1488750oqP = this.LL;
        c1488750oqP.getClass();
        String aid = aweme.getAid();
        Video video = aweme.getVideo();
        Integer numValueOf = video != null ? Integer.valueOf(video.getDuration()) : null;
        Video video2 = aweme.getVideo();
        Integer numValueOf2 = video2 != null ? Integer.valueOf(video2.getWidth()) : null;
        Video video3 = aweme.getVideo();
        c1488750oqP.LJII(aid, numValueOf, numValueOf2, video3 != null ? Integer.valueOf(video3.getHeight()) : null, false, new AwS424S0200000_23(aweme, c1488750oqP, 29));
    }

    public C21352818hK(Context context) {
        super(context, null, 0);
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1514));
        C786410Ut5.Sd(R.layout.bpu, C786410Ut5.ne(context), this);
        this.LL = (C1488750oqP) findViewById(R.id.video);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.rm_);
        if (getDebugInfoEnable()) {
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(1);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.zb);
            linearLayout.setBackground(c384050F3z.LIZ(linearLayout.getContext()));
            this.LLIZ = linearLayout;
            TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
            tuxTextView.setTextSize(12.0f);
            tuxTextView.setTextColorRes(R.attr.zi);
            this.LLJ = tuxTextView;
            LinearLayout linearLayout2 = this.LLIZ;
            if (linearLayout2 != null) {
                linearLayout2.addView(tuxTextView);
            }
            View view = this.LLIZ;
            if (view != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C0H9H.LIZIZ(120), -2);
                layoutParams.setMargins(C0H9H.LIZIZ(12), C0H9H.LIZIZ(30), 0, 0);
                addView(view, layoutParams);
            }
        }
    }

    private final void setVideoId(String str) {
        this.LLILZLL = str;
        TuxTextView tuxTextView = this.LLJ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setAweme(Aweme aweme) {
        String str = this.LLILZLL;
        if (aweme.getVideo() != null && aweme.getAid() != null && !Intrinsics.LJFF(aweme.getAid(), str)) {
            this.LLILLL = aweme;
            setVideoId(aweme.getAid());
        }
    }

    public final void setEnterFrom(String str) {
        this.LL.setEnterFrom(str);
    }

    public final void setLoop(boolean z) {
        this.LL.setLoop(z);
    }

    public final void setMuted(boolean z) {
        this.LL.setMuted(z);
    }

    public final void setObjectFit(String str) {
        this.LL.setObjectFit(str);
    }

    public final void setPoster(String str) {
        this.LLILZIL = (Image) GsonProtectorUtils.fromJson(C09C2.LIZ(), str, Image.class);
    }

    public final void setSrc(VideoInfo videoInfo) {
        String str;
        String str2 = this.LLILZLL;
        if (videoInfo.video != null && (str = videoInfo.videoId) != null && !Intrinsics.LJFF(str, str2)) {
            this.LLILZ = videoInfo;
            setVideoId(videoInfo.videoId);
        }
    }

    public final void setStatusChangeListener(InterfaceC1488770oqR interfaceC1488770oqR) {
        this.LL.setStatusChangeListener(interfaceC1488770oqR);
    }

    public final void setTag(String str) {
        this.LL.setTag(str);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            C1488750oqP c1488750oqP = this.LL;
            c1488750oqP.LJIIIIZZ(c1488750oqP.LLILZIL, c1488750oqP.LLILZLL);
        }
    }
}
