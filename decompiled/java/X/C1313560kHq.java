package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0kHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1313560kHq extends C1313680kI2 {
    public boolean LLILZ;
    public ArrayList<C1313550kHp> LLILZIL;
    public C1313620kHw LLILZLL;
    public final WeakReference<C1313490kHj> LLIZ;

    @Override // X.C1313680kI2, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    @Override // X.C1313680kI2, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dispatchDraw(android.graphics.Canvas r16) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1313560kHq.dispatchDraw(android.graphics.Canvas):void");
    }

    public C1313560kHq(C1313490kHj c1313490kHj, AbstractC1317090kNX abstractC1317090kNX) {
        super(abstractC1317090kNX);
        this.LLIZ = new WeakReference<>(c1313490kHj);
        setWillNotDraw(false);
    }
}
