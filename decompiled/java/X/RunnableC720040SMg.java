package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.IntRange;

/* JADX INFO: renamed from: X.0SMg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC720040SMg implements Runnable {
    public final /* synthetic */ C1846520y9S LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ Aweme LLILZ;
    public final /* synthetic */ EnumC1334360kpO LLILZIL;
    public final /* synthetic */ Function1<InterfaceC469401sC, Unit> LLILZLL;

    public RunnableC720040SMg(Context context, EnumC1334360kpO enumC1334360kpO, Aweme aweme, String str, Function1 function1, IntRange intRange) {
        this.LL = intRange;
        this.LLILLJJLI = str;
        this.LLILLL = context;
        this.LLILZ = aweme;
        this.LLILZIL = enumC1334360kpO;
        this.LLILZLL = function1;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003d A[Catch: all -> 0x0015, LOOP:0: B:16:0x0026->B:18:0x003d, LOOP_END, TRY_LEAVE, TryCatch #0 {all -> 0x0015, blocks: (B:3:0x0005, B:16:0x0026, B:18:0x003d), top: B:19:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0022 A[EDGE_INSN: B:21:0x0022->B:14:0x0022 BREAK  A[LOOP:0: B:16:0x0026->B:18:0x003d], SYNTHETIC] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r13 = this;
            java.lang.String r3 = "BasePreloadHelper@3407.preload$1"
            X.C1C7U.LIZ(r3)
            X.0y9S r0 = r13.LL     // Catch: java.lang.Throwable -> L15
            int r7 = r0.LL     // Catch: java.lang.Throwable -> L15
            int r2 = r0.LLILLJJLI     // Catch: java.lang.Throwable -> L15
            int r1 = r0.LLILLL     // Catch: java.lang.Throwable -> L15
            if (r1 <= 0) goto L10
            goto L20
        L10:
            if (r1 >= 0) goto L22
            if (r2 > r7) goto L22
            goto L26
        L15:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            boolean r0 = X.C2179971ATj.LIZ(r1)
            if (r0 != 0) goto L22
            throw r1
        L20:
            if (r7 <= r2) goto L26
        L22:
            X.C1C7U.LIZIZ(r3)
            return
        L26:
            X.0SMT r0 = X.C0SMT.LIZ     // Catch: java.lang.Throwable -> L15
            java.lang.String r4 = r13.LLILLJJLI     // Catch: java.lang.Throwable -> L15
            android.content.Context r5 = r13.LLILLL     // Catch: java.lang.Throwable -> L15
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r13.LLILZ     // Catch: java.lang.Throwable -> L15
            X.0kpO r8 = r13.LLILZIL     // Catch: java.lang.Throwable -> L15
            kotlin.jvm.functions.Function1<X.01sC, kotlin.Unit> r9 = r13.LLILZLL     // Catch: java.lang.Throwable -> L15
            r10 = 0
            r11 = 0
            r0.getClass()     // Catch: java.lang.Throwable -> L15
            r12 = r11
            X.C0SMT.LIZ(r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L15
            if (r7 == r2) goto L22
            int r7 = r7 + r1
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC720040SMg.run():void");
    }
}
