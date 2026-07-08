package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0v69, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.sea.billboard.utils.SeaLiveEffectBillboardLiveStatusHelper$onDestroy$1", f = "SeaLiveEffectBillboardLiveStatusHelper.kt", l = {}, m = "invokeSuspend")
public final class C1729150v69 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1729170v6B LL;
    public final /* synthetic */ Long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729150v69(C1729170v6B c1729170v6B, Long l, InterfaceC1364105Vn<? super C1729150v69> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1729170v6B;
        this.LLILLJJLI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729150v69(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String currentUserID;
        String str;
        C1C7U.LIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onDestroy$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728970v5r.LIZ.getClass();
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        } else {
            currentUserID = null;
        }
        C1729160v6A c1729160v6ALJLZ = C1728670v5N.LJLZ(currentUserID);
        if (c1729160v6ALJLZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onDestroy$1");
            return unit;
        }
        if (Intrinsics.LJFF(c1729160v6ALJLZ.LJFF, String.valueOf(this.LLILLJJLI))) {
            Map<String, String> map = C1729230v6H.LIZ;
            if (currentUserID == null) {
                str = "";
            } else {
                str = currentUserID;
            }
            C1729230v6H.LIZIZ(c1729160v6ALJLZ, str);
        }
        C1729260v6K.LIZ("cancel_image_effect", "cancel by live", null, null, null, null, "", 0, 0, 956);
        C1728670v5N.LLJLILLLLZIIL(null, currentUserID);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaLiveEffectBillboardLiveStatusHelper@c705.onDestroy$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
