package X;

import com.bytedance.android.live.base.model.ImageModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS596S0100000_17;
import njp.a;

/* JADX INFO: renamed from: X.0fLA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.gift.base.platform.business.panel.portrait.list.viewholder.LiveGiftRedEnvelopeViewHolderV2$loadImage$2", f = "LiveGiftRedEnvelopeViewHolderV2.kt", l = {}, m = "invokeSuspend")
public final class C1123420fLA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1126600fQI<? extends AnonymousClass0054> LL;
    public final /* synthetic */ C013C LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1123420fLA(AbstractC1126600fQI<? extends AnonymousClass0054> abstractC1126600fQI, C013C c013c, InterfaceC1364105Vn<? super C1123420fLA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1126600fQI;
        this.LLILLJJLI = c013c;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1123420fLA(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        List urls;
        C1C7U.LIZ("LiveGiftRedEnvelopeViewHolderV2@622d.loadImage$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        ImageModel imageModelLJII = this.LL.LJII();
        if (imageModelLJII != null && (urls = imageModelLJII.getUrls()) != null) {
            str = (String) C13LP.LJJJLZIJ(0, urls);
        } else {
            str = null;
        }
        C1819620xS4.LIZIZ(str, new AwS596S0100000_17(this.LLILLJJLI, 316));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveGiftRedEnvelopeViewHolderV2@622d.loadImage$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
