package X;

import android.app.Activity;
import android.content.Intent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.router.OpenResultCallback;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.text.a0;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0zXb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1899930zXb extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ Map<String, Object> LLILZIL;
    public final /* synthetic */ Function1<C991900bv2, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1899930zXb(String str, String str2, String str3, boolean z, Map map, AwS595S0100000_16 awS595S0100000_16) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = z;
        this.LLILZIL = map;
        this.LLILZLL = awS595S0100000_16;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() throws JSONException {
        C1899920zXa c1899920zXa = C1899920zXa.LIZ;
        EnumC1899970zXf enumC1899970zXf = EnumC1899970zXf.JSB;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        boolean z = this.LLILZ;
        Map<String, Object> map = this.LLILZIL;
        Function1<C991900bv2, Unit> function1 = this.LLILZLL;
        c1899920zXa.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("open start popupIdentifier=");
        sbLIZ.append(str);
        sbLIZ.append(" pageIdentifier=");
        sbLIZ.append(str2);
        sbLIZ.append(" showImmediately=");
        sbLIZ.append(z);
        sbLIZ.append(" hasLogExtra=");
        sbLIZ.append(map != null);
        C2188811AlT.LIZIZ(sbLIZ);
        final C1899950zXd c1899950zXd = new C1899950zXd(enumC1899970zXf, str, str2, str3, map, z, function1, null, null, 15808);
        C1899940zXc.LIZ.getClass();
        C1899940zXc.LIZJ(c1899950zXd);
        if (a0.LJJJIL(str) || a0.LJJJIL(str3)) {
            c1899950zXd.LJI = EnumC1899960zXe.INVALID_PARAMS;
            function1.invoke(C1899920zXa.LIZ(c1899950zXd));
        } else if (C1893550zNJ.LIZ(str2)) {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            Activity activityLJIILL = abstractC1896090zRP != null ? abstractC1896090zRP.LJIILL() : null;
            if (!(activityLJIILL instanceof C19EG) || activityLJIILL == null) {
                c1899950zXd.LJI = EnumC1899960zXe.ROUTE_NOT_MATCHED;
                function1.invoke(C1899920zXa.LIZ(c1899950zXd));
            } else if (C1899920zXa.LIZIZ.putIfAbsent(str, c1899950zXd) != null) {
                c1899950zXd.LJI = EnumC1899960zXe.DUPLICATE_REQUEST;
                function1.invoke(C1899920zXa.LIZ(c1899950zXd));
            } else {
                if (((Number) C05OI.LIZ.getValue()).intValue() < 0 || ((Number) r1.getValue()).intValue() > 0) {
                    C054G c054g = C1899920zXa.LIZJ;
                    AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(c1899950zXd, 1061);
                    AnonymousClass0956 anonymousClass0956 = c1899950zXd.LJIILJJIL;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c1899950zXd.LJIILJJIL = null;
                    c1899950zXd.LJIILJJIL = C23250099c.LIZLLL(c054g, null, null, new C05OH(c1899950zXd, awS572S0100000_28, null), 3);
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("open create session popupIdentifier=");
                sbLIZ2.append(str);
                sbLIZ2.append(" pageIdentifier=");
                sbLIZ2.append(str2);
                C2188811AlT.LIZIZ(sbLIZ2);
                if (z) {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("routeImmediately start popupIdentifier=");
                    sbLIZ3.append(c1899950zXd.LIZIZ);
                    sbLIZ3.append(" pageIdentifier=");
                    sbLIZ3.append(c1899950zXd.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ3);
                    SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(activityLJIILL, c1899950zXd.LIZLLL);
                    smartRouteBuildRoute.withCallback(new OpenResultCallback() { // from class: X.0zXg
                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onActionResult(Object obj) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final /* synthetic */ void onEmpty() {
                            C1951107kb.LIZ(this);
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onIntercept(String str4) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onMatched(String str4) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onMissed(String str4) {
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final /* synthetic */ void onOpen(Intent intent) {
                            C1951107kb.LIZIZ(this, intent);
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onSuccess(Intent intent) {
                            C1899920zXa c1899920zXa2 = C1899920zXa.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("routeImmediately success popupIdentifier=");
                            sbLIZ4.append(c1899950zXd.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            c1899920zXa2.getClass();
                            C1899920zXa.LIZJ(c1899950zXd.LIZIZ, EnumC1899960zXe.SUCCESS);
                        }

                        @Override // com.bytedance.router.OpenResultCallback
                        public final void onFail(String str4, String str5) {
                            C1899920zXa c1899920zXa2 = C1899920zXa.LIZ;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("routeImmediately failed popupIdentifier=");
                            sbLIZ4.append(c1899950zXd.LIZIZ);
                            sbLIZ4.append(" error=");
                            sbLIZ4.append(str5);
                            C2188811AlT.LIZIZ(sbLIZ4);
                            c1899920zXa2.getClass();
                            C1899920zXa.LIZJ(c1899950zXd.LIZIZ, EnumC1899960zXe.ROUTE_OPEN_FAILED);
                        }
                    });
                    smartRouteBuildRoute.open();
                } else {
                    if (c1899950zXd.LJIIIIZZ == null) {
                        C19334410kY c19334410kY = new C19334410kY(c1899950zXd, 0);
                        C1548820qPI.LJFF("referral_popup_show", c19334410kY, UUID.randomUUID().toString());
                        C1548820qPI.LJFF("referral_popup_resource_load_failed", c19334410kY, UUID.randomUUID().toString());
                        c1899950zXd.LJIIIIZZ = c19334410kY;
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("ensureEventSubscription subscribed popupIdentifier=");
                        sbLIZ4.append(c1899950zXd.LIZIZ);
                        C2188811AlT.LIZIZ(sbLIZ4);
                    }
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("preparePopup start popupIdentifier=");
                    sbLIZ5.append(c1899950zXd.LIZIZ);
                    sbLIZ5.append(" pageIdentifier=");
                    sbLIZ5.append(c1899950zXd.LIZJ);
                    C2188811AlT.LIZIZ(sbLIZ5);
                    SparkContext sparkContext = new SparkContext();
                    sparkContext.LJJLIIJ(c1899950zXd.LIZLLL);
                    C1541950qED.LIZJ.getClass();
                    SparkPopup sparkPopupLIZJ = new C1541950qED(activityLJIILL, sparkContext).LIZJ();
                    c1899950zXd.LJII = sparkPopupLIZJ;
                    sparkPopupLIZJ.hS(activityLJIILL, sparkContext, new InterfaceC1538950q9N() { // from class: X.0zXi
                        @Override // X.InterfaceC1538950q9N
                        public final void LJJIZ() {
                            C1899920zXa c1899920zXa2 = C1899920zXa.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("preparePopup preload success popupIdentifier=");
                            sbLIZ6.append(c1899950zXd.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            c1899920zXa2.getClass();
                        }

                        @Override // X.InterfaceC1538950q9N
                        public final void LJJJ(C1542120qEU c1542120qEU) {
                            C1899920zXa c1899920zXa2 = C1899920zXa.LIZ;
                            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                            sbLIZ6.append("preparePopup preload failed popupIdentifier=");
                            sbLIZ6.append(c1899950zXd.LIZIZ);
                            sbLIZ6.append(" error=");
                            sbLIZ6.append(c1542120qEU.LIZIZ);
                            C2188811AlT.LIZIZ(sbLIZ6);
                            c1899920zXa2.getClass();
                            C1899920zXa.LIZJ(c1899950zXd.LIZIZ, EnumC1899960zXe.RESOURCE_LOAD_FAILED);
                        }
                    });
                }
            }
        } else {
            c1899950zXd.LJI = EnumC1899960zXe.PAGE_MISMATCH_ON_CREATE;
            function1.invoke(C1899920zXa.LIZ(c1899950zXd));
        }
        return Unit.LIZ;
    }
}
