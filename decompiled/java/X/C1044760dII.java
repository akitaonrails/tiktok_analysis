package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS132S1200000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044760dII {
    public final C1044770dIJ LIZ;
    public final Function0<Unit> LIZIZ;

    public final void LIZIZ() {
        if (C622680Oba.LIZ(this)) {
            C622680Oba.LIZLLL(this);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("EventBus unregistered, enterFrom=");
            sbLIZ.append(this.LIZ.LJI);
            C1022620cia.LIZ("ShoppingTaskReportHelper", C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    public final void LIZ(Context context) {
        C622680Oba.LIZJ(this);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EventBus registered, enterFrom=");
        sbLIZ.append(this.LIZ.LJI);
        C1022620cia.LIZ("ShoppingTaskReportHelper", C2188811AlT.LIZIZ(sbLIZ));
        C1047660dMy c1047660dMy = C1047660dMy.LIZIZ;
        C1044770dIJ c1044770dIJ = this.LIZ;
        String str = c1044770dIJ.LJI;
        String str2 = c1044770dIJ.LIZ;
        String str3 = c1044770dIJ.LIZIZ;
        String strJ3 = C786410Ut5.J3(new JSONObject(this.LIZ.LJII));
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.LIZ.LJIIIIZZ);
        linkedHashMap.put("cid", this.LIZ.LIZIZ);
        linkedHashMap.put("reqId", this.LIZ.LJ);
        linkedHashMap.put("rit", this.LIZ.LJFF);
        c1047660dMy.h3(context, str, str2, str2, null, null, str3, strJ3, linkedHashMap, null);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void handleBroadcastNotification(C484220Iyq c484220Iyq) {
        Object c098200Yq;
        Object c098200Yq2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleBroadcastNotification: ");
        sbLIZ.append(c484220Iyq);
        C1022620cia.LIZ("ShoppingTaskReportHelper", C2188811AlT.LIZIZ(sbLIZ));
        try {
            c098200Yq = JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "eventName");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl == null) {
            try {
                c098200Yq2 = new JSONObject(JSONObjectProtectorUtils.getString(c484220Iyq.LIZ, "data")).optString("report_from");
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                c098200Yq2 = new C098200Yq(th2);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            Throwable thM5exceptionOrNullimpl2 = C189200o6.m5exceptionOrNullimpl(c098200Yq2);
            if (thM5exceptionOrNullimpl2 == null) {
                if (Intrinsics.LJFF(c098200Yq, "adVideoReportSuccess") && Intrinsics.LJFF(c098200Yq2, this.LIZ.LJI)) {
                    LIZIZ();
                    C1022620cia.LJ("ShoppingTaskReportHelper", "report success, enterFrom=" + this.LIZ.LJI);
                    this.LIZIZ.invoke();
                    return;
                }
                return;
            }
            C1022620cia.LIZJ("ShoppingTaskReportHelper", thM5exceptionOrNullimpl2);
            return;
        }
        C1022620cia.LIZJ("ShoppingTaskReportHelper", thM5exceptionOrNullimpl);
    }

    public C1044760dII(C1044770dIJ c1044770dIJ, AwS132S1200000_16 awS132S1200000_16) {
        this.LIZ = c1044770dIJ;
        this.LIZIZ = awS132S1200000_16;
    }
}
