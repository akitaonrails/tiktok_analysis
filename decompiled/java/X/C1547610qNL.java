package X;

import android.text.TextUtils;
import com.bytedance.geckox.model.CheckRequestBodyModel;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0qNL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547610qNL {
    public static final C1547610qNL LIZ = new C1547610qNL();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(202));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(203));

    public static String LIZIZ() {
        int i = C1551060qSu.LIZ[C1717770unn.LJI().getGeckoEnvironment().ordinal()];
        return i != 1 ? i != 2 ? "225dff975bc950bac45a0effa960e8b8" : "b01ad12d05598203a34287a4d1802c19" : "6769d15c1fc4ebff20d79aebbe0f0cfa";
    }

    public static void LIZ(List list) {
        try {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str = (String) it2.next();
                InterfaceC1547600qNK interfaceC1547600qNKLJI = C1717770unn.LJI();
                LIZ.getClass();
                interfaceC1547600qNKLJI.LJIJI(LIZIZ(), str);
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static void LIZJ(final String str, final String str2, List list) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        String strLIZIZ = LIZIZ();
        C0VSJ c0vsjLJIL = C1717770unn.LJI().LJIL();
        C1537040q6I c1537040q6I = new C1537040q6I(C1717770unn.LIZJ().getApplicationContext());
        c1537040q6I.LJIIIZ = C1717770unn.LJI().getGeckoHost();
        c1537040q6I.LIZJ(C1717770unn.LIZJ().getAppId());
        c1537040q6I.LJII = C1717770unn.LIZJ().getVersionInfo().LIZLLL;
        c1537040q6I.LIZ = C1717770unn.LJI().LJJ();
        c1537040q6I.LJ = new InterfaceC1551450qTX() { // from class: X.0qX6
            @Override // X.InterfaceC1551450qTX
            public final void LIZ(String str3, JSONObject jSONObject) {
                if (!TextUtils.isEmpty(str3)) {
                    ((InterfaceC1713880uhW) ((InterfaceC1547650qNP) C1954707lB.LIZLLL(InterfaceC1713880uhW.class))).onEventV3(str3, jSONObject);
                }
            }
        };
        c1537040q6I.LIZIZ(strLIZIZ);
        c1537040q6I.LIZ(strLIZIZ);
        c1537040q6I.LJIIL = true;
        String deviceId = C1717770unn.LIZJ().getDeviceId();
        if (deviceId == null || deviceId.length() == 0) {
            deviceId = CardStruct.IStatusCode.DEFAULT;
        }
        c1537040q6I.LJIIIIZZ = deviceId;
        c1537040q6I.LJIIJ = c0vsjLJIL;
        C1551950qUL c1551950qULLIZLLL = C1551950qUL.LIZLLL(new C1551530qTf(c1537040q6I));
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new CheckRequestBodyModel.TargetChannel((String) it2.next()));
        }
        c1551950qULLIZLLL.LIZJ(C2097908Jt.LIZJ(new Pair(strLIZIZ, arrayList)), new AbstractC1552040qUU() { // from class: X.09OT
            @Override // X.AbstractC1552040qUU
            public final void LJIILL(UpdatePackage updatePackage) {
                C1905807dI.LIZ("rd_pipo_bnpl_gecko_sync_resource", C2097608Jq.LJIIIIZZ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "1"), new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("biz_type", str), new Pair("offline_type", str2)));
            }

            @Override // X.AbstractC1552040qUU
            public final void LJIIJJI(UpdatePackage updatePackage, Throwable th) {
                C1905807dI.LIZ("rd_pipo_bnpl_gecko_sync_resource", C2097608Jq.LJIIIIZZ(new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, CardStruct.IStatusCode.DEFAULT), new Pair("duration", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis)), new Pair("biz_type", str), new Pair("offline_type", str2)));
            }
        });
    }
}
