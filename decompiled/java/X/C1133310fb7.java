package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0fb7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.giftbasic.data.repository.GiftPanelRepositoryImpl", f = "GiftPanelRepositoryImpl.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "fetchGiftPages-gIAlu-s")
public final class C1133310fb7 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1133270fb3 LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1133310fb7(C1133270fb3 c1133270fb3, InterfaceC1364105Vn<? super C1133310fb7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1133270fb3;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(null, this);
        if (objLIZIZ == C099R.LJFF()) {
            C1C7U.LIZIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$1");
            return objLIZIZ;
        }
        C189200o6 c189200o6M1boximpl = C189200o6.m1boximpl(objLIZIZ);
        C1C7U.LIZIZ("GiftPanelRepositoryImpl@309d.fetchGiftPages$1");
        return c189200o6M1boximpl;
    }
}
