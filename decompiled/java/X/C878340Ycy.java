package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ycy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$solvePreloadResult$1", f = "ChatListConversationDataSource.kt", l = {431}, m = "invokeSuspend")
public final class C878340Ycy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Y6X LLILLJJLI;
    public final /* synthetic */ C878460YdA LLILLL;
    public final /* synthetic */ C878470YdB LLILZ;
    public final /* synthetic */ C0Y6P LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878340Ycy(C0Y6P c0y6p, C0Y6X c0y6x, C878460YdA c878460YdA, C878470YdB c878470YdB, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0y6x;
        this.LLILLL = c878460YdA;
        this.LLILZ = c878470YdB;
        this.LLILZIL = c0y6p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C878340Ycy(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0070  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "ChatListConversationDataSource@6f28.solvePreloadResult$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 1
            if (r0 == 0) goto L19
            if (r0 != r5) goto L8d
            X.C155000ia.LIZIZ(r9)
        L13:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L19:
            X.C155000ia.LIZIZ(r9)
            X.0Y6X r0 = r8.LLILLJJLI
            X.0Y8h r0 = r0.LIZ
            java.lang.String r1 = r0.LIZ
            java.lang.String r0 = "preload_light"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L70
            X.0Yi4 r0 = X.AbstractC883730Ylf.LJIIIIZZ
            r0.getClass()
            boolean r0 = X.C881500Yi4.LJII()
            if (r0 != 0) goto L70
            r3 = 1
        L36:
            X.0YdA r6 = r8.LLILLL
            boolean r0 = r6.LJIIIZ
            if (r0 != 0) goto L72
            if (r3 != 0) goto L72
            java.util.concurrent.ConcurrentHashMap<X.0Ye3, java.lang.Runnable> r5 = r6.LJII
            X.0YdB r4 = r8.LLILZ
            X.0Ydx r3 = r4.LIZ
            X.0Ycx r2 = new X.0Ycx
            X.0Y6X r1 = r8.LLILLJJLI
            X.0Y6P r0 = r8.LLILZIL
            r2.<init>()
            r5.put(r3, r2)
            X.01GW r0 = X.C285090BFj.LJJLJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            java.lang.Long r4 = X.C2286608xc.LJFF(r0)
            Y.ARunnableS83S0200000_14 r3 = new Y.ARunnableS83S0200000_14
            X.0YdA r2 = r8.LLILLL
            X.0YdB r1 = r8.LLILZ
            r0 = 0
            r3.<init>(r2, r1, r0)
            java.lang.String r0 = "enter_inbox"
            X.C0CN5.LIZLLL(r4, r0, r3)
            goto L13
        L70:
            r3 = 0
            goto L36
        L72:
            X.0Y6X r2 = r8.LLILLJJLI
            X.0YdB r1 = r8.LLILZ
            X.0Y6P r0 = r8.LLILZIL
            r6.LIZIZ(r2, r1, r0)
            if (r3 == 0) goto L13
            X.0YdA r1 = r8.LLILLL
            X.0YdB r0 = r8.LLILZ
            r8.LL = r5
            java.lang.Object r0 = r1.LIZ(r0, r8)
            if (r0 != r4) goto L13
            X.C1C7U.LIZIZ(r7)
            return r4
        L8d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C878340Ycy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
