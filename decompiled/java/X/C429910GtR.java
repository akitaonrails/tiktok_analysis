package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.search.model.SearchSugEntity;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS407S0200000_6;
import kotlin.jvm.internal.AwS92S0201000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0GtR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429910GtR {
    public static final Drawable LIZJ(Context context) {
        Drawable drawableLIZIZ = C800330VaR.LIZIZ(context, R.drawable.bld);
        if (drawableLIZIZ != null) {
            drawableLIZIZ.setBounds(new Rect(0, 0, C341940Daq.LIZ(16.0d), C341940Daq.LIZ(16.0d)));
        }
        return drawableLIZIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, kotlin.jvm.internal.AwS92S0201000_6] */
    public static final void LIZ(TextView textView, SpannableStringBuilder spannableStringBuilder, Drawable drawable, int i) {
        T spannableStringBuilder2;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = new AwS92S0201000_6(textView, drawable, i, 9);
        C259800zU c259800zU2 = new C259800zU();
        if (spannableStringBuilder != null && spannableStringBuilder.length() != 0 && drawable != null && !drawable.getBounds().isEmpty()) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(spannableStringBuilder);
            C416750GVt c416750GVt = new C416750GVt(drawable);
            c416750GVt.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2));
            spannableStringBuilder3.append((CharSequence) "  ");
            C786410Ut5.q2(spannableStringBuilder3, c416750GVt, (spannableStringBuilder3.length() - 1) - 1, spannableStringBuilder3.length() - 1, 18);
            spannableStringBuilder2 = spannableStringBuilder3;
        } else {
            spannableStringBuilder2 = new SpannableStringBuilder(spannableStringBuilder);
        }
        c259800zU2.element = spannableStringBuilder2;
        if (textView.isLaidOut()) {
            textView.setText((CharSequence) c259800zU2.element);
            ((Function1) c259800zU.element).invoke(c259800zU2.element);
        } else {
            textView.setText((CharSequence) c259800zU2.element);
            C430110Gtl.LIZIZ(textView, new AwS407S0200000_6(c259800zU, (C259800zU<Function1<SpannableStringBuilder, Unit>>) c259800zU2, (C259800zU<SpannableStringBuilder>) 77));
        }
    }

    public static final void LIZIZ(final SearchSugEntity searchSugEntity, final TextView textView, final View view, final View view2, final int i) {
        int width;
        Integer num;
        if (view.findViewById(R.id.tv_sug_hint) != null) {
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.tv_sug_hint), 8);
        }
        if (view.findViewById(R.id.tv_sug_hint_point) != null) {
            C786410Ut5.LLLLZLL((TuxTextView) view.findViewById(R.id.tv_sug_hint_point), 8);
        }
        if (view.findViewById(R.id.ew3) != null) {
            C786410Ut5.LL(8, (ConstraintLayout) view.findViewById(R.id.ew3));
        }
        int iIntValue = 0;
        if (view.findViewById(R.id.eu1) != null) {
            C786410Ut5.LJZL(0, (LinearLayout) view.findViewById(R.id.eu1));
        }
        CharSequence charSequenceLIZIZ = C0QNG.LIZIZ(searchSugEntity, view.getContext());
        if (C288700BTg.LIZ()) {
            textView.setMaxLines(2);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            if (searchSugEntity.LIZLLL()) {
                LIZ(textView, SpannableStringBuilder.valueOf(charSequenceLIZIZ), LIZJ(textView.getContext()), 2);
            } else {
                textView.setText(charSequenceLIZIZ);
            }
            Object tag = textView.getTag(R.id.ghj);
            if ((tag instanceof Integer) && (num = (Integer) tag) != null) {
                iIntValue = num.intValue();
            }
            final int i2 = iIntValue + 1;
            textView.setTag(R.id.ghj, Integer.valueOf(i2));
            Runnable runnable = new Runnable() { // from class: X.0DJ2
                public final void LIZ() {
                    if (Intrinsics.LJFF(textView.getTag(R.id.ghj), Integer.valueOf(i2))) {
                        View view3 = view2;
                        int width2 = view3 != null ? view3.getWidth() : textView.getWidth();
                        boolean z = false;
                        int iLIZIZ = searchSugEntity.LIZLLL() ? (int) C418440Gaw.LIZIZ(18) : 0;
                        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                        int measuredWidth = textView.getMeasuredWidth() + iLIZIZ + ((int) C12ES.LIZJ(1.0f, textView.getContext()));
                        if (width2 > 0 && measuredWidth > width2) {
                            z = true;
                        }
                        textView.setMaxLines(z ? 2 : 1);
                        if (width2 <= 0) {
                            width2 = -2;
                        } else if (!z && measuredWidth <= width2) {
                            width2 = measuredWidth;
                        }
                        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                        if (layoutParams != null) {
                            TextView textView2 = textView;
                            if (layoutParams.width != width2) {
                                layoutParams.width = width2;
                                C786410Ut5.g6(textView2, layoutParams);
                            }
                        }
                        view.getLayoutParams().height = z ? (int) C12ES.LIZJ(60.0f, view.getContext()) : i;
                        textView.requestLayout();
                        view.requestLayout();
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("EcSearchStringUtilsKt@ec48.setupLengthExperiment$settle$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("EcSearchStringUtilsKt@ec48.setupLengthExperiment$settle$1");
                }
            };
            if (view2 != null) {
                width = view2.getWidth();
            } else {
                width = textView.getWidth();
            }
            if (width > 0) {
                runnable.run();
                return;
            } else {
                HandlerHook.viewPost(textView, runnable);
                return;
            }
        }
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        if (searchSugEntity.LIZLLL()) {
            LIZ(textView, SpannableStringBuilder.valueOf(charSequenceLIZIZ), LIZJ(textView.getContext()), 1);
        } else {
            textView.setText(charSequenceLIZIZ);
        }
        view.getLayoutParams().height = i;
        view.requestLayout();
    }
}
