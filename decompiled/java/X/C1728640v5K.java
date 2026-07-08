package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.model.SeaLiveEffectRootData;

/* JADX INFO: renamed from: X.0v5K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveBillboardImageEffectHelper", f = "SeaLiveBillboardImageEffectHelper.kt", l = {LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT, 47, 51}, m = "cancelEffect")
public final class C1728640v5K extends AbstractC23140094w {
    public InterfaceC1728700v5Q LL;
    public LiveEffect LLILLJJLI;
    public SeaLiveEffectRootData LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1728650v5L LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728640v5K(C1728650v5L c1728650v5L, InterfaceC1364105Vn<? super C1728640v5K> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1728650v5L;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("SeaLiveBillboardImageEffectHelper@6ebc.cancelEffect$1");
        return objLIZ;
    }
}
