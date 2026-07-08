package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0f3P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1112410f3P extends RelativeLayout {
    public C16F5 LL;
    public LiveIconView LLILLJJLI;
    public LiveIconView LLILLL;

    public void setImageIcon(int i) {
        LiveIconView liveIconView = this.LLILLJJLI;
        if (liveIconView != null) {
            liveIconView.setIconAttr(i);
        }
    }

    public void setImgWarnIconWithStyle(long j) {
        C786410Ut5.LLJJIJIL(this.LLILLJJLI, 8);
        C786410Ut5.LLJJIJIL(this.LLILLL, 0);
    }

    public void setInfoText(CharSequence charSequence) {
        this.LL.setText(charSequence);
    }

    public C1112410f3P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        RelativeLayout.inflate(getContext(), R.layout.hwn, this);
        this.LL = (C16F5) findViewById(R.id.tv_warn_info);
        this.LLILLJJLI = (LiveIconView) findViewById(R.id.khm);
        this.LLILLL = (LiveIconView) findViewById(R.id.kfz);
    }
}
