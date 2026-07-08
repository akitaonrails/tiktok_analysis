package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.actionbar.api.service.IActionBarMemoryCacheService;
import com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.actionbar.ActionBarButtonConf;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0ZlK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.actionbar.common.viewmodel.SocialActionBarLightInteractionViewModel$fetchActionBarDataFromCache$1", f = "SocialActionBarLightInteractionViewModel.kt", l = {}, m = "invokeSuspend")
public final class C909000ZlK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SocialActionBarLightInteractionViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C909000ZlK(SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel, String str, InterfaceC1364105Vn<? super C909000ZlK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = socialActionBarLightInteractionViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C909000ZlK(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List<ActionBarButtonConf> listLJJJI;
        boolean z;
        C1C7U.LIZ("SocialActionBarLightInteractionViewModel@9e54.fetchActionBarDataFromCache$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((Boolean) C287780BPs.LIZ.getValue()).booleanValue()) {
            this.LL.getClass();
            IActionBarMemoryCacheService iActionBarMemoryCacheService = (IActionBarMemoryCacheService) PluggableExtentionKt.pluggableSpiForReal(IActionBarMemoryCacheService.class);
            if (iActionBarMemoryCacheService != null) {
                listLJJJI = iActionBarMemoryCacheService.LJJJI(this.LLILLJJLI);
            } else {
                listLJJJI = null;
            }
            SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel = this.LL;
            if (listLJJJI != null && !listLJJJI.isEmpty()) {
                z = false;
            } else {
                z = true;
            }
            socialActionBarLightInteractionViewModel.LLJJ = z;
            SocialActionBarLightInteractionViewModel socialActionBarLightInteractionViewModel2 = this.LL;
            if (!socialActionBarLightInteractionViewModel2.LLJJ) {
                if (listLJJJI != null) {
                    socialActionBarLightInteractionViewModel2.LLILZ.setValue(new C908760Zkw(listLJJJI));
                }
            } else {
                socialActionBarLightInteractionViewModel2.wQ2(this.LLILLJJLI);
            }
        } else {
            this.LL.wQ2(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialActionBarLightInteractionViewModel@9e54.fetchActionBarDataFromCache$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
