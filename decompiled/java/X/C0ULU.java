package X;

import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import webcast.data.TopRightBannerContainerComponent;

/* JADX INFO: renamed from: X.0ULU, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0ULU extends ConstraintLayout implements C0ULX, C018R {
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

    public void setLeftIcon(int i) {
    }

    @Override // X.C0ULX
    public void setOnCloseClickListener(View.OnClickListener onClickListener) {
    }

    public void setSubMaxLine(int i) {
    }

    public void setSubTitle(CharSequence charSequence) {
    }

    public void setTitleMaxLine(int i) {
    }

    @Override // X.C018R
    public void setLeftIconRes(int i) {
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.mk6);
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i);
        }
    }

    @Override // X.C018R
    public void setRightIcon(boolean z) {
        int i;
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.tld);
        if (liveIconView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i);
        }
    }

    @Override // X.C018R
    public void setTitle(CharSequence charSequence) {
        TextView textView = (TextView) findViewById(R.id.pfl);
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public C0ULU(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0ULU(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C500260Jjc.LJIILL(R.layout.hh2, this, true);
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
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.tld);
        if (liveIconView != null) {
            if (!topRightBannerContainerComponent.hasRightArrow) {
                i = 8;
            }
            C786410Ut5.LLJJIJIL(liveIconView, i);
        }
        return true;
    }
}
