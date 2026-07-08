package X;

import Y.AgS291S0100000_10;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem;
import com.ss.android.ugc.aweme.translation.service.ITranslationService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Q5t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.assem.SearchCLASubtitleCommonAssem$1", f = "SearchCLASubtitleCommonAssem.kt", l = {93}, m = "invokeSuspend")
public final class C664790Q5t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SearchCLASubtitleCommonAssem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C664790Q5t(SearchCLASubtitleCommonAssem searchCLASubtitleCommonAssem, InterfaceC1364105Vn<? super C664790Q5t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = searchCLASubtitleCommonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C664790Q5t(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchCLASubtitleCommonAssem@cc8e.<init>$1");
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
            ITranslationService iTranslationService = (ITranslationService) PluggableExtentionKt.pluggableSpi$default(ITranslationService.class, false, false, false, 14, null);
            if (iTranslationService == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SearchCLASubtitleCommonAssem@cc8e.<init>$1");
                return unit;
            }
            InterfaceC346201Wa<String> interfaceC346201WaLJJJJJ = iTranslationService.LJJJJJ();
            AgS291S0100000_10 agS291S0100000_10 = new AgS291S0100000_10(this.LLILLJJLI, 1);
            this.LL = 1;
            if (interfaceC346201WaLJJJJJ.collect(agS291S0100000_10, this) == objLJFF) {
                C1C7U.LIZIZ("SearchCLASubtitleCommonAssem@cc8e.<init>$1");
                return objLJFF;
            }
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SearchCLASubtitleCommonAssem@cc8e.<init>$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
