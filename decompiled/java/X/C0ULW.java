package X;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0ULW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0ULW extends ConstraintLayout implements C0ULX {
    @Override // X.C0ULX
    public final void LJZI(View view, Function0<Unit> function0) {
    }

    @Override // X.C0ULX
    public final boolean LLZLLLL(int i, Object obj) {
        return false;
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

    private final TuxIconView getCloseButton() {
        return (TuxIconView) findViewById(R.id.pfk);
    }

    private final LiveIconView getRightIcon() {
        return (LiveIconView) findViewById(R.id.tld);
    }

    public final void setArrowVisibility(int i) {
        C786410Ut5.LLLLLLZZ(getCloseButton(), i);
    }

    public final void setNotifyText(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.pfl);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
        View viewFindViewById = findViewById(R.id.pfk);
        if (viewFindViewById != null) {
            C786410Ut5.I7(onClickListener, viewFindViewById);
        }
    }

    public C0ULW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C500260Jjc.LJIILL(R.layout.hh5, this, true);
    }

    @Override // X.C0ULX
    public final boolean c0(DataChannel dataChannel, LifecycleOwner lifecycleOwner, TopRightBannerContainerComponent topRightBannerContainerComponent) {
        String str;
        Text text = topRightBannerContainerComponent.titleText;
        if (text != null) {
            str = text.defaultPattern;
        } else {
            str = null;
        }
        Spannable spannableLJIILIIL = C1133830fbx.LJIILIIL(text, str);
        int i = 0;
        if (spannableLJIILIIL.length() == 0) {
            return false;
        }
        TextView textView = (TextView) findViewById(R.id.pfl);
        if (textView != null) {
            textView.setText(spannableLJIILIIL);
        }
        if (topRightBannerContainerComponent.hasRightArrow) {
            LiveIconView rightIcon = getRightIcon();
            if (rightIcon != null) {
                if (!topRightBannerContainerComponent.hasRightArrow) {
                    i = 8;
                }
                C786410Ut5.LLJJIJIL(rightIcon, i);
            }
            C786410Ut5.LLLLLLZZ(getCloseButton(), 8);
        } else {
            TuxIconView closeButton = getCloseButton();
            if (!topRightBannerContainerComponent.hasCloseButton) {
                i = 8;
            }
            C786410Ut5.LLLLLLZZ(closeButton, i);
            LiveIconView rightIcon2 = getRightIcon();
            if (rightIcon2 != null) {
                C786410Ut5.LLJJIJIL(rightIcon2, 8);
                return true;
            }
        }
        return true;
    }
}
