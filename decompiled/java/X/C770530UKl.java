package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.broadcast.PreviewRevisionPageStyleABSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveHostFixResolveErrorSetting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UKl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C770530UKl extends ConstraintLayout {
    public ImageView LL;
    public TuxTextView LLILLJJLI;
    public View LLILLL;
    public TextView LLILZ;
    public ImageView LLILZIL;

    @Override // android.view.View
    public View getRootView() {
        return this;
    }

    public final void e0() {
        C786410Ut5.LJLLLLLL(8, this.LLILLL);
        C786410Ut5.LJZI(8, this.LLILZIL);
        C786410Ut5.LLIL(this.LLILZ, 8);
    }

    private int getLayoutId() {
        return C760180Trs.LJII() ? R.layout.hr4 : R.layout.hr3;
    }

    public ImageView getAlertImageView() {
        return this.LLILZIL;
    }

    public TextView getAlertText() {
        return this.LLILZ;
    }

    public ImageView getIconView() {
        return this.LL;
    }

    public View getRedDotView() {
        return this.LLILLL;
    }

    public TextView getTextView() {
        return this.LLILLJJLI;
    }

    public C770530UKl(Context context, int i) {
        super(context, null, 0);
        Context context2 = getContext();
        if (LiveHostFixResolveErrorSetting.getEnable()) {
            C1834150xpV.LIZ(context2, false);
        }
        ViewGroup.inflate(context2, getLayoutId(), this);
        this.LL = (ImageView) findViewById(R.id.y7j);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.z1c);
        this.LLILLJJLI = tuxTextView;
        C786410Ut5.LLLLZLL(tuxTextView, 0);
        this.LLILLJJLI.setMinTextSize(8.0f);
        this.LLILZ = (TextView) findViewById(R.id.y78);
        this.LLILZIL = (ImageView) findViewById(R.id.y76);
        this.LLILLL = findViewById(R.id.y7f);
        ImageView imageView = (ImageView) findViewById(R.id.widget_shadow_icon);
        if (!C760180Trs.LJ() && !PreviewRevisionPageStyleABSetting.INSTANCE.isWeakPackage()) {
            C786410Ut5.LJZI(8, imageView);
        } else {
            C786410Ut5.LJZI(0, imageView);
            imageView.setImageResource(R.drawable.ey_);
        }
    }
}
