package X;

import com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13b9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.otherpage.languagestyle.TakoLanguageStyleHelper$remoteUpdateLanguageStyleSetting$1", f = "TakoLanguageStyleHelper.kt", l = {257, 258}, m = "invokeSuspend")
public final class C20040513b9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C201992141u LL;
    public int LLILLJJLI;
    public final /* synthetic */ TakoLanguageStyleSetting LLILLL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20040513b9(TakoLanguageStyleSetting takoLanguageStyleSetting, Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C20040513b9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = takoLanguageStyleSetting;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20040513b9(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "TakoLanguageStyleHelper@b3b.remoteUpdateLanguageStyleSetting$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 2
            r1 = 1
            if (r0 == 0) goto L52
            if (r0 == r1) goto L6d
            if (r0 != r4) goto L8e
            X.141u r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L18:
            com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse r8 = (com.ss.android.ugc.aweme.tako.ccl.net.GetUserSettingSwitchStatusResponse) r8
            com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting r4 = r7.LLILLL
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r3 = r7.LLILZ
            r2.getClass()
            kotlin.jvm.internal.AwS570S0100000_26 r2 = new kotlin.jvm.internal.AwS570S0100000_26
            r0 = 1242(0x4da, float:1.74E-42)
            r2.<init>(r3, r0)
            kotlin.jvm.internal.AwS396S0200000_30 r1 = new kotlin.jvm.internal.AwS396S0200000_30
            r0 = 30
            r1.<init>(r4, r3, r0)
            int r0 = r8.statusCode
            if (r0 != 0) goto L4e
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUpdateResult r0 = r8.updateResult
            if (r0 == 0) goto L4c
            java.lang.String r0 = r0.toastContent
        L39:
            boolean r0 = X.C123100dR.LIZ(r0)
            if (r0 == 0) goto L4e
            com.ss.android.ugc.aweme.tako.ccl.net.TakoUpdateResult r0 = r8.updateResult
            if (r0 == 0) goto L46
            r1.invoke(r0)
        L46:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L4c:
            r0 = 0
            goto L39
        L4e:
            r2.invoke()
            goto L46
        L52:
            X.C155000ia.LIZIZ(r8)
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility> r0 = X.C201992141u.LIZIZ
            if (r0 == 0) goto L96
            java.lang.Object r0 = r0.get()
            com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility r0 = (com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility) r0
            if (r0 == 0) goto L96
            r7.LLILLJJLI = r1
            java.lang.Object r8 = r0.ql0(r7)
            if (r8 != r5) goto L70
            X.C1C7U.LIZIZ(r6)
            return r5
        L6d:
            X.C155000ia.LIZIZ(r8)
        L70:
            u2 r8 = (defpackage.u2) r8
            if (r8 == 0) goto L96
            java.lang.String r3 = r8.LIZIZ
            if (r3 == 0) goto L96
            X.141u r2 = X.C201992141u.LIZ
            X.0ybc r1 = X.C1863980ybc.LIZ
            com.ss.android.ugc.aweme.tako.ccl.net.TakoLanguageStyleSetting r0 = r7.LLILLL
            int r0 = r0.selectedLanguageStyle
            r7.LL = r2
            r7.LLILLJJLI = r4
            java.lang.Object r8 = r1.LJJIIJ(r0, r3, r7)
            if (r8 != r5) goto L18
            X.C1C7U.LIZIZ(r6)
            return r5
        L8e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L96:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20040513b9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
