package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AwS578S0100000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Aqe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192021Aqe {
    public final Keva LIZ;
    public final C01GW LIZIZ;

    public final JSONObject LIZ() {
        String stringJustDisk = this.LIZ.getStringJustDisk("data", "");
        if (stringJustDisk.length() == 0) {
            return null;
        }
        try {
            return new JSONObject(stringJustDisk);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C2192021Aqe(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("applog_priority_origin@");
        sbLIZ.append(str);
        sbLIZ.append("_config");
        this.LIZ = KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 0);
        this.LIZIZ = C452501pT.LIZIZ(new AwS578S0100000_34(this, 224));
    }

    public final void LIZIZ(C2191841AqM c2191841AqM) {
        ((Set) this.LIZIZ.getValue()).clear();
        Set set = c2191841AqM.LIZLLL;
        if (set == null) {
            set = C08CX.INSTANCE;
        }
        if (set.isEmpty()) {
            return;
        }
        ((Set) this.LIZIZ.getValue()).addAll(set);
        Keva keva = this.LIZ;
        Set set2 = (Set) this.LIZIZ.getValue();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((EnumC2191921AqU) it2.next()).getAlias());
        }
        keva.storeStringSetJustDisk("fast_match_event_types", C13LP.LLIIJI(arrayList));
    }
}
