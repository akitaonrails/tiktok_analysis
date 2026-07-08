package X;

import Y.ACListenerS116S0200000_12;
import android.content.Context;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.model.message.common.TextFormat;
import com.bytedance.android.livesdkapi.host.IHostTux;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0ULZ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0ULZ extends LinearLayout implements C0ULX, C018R {
    @Override // X.C0ULX
    public final void LJZI(View view, Function0<Unit> function0) {
    }

    @Override // X.C0ULX
    public View getBannerView() {
        return this;
    }

    @Override // X.C0ULX
    public final void onDetach() {
    }

    @Override // X.C0ULX
    public final void onHide() {
    }

    @Override // X.C0ULX
    public final void onPause() {
    }

    @Override // X.C0ULX
    public final void onResume() {
    }

    @Override // X.C0ULX
    public final void onShow() {
    }

    public void setLeftIcon(int i) {
    }

    @Override // X.C018R
    public void setLeftIconRes(int i) {
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
    }

    public void setSubMaxLine(int i) {
    }

    public void setTitleMaxLine(int i) {
    }

    private final C16F5 getBannerSubtitle() {
        return (C16F5) findViewById(R.id.bs_);
    }

    private final C16F5 getBannerTitle() {
        return (C16F5) findViewById(R.id.bsc);
    }

    private final TuxIconView getLeftIcon() {
        return (TuxIconView) findViewById(R.id.mk3);
    }

    private final LiveIconView getRightIcon() {
        return (LiveIconView) findViewById(R.id.tld);
    }

    public final void LIZ() {
        TuxIconView leftIcon = getLeftIcon();
        if (leftIcon != null) {
            leftIcon.setIconRes(C20736316Cj.LJ(R.attr.dn9, getContext()));
            leftIcon.setTintColor(C20736316Cj.LIZIZ(R.attr.exp, getContext()));
        }
    }

    public final void LIZIZ() {
        C16F5 bannerTitle = getBannerTitle();
        if (bannerTitle != null) {
            bannerTitle.setMovementMethod(LinkMovementMethod.getInstance());
            bannerTitle.setHighlightColor(0);
        }
    }

    public C0ULZ(Context context) {
        super(context, null, 0);
        C500260Jjc.LJIILL(R.layout.hh7, this, true);
    }

    public final boolean LIZJ(TopRightBannerContainerComponent topRightBannerContainerComponent) {
        String str;
        TextFormat textFormat;
        int i;
        Text text = topRightBannerContainerComponent.titleText;
        String str2 = null;
        if (text != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        CharSequence charSequenceLJIILIIL = C1133830fbx.LJIILIIL(text, str);
        Text text2 = topRightBannerContainerComponent.subtitleText;
        if (text2 != null) {
            str2 = text2.defaultPattern;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text2, str2);
        Text text3 = topRightBannerContainerComponent.subtitleText;
        if (text3 != null && (textFormat = text3.defaultFormat) != null && (i = textFormat.weight) > 0) {
            C1119920fFW.LJIIIIZZ(spannableLJIILIIL, 0, spannableLJIILIIL.length(), 33, i);
        }
        if (charSequenceLJIILIIL.length() == 0 && spannableLJIILIIL.length() == 0) {
            return false;
        }
        setTitle(charSequenceLJIILIIL);
        setSubTitle(spannableLJIILIIL);
        if (!((IHostTux) C1161920gLG.LIZJ(IHostTux.class)).Xl2(getLeftIcon(), topRightBannerContainerComponent.tuxUrl, getContext(), false)) {
            C500260Jjc.LJIILIIL(getLeftIcon());
        }
        setRightIcon(topRightBannerContainerComponent.hasRightArrow);
        C786410Ut5.Xa(this, new ACListenerS116S0200000_12(this, topRightBannerContainerComponent, 51));
        return true;
    }

    @Override // X.C018R
    public void setRightIcon(boolean z) {
        if (z) {
            C786410Ut5.LLJJIJIL(getRightIcon(), 0);
        } else {
            C786410Ut5.LLJJIJIL(getRightIcon(), 8);
        }
    }

    public void setSubTitle(CharSequence charSequence) {
        Boolean boolValueOf;
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C16F5 bannerSubtitle = getBannerSubtitle();
            if (bannerSubtitle != null) {
                bannerSubtitle.setText(charSequence);
                return;
            }
            return;
        }
        C16F5 bannerSubtitle2 = getBannerSubtitle();
        if (bannerSubtitle2 == null) {
            return;
        }
        C786410Ut5.LLJJJJ(bannerSubtitle2, 8);
    }

    @Override // X.C018R
    public void setTitle(CharSequence charSequence) {
        Boolean boolValueOf;
        boolean z;
        if (charSequence != null) {
            if (charSequence.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            boolValueOf = Boolean.valueOf(z);
        } else {
            boolValueOf = null;
        }
        if (C500260Jjc.LJJJI(boolValueOf)) {
            C16F5 bannerTitle = getBannerTitle();
            if (bannerTitle != null) {
                bannerTitle.setText(charSequence);
                return;
            }
            return;
        }
        C16F5 bannerTitle2 = getBannerTitle();
        if (bannerTitle2 == null) {
            return;
        }
        C786410Ut5.LLJJJJ(bannerTitle2, 8);
    }

    @Override // X.C0ULX
    public final boolean LLZLLLL(int i, Object obj) {
        TopRightBannerContainerComponent topRightBannerContainerComponent;
        C0UOK c0uok;
        if (i == -4) {
            if (!(obj instanceof C0UOK) || (c0uok = (C0UOK) obj) == null) {
                return false;
            }
            C771740UPc c771740UPc = c0uok.LIZJ;
            if (c771740UPc != null) {
                setTitle(c771740UPc.LIZ);
                setSubTitle(c771740UPc.LIZIZ);
                setRightIcon(C500260Jjc.LJJIIZ(c771740UPc.LIZJ));
                C786410Ut5.Xa(this, new ACListenerS116S0200000_12(this, c771740UPc, 50));
                return true;
            }
            return true;
        }
        if (!(obj instanceof TopRightBannerContainerComponent) || (topRightBannerContainerComponent = (TopRightBannerContainerComponent) obj) == null) {
            return false;
        }
        return LIZJ(topRightBannerContainerComponent);
    }

    @Override // X.C0ULX
    public final boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        return LIZJ(topRightBannerContainerComponent);
    }
}
