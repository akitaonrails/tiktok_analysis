package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import webcast.data.MusicSong;

/* JADX INFO: renamed from: X.0DeJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344090DeJ extends LinearLayout {
    public EnumC344070DeH LL;
    public C344100DeK LLILLJJLI;
    public C1295960jpS LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public MusicSong LLIZ;
    public Long LLIZLLLIL;

    public final Long getFragmentId() {
        return this.LLIZLLLIL;
    }

    public final C344100DeK getHeaderView() {
        return this.LLILLJJLI;
    }

    public final C1295960jpS getLottieAnim() {
        return this.LLILLL;
    }

    public final MusicSong getModel() {
        return this.LLIZ;
    }

    public final TuxTextView getSongAuthor() {
        return this.LLILZIL;
    }

    public final TuxTextView getSongDuration() {
        return this.LLILZLL;
    }

    public final TuxTextView getSongName() {
        return this.LLILZ;
    }

    public final EnumC344070DeH getStatus() {
        return this.LL;
    }

    public final void LIZ(EnumC344070DeH enumC344070DeH) {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        C1295960jpS c1295960jpS3;
        if (enumC344070DeH == this.LL) {
            return;
        }
        this.LL = enumC344070DeH;
        int i = C344060DeG.LIZIZ[enumC344070DeH.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    setBackgroundColor(C20736316Cj.LIZIZ(R.attr.zg, getContext()));
                    C344100DeK c344100DeK = this.LLILLJJLI;
                    if (c344100DeK != null) {
                        TuxSpinner tuxSpinner = c344100DeK.LL;
                        if (tuxSpinner != null) {
                            C339190DRl.LIZIZ(tuxSpinner);
                        }
                        ImageView imageView = c344100DeK.LLILLJJLI;
                        if (imageView != null) {
                            C786410Ut5.V4(imageView, 1.0f);
                        }
                    }
                    C500260Jjc.LLFFF(this.LLILLL);
                    C1295960jpS c1295960jpS4 = this.LLILLL;
                    if (c1295960jpS4 != null && !c1295960jpS4.isAnimating() && (c1295960jpS3 = this.LLILLL) != null) {
                        c1295960jpS3.playAnimation();
                        return;
                    }
                    return;
                }
                throw new C1954807lC();
            }
            C344100DeK c344100DeK2 = this.LLILLJJLI;
            if (c344100DeK2 != null) {
                TuxSpinner tuxSpinner2 = c344100DeK2.LL;
                if (tuxSpinner2 != null) {
                    C339190DRl.LIZLLL(tuxSpinner2);
                }
                ImageView imageView2 = c344100DeK2.LLILLJJLI;
                if (imageView2 != null) {
                    C786410Ut5.V4(imageView2, 0.5f);
                }
            }
            setBackground(null);
            C500260Jjc.LJIILIIL(this.LLILLL);
            C1295960jpS c1295960jpS5 = this.LLILLL;
            if (c1295960jpS5 == null || !c1295960jpS5.isAnimating() || (c1295960jpS2 = this.LLILLL) == null) {
                return;
            }
            c1295960jpS2.cancelAnimation();
            return;
        }
        setBackground(null);
        C344100DeK c344100DeK3 = this.LLILLJJLI;
        if (c344100DeK3 != null) {
            TuxSpinner tuxSpinner3 = c344100DeK3.LL;
            if (tuxSpinner3 != null) {
                C339190DRl.LIZIZ(tuxSpinner3);
            }
            ImageView imageView3 = c344100DeK3.LLILLJJLI;
            if (imageView3 != null) {
                C786410Ut5.V4(imageView3, 1.0f);
            }
        }
        C500260Jjc.LJIILIIL(this.LLILLL);
        C1295960jpS c1295960jpS6 = this.LLILLL;
        if (c1295960jpS6 == null || !c1295960jpS6.isAnimating() || (c1295960jpS = this.LLILLL) == null) {
            return;
        }
        c1295960jpS.cancelAnimation();
    }

    public final void setFragmentId(Long l) {
        this.LLIZLLLIL = l;
    }

    public final void setHeaderView(C344100DeK c344100DeK) {
        this.LLILLJJLI = c344100DeK;
    }

    public final void setLottieAnim(C1295960jpS c1295960jpS) {
        this.LLILLL = c1295960jpS;
    }

    public final void setModel(MusicSong musicSong) {
        this.LLIZ = musicSong;
    }

    public final void setSongAuthor(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setSongDuration(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setSongName(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setStatus(EnumC344070DeH enumC344070DeH) {
        this.LL = enumC344070DeH;
    }

    public C344090DeJ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = EnumC344070DeH.DEFAULT;
    }
}
