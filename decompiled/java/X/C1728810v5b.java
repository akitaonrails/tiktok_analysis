package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.model.EffectRootData;

/* JADX INFO: renamed from: X.0v5b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.BillboardImageEffectHelper", f = "BillboardImageEffectHelper.kt", l = {35, 48, 52}, m = "cancelEffect")
public final class C1728810v5b extends AbstractC23140094w {
    public InterfaceC1728700v5Q LL;
    public LiveEffect LLILLJJLI;
    public EffectRootData LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1728760v5W LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1728810v5b(C1728760v5W c1728760v5W, InterfaceC1364105Vn<? super C1728810v5b> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1728760v5W;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardImageEffectHelper@3558.cancelEffect$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZIL.LIZ(null, null, null, this);
        C1C7U.LIZIZ("BillboardImageEffectHelper@3558.cancelEffect$1");
        return objLIZ;
    }
}
