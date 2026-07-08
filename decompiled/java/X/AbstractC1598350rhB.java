package X;

import X.InterfaceC1891350zJl;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0rhB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1598350rhB<T extends InterfaceC1891350zJl> {
    public final InterfaceC1598020rge LIZ;
    public List<T> LIZIZ = new ArrayList();
    public final ConcurrentHashMap<Integer, List<T>> LIZJ = new ConcurrentHashMap<>();

    public void LIZ(C1598410rhH c1598410rhH, List<InterfaceC1891350zJl> list) {
    }

    public abstract Unit LIZIZ();

    public abstract Object LIZJ(EnumC1155010gA7 enumC1155010gA7, InterfaceC1364105Vn<? super AbstractC1598350rhB<T>> interfaceC1364105Vn);

    public abstract Object LIZLLL(InterfaceC1364105Vn interfaceC1364105Vn);

    public abstract Object LJ(EnumC1155010gA7 enumC1155010gA7);

    public AbstractC1598350rhB(InterfaceC1598020rge interfaceC1598020rge) {
        this.LIZ = interfaceC1598020rge;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.EnumC1155010gA7 r9, X.InterfaceC1364105Vn<? super kotlin.Unit> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C1598390rhF
            if (r0 == 0) goto L70
            r7 = r10
            X.0rhF r7 = (X.C1598390rhF) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L70
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r6 = r7.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r4 = r7.LLILZ
            r3 = 4
            r2 = 3
            r1 = 2
            r0 = 1
            if (r4 == 0) goto L2e
            if (r4 == r0) goto L3c
            if (r4 == r1) goto L4e
            if (r4 == r2) goto L5f
            if (r4 != r3) goto L76
            X.C155000ia.LIZIZ(r6)
        L2b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2e:
            X.C155000ia.LIZIZ(r6)
            r7.LL = r9
            r7.LLILZ = r0
            java.lang.Object r6 = r8.LIZJ(r9, r7)
            if (r6 != r5) goto L41
            return r5
        L3c:
            X.0gA7 r9 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L41:
            X.0rhB r6 = (X.AbstractC1598350rhB) r6
            r7.LL = r9
            r7.LLILZ = r1
            java.lang.Object r6 = r6.LIZLLL(r7)
            if (r6 != r5) goto L53
            return r5
        L4e:
            X.0gA7 r9 = r7.LL
            X.C155000ia.LIZIZ(r6)
        L53:
            X.0rhB r6 = (X.AbstractC1598350rhB) r6
            r7.LL = r9
            r7.LLILZ = r2
            r6.LJ(r9)
            if (r6 != r5) goto L62
            return r5
        L5f:
            X.C155000ia.LIZIZ(r6)
        L62:
            X.0rhB r6 = (X.AbstractC1598350rhB) r6
            r0 = 0
            r7.LL = r0
            r7.LLILZ = r3
            kotlin.Unit r0 = r6.LIZIZ()
            if (r0 != r5) goto L2b
            return r5
        L70:
            X.0rhF r7 = new X.0rhF
            r7.<init>(r8, r10)
            goto L12
        L76:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1598350rhB.LJFF(X.0gA7, X.05Vn):java.lang.Object");
    }
}
