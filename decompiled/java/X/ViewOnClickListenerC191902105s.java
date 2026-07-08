package X;

import android.content.Context;
import android.view.View;
import com.ss.android.ugc.aweme.setting.page.BasePage;
import kotlin.jvm.internal.AwS40S0010000_28;
import kotlin.jvm.internal.AwS572S0100000_28;

/* JADX INFO: renamed from: X.105s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class ViewOnClickListenerC191902105s extends C19292910dr implements View.OnClickListener {
    public final BasePage LLILZIL;
    public final C01GW LLILZLL;
    public final C11NJ LLIZ;

    /* JADX WARN: Removed duplicated region for block: B:8:0x003e  */
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
            if (r0 == 0) goto L3e
            boolean r0 = r0.LLILLJJLI
            r2 = 1
            if (r0 != r2) goto L3e
        Le:
            r4 = r15
            X.01GW r0 = r4.LLILZLL
            java.lang.Object r1 = r0.getValue()
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131847808(0x7f116a80, float:1.9329104E38)
            java.lang.String r3 = r1.getString(r0)
            X.01GW r0 = r4.LLILZLL
            java.lang.Object r1 = r0.getValue()
            android.content.Context r1 = (android.content.Context) r1
            r0 = 2131849338(0x7f11707a, float:1.9332207E38)
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
        L3e:
            r2 = 0
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnClickListenerC191902105s.LIZLLL():X.10iC");
    }

    @Override // X.AbstractC19318610i0, X.InterfaceC19318710i1
    public final void onViewDetachedFromWindow() {
        this.LLIZ.LJ();
    }

    @Override // X.C19292910dr, X.AbstractC19318610i0
    public final /* bridge */ /* synthetic */ AbstractC19293010ds LIZLLL() {
        return LIZLLL();
    }

    public ViewOnClickListenerC191902105s(BasePage basePage) {
        super(null);
        this.LLILZIL = basePage;
        this.LLILZLL = C452501pT.LIZIZ(new AwS572S0100000_28(this, 740));
        this.LLIZ = new C11NJ();
    }

    @Override // X.AbstractC19318610i0
    public final void LJFF(boolean z) {
        LJI(new AwS40S0010000_28(z, 19));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.LLIZ.LJ();
        C1070520dxq c1070520dxq = C1070520dxq.LIZ;
        Context context = (Context) this.LLILZLL.getValue();
        BasePage basePage = this.LLILZIL;
        boolean z = LIZIZ().LLJJIJIL;
        c1070520dxq.getClass();
        C1070520dxq.LJIJJ(context, basePage, z);
    }
}
