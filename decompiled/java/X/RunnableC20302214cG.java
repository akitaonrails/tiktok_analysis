package X;

import android.os.Handler;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.14cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class RunnableC20302214cG implements Runnable {
    public String LL = "";
    public String LLILLJJLI = "";
    public long LLILLL;

    public final void LIZ() {
        C20302314cH c20302314cH = C20302314cH.LIZ;
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        long j = this.LLILLL;
        c20302314cH.getClass();
        User userLIZ = C20302314cH.LIZ();
        if (userLIZ != null && (Intrinsics.LJFF(userLIZ.getSecUid(), str) || (userLIZ.getUid() != null && !Intrinsics.LJFF(userLIZ.getUid(), C20302314cH.LJIIJJI)))) {
            C20302314cH.LJIIL = true;
            C20302314cH.LJIIJJI = userLIZ.getUid();
            String str3 = C20302314cH.LJIIJJI;
            C20302314cH.LJFF.put(str3, str2);
            C20302314cH.LJI.storeString(str3, str2);
            C2273401Dyc.LJFF.put(str3, str2);
            C793770VBv.LJII("app_log_isolation", null, new JSONObject().put("retry_times", j), null);
            return;
        }
        if (userLIZ == null || userLIZ.getUid() == null || Intrinsics.LJFF(userLIZ.getUid(), CardStruct.IStatusCode.DEFAULT)) {
            C20302314cH.LJIIJJI = CardStruct.IStatusCode.DEFAULT;
        }
        if (C20302314cH.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("checkCurrentUser: again ");
            sbLIZ.append(j);
            sbLIZ.append(' ');
            sbLIZ.append(C20302314cH.LJIIJJI);
            sbLIZ.append(' ');
            sbLIZ.append(userLIZ != null ? userLIZ.getUid() : null);
            sbLIZ.append(' ');
            sbLIZ.append(str);
            sbLIZ.append(' ');
            sbLIZ.append(userLIZ != null ? userLIZ.getSecUid() : null);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        long j2 = j + 1;
        long j3 = 200;
        if (j2 < 200) {
            RunnableC20302214cG runnableC20302214cG = C20302314cH.LJIILIIL;
            runnableC20302214cG.LLILLL = j2;
            Handler handler = PumbaaWorkerThread.getHandler();
            if (j2 <= 50) {
                j3 = 100;
            } else if (j2 > 100) {
                j3 = j2 <= 150 ? 500L : 1000L;
            }
            C786410Ut5.LJLIIL(j3, handler, runnableC20302214cG);
            return;
        }
        C20302314cH.LIZJ("max", "retry_times_max");
        C793770VBv.LJII("app_log_isolation", null, new JSONObject().put("retry_times", 200L), null);
        C793770VBv.LJII("app_log_isolation", null, new JSONObject().put("cold_boot", C20302314cH.LJIILJJIL ? 1L : 0L), null);
        if (C20302314cH.LJIILJJIL) {
            C20302314cH.LJIILJJIL = false;
        }
        String str4 = C20302314cH.LJIIJJI;
        C20302314cH.LJFF.put(str4, str2);
        C20302314cH.LJI.storeString(str4, str2);
        C2273401Dyc.LJFF.put(str4, str2);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("AppLogIsolationManager$CheckUserRunnable@104b.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AppLogIsolationManager$CheckUserRunnable@104b.run");
    }
}
