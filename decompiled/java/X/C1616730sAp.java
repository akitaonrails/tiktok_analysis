package X;

import android.content.Context;
import android.net.Uri;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.PrivacyDisclaimerUtilService;
import com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupFragment;
import com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupParams;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0sAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupHandler$handlePopup$1", f = "MarketplacePopupHandler.kt", l = {}, m = "invokeSuspend")
public final class C1616730sAp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MarketplacePopupParams LL;
    public final /* synthetic */ Context LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616730sAp(MarketplacePopupParams marketplacePopupParams, Context context, Function0<Unit> function0, InterfaceC1364105Vn<? super C1616730sAp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = marketplacePopupParams;
        this.LLILLJJLI = context;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1616730sAp(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        FragmentManager supportFragmentManager;
        C1C7U.LIZ("MarketplacePopupHandler@d492.handlePopup$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL.popupMode;
        if (Intrinsics.LJFF(str, EnumC1616740sAq.HALF_SCREEN_SHEET.getMode())) {
            C1674120tfO c1674120tfO = C1674120tfO.LIZ;
            Context context = this.LLILLJJLI;
            MarketplacePopupParams marketplacePopupParams = this.LL;
            Function0<Unit> function0 = this.LLILLL;
            c1674120tfO.getClass();
            String str2 = marketplacePopupParams.popupMode;
            EnumC1616740sAq[] enumC1616740sAqArrValues = EnumC1616740sAq.values();
            int length = enumC1616740sAqArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                EnumC1616740sAq enumC1616740sAq = enumC1616740sAqArrValues[i];
                if (Intrinsics.LJFF(enumC1616740sAq.getMode(), str2)) {
                    String str3 = marketplacePopupParams.popupSchema;
                    MarketplacePopupFragment.LL = enumC1616740sAq;
                    MarketplacePopupFragment.LLILLJJLI = str3;
                    MarketplacePopupFragment marketplacePopupFragment = new MarketplacePopupFragment();
                    C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
                    if (c19egLIZIZ != null && (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) != null) {
                        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                        c1390920mIc.LIZ.LLJJIJI = marketplacePopupFragment;
                        c1390920mIc.LJIIIIZZ(1);
                        DialogInterfaceOnDismissListenerC1620760sHK dialogInterfaceOnDismissListenerC1620760sHK = new DialogInterfaceOnDismissListenerC1620760sHK(function0, 5);
                        TuxSheet tuxSheet = c1390920mIc.LIZ;
                        tuxSheet.LLILLJJLI = dialogInterfaceOnDismissListenerC1620760sHK;
                        tuxSheet.show(supportFragmentManager, "POPUP_HALF_SCREEN_SHEET_");
                    }
                } else {
                    i++;
                }
            }
        } else if (Intrinsics.LJFF(str, EnumC1616740sAq.FULL_SCREEN_SHEET.getMode())) {
            C1674120tfO c1674120tfO2 = C1674120tfO.LIZ;
            Context context2 = this.LLILLJJLI;
            MarketplacePopupParams marketplacePopupParams2 = this.LL;
            Function0<Unit> function02 = this.LLILLL;
            c1674120tfO2.getClass();
            Uri uri = UriProtector.parse(marketplacePopupParams2.popupSchema);
            if (Intrinsics.LJFF(uri.getScheme(), "aweme") && Intrinsics.LJFF(uri.getHost(), "pgc_m10n")) {
                String path = uri.getPath();
                if (path != null && path.hashCode() == -36837522 && path.equals("/series_terms")) {
                    PrivacyDisclaimerUtilService.LJFF().LIZ();
                    function02.invoke();
                } else {
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(marketplacePopupParams2.popupSchema);
                    C1541950qED.LIZJ.getClass();
                    new C1541950qED(context2, sparkContext).LIZIZ();
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MarketplacePopupHandler@d492.handlePopup$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
