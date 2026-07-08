package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Gnw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C426500Gnw extends LinearLayout {
    public Function1<? super Aweme, Unit> LL;
    public Function0<Unit> LLILLJJLI;
    public final Map<View, Boolean> LLILLL;

    public C426500Gnw(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void setAllLoadCompleteListener(Function0<Unit> function0) {
        this.LLILLJJLI = function0;
    }

    public final void setOnItemClickListener(Function1<? super Aweme, Unit> function1) {
        this.LL = function1;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int measuredWidth;
        super.onMeasure(i, i2);
        View childAt = getChildAt(0);
        if (childAt == null || (measuredWidth = childAt.getMeasuredWidth()) == childAt.getLayoutParams().height) {
            return;
        }
        for (View view : new C09RD(this)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = measuredWidth;
                C786410Ut5.W5(view, layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        super.onMeasure(i, i2);
    }

    public C426500Gnw(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILLL = new LinkedHashMap();
        int i2 = 0;
        do {
            SmartImageView smartImageView = new SmartImageView(context);
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.bv);
            smartImageView.setBackground(c384050F3z.LIZ(context));
            addView(smartImageView, new LinearLayout.LayoutParams(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(112)), 1.0f));
            i2++;
        } while (i2 < 3);
    }
}
