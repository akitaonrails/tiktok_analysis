package X;

import com.bytedance.android.live.effect.countdown.CountDownEffectViewModel;

/* JADX INFO: renamed from: X.0U4K, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.countdown.CountDownEffectViewModel", f = "CountDownEffectViewModel.kt", l = {67}, m = "fetchEffectFromCache")
public final class C0U4K extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ CountDownEffectViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U4K(CountDownEffectViewModel countDownEffectViewModel, InterfaceC1364105Vn<? super C0U4K> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = countDownEffectViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CountDownEffectViewModel@8fd.fetchEffectFromCache$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objAQ2 = this.LLILZ.AQ2(this);
        C1C7U.LIZIZ("CountDownEffectViewModel@8fd.fetchEffectFromCache$1");
        return objAQ2;
    }
}
