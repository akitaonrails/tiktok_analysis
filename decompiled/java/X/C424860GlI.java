package X;

import android.graphics.Rect;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.api.component.videoshrink.CommerceLandingPageVideoShrinkComponent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GlI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C424860GlI extends C09AY implements Function0<View> {
    public final /* synthetic */ CommerceLandingPageVideoShrinkComponent LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C424860GlI(CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent) {
        super(0);
        this.LL = commerceLandingPageVideoShrinkComponent;
    }

    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        SpannableString spannableString;
        CommerceLandingPageVideoShrinkComponent commerceLandingPageVideoShrinkComponent = this.LL;
        commerceLandingPageVideoShrinkComponent.getClass();
        C19EG c19egLIZ = C724240Sb0.LIZ(commerceLandingPageVideoShrinkComponent);
        if (c19egLIZ == null) {
            return null;
        }
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = R.raw.icon_chevron_up_double;
        c419910GdJ.LJ = Integer.valueOf(R.attr.ds);
        TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(c19egLIZ);
        tuxIconDrawableLIZ.setBounds(new Rect(0, 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(18))));
        C419890GdH c419890GdH = new C419890GdH(tuxIconDrawableLIZ, 2);
        String string = c19egLIZ.getString(2131858429);
        if (C426750GoL.LIZLLL(c19egLIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(string);
            sbLIZ.append(' ');
            spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ));
            C786410Ut5.p2(spannableString, c419890GdH, spannableString.length() - 1, spannableString.length(), 18);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(' ');
            sbLIZ2.append(string);
            spannableString = new SpannableString(C2188811AlT.LIZIZ(sbLIZ2));
            C786410Ut5.p2(spannableString, c419890GdH, 0, 1, 18);
        }
        TuxTextView tuxTextView = new TuxTextView(c19egLIZ, null, 6, 0);
        tuxTextView.setTuxFont(52);
        tuxTextView.setTextColorRes(R.attr.ds);
        tuxTextView.setText(spannableString, TextView.BufferType.SPANNABLE);
        tuxTextView.setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        tuxTextView.setGravity(17);
        tuxTextView.setBackgroundResource(R.drawable.ald);
        return tuxTextView;
    }
}
