package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0HgL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C447270HgL extends ConstraintLayout {
    public C16F5 LL;
    public LiveIconView LLILLJJLI;

    public final void setIcon(int i) {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setIcon(i);
        }
    }

    public final void setIconColor(int i) {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setIconTint(i);
        }
    }

    public final void setText(String str) {
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(str);
        }
    }

    public final void setTextColor(int i) {
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setTextColor(i);
        }
    }

    public final void setIcon(Drawable drawable) {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setIcon(drawable);
        }
    }

    public C447270HgL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View viewSd = C786410Ut5.Sd(R.layout.g3w, C786410Ut5.ne(getContext()), this);
        this.LL = (C16F5) viewSd.findViewById(R.id.d86);
        this.LLILLJJLI = (LiveIconView) viewSd.findViewById(R.id.d7j);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.CountDownV2SettingButton);
        int iLJFF = C20736316Cj.LJFF(getContext(), typedArrayObtainStyledAttributes, R$styleable.CountDownV2SettingButton_icon);
        if (iLJFF > 0) {
            LiveIconView liveIconView = this.LLILLJJLI;
            if (liveIconView != null) {
                C786410Ut5.LLJJIJIL(liveIconView, 0);
            }
            LiveIconView liveIconView2 = this.LLILLJJLI;
            if (liveIconView2 != null) {
                liveIconView2.setIcon(iLJFF);
            }
        } else {
            LiveIconView liveIconView3 = this.LLILLJJLI;
            if (liveIconView3 != null) {
                C786410Ut5.LLJJIJIL(liveIconView3, 8);
            }
        }
        String strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.CountDownV2SettingButton_text);
        C16F5 c16f5 = this.LL;
        if (c16f5 != null) {
            c16f5.setText(strXd);
        }
    }
}
