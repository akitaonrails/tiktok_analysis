package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05Vx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.startup.EditorProLoaderComponent$startLoad$1", f = "EditorProLoaderComponent.kt", l = {458, 459, 461, 463, 468}, m = "invokeSuspend")
public final class C1365105Vx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0ELA LLILLJJLI;
    public final /* synthetic */ C09AE LLILLL;
    public final /* synthetic */ C0ELH LLILZ;
    public final /* synthetic */ C0EL6 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1365105Vx(C0ELA c0ela, C0ELH c0elh, C0EL6 c0el6, InterfaceC1364105Vn interfaceC1364105Vn, C09AE c09ae) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ela;
        this.LLILLL = c09ae;
        this.LLILZ = c0elh;
        this.LLILZIL = c0el6;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1365105Vx(this.LLILLJJLI, this.LLILZ, this.LLILZIL, interfaceC1364105Vn, this.LLILLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0095  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "EditorProLoaderComponent@12f.startLoad$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r9.LL
            r5 = 0
            r3 = 5
            r6 = 4
            r7 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L26
            if (r0 == r1) goto L3b
            if (r0 == r2) goto L4e
            if (r0 == r7) goto L63
            if (r0 == r6) goto L7f
            if (r0 != r3) goto L99
            X.C155000ia.LIZIZ(r10)
        L20:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L26:
            X.C155000ia.LIZIZ(r10)
            X.0ELA r0 = r9.LLILLJJLI
            X.09AE r0 = r0.LLJJ
            if (r0 == 0) goto L3e
            r9.LL = r1
            java.lang.Object r0 = r0.LJJZ(r9)
            if (r0 != r4) goto L3e
            X.C1C7U.LIZIZ(r8)
            return r4
        L3b:
            X.C155000ia.LIZIZ(r10)
        L3e:
            X.09AE r0 = r9.LLILLL
            if (r0 == 0) goto L51
            r9.LL = r2
            java.lang.Object r0 = X.C23118094a.LIZLLL(r0, r9)
            if (r0 != r4) goto L51
            X.C1C7U.LIZIZ(r8)
            return r4
        L4e:
            X.C155000ia.LIZIZ(r10)
        L51:
            X.0ELA r2 = r9.LLILLJJLI
            X.0ELH r1 = r9.LLILZ
            X.0EL6 r0 = r9.LLILZIL
            r9.LL = r7
            java.lang.Object r10 = r2.c3(r1, r0, r9)
            if (r10 != r4) goto L66
            X.C1C7U.LIZIZ(r8)
            return r4
        L63:
            X.C155000ia.LIZIZ(r10)
        L66:
            X.0EHI r10 = (X.C0EHI) r10
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.05Vz r1 = new X.05Vz
            X.0ELA r0 = r9.LLILLJJLI
            r1.<init>(r10, r0, r5)
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r4) goto L82
            X.C1C7U.LIZIZ(r8)
            return r4
        L7f:
            X.C155000ia.LIZIZ(r10)
        L82:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.05Vy r1 = new X.05Vy
            X.0ELA r0 = r9.LLILLJJLI
            r1.<init>(r0, r5)
            r9.LL = r3
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r4) goto L20
            X.C1C7U.LIZIZ(r8)
            return r4
        L99:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1365105Vx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
