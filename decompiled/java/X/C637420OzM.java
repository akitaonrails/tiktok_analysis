package X;

import Y.ACListenerS113S0200000_9;
import Y.ACListenerS144S0100000_9;
import Y.ARunnableS18S0400000_9;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS375S0200000_9;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0OzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C637420OzM extends RecyclerView.ViewHolder implements C0Z37<C637060Oym>, InterfaceC1508640pMU {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final View LL;
    public final C424560Gko LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxTextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final TuxIconView LLIZ;
    public C637060Oym LLIZLLLIL;
    public final C01GW LLJ;
    public final C01GW LLJI;

    @Override // X.InterfaceC1508640pMU
    public final String T() {
        return "InboxBannerTemplateViewHolder";
    }

    public C637420OzM(View view) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = (C424560Gko) view.findViewById(R.id.kk7);
        this.LLILLL = (TuxIconView) view.findViewById(R.id.kk_);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.kka);
        this.LLILZIL = (TuxTextView) view.findViewById(R.id.kk9);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.kk8);
        this.LLIZ = (TuxIconView) view.findViewById(R.id.kkb);
        this.LLJ = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1790));
        this.LLJI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1791));
    }

    public static float N5(Integer num) {
        if (num != null && num.intValue() == 44) {
            return C418440Gaw.LIZIZ(8);
        }
        return C418440Gaw.LIZIZ(4);
    }

    public final Drawable L5(float f) {
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(f);
        return c384050F3z.LIZ(this.LL.getContext());
    }

    @Override // X.C0Z37
    public final void LJZI(int i, InterfaceC1891350zJl interfaceC1891350zJl) {
        int iIntValue;
        TuxIconView tuxIconView;
        String str;
        String str2;
        List<String> urlList;
        UrlModel urlModel;
        int iIntValue2;
        Drawable drawable;
        UrlModel urlModel2;
        List<String> urlList2;
        C637060Oym c637060Oym = (C637060Oym) interfaceC1891350zJl;
        this.LLIZLLLIL = c637060Oym;
        UrlModel urlModel3 = c637060Oym.LLILZ;
        if (urlModel3 != null && (urlList = urlModel3.getUrlList()) != null && !urlList.isEmpty()) {
            C424560Gko c424560Gko = this.LLILLJJLI;
            if (c424560Gko != null) {
                C786410Ut5.p(c424560Gko, 0);
            }
            if (C960203pA.LIZIZ(this.LL.getContext()) && (urlModel2 = c637060Oym.LLILZIL) != null && (urlList2 = urlModel2.getUrlList()) != null && (!urlList2.isEmpty())) {
                urlModel = c637060Oym.LLILZIL;
            } else {
                urlModel = c637060Oym.LLILZ;
            }
            Integer num = c637060Oym.LLIZ;
            if (num != null) {
                iIntValue2 = num.intValue();
            } else {
                iIntValue2 = 44;
            }
            C424560Gko c424560Gko2 = this.LLILLJJLI;
            if (c424560Gko2 != null) {
                int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                int iLIZIZ2 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue2)));
                ViewGroup.LayoutParams layoutParams = c424560Gko2.getLayoutParams();
                layoutParams.width = iLIZIZ;
                layoutParams.height = iLIZIZ2;
                C786410Ut5.W5(c424560Gko2, layoutParams);
            }
            float fN5 = N5(c637060Oym.LLIZ);
            C424560Gko c424560Gko3 = this.LLILLJJLI;
            if (c424560Gko3 != null) {
                c424560Gko3.setCornerRadius(fN5);
            }
            C1910480zoc c1910480zoc = C1910480zoc.LIZ;
            C1331670kl3 c1331670kl3LJIIIIZZ = C1331660kl2.LJIIIIZZ(C438710HIf.LIZ(urlModel));
            c1331670kl3LJIIIIZZ.LIZLLL(EnumC1906770zid.INBOX.getCoverSceneTag());
            c1910480zoc.getClass();
            C1910480zoc.LIZIZ(c1331670kl3LJIIIIZZ);
            Integer num2 = c637060Oym.LLIZ;
            if (num2 != null && num2.intValue() == 44) {
                drawable = (Drawable) this.LLJ.getValue();
            } else {
                drawable = (Drawable) this.LLJI.getValue();
            }
            c1331670kl3LJIIIIZZ.LJJIIZI(drawable);
            c1331670kl3LJIIIIZZ.LJJ(this.LLILLJJLI);
            C786410Ut5.h3(c1331670kl3LJIIIIZZ);
        } else {
            C424560Gko c424560Gko4 = this.LLILLJJLI;
            if (c424560Gko4 != null) {
                C786410Ut5.p(c424560Gko4, 8);
            }
        }
        C424560Gko c424560Gko5 = this.LLILLJJLI;
        if ((c424560Gko5 != null && c424560Gko5.getVisibility() == 0) || c637060Oym.LLILZLL == null) {
            TuxIconView tuxIconView2 = this.LLILLL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
        } else {
            TuxIconView tuxIconView3 = this.LLILLL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
            }
            Integer num3 = c637060Oym.LLIZ;
            if (num3 != null) {
                iIntValue = num3.intValue();
            } else {
                iIntValue = 24;
            }
            float fN52 = N5(c637060Oym.LLIZ);
            C637040Oyk c637040Oyk = c637060Oym.LLILZLL;
            if (c637040Oyk != null && (tuxIconView = this.LLILLL) != null) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = c637040Oyk.LIZ;
                c419910GdJ.LIZLLL = c637040Oyk.LIZIZ;
                c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(this.LL.getContext());
                C384050F3z c384050F3z = new C384050F3z();
                c384050F3z.LJII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                c384050F3z.LJI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(iIntValue)));
                c384050F3z.LIZJ = Float.valueOf(fN52);
                tuxIconView.setImageDrawable(C426750GoL.LJIILIIL(tuxIconDrawableLIZ, c384050F3z.LIZ(this.LL.getContext())));
            }
        }
        if (C0CYL.LIZJ.LJIIIIZZ()) {
            if (this.LLILZ != null) {
                I5(this.LLILZ, new SpannableStringBuilder(c637060Oym.LLILLL), c637060Oym, this.LLILZ.getWidth());
            }
        } else {
            TuxTextView tuxTextView = this.LLILZ;
            if (tuxTextView != null) {
                tuxTextView.setText(c637060Oym.LLILLL);
            }
        }
        String str3 = c637060Oym.LLIZLLLIL;
        if (str3 != null && !a0.LJJJIL(str3)) {
            TuxTextView tuxTextView2 = this.LLILZIL;
            if (tuxTextView2 != null) {
                C786410Ut5.LLLLZLL(tuxTextView2, 0);
            }
            TuxTextView tuxTextView3 = this.LLILZIL;
            if (tuxTextView3 != null) {
                tuxTextView3.setText(c637060Oym.LLIZLLLIL);
            }
            TuxTextView tuxTextView4 = this.LLILZ;
            if (tuxTextView4 != null) {
                tuxTextView4.setMaxLines(1);
            }
            TuxTextView tuxTextView5 = this.LLILZ;
            if (tuxTextView5 != null) {
                tuxTextView5.setTuxFont(52);
            }
        } else {
            TuxTextView tuxTextView6 = this.LLILZIL;
            if (tuxTextView6 != null) {
                C786410Ut5.LLLLZLL(tuxTextView6, 8);
            }
            TuxTextView tuxTextView7 = this.LLILZ;
            if (tuxTextView7 != null) {
                tuxTextView7.setMaxLines(2);
            }
            TuxTextView tuxTextView8 = this.LLILZ;
            if (tuxTextView8 != null) {
                tuxTextView8.setTuxFont(62);
            }
        }
        C637030Oyj c637030Oyj = c637060Oym.LLJIJIL;
        if (c637030Oyj != null && (str = c637030Oyj.LIZ) != null && str.length() != 0) {
            TuxTextView tuxTextView9 = this.LLILZLL;
            if (tuxTextView9 != null) {
                C786410Ut5.LLLLZLL(tuxTextView9, 0);
            }
            TuxTextView tuxTextView10 = this.LLILZLL;
            if (tuxTextView10 != null) {
                C637030Oyj c637030Oyj2 = c637060Oym.LLJIJIL;
                if (c637030Oyj2 != null) {
                    str2 = c637030Oyj2.LIZ;
                } else {
                    str2 = null;
                }
                tuxTextView10.setText(str2);
            }
            TuxTextView tuxTextView11 = this.LLILZLL;
            if (tuxTextView11 != null) {
                C786410Ut5.h9(tuxTextView11, new ACListenerS113S0200000_9(c637060Oym, this, 46));
            }
        } else {
            TuxTextView tuxTextView12 = this.LLILZLL;
            if (tuxTextView12 != null) {
                C786410Ut5.LLLLZLL(tuxTextView12, 8);
            }
        }
        if (c637060Oym.LLJILJIL) {
            TuxIconView tuxIconView4 = this.LLIZ;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 0);
            }
            TuxIconView tuxIconView5 = this.LLIZ;
            if (tuxIconView5 != null) {
                C786410Ut5.a9(tuxIconView5, new ACListenerS144S0100000_9(c637060Oym, 133));
            }
        } else {
            TuxIconView tuxIconView6 = this.LLIZ;
            if (tuxIconView6 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView6, 8);
            }
        }
        C786410Ut5.I7(new ACListenerS113S0200000_9(c637060Oym, this, 47), this.LL);
    }

    public final void I5(TuxTextView tuxTextView, SpannableStringBuilder spannableStringBuilder, C637060Oym c637060Oym, int i) {
        String str;
        if (i == 0) {
            HandlerHook.viewPost(tuxTextView, new ARunnableS18S0400000_9(this, tuxTextView, spannableStringBuilder, c637060Oym, 6));
            return;
        }
        C637030Oyj c637030Oyj = c637060Oym.LLJI;
        String str2 = "";
        if (c637030Oyj == null || (str = c637030Oyj.LIZ) == null) {
            str = "";
        }
        final int iIntValue = 0;
        if (str.length() != 0) {
            spannableStringBuilder.append((CharSequence) str);
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1r, this.LL.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            }
            final AwS375S0200000_9 awS375S0200000_9 = new AwS375S0200000_9(c637060Oym, this, 158);
            C786410Ut5.q2(spannableStringBuilder, new AbstractC431450Gvv(iIntValue, awS375S0200000_9) { // from class: X.0OzR
                public final /* synthetic */ Function1<View, Unit> LLILZ;

                @Override // android.text.style.ClickableSpan
                public final void onClick(View view) {
                    this.LLILZ.invoke(view);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(iIntValue, iIntValue);
                    this.LLILZ = awS375S0200000_9;
                }
            }, spannableStringBuilder.length() - str.length(), spannableStringBuilder.length(), 33);
            tuxTextView.setMovementMethod(C431440Gvu.LIZ());
            str2 = str;
        }
        tuxTextView.setText(C0P0O.LIZJ(spannableStringBuilder, tuxTextView.getPaint(), tuxTextView.getWidth(), 2, str2.length(), (int) tuxTextView.getPaint().measureText(str2), true));
    }
}
