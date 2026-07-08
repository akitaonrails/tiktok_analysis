package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0Qkw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C679440Qkw extends LinearLayout {
    public int LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final int LLILZIL;
    public InterfaceC669780QOy LLILZLL;
    public final int[] LLIZ;
    public final C01GW LLIZLLLIL;

    private final boolean getAbSwitch() {
        return ((Boolean) this.LLIZLLLIL.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00cc A[PHI: r2
      0x00cc: PHI (r2v6 int) = (r2v5 int), (r2v9 int) binds: [B:62:0x00f3, B:53:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3 A[PHI: r2
      0x00f3: PHI (r2v5 int) = (r2v2 int), (r2v2 int), (r2v9 int) binds: [B:48:0x00b9, B:50:0x00bf, B:53:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe A[PHI: r7
      0x00fe: PHI (r7v4 int) = (r7v1 int), (r7v1 int), (r7v8 int) binds: [B:40:0x00a1, B:42:0x00a7, B:45:0x00b2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0100  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean dispatchTouchEvent(android.view.MotionEvent r11) {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C679440Qkw.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public C679440Qkw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = -1;
        this.LLILZIL = ViewConfiguration.get(context).getScaledTouchSlop();
        this.LLIZ = new int[2];
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(644));
    }
}
