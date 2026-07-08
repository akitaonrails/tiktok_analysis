package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import irm.AkS57S0200000_18;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h7D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191650h7D extends ConstraintLayout {
    public static final /* synthetic */ int LLJJIJI = 0;
    public final C427660Gpo LL;
    public final C03EB LLILLJJLI;
    public final TuxTextView LLILLL;
    public final View LLILZ;
    public final C20742216Eq LLILZIL;
    public final TextView LLILZLL;
    public final SmartImageView LLIZ;
    public final View LLIZLLLIL;
    public final C1203280hPy LLJ;
    public final C418460Gay LLJI;
    public final TuxTextView LLJIJIL;
    public final C1189590h3t LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxTextView LLJJ;
    public final TuxTextView LLJJI;
    public AbstractC1191910h7d LLJJIII;

    public final View getActiveAvatarView() {
        return this.LLJJIII instanceof C1191820h7U ? this.LLILLJJLI : this.LL;
    }

    public final void e0(boolean z) {
        int i;
        C19ME c19me;
        C19ME c19me2;
        if (z) {
            i = R.id.f831xtc;
        } else {
            i = R.id.bh2;
        }
        ViewGroup.LayoutParams layoutParams = this.LLILLL.getLayoutParams();
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
            c19me2.startToEnd = i;
            C786410Ut5.R6(this.LLILLL, c19me2);
        }
        ViewGroup.LayoutParams layoutParams2 = this.LLIZLLLIL.getLayoutParams();
        if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
            c19me.startToEnd = i;
            C786410Ut5.W5(this.LLIZLLLIL, c19me);
        }
    }

    public final void setAvatar(AbstractC1191910h7d abstractC1191910h7d) {
        this.LLJJIII = abstractC1191910h7d;
        if (abstractC1191910h7d instanceof C1191800h7S) {
            C339190DRl.LIZIZ(this.LLILLJJLI);
            C339190DRl.LIZLLL(this.LL);
            C03IT c03it = ((C1191800h7S) abstractC1191910h7d).LIZ;
            if (c03it != null) {
                C427660Gpo.LJIIJJI(this.LL, c03it, false, null, null, false, false, null, null, false, null, 1022);
            }
            e0(false);
            return;
        }
        if (abstractC1191910h7d instanceof C1191820h7U) {
            C339190DRl.LIZIZ(this.LL);
            C339190DRl.LIZLLL(this.LLILLJJLI);
            C1191820h7U c1191820h7U = (C1191820h7U) abstractC1191910h7d;
            this.LLILLJJLI.LIZ(c1191820h7U.LIZ, c1191820h7U.LIZIZ);
            e0(true);
            return;
        }
        throw new C1954807lC();
    }

    public final void setAvatarPressedMaskRadius(float f) {
        C427690Gpr.LJ(this.LL, f);
    }

    public final void setDate(String str) {
        if (C123100dR.LIZ(str)) {
            C339190DRl.LIZLLL(this.LLJILJILJ);
            this.LLJILLL.setText(str);
            C339190DRl.LIZLLL(this.LLJILLL);
        } else {
            C339190DRl.LIZIZ(this.LLJILJILJ);
            C339190DRl.LIZIZ(this.LLJILLL);
        }
    }

    public final void setLevel(C1191770h7P c1191770h7P) {
        int i;
        int i2;
        if (c1191770h7P != null && (i = c1191770h7P.LIZ) > 0) {
            C786410Ut5.LLFF(8, this.LLIZ);
            C786410Ut5.LJLLLLLL(0, this.LLILZ);
            this.LLILZLL.setText(C786410Ut5.j4(getContext().getString(2131836770), Arrays.copyOf(new Object[]{String.valueOf(i)}, 1)));
            TextView textView = this.LLILZLL;
            C384050F3z c384050F3z = new C384050F3z();
            switch (i) {
                case 1:
                case 2:
                    i2 = R.attr.ny;
                    break;
                case 3:
                case 4:
                    i2 = R.attr.a19;
                    break;
                case 5:
                case 6:
                    i2 = R.attr.zv;
                    break;
                default:
                    i2 = -1;
                    break;
            }
            c384050F3z.LIZIZ = Integer.valueOf(i2);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(4));
            textView.setBackground(c384050F3z.LIZ(getContext()));
            C19ME c19me = null;
            if (i > 2) {
                ViewGroup.LayoutParams layoutParams = this.LLILZLL.getLayoutParams();
                if ((layoutParams instanceof C19ME) && (c19me = (C19ME) layoutParams) != null) {
                    c19me.startToStart = R.id.jeq;
                }
                C786410Ut5.g6(this.LLILZLL, c19me);
                this.LLILZLL.requestLayout();
                this.LLILZLL.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
                C786410Ut5.LLFF(0, this.LLIZ);
                UrlModel urlModel = c1191770h7P.LIZIZ;
                if (urlModel != null || (urlModel = c1191770h7P.LIZJ) != null) {
                    C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
                    c1331670kl3LJIIIIZZ.LJJ(this.LLIZ);
                    C786410Ut5.h3(c1331670kl3LJIIIIZZ);
                    return;
                }
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = this.LLILZLL.getLayoutParams();
            if ((layoutParams2 instanceof C19ME) && (c19me = (C19ME) layoutParams2) != null) {
                c19me.startToStart = 0;
            }
            C786410Ut5.g6(this.LLILZLL, c19me);
            this.LLILZLL.requestLayout();
            Drawable background = this.LLILZLL.getBackground();
            if (background != null) {
                background.setAlpha(51);
            }
            this.LLILZLL.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
            return;
        }
        C786410Ut5.LJLLLLLL(8, this.LLILZ);
    }

    public final void setName(String str) {
        int i;
        this.LLILLL.setText(str);
        TuxTextView tuxTextView = this.LLILLL;
        if (C444960Hcc.LIZJ(tuxTextView.getContext())) {
            i = 4;
        } else {
            i = 3;
        }
        tuxTextView.setTextDirection(i);
    }

    public final void setOnLevelClick(View.OnClickListener onClickListener) {
        C786410Ut5.I7(onClickListener, this.LLILZ);
    }

    public final void setOnNameClick(View.OnClickListener onClickListener) {
        C786410Ut5.h9(this.LLILLL, onClickListener);
    }

    public final void setOnRatingClick(View.OnClickListener onClickListener) {
        C786410Ut5.ka(this.LLJ, onClickListener);
        C786410Ut5.ma(this.LLJI, onClickListener);
    }

    public final void setRating(AbstractC1890407ao abstractC1890407ao) {
        if (abstractC1890407ao instanceof C1890207am) {
            C786410Ut5.p0(this.LLJ, 0);
            C786410Ut5.r0(this.LLJI, 8);
            C1890207am c1890207am = (C1890207am) abstractC1890407ao;
            this.LLJ.setValue(c1890207am.LIZ);
            Integer num = c1890207am.LIZIZ;
            if (num != null) {
                this.LLJ.setActiveColorInt(num.intValue());
                return;
            }
            return;
        }
        if (abstractC1890407ao instanceof C1890307an) {
            C786410Ut5.p0(this.LLJ, 8);
            C786410Ut5.r0(this.LLJI, 0);
            C1890307an c1890307an = (C1890307an) abstractC1890407ao;
            this.LLJI.setDotCount(c1890307an.LIZIZ);
            this.LLJI.setRating(c1890307an.LIZ);
            Integer num2 = c1890307an.LIZJ;
            if (num2 == null) {
                return;
            }
            this.LLJI.setDotsColor(num2.intValue());
            return;
        }
        if (Intrinsics.LJFF(abstractC1890407ao, new AbstractC1890407ao() { // from class: X.07ap
        })) {
            C786410Ut5.p0(this.LLJ, 8);
            C786410Ut5.r0(this.LLJI, 8);
            return;
        }
        throw new C1954807lC();
    }

    public final void setRatingActiveColor(int i) {
        this.LLJ.setActiveColorInt(i);
    }

    public final void setVerifiedDisplay(String str) {
        C339180DRk c339180DRk = C339180DRk.LIZ;
        TuxTextView tuxTextView = this.LLJJI;
        TuxTextView tuxTextView2 = this.LLJJ;
        c339180DRk.getClass();
        C339180DRk.LIZ(tuxTextView2, tuxTextView, str);
    }

    public C1191650h7D(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void h0(boolean z, View.OnClickListener onClickListener) {
        View activeAvatarView = getActiveAvatarView();
        if (onClickListener == null) {
            C786410Ut5.I7(null, activeAvatarView);
        } else if (z) {
            C786410Ut5.I7(new AkS57S0200000_18(onClickListener, activeAvatarView, 38), activeAvatarView);
        } else {
            C786410Ut5.I7(onClickListener, activeAvatarView);
        }
    }

    public C1191650h7D(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.e7b, this);
        setClipChildren(false);
        setClipToPadding(false);
        this.LL = (C427660Gpo) findViewById(R.id.bh2);
        this.LLILLJJLI = (C03EB) findViewById(R.id.f831xtc);
        this.LLILLL = (TuxTextView) findViewById(R.id.p09);
        this.LLILZ = findViewById(R.id.thg);
        this.LLILZIL = (C20742216Eq) findViewById(R.id.jeq);
        this.LLILZLL = (TextView) findViewById(R.id.mm_);
        this.LLIZ = (SmartImageView) findViewById(R.id.mm8);
        this.LLIZLLLIL = findViewById(R.id.srh);
        this.LLJ = (C1203280hPy) findViewById(R.id.srg);
        this.LLJI = (C418460Gay) findViewById(R.id.yky);
        this.LLJIJIL = (TuxTextView) findViewById(R.id.g39);
        this.LLJILJIL = (C1189590h3t) findViewById(R.id.cik);
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.f707g3a);
        this.LLJILLL = (TuxTextView) findViewById(R.id.ffv);
        this.LLJJ = (TuxTextView) findViewById(R.id.g3b);
        this.LLJJI = (TuxTextView) findViewById(R.id.verified_display);
    }
}
