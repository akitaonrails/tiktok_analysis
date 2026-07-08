package X;

import android.content.Context;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03O3, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel$createOrder$1$6", f = "MiniOspViewModel.kt", l = {2422, 2411}, m = "invokeSuspend")
public final class C03O3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BillInfoData LL;
    public Object LLILLJJLI;
    public CreateOrderRequest LLILLL;
    public C03WX LLILZ;
    public CreateOrderRequest LLILZIL;
    public long LLILZLL;
    public int LLIZ;
    public final /* synthetic */ MiniOspViewModel LLIZLLLIL;
    public final /* synthetic */ C03JV LLJ;
    public final /* synthetic */ Boolean LLJI;
    public final /* synthetic */ Integer LLJIJIL;
    public final /* synthetic */ String LLJILJIL;
    public final /* synthetic */ Context LLJILJILJ;
    public final /* synthetic */ boolean LLJILLL;
    public final /* synthetic */ String LLJJ;
    public final /* synthetic */ String LLJJI;
    public final /* synthetic */ Pair<Boolean, Boolean> LLJJIII;
    public final /* synthetic */ String LLJJIJI;
    public final /* synthetic */ String LLJJIJIIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03O3(MiniOspViewModel miniOspViewModel, C03JV c03jv, Boolean bool, Integer num, String str, Context context, boolean z, String str2, String str3, Pair<Boolean, Boolean> pair, String str4, String str5, InterfaceC1364105Vn<? super C03O3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = miniOspViewModel;
        this.LLJ = c03jv;
        this.LLJI = bool;
        this.LLJIJIL = num;
        this.LLJILJIL = str;
        this.LLJILJILJ = context;
        this.LLJILLL = z;
        this.LLJJ = str2;
        this.LLJJI = str3;
        this.LLJJIII = pair;
        this.LLJJIJI = str4;
        this.LLJJIJIIJIL = str5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C03O3(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, this.LLJJI, this.LLJJIII, this.LLJJIJI, this.LLJJIJIIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|2|(1:243)|(1:(1:(14:6|7|33|233|35|(1:40)(1:39)|41|42|(5:44|(1:46)|47|(1:51)|52)|245|55|(51:57|(1:62)(1:61)|(1:66)|67|(1:69)|70|(1:123)(1:74)|75|(1:122)(1:79)|80|(1:82)(1:121)|83|(1:120)(1:87)|88|(1:119)(1:92)|93|(1:118)(1:101)|102|(1:110)|111|(1:117)(1:115)|116|239|124|237|125|(1:137)(1:131)|132|(1:138)(1:136)|(1:141)(1:144)|145|(1:147)(1:161)|148|(1:160)(1:154)|155|(1:162)(1:159)|(1:171)(1:170)|(1:174)(1:179)|180|(1:216)(1:184)|185|(1:215)(1:189)|190|(1:214)(1:194)|195|(1:213)(1:199)|200|(1:212)(1:204)|205|(1:211)(1:209)|210)|231|232)(2:8|9))(3:10|241|28))(4:11|235|12|(8:14|(1:16)|17|(1:19)|20|(1:22)(1:24)|23|(2:26|27))(6:34|233|35|(8:37|40|41|42|(0)|245|55|(0))(0)|231|232))|29|(2:31|32)|33|233|35|(0)(0)|231|232|(2:(0)|(1:248))) */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x0400, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb A[Catch: all -> 0x0124, TRY_ENTER, TryCatch #5 {all -> 0x0124, blocks: (B:7:0x0023, B:37:0x00cb, B:39:0x00d1, B:44:0x0101, B:47:0x010b, B:49:0x010f, B:52:0x011d, B:14:0x0064, B:16:0x006c, B:17:0x006e, B:19:0x0072, B:20:0x0074, B:22:0x007e, B:23:0x0082), top: B:243:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101 A[Catch: all -> 0x0124, TRY_ENTER, TryCatch #5 {all -> 0x0124, blocks: (B:7:0x0023, B:37:0x00cb, B:39:0x00d1, B:44:0x0101, B:47:0x010b, B:49:0x010f, B:52:0x011d, B:14:0x0064, B:16:0x006c, B:17:0x006e, B:19:0x0072, B:20:0x0074, B:22:0x007e, B:23:0x0082), top: B:243:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012d A[Catch: all -> 0x03f6, TryCatch #6 {all -> 0x03f6, blocks: (B:55:0x0127, B:57:0x012d, B:59:0x0139, B:61:0x013d, B:64:0x0146, B:66:0x014a, B:67:0x014e, B:70:0x0165, B:72:0x0189, B:74:0x018d, B:75:0x0191, B:77:0x019b, B:79:0x019f, B:80:0x01a3, B:82:0x01b4, B:83:0x01b8, B:85:0x01c2, B:87:0x01c6, B:88:0x01ca, B:90:0x01d0, B:92:0x01d4, B:93:0x01d8, B:95:0x01f2, B:97:0x01f6, B:99:0x01fa, B:101:0x01fe, B:102:0x0202, B:104:0x0208, B:106:0x020c, B:108:0x0210, B:110:0x0214, B:111:0x0218, B:113:0x0232, B:115:0x0236, B:116:0x023a), top: B:245:0x0127 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r71) {
        /*
            Method dump skipped, instruction units count: 1056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03O3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
