package X;

import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0kBW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.audience.common.business.utils.LottieDownloadUtil$downloadLottie$1", f = "LottieDownloadUtil.kt", l = {}, m = "invokeSuspend")
public final class C1309640kBW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1309640kBW(String str, String str2, InterfaceC1364105Vn<? super C1309640kBW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1309640kBW(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LottieDownloadUtil@a445.downloadLottie$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String absolutePath = C1309630kBV.LIZJ().getAbsolutePath();
        AbstractC2199801B7q abstractC2199801B7qWith = DownloadServiceManager.INSTANCE.getDownloadService().with(str2);
        abstractC2199801B7qWith.LJ = absolutePath;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".zip");
        abstractC2199801B7qWith.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
        abstractC2199801B7qWith.LJIIJ = "ecommerce_lottie";
        abstractC2199801B7qWith.LIZLLL(EnumC565770MGx.ZIP);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LottieDownloadUtil@a445.downloadLottie$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
