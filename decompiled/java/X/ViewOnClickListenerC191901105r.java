package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.105r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC191901105r extends C19292910dr implements View.OnClickListener {
    public final BasePage LLILZIL;
    public final C11NJ LLILZLL;
    public final C01GW LLIZ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x003b  */
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
            if (r0 == 0) goto L3b
            boolean r0 = r0.LL
            r2 = 1
            if (r0 != r2) goto L3b
        Le:
            r4 = r15
            X.01GW r0 = r4.LLIZ
            java.lang.Object r1 = r0.getValue()
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131849485(0x7f11710d, float:1.9332505E38)
            java.lang.String r3 = r1.getString(r0)
            X.01GW r0 = r4.LLIZ
            java.lang.Object r0 = r0.getValue()
            android.content.Context r0 = (android.content.Context) r0
            java.lang.CharSequence r13 = X.C1070520dxq.LJ(r0)
            X.10iC r1 = new X.10iC
            r5 = 0
            r6 = 0
            r14 = 98232(0x17fb8, float:1.37652E-40)
            r7 = r4
            r8 = r6
            r9 = r6
            r10 = r5
            r11 = r5
            r12 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return r1
        L3b:
            r2 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC191901105r.LIZLLL():X.10iC");
    }

    @Override // X.AbstractC19318610i0, X.InterfaceC19318710i1
    public final void onViewDetachedFromWindow() {
        this.LLILZLL.LJ();
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public ViewOnClickListenerC191901105r(BasePage basePage) {
        super(null);
        this.LLILZIL = basePage;
        this.LLILZLL = new C11NJ();
        this.LLIZ = C452501pT.LIZIZ(new AwS572S0100000_28(this, 741));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LLILZLL.LJ();
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) this.LLIZ.getValue();
        BasePage basePage = this.LLILZIL;
        boolean z = LIZIZ().LLJJIJIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIJI(context, basePage, z);
    }
}
