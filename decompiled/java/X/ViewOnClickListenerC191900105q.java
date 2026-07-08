package X;

import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;

/* JADX INFO: renamed from: X.105q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC191900105q extends C19292910dr implements View.OnClickListener {
    public final BasePage LLILZIL;
    public final C11NJ LLILZLL;

    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    @Override // X.C19292910dr
    /* JADX INFO: renamed from: LJII */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C19319810iC LIZLLL() {
        /*
            r15 = this;
            X.0dxq r0 = X.C1070520dxq.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.setting.unit.privacy.FindCtxViewModel r0 = X.C1070520dxq.LIZJ
            if (r0 == 0) goto L32
            boolean r0 = r0.LLILLL
            r2 = 1
            if (r0 != r2) goto L32
        Le:
            r4 = r15
            com.ss.android.ugc.aweme.setting.page.BasePage r1 = r4.LLILZIL
            r0 = 2131837428(0x7f1141f4, float:1.930805E38)
            java.lang.String r3 = r1.getString(r0)
            com.ss.android.ugc.aweme.setting.page.BasePage r1 = r4.LLILZIL
            r0 = 2131837427(0x7f1141f3, float:1.9308049E38)
            java.lang.String r9 = r1.getString(r0)
            X.10iC r1 = new X.10iC
            r5 = 0
            r6 = 0
            r14 = 129976(0x1fbb8, float:1.82135E-40)
            r7 = r4
            r8 = r6
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r6
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L32:
            r2 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC191900105q.LIZLLL():X.10iC");
    }

    @Override // X.AbstractC19318610i0, X.InterfaceC19318710i1
    public final void onViewDetachedFromWindow() {
        this.LLILZLL.LJ();
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public ViewOnClickListenerC191900105q(BasePage basePage) {
        super(null);
        this.LLILZIL = basePage;
        this.LLILZLL = new C11NJ();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LLILZLL.LJ();
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        C19EG c19egRequireActivity = this.LLILZIL.requireActivity();
        BasePage basePage = this.LLILZIL;
        boolean z = LIZIZ().LLJJIJIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIJJLI(c19egRequireActivity, basePage, z);
    }
}
