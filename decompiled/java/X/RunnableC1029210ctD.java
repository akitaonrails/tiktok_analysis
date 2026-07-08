package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0ctD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class RunnableC1029210ctD implements Runnable {
    public static final /* synthetic */ int LLIZLLLIL = 0;
    public final String LL;
    public final C1029220ctE LLILLJJLI;
    public final String LLILLL;
    public final Context LLILZ;
    public final AtomicInteger LLILZIL = new AtomicInteger(0);
    public final AtomicBoolean LLILZLL = new AtomicBoolean(false);
    public final Map<String, Object> LLIZ = new LinkedHashMap();

    public final void LIZ() {
        String str = this.LLILZLL.get() ? "deeplink_success_new" : "deeplink_failed_new";
        String str2 = this.LL;
        C1029220ctE c1029220ctE = this.LLILLJJLI;
        boolean z = this.LLILZLL.get();
        String str3 = this.LLILLL;
        Context context = this.LLILZ;
        Map<String, Object> map = this.LLIZ;
        AwemeRawAd awemeRawAd = c1029220ctE.LIZ;
        C1022820ciu c1022820ciuLIZLLL = awemeRawAd != null ? C2184171Adz.LIZLLL(str2, str, awemeRawAd) : C2184171Adz.LJ(str2, str, c1029220ctE.LIZIZ, c1029220ctE.LIZJ, c1029220ctE.LIZLLL);
        c1022820ciuLIZLLL.LIZIZ(str3, "app_url");
        if (!z) {
            c1022820ciuLIZLLL.LIZIZ(Integer.valueOf(C1025140cme.LIZLLL(context, UriProtector.parse(str3)) ? 1 : 0), "fail_reason");
        }
        if (map != null) {
            c1022820ciuLIZLLL.LIZ(map);
        }
        c1022820ciuLIZLLL.LJIIIIZZ();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("OpenSchemaSuccessEvent$EventData@3467.run");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OpenSchemaSuccessEvent$EventData@3467.run");
    }

    public RunnableC1029210ctD(String str, C1029220ctE c1029220ctE, int i, String str2, Context context) {
        this.LL = str;
        this.LLILLJJLI = c1029220ctE;
        this.LLILLL = str2;
        this.LLILZ = context;
    }
}
