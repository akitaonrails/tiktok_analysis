package X;

import android.net.Uri;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.CustomDotGetParamsV2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0w7S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.mixhome.mallentry.action.EcMallEntryActionForUgDelivery$handle$2$1", f = "EcMallEntryActionForUgDelivery.kt", l = {LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C1768400w7S extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1767550w65 LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1768400w7S(C1767550w65 c1767550w65, String str, InterfaceC1364105Vn<? super C1768400w7S> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1767550w65;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1768400w7S(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("EcMallEntryActionForUgDelivery@b643.handle$2$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1768780w84 c1768780w84 = new C1768410w7T().LL;
            int value = EnumC1768950w8L.UG_BACK_FYP_SHOW_BUBBLE.getValue();
            Uri uri = this.LLILLJJLI.LJIIIIZZ;
            if (uri != null) {
                string = uri.toString();
            } else {
                string = null;
            }
            CustomDotGetParamsV2 customDotGetParamsV2 = new CustomDotGetParamsV2(1, 0, 0, "", value, null, null, null, null, null, string, this.LLILLL, C2286608xc.LJ(2));
            this.LL = 1;
            if (c1768780w84.LLLZI(customDotGetParamsV2, this) == objLJFF) {
                C1C7U.LIZIZ("EcMallEntryActionForUgDelivery@b643.handle$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcMallEntryActionForUgDelivery@b643.handle$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
