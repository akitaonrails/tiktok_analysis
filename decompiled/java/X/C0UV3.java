package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UV3, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UV3 extends FrameLayout {
    public boolean LL;
    public final ImageView LLILLJJLI;
    public final LiveIconView LLILLL;
    public final LiveIconView LLILZ;
    public final C16F5 LLILZIL;
    public final C16FS LLILZLL;

    public final void LIZ(boolean z) {
        if (this.LL == z) {
            return;
        }
        this.LL = z;
        if (z) {
            C500260Jjc.LLFFF(this.LLILLJJLI);
            C500260Jjc.LLFFF(this.LLILLL);
            C500260Jjc.LJIILIIL(this.LLILZ);
            C500260Jjc.LJIILIIL(this.LLILZIL);
            C500260Jjc.LJIILIIL(this.LLILZLL);
            return;
        }
        C500260Jjc.LJIILIIL(this.LLILLJJLI);
        C500260Jjc.LJIILIIL(this.LLILLL);
        C500260Jjc.LLFFF(this.LLILZ);
        C500260Jjc.LLFFF(this.LLILZIL);
        C500260Jjc.LLFFF(this.LLILZLL);
    }

    public void setClickAction(Function0<Unit> function0) {
        C16FS c16fs = this.LLILZLL;
        if (c16fs != null) {
            C500260Jjc.LJLIIIL(500L, c16fs, new AwS591S0100000_12(function0, (Function0<Unit>) 209));
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C500260Jjc.LJLIIIL(500L, imageView, new AwS591S0100000_12(function0, (Function0<Unit>) 210));
        }
    }

    public C0UV3(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        FrameLayout.inflate(context, R.layout.h30, this);
        LiveIconView liveIconView = (LiveIconView) findViewById(R.id.oaw);
        LiveIconView liveIconView2 = null;
        if (liveIconView != null) {
            liveIconView.setIconTint(C20736316Cj.LIZIZ(R.attr.c65, liveIconView.getContext()));
        } else {
            liveIconView = null;
        }
        this.LLILLL = liveIconView;
        LiveIconView liveIconView3 = (LiveIconView) findViewById(R.id.oau);
        if (liveIconView3 != null) {
            liveIconView3.setIconTint(C20736316Cj.LIZIZ(R.attr.c65, liveIconView3.getContext()));
            liveIconView2 = liveIconView3;
        }
        this.LLILZ = liveIconView2;
        this.LLILZIL = (C16F5) findViewById(R.id.oy9);
        this.LLILZLL = (C16FS) findViewById(R.id.unmute_button);
        this.LLILLJJLI = (ImageView) findViewById(R.id.jyy);
    }
}
