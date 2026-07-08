package X;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.hometab.base.tabicon.dto.TabDynamicIconInfo;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS195S0000000_9;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NLN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NLN {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(521));
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(520));
    public final List<TabDynamicIconInfo> LIZJ = new ArrayList();
    public final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public final AtomicBoolean LJ = new AtomicBoolean(false);

    public final C0NLU LIZ() {
        return (C0NLU) this.LIZ.getValue();
    }

    public final void LIZIZ() {
        if (this.LIZLLL.get()) {
            return;
        }
        synchronized (C0NLN.class) {
            try {
                if (!this.LIZLLL.get() && this.LIZLLL.compareAndSet(false, true)) {
                    C1330620kjM.LIZ(new InterfaceC589610NAp() { // from class: X.0NAo
                        @Override // X.InterfaceC589610NAp
                        public final Pair LIZ(C1325710kbR c1325710kbR, Object obj, JSONObject jSONObject, boolean z, boolean z2) {
                            Uri uri;
                            if (a0.LJJIIZI(String.valueOf(obj), "dynamic_tab_icon", false)) {
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append("load image, ");
                                sbLIZ.append(obj);
                                sbLIZ.append(", request url: ");
                                if (c1325710kbR != null) {
                                    uri = c1325710kbR.LIZIZ;
                                } else {
                                    uri = null;
                                }
                                sbLIZ.append(uri);
                                sbLIZ.append(", monitorData: ");
                                sbLIZ.append(jSONObject);
                                C2188811AlT.LIZIZ(sbLIZ);
                            }
                            return new Pair(Boolean.FALSE, new LinkedHashMap());
                        }
                    });
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
