package X;

import X.InterfaceC21657319pL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.0ybT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1863890ybT<T extends InterfaceC21657319pL> extends LinearLayout {
    public View LL;
    public View LLILLJJLI;
    public C427870Gq9 LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public boolean LLILZLL;

    public abstract Long LIZ();

    public abstract void LIZIZ(T t);

    public final C427870Gq9 getAvatar() {
        return this.LLILLL;
    }

    public final TuxTextView getExit() {
        return this.LLILZIL;
    }

    public final TuxTextView getName() {
        return this.LLILZ;
    }

    public final View getRoot() {
        return this.LLILLJJLI;
    }

    public final View getShadow() {
        return this.LL;
    }

    public void LIZJ(boolean z) {
        this.LLILZLL = z;
    }

    public final void setAvatar(C427870Gq9 c427870Gq9) {
        this.LLILLL = c427870Gq9;
    }

    public final void setExit(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setName(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setRoot(View view) {
        this.LLILLJJLI = view;
    }

    public final void setShadow(View view) {
        this.LL = view;
    }

    public final void setVisibleToUser(boolean z) {
        this.LLILZLL = z;
    }

    public void LIZLLL(InterfaceC21657319pL interfaceC21657319pL, AwS577S0100000_33 awS577S0100000_33) {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            C786410Ut5.LLLLZLL(tuxTextView, 0);
        }
    }

    public AbstractC1863890ybT(Context context, AttributeSet attributeSet, int i) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        super(context, attributeSet, i);
        LinearLayout.inflate(context, R.layout.frg, this);
        this.LL = findViewById(R.id.a1e);
        View viewFindViewById = findViewById(R.id.a1h);
        this.LLILLJJLI = viewFindViewById;
        if (viewFindViewById != null) {
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.c3);
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(16));
            viewFindViewById.setBackground(c384050F3z.LIZ(context));
        }
        this.LLILZ = (TuxTextView) findViewById(R.id.a1g);
        this.LLILLL = (C427870Gq9) findViewById(R.id.f660a17);
        if (C298860BnY.LIZ()) {
            View view = this.LLILLJJLI;
            if (view != null) {
                float f = 5;
                view.setPadding((int) C0DSB.LIZ(f), view.getPaddingTop(), (int) C0DSB.LIZ(f), view.getPaddingBottom());
            }
            C427870Gq9 c427870Gq9 = this.LLILLL;
            if (c427870Gq9 != null) {
                ViewGroup.LayoutParams layoutParams = c427870Gq9.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    float f2 = 22;
                    marginLayoutParams.height = (int) C0DSB.LIZ(f2);
                    marginLayoutParams.width = (int) C0DSB.LIZ(f2);
                    marginLayoutParams.setMarginStart((int) C0DSB.LIZ(0));
                    C786410Ut5.F6(c427870Gq9, marginLayoutParams);
                }
            }
        }
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.a1f);
        this.LLILZIL = tuxTextView;
        if (tuxTextView != null) {
            C384050F3z c384050F3z2 = new C384050F3z();
            c384050F3z2.LIZIZ = Integer.valueOf(R.attr.a03);
            c384050F3z2.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(11));
            tuxTextView.setBackground(c384050F3z2.LIZ(context));
        }
    }
}
