package X;

import com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel$fetchCategoryList$2", f = "StickerEffectViewModel.kt", l = {285, 286, 288, 290, 293}, m = "invokeSuspend")
public final class C399301gt extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StickerEffectViewModel LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C399301gt(StickerEffectViewModel stickerEffectViewModel, InterfaceC1364105Vn<? super C399301gt> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = stickerEffectViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C399301gt c399301gt = new C399301gt(this.LLILLL, interfaceC1364105Vn);
        c399301gt.LLILLJJLI = obj;
        return c399301gt;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0026, B:22:0x005d, B:23:0x0060, B:25:0x0068, B:28:0x007e, B:18:0x004a, B:19:0x004d, B:15:0x0036), top: B:46:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007e A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:12:0x0026, B:22:0x005d, B:23:0x0060, B:25:0x0068, B:28:0x007e, B:18:0x004a, B:19:0x004d, B:15:0x0036), top: B:46:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "StickerEffectViewModel@d809.fetchCategoryList$2"
            X.C1C7U.LIZ(r10)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r11.LL
            r6 = 5
            r8 = 4
            r7 = 3
            r9 = 2
            r5 = 0
            r4 = 1
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L4a
            if (r0 == r9) goto L2a
            if (r0 == r7) goto L26
            if (r0 == r8) goto L26
            if (r0 != r6) goto Laf
            X.C155000ia.LIZIZ(r12)
        L20:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r10)
            return r0
        L26:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L92
            goto L20
        L2a:
            java.lang.Object r2 = r11.LLILLJJLI
            java.util.List r2 = (java.util.List) r2
            goto L5d
        L2f:
            X.C155000ia.LIZIZ(r12)
            java.lang.Object r2 = r11.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.01gu r1 = new X.01gu     // Catch: java.lang.Exception -> L92
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LLILLL     // Catch: java.lang.Exception -> L92
            r1.<init>(r0, r5)     // Catch: java.lang.Exception -> L92
            X.099G r0 = X.C23250099c.LIZIZ(r2, r5, r5, r1, r7)     // Catch: java.lang.Exception -> L92
            r11.LL = r4     // Catch: java.lang.Exception -> L92
            java.lang.Object r12 = r0.LJLIIIL(r11)     // Catch: java.lang.Exception -> L92
            if (r12 != r3) goto L4d
            goto Lb7
        L4a:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L92
        L4d:
            r2 = r12
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Exception -> L92
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LLILLL     // Catch: java.lang.Exception -> L92
            r11.LLILLJJLI = r2     // Catch: java.lang.Exception -> L92
            r11.LL = r9     // Catch: java.lang.Exception -> L92
            java.lang.Object r12 = r0.OQ2(r11)     // Catch: java.lang.Exception -> L92
            if (r12 != r3) goto L60
            goto Lbb
        L5d:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Exception -> L92
        L60:
            X.0U8u r12 = (X.C767500U8u) r12     // Catch: java.lang.Exception -> L92
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L92
            if (r0 == 0) goto L7e
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LLILLL     // Catch: java.lang.Exception -> L92
            X.1DDr r2 = r0.LLILLL     // Catch: java.lang.Exception -> L92
            X.01gQ r1 = new X.01gQ     // Catch: java.lang.Exception -> L92
            java.lang.String r0 = "categoryList is empty"
            r1.<init>(r4, r0)     // Catch: java.lang.Exception -> L92
            r11.LLILLJJLI = r5     // Catch: java.lang.Exception -> L92
            r11.LL = r7     // Catch: java.lang.Exception -> L92
            java.lang.Object r0 = r2.emit(r1, r11)     // Catch: java.lang.Exception -> L92
            if (r0 != r3) goto L20
            goto Lbf
        L7e:
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r1 = r11.LLILLL     // Catch: java.lang.Exception -> L92
            r1.getClass()     // Catch: java.lang.Exception -> L92
            java.util.List r0 = com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel.AQ2(r2, r12)     // Catch: java.lang.Exception -> L92
            r11.LLILLJJLI = r5     // Catch: java.lang.Exception -> L92
            r11.LL = r8     // Catch: java.lang.Exception -> L92
            java.lang.Object r0 = r1.TQ2(r0, r11)     // Catch: java.lang.Exception -> L92
            if (r0 != r3) goto L20
            goto Lc3
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.bytedance.android.live.effect.sticker.data.StickerEffectViewModel r0 = r11.LLILLL
            X.1DDr r2 = r0.LLILLL
            X.01gQ r1 = new X.01gQ
            java.lang.String r0 = "fetchCategoryList failed"
            r1.<init>(r4, r0)
            r11.LLILLJJLI = r5
            r11.LL = r6
            java.lang.Object r0 = r2.emit(r1, r11)
            if (r0 != r3) goto L20
            X.C1C7U.LIZIZ(r10)
            return r3
        Laf:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb7:
            X.C1C7U.LIZIZ(r10)
            return r3
        Lbb:
            X.C1C7U.LIZIZ(r10)
            return r3
        Lbf:
            X.C1C7U.LIZIZ(r10)
            return r3
        Lc3:
            X.C1C7U.LIZIZ(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C399301gt.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
