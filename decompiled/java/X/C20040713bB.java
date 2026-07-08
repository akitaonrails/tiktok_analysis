package X;

import com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13bB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM$updateSwitchStatus$1$1", f = "TakoSettingsVM.kt", l = {123, 130}, m = "invokeSuspend")
public final class C20040713bB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ TakoSettingsVM LLILLL;
    public final /* synthetic */ C1155400gAk LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ boolean LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20040713bB(TakoSettingsVM takoSettingsVM, C1155400gAk c1155400gAk, String str, boolean z, boolean z2, InterfaceC1364105Vn<? super C20040713bB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoSettingsVM;
        this.LLILZ = c1155400gAk;
        this.LLILZIL = str;
        this.LLILZLL = z;
        this.LLIZ = z2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20040713bB(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r7 = "TakoSettingsVM@fd20.updateSwitchStatus$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LLILLJJLI
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L42
            if (r0 == r1) goto L91
            if (r0 != r2) goto Lac
            java.lang.Object r11 = r13.LL
            java.lang.String r11 = (java.lang.String) r11
            X.C155000ia.LIZIZ(r14)
        L1a:
            u2 r14 = (defpackage.u2) r14
            if (r14 == 0) goto L20
            r14.LJIIL = r11
        L20:
            com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM r5 = r13.LLILLL
            X.0gAk r0 = r13.LLILZ
            java.lang.String r4 = r13.LLILZIL
            boolean r3 = r13.LLILZLL
            r5.getClass()
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.LL
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r2.put(r4, r0)
            r5.CQ2(r2, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L42:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM r4 = r13.LLILLL
            X.0gAk r0 = r13.LLILZ
            java.lang.String r6 = r13.LLILZIL
            boolean r5 = r13.LLILZLL
            r4.getClass()
            java.util.Map<java.lang.String, java.lang.Boolean> r0 = r0.LL
            java.util.LinkedHashMap r4 = new java.util.LinkedHashMap
            r4.<init>(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            r4.put(r6, r0)
            java.lang.String r11 = com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM.FQ2(r4)
            boolean r0 = r13.LLIZ
            if (r0 == 0) goto L98
            com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM r0 = r13.LLILLL
            X.0yae r8 = r0.LL
            if (r8 == 0) goto L98
            r9 = 3
            kotlin.Pair r5 = new kotlin.Pair
            java.lang.String r4 = r13.LLILZIL
            boolean r0 = r13.LLILZLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.<init>(r4, r0)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r5)
            java.lang.String r12 = com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM.FQ2(r0)
            r13.LL = r11
            r13.LLILLJJLI = r1
            r10 = 0
            java.lang.Object r0 = r8.LJIJJLI(r9, r10, r11, r12, r13)
            if (r0 != r3) goto L98
            X.C1C7U.LIZIZ(r7)
            return r3
        L91:
            java.lang.Object r11 = r13.LL
            java.lang.String r11 = (java.lang.String) r11
            X.C155000ia.LIZIZ(r14)
        L98:
            com.ss.android.ugc.aweme.tako.otherpage.settings.vm.TakoSettingsVM r0 = r13.LLILLL
            X.0yae r0 = r0.LL
            if (r0 == 0) goto L20
            r13.LL = r11
            r13.LLILLJJLI = r2
            java.lang.Object r14 = r0.LJI(r13)
            if (r14 != r3) goto L1a
            X.C1C7U.LIZIZ(r7)
            return r3
        Lac:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20040713bB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
