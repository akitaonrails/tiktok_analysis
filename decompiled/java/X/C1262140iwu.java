package X;

import android.content.Context;
import android.util.AttributeSet;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS633S0100000_19;
import u4.q0;

/* JADX INFO: renamed from: X.0iwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1262140iwu extends AbstractC1262130iwt {
    public String LLILLL;
    public String LLILZ;

    public final String getEnterFrom() {
        return this.LLILLL;
    }

    public final String getPreviousPage() {
        return this.LLILZ;
    }

    private final void setupView(Context context) {
        C786410Ut5.Sd(R.layout.f_3, C786410Ut5.ne(context), this);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.sxv);
        q0.LJJI(tuxTextView, true);
        q0.LJIJI(tuxTextView, true);
        setTitleTextView(tuxTextView);
        setInfoIconView((TuxIconView) findViewById(R.id.kmh));
        C1387040mCM.LIZ(getInfoIconView(), new AwS633S0100000_19(context, 84));
        C428150Gqb.LIZ(getInfoIconView(), EnumC428940Grs.ALPHA, 0.0f);
        C426750GoL.LJIIL(this, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), 20);
    }

    public final void setDarkMode(boolean z) {
        if (z) {
            getTitleTextView().setTextColor(C960203pA.LIZ(R.attr.eh, getContext()));
            getInfoIconView().setTintColor(C960203pA.LIZ(R.attr.eh, getContext()));
        }
    }

    public final void setEnterFrom(String str) {
        this.LLILLL = str;
    }

    public final void setPreviousPage(String str) {
        this.LLILZ = str;
    }

    public C1262140iwu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = "";
        this.LLILZ = "";
        setupView(context);
        C786410Ut5.a9(getInfoIconView(), new C1265800j2o(this, 0));
    }
}
