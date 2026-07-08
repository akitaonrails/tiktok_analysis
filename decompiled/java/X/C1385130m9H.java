package X;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m9H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1385130m9H extends ConstraintLayout {
    public static final float LLILZLL = C418440Gaw.LIZIZ(10);
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public final C01GW LLILZIL;

    public C1385130m9H(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    private final TuxTag getNewPostTag() {
        return (TuxTag) this.LLILLL.getValue();
    }

    private final C19M4 getPostCntTag() {
        return (C19M4) this.LLILZ.getValue();
    }

    private final TuxIconView getRepostTag() {
        return (TuxIconView) this.LLILLJJLI.getValue();
    }

    private final View getShadow() {
        return (View) this.LLILZIL.getValue();
    }

    public final SmartImageView getCoverImage() {
        return (SmartImageView) this.LL.getValue();
    }

    public final void i0() {
        C786410Ut5.LLZLLIL(getNewPostTag(), 0);
        TuxTag newPostTag = getNewPostTag();
        Integer numValueOf = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5)));
        Double dValueOf = Double.valueOf(1.5d);
        C426750GoL.LJIIL(newPostTag, numValueOf, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(dValueOf))), 16);
        C786410Ut5.LLLLLLZZ(getRepostTag(), 8);
        C786410Ut5.LLLLLZIL(getPostCntTag(), 8);
    }

    public final void l0() {
        C786410Ut5.LLLLLLZZ(getRepostTag(), 0);
        C786410Ut5.LLZLLIL(getNewPostTag(), 8);
        C786410Ut5.LLLLLZIL(getPostCntTag(), 8);
    }

    public final void n0() {
        C786410Ut5.LJLLLLLL(0, getShadow());
    }

    public final void j0(int i) {
        C786410Ut5.LLLLLZIL(getPostCntTag(), 0);
        getPostCntTag().setText(String.valueOf(i));
        C786410Ut5.LLZLLIL(getNewPostTag(), 8);
        C786410Ut5.LLLLLLZZ(getRepostTag(), 8);
    }

    public final void e0(Aweme aweme, Function2<? super Boolean, ? super String, Unit> function2) {
        UrlModel cover;
        List<String> urlList;
        C2271391DvN.LIZ(getCoverImage(), (C1A5L) C2271381DvM.LLIZ.getValue());
        Video video = aweme.getVideo();
        if (video != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && !urlList.isEmpty()) {
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(aweme.getVideo().getCover()));
            c1331670kl3LJIIIIZZ.LJJ(getCoverImage());
            c1331670kl3LJIIIIZZ.LJJIIZI(C1308910kAL.LJ(R.attr.a03, getContext()));
            c1331670kl3LJIIIIZZ.LIZLLL("PerfUserCardCoverView");
            c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
            c1331670kl3LJIIIIZZ.LJIIJ(new C1401750ma5(function2, this, 0));
            return;
        }
        function2.invoke(Boolean.FALSE, "Aweme Cover URL empty");
    }

    public C1385130m9H(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.Sd(R.layout.due, C786410Ut5.ne(context), this);
        this.LL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 742));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS565S0100000_21(this, 745));
        this.LLILLL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 743));
        this.LLILZ = C452501pT.LIZIZ(new AwS565S0100000_21(this, 744));
        this.LLILZIL = C452501pT.LIZIZ(new AwS565S0100000_21(this, 746));
    }

    public /* synthetic */ C1385130m9H(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public static void h0(C1385130m9H c1385130m9H, boolean z, boolean z2, boolean z3, boolean z4, int i, int i2) {
        float fLIZIZ;
        float fLIZIZ2;
        float fLIZIZ3;
        float fLIZIZ4;
        if ((i2 & 1) != 0) {
            z = false;
        }
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        if ((i2 & 4) != 0) {
            z3 = false;
        }
        if ((i2 & 8) != 0) {
            z4 = false;
        }
        if ((i2 & 16) != 0) {
            fLIZIZ = LLILZLL;
        } else {
            fLIZIZ = 0.0f;
        }
        if ((i2 & 32) != 0) {
            i = 0;
        }
        if (z) {
            fLIZIZ2 = fLIZIZ;
        } else {
            fLIZIZ2 = C418440Gaw.LIZIZ(0);
        }
        if (z2) {
            fLIZIZ3 = fLIZIZ;
        } else {
            fLIZIZ3 = C418440Gaw.LIZIZ(0);
        }
        if (z4) {
            fLIZIZ4 = fLIZIZ;
        } else {
            fLIZIZ4 = C418440Gaw.LIZIZ(0);
        }
        if (!z3) {
            fLIZIZ = C418440Gaw.LIZIZ(0);
        }
        c1385130m9H.setOutlineProvider(ViewOutlineProvider.BACKGROUND);
        c1385130m9H.setClipToOutline(true);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-1);
        gradientDrawable.setCornerRadii(new float[]{fLIZIZ2, fLIZIZ2, fLIZIZ3, fLIZIZ3, fLIZIZ4, fLIZIZ4, fLIZIZ, fLIZIZ});
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a02, c1385130m9H.getContext());
        if (numLIZJ != null) {
            gradientDrawable.setStroke(i, numLIZJ.intValue());
        }
        c1385130m9H.setBackground(gradientDrawable);
    }
}
