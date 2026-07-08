package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;

/* JADX INFO: renamed from: X.0x3T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.android.live.walletclean.domain.usecase.cache.GetFullRechargeDataFromCacheUseCase", f = "GetFullRechargeDataFromCacheUseCase.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT}, m = "execute")
public final class C1804370x3T extends AbstractC23140094w {
    public C1804420x3Y LL;
    public InterfaceC1804600x3q LLILLJJLI;
    public C1804420x3Y LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1804220x3E LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1804370x3T(C1804220x3E c1804220x3E, InterfaceC1364105Vn<? super C1804370x3T> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1804220x3E;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("GetFullRechargeDataFromCacheUseCase@3797.execute$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZIL.LJFF(null, this);
        C1C7U.LIZIZ("GetFullRechargeDataFromCacheUseCase@3797.execute$1");
        return objLJFF;
    }
}
