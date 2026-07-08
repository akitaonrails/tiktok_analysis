package X;

import com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05DR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet$onViewCreated$6", f = "ShareToUserSheet.kt", l = {220, 221}, m = "invokeSuspend")
public final class C05DR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ShareToUserSheet LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05DR(ShareToUserSheet shareToUserSheet, InterfaceC1364105Vn<? super C05DR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = shareToUserSheet;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05DR(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "ShareToUserSheet@b46a.onViewCreated$6"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r4 = 0
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L1d
            if (r0 == r1) goto L34
            if (r0 != r3) goto L50
            X.C155000ia.LIZIZ(r8)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet r0 = r7.LLILLJJLI
            X.099G r0 = r0.LLJILLL
            if (r0 == 0) goto L32
            r7.LL = r1
            java.lang.Object r8 = r0.LJLIIIL(r7)
            if (r8 != r5) goto L37
            X.C1C7U.LIZIZ(r6)
            return r5
        L32:
            r8 = r4
            goto L39
        L34:
            X.C155000ia.LIZIZ(r8)
        L37:
            android.view.View r8 = (android.view.View) r8
        L39:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.05DQ r1 = new X.05DQ
            com.ss.android.ugc.aweme.internalshare.impl.sharetouser.ShareToUserSheet r0 = r7.LLILLJJLI
            r1.<init>(r8, r0, r4)
            r7.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r7, r2, r1)
            if (r0 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        L50:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05DR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
