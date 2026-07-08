package X;

import com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0sAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1616700sAm extends C09AY implements Function2<InterfaceC1680500tpg, Integer, Unit> {
    public final /* synthetic */ PurchasePanelFragment LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616700sAm(PurchasePanelFragment purchasePanelFragment, String str) {
        super(2);
        this.LL = purchasePanelFragment;
        this.LLILLJJLI = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004f  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlin.Unit invoke(X.InterfaceC1680500tpg r9, java.lang.Integer r10) {
        /*
            r8 = this;
            r6 = r9
            X.0tpg r6 = (X.InterfaceC1680500tpg) r6
            java.lang.Number r10 = (java.lang.Number) r10
            int r0 = r10.intValue()
            r1 = r0 & 3
            r0 = 2
            if (r1 != r0) goto L1a
            boolean r0 = r6.LIZ()
            if (r0 == 0) goto L1a
            r6.LIZJ()
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L1a:
            com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment r0 = r8.LL
            androidx.fragment.app.FragmentManager r2 = r0.getChildFragmentManager()
            java.lang.String r3 = r8.LLILLJJLI
            com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment r0 = r8.LL
            androidx.lifecycle.ViewModelLazy r0 = r0.LLILLL
            java.lang.Object r4 = r0.getValue()
            com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel r4 = (com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel) r4
            com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment r0 = r8.LL
            androidx.lifecycle.ViewModelLazy r0 = r0.LLILLL
            java.lang.Object r1 = r0.getValue()
            com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel r1 = (com.ss.android.ugc.aweme.purchasepanel.viewmodel.PurchasePanelViewModel) r1
            r0 = 5004770(0x4c5de2, float:7.013177E-39)
            r6.LJJIIJZLJL(r0)
            boolean r0 = r6.LJII(r1)
            java.lang.Object r5 = r6.LJJ()
            if (r0 != 0) goto L4f
            X.0tph r0 = X.InterfaceC1680500tpg.LIZ
            r0.getClass()
            X.0tpi r0 = X.C1680510tph.LIZIZ
            if (r5 != r0) goto L57
        L4f:
            X.0s6s r5 = new X.0s6s
            r5.<init>(r1)
            r6.LJJIJIIJI(r5)
        L57:
            X.1BqZ r5 = (X.InterfaceC2217451BqZ) r5
            r6.LJ()
            kotlin.jvm.functions.Function1 r5 = (kotlin.jvm.functions.Function1) r5
            r7 = 0
            X.C1667940tVQ.LIZ(r2, r3, r4, r5, r6, r7)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1616700sAm.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
