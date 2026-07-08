package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.jvm.internal.AwS558S0100000_14;

/* JADX INFO: renamed from: X.0Ypw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C886380Ypw implements C0Z76 {
    public static final C01GW<C886380Ypw> LJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(428));
    public final InterfaceC1493105sv LIZ;
    public final C01GW LIZIZ;
    public final Map<String, Object> LIZJ;
    public boolean LIZLLL;

    public C886380Ypw() {
        this(0);
    }

    public C886380Ypw(int i) {
        this.LIZ = null;
        this.LIZIZ = C452501pT.LIZIZ(new AwS558S0100000_14(this, 1419));
        this.LIZJ = new LinkedHashMap();
    }

    @Override // X.C0Z76
    public final void LIZ(long j) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZJ.put("bind_whole", Long.valueOf(j));
        this.LIZLLL = true;
        Map<String, Object> map = this.LIZJ;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            arrayList.add(new Pair(entry.getKey(), entry.getValue().toString()));
        }
        Map mapLJIILLIIL = C2097608Jq.LJIILLIIL(arrayList);
        ((LinkedHashMap) this.LIZJ).clear();
        C1535505zl c1535505zl = new C1535505zl(mapLJIILLIIL, this, null);
        String.valueOf(System.currentTimeMillis());
        C885150Ynx.LIZ().LIZ().LJI(c1535505zl);
    }

    @Override // X.C0Z76
    public final void LIZIZ(String str) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZJ.put("view_holder_type", str);
    }

    @Override // X.C0Z76
    public final void LIZJ(long j) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZJ.put("bind_left", Long.valueOf(j));
    }

    @Override // X.C0Z76
    public final void LIZLLL(long j) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZJ.put("bind_right", Long.valueOf(j));
    }

    @Override // X.C0Z76
    public final void LJ(long j) {
        if (this.LIZLLL) {
            return;
        }
        this.LIZJ.put("bind_middle", Long.valueOf(j));
    }
}
