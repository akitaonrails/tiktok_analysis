package X;

import Y.ACListenerS142S0100000_7;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.subscription.pgc.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K3f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511250K3f extends C0K3V {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final TextView LLILLL;

    public C511250K3f(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (TextView) view.findViewById(R.id.fdq);
    }

    @Override // X.C0K3V
    public final void I5(AbstractC511160K2w abstractC511160K2w, InterfaceC2753014t interfaceC2753014t) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strLJII = C511520K4g.LJII(2131839605);
        String str = "";
        if (strLJII == null) {
            strLJII = "";
        }
        String strLJII2 = C511520K4g.LJII(2131839603);
        if (strLJII2 != null) {
            str = strLJII2;
        }
        spannableStringBuilder.append((CharSequence) C786410Ut5.j4(str, Arrays.copyOf(new Object[]{strLJII}, 1)));
        int iLJJJ = a0.LJJJ(spannableStringBuilder, strLJII, 0, false, 6);
        int length = strLJII.length() + iLJJJ;
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C426930God.LIZ(R.attr.f_h, this.LL.getContext())), iLJJJ, length, 33);
        C511270K3h.LIZ(spannableStringBuilder, iLJJJ, length, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        this.LLILLL.setText(spannableStringBuilder);
        C786410Ut5.T7(this.LLILLL, new ACListenerS142S0100000_7(this, 315));
    }
}
