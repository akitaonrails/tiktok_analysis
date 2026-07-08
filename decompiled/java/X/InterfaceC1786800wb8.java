package X;

import android.app.Activity;
import java.util.List;
import java.util.Map;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public interface InterfaceC1786800wb8 {
    Object checkEnvironment(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object checkExternalPaymentEligibility(String str, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object consumePurchase(EnumC1782260wTo enumC1782260wTo, C1788060wdA c1788060wdA, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    InterfaceC346201Wa<EnumC1409040mlq> getCashierUpdate();

    EnumC993990byP getChannel();

    Map<String, String> getCommonEventInfo();

    String getCurrentRegionCode();

    Object getExternalPaymentToken(String str, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    InterfaceC346201Wa<InterfaceC1786840wbC> getPurchaseUpdate();

    Object initChannel(String str, boolean z, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object launchExternalPayment(String str, Activity activity, String str2, InterfaceC1364105Vn<? super InterfaceC790710V0b> interfaceC1364105Vn);

    Object launchPurchaseFlow(Activity activity, String str, String str2, EnumC1782260wTo enumC1782260wTo, String str3, String str4, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    Object queryProductDetails(EnumC1782260wTo enumC1782260wTo, List<String> list, InterfaceC1364105Vn<? super List<? extends InterfaceC1780600wR8>> interfaceC1364105Vn);

    Object queryPurchases(EnumC1782260wTo enumC1782260wTo, InterfaceC1364105Vn<? super List<C1788060wdA>> interfaceC1364105Vn);
}
