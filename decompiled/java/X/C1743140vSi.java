package X;

import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.CartEntry;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ServerConfigStyle;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.title.ECTrendingTitleAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0vSi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.trending.title.ECTrendingTitleAssem$onEvent$1", f = "ECTrendingTitleAssem.kt", l = {}, m = "invokeSuspend")
public final class C1743140vSi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ ECTrendingTitleAssem LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1743140vSi(String str, ECTrendingTitleAssem eCTrendingTitleAssem, String str2, InterfaceC1364105Vn<? super C1743140vSi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = eCTrendingTitleAssem;
        this.LLILLL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1743140vSi(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ServerConfigStyle serverConfigStyle;
        int iIntValue;
        String str;
        C1C7U.LIZ("ECTrendingTitleAssem@dbc8.onEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (Intrinsics.LJFF(this.LL, "ec_cart_refresh") && (serverConfigStyle = this.LLILLJJLI.Go().getState().LLJ) != null) {
            Integer num = C049Q.LIZ(this.LLILLL).count;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C1753840vjy c1753840vjy = this.LLILLJJLI.LLJIJIL;
            if (c1753840vjy != null) {
                Integer numLJ = C2286608xc.LJ(iIntValue);
                EnumC1743310vSz enumC1743310vSz = EnumC1743310vSz.STYLE_DEFAULT;
                CartEntry cartEntry = serverConfigStyle.cartEntry;
                if (cartEntry != null) {
                    str = cartEntry.link;
                } else {
                    str = null;
                }
                c1753840vjy.h0(new C1743360vT4(numLJ, enumC1743310vSz, str), true);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECTrendingTitleAssem@dbc8.onEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
