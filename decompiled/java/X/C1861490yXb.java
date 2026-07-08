package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$carryInCard$4", f = "MessageViewModel.kt", l = {3622, 3624}, m = "invokeSuspend")
public final class C1861490yXb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863340yaa LLILLJJLI;
    public final /* synthetic */ MessageViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1861490yXb(MessageViewModel messageViewModel, C1863340yaa c1863340yaa, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1863340yaa;
        this.LLILLL = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1861490yXb(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "MessageViewModel@9229.carryInCard$4"
            X.C1C7U.LIZ(r10)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LL
            r5 = 0
            r4 = 2
            r9 = 1
            if (r0 == 0) goto L1d
            if (r0 == r9) goto L51
            if (r0 != r4) goto L7a
            X.C155000ia.LIZIZ(r12)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r12)
            X.0yaa r1 = r11.LLILLJJLI
            X.144L r0 = r1.LJI
            kotlin.jvm.functions.Function1<? super X.0yaa, kotlin.Unit> r0 = r0.LIZ
            r0.invoke(r1)
            X.0yaa r0 = r11.LLILLJJLI
            X.0yY5 r1 = r0.LJ
            boolean r0 = r1.LIZIZ
            if (r0 == 0) goto L17
            long r0 = r1.LIZ
            java.lang.Long r8 = X.C2286608xc.LJFF(r0)
            long r6 = r8.longValue()
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L54
            long r0 = r8.longValue()
            r11.LL = r9
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)
            if (r0 != r3) goto L54
            X.C1C7U.LIZIZ(r10)
            return r3
        L51:
            X.C155000ia.LIZIZ(r12)
        L54:
            com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel r0 = r11.LLILLL
            X.0yae r2 = r0.LLJJJJ
            if (r2 == 0) goto L17
            X.0yaa r1 = r11.LLILLJJLI
            X.0yY5 r0 = r1.LJ
            boolean r0 = r0.LIZLLL
            if (r0 == 0) goto L6e
            X.0ycI r0 = X.C1864400ycI.LIZ
            r0.getClass()
            X.13z8 r5 = new X.13z8
            com.ss.android.ugc.aweme.tako.ccl.net.TakoImageUploadAuthConfig r0 = X.C1864400ycI.LIZIZ
            r5.<init>(r0)
        L6e:
            r11.LL = r4
            java.lang.Object r0 = r2.LJ(r1, r5, r11)
            if (r0 != r3) goto L17
            X.C1C7U.LIZIZ(r10)
            return r3
        L7a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1861490yXb.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
