package X;

import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0v6C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.us.billboard.utils.EffectBillboardLiveStatusHelper$onBillboardCancel$1", f = "EffectBillboardLiveStatusHelper.kt", l = {}, m = "invokeSuspend")
public final class C1729180v6C extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1729220v6G LL;
    public final /* synthetic */ Long LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1729180v6C(C1729220v6G c1729220v6G, Long l, InterfaceC1364105Vn<? super C1729180v6C> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1729220v6G;
        this.LLILLJJLI = l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1729180v6C(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String currentUserID;
        String str;
        C1C7U.LIZ("EffectBillboardLiveStatusHelper@aaaf.onBillboardCancel$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1728980v5s.LIZ.getClass();
        IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
        if (iUserService != null) {
            currentUserID = iUserService.getCurrentUserID();
        } else {
            currentUserID = null;
        }
        C1729210v6F c1729210v6FLJLZ = C1728830v5d.LJLZ(currentUserID);
        if (c1729210v6FLJLZ == null) {
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EffectBillboardLiveStatusHelper@aaaf.onBillboardCancel$1");
            return unit;
        }
        if (Intrinsics.LJFF(c1729210v6FLJLZ.LJFF, this.LLILLJJLI.toString())) {
            Map<String, String> map = C1729240v6I.LIZ;
            if (currentUserID == null) {
                str = "";
            } else {
                str = currentUserID;
            }
            C1729240v6I.LIZLLL(c1729210v6FLJLZ, str);
        }
        C1729270v6L.LIZ("cancel_image_effect", "cancel by live", null, null, null, null, "", 0, 0, 0, 956);
        C1728830v5d.LLJLILLLLZIIL(null, currentUserID);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectBillboardLiveStatusHelper@aaaf.onBillboardCancel$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
