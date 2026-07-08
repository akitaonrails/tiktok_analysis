package X;

import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xNJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView$observeCurrentBoardData$1", f = "BoardsDisplayView.kt", l = {828}, m = "invokeSuspend")
public final class C1816670xNJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BoardsDisplayView LL;
    public AnonymousClass0954 LLILLJJLI;
    public InterfaceC824740WWy LLILLL;
    public int LLILZ;
    public final /* synthetic */ BoardsDisplayView LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1816670xNJ(BoardsDisplayView boardsDisplayView, InterfaceC1364105Vn<? super C1816670xNJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = boardsDisplayView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1816670xNJ(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062 A[Catch: all -> 0x0070, TRY_LEAVE, TryCatch #0 {all -> 0x0070, blocks: (B:16:0x005a, B:18:0x0062), top: B:37:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0057 -> B:37:0x005a). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "BoardsDisplayView@e00c.observeCurrentBoardData$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LLILZ
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L23
            if (r0 != r5) goto L1b
            X.0WWy r1 = r8.LLILLL
            X.0954 r3 = r8.LLILLJJLI
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView r2 = r8.LL
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L72
            goto L5a
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L23:
            X.C155000ia.LIZIZ(r9)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView r0 = r8.LLILZIL
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayViewModel r0 = r0.getViewModel()
            X.05YD<X.0uMb> r3 = r0.LLILZ
            if (r3 == 0) goto L88
            X.099x r2 = X.C23271099x.INSTANCE
            X.09rI r1 = new X.09rI
            r0 = 1
            r1.<init>(r2, r3, r0)
            X.11Kf r0 = X.C11NZ.LJIJJLI(r1)
            com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.BoardsDisplayView r2 = r8.LLILZIL
            X.1DEI r3 = new X.1DEI
            r3.<init>()
            r0.LIZIZ(r3)
            X.1DEL r1 = new X.1DEL     // Catch: java.lang.Throwable -> L72
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L72
        L4b:
            r8.LL = r2     // Catch: java.lang.Throwable -> L72
            r8.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L72
            r8.LLILLL = r1     // Catch: java.lang.Throwable -> L72
            r8.LLILZ = r5     // Catch: java.lang.Throwable -> L72
            java.lang.Object r9 = r1.LIZ(r8)     // Catch: java.lang.Throwable -> L72
            if (r9 != r6) goto L5a
            goto L6c
        L5a:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L70
            boolean r0 = r9.booleanValue()     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L85
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L70
            X.0uMb r0 = (X.AbstractC1700910uMb) r0     // Catch: java.lang.Throwable -> L70
            r2.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L70
            goto L4b
        L6c:
            X.C1C7U.LIZIZ(r7)
            return r6
        L70:
            r1 = move-exception
            goto L73
        L72:
            r1 = move-exception
        L73:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7a
            throw r1     // Catch: java.lang.Throwable -> L77
        L77:
            r0 = move-exception
            r4 = r1
            goto L7b
        L7a:
            r0 = move-exception
        L7b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r0 = move-exception
            goto L7b
        L81:
            X.C094C.LIZ(r3, r4)
            throw r0
        L85:
            X.C094C.LIZ(r3, r4)
        L88:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1816670xNJ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
