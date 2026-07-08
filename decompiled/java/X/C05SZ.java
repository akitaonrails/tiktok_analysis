package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$rememberSelectableAnimationScale$1$1", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {996, 997, 998}, m = "invokeSuspend")
public final class C05SZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1146350fw9 LLILLJJLI;
    public final /* synthetic */ C1677480tko<Float, C1677280tkU> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05SZ(C1146350fw9 c1146350fw9, C1677480tko<Float, C1677280tkU> c1677480tko, InterfaceC1364105Vn<? super C05SZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1146350fw9;
        this.LLILLL = c1677480tko;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05SZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            java.lang.String r11 = "GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.rememberSelectableAnimationScale$1$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r3 = X.C099R.LJFF()
            r4 = r19
            int r0 = r4.LL
            r6 = 6
            r5 = 0
            r2 = 100
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = 3
            r8 = 2
            r9 = 1
            r15 = 0
            if (r0 == 0) goto L28
            if (r0 == r9) goto L41
            if (r0 == r8) goto L63
            if (r0 != r1) goto L82
            X.C155000ia.LIZIZ(r20)
        L22:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L28:
            X.C155000ia.LIZIZ(r20)
            X.0fw9 r0 = r4.LLILLJJLI
            if (r0 == 0) goto L22
            X.0tko<java.lang.Float, X.0tkU> r7 = r4.LLILLL
            java.lang.Float r0 = X.C2286608xc.LIZLLL(r10)
            r4.LL = r9
            java.lang.Object r0 = r7.LJFF(r0, r4)
            if (r0 != r3) goto L44
            X.C1C7U.LIZIZ(r11)
            return r3
        L41:
            X.C155000ia.LIZIZ(r20)
        L44:
            X.0tko<java.lang.Float, X.0tkU> r12 = r4.LLILLL
            r0 = 1066024305(0x3f8a3d71, float:1.08)
            java.lang.Float r13 = X.C2286608xc.LIZLLL(r0)
            X.0tk7 r14 = X.C1671550tbF.LIZLLL(r2, r5, r15, r6)
            r18 = 12
            r4.LL = r8
            r16 = r15
            r17 = r4
            java.lang.Object r0 = X.C1677480tko.LIZJ(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r3) goto L66
            X.C1C7U.LIZIZ(r11)
            return r3
        L63:
            X.C155000ia.LIZIZ(r20)
        L66:
            X.0tko<java.lang.Float, X.0tkU> r12 = r4.LLILLL
            java.lang.Float r13 = X.C2286608xc.LIZLLL(r10)
            X.0tk7 r14 = X.C1671550tbF.LIZLLL(r2, r5, r15, r6)
            r18 = 12
            r4.LL = r1
            r16 = r15
            r17 = r4
            java.lang.Object r0 = X.C1677480tko.LIZJ(r12, r13, r14, r15, r16, r17, r18)
            if (r0 != r3) goto L22
            X.C1C7U.LIZIZ(r11)
            return r3
        L82:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05SZ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
