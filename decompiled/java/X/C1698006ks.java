package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06ks, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.actions.BasePinToTopActionKt$tryPinChatToTop$1", f = "BasePinToTopAction.kt", l = {82}, m = "invokeSuspend")
public final class C1698006ks extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ BaseSwitchActionViewModel<?> LLILLL;
    public final /* synthetic */ AbstractC879060Ye8 LLILZ;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZIL;
    public final /* synthetic */ C0Y8T LLILZLL;
    public final /* synthetic */ Activity LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1698006ks(boolean z, BaseSwitchActionViewModel<?> baseSwitchActionViewModel, AbstractC879060Ye8 abstractC879060Ye8, Function1<? super Boolean, Unit> function1, C0Y8T c0y8t, Activity activity, InterfaceC1364105Vn<? super C1698006ks> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = baseSwitchActionViewModel;
        this.LLILZ = abstractC879060Ye8;
        this.LLILZIL = function1;
        this.LLILZLL = c0y8t;
        this.LLIZ = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1698006ks(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "BasePinToTopActionKt@e22.tryPinChatToTop$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 1
            if (r0 == 0) goto L21
            if (r0 != r5) goto L5d
            X.C155000ia.LIZIZ(r9)
        L13:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 == 0) goto L40
        L1b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L21:
            X.C155000ia.LIZIZ(r9)
            boolean r0 = r8.LLILLJJLI
            if (r0 == 0) goto L40
            X.1DFB r4 = X.C0PEM.LIZJ
            X.06kr r3 = new X.06kr
            X.0Y8T r2 = r8.LLILZLL
            android.app.Activity r1 = r8.LLIZ
            r0 = 0
            r3.<init>(r2, r1, r0)
            r8.LL = r5
            java.lang.Object r9 = X.C23250099c.LJI(r8, r4, r3)
            if (r9 != r6) goto L13
            X.C1C7U.LIZIZ(r7)
            return r6
        L40:
            com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel<?> r4 = r8.LLILLL
            boolean r3 = r8.LLILLJJLI
            X.0Ye8 r2 = r8.LLILZ
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r8.LLILZIL
            r4.xQ2(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.invoke(r0)
            if (r2 == 0) goto L1b
            X.06kt r0 = new X.06kt
            r0.<init>()
            r2.LJIILJJIL(r3, r0)
            goto L1b
        L5d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1698006ks.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
