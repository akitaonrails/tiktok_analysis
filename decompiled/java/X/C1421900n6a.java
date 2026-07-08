package X;

import Y.ACListenerS156S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0n6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421900n6a extends LinearLayout {
    public static final int LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
    public final TuxTextView LL;
    public final TuxTextView LLILLJJLI;
    public EnumC1407180miq LLILLL;

    public final void LIZ(EnumC1407180miq enumC1407180miq) {
        int i;
        String string;
        int i2;
        if (enumC1407180miq != this.LLILLL && enumC1407180miq != EnumC1407180miq.ERROR) {
            this.LLILLL = enumC1407180miq;
            TuxTextView tuxTextView = this.LL;
            Context context = tuxTextView.getContext();
            if (enumC1407180miq == null) {
                i = -1;
            } else {
                i = C1407190mir.LIZ[enumC1407180miq.ordinal()];
            }
            String string2 = "";
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        string = "";
                    } else {
                        string = context.getString(2131846630);
                    }
                } else {
                    string = context.getString(2131846628);
                }
            } else {
                string = context.getString(2131846634);
            }
            tuxTextView.setText(string);
            int i3 = 0;
            if (string.length() == 0) {
                i2 = 8;
            } else {
                i2 = 0;
            }
            C786410Ut5.LLLLZLL(tuxTextView, i2);
            TuxTextView tuxTextView2 = this.LLILLJJLI;
            EnumC1407180miq enumC1407180miq2 = this.LLILLL;
            Context context2 = tuxTextView2.getContext();
            if (enumC1407180miq2 != null) {
                int i4 = C1407190mir.LIZ[enumC1407180miq2.ordinal()];
                if (i4 != 1) {
                    if (i4 == 4) {
                        string2 = context2.getString(2131846631);
                    }
                } else {
                    string2 = context2.getString(2131846629);
                }
            }
            tuxTextView2.setText(string2);
            if (string2.length() == 0) {
                i3 = 8;
            }
            C786410Ut5.LLLLZLL(tuxTextView2, i3);
        }
    }

    public final void setListener(InterfaceC1421910n6b interfaceC1421910n6b) {
        C786410Ut5.h9(this.LLILLJJLI, new ACListenerS156S0100000_22(interfaceC1421910n6b, 2));
    }

    public C1421900n6a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        setGravity(16);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTuxFont(71);
        tuxTextView.setTextColorRes(R.attr.a1k);
        tuxTextView.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)));
        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        tuxTextView.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.R6(tuxTextView, layoutParams);
        this.LL = tuxTextView;
        TuxTextView tuxTextView2 = new TuxTextView(context, null, 6, 0);
        tuxTextView2.setTuxFont(71);
        tuxTextView2.setTextColorRes(R.attr.a1o);
        tuxTextView2.setMaxLines(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        tuxTextView2.setEllipsize(TextUtils.TruncateAt.END);
        C786410Ut5.R6(tuxTextView2, layoutParams2);
        this.LLILLJJLI = tuxTextView2;
        addView(tuxTextView);
        addView(tuxTextView2);
        HandlerHook.viewPost(this, new ARunnableS122S0100000_22(this, 0));
    }
}
