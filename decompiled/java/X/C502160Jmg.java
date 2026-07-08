package X;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subspace.newpost.vm.SubSpaceNewPostVM;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Jmg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C502160Jmg extends C502700JnY {
    public final View LL;
    public final SubSpaceNewPostVM LLILLJJLI;
    public final TextView LLILLL;

    public C502160Jmg(View view, SubSpaceNewPostVM subSpaceNewPostVM) {
        super(view);
        this.LL = view;
        this.LLILLJJLI = subSpaceNewPostVM;
        this.LLILLL = (TextView) view.findViewById(R.id.fdq);
    }

    @Override // X.C502700JnY
    public final void I5(AbstractC503810JpL abstractC503810JpL, InterfaceC2753014t interfaceC2753014t) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String strLJIJI = C497740JfY.LJIJI(2131844316);
        spannableStringBuilder.append((CharSequence) C786410Ut5.j4(C497740JfY.LJIJI(2131844314), Arrays.copyOf(new Object[]{strLJIJI}, 1)));
        int iLJJJ = a0.LJJJ(spannableStringBuilder, strLJIJI, 0, false, 6);
        int length = strLJIJI.length() + iLJJJ;
        C786410Ut5.q2(spannableStringBuilder, new ForegroundColorSpan(C20736316Cj.LIZIZ(R.attr.ex3, this.LL.getContext())), iLJJJ, length, 33);
        C1119920fFW.LJIIIIZZ(spannableStringBuilder, iLJJJ, length, 33, OppoPermissionPopupMaskDelayExp.DEFAULT);
        this.LLILLL.setText(spannableStringBuilder);
        C786410Ut5.T7(this.LLILLL, new View.OnClickListener() { // from class: X.0Jmf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SubSpaceNewPostVM subSpaceNewPostVM = this.LL.LLILLJJLI;
                subSpaceNewPostVM.getClass();
                subSpaceNewPostVM.setState(new C502140Jme());
            }
        });
    }
}
