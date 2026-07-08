package X;

import com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedInteractViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01lI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedInteractViewModel$turnOffVibeFeed$1", f = "VibeFeedInteractViewModel.kt", l = {48, 54, 59}, m = "invokeSuspend")
public final class C426601lI extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VibeFeedInteractViewModel LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ EnumC912680ZrG LLIZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C426601lI(VibeFeedInteractViewModel vibeFeedInteractViewModel, String str, String str2, String str3, EnumC912680ZrG enumC912680ZrG, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C426601lI> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = vibeFeedInteractViewModel;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = str3;
        this.LLIZ = enumC912680ZrG;
        this.LLIZLLLIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C426601lI c426601lI = new C426601lI(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c426601lI.LLILLJJLI = obj;
        return c426601lI;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.String r8 = "VibeFeedInteractViewModel@e37c.turnOffVibeFeed$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r14.LL
            r6 = 0
            r4 = 3
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L20
            if (r0 == r1) goto L44
            if (r0 == r2) goto L79
            if (r0 != r4) goto La0
            X.C155000ia.LIZIZ(r15)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r15)
            com.ss.android.ugc.aweme.vibefeed.feed.viewmodel.VibeFeedInteractViewModel r0 = r14.LLILLL
            java.lang.String r10 = r14.LLILZ
            java.lang.String r11 = r14.LLILZIL
            java.lang.String r12 = r14.LLILZLL
            X.0ZrG r13 = r14.LLIZ
            X.09R9 r0 = r0.LL     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L4d
            X.0SvR r0 = (X.InterfaceC736910SvR) r0     // Catch: java.lang.Throwable -> L4d
            X.00hg r9 = r0.getOperator()     // Catch: java.lang.Throwable -> L4d
            X.0OmF r9 = (X.InterfaceC629290OmF) r9     // Catch: java.lang.Throwable -> L4d
            r14.LL = r1     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r15 = r9.LLJJIJIIJIL(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L4d
            if (r15 != r5) goto L47
            goto La8
        L44:
            X.C155000ia.LIZIZ(r15)     // Catch: java.lang.Throwable -> L4d
        L47:
            com.ss.android.ugc.aweme.vibefeed.model.VibeFeedCloseResponse r15 = (com.ss.android.ugc.aweme.vibefeed.model.VibeFeedCloseResponse) r15     // Catch: java.lang.Throwable -> L4d
            X.C189200o6.m2constructorimpl(r15)     // Catch: java.lang.Throwable -> L4d
            goto L59
        L4d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r15 = new X.00Yq
            r15.<init>(r0)
            X.C189200o6.m2constructorimpl(r15)
        L59:
            r7 = r15
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r14.LLIZLLLIL
            java.lang.Throwable r0 = X.C189200o6.m5exceptionOrNullimpl(r7)
            if (r0 == 0) goto L7e
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01lH r0 = new X.01lH
            r0.<init>(r3, r6)
            r14.LLILLJJLI = r7
            r14.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r14, r1, r0)
            if (r0 != r5) goto L7e
            X.C1C7U.LIZIZ(r8)
            return r5
        L79:
            java.lang.Object r7 = r14.LLILLJJLI
            X.C155000ia.LIZIZ(r15)
        L7e:
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r14.LLIZLLLIL
            boolean r0 = X.C189200o6.m8isSuccessimpl(r7)
            if (r0 == 0) goto L1a
            r2 = r7
            com.ss.android.ugc.aweme.vibefeed.model.VibeFeedCloseResponse r2 = (com.ss.android.ugc.aweme.vibefeed.model.VibeFeedCloseResponse) r2
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.01lJ r0 = new X.01lJ
            r0.<init>(r3, r2, r6)
            r14.LLILLJJLI = r7
            r14.LL = r4
            java.lang.Object r0 = X.C23250099c.LJI(r14, r1, r0)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r5
        La0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La8:
            X.C1C7U.LIZIZ(r8)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C426601lI.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
