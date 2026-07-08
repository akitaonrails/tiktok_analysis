package Y;

import X.C087R;
import X.C1637890six;
import X.C1C7U;
import X.C543670LTx;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ACallableS12S0010000_3 implements Callable {
    public final int $t;
    public boolean z0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public ACallableS12S0010000_3(int i) {
        this.$t = i;
        this.z0 = true;
    }

    public static final Object call$0(ACallableS12S0010000_3 aCallableS12S0010000_3) {
        String str;
        C1C7U.LIZ("ZipUrlMonitor@c8fc.monitorZipUrl$1");
        try {
            JSONObject jSONObject = new JSONObject();
            if (aCallableS12S0010000_3.z0) {
                str = CardStruct.IStatusCode.DEFAULT;
            } else {
                str = "1";
            }
            jSONObject.put("zipUrlIsNull", str);
            C543670LTx c543670LTx = new C543670LTx();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    c543670LTx.LIZLLL(next, JSONObjectProtectorUtils.getString(jSONObject, next));
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            C1637890six.LJ("hash_tag_zip_url", 0, c543670LTx.LJ());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ZipUrlMonitor@c8fc.monitorZipUrl$1");
        return unit;
    }

    public static final Object call$1(ACallableS12S0010000_3 aCallableS12S0010000_3) {
        C1C7U.LIZ("CollectMusicCacheManager@9cb9.setMusicCollectCacheDirtyAsync$1$1");
        C087R.LIZ.getClass();
        Map<String, ?> all = C087R.LIZ().getAll();
        boolean z = aCallableS12S0010000_3.z0;
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            C087R.LIZ.getClass();
            C087R.LIZ().storeBoolean(entry.getKey(), z);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CollectMusicCacheManager@9cb9.setMusicCollectCacheDirtyAsync$1$1");
        return unit;
    }

    public ACallableS12S0010000_3(boolean z, int i) {
        this.$t = i;
        this.z0 = z;
    }
}
