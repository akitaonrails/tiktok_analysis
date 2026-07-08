package X;

import Y.ACListenerS146S0100000_11;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.ss.android.ugc.aweme.framework.analysis.CrashlyticsWrapperService;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0SUL, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SUL extends View {
    public static final /* synthetic */ int LLJJI = 0;
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public InterfaceC690460R6m LLIZ;
    public View.OnTouchListener LLIZLLLIL;
    public C0SUN LLJ;
    public C0RGA LLJI;
    public C0R8Z LLJIJIL;
    public long LLJILJIL;
    public View.OnClickListener LLJILJILJ;
    public boolean LLJILLL;
    public final C0RG9 LLJJ;

    public C0SUL() {
        throw null;
    }

    public void setEnableSimulateClick(boolean z) {
    }

    public void setScrollMode(boolean z) {
    }

    public InterfaceC690460R6m getListener() {
        return this.LLIZ;
    }

    public View.OnTouchListener getTapListener() {
        return this.LLIZLLLIL;
    }

    public int getTimeInterval() {
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_LONG_CLICK);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0082  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instruction units count: 271
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0SUL.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        if (!z) {
            C0SUM.LIZ.getClass();
            C0C33.LIZ.getClass();
            if (((Boolean) C0C33.LIZJ.getValue()).booleanValue()) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                StringBuilder sb = new StringBuilder("LongPressLayout set not enable: ");
                int length = stackTrace.length;
                if (length > 3) {
                    length = 3;
                }
                for (int i = 0; i < length; i++) {
                    sb.append(stackTrace[i].getClassName());
                    sb.append(e3.d);
                    sb.append(stackTrace[i].getMethodName());
                    sb.append(" ");
                    sb.append(stackTrace[i].getLineNumber());
                    sb.append("\n");
                }
                CrashlyticsWrapperService.LIZLLL().LIZ(3, "MotionEventALog", sb.toString());
            }
        }
        super.setEnabled(z);
    }

    public void setListener(InterfaceC690460R6m interfaceC690460R6m) {
        this.LLIZ = interfaceC690460R6m;
    }

    public void setLongPressInterceptor(C0R8Z c0r8z) {
        this.LLJIJIL = c0r8z;
    }

    public void setLongPressMonitor(C0RGA c0rga) {
        this.LLJI = c0rga;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(new ACListenerS146S0100000_11(this, 92));
        this.LLJILJILJ = onClickListener;
    }

    public void setTapListener(View.OnTouchListener onTouchListener) {
        this.LLIZLLLIL = onTouchListener;
    }

    public void setTimeInterval(int i) {
        this.LLILZLL = i;
    }

    public void setVideoScalingListener(C0SUN c0sun) {
        this.LLJ = c0sun;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0RG9] */
    public C0SUL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = -1;
        this.LLILZLL = 500;
        this.LLJJ = new Runnable() { // from class: X.0RG9
            public final void LIZ() {
                C0SUL c0sul = this.LL;
                C0RGA c0rga = c0sul.LLJI;
                if (c0rga != null) {
                    c0sul.LLJILLL = true;
                    c0rga.mf();
                    ViewParent parent = this.LL.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
                C0SUL c0sul2 = this.LL;
                if (c0sul2.LLIZ != null) {
                    C0R8Z c0r8z = c0sul2.LLJIJIL;
                    if (c0r8z == null || !c0r8z.Kh()) {
                        ViewParent parent2 = this.LL.getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        C0SUL c0sul3 = this.LL;
                        c0sul3.LLIZ.LIZ(c0sul3.LL, c0sul3.LLILLJJLI);
                    }
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LongPressLayout@be70.<field>$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LongPressLayout@be70.<field>$1");
            }
        };
        this.LLILZIL = ViewConfiguration.get(context).getScaledTouchSlop();
        C786410Ut5.Z9(this, new View.OnClickListener() { // from class: X.0SUO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
            }
        });
    }
}
