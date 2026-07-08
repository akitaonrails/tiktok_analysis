package X;

import com.ss.android.ugc.aweme.commercialize.quickconversion.api.shopify.model.ShopifySkuCheckoutProductDetailData;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.14By, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.common.shopify.ShopifySkuCheckoutManager$Companion$getShopifyProductDetailSuspend$2", f = "ShopifySkuCheckoutManager.kt", l = {144}, m = "invokeSuspend")
public final class C20225614By extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super ShopifySkuCheckoutProductDetailData>, Object> {
    public long LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ AwemeRawAd LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20225614By(AwemeRawAd awemeRawAd, String str, String str2, String str3, String str4, Map map, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = map;
        this.LLIZ = str3;
        this.LLIZLLLIL = awemeRawAd;
        this.LLJ = str4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        Map<String, String> map = this.LLILZLL;
        C20225614By c20225614By = new C20225614By(this.LLIZLLLIL, str, str2, this.LLIZ, this.LLJ, map, interfaceC1364105Vn);
        c20225614By.LLILLL = obj;
        return c20225614By;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:26:0x00ab, B:27:0x00ae, B:30:0x00b9, B:32:0x00bd, B:34:0x00c1, B:35:0x00c5, B:37:0x00cb, B:39:0x00dc, B:41:0x00e0, B:46:0x00e8, B:48:0x0106, B:52:0x010d, B:54:0x0118, B:56:0x011c, B:59:0x0122, B:61:0x0126, B:66:0x012f, B:68:0x0133, B:69:0x0135, B:71:0x0146, B:74:0x014c, B:76:0x017d, B:77:0x017f, B:79:0x0186, B:84:0x018e, B:86:0x01a8, B:88:0x01b6, B:89:0x01b8, B:94:0x01db, B:95:0x01dd, B:97:0x01e5, B:9:0x002a, B:11:0x003c, B:13:0x0040, B:15:0x0052, B:16:0x0056, B:18:0x005e, B:21:0x0068), top: B:103:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0146 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:26:0x00ab, B:27:0x00ae, B:30:0x00b9, B:32:0x00bd, B:34:0x00c1, B:35:0x00c5, B:37:0x00cb, B:39:0x00dc, B:41:0x00e0, B:46:0x00e8, B:48:0x0106, B:52:0x010d, B:54:0x0118, B:56:0x011c, B:59:0x0122, B:61:0x0126, B:66:0x012f, B:68:0x0133, B:69:0x0135, B:71:0x0146, B:74:0x014c, B:76:0x017d, B:77:0x017f, B:79:0x0186, B:84:0x018e, B:86:0x01a8, B:88:0x01b6, B:89:0x01b8, B:94:0x01db, B:95:0x01dd, B:97:0x01e5, B:9:0x002a, B:11:0x003c, B:13:0x0040, B:15:0x0052, B:16:0x0056, B:18:0x005e, B:21:0x0068), top: B:103:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014c A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:26:0x00ab, B:27:0x00ae, B:30:0x00b9, B:32:0x00bd, B:34:0x00c1, B:35:0x00c5, B:37:0x00cb, B:39:0x00dc, B:41:0x00e0, B:46:0x00e8, B:48:0x0106, B:52:0x010d, B:54:0x0118, B:56:0x011c, B:59:0x0122, B:61:0x0126, B:66:0x012f, B:68:0x0133, B:69:0x0135, B:71:0x0146, B:74:0x014c, B:76:0x017d, B:77:0x017f, B:79:0x0186, B:84:0x018e, B:86:0x01a8, B:88:0x01b6, B:89:0x01b8, B:94:0x01db, B:95:0x01dd, B:97:0x01e5, B:9:0x002a, B:11:0x003c, B:13:0x0040, B:15:0x0052, B:16:0x0056, B:18:0x005e, B:21:0x0068), top: B:103:0x0011 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a8 A[Catch: Exception -> 0x01e9, TryCatch #0 {Exception -> 0x01e9, blocks: (B:26:0x00ab, B:27:0x00ae, B:30:0x00b9, B:32:0x00bd, B:34:0x00c1, B:35:0x00c5, B:37:0x00cb, B:39:0x00dc, B:41:0x00e0, B:46:0x00e8, B:48:0x0106, B:52:0x010d, B:54:0x0118, B:56:0x011c, B:59:0x0122, B:61:0x0126, B:66:0x012f, B:68:0x0133, B:69:0x0135, B:71:0x0146, B:74:0x014c, B:76:0x017d, B:77:0x017f, B:79:0x0186, B:84:0x018e, B:86:0x01a8, B:88:0x01b6, B:89:0x01b8, B:94:0x01db, B:95:0x01dd, B:97:0x01e5, B:9:0x002a, B:11:0x003c, B:13:0x0040, B:15:0x0052, B:16:0x0056, B:18:0x005e, B:21:0x0068), top: B:103:0x0011 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20225614By.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super ShopifySkuCheckoutProductDetailData> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
