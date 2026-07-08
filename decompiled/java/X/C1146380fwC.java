package X;

import com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0fwC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel$startBackgroundRefresh$1", f = "GiftAnchorPanelGiftPageCenterViewModel.kt", l = {279, 280}, m = "invokeSuspend")
public final class C1146380fwC extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ GiftAnchorPanelGiftPageCenterViewModel LLILLJJLI;
    public final /* synthetic */ Long LLILLL;
    public final /* synthetic */ C096600Ya LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1146380fwC(GiftAnchorPanelGiftPageCenterViewModel giftAnchorPanelGiftPageCenterViewModel, Long l, C096600Ya c096600Ya, InterfaceC1364105Vn<? super C1146380fwC> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = giftAnchorPanelGiftPageCenterViewModel;
        this.LLILLL = l;
        this.LLILZ = c096600Ya;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1146380fwC(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:19:0x004b, B:20:0x004e, B:22:0x006e, B:26:0x0075, B:29:0x0081, B:31:0x0087, B:32:0x008b, B:34:0x0099, B:36:0x009f, B:14:0x002f, B:15:0x0032, B:10:0x0021), top: B:47:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0087 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:19:0x004b, B:20:0x004e, B:22:0x006e, B:26:0x0075, B:29:0x0081, B:31:0x0087, B:32:0x008b, B:34:0x0099, B:36:0x009f, B:14:0x002f, B:15:0x0032, B:10:0x0021), top: B:47:0x000f }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "GiftAnchorPanelGiftPageCenterViewModel@7747.startBackgroundRefresh$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r4 = 0
            r6 = 2
            r3 = 0
            r1 = 1
            if (r0 == 0) goto L1e
            if (r0 == r1) goto L2f
            if (r0 != r6) goto L16
            goto L4b
        L16:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1e:
            X.C155000ia.LIZIZ(r10)
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r0 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> La3
            r9.LL = r1     // Catch: java.lang.Throwable -> La3
            java.lang.Object r10 = r0.BQ2(r9)     // Catch: java.lang.Throwable -> La3
            if (r10 != r7) goto L32
            X.C1C7U.LIZIZ(r8)
            return r7
        L2f:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> La3
        L32:
            com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse$Data r10 = (com.bytedance.android.livesdk.gift.model.GiftListByCreatorResponse.Data) r10     // Catch: java.lang.Throwable -> La3
            X.1DFB r5 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> La3
            X.0fwB r2 = new X.0fwB     // Catch: java.lang.Throwable -> La3
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r1 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> La3
            X.00Ya r0 = r9.LLILZ     // Catch: java.lang.Throwable -> La3
            r2.<init>(r1, r10, r0, r4)     // Catch: java.lang.Throwable -> La3
            r9.LL = r6     // Catch: java.lang.Throwable -> La3
            java.lang.Object r10 = X.C23250099c.LJI(r9, r5, r2)     // Catch: java.lang.Throwable -> La3
            if (r10 != r7) goto L4e
            X.C1C7U.LIZIZ(r8)
            return r7
        L4b:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> La3
        L4e:
            kotlin.Pair r10 = (kotlin.Pair) r10     // Catch: java.lang.Throwable -> La3
            java.lang.Object r5 = r10.getFirst()     // Catch: java.lang.Throwable -> La3
            X.0fwH r5 = (X.C1146430fwH) r5     // Catch: java.lang.Throwable -> La3
            java.lang.Object r2 = r10.getSecond()     // Catch: java.lang.Throwable -> La3
            java.lang.Long r2 = (java.lang.Long) r2     // Catch: java.lang.Throwable -> La3
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r0 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> La3
            X.002o r0 = r0.getState()     // Catch: java.lang.Throwable -> La3
            X.0fwR r0 = (X.C1146530fwR) r0     // Catch: java.lang.Throwable -> La3
            X.06Xk<java.lang.Object> r1 = r0.LL     // Catch: java.lang.Throwable -> La3
            X.01vh r0 = X.C491101vh.LIZ     // Catch: java.lang.Throwable -> La3
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L74
            boolean r0 = r1 instanceof X.C1623706Xj     // Catch: java.lang.Throwable -> La3
            if (r0 != 0) goto L74
            r1 = 0
            goto L75
        L74:
            r1 = 1
        L75:
            java.lang.Long r0 = r9.LLILLL     // Catch: java.lang.Throwable -> La3
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r2)     // Catch: java.lang.Throwable -> La3
            r0 = r0 ^ 1
            if (r1 != 0) goto L81
            if (r0 == 0) goto La7
        L81:
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r0 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> La3
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.IGiftAnchorPanelGiftPageScrollAbility r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto L8b
            X.0fwV r4 = r0.Na2()     // Catch: java.lang.Throwable -> La3
        L8b:
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r2 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> La3
            kotlin.jvm.internal.AwS596S0100000_17 r1 = new kotlin.jvm.internal.AwS596S0100000_17     // Catch: java.lang.Throwable -> La3
            r0 = 135(0x87, float:1.89E-43)
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> La3
            r2.setState(r1)     // Catch: java.lang.Throwable -> La3
            if (r4 == 0) goto La7
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r0 = r9.LLILLJJLI     // Catch: java.lang.Throwable -> La3
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.IGiftAnchorPanelGiftPageScrollAbility r0 = r0.LLILZIL     // Catch: java.lang.Throwable -> La3
            if (r0 == 0) goto La7
            r0.sE2(r4)     // Catch: java.lang.Throwable -> La3
            goto La7
        La3:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb1
        La7:
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r0 = r9.LLILLJJLI
            r0.LLILZ = r3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        Lb1:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> Lb1
            com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterViewModel r0 = r9.LLILLJJLI
            r0.LLILZ = r3
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1146380fwC.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
