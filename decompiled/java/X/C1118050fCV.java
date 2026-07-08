package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftHammerSetting;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0fCV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1118050fCV extends ConstraintLayout implements C0T8B {
    public final C16F5 LL;

    @Override // X.C0T8B
    public final boolean h() {
        return false;
    }

    public final void setData(int i) {
        String str;
        C16F5 c16f5 = this.LL;
        if (i >= LiveGiftHammerSetting.INSTANCE.getMinComboPrice()) {
            str = (String) C1133200faw.LIZIZ.getValue();
        } else {
            str = (String) C1133200faw.LIZ.getValue();
        }
        c16f5.setText(str);
        c16f5.setHorizontalFadingEdgeEnabled(true);
        C1118060fCW.LIZ(c16f5);
    }

    public C1118050fCV(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1118050fCV(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ViewGroup.inflate(context, R.layout.hzh, this);
        this.LL = (C16F5) findViewById(R.id.iwr);
    }
}
