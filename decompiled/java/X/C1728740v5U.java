package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.model.RootData;

/* JADX INFO: renamed from: X.0v5U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.utils.UseLiveEffectHelper", f = "UseLiveEffectHelper.kt", l = {35, 55, 59}, m = "cancelEffect")
public final class C1728740v5U extends AbstractC23140094w {
    public InterfaceC1728700v5Q LL;
    public LiveEffect LLILLJJLI;
    public RootData LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1728720v5S LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728740v5U(C1728720v5S c1728720v5S, InterfaceC1364105Vn<? super C1728740v5U> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1728720v5S;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("UseLiveEffectHelper@a681.cancelEffect$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("UseLiveEffectHelper@a681.cancelEffect$1");
        return objLIZ;
    }
}
