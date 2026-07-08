package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01ti, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.anchor.center.gift.center.GiftAnchorPanelGiftPageCenterAssemComposeKt$ScrollEventTracking$1$1$1$3", f = "GiftAnchorPanelGiftPageCenterAssemCompose.kt", l = {712, 714}, m = "invokeSuspend")
public final class C478801ti extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super Boolean>, Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;
    public /* synthetic */ boolean LLILLL;

    public C478801ti(InterfaceC1364105Vn<? super C478801ti> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346701Wf interfaceC346701Wf;
        boolean z;
        C1C7U.LIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1$3");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z = this.LLILLL;
            interfaceC346701Wf = this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC346701Wf = this.LLILLJJLI;
            z = this.LLILLL;
            if (!z) {
                this.LLILLJJLI = interfaceC346701Wf;
                this.LLILLL = z;
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(100L, this) == objLJFF) {
                    C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1$3");
                    return objLJFF;
                }
            }
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (interfaceC346701Wf.emit(boolValueOf, this) == objLJFF) {
            C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1$3");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GiftAnchorPanelGiftPageCenterAssemComposeKt@c5e0.ScrollEventTracking$1$1$1$3");
        return unit2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C478801ti c478801ti = new C478801ti(interfaceC1364105Vn);
        c478801ti.LLILLJJLI = interfaceC346701Wf;
        c478801ti.LLILLL = zBooleanValue;
        return c478801ti.invokeSuspend(Unit.LIZ);
    }
}
