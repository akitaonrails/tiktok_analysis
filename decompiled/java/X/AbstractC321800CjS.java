package X;

import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS232S0000000_4;

/* JADX INFO: renamed from: X.0CjS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC321800CjS {
    public static final ConcurrentLinkedQueue<AbstractC321800CjS> LIZIZ;
    public static final ConcurrentLinkedQueue<AbstractC321800CjS> LIZJ;
    public static final C2232408os LIZLLL;
    public static final C2232408os LJ;
    public static volatile boolean LJFF;
    public final Function1<? super C321110CiL, Unit> LIZ;

    public AbstractC321800CjS() {
        this(AFwS232S0000000_4.get$arr$(4));
    }

    public abstract Object LIZ(C321820CjU c321820CjU);

    static {
        new C321780CjQ();
        LIZIZ = new ConcurrentLinkedQueue<>();
        LIZJ = new ConcurrentLinkedQueue<>();
        LIZLLL = new C2232408os(C807400Vlq.LIZ());
        LJ = new C2232408os(C786410Ut5.h4());
    }

    public AbstractC321800CjS(Function1<? super C321110CiL, Unit> function1) {
        this.LIZ = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof X.C321820CjU
            if (r0 == 0) goto L20
            r4 = r12
            X.0CjU r4 = (X.C321820CjU) r4
            int r2 = r4.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L20
            int r2 = r2 - r1
            r4.LLILLL = r2
        L12:
            java.lang.Object r3 = r4.LL
            java.lang.Object r2 = X.C099R.LJFF()
            int r1 = r4.LLILLL
            r0 = 1
            if (r1 == 0) goto L32
            if (r1 != r0) goto L2a
            goto L26
        L20:
            X.0CjU r4 = new X.0CjU
            r4.<init>(r11, r12)
            goto L12
        L26:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Exception -> L3e
            goto L62
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r3)
            r4.LLILLL = r0     // Catch: java.lang.Exception -> L3e
            java.lang.Object r0 = r11.LIZ(r4)     // Catch: java.lang.Exception -> L3e
            if (r0 != r2) goto L62
            return r2
        L3e:
            r8 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r8)
            kotlin.jvm.internal.AwS548S0100000_4 r1 = new kotlin.jvm.internal.AwS548S0100000_4
            r0 = 19
            r1.<init>(r8, r0)
            r0 = 0
            X.C320870Chx.LIZ(r1, r0)
            kotlin.jvm.functions.Function1<? super X.0CiL, kotlin.Unit> r0 = r11.LIZ
            X.0CiL r1 = new X.0CiL
            X.0Chi r2 = X.EnumC320720Chi.FAILED
            X.13BV r3 = X.C13BV.INSTANCE
            r4 = 0
            r6 = 1
            r9 = 0
            r10 = 172(0xac, float:2.41E-43)
            r5 = r4
            r7 = r4
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.invoke(r1)
        L62:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC321800CjS.LIZIZ(X.05Vn):java.lang.Object");
    }
}
