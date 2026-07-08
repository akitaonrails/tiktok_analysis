package X;

import Y.ACListenerS143S0100000_8;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0KgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C523620KgC implements InterfaceC529800KqA {
    public static final int $stable = 8;
    public final int LL;
    public Function0<Unit> LLILLJJLI;
    public final ViewOnClickListenerC523610KgB LLILLL = ViewOnClickListenerC523610KgB.LL;

    @Override // X.InterfaceC529800KqA
    public void dynamicInitView(View view) {
    }

    @Override // X.InterfaceC529800KqA
    public boolean enable() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public View getImageView() {
        return null;
    }

    @Override // X.InterfaceC529800KqA
    public int layoutRes() {
        return R.layout.dkf;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needFullSpan() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public boolean needGray() {
        return true;
    }

    @Override // X.InterfaceC529800KqA
    public void onFirstScreenLoaded(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public void onRecoverFromGray() {
    }

    @Override // X.InterfaceC529800KqA
    public void onSetGray() {
    }

    @Override // X.InterfaceC529800KqA
    public void setAlbumActivity(Activity activity) {
    }

    @Override // X.InterfaceC529800KqA
    public void setViewPosition(int i) {
    }

    @Override // X.InterfaceC529800KqA
    public View.OnClickListener getClickListener() {
        return this.LLILLL;
    }

    public final Function0<Unit> getOnClose() {
        return this.LLILLJJLI;
    }

    public C523620KgC(int i) {
        this.LL = i;
    }

    public final void setOnClose(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void onDisplayed(View view, boolean z) {
        int i;
        int iIntValue;
        TextView textView = (TextView) view.findViewById(R.id.text);
        Resources resources = textView.getContext().getResources();
        int i2 = this.LL;
        SpannableString spannableString = new SpannableString(resources.getQuantityString(2131755429, i2, Integer.valueOf(i2)));
        int iLJJJ = a0.LJJJ(spannableString, String.valueOf(this.LL), 0, false, 6);
        int length = String.valueOf(this.LL).length() + iLJJJ;
        if (iLJJJ >= 0) {
            C786410Ut5.p2(spannableString, new StyleSpan(1), iLJJJ, length, 18);
        }
        textView.setText(spannableString);
        if (z) {
            Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ef, textView.getContext());
            if (numLIZJ != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = -1;
            }
            textView.setTextColor(iIntValue);
        } else {
            textView.setTextColor(-16777216);
        }
        TuxIconView tuxIconView = (TuxIconView) view.findViewById(R.id.e1g);
        if (z) {
            tuxIconView.setTintColorRes(R.attr.ei);
        } else {
            tuxIconView.setTintColor(ColorProtector.parseColor("#52000000"));
        }
        C786410Ut5.a9(tuxIconView, new ACListenerS143S0100000_8(this, 60));
        View viewFindViewById = view.findViewById(R.id.bnu);
        Context context = viewFindViewById.getContext();
        if (z) {
            i = R.drawable.aph;
        } else {
            i = R.drawable.api;
        }
        viewFindViewById.setBackground(context.getDrawable(i));
    }
}
