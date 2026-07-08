package X;

import Y.ACListenerS147S0100000_12;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: renamed from: X.0UUA, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UUA extends ConstraintLayout {
    public final LiveIconView LL;
    public final C16F5 LLILLJJLI;
    public final C16F5 LLILLL;
    public final C16F5 LLILZ;
    public RealtimeLiveCenterLopInfo.FeatureGuidance LLILZIL;
    public int LLILZLL;
    public DataChannel LLIZ;

    public C0UUA(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0UUA(Context context, AttributeSet attributeSet, int i) {
        int i2;
        LiveIconView liveIconView;
        super(context, attributeSet, i);
        this.LLILZLL = -1;
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            i2 = R.layout.h2d;
        } else {
            i2 = R.layout.h2c;
        }
        ViewGroup.inflate(context, i2, this);
        this.LL = (LiveIconView) findViewById(R.id.k0o);
        this.LLILLJJLI = (C16F5) findViewById(R.id.wh1);
        this.LLILLL = (C16F5) findViewById(R.id.y3b);
        C16F5 c16f5 = (C16F5) findViewById(R.id.ylp);
        this.LLILZ = c16f5;
        if (C497740JfY.LJJ() && (liveIconView = (LiveIconView) findViewById(R.id.ylb)) != null) {
            liveIconView.setIcon(C20736316Cj.LIZLLL(R.attr.d2z, context));
        }
        if (c16f5 != null) {
            C786410Ut5.l8(c16f5, new ACListenerS147S0100000_12((Object) this, 133));
        }
    }
}
