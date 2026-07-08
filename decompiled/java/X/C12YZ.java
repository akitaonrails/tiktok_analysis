package X;

import Y.ARunnableS104S0100000_4;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.api.AnchorSearchResponse;
import com.ss.android.ugc.aweme.config.FeedbackOptionValue;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackCell;
import com.ss.android.ugc.aweme.video.hashtag.feedback.HashtagFeedbackViewModel;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS105S0110000_18;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.12YZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public class C12YZ implements TextWatcher {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void beforeTextChanged$0(C12YZ c12yz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$1(C12YZ c12yz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void beforeTextChanged$2(C12YZ c12yz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$0(C12YZ c12yz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$1(C12YZ c12yz, CharSequence charSequence, int i, int i2, int i3) {
    }

    public static final void onTextChanged$2(C12YZ c12yz, CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        switch (this.$t) {
            case 0:
                afterTextChanged$0(this, editable);
                break;
            case 1:
                afterTextChanged$1(this, editable);
                break;
            case 2:
                afterTextChanged$2(this, editable);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                beforeTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                beforeTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                beforeTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.$t) {
            case 0:
                onTextChanged$0(this, charSequence, i, i2, i3);
                break;
            case 1:
                onTextChanged$1(this, charSequence, i, i2, i3);
                break;
            case 2:
                onTextChanged$2(this, charSequence, i, i2, i3);
                break;
        }
    }

    public static final void afterTextChanged$0(C12YZ c12yz, Editable editable) {
        String string;
        Integer numValueOf;
        String string2;
        String string3;
        if (editable == null || (string3 = editable.toString()) == null || (string = a0.LJLIIIL(string3).toString()) == null) {
            string = "";
        }
        if (string.length() > 0 && C572160McI.LJ()) {
            C855370Xh1.LIZ = string;
        }
        int i = LSPassThroughRecordSizeConfig.DEFAULT;
        try {
            SettingsManager.LIZLLL().getClass();
            int iLJ = SettingsManager.LJ("textmode_sticker_max_input_length", LSPassThroughRecordSizeConfig.DEFAULT);
            if (iLJ > 0) {
                i = iLJ;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("afterTextChanged length： ");
        String string4 = null;
        if (editable != null) {
            numValueOf = Integer.valueOf(editable.length());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (editable != null) {
            if (editable.length() > i) {
                if (editable != null && (string2 = editable.subSequence(0, i).toString()) != null) {
                    ((C124U) c12yz.l0).getEditText().setText(string2);
                }
                Selection.setSelection(C2204961BRm.LLJILLL(((C124U) c12yz.l0).getEditText(), new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KPm8apzF2SAT84bjkinigCEGbhQTZCErrk36SMvt/l+pMexBF4Klsg==", null)), i);
                C124U c124u = (C124U) c12yz.l0;
                AwS573S0100000_29 awS573S0100000_29 = new AwS573S0100000_29(c124u, 477);
                int i2 = C124U.LLLLLJIL;
                ARunnableS104S0100000_4 aRunnableS104S0100000_4 = c124u.LLLLLIL;
                if (aRunnableS104S0100000_4 != null) {
                    c124u.LLLLL.removeCallbacks(aRunnableS104S0100000_4);
                }
                ARunnableS104S0100000_4 aRunnableS104S0100000_42 = new ARunnableS104S0100000_4((Object) awS573S0100000_29, 48);
                c124u.LLLLLIL = aRunnableS104S0100000_42;
                C786410Ut5.LJLIIL(500L, c124u.LLLLL, aRunnableS104S0100000_42);
            }
            if (editable != null) {
                string4 = editable.toString();
            }
        }
        if (TextUtils.isEmpty(string4)) {
            TextView textView = (TextView) c12yz.l1;
            if (textView != null) {
                textView.setTextColor(((C124U) c12yz.l0).getContext().getResources().getColor(R.color.zf));
            }
            View view = ((C124U) c12yz.l0).LLJJIJIL;
            if (view != null) {
                view.setEnabled(false);
                return;
            }
            return;
        }
        TextView textView2 = (TextView) c12yz.l1;
        if (textView2 != null) {
            textView2.setTextColor(((C124U) c12yz.l0).getContext().getResources().getColor(R.color.zb));
        }
        View view2 = ((C124U) c12yz.l0).LLJJIJIL;
        if (view2 == null) {
            return;
        }
        view2.setEnabled(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.09mW] */
    public static final void afterTextChanged$1(C12YZ c12yz, Editable editable) {
        if (editable != null) {
            C259800zU c259800zU = (C259800zU) c12yz.l0;
            C11G7 c11g7 = (C11G7) c12yz.l1;
            ((C2472609mW) c259800zU.element).cancel();
            ?? c2472609mW = new C2472609mW();
            c259800zU.element = c2472609mW;
            if (editable.length() > 0) {
                TuxIconView tuxIconView = c11g7.LLJJJ;
                if (tuxIconView != null) {
                    C786410Ut5.LLLLLLZZ(tuxIconView, 0);
                }
                c11g7.LJLILLLLZI(true);
                C05XU c05xu = C11G6.LIZ;
                String string = editable.toString();
                c05xu.getClass();
                C15O7<AnchorSearchResponse> c15o7LIZ = C05XU.LIZIZ.LIZ(string);
                c15o7LIZ.LJ(new C19774412Yk(c15o7LIZ, c11g7, 4), C15O7.LJIIIIZZ, c2472609mW.LIZ());
                return;
            }
            c11g7.LJLIIIL();
        }
    }

    public static final void afterTextChanged$2(C12YZ c12yz, Editable editable) {
        boolean z;
        String str;
        FeedbackOptionValue feedbackOptionValue = ((C11C7) c12yz.l0).LL;
        if (feedbackOptionValue != null && (str = feedbackOptionValue.logInfo) != null) {
            ((HashtagFeedbackCell) c12yz.l1).I5().LL.put(str, String.valueOf(editable));
        }
        HashtagFeedbackViewModel hashtagFeedbackViewModelI5 = ((HashtagFeedbackCell) c12yz.l1).I5();
        if (String.valueOf(editable).length() == 0) {
            z = true;
        } else {
            z = false;
        }
        hashtagFeedbackViewModelI5.withState(new AwS105S0110000_18(hashtagFeedbackViewModelI5, !z, 15));
    }

    public C12YZ(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
