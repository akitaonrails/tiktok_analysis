package X;

import Y.ACListenerS156S0100000_22;
import Y.ACListenerS160S0100000_26;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS239S0000000_8;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vFY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1734980vFY extends FrameLayout {
    public final EditText LL;
    public final TextView LLILLJJLI;
    public final TextView LLILLL;
    public TextView LLILZ;

    public final void LIZLLL() {
        this.LLILZ = null;
        LJ(null, false);
    }

    public C1734980vFY(C19EG c19eg) {
        super(c19eg);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
        ScrollView scrollView = new ScrollView(c19eg);
        ViewGroup.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(scrollView);
        scrollView.setLayoutParams(layoutParams2);
        LinearLayout linearLayout = new LinearLayout(c19eg);
        linearLayout.setOrientation(1);
        C786410Ut5.d6(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setPadding(LIZJ(16), LIZJ(16), LIZJ(16), LIZJ(24));
        linearLayout.addView(LIZIZ("Follow shot", false));
        boolean zLIZ = C0L00.LIZ();
        AFwS239S0000000_8 aFwS239S0000000_8 = AFwS239S0000000_8.get$arr$(8);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = LIZJ(8);
        layoutParams3.bottomMargin = LIZJ(8);
        C786410Ut5.d6(linearLayout2, layoutParams3);
        LinearLayout linearLayout3 = new LinearLayout(getContext());
        linearLayout3.setOrientation(1);
        C786410Ut5.d6(linearLayout3, new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setText("template_follow_shot_refactor");
        textView.setTextColor(-1);
        textView.setTextSize(2, 14.0f);
        linearLayout3.addView(textView);
        TextView textView2 = new TextView(getContext());
        textView2.setText("Global master (entry sub-keys default on, AND with this)");
        textView2.setTextColor(ColorProtector.parseColor("#999999"));
        textView2.setTextSize(2, 11.0f);
        textView2.setPadding(0, LIZJ(2), 0, 0);
        linearLayout3.addView(textView2);
        C21411718qp c21411718qp = new C21411718qp(getContext(), null);
        c21411718qp.setChecked(zLIZ);
        C786410Ut5.y7(c21411718qp, new C580920MqQ(aFwS239S0000000_8, 0));
        linearLayout2.addView(linearLayout3);
        linearLayout2.addView(c21411718qp);
        linearLayout.addView(linearLayout2);
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, LIZJ(1));
        layoutParams4.bottomMargin = LIZJ(8);
        C786410Ut5.W5(view, layoutParams4);
        view.setBackgroundColor(ColorProtector.parseColor("#333333"));
        linearLayout.addView(view);
        linearLayout.addView(LIZIZ("Jump by template ID", true));
        TextView textView3 = new TextView(getContext());
        textView3.setText("PUGC/V2T · long-press card to copy ID");
        textView3.setTextColor(ColorProtector.parseColor("#888888"));
        textView3.setTextSize(2, 12.0f);
        textView3.setPadding(0, 0, 0, LIZJ(8));
        linearLayout.addView(textView3);
        FrameLayout frameLayout = new FrameLayout(c19eg);
        C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(0, -2, 1.0f));
        frameLayout.setBackgroundColor(ColorProtector.parseColor("#222222"));
        EditText editText = new EditText(c19eg);
        editText.setHint("Template ID");
        editText.setTextColor(-1);
        editText.setHintTextColor(ColorProtector.parseColor("#666666"));
        editText.setBackground(null);
        editText.setPadding(LIZJ(12), LIZJ(10), LIZJ(36), LIZJ(10));
        editText.setInputType(1);
        C786410Ut5.Z5(editText, new FrameLayout.LayoutParams(-1, -2));
        this.LL = editText;
        TuxIconView tuxIconView = new TuxIconView(c19eg, null, 0, 6, null);
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-2, -2, 8388629);
        layoutParams5.setMarginEnd(LIZJ(8));
        C786410Ut5.M6(tuxIconView, layoutParams5);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_x_mark_small;
        c419910GdJ.LIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
        c419910GdJ.LIZLLL = Integer.valueOf(ColorProtector.parseColor("#888888"));
        tuxIconView.setTuxIcon(c419910GdJ);
        C786410Ut5.LLLLLLZZ(tuxIconView, 8);
        C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(this, 0));
        editText.addTextChangedListener(new C786120Usc(tuxIconView, 2));
        frameLayout.addView(editText);
        frameLayout.addView(tuxIconView);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams6.topMargin = LIZJ(8);
        C786410Ut5.a6(frameLayout, layoutParams6);
        linearLayout.addView(frameLayout);
        LinearLayout linearLayout4 = new LinearLayout(c19eg);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams7.topMargin = LIZJ(12);
        C786410Ut5.d6(linearLayout4, layoutParams7);
        TextView textViewLIZ = LIZ("Preview", new LinearLayout.LayoutParams(0, -2, 1.0f), new AwS566S0100000_22(this, 29));
        this.LLILLJJLI = textViewLIZ;
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams8.setMarginStart(LIZJ(8));
        TextView textViewLIZ2 = LIZ("Follow shot", layoutParams8, new AwS566S0100000_22(this, 30));
        this.LLILLL = textViewLIZ2;
        linearLayout4.addView(textViewLIZ);
        linearLayout4.addView(textViewLIZ2);
        linearLayout.addView(linearLayout4);
        scrollView.addView(linearLayout);
        addView(scrollView);
    }

    public final int LIZJ(int i) {
        return (int) TypedValue.applyDimension(1, i, getResources().getDisplayMetrics());
    }

    public final void LJFF(String str) {
        C786410Ut5.re(Toast.makeText(C786410Ut5.N3(getContext()), str, 0));
    }

    public final TextView LIZIZ(String str, boolean z) {
        int iLIZJ;
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(ColorProtector.parseColor("#FE2C55"));
        textView.setTextSize(2, 14.0f);
        if (z) {
            iLIZJ = LIZJ(8);
        } else {
            iLIZJ = 0;
        }
        textView.setPadding(0, iLIZJ, 0, LIZJ(8));
        return textView;
    }

    public final void LJ(TextView textView, boolean z) {
        float f;
        String str;
        if (z) {
            f = 0.5f;
        } else {
            f = 1.0f;
        }
        this.LLILLJJLI.setEnabled(!z);
        this.LLILLL.setEnabled(!z);
        C786410Ut5.S4(f, this.LLILLJJLI);
        C786410Ut5.S4(f, this.LLILLL);
        TextView textView2 = this.LLILLJJLI;
        String str2 = "Loading...";
        if (z && Intrinsics.LJFF(textView, textView2)) {
            str = "Loading...";
        } else {
            str = "Preview";
        }
        textView2.setText(str);
        TextView textView3 = this.LLILLL;
        if (!z || !Intrinsics.LJFF(textView, textView3)) {
            str2 = "Follow shot";
        }
        textView3.setText(str2);
    }

    public final TextView LIZ(String str, LinearLayout.LayoutParams layoutParams, Function0<Unit> function0) {
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setTextSize(2, 13.0f);
        textView.setBackgroundColor(ColorProtector.parseColor("#333333"));
        textView.setPadding(LIZJ(12), LIZJ(10), LIZJ(12), LIZJ(10));
        C786410Ut5.g6(textView, layoutParams);
        C786410Ut5.T7(textView, new ACListenerS160S0100000_26(function0, 3));
        return textView;
    }
}
