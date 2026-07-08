package X;

import com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lZX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel$refresh$1", f = "SharePanelViewModel.kt", l = {326, 338}, m = "invokeSuspend")
public final class C1362970lZX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1364850lcZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ SharePanelViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1362970lZX(SharePanelViewModel sharePanelViewModel, InterfaceC1364105Vn<? super C1362970lZX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = sharePanelViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1362970lZX(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r7 = "SharePanelViewModel@b2e1.refresh$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r14.LLILLJJLI
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 == r2) goto L88
            if (r0 != r6) goto Lbd
            X.C155000ia.LIZIZ(r15)
        L16:
            java.util.Collection r15 = (java.util.Collection) r15
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r14.LLILLL
            X.0lbv r1 = r0.LLJILLL
            X.0lbv r0 = X.EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL
            if (r1 == r0) goto L2f
            X.0lfl r2 = X.C1366830lfl.LL
            X.0lbv r0 = X.EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL
            int r1 = r0.getValue()
            r2.getClass()
            r0 = 0
            X.C1366830lfl.LJIILLIIL(r0, r1, r0)
        L2f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r15)
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r1 = r14.LLILLL
            r0 = 0
            r1.r61(r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L40:
            X.C155000ia.LIZIZ(r15)
            X.0laq r5 = X.C1363780laq.LIZ
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r14.LLILLL
            long r3 = r0.LLL
            r5.getClass()
            X.C1363780laq.LIZ(r3)
            boolean r0 = X.C15504065e.LIZ()
            if (r0 == 0) goto La8
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r14.LLILLL
            com.ss.android.ugc.aweme.sharer.model.SharePackage r0 = r0.LL
            kotlin.Pair r0 = X.C1364700lcK.LIZ(r0)
            java.lang.Object r10 = r0.getFirst()
            X.0li4 r10 = (X.C1368260li4) r10
            java.lang.Object r11 = r0.getSecond()
            X.0lcZ r11 = (X.C1364850lcZ) r11
            X.0leP r8 = X.C1365990leP.LIZ
            java.lang.String r9 = r11.LIZ
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r14.LLILLL
            X.0lbv r0 = r0.LLJILLL
            if (r0 != 0) goto L75
            X.0lbv r0 = X.EnumC1364450lbv.SOURCE_ACTION_UNKNOWN
        L75:
            int r12 = r0.getValue()
            r13 = 0
            r14.LL = r11
            r14.LLILLJJLI = r2
            java.lang.Object r15 = r8.LIZIZ(r9, r10, r11, r12, r13, r14)
            if (r15 != r1) goto L8d
            X.C1C7U.LIZIZ(r7)
            return r1
        L88:
            X.0lcZ r11 = r14.LL
            X.C155000ia.LIZIZ(r15)
        L8d:
            java.util.Collection r15 = (java.util.Collection) r15
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r14.LLILLL
            X.0lbv r1 = r0.LLJILLL
            X.0lbv r0 = X.EnumC1364450lbv.SOURCE_ACTION_MINIS_PANEL
            if (r1 == r0) goto L2f
            X.0leP r0 = X.C1365990leP.LIZ
            java.lang.String r2 = r11.LIZ
            X.0lbv r0 = X.EnumC1364450lbv.SOURCE_ACTION_OPEN_PANEL
            int r1 = r0.getValue()
            X.0leP r0 = X.C1365990leP.LIZ
            r0 = 0
            X.C1365990leP.LIZJ(r1, r0, r2, r0)
            goto L2f
        La8:
            X.0lfl r10 = X.C1366830lfl.LL
            r11 = 0
            com.ss.android.ugc.aweme.internalshare.impl.viewmodel.SharePanelViewModel r0 = r14.LLILLL
            X.0lbv r12 = r0.LLJILLL
            r15 = 5
            r14.LLILLJJLI = r6
            r13 = r11
            java.lang.Object r15 = X.C1366830lfl.LJIILL(r10, r11, r12, r13, r14, r15)
            if (r15 != r1) goto L16
            X.C1C7U.LIZIZ(r7)
            return r1
        Lbd:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1362970lZX.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
