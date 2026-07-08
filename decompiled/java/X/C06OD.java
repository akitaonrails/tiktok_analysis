package X;

import X.C06OO;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.06OD, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C06OD<T extends C06OO> implements AnonymousClass0684<T> {
    public final EnumC1596306Mv LL;
    public final Set<EnumC1596306Mv> LLILLJJLI;

    public abstract void LIZLLL();

    public void LJ(T t) {
    }

    public abstract Object LJI(C06OO c06oo);

    public abstract Object LJII(T t, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn);

    public void LJIIIIZZ() {
    }

    @Override // X.InterfaceC1599706Od
    public void pause() {
    }

    @Override // X.InterfaceC1599706Od
    public void resume() {
    }

    public C06OD(EnumC1596306Mv enumC1596306Mv) {
        this.LL = enumC1596306Mv;
        this.LLILLJJLI = Collections.singleton(enumC1596306Mv);
    }

    @Override // X.AnonymousClass0684
    public final boolean LIZ(List<? extends C869590Y9l> list, EnumC1596306Mv enumC1596306Mv) {
        return enumC1596306Mv.getDismissedByActions().LIZIZ;
    }

    @Override // X.AnonymousClass0684
    public final boolean LIZJ(C869590Y9l c869590Y9l, EnumC1596306Mv enumC1596306Mv) {
        return enumC1596306Mv.getDismissedByActions().LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.06MF, X.06OF] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(T r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C06OE
            if (r0 == 0) goto L70
            r6 = r9
            X.06OE r6 = (X.C06OE) r6
            int r2 = r6.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r6.LLILZ = r2
        L12:
            java.lang.Object r5 = r6.LLILLJJLI
            java.lang.Object r4 = X.C099R.LJFF()
            int r2 = r6.LLILZ
            r0 = 2
            r1 = 1
            if (r2 == 0) goto L28
            if (r2 == r1) goto L34
            if (r2 != r0) goto L76
            X.C155000ia.LIZIZ(r5)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r5)
            r6.LLILZ = r1
            java.lang.Object r5 = r7.LJI(r8)
            if (r5 != r4) goto L37
            return r4
        L34:
            X.C155000ia.LIZIZ(r5)
        L37:
            X.06OA r5 = (X.C06OA) r5
            if (r5 != 0) goto L3e
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L3e:
            r6.LL = r5
            r6.LLILZ = r0
            X.1DEt r3 = new X.1DEt
            X.05Vn r0 = X.C099M.LIZLLL(r6)
            r3.<init>(r1, r0)
            r3.LJIJJ()
            X.06OF r2 = new X.06OF
            r2.<init>()
            r5.l(r2)
            kotlin.jvm.internal.AwS368S0200000_2 r1 = new kotlin.jvm.internal.AwS368S0200000_2
            r0 = 161(0xa1, float:2.26E-43)
            r1.<init>(r5, r2, r0)
            r3.LJJII(r1)
            java.lang.Object r1 = r3.LJIJ()
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 != r0) goto L6d
            X.C099Q.LIZJ(r6)
        L6d:
            if (r1 != r4) goto L25
            return r4
        L70:
            X.06OE r6 = new X.06OE
            r6.<init>(r7, r9)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06OD.LJFF(X.06OO, X.05Vn):java.lang.Object");
    }
}
