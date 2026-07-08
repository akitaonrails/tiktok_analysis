package X;

import com.ss.android.ugc.aweme.ab.SubsPaywallSingleBindKillSwitch;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.subscription.service.IPaidContentFullAwemeService;
import com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0S8I, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.videohotswap.service.PaidContentVideoHotSwapServiceImpl$makePaywallNetworkCallVhs$3$1$1$1$1$1", f = "PaidContentVideoHotSwapServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C0S8I extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Object LL;
    public final /* synthetic */ C0S8A<Object> LLILLJJLI;
    public final /* synthetic */ List<C0S8A<Object>> LLILLL;
    public final /* synthetic */ C0S8H LLILZ;
    public final /* synthetic */ PaidContentVideoHotSwapServiceImpl LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ Aweme LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0S8I(Object obj, C0S8A<Object> c0s8a, List<C0S8A<Object>> list, C0S8H c0s8h, PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl, String str, String str2, String str3, Aweme aweme, InterfaceC1364105Vn<? super C0S8I> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = obj;
        this.LLILLJJLI = c0s8a;
        this.LLILLL = list;
        this.LLILZ = c0s8h;
        this.LLILZIL = paidContentVideoHotSwapServiceImpl;
        this.LLILZLL = str;
        this.LLIZ = str2;
        this.LLIZLLLIL = str3;
        this.LLJ = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0S8I(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String strLIZLLL;
        String strLIZLLL2;
        C1C7U.LIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == null) {
            if (SubsPaywallSingleBindKillSwitch.INSTANCE.isEnabled()) {
                C0S8A<Object> c0s8a = this.LLILLJJLI;
                if (c0s8a != null) {
                    this.LLILZ.LIZ(c0s8a);
                }
            } else {
                List<C0S8A<Object>> list = this.LLILLL;
                C0S8H c0s8h = this.LLILZ;
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                Iterator<C0S8A<Object>> it2 = list.iterator();
                while (it2.hasNext()) {
                    c0s8h.LIZ(it2.next());
                    arrayList.add(Unit.LIZ);
                }
            }
        } else {
            String str = "";
            if (SubsPaywallSingleBindKillSwitch.INSTANCE.isEnabled()) {
                C0S8A<Object> c0s8a2 = this.LLILLJJLI;
                if (c0s8a2 != null) {
                    C0S8H c0s8h2 = this.LLILZ;
                    Object obj2 = this.LL;
                    PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl = this.LLILZIL;
                    String str2 = this.LLILZLL;
                    String str3 = this.LLIZ;
                    String str4 = this.LLIZLLLIL;
                    Aweme aweme = c0s8a2.LIZ;
                    paidContentVideoHotSwapServiceImpl.getClass();
                    IPaidContentFullAwemeService iPaidContentFullAwemeService = (IPaidContentFullAwemeService) PluggableExtentionKt.pluggableSpi$default(IPaidContentFullAwemeService.class, false, false, false, 14, null);
                    if (iPaidContentFullAwemeService != null && (strLIZLLL2 = iPaidContentFullAwemeService.LIZLLL(str2, str3, str4, aweme)) != null) {
                        str = strLIZLLL2;
                    }
                    c0s8h2.LIZJ(c0s8a2, obj2, str);
                }
            } else {
                List<C0S8A<Object>> list2 = this.LLILLL;
                C0S8H c0s8h3 = this.LLILZ;
                Object obj3 = this.LL;
                PaidContentVideoHotSwapServiceImpl paidContentVideoHotSwapServiceImpl2 = this.LLILZIL;
                Aweme aweme2 = this.LLJ;
                String str5 = this.LLILZLL;
                String str6 = this.LLIZ;
                String str7 = this.LLIZLLLIL;
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
                for (C0S8A<Object> c0s8a3 : list2) {
                    paidContentVideoHotSwapServiceImpl2.getClass();
                    IPaidContentFullAwemeService iPaidContentFullAwemeService2 = (IPaidContentFullAwemeService) PluggableExtentionKt.pluggableSpi$default(IPaidContentFullAwemeService.class, false, false, false, 14, null);
                    if (iPaidContentFullAwemeService2 == null || (strLIZLLL = iPaidContentFullAwemeService2.LIZLLL(str5, str6, str7, aweme2)) == null) {
                        strLIZLLL = "";
                    }
                    c0s8h3.LIZJ(c0s8a3, obj3, strLIZLLL);
                    arrayList2.add(Unit.LIZ);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaidContentVideoHotSwapServiceImpl@1955.makePaywallNetworkCallVhs$3$1$1$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
