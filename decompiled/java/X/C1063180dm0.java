package X;

import com.ss.android.ugc.aweme.ad.feed.ibe.CommerceIBEService;
import com.ss.android.ugc.aweme.commerce.IBEInfo;
import com.ss.android.ugc.aweme.commerce.tools.common.CommerceToolsModel;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AFwS276S0000000_31;

/* JADX INFO: renamed from: X.0dm0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1063180dm0 implements InterfaceC1010530cP5, InterfaceC856520Xis {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILLL;
    public final C15MZ LL;
    public final C997320c3m LLILLJJLI = new C997320c3m(AFwS276S0000000_31.get$arr$(323));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1063180dm0.class, "commerceModel", "getCommerceModel()Lcom/ss/android/ugc/aweme/commerce/tools/common/CommerceToolsModel;", 0);
        C13LE.LIZ.getClass();
        LLILLL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    @Override // X.InterfaceC1037910d7F
    public final void initialize() {
    }

    @Override // X.InterfaceC856520Xis
    public final void IS() {
        C997320c3m c997320c3m = this.LLILLJJLI;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = LLILLL;
        for (IBEInfo iBEInfo : ((CommerceToolsModel) c997320c3m.LIZ(this)).getIbeContext().getIbeInfos()) {
            CommerceIBEService.LJFF().LIZIZ(iBEInfo, C0CHQ.LIZ, new C1057930ddX(iBEInfo, new C1063150dlx(0, null, null, EnumC1063200dm2.PUBLISH.getValue(), false, 23)), AFwS252S0000000_16.get$arr$(80), AFwS204S0000000_16.get$arr$(87));
        }
    }

    @Override // X.InterfaceC1010530cP5
    public final /* bridge */ /* synthetic */ Object Mh() {
        return this.LL;
    }

    public C1063180dm0(AbstractC856620Xj2 abstractC856620Xj2) {
        this.LL = abstractC856620Xj2;
    }
}
