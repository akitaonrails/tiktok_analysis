package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.03WN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03WN extends C09AY implements Function1<C957403oi, Unit> {
    public final /* synthetic */ long LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C03WO LLILZIL;
    public final /* synthetic */ C03PY LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C03WN(long j, String str, String str2, String str3, C03WO c03wo, C03PY c03py) {
        super(1);
        this.LL = j;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = c03wo;
        this.LLILZLL = c03py;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C957403oi c957403oi) {
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        String name;
        C957403oi c957403oi2 = c957403oi;
        c957403oi2.LIZLLL("duration", Long.valueOf(this.LL));
        c957403oi2.LIZLLL("result", this.LLILLJJLI);
        String str = this.LLILLL;
        if (str != null) {
            c957403oi2.LIZLLL("payment_method_id", str);
        }
        String str2 = this.LLILZ;
        if (str2 != null) {
            c957403oi2.LIZLLL("error_code", str2);
        }
        C03WO c03wo = this.LLILZIL;
        if (c03wo != null) {
            c957403oi2.LIZLLL("stage", String.valueOf(c03wo.getStage()));
        }
        C03PY c03py = this.LLILZLL;
        if (c03py != null) {
            c957403oi2.LIZLLL("pay_scene", String.valueOf(c03py.getNum()));
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = ILocationDependencyService.class.getName();
            if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
        }
        c957403oi2.LIZLLL("priority_region", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode().toLowerCase(Locale.ROOT));
        c957403oi2.LIZLLL("EVENT_ORIGIN_FEATURE", "TEMAI");
        return Unit.LIZ;
    }
}
