package X;

import android.content.Context;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TJx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744910TJx extends RelativeLayout {
    public final C1303280k1G LL;
    public final BPEAHandler LLILLJJLI;

    public C744910TJx(Context context) {
        int iIntValue;
        super(context, null, 0);
        this.LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a1_, context);
        if (numLIZJ != null) {
            iIntValue = numLIZJ.intValue();
        } else {
            iIntValue = 0;
        }
        setBackgroundColor(iIntValue);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        C1303280k1G c1303280k1G = new C1303280k1G(context);
        this.LL = c1303280k1G;
        linearLayout.addView(c1303280k1G, new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210))));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText(2131840508);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setTuxFont(123);
        tuxTextView.setGravity(17);
        linearLayout.addView(tuxTextView, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        addView(linearLayout, layoutParams);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.LL.clearAnimation();
        C786410Ut5.LJLLLLLL(8, this);
        return false;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C849850XVn.LIZIZ.LIZJ().LIZIZ(this);
        }
    }
}
