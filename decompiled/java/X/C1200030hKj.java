package X;

import android.os.SystemClock;
import com.ss.android.ugc.aweme.tracker.Step;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0hKj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200030hKj {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public long LIZLLL = SystemClock.elapsedRealtime();
    public String LJ = "active";
    public final Map<String, InterfaceC1199990hKf> LJFF = Collections.synchronizedMap(new LinkedHashMap());

    public final InterfaceC1199990hKf LIZ(String str, boolean z) {
        if (this.LJFF.get(str) == null) {
            this.LJFF.put(str, new Step(str, z, this));
        }
        InterfaceC1199990hKf interfaceC1199990hKf = this.LJFF.get(str);
        if (interfaceC1199990hKf == null) {
            return C1200000hKg.LIZ;
        }
        return interfaceC1199990hKf;
    }

    public C1200030hKj(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
