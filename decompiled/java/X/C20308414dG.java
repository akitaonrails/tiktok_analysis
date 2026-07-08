package X;

import Y.AgS212S0200000_30;
import java.lang.reflect.Type;
import kotlin.Unit;

/* JADX INFO: renamed from: X.14dG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public class C20308414dG implements InterfaceC346201Wa {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC346201Wa
    public final Object collect(InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        switch (this.$t) {
            case 0:
                return collect$0(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 1:
                return collect$1(this, interfaceC346701Wf, interfaceC1364105Vn);
            case 2:
                return collect$2(this, interfaceC346701Wf, interfaceC1364105Vn);
            default:
                return null;
        }
    }

    public C20308414dG(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }

    public static final Object collect$0(C20308414dG c20308414dG, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c20308414dG.l0).collect(new AgS212S0200000_30(interfaceC346701Wf, (Type) c20308414dG.l1, 0), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    public static final Object collect$1(C20308414dG c20308414dG, InterfaceC346701Wf interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objCollect = ((InterfaceC346201Wa) c20308414dG.l0).collect(new AgS212S0200000_30(interfaceC346701Wf, (Class) c20308414dG.l1, 1), interfaceC1364105Vn);
        if (objCollect == C099R.LJFF()) {
            return objCollect;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object collect$2(X.C20308414dG r7, X.InterfaceC346701Wf r8, X.InterfaceC1364105Vn r9) {
        /*
            boolean r0 = r9 instanceof X.C20099813ki
            if (r0 == 0) goto L22
            r6 = r9
            X.13ki r6 = (X.C20099813ki) r6
            int r2 = r6.LLILLJJLI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r6.LLILLJJLI = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L34
            if (r0 != r4) goto L2c
            Y.AgS212S0200000_30 r2 = r6.LLILZ
            goto L28
        L22:
            X.13ki r6 = new X.13ki
            r6.<init>(r7, r9)
            goto L12
        L28:
            X.C155000ia.LIZIZ(r1)     // Catch: X.C094L -> L52
            goto L58
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.C155000ia.LIZIZ(r1)
            java.lang.Object r3 = r7.l0
            X.01Wa r3 = (X.InterfaceC346201Wa) r3
            Y.AgS212S0200000_30 r2 = new Y.AgS212S0200000_30
            java.lang.Object r1 = r7.l1
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1
            r0 = 2
            r2.<init>(r1, r8, r0)
            r6.LLILZ = r2     // Catch: X.C094L -> L50
            r6.LLILLJJLI = r4     // Catch: X.C094L -> L50
            java.lang.Object r0 = r3.collect(r2, r6)     // Catch: X.C094L -> L50
            if (r0 != r5) goto L58
            return r5
        L50:
            r1 = move-exception
            goto L53
        L52:
            r1 = move-exception
        L53:
            X.01Wf<?> r0 = r1.owner
            if (r0 == r2) goto L58
            throw r1
        L58:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20308414dG.collect$2(X.14dG, X.01Wf, X.05Vn):java.lang.Object");
    }
}
