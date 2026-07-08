package X;

import com.ss.android.ugc.aweme.im.service.service.IDMGreetingCardGeckoChannelManager;
import com.ss.android.ugc.aweme.im.strategy.commonresource.GreetingCardResource;
import com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zmf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel$preloadFestive$1$1", f = "GreetingCardViewModel.kt", l = {301, 304}, m = "invokeSuspend")
public final class C909830Zmf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IDMGreetingCardGeckoChannelManager LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ GreetingCardViewModel LLILZIL;
    public final /* synthetic */ GreetingCardResource LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909830Zmf(IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager, String str, String str2, GreetingCardViewModel greetingCardViewModel, GreetingCardResource greetingCardResource, InterfaceC1364105Vn<? super C909830Zmf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iDMGreetingCardGeckoChannelManager;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = greetingCardViewModel;
        this.LLILZLL = greetingCardResource;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909830Zmf(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL.LLIZLLLIL;
            this.LL = 1;
            if (iDMGreetingCardGeckoChannelManager.LIZJ(str, str2, str3, this) == objLJFF) {
                C1C7U.LIZIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
                return objLJFF;
            }
        }
        String closedCardMessageListImageUrl = this.LLILZLL.getClosedCardMessageListImageUrl();
        if (closedCardMessageListImageUrl == null) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
            return unit2;
        }
        String openedCardMessageListImageUrl = this.LLILZLL.getOpenedCardMessageListImageUrl();
        if (openedCardMessageListImageUrl == null) {
            Unit unit3 = Unit.LIZ;
            C1C7U.LIZIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
            return unit3;
        }
        IDMGreetingCardGeckoChannelManager iDMGreetingCardGeckoChannelManager2 = this.LLILLJJLI;
        String str4 = this.LLILLL;
        String str5 = this.LLILZ;
        this.LL = 2;
        if (iDMGreetingCardGeckoChannelManager2.LIZ(str4, str5, closedCardMessageListImageUrl, openedCardMessageListImageUrl, this) == objLJFF) {
            C1C7U.LIZIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
            return objLJFF;
        }
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardViewModel@d8e.preloadFestive$1$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
