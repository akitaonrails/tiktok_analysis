package Y;

import X.C13LP;
import X.C1AF0;
import X.C1B58;
import X.C1C7U;
import X.C2188811AlT;
import X.C2191191ApJ;
import X.C2191641Aq2;
import X.C2191681Aq6;
import X.C2191771AqF;
import X.C2192031Aqf;
import X.C2239781ClU;
import X.C2239811ClX;
import X.C2239861Clc;
import X.C2239911Clh;
import X.C786410Ut5;
import X.EnumC2191941AqW;
import X.InterfaceC2191651Aq3;
import X.RunnableC2191761AqE;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ContentValues;
import com.bytedance.applog.priority.PriorityHttpResponse;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.notification.DownloadNotificationService;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS130S0201000_3;
import kotlin.jvm.internal.AwS160S0400000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes35.dex */
public class ARunnableS38S0201000_34 implements Runnable {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        Notification notification;
        DownloadNotificationService downloadNotificationService = (DownloadNotificationService) this.l1;
        NotificationManager notificationManager = (NotificationManager) this.l0;
        int i = this.i2;
        synchronized (downloadNotificationService.LLILLJJLI) {
            try {
                notification = downloadNotificationService.LLILLJJLI.get(i);
                downloadNotificationService.LLILLJJLI.remove(i);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (notification != null) {
            DownloadNotificationService.LIZJ(notificationManager, i, notification);
        }
    }

    public final void LIZ$1() {
        ((C1B58) this.l1).m1();
        if (C1B58.LLILZLL == null) {
            return;
        }
        C1B58 c1b58 = (C1B58) this.l1;
        int i = this.i2;
        ContentValues contentValues = (ContentValues) this.l0;
        c1b58.getClass();
        int i2 = 10;
        while (C1B58.LLILZLL.isDbLockedByCurrentThread() && i2 - 1 >= 0) {
            try {
                try {
                    Thread.sleep(5L);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                return;
            }
        }
        try {
            C1B58.LLILZLL.update("downloader", contentValues, "_id = ? ", new String[]{String.valueOf(i)});
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
        }
    }

    public static final void run$0(ARunnableS38S0201000_34 aRunnableS38S0201000_34) {
        boolean zLIZ;
        C1C7U.LIZ("DownloadNotificationService@f064.doImportantNotify$1");
        try {
            aRunnableS38S0201000_34.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DownloadNotificationService@f064.doImportantNotify$1");
    }

    public static final void run$1(ARunnableS38S0201000_34 aRunnableS38S0201000_34) {
        boolean zLIZ;
        C1C7U.LIZ("DetailBufferPhotoStrategy$HorizontalPageChangeListener@e482.onPageSelected$1$1");
        try {
            try {
                ((C2239781ClU) aRunnableS38S0201000_34.l0).LIZJ((C2239811ClX) aRunnableS38S0201000_34.l1, aRunnableS38S0201000_34.i2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("DetailBufferPhotoStrategy$HorizontalPageChangeListener@e482.onPageSelected$1$1");
    }

    public static final void run$2(ARunnableS38S0201000_34 aRunnableS38S0201000_34) {
        boolean zLIZ;
        C1C7U.LIZ("PhotoStrategy$HorizontalPageChangeListener@85ef.onPageSelected$1$1");
        try {
            ((C2239861Clc) aRunnableS38S0201000_34.l0).LIZLLL((C2239911Clh) aRunnableS38S0201000_34.l1, aRunnableS38S0201000_34.i2);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PhotoStrategy$HorizontalPageChangeListener@85ef.onPageSelected$1$1");
    }

    public static final void run$3(ARunnableS38S0201000_34 aRunnableS38S0201000_34) {
        boolean zLIZ;
        C1C7U.LIZ("SqlDownloadCache@494c.update$1");
        try {
            aRunnableS38S0201000_34.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SqlDownloadCache@494c.update$1");
    }

    public static final void run$4(ARunnableS38S0201000_34 aRunnableS38S0201000_34) throws JSONException {
        Pair<String, String> pairLIZLLL;
        InterfaceC2191651Aq3 interfaceC2191651Aq3 = (InterfaceC2191651Aq3) aRunnableS38S0201000_34.l0;
        int i = aRunnableS38S0201000_34.i2;
        RunnableC2191761AqE runnableC2191761AqE = (RunnableC2191761AqE) aRunnableS38S0201000_34.l1;
        C1C7U.LIZ("Worker@ead6.handleMissedGroups$1L");
        Pair<HashMap<C2191641Aq2, JSONObject>, Boolean> pairLIZJ = interfaceC2191651Aq3.LIZJ(i, 3145728L, 2000, 604800000L, new AwS613S0100000_34(runnableC2191761AqE, 170));
        HashMap<C2191641Aq2, JSONObject> first = pairLIZJ.getFirst();
        boolean zBooleanValue = pairLIZJ.getSecond().booleanValue();
        runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:handleMissedGroups", new AwS130S0201000_3(runnableC2191761AqE, (RunnableC2191761AqE) i, (int) first, (HashMap<C2191641Aq2, JSONObject>) 1));
        if (!first.isEmpty()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("header", C2191771AqF.LJIIJ(runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF, 10));
            C2191771AqF.LIZIZ(jSONObject, first, runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZJ);
            C2191771AqF.LIZJ(jSONObject);
            C2192031Aqf c2192031Aqf = runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ;
            if (c2192031Aqf.LIZLLL) {
                pairLIZLLL = C2191771AqF.LIZLLL(jSONObject, c2192031Aqf.LJ);
            } else {
                pairLIZLLL = null;
            }
            runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF.monitorIncreaseStats("REPORT_REQUEST_COUNT", 1);
            runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF.monitorIncreaseStats("REPORT_REQUEST_MISS_GROUP_COUNT", 1);
            C2191191ApJ c2191191ApJ = runnableC2191761AqE.LLILLJJLI.LIZIZ;
            String str = c2191191ApJ.LIZLLL;
            String str2 = c2191191ApJ.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(str2);
            sbLIZ.append("?app_log_priority=");
            sbLIZ.append(i);
            PriorityHttpResponse priorityHttpResponseDoHttpPost = runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF.doHttpPost(C2188811AlT.LIZIZ(sbLIZ), C786410Ut5.J3(jSONObject).getBytes(Charsets.UTF_8), pairLIZLLL);
            int code = priorityHttpResponseDoHttpPost.getCode();
            if (200 <= code && code < 300) {
                runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZJ.LIZ("Worker:handleMissedGroups", new C2191681Aq6(runnableC2191761AqE, i, first, interfaceC2191651Aq3));
                interfaceC2191651Aq3.LIZIZ(C13LP.LLIIII(first.keySet()));
                C2191771AqF.LJIIIZ(runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF, "3F", first, EnumC2191941AqW.P2, i);
                C2191771AqF.LJII(runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF, i, first);
                runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF.monitorIncreaseStats("priority_request_success_cnt", 1);
                if (!zBooleanValue) {
                    interfaceC2191651Aq3.destroy();
                }
            } else {
                runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZJ.LIZIZ("Worker:handleMissedGroups", null, new AwS160S0400000_34(runnableC2191761AqE, (RunnableC2191761AqE) interfaceC2191651Aq3, (InterfaceC2191651Aq3) first, (HashMap<C2191641Aq2, JSONObject>) priorityHttpResponseDoHttpPost, (PriorityHttpResponse) 2));
                C2191771AqF.LJIIIZ(runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF, "3B", first, EnumC2191941AqW.P2, 0);
                runnableC2191761AqE.LLILLJJLI.LIZIZ.LIZIZ.LJFF.monitorIncreaseStats("priority_request_failed_cnt", 1);
            }
        }
        C1C7U.LIZIZ("Worker@ead6.handleMissedGroups$1L");
    }

    public ARunnableS38S0201000_34(Object obj, Object obj2, int i, int i2) {
        this.$t = i2;
        this.l1 = obj;
        this.l0 = obj2;
        this.i2 = i;
    }
}
