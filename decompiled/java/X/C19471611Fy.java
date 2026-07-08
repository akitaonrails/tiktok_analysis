package X;

import Y.ACListenerS163S0100000_29;
import android.content.Context;
import android.text.SpannedString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorOperationService;
import com.ss.android.ugc.aweme.anchor.service.AnchorLock$IAnchorStateService;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.UploadableDraftEffect;
import com.ss.android.ugc.aweme.creative.model.UploadableMobileEffect;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS273S0300000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS60S0310000_29;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11Fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471611Fy extends AbstractC19511111Vd {
    public final View LLILLJJLI;
    public final RemoteImageView LLILLL;
    public final TextView LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;
    public final LinearLayout LLIZ;
    public final TuxIconView LLIZLLLIL;
    public LinearLayout LLJ;
    public final TextView LLJI;
    public boolean LLJIJIL;
    public final AnchorLock$IAnchorStateService LLJILJIL;
    public final AnchorLock$IAnchorOperationService LLJILJILJ;

    @Override // X.AbstractC19511111Vd
    public final void LIZ() {
        this.LLJIJIL = true;
        LJI();
    }

    @Override // X.AbstractC19511111Vd
    public ViewGroup getAnchorListContent() {
        return null;
    }

    @Override // X.AbstractC19511111Vd
    public final void LIZJ() {
        LinearLayout linearLayout;
        TextView textView = this.LLILZ;
        if (textView != null) {
            textView.setText(getResources().getText(2131829793));
        }
        RemoteImageView remoteImageView = this.LLILLL;
        if (remoteImageView != null) {
            remoteImageView.setImageResource(R.drawable.c4o);
        }
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null && (linearLayout = this.LLJ) != null && linearLayout.getVisibility() == 0) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            tuxIconView.setTintColorRes(R.attr.a04);
        }
        TuxIconView tuxIconView2 = this.LLILZLL;
        if (tuxIconView2 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
        }
        TuxIconView tuxIconView3 = this.LLIZLLLIL;
        if (tuxIconView3 != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJ() {
        C12ES.LJIILL(8, this.LLIZLLLIL);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJFF() {
        TuxIconView tuxIconView = this.LLILZIL;
        if (tuxIconView != null) {
            C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJI() {
        C12ES.LJIILL(8, this.LLJI);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIIJJI() {
        C12ES.LJIILL(0, this.LLIZLLLIL);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJII() {
        View rootView = getRootView();
        if (rootView != null) {
            rootView.setEnabled(false);
        }
        View rootView2 = getRootView();
        if (rootView2 != null) {
            C786410Ut5.T4(rootView2, 0.4f);
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIILJJIL() {
        View rootView = getRootView();
        if (rootView != null) {
            rootView.setEnabled(true);
        }
        View rootView2 = getRootView();
        if (rootView2 != null) {
            C786410Ut5.T4(rootView2, 1.0f);
        }
        LinearLayout linearLayout = this.LLIZ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(0, linearLayout);
        }
        LinearLayout linearLayout2 = this.LLJ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(0, linearLayout2);
        }
    }

    @Override // X.AbstractC19511111Vd
    public RemoteImageView getLeftIcon() {
        return this.LLILLL;
    }

    @Override // X.AbstractC19511111Vd
    public TuxIconView getRightIcon() {
        return this.LLILZIL;
    }

    public C19471611Fy(Context context) {
        super(context);
        this.LLJILJIL = (AnchorLock$IAnchorStateService) ServiceManager.get().getService(AnchorLock$IAnchorStateService.class);
        this.LLJILJILJ = (AnchorLock$IAnchorOperationService) ServiceManager.get().getService(AnchorLock$IAnchorOperationService.class);
        this.LLILLJJLI = C786410Ut5.Sd(R.layout.cxq, C786410Ut5.ne(context), this);
        RemoteImageView remoteImageView = (RemoteImageView) findViewById(R.id.rva);
        this.LLILLL = remoteImageView;
        if (remoteImageView != null) {
            remoteImageView.setImageResource(R.drawable.c4o);
        }
        this.LLILZ = (TextView) findViewById(R.id.rvj);
        this.LLILZIL = (TuxIconView) findViewById(R.id.rvb);
        this.LLILZLL = (TuxIconView) findViewById(R.id.rvc);
        this.LLIZ = (LinearLayout) findViewById(R.id.rvl);
        TuxIconView tuxIconView = (TuxIconView) findViewById(R.id.rv_);
        this.LLIZLLLIL = tuxIconView;
        if (tuxIconView != null) {
            tuxIconView.setImageResource(R.drawable.bug);
        }
        this.LLJ = (LinearLayout) findViewById(R.id.ad6);
        this.LLJI = (TextView) findViewById(R.id.rv5);
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIIL(boolean z) {
        if (this.LLJIJIL) {
            return;
        }
        C12ES.LJIILL(0, this.LLJI);
        TextView textView = this.LLJI;
        if (textView != null) {
            textView.setText(getContext().getText(2131832658));
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIILIIL(int i) {
        Integer numLIZJ;
        String strLJJIFFI;
        if (this.LLJIJIL) {
            return;
        }
        if (i > 0) {
            C12ES.LJIILL(0, this.LLJI);
            TextView textView = this.LLJI;
            if (textView != null) {
                if (i == 1) {
                    strLJJIFFI = C20642515q3.LJI(2131821552);
                } else {
                    strLJJIFFI = u.LJJIFFI(C20642515q3.LJI(2131821551), "{{count}}", String.valueOf(i), false);
                }
                textView.setText(strLJJIFFI);
            }
            if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJJZ()) {
                View rootView = getRootView();
                if (rootView != null) {
                    C337180DJs.LIZJ(rootView);
                    Context context = getContext();
                    if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.a0c, context)) != null) {
                        rootView.setBackgroundColor(numLIZJ.intValue());
                    }
                }
                ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJLI();
                return;
            }
            return;
        }
        TextView textView2 = this.LLJI;
        if (textView2 != null) {
            textView2.setText("");
        }
        C12ES.LJIILL(4, this.LLJI);
        View rootView2 = getRootView();
        if (rootView2 == null) {
            return;
        }
        rootView2.setBackgroundColor(0);
    }

    @Override // X.AbstractC19511111Vd
    public void setOnAddClickListener(Function1<? super View, Unit> function1) {
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ad6);
        this.LLJ = linearLayout;
        if (linearLayout != null) {
            C786410Ut5.R7(linearLayout, new ACListenerS163S0100000_29(function1, 167));
        }
    }

    @Override // X.AbstractC19511111Vd
    public final void LJIIIIZZ(AnchorTransData anchorTransData, UrlModel urlModel, String str, boolean z, List list, List list2, Function1 function1, SpannedString spannedString, boolean z2, boolean z3, Function0 function0) {
        String str2;
        List<String> urlList;
        View rootView;
        View rootView2;
        TextView textView = this.LLJI;
        if (textView != null) {
            C786410Ut5.LLIL(textView, 8);
        }
        TuxIconDrawable tuxIconDrawableLIZ = C19404710vt.LIZ(anchorTransData, getContext());
        if ((urlModel != null || tuxIconDrawableLIZ != null) && str.length() > 0) {
            if (tuxIconDrawableLIZ != null) {
                RemoteImageView remoteImageView = this.LLILLL;
                if (remoteImageView != null) {
                    remoteImageView.setImageDrawable(tuxIconDrawableLIZ);
                }
            } else {
                if (urlModel == null || (urlList = urlModel.getUrlList()) == null || (str2 = (String) C13LP.LJJJJZI(urlList)) == null) {
                    str2 = "";
                }
                C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
                c1331670kl3LJIIIZ.LJJI(this.LLILLL);
                C786410Ut5.h3(c1331670kl3LJIIIZ);
            }
            if (spannedString != null) {
                TextView textView2 = this.LLILZ;
                if (textView2 != null) {
                    textView2.setText(spannedString, TextView.BufferType.SPANNABLE);
                }
            } else {
                TextView textView3 = this.LLILZ;
                if (textView3 != null) {
                    textView3.setText(str);
                }
            }
            if (C294110Bft.LIZIZ()) {
                if (function1 != null) {
                    this.LLJILJIL.LIZ(1);
                    this.LLJILJILJ.LIZIZ(Collections.singletonList(1));
                    this.LLJILJIL.LJI();
                }
                TuxIconView tuxIconView = this.LLILZLL;
                if (tuxIconView != null) {
                    if (function1 != null) {
                        this.LLJILJILJ.LIZ(4, new AwS273S0300000_29(function1, (Function1<? super View, Unit>) tuxIconView, (TuxIconView) this, (C19471611Fy) 14));
                        this.LLJILJILJ.LIZ(5, new AwS60S0310000_29(this, (C19471611Fy) z, (boolean) function1, (Function1<? super View, Unit>) tuxIconView, (TuxIconView) 1));
                    } else {
                        this.LLJILJILJ.LIZ(2, new AwS573S0100000_29(this, 789));
                        this.LLJILJIL.LJI();
                    }
                }
            }
            TuxIconView tuxIconView2 = this.LLILZIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            TuxIconView tuxIconView3 = this.LLILZLL;
            if (tuxIconView3 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView3, 0);
                if (function1 != null) {
                    tuxIconView3.setTintColorRes(R.attr.a1k);
                    tuxIconView3.setIconRes(R.raw.icon_x_mark);
                    C786410Ut5.a9(tuxIconView3, new ACListenerS163S0100000_29(function1, 167));
                } else {
                    tuxIconView3.setTintColorRes(R.attr.a1k);
                    tuxIconView3.setIconRes(R.raw.icon_chevron_right_offset_ltr);
                    C786410Ut5.a9(tuxIconView3, new ACListenerS163S0100000_29(this, 166));
                }
            }
            if (list != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    if (((UploadableDraftEffect) it2.next()).effectName.equals(str) && (rootView2 = getRootView()) != null) {
                        C786410Ut5.LJLLLLLL(8, rootView2);
                    }
                }
            }
            if (list2 != null) {
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    if (((UploadableMobileEffect) it3.next()).effectName.equals(str) && (rootView = getRootView()) != null) {
                        C786410Ut5.LJLLLLLL(8, rootView);
                    }
                }
            }
        }
    }
}
