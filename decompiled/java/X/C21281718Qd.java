package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.ecommerce.mixmall.container.body.sparklite.card.IHybridDataService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18Qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21281718Qd extends ConstraintLayout {
    public TuxIconView LL;
    public RemoteImageView LLILLJJLI;
    public TextView LLILLL;
    public int LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public int LLIZ;
    public Float LLIZLLLIL;
    public float LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public String LLJILJIL;
    public volatile Boolean LLJILJILJ;

    public C21281718Qd(Context context) {
        super(context);
        this.LLILZ = C0H9I.LIZ(12.0f);
        this.LLIZ = -1;
        this.LLJ = C0H9I.LIZJ(C0H9I.LIZ(r1));
        this.LLJI = C0H9I.LIZ(2.0f);
        this.LLJIJIL = true;
        this.LLJILJIL = "ProximaNova-Regular";
        try {
            e0(context);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C599820Nfo.LIZ.getClass();
            C599820Nfo.LIZIZ();
        }
    }

    public final C21281718Qd e0(Context context) {
        TuxIconView tuxIconView;
        RemoteImageView remoteImageView;
        TextView textView;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z = !((IHybridDataService) ServiceManager.get().getService(IHybridDataService.class)).LIZLLL();
        if (z) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.bq5, this, false);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createView inflate success: ");
            sbLIZ.append(viewTd);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZ("MMKVideoTime", strLIZIZ);
            addView(viewTd, new ViewGroup.LayoutParams(-1, -1));
            View viewFindViewById = viewTd.findViewById(R.id.jxe);
            if (viewFindViewById instanceof TuxIconView) {
                tuxIconView = (TuxIconView) viewFindViewById;
            } else {
                tuxIconView = null;
            }
            this.LL = tuxIconView;
            View viewFindViewById2 = viewTd.findViewById(R.id.k2c);
            if (viewFindViewById2 instanceof RemoteImageView) {
                remoteImageView = (RemoteImageView) viewFindViewById2;
            } else {
                remoteImageView = null;
            }
            this.LLILLJJLI = remoteImageView;
            View viewFindViewById3 = viewTd.findViewById(R.id.text);
            if (viewFindViewById3 instanceof TextView) {
                textView = (TextView) viewFindViewById3;
            } else {
                textView = null;
            }
            this.LLILLL = textView;
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
            RemoteImageView remoteImageView2 = this.LLILLJJLI;
            if (remoteImageView2 != null) {
                C786410Ut5.l(remoteImageView2, 8);
            }
            TextView textView2 = this.LLILLL;
            if (textView2 != null) {
                C786410Ut5.LLIL(textView2, 4);
            }
        } else {
            ViewGroup.LayoutParams c19me = new C19ME(-1, -1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setLayoutParams(c19me);
            int iLIZ = C679280Qkg.LIZ(12);
            TuxIconView tuxIconView3 = new TuxIconView(context, null, 0, 6, null);
            C19ME c19me2 = new C19ME(iLIZ, iLIZ);
            tuxIconView3.setId(R.id.jxe);
            c19me2.topToTop = 0;
            c19me2.leftToLeft = 0;
            c19me2.bottomToBottom = 0;
            c19me2.rightToLeft = R.id.k2c;
            c19me2.horizontalChainStyle = 2;
            tuxIconView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            C786410Ut5.M6(tuxIconView3, c19me2);
            addView(tuxIconView3);
            this.LL = tuxIconView3;
            RemoteImageView remoteImageView3 = new RemoteImageView(context);
            C19ME c19me3 = new C19ME(iLIZ, iLIZ);
            remoteImageView3.setId(R.id.k2c);
            c19me3.topToTop = 0;
            c19me3.leftToRight = R.id.jxe;
            c19me3.bottomToBottom = 0;
            c19me3.rightToLeft = R.id.text;
            remoteImageView3.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            C786410Ut5.f7(remoteImageView3, c19me3);
            addView(remoteImageView3);
            this.LLILLJJLI = remoteImageView3;
            TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
            C19ME c19me4 = new C19ME(-2, -2);
            tuxTextView.setId(R.id.text);
            c19me4.topToTop = 0;
            c19me4.leftToRight = R.id.k2c;
            c19me4.bottomToBottom = 0;
            c19me4.rightToRight = 0;
            tuxTextView.setFontFeatureSettings("tnum");
            C786410Ut5.R6(tuxTextView, c19me4);
            tuxTextView.setGravity(17);
            addView(tuxTextView);
            this.LLILLL = tuxTextView;
            TuxIconView tuxIconView4 = this.LL;
            if (tuxIconView4 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView4, 8);
            }
            RemoteImageView remoteImageView4 = this.LLILLJJLI;
            if (remoteImageView4 != null) {
                C786410Ut5.l(remoteImageView4, 8);
            }
            TextView textView3 = this.LLILLL;
            if (textView3 != null) {
                C786410Ut5.LLIL(textView3, 4);
            }
        }
        C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("MMKVideoTimeView, createView, useXml=");
        sbLIZ2.append(z);
        sbLIZ2.append(", cost=");
        sbLIZ2.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ2.append(' ');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo2.getClass();
        C599820Nfo.LIZ("MMKVideoTime", strLIZIZ2);
        return this;
    }

    public final void h0(InterfaceC1631620sYq<? super String, ? super Integer, ? super Typeface, ? extends Typeface> interfaceC1631620sYq) {
        int i;
        i0(false);
        TextView textView = this.LLILLL;
        if (textView != null) {
            textView.setTextColor(this.LLIZ);
        }
        TextView textView2 = this.LLILLL;
        if (textView2 != null) {
            textView2.setTextSize(this.LLJ);
        }
        TextView textView3 = this.LLILLL;
        if (textView3 != null) {
            C0H9H.LJFF(this.LLJI, textView3);
        }
        TextView textView4 = this.LLILLL;
        if (textView4 != null) {
            Float f = this.LLIZLLLIL;
            if (f != null && f.floatValue() >= 500.0f) {
                i = 1;
            } else {
                i = 0;
            }
            textView4.setTypeface(interfaceC1631620sYq.invoke(this.LLJILJIL, Integer.valueOf(i), textView4.getTypeface()), i);
        }
        TextView textView5 = this.LLILLL;
        if (textView5 != null) {
            C786410Ut5.LLIL(textView5, 0);
        }
    }

    public final void i0(boolean z) {
        if (Intrinsics.LJFF(this.LLJILJILJ, Boolean.valueOf(z))) {
            return;
        }
        this.LLJILJILJ = Boolean.valueOf(z);
        if (z) {
            if (!TextUtils.isEmpty(this.LLILZLL)) {
                RemoteImageView remoteImageView = this.LLILLJJLI;
                if (remoteImageView != null) {
                    int i = this.LLILZ;
                    C1744700vVE.LJII(remoteImageView, i, i);
                }
                RemoteImageView remoteImageView2 = this.LLILLJJLI;
                String str = this.LLILZLL;
                int i2 = this.LLILZ;
                C1324840ka2.LJIIJ(remoteImageView2, str, i2, i2);
                RemoteImageView remoteImageView3 = this.LLILLJJLI;
                if (remoteImageView3 != null) {
                    C786410Ut5.l(remoteImageView3, 0);
                }
                TuxIconView tuxIconView = this.LL;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 8);
                    return;
                }
                return;
            }
            TuxIconView tuxIconView2 = this.LL;
            if (tuxIconView2 != null) {
                int i3 = this.LLILZ;
                C1744700vVE.LJII(tuxIconView2, i3, i3);
            }
            TuxIconView tuxIconView3 = this.LL;
            if (tuxIconView3 != null) {
                tuxIconView3.setIconWidth(this.LLILZ);
            }
            TuxIconView tuxIconView4 = this.LL;
            if (tuxIconView4 != null) {
                tuxIconView4.setIconHeight(this.LLILZ);
            }
            TuxIconView tuxIconView5 = this.LL;
            if (tuxIconView5 != null) {
                tuxIconView5.setIconRes(R.raw.icon_color_pause);
            }
            RemoteImageView remoteImageView4 = this.LLILLJJLI;
            if (remoteImageView4 != null) {
                C786410Ut5.l(remoteImageView4, 8);
            }
            TuxIconView tuxIconView6 = this.LL;
            if (tuxIconView6 == null) {
                return;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView6, 0);
            return;
        }
        if (!TextUtils.isEmpty(this.LLILZIL)) {
            RemoteImageView remoteImageView5 = this.LLILLJJLI;
            if (remoteImageView5 != null) {
                int i4 = this.LLILZ;
                C1744700vVE.LJII(remoteImageView5, i4, i4);
            }
            RemoteImageView remoteImageView6 = this.LLILLJJLI;
            String str2 = this.LLILZIL;
            int i5 = this.LLILZ;
            C1324840ka2.LJIIJ(remoteImageView6, str2, i5, i5);
            RemoteImageView remoteImageView7 = this.LLILLJJLI;
            if (remoteImageView7 != null) {
                C786410Ut5.l(remoteImageView7, 0);
            }
            TuxIconView tuxIconView7 = this.LL;
            if (tuxIconView7 == null) {
                return;
            }
            C786410Ut5.LLLLLLZZ(tuxIconView7, 8);
            return;
        }
        TuxIconView tuxIconView8 = this.LL;
        if (tuxIconView8 != null) {
            int i6 = this.LLILZ;
            C1744700vVE.LJII(tuxIconView8, i6, i6);
        }
        TuxIconView tuxIconView9 = this.LL;
        if (tuxIconView9 != null) {
            tuxIconView9.setIconWidth(this.LLILZ);
        }
        TuxIconView tuxIconView10 = this.LL;
        if (tuxIconView10 != null) {
            tuxIconView10.setIconHeight(this.LLILZ);
        }
        TuxIconView tuxIconView11 = this.LL;
        if (tuxIconView11 != null) {
            tuxIconView11.setIconRes(R.raw.icon_color_play);
        }
        RemoteImageView remoteImageView8 = this.LLILLJJLI;
        if (remoteImageView8 != null) {
            C786410Ut5.l(remoteImageView8, 8);
        }
        TuxIconView tuxIconView12 = this.LL;
        if (tuxIconView12 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView12, 0);
    }

    public final void setIconSize(float f) {
        this.LLILZ = C0H9I.LIZ(f);
    }

    public final void setPlayIcon(String str) {
        this.LLILZIL = str;
    }

    public final void setShowTime(boolean z) {
        this.LLJIJIL = z;
    }

    public final void setStopIcon(String str) {
        this.LLILZLL = str;
    }

    public final void setTextColor(String str) {
        this.LLIZ = C1774710wHd.LIZ(str);
    }

    public final void setTextFontFamily(String str) {
        this.LLJILJIL = str;
    }

    public final void setTextFontSize(float f) {
        this.LLJ = C0H9I.LIZJ(C0H9I.LIZ(f));
    }

    public final void setTextFontWeight(float f) {
        this.LLIZLLLIL = Float.valueOf(f);
    }

    public final void setTextSpace(float f) {
        this.LLJI = C0H9I.LIZ(f);
    }
}
