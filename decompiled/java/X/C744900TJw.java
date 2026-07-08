package X;

import X.C1C7U;
import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.a;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.feed.platform.panel.clearmode.PinchToClearGestureGuide$uiHandler$1;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0TJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C744900TJw extends RelativeLayout {
    public String LL;
    public String LLILLJJLI;
    public View.OnTouchListener LLILLL;
    public final C1303280k1G LLILZ;
    public final PinchToClearGestureGuide$uiHandler$1 LLILZIL;

    /* JADX WARN: Type inference failed for: r0v27, types: [com.ss.android.ugc.feed.platform.panel.clearmode.PinchToClearGestureGuide$uiHandler$1] */
    public C744900TJw(Context context) {
        int i;
        super(context, null, 0);
        this.LL = "";
        this.LLILLJJLI = "";
        setBackgroundColor(a.LIZIZ(R.attr.a1_, context));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        C1303280k1G c1303280k1G = new C1303280k1G(context);
        c1303280k1G.setId(R.id.qhk);
        this.LLILZ = c1303280k1G;
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(210)));
        C0H9H.LIZJ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), this);
        linearLayout.addView(c1303280k1G, marginLayoutParams);
        if (C299650Bop.LIZJ()) {
            i = 2131828837;
        } else if (C299650Bop.LIZLLL()) {
            i = 2131828838;
        } else {
            i = 2131828836;
        }
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        C444890HcV c444890HcV = new C444890HcV();
        c444890HcV.LIZ(33);
        TuxTextView.LJJJJ(tuxTextView, 22.0f, 28, c444890HcV.getTypeface(), 0.02f);
        tuxTextView.setTextColorRes(R.attr.ee);
        tuxTextView.setText(i);
        tuxTextView.setGravity(17);
        linearLayout.addView(tuxTextView, new RelativeLayout.LayoutParams(-1, -2));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
        addView(linearLayout, layoutParams);
        final Looper mainLooper = Looper.getMainLooper();
        this.LLILZIL = new BPEAHandler(mainLooper) { // from class: com.ss.android.ugc.feed.platform.panel.clearmode.PinchToClearGestureGuide$uiHandler$1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                C1C7U.LIZ("PinchToClearGestureGuide@9700.uiHandler$1");
                super.handleMessage(message);
                if (message.what == 1) {
                    this.LL.LIZIZ(true);
                }
                C1C7U.LIZIZ("PinchToClearGestureGuide@9700.uiHandler$1");
            }
        };
    }

    public final void LIZIZ(boolean z) {
        removeMessages(1);
        this.LLILZ.clearAnimation();
        if (getVisibility() != 8) {
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
            LIZ(false, z);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 6) {
                LIZIZ(false);
            }
        } else {
            removeMessages(1);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.0f);
        }
        View.OnTouchListener onTouchListener = this.LLILLL;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return true;
    }

    public final void setTouchDelegateListener(View.OnTouchListener onTouchListener) {
        this.LLILLL = onTouchListener;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 0) {
            C849850XVn.LIZIZ.LIZJ().LIZIZ(this);
        }
    }

    public final void LIZ(boolean z, boolean z2) {
        String str;
        String str2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", this.LL);
        c2344009Gk.LJIIIIZZ("group_id", this.LLILLJJLI);
        if (z) {
            str = "show";
        } else {
            str = "disappear";
        }
        c2344009Gk.LJIIIIZZ("action_type", str);
        if (!z) {
            if (z2) {
                str2 = "auto";
            } else {
                str2 = "click";
            }
            c2344009Gk.LJFF("disappear_method", str2);
        }
        C20684815ws.LJIILLIIL("pinch_to_clear_guide_show", c2344009Gk.LIZ);
    }
}
