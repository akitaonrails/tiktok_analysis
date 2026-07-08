package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterStructureOpt;
import com.zhiliaoapp.musically.R;
import webcast.data.RealtimeLiveCenterLopInfo;

/* JADX INFO: renamed from: X.1AHF, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHF extends ConstraintLayout {
    public RealtimeLiveCenterLopInfo.Task LL;
    public final C16F5 LLILLJJLI;
    public final LiveIconView LLILLL;
    public final ProgressBar LLILZ;
    public final C16F5 LLILZIL;

    public C1AHF(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C1AHF(Context context, AttributeSet attributeSet, int i) {
        int i2;
        super(context, attributeSet, i);
        if (LiveCenterStructureOpt.INSTANCE.isEnable()) {
            i2 = R.layout.h2b;
        } else {
            i2 = R.layout.h2a;
        }
        ViewGroup.inflate(context, i2, this);
        this.LLILLJJLI = (C16F5) findViewById(R.id.y3b);
        this.LLILLL = (LiveIconView) findViewById(R.id.k52);
        this.LLILZ = (ProgressBar) findViewById(R.id.xen);
        this.LLILZIL = (C16F5) findViewById(R.id.xez);
    }
}
