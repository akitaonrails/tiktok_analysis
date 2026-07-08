package X;

import defpackage.w2;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0Cjb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC321890Cjb {
    public static final ConcurrentLinkedQueue<AbstractC321890Cjb> LIZIZ;
    public static final ConcurrentLinkedQueue<AbstractC321890Cjb> LIZJ;
    public static final C2232408os LIZLLL;
    public static final C2232408os LJ;
    public static volatile boolean LJFF;
    public final Function1<? super w2, Unit> LIZ;

    public abstract Object LIZ(C321880Cja c321880Cja);

    static {
        new C321910Cjd();
        LIZIZ = new ConcurrentLinkedQueue<>();
        LIZJ = new ConcurrentLinkedQueue<>();
        LIZLLL = new C2232408os(C807400Vlq.LIZ());
        LJ = new C2232408os(C786410Ut5.h4());
    }

    public AbstractC321890Cjb() {
        this(AFwS232S0000000_4.get$arr$(266));
    }

    public AbstractC321890Cjb(Function1<? super w2, Unit> function1) {
        this.LIZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            r17 = this;
            r0 = 72068(0x11984, float:1.00989E-40)
            boolean r5 = com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJI(r0)
            r3 = r18
            boolean r0 = r3 instanceof X.C321880Cja
            r6 = r17
            if (r0 == 0) goto L37
            r4 = r3
            X.0Cja r4 = (X.C321880Cja) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L37
            int r2 = r2 - r1
            r4.LLILLL = r2
        L1d:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L41
            if (r1 == r0) goto L3d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            if (r5 == 0) goto L36
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L36:
            throw r1
        L37:
            X.0Cja r4 = new X.0Cja
            r4.<init>(r6, r3)
            goto L1d
        L3d:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L52
            goto L79
        L41:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L52
            java.lang.Object r0 = r6.LIZ(r4)     // Catch: java.lang.Exception -> L52
            if (r0 != r2) goto L79
            if (r5 == 0) goto L51
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L51:
            return r2
        L52:
            r13 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r13)
            java.lang.String r0 = X.C1863280yaU.LJIILLIIL
            kotlin.jvm.internal.AwS548S0100000_4 r1 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 543(0x21f, float:7.61E-43)
            r1.<init>(r13, r0)
            r0 = 0
            X.C1870240yli.LIZ(r1, r0)
            kotlin.jvm.functions.Function1<? super w2, kotlin.Unit> r0 = r6.LIZ
            w2 r6 = new w2
            w2$a r7 = w2.a.FAILED
            X.13BV r8 = X.C13BV.INSTANCE
            r9 = 0
            r11 = 1
            r14 = 0
            r16 = 428(0x1ac, float:6.0E-43)
            r10 = r9
            r12 = r9
            r15 = r14
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0.invoke(r6)
        L79:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            if (r5 == 0) goto L80
            com.bytedance.pumbaa.utility.method_id.MethodIDManager.LJ()
        L80:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC321890Cjb.LIZIZ(X.05Vn):java.lang.Object");
    }
}
