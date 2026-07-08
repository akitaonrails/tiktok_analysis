package X;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.0434, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0434 extends LinearLayout {
    public final LinkedList<C04E4> LL;
    public AnonymousClass0445 LLILLJJLI;
    public int LLILLL;
    public CharSequence LLILZ;
    public boolean LLILZIL;

    public final boolean getEnableButtonVibration() {
        return this.LLILZIL;
    }

    public final void setEnableButtonVibration(boolean z) {
        this.LLILZIL = z;
    }

    public final void setPdpBottomButtonListener(AnonymousClass0445 anonymousClass0445) {
        this.LLILLJJLI = anonymousClass0445;
    }

    public AnonymousClass0434(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setOrientation(0);
        setPadding(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
        setBaselineAligned(false);
        this.LL = new LinkedList<>();
        this.LLILLL = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(java.lang.Boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0434.LIZ(java.lang.Boolean, java.util.List):void");
    }
}
