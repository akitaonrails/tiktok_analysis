package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.zhiliaoapp.musically.R;
import u4.q0;

/* JADX INFO: renamed from: X.10gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19310610gi extends RecyclerView.ViewHolder {
    public static final /* synthetic */ int LLILZ = 0;
    public final View LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;

    public final void I5(TuxTextView tuxTextView, TuxTextView tuxTextView2, String str, String str2) {
        tuxTextView.setText(str);
        if (str2 == null) {
            int dimensionPixelSize = this.LL.getContext().getResources().getDimensionPixelSize(R.dimen.hu);
            C426750GoL.LJIIIZ(tuxTextView, Integer.valueOf(dimensionPixelSize), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), Integer.valueOf(dimensionPixelSize), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(36))), false, 16);
            tuxTextView.setTuxFont(123);
            C786410Ut5.LLIL(tuxTextView2, 8);
            return;
        }
        tuxTextView2.setText(str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, X.10kN] */
    public C19310610gi(View view, boolean z, EnumC19310710gj enumC19310710gj, String str, String str2, SignupViewModel signupViewModel) {
        String str3;
        CharSequence text;
        String str4;
        String str5;
        int i;
        int marginStart;
        int marginEnd;
        int i2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        super(view);
        CharSequence charSequence = str;
        CharSequence text2 = str2;
        this.LL = view;
        TuxTextView tuxTextView = (TuxTextView) view.findViewById(R.id.title);
        this.LLILLJJLI = tuxTextView;
        TuxTextView tuxTextView2 = (TuxTextView) view.findViewById(R.id.uhp);
        this.LLILLL = tuxTextView2;
        q0.LJIJI(tuxTextView, true);
        if (enumC19310710gj == EnumC19310710gj.DYNAMIC_HEIGHT) {
            if (z) {
                if (text2 == null) {
                    text2 = view.getContext().getText(2131845262);
                }
            } else if (charSequence != null) {
                text2 = charSequence;
            } else {
                text2 = view.getContext().getText(2131845262);
            }
            tuxTextView.setText(text2);
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(15.0f)));
            tuxTextView.setPadding(iLIZIZ, 0, iLIZIZ, 0);
            ViewGroup.LayoutParams layoutParams = tuxTextView.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                i = marginLayoutParams2.topMargin;
            } else {
                i = 0;
            }
            if (i > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(15.0f)))) {
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    marginStart = ((ViewGroup.MarginLayoutParams) layoutParams2).getMarginStart();
                } else {
                    marginStart = 0;
                }
                Integer numValueOf = Integer.valueOf(marginStart);
                Integer numValueOf2 = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(15.0f))));
                ViewGroup.LayoutParams layoutParams3 = tuxTextView.getLayoutParams();
                if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                    marginEnd = ((ViewGroup.MarginLayoutParams) layoutParams3).getMarginEnd();
                } else {
                    marginEnd = 0;
                }
                Integer numValueOf3 = Integer.valueOf(marginEnd);
                ViewGroup.LayoutParams layoutParams4 = tuxTextView.getLayoutParams();
                if ((layoutParams4 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) != null) {
                    i2 = marginLayoutParams.bottomMargin;
                } else {
                    i2 = 0;
                }
                C426750GoL.LJIIIZ(tuxTextView, numValueOf, numValueOf2, numValueOf3, Integer.valueOf(i2), false, 16);
            }
            tuxTextView.setMaxLines(2);
            C21382118m3.LIZIZ(tuxTextView, 12, 63, 1, 1);
            C426750GoL.LJIIIZ(tuxTextView2, 0, 0, 0, 0, false, 16);
            tuxTextView2.setText("");
            C21382118m3.LIZIZ(tuxTextView2, 10, 13, 1, 2);
        } else if (enumC19310710gj == EnumC19310710gj.ACTIVE_SHOOTER_HEADER) {
            if (z) {
                text = view.getContext().getText(2131845257);
            } else {
                text = view.getContext().getText(2131845256);
            }
            if (C19286010ck.LIZLLL()) {
                if (text instanceof String) {
                    str5 = (String) text;
                } else {
                    str5 = null;
                }
                I5(tuxTextView, tuxTextView2, str5, null);
            } else {
                if (text instanceof String) {
                    str4 = (String) text;
                } else {
                    str4 = null;
                }
                CharSequence text3 = view.getContext().getText(2131845255);
                I5(tuxTextView, tuxTextView2, str4, text3 instanceof String ? (String) text3 : null);
            }
        } else if (z && enumC19310710gj == EnumC19310710gj.TRIAL_EXPIRES) {
            tuxTextView.setText(view.getContext().getText(2131822795));
            tuxTextView2.setText(view.getContext().getText(2131822796));
        } else if (enumC19310710gj == EnumC19310710gj.INCREASE_1P_SIGNUP) {
            if (z) {
                if (text2 == null) {
                    text2 = view.getContext().getText(2131829351);
                }
            } else if (charSequence != null) {
                text2 = charSequence;
            } else {
                text2 = view.getContext().getText(2131829310);
            }
            if (text2 instanceof String) {
                str3 = (String) text2;
            } else {
                str3 = null;
            }
            I5(tuxTextView, tuxTextView2, str3, null);
        } else if (z) {
            tuxTextView.setText(text2 == null ? view.getContext().getText(2131829351) : text2);
        } else {
            tuxTextView.setText(charSequence == null ? view.getContext().getText(2131829310) : charSequence);
            tuxTextView2.setText(view.getContext().getText(2131829307));
        }
        tuxTextView.setOnLongClickListener(new ViewOnLongClickListenerC19332710kH(this, 8));
        if (signupViewModel.PQ2()) {
            tuxTextView.setTuxFont(123);
            tuxTextView2.setTuxFont(61);
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = new ViewTreeObserverOnPreDrawListenerC19333310kN(this, c259800zU, 1);
            C786410Ut5.y3(view.getViewTreeObserver(), (ViewTreeObserver.OnPreDrawListener) c259800zU.element);
        }
        C19252910Tv.LIZIZ.LIZLLL().LJIJ().LIZLLL(tuxTextView, z);
    }
}
