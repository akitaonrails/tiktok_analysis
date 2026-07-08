package X;

import android.os.SystemClock;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.ecommerce.dependency.account.AccountDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.account.IAccountDependencyService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03ck, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.showcase.store.StoreInterceptor$monitorOpenShop$2", f = "StoreInterceptor.kt", l = {}, m = "invokeSuspend")
public final class C883203ck extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C883203ck(String str, String str2, String str3, InterfaceC1364105Vn<? super C883203ck> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C883203ck(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin;
        boolean z;
        long j;
        boolean z2;
        String name;
        C1C7U.LIZ("StoreInterceptor@c22c.monitorOpenShop$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append('_');
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = AccountDependencyService.createIAccountDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name2 = IAccountDependencyService.class.getName();
            if (anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAccountDependencyService.class);
        }
        sbLIZ.append(((IAccountDependencyService) anonymousClass0317CreateIAccountDependencyServicebyMonsterPlugin).getUserId());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva keva = C1257480ipO.LIZ;
        long j2 = keva.getLong(strLIZIZ, 0L);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Pair[] pairArr = new Pair[5];
        if (j2 > 0) {
            z = true;
        } else {
            z = false;
        }
        pairArr[0] = new Pair("hasCache", Boolean.valueOf(z));
        if (j2 > 0) {
            j = (jCurrentTimeMillis - j2) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            j = 0;
        }
        pairArr[1] = new Pair("duration", C2286608xc.LJFF(j));
        String str = this.LL;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        pairArr[2] = new Pair("shop_id", str);
        String str3 = this.LLILLJJLI;
        if (str3 == null) {
            str3 = "";
        }
        pairArr[3] = new Pair("enter_method", str3);
        String str4 = this.LLILLL;
        if (str4 != null) {
            str2 = str4;
        }
        pairArr[4] = new Pair("schema", str2);
        C1421105hJ.LIZJ("tiktokec_rd_shop_cache_monitor", C2097608Jq.LJIIJ(pairArr));
        keva.storeLong(strLIZIZ, jCurrentTimeMillis);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StoreInterceptor@c22c.monitorOpenShop$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
