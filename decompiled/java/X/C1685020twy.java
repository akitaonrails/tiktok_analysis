package X;

import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0twy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$LoadActivityBanner$1$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {534, 535}, m = "invokeSuspend")
public final class C1685020twy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1146430fwH LLILLJJLI;
    public final /* synthetic */ C05P0<Boolean> LLILLL;
    public final /* synthetic */ Function0<C1092560eXO> LLILZ;
    public final /* synthetic */ LifecycleOwner LLILZIL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILZLL;
    public final /* synthetic */ Function1<AbstractC1146640fwc, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1685020twy(C1146430fwH c1146430fwH, C05P0<Boolean> c05p0, Function0<C1092560eXO> function0, LifecycleOwner lifecycleOwner, Function1<? super Boolean, Unit> function1, Function1<? super AbstractC1146640fwc, Unit> function12, InterfaceC1364105Vn<? super C1685020twy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1146430fwH;
        this.LLILLL = c05p0;
        this.LLILZ = function0;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = function1;
        this.LLIZ = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1685020twy(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.LoadActivityBanner$1$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 2
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L75
            if (r0 != r5) goto L8a
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.jvm.functions.Function0<X.0eXO> r0 = r8.LLILZ
            java.lang.Object r6 = r0.invoke()
            X.0eXO r6 = (X.C1092560eXO) r6
            X.0fwH r0 = r8.LLILLJJLI
            X.0fwA r5 = r0.LIZ
            androidx.lifecycle.LifecycleOwner r4 = r8.LLILZIL
            kotlin.jvm.internal.AwS569S0100000_25 r2 = new kotlin.jvm.internal.AwS569S0100000_25
            kotlin.jvm.functions.Function1<X.0fwc, kotlin.Unit> r1 = r8.LLIZ
            r0 = 71
            r2.<init>(r1, r0)
            r6.LIZ(r5, r4, r2)
            kotlin.jvm.functions.Function1<java.lang.Boolean, kotlin.Unit> r1 = r8.LLILZLL
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r1.invoke(r0)
        L39:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L3f:
            X.C155000ia.LIZIZ(r9)
            X.0fwH r0 = r8.LLILLJJLI
            X.0fwA r0 = r0.LIZ
            if (r0 == 0) goto L39
            X.05P0<java.lang.Boolean> r0 = r8.LLILLL
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L16
            kotlin.jvm.internal.AwS569S0100000_25 r2 = new kotlin.jvm.internal.AwS569S0100000_25
            X.05P0<java.lang.Boolean> r1 = r8.LLILLL
            r0 = 70
            r2.<init>(r1, r0)
            X.095D r2 = X.C20028913Yh.LJIIIZ(r2)
            X.0uIL r1 = new X.0uIL
            r0 = 3
            r1.<init>(r2, r0)
            r8.LL = r3
            java.lang.Object r0 = X.C09IC.LJIIZILJ(r1, r8)
            if (r0 != r4) goto L78
            X.C1C7U.LIZIZ(r7)
            return r4
        L75:
            X.C155000ia.LIZIZ(r9)
        L78:
            r0 = 70
            kotlin.jvm.internal.AFwS266S0000000_25 r0 = kotlin.jvm.internal.AFwS266S0000000_25.get$arr$(r0)
            r8.LL = r5
            java.lang.Object r0 = X.C1838620xwi.LIZIZ(r8, r0)
            if (r0 != r4) goto L16
            X.C1C7U.LIZIZ(r7)
            return r4
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1685020twy.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
