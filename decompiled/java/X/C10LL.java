package X;

import Y.ACListenerS27S0500000_28;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.friends.model.UserWithAweme;
import com.ss.android.ugc.aweme.profile.model.User;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10LL, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10LL extends CardView {
    public SmartImageView LLIZLLLIL;
    public SmartImageView LLJ;
    public SmartImageView LLJI;
    public CardView LLJIJIL;
    public CardView LLJILJIL;
    public CardView LLJILJILJ;
    public C1087110eOb LLJILLL;
    public C1087110eOb LLJJ;
    public C1087110eOb LLJJI;
    public TuxTextView LLJJIII;
    public TuxTextView LLJJIJI;
    public TuxTextView LLJJIJIIJIL;
    public TuxIconView LLJJIJIL;
    public TuxIconView LLJJJ;
    public TuxIconView LLJJJIL;
    public List<UserWithAweme> LLJJJJ;
    public String LLJJJJJIL;
    public UserWithAweme LLJJJJLIIL;
    public Function0<Unit> LLJJL;

    public final TuxTextView getBigCardLeftCoverCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIII;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c03);
            this.LLJJIII = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getBigCardLeftCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c01);
            this.LLJI = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C1087110eOb getBigCardLeftCoverGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c04);
            this.LLJILLL = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final TuxIconView getBigCardLeftCoverIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c05);
            this.LLJJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getBigCardMiddleCoverCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c09);
            this.LLJJIJI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getBigCardMiddleCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c07);
            this.LLIZLLLIL = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C1087110eOb getBigCardMiddleCoverGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c0_);
            this.LLJJ = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final TuxIconView getBigCardMiddleCoverIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c0a);
            this.LLJJJ = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getBigCardRightCoverCountFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJIJIIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c0g);
            this.LLJJIJIIJIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final SmartImageView getBigCardRightCoverFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c0e);
            this.LLJ = (SmartImageView) callbackFindViewById;
        }
        return (SmartImageView) callbackFindViewById;
    }

    public final C1087110eOb getBigCardRightCoverGroupFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c0h);
            this.LLJJI = (C1087110eOb) callbackFindViewById;
        }
        return (C1087110eOb) callbackFindViewById;
    }

    public final TuxIconView getBigCardRightCoverIcon() {
        KeyEvent.Callback callbackFindViewById = this.LLJJJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c0i);
            this.LLJJJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final CardView getLeftCardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.mjn);
            this.LLJIJIL = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final CardView getMiddleCardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.oby);
            this.LLJILJIL = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    public final CardView getRightCardFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJILJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.tkp);
            this.LLJILJILJ = (CardView) callbackFindViewById;
        }
        return (CardView) callbackFindViewById;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i = C2187451AjH.LIZ;
        getBigCardLeftCoverFromXml().setAttached(true);
        getBigCardMiddleCoverFromXml().setAttached(true);
        getBigCardRightCoverFromXml().setAttached(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = C2187451AjH.LIZ;
        getBigCardLeftCoverFromXml().setAttached(false);
        getBigCardMiddleCoverFromXml().setAttached(false);
        getBigCardRightCoverFromXml().setAttached(false);
    }

    public final void setBigCardLeftCoverCountFromXml(TuxTextView tuxTextView) {
        this.LLJJIII = tuxTextView;
    }

    public final void setBigCardLeftCoverFromXml(SmartImageView smartImageView) {
        this.LLJI = smartImageView;
    }

    public final void setBigCardLeftCoverGroupFromXml(C1087110eOb c1087110eOb) {
        this.LLJILLL = c1087110eOb;
    }

    public final void setBigCardLeftCoverIcon(TuxIconView tuxIconView) {
        this.LLJJIJIL = tuxIconView;
    }

    public final void setBigCardMiddleCoverCountFromXml(TuxTextView tuxTextView) {
        this.LLJJIJI = tuxTextView;
    }

    public final void setBigCardMiddleCoverFromXml(SmartImageView smartImageView) {
        this.LLIZLLLIL = smartImageView;
    }

    public final void setBigCardMiddleCoverGroupFromXml(C1087110eOb c1087110eOb) {
        this.LLJJ = c1087110eOb;
    }

    public final void setBigCardMiddleCoverIcon(TuxIconView tuxIconView) {
        this.LLJJJ = tuxIconView;
    }

    public final void setBigCardRightCoverCountFromXml(TuxTextView tuxTextView) {
        this.LLJJIJIIJIL = tuxTextView;
    }

    public final void setBigCardRightCoverFromXml(SmartImageView smartImageView) {
        this.LLJ = smartImageView;
    }

    public final void setBigCardRightCoverGroupFromXml(C1087110eOb c1087110eOb) {
        this.LLJJI = c1087110eOb;
    }

    public final void setBigCardRightCoverIcon(TuxIconView tuxIconView) {
        this.LLJJJIL = tuxIconView;
    }

    public final void setLeftCardFromXml(CardView cardView) {
        this.LLJIJIL = cardView;
    }

    public final void setMiddleCardFromXml(CardView cardView) {
        this.LLJILJIL = cardView;
    }

    public final void setRightCardFromXml(CardView cardView) {
        this.LLJILJILJ = cardView;
    }

    public C10LL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Sd(R.layout.ekv, C786410Ut5.ne(context), this);
        C2271391DvN.LIZ(getBigCardLeftCoverFromXml(), (C1A5L) C2271381DvM.LLJILLL.getValue());
        C2271391DvN.LIZ(getBigCardMiddleCoverFromXml(), (C1A5L) C2271381DvM.LLJJI.getValue());
        C2271391DvN.LIZ(getBigCardRightCoverFromXml(), (C1A5L) C2271381DvM.LLJJ.getValue());
        this.LLJJJJJIL = "";
    }

    public final void LJIIIZ(SmartImageView smartImageView, TuxTextView tuxTextView, Aweme aweme) {
        long playCount;
        User user;
        UrlModel cover;
        List<String> urlList;
        C238400w2 c238400w2 = new C238400w2();
        AwemeStatistics statistics = aweme.getStatistics();
        if (statistics != null) {
            playCount = statistics.getPlayCount();
        } else {
            playCount = 0;
        }
        c238400w2.element = playCount;
        String strLIZIZ = C1843500y4a.LIZIZ(playCount);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZIZ);
        sbLIZ.append("  ");
        tuxTextView.setText(C2188811AlT.LIZIZ(sbLIZ));
        UserWithAweme userWithAweme = this.LLJJJJLIIL;
        if (userWithAweme != null && (user = userWithAweme.getUser()) != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS27S0500000_28(this, aweme, user, c238400w2, tuxTextView, 0));
            Video video = aweme.getVideo();
            Bitmap.Config config = null;
            if (video != null && (cover = video.getCover()) != null && (urlList = cover.getUrlList()) != null && !urlList.isEmpty()) {
                List<String> urlList2 = aweme.getVideo().getCover().getUrlList();
                if (C294660Bgm.LIZ()) {
                    config = Bitmap.Config.ARGB_8888;
                }
                boolean zLIZIZ = C1620160sGM.LIZIZ(smartImageView, aweme.getVideo(), "FollowEmptyCardCoverView", true, null, null, true, config, false, false, false, false);
                if (aweme.getVideo().isCallback() && zLIZIZ) {
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("refreshCover: use dynamic img, url list: ");
                    sbLIZ2.append(urlList2);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                int i2 = C2187451AjH.LIZ;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("refreshCover: use static img, url list: ");
                sbLIZ3.append(urlList2);
                C2188811AlT.LIZIZ(sbLIZ3);
                C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(aweme.getVideo().getCover()));
                int[] iArrLIZ = C422830Gi1.LIZ(200);
                if (iArrLIZ != null) {
                    c1331670kl3LJIIIIZZ.LJJIJ(iArrLIZ);
                }
                c1331670kl3LJIIIIZZ.LJJ(smartImageView);
                c1331670kl3LJIIIIZZ.LJJIIZ = EnumC714850S2h.SMALL;
                C2177231AIv.LIZ(c1331670kl3LJIIIIZZ, this.LLJJJJJIL, C10LT.COVER, "big_card", -1, "");
                return;
            }
            smartImageView.setActualImageResource(R.attr.bv);
        }
    }

    public final void LJIIIIZZ(int i, int i2, float f, C10LL c10ll) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3;
        CardView leftCardFromXml = getLeftCardFromXml();
        ViewGroup.LayoutParams layoutParams4 = getLeftCardFromXml().getLayoutParams();
        layoutParams4.width = i;
        layoutParams4.height = i2;
        C786410Ut5.j6(leftCardFromXml, layoutParams4);
        CardView middleCardFromXml = getMiddleCardFromXml();
        ViewGroup.LayoutParams layoutParams5 = getMiddleCardFromXml().getLayoutParams();
        layoutParams5.width = i;
        layoutParams5.height = i2;
        C786410Ut5.j6(middleCardFromXml, layoutParams5);
        CardView rightCardFromXml = getRightCardFromXml();
        ViewGroup.LayoutParams layoutParams6 = getRightCardFromXml().getLayoutParams();
        layoutParams6.width = i;
        layoutParams6.height = i2;
        C786410Ut5.j6(rightCardFromXml, layoutParams6);
        ViewGroup.LayoutParams layoutParams7 = c10ll.getLayoutParams();
        TuxIconView bigCardLeftCoverIcon = getBigCardLeftCoverIcon();
        ViewGroup.LayoutParams layoutParams8 = null;
        if (bigCardLeftCoverIcon != null) {
            TuxIconView bigCardLeftCoverIcon2 = getBigCardLeftCoverIcon();
            if (bigCardLeftCoverIcon2 != null && (layoutParams3 = bigCardLeftCoverIcon2.getLayoutParams()) != null) {
                layoutParams3.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                layoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                layoutParams3 = null;
            }
            C786410Ut5.M6(bigCardLeftCoverIcon, layoutParams3);
        }
        TuxIconView bigCardMiddleCoverIcon = getBigCardMiddleCoverIcon();
        if (bigCardMiddleCoverIcon != null) {
            TuxIconView bigCardMiddleCoverIcon2 = getBigCardMiddleCoverIcon();
            if (bigCardMiddleCoverIcon2 != null && (layoutParams2 = bigCardMiddleCoverIcon2.getLayoutParams()) != null) {
                layoutParams2.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                layoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
            } else {
                layoutParams2 = null;
            }
            C786410Ut5.M6(bigCardMiddleCoverIcon, layoutParams2);
        }
        TuxIconView bigCardRightCoverIcon = getBigCardRightCoverIcon();
        if (bigCardRightCoverIcon != null) {
            TuxIconView bigCardRightCoverIcon2 = getBigCardRightCoverIcon();
            if (bigCardRightCoverIcon2 != null && (layoutParams = bigCardRightCoverIcon2.getLayoutParams()) != null) {
                layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));
                layoutParams8 = layoutParams;
            }
            C786410Ut5.M6(bigCardRightCoverIcon, layoutParams8);
        }
        c10ll.setCardElevation(0.0f);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c10ll);
        c10ll.setLayoutParams(layoutParams7);
        c10ll.setRadius(f);
        c10ll.setCardBackgroundColor(0);
    }
}
