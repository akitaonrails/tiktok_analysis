package X;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.i18n.region.privacy.PrivacyDataCacheEntry;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0TVg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C747860TVg {
    public final SharedPreferences LIZ;
    public final Gson LIZIZ = new Gson();

    public final List<PrivacyDataCacheEntry> LIZIZ() {
        SharedPreferences sharedPreferences = this.LIZ;
        Set<String> set = C08CX.INSTANCE;
        Set<String> stringSet = sharedPreferences.getStringSet("privacy_data_key_index", set);
        if (stringSet != null) {
            set = stringSet;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = set.iterator();
        while (it2.hasNext()) {
            PrivacyDataCacheEntry privacyDataCacheEntryLIZJ = LIZJ((String) it2.next());
            if (privacyDataCacheEntryLIZJ != null) {
                arrayList.add(privacyDataCacheEntryLIZJ);
            }
        }
        return arrayList;
    }

    public C747860TVg(Context context) {
        this.LIZ = C810670Vr7.LIZJ(context, 0, "pns_privacy_data_cache");
    }

    public static String LIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("privacy_data_entry_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final PrivacyDataCacheEntry LIZJ(String str) {
        Object c098200Yq;
        Object obj = null;
        String string = this.LIZ.getString(LIZ(str), null);
        if (string == null) {
            return null;
        }
        try {
            c098200Yq = (PrivacyDataCacheEntry) this.LIZIZ.LJII(string, PrivacyDataCacheEntry.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        return (PrivacyDataCacheEntry) obj;
    }
}
