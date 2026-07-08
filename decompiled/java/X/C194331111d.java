package X;

import Y.ACListenerS163S0100000_29;
import Y.AObjectS240S0100000_5;
import Y.AObjectS247S0100000_29;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.111d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C194331111d extends FrameLayout {
    public LifecycleOwner LL;
    public FrameLayout LLILLJJLI;
    public C0EV0 LLILLL;
    public View LLILZ;
    public C1664680tQA<C194335111h> LLILZIL;
    public InterfaceC194336111i LLILZLL;
    public TuxIconView LLIZ;
    public TuxTextView LLIZLLLIL;

    public C194331111d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LIZIZ() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        FrameLayout frameLayout = this.LLILLJJLI;
        ViewGroup.LayoutParams layoutParams = frameLayout != null ? frameLayout.getLayoutParams() : null;
        if (!(layoutParams instanceof RelativeLayout.LayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            return;
        }
        C426750GoL.LJIIJ(marginLayoutParams, getContext(), null, Integer.valueOf((int) this.LLILZIL.LIZ.LIZJ), null, null, 58);
        FrameLayout frameLayout2 = this.LLILLJJLI;
        if (frameLayout2 != null) {
            C786410Ut5.a6(frameLayout2, marginLayoutParams);
        }
        FrameLayout frameLayout3 = this.LLILLJJLI;
        if (frameLayout3 != null) {
            frameLayout3.requestLayout();
        }
    }

    public final FrameLayout getFakeLandScapeEntranceContainer() {
        return this.LLILLJJLI;
    }

    public final void setFakeLandScapeEntranceContainer(FrameLayout frameLayout) {
        this.LLILLJJLI = frameLayout;
    }

    public final void setOnEntranceClickListener(InterfaceC194336111i interfaceC194336111i) {
        this.LLILZLL = interfaceC194336111i;
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, C1664680tQA c1664680tQA) {
        this.LL = lifecycleOwner;
        this.LLILZIL = c1664680tQA;
        C786410Ut5.Sd(R.layout.c5y, C786410Ut5.ne(getContext()), this);
        this.LLILLJJLI = (FrameLayout) findViewById(R.id.hkm);
        this.LLILLL = (C0EV0) findViewById(R.id.m5c);
        View viewFindViewById = findViewById(R.id.ioi);
        this.LLILZ = viewFindViewById;
        if (viewFindViewById != null) {
            C786410Ut5.I7(new ACListenerS163S0100000_29(this, 324), viewFindViewById);
        }
        this.LLIZ = (TuxIconView) findViewById(R.id.ioh);
        this.LLIZLLLIL = (TuxTextView) findViewById(R.id.ioj);
        LIZIZ();
        this.LLILZIL.LIZ(new C2217381BqS() { // from class: X.111e
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Float.valueOf(((C194335111h) obj).LIZJ);
            }
        }).LIZ(this.LL, new AObjectS247S0100000_29(this, 102));
        this.LLILZIL.LIZ(new C2217381BqS() { // from class: X.111f
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C194335111h) obj).LIZ);
            }
        }).LIZ(this.LL, new AObjectS240S0100000_5(this, 166));
        this.LLILZIL.LIZ(new C2217381BqS() { // from class: X.111g
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((C194335111h) obj).LIZIZ);
            }
        }).LIZ(this.LL, new AObjectS247S0100000_29(this, 103));
    }

    public C194331111d(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILZIL = new C1664680tQA<>((Object) new C194335111h(0));
    }
}
