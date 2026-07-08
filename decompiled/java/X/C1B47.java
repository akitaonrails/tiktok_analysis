package X;

import com.ss.android.ugc.aweme.openshare.DmShare;
import com.ss.android.ugc.aweme.share.ClientScopeResponse;
import com.ss.android.ugc.aweme.share.ScopeData;
import com.ss.android.ugc.aweme.share.SystemShareActivity;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1B47, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity$initDmShare$2", f = "SystemShareActivity.kt", l = {1089, 1091}, m = "invokeSuspend")
public final class C1B47 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SystemShareActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B47(SystemShareActivity systemShareActivity, InterfaceC1364105Vn<? super C1B47> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = systemShareActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1B47(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.initDmShare$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("SystemShareActivity@a089.initDmShare$2");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SystemShareActivity systemShareActivity = this.LLILLJJLI;
            if (systemShareActivity.LLIZ == null) {
                SystemShareActivity.f(systemShareActivity, systemShareActivity.getString(2131832467), false);
                C2198841B3y c2198841B3y = C2198841B3y.LIZ;
                DmShare.TikTokDSPSettings tikTokDSPSettings = this.LLILLJJLI.LLIZ;
                DmShare.TikTokDSPSettings tikTokDSPSettings2 = null;
                if (tikTokDSPSettings == null) {
                    tikTokDSPSettings = null;
                }
                String lowerCase = tikTokDSPSettings.applicationName.toLowerCase(Locale.ROOT);
                DmShare.TikTokDSPSettings tikTokDSPSettings3 = this.LLILLJJLI.LLIZ;
                if (tikTokDSPSettings3 != null) {
                    tikTokDSPSettings2 = tikTokDSPSettings3;
                }
                String str = tikTokDSPSettings2.entityUri;
                Integer numLJ = C2286608xc.LJ(5);
                c2198841B3y.getClass();
                C2198841B3y.LIZIZ(numLJ, "fail_popup", lowerCase, str);
            }
            SystemShareActivity systemShareActivity2 = this.LLILLJJLI;
            this.LL = 1;
            obj = systemShareActivity2.LLLLZLL(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SystemShareActivity@a089.initDmShare$2");
                return objLJFF;
            }
        }
        ClientScopeResponse clientScopeResponse = (ClientScopeResponse) obj;
        if (clientScopeResponse != null) {
            SystemShareActivity systemShareActivity3 = this.LLILLJJLI;
            ScopeData scopeData = clientScopeResponse.data;
            this.LL = 2;
            if (systemShareActivity3.LLLLZI(this) == objLJFF) {
                C1C7U.LIZIZ("SystemShareActivity@a089.initDmShare$2");
                return objLJFF;
            }
        } else {
            SystemShareActivity systemShareActivity4 = this.LLILLJJLI;
            SystemShareActivity.f(systemShareActivity4, systemShareActivity4.getString(2131832467), false);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SystemShareActivity@a089.initDmShare$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
