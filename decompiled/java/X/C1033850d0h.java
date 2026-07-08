package X;

import com.bytedance.touchpoint.api.service.IMultiDomainService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.structure.saas.ICommerceSaasService;
import com.ss.android.ugc.aweme.touchpoint.serviceimpl.IncentiveAdService;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0d0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1033850d0h extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ IncentiveAdService LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;
    public final /* synthetic */ int LLIZ;
    public final /* synthetic */ List<String> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1033850d0h(String str, String str2, String str3, IncentiveAdService incentiveAdService, String str4, int i, int i2, List<String> list) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = incentiveAdService;
        this.LLILZIL = str4;
        this.LLILZLL = i;
        this.LLIZ = i2;
        this.LLIZLLLIL = list;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        InterfaceC1032100cxs interfaceC1032100cxsLJ;
        InterfaceC1898200zUo interfaceC1898200zUoLIZJ;
        C1925407gS c1925407gS = C1925407gS.LIZ;
        String str = this.LL;
        c1925407gS.getClass();
        HashMap<String, Object> mapLIZJ = C1925407gS.LIZJ(str);
        HashMap<String, String> mapLIZLLL = C1925407gS.LIZLLL(this.LLILLJJLI);
        HashMap<String, Object> mapLIZJ2 = C1925407gS.LIZJ(this.LLILLL);
        this.LLILZ.LJFF = mapLIZLLL;
        IMultiDomainService iMultiDomainService = (IMultiDomainService) PluggableExtentionKt.pluggableSpi$default(IMultiDomainService.class, false, false, false, 14, null);
        if (iMultiDomainService != null && (interfaceC1898200zUoLIZJ = iMultiDomainService.LIZJ()) != null) {
            String str2 = this.LLILZIL;
            if (str2 == null) {
                str2 = "";
            }
            interfaceC1898200zUoLIZJ.LJIIIIZZ(this.LLILZLL, this.LLIZ, str2, "", "", this.LLILLJJLI, this.LLIZLLLIL, mapLIZJ != null ? Intrinsics.LJFF(mapLIZJ.get("enable_prefetch"), Boolean.TRUE) : false);
        }
        ICommerceSaasService iCommerceSaasService = (ICommerceSaasService) PluggableExtentionKt.pluggableSpi$default(ICommerceSaasService.class, false, false, false, 14, null);
        if (iCommerceSaasService != null && (interfaceC1032100cxsLJ = iCommerceSaasService.LJ()) != null) {
            interfaceC1032100cxsLJ.watchNext(mapLIZJ, mapLIZLLL, mapLIZJ2, null);
        }
        return Unit.LIZ;
    }
}
