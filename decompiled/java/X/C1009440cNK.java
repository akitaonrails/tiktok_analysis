package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.ad.DetailBottomBanner;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.AwS556S0100000_12;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cNK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009440cNK extends ConstraintLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public boolean LLILZIL;
    public Aweme LLILZLL;
    public C1009420cNI LLIZ;

    private final C197039127h getCtaButton() {
        return (C197039127h) this.LLILZ.getValue();
    }

    private final TuxTextView getDescView() {
        return (TuxTextView) this.LLILLL.getValue();
    }

    private final SmartImageView getThumbnailView() {
        return (SmartImageView) this.LL.getValue();
    }

    private final TuxTextView getTitleView() {
        return (TuxTextView) this.LLILLJJLI.getValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0cNI] */
    public final void e0() {
        AwemeRawAd awemeRawAd;
        DetailBottomBanner detailBottomBanner;
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        Aweme awemeLIZ = ((C584800Mwg) C1048110dNh.LIZLLL.LIZ()).LIZ();
        this.LLILZLL = awemeLIZ;
        if (awemeLIZ == null || (awemeRawAd = awemeLIZ.getAwemeRawAd()) == null || (detailBottomBanner = awemeRawAd.getDetailBottomBanner()) == null) {
            return;
        }
        final Object[] objArr = new Object[1];
        Aweme aweme = this.LLILZLL;
        objArr[0] = aweme != null ? aweme.getAwemeRawAd() : null;
        this.LLIZ = new AbstractC1023470cjx(objArr) { // from class: X.0cNI
            public final C1023630ckD<?>[] LIZ;

            @Override // X.AbstractC1023380cjo, X.C1023640ckE
            public final C1023630ckD<?>[] getInternalLogics() {
                return this.LIZ;
            }

            {
                super(Arrays.copyOf(objArr, objArr.length));
                this.LIZ = new C1023630ckD[0];
            }
        };
        if (getThumbnailView() == null) {
            return;
        }
        C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(detailBottomBanner.thumbnail));
        c1331670kl3LJIIIIZZ.LJJ(getThumbnailView());
        C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        TuxTextView titleView = getTitleView();
        if (titleView != null) {
            titleView.setText(detailBottomBanner.title);
        }
        TuxTextView descView = getDescView();
        if (descView != null) {
            descView.setText(detailBottomBanner.desc);
        }
        C197039127h ctaButton = getCtaButton();
        if (ctaButton != null) {
            ctaButton.setText(detailBottomBanner.buttonText);
        }
        C197039127h ctaButton2 = getCtaButton();
        if (ctaButton2 != null) {
            C786410Ut5.LLLLLLJ(ctaButton2, 0);
        }
        C197039127h ctaButton3 = getCtaButton();
        if (ctaButton3 != null) {
            C786410Ut5.U8(ctaButton3, new ACListenerS151S0100000_16(this, 94));
        }
    }

    public C1009440cNK(Context context) {
        super(context);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d47, this, true);
        this.LL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 776));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS556S0100000_12(this, 844));
        this.LLILLL = C452501pT.LIZIZ(new AwS556S0100000_12(this, 843));
        this.LLILZ = C452501pT.LIZIZ(new AwS556S0100000_12(this, 842));
    }
}
