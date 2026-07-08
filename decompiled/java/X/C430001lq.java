package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;

/* JADX INFO: renamed from: X.01lq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C430001lq extends ConstraintLayout {
    public C447270HgL LL;
    public C447270HgL LLILLJJLI;
    public C447270HgL LLILLL;
    public C447270HgL LLILZ;
    public final HashMap<Integer, C447270HgL> LLILZIL;
    public int LLILZLL;
    public InterfaceC430501lv LLIZ;

    public final long getSelectedOvertimeDuration() {
        return this.LLILZLL;
    }

    public final void setDurationChangeListener(InterfaceC430501lv interfaceC430501lv) {
        this.LLIZ = interfaceC430501lv;
    }

    public C430001lq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        HashMap<Integer, C447270HgL> map = new HashMap<>();
        this.LLILZIL = map;
        View viewSd = C786410Ut5.Sd(R.layout.g3v, C786410Ut5.ne(getContext()), this);
        this.LL = (C447270HgL) viewSd.findViewById(R.id.pwy);
        this.LLILLJJLI = (C447270HgL) viewSd.findViewById(R.id.pwx);
        this.LLILLL = (C447270HgL) viewSd.findViewById(R.id.pwz);
        this.LLILZ = (C447270HgL) viewSd.findViewById(R.id.px0);
        C447270HgL c447270HgL = this.LL;
        if (c447270HgL != null) {
            c447270HgL.setText(C497740JfY.LJIJI(2131851940));
        }
        C447270HgL c447270HgL2 = this.LLILLJJLI;
        if (c447270HgL2 != null) {
            c447270HgL2.setText(C497740JfY.LJIJJ(2131851941, 1));
        }
        C447270HgL c447270HgL3 = this.LLILLL;
        if (c447270HgL3 != null) {
            c447270HgL3.setText(C497740JfY.LJIJJ(2131851941, 3));
        }
        C447270HgL c447270HgL4 = this.LLILZ;
        if (c447270HgL4 != null) {
            c447270HgL4.setText(C497740JfY.LJIJJ(2131851941, 5));
        }
        map.put(30, this.LL);
        map.put(60, this.LLILLJJLI);
        map.put(180, this.LLILLL);
        map.put(Integer.valueOf(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL), this.LLILZ);
        for (View view : map.values()) {
            if (view != null) {
                view.setBackground(C424030Gjx.LIZ(getContext()));
                view.setSelected(false);
            }
        }
        e0(this.LL, 30);
        e0(this.LLILLJJLI, 60);
        e0(this.LLILLL, 180);
        e0(this.LLILZ, DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
    }

    public final void e0(C447270HgL c447270HgL, int i) {
        if (c447270HgL != null) {
            c447270HgL.setTextColor(C20736316Cj.LIZIZ(R.attr.ex3, getContext()));
            C500260Jjc.LJLIIIL(500L, c447270HgL, new C430201ls(this, i));
        }
    }
}
