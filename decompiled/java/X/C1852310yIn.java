package X;

import Y.ACListenerS161S0100000_27;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.tako.experiment.TakoEnterMethodListExperiment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yIn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852310yIn extends LinearLayout {
    public final FrameLayout LL;
    public final FrameLayout LLILLJJLI;
    public final C1852300yIm LLILLL;

    public final void setClickConfig(Function1<? super C1852300yIm, Unit> function1) {
        function1.invoke(this.LLILLL);
    }

    public C1852310yIn(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = new C1852300yIm(null);
        if (C1859307Pz.LIZ() && TakoEnterMethodListExperiment.LIZ(false)) {
            C21146717pB.LIZ(context, R.layout.fpv, this);
        } else {
            C786410Ut5.Sd(R.layout.fpv, C786410Ut5.ne(context), this);
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.xaq);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        frameLayout.setBackground(c384050F3z.LIZ(context));
        C786410Ut5.O7(frameLayout, new ACListenerS161S0100000_27(this, 0));
        C427690Gpr.LJ(frameLayout, C418440Gaw.LIZIZ(20));
        this.LL = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.xat);
        C384050F3z c384050F3z2 = new C384050F3z();
        c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
        c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(20));
        frameLayout2.setBackground(c384050F3z2.LIZ(context));
        C786410Ut5.O7(frameLayout2, new ACListenerS161S0100000_27(this, 1));
        C427690Gpr.LJ(frameLayout2, C418440Gaw.LIZIZ(20));
        this.LLILLJJLI = frameLayout2;
    }
}
