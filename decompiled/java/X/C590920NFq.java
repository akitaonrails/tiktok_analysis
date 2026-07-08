package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0NFq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.profilerec.ui.ProfileRecFragment$onStart$1", f = "ProfileRecFragment.kt", l = {100, 101, 108, 109}, m = "invokeSuspend")
public final class C590920NFq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public int LLILLJJLI;

    public C590920NFq(InterfaceC1364105Vn<? super C590920NFq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C590920NFq(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004d -> B:22:0x0058). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "ProfileRecFragment@2b20.onStart$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r10.LLILLJJLI
            r3 = 0
            r8 = 3
            r7 = 2
            r2 = 4
            r6 = 1
            if (r0 == 0) goto L23
            if (r0 == r6) goto L37
            if (r0 == r7) goto L53
            if (r0 == r8) goto L6a
            if (r0 != r2) goto L82
            X.C155000ia.LIZIZ(r11)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L23:
            X.C155000ia.LIZIZ(r11)
            r5 = 0
        L27:
            r10.LL = r5
            r10.LLILLJJLI = r6
            r0 = 50
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r4) goto L3c
            X.C1C7U.LIZIZ(r9)
            return r4
        L37:
            int r5 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L3c:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0NFp r0 = new X.0NFp
            r0.<init>(r3)
            r10.LL = r5
            r10.LLILLJJLI = r7
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r4) goto L58
            X.C1C7U.LIZIZ(r9)
            return r4
        L53:
            int r5 = r10.LL
            X.C155000ia.LIZIZ(r11)
        L58:
            int r5 = r5 + 1
            if (r5 < r2) goto L27
            r10.LLILLJJLI = r8
            r0 = 200(0xc8, double:9.9E-322)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r10)
            if (r0 != r4) goto L6d
            X.C1C7U.LIZIZ(r9)
            return r4
        L6a:
            X.C155000ia.LIZIZ(r11)
        L6d:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0NFr r0 = new X.0NFr
            r0.<init>(r3)
            r10.LLILLJJLI = r2
            java.lang.Object r0 = X.C23250099c.LJI(r10, r1, r0)
            if (r0 != r4) goto L1d
            X.C1C7U.LIZIZ(r9)
            return r4
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C590920NFq.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C590920NFq(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
