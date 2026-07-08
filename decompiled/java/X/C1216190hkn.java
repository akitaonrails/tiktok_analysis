package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.IPrevLoginPlatformService;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import p5a.a;

/* JADX INFO: renamed from: X.0hkn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1216190hkn extends RecyclerView.ViewHolder {
    public final View LL;
    public final SignupViewModel LLILLJJLI;
    public final TuxIconView LLILLL;
    public final ConstraintLayout LLILZ;
    public final TextView LLILZIL;
    public final TuxTextView LLILZLL;
    public final float LLIZ;
    public final IPrevLoginPlatformService LLIZLLLIL;
    public final int LLJ;

    public final String I5(String str) {
        String string = this.LL.getContext().getString(2131833922);
        String string2 = this.LL.getContext().getString(2131821602);
        String string3 = this.LL.getContext().getString(2131839756);
        String string4 = this.LL.getContext().getString(2131838735);
        int iHashCode = str.hashCode();
        if (iHashCode != -1068855134) {
            if (iHashCode != -265713450) {
                if (iHashCode == 96619420 && str.equals("email")) {
                    return C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string2}, 1));
                }
            } else if (str.equals("username")) {
                return C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string4}, 1));
            }
        } else if (str.equals("mobile")) {
            return C786410Ut5.j4(string, Arrays.copyOf(new Object[]{string3}, 1));
        }
        return this.LL.getContext().getString(2131833923);
    }

    public C1216190hkn(View view, SignupViewModel signupViewModel) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(view);
        this.LL = view;
        this.LLILLJJLI = signupViewModel;
        this.LLILLL = (TuxIconView) view.findViewById(R.id.jxe);
        this.LLILZ = (ConstraintLayout) view.findViewById(R.id.eqx);
        this.LLILZIL = (TextView) view.findViewById(R.id.dog);
        this.LLILZLL = (TuxTextView) view.findViewById(R.id.rok);
        this.LLIZ = C12ES.LJIIJ(view.getContext()) - C12ES.LIZJ(60.0f, view.getContext());
        this.LLIZLLLIL = (IPrevLoginPlatformService) ServiceManager.get().getService(IPrevLoginPlatformService.class);
        this.LLJ = view.getContext().getResources().getDimensionPixelSize(R.dimen.gc);
        view.setOnTouchListener(new a(0.5f, 150L));
        if (signupViewModel.PQ2()) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
            }
        }
    }
}
