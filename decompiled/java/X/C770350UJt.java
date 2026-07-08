package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UJt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.modecontainer.VideoModeContainer$1$2", f = "VideoModeContainer.kt", l = {486, 490}, m = "invokeSuspend")
public final class C770350UJt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C770200UJe LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C770350UJt(C770200UJe c770200UJe, InterfaceC1364105Vn<? super C770350UJt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c770200UJe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C770350UJt(this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "VideoModeContainer@8970.<init>$1$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r7.LL
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L1c
            if (r0 == r1) goto L33
            if (r0 != r5) goto L5a
            X.C155000ia.LIZIZ(r8)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r8)
            X.0UJe r0 = r7.LLILLJJLI
            boolean r0 = r0.LLLZL
            if (r0 == 0) goto L3b
            r7.LL = r1
            r0 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r4) goto L36
            X.C1C7U.LIZIZ(r6)
            return r4
        L33:
            X.C155000ia.LIZIZ(r8)
        L36:
            X.0UJe r1 = r7.LLILLJJLI
            r0 = 0
            r1.LLLZL = r0
        L3b:
            java.lang.String r1 = "VideoModeContainer"
            java.lang.String r0 = "all_banner_container try visible2"
            X.C20441214yg.LIZIZ(r1, r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.0UJu r2 = new X.0UJu
            X.0UJe r1 = r7.LLILLJJLI
            r0 = 0
            r2.<init>(r1, r0)
            r7.LL = r5
            java.lang.Object r0 = X.C23250099c.LJI(r7, r3, r2)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r6)
            return r4
        L5a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C770350UJt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
