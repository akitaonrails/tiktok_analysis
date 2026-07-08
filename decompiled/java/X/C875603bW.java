package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS40S0200000_1;
import g1c.AjS60S0100000_1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03bW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C875603bW extends LinearLayout {
    public String LL;
    public TuxTextView LLILLJJLI;
    public TuxTextView LLILLL;
    public TuxTextView LLILZ;
    public View LLILZIL;
    public C21411818qq LLILZLL;

    public C875603bW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final TuxTextView getContentView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bp8);
            this.LLILLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final TuxTextView getCtaView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bp9);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    private final View getSwitchContainerView() {
        View view = this.LLILZIL;
        if (view != null) {
            return view;
        }
        View viewFindViewById = findViewById(R.id.bpa);
        this.LLILZIL = viewFindViewById;
        return viewFindViewById;
    }

    private final C21411818qq getSwitchView() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bp_);
            this.LLILZLL = (C21411818qq) callbackFindViewById;
        }
        return (C21411818qq) callbackFindViewById;
    }

    private final TuxTextView getTitleView() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.bpb);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C875603bW(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        setOrientation(1);
        C786410Ut5.LJLLJ(context, R.layout.akr, this);
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [T, kotlin.jvm.internal.AwS367S0200000_1] */
    public final void LIZ(C867003a8 c867003a8, String str, Function0<Unit> function0, Function0<Unit> function02, Function2<? super Boolean, ? super Function1<? super Boolean, Unit>, Unit> function2) {
        boolean z;
        int i;
        int i2;
        TuxTextView titleView = getTitleView();
        TuxTextView contentView = getContentView();
        TuxTextView ctaView = getCtaView();
        View switchContainerView = getSwitchContainerView();
        C21411818qq switchView = getSwitchView();
        if (titleView != null) {
            titleView.setText(c867003a8.LIZ);
        }
        if (contentView != null) {
            contentView.setText(c867003a8.LIZIZ);
        }
        if (str != null && !Intrinsics.LJFF(str, this.LL)) {
            this.LL = str;
            function0.invoke();
        }
        if (c867003a8.LJ == EnumC861103Yb.ENABLE) {
            z = true;
        } else {
            z = false;
        }
        int i3 = 8;
        if (switchContainerView != null) {
            if (z) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            C786410Ut5.LJLLLLLL(i2, switchContainerView);
        }
        if (switchView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            C786410Ut5.LJLLLLLL(i, switchView);
        }
        if (ctaView != null) {
            if (!z) {
                i3 = 0;
            }
            C786410Ut5.LJLLLLLL(i3, ctaView);
        }
        Function1 function1 = null;
        if (z) {
            if (C2213981Bky.LIZIZ.isOffline()) {
                C2211941Bhg.LIZ.injectViewListener(this);
            }
            setOnClickListener(null);
            setClickable(false);
            setFocusable(false);
            C013C c013c = new C013C();
            c013c.element = c867003a8.LIZLLL;
            C259800zU c259800zU = new C259800zU();
            AwS367S0200000_1 awS367S0200000_1 = new AwS367S0200000_1(function2, (Function2<? super Boolean, ? super Function1<? super Boolean, Unit>, Unit>) c259800zU, (C259800zU<Function1<Boolean, Unit>>) 86);
            c259800zU.element = new AwS367S0200000_1(c013c, switchView, 85);
            if (switchContainerView != null) {
                C786410Ut5.I7(new AjS40S0200000_1(awS367S0200000_1, c013c, 17), switchContainerView);
            }
            T t = c259800zU.element;
            if (t != 0) {
                function1 = (Function1) t;
            }
            function1.invoke(Boolean.valueOf(c867003a8.LIZLLL));
            return;
        }
        if (switchContainerView != null) {
            C786410Ut5.I7(null, switchContainerView);
        }
        if (switchView != null) {
            C786410Ut5.C7(switchView, null);
        }
        setClickable(true);
        setFocusable(true);
        if (ctaView != null) {
            ctaView.setText(getContext().getString(2131833163));
        }
        C786410Ut5.I7(new AjS60S0100000_1((Function0) function02, 23), this);
    }
}
