package X;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0k0P, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1302750k0P {
    public List<C1302410jzr> LIZ;
    public final AnonymousClass0955<? super List<C1302410jzr>> LIZIZ;
    public final HashMap<Integer, C1302410jzr> LIZJ = new HashMap<>();
    public final HashMap<String, C1302410jzr> LIZLLL = new HashMap<>();

    public C1302750k0P(List<C1302410jzr> list, AnonymousClass0955<? super List<C1302410jzr>> anonymousClass0955) {
        this.LIZ = list;
        this.LIZIZ = anonymousClass0955;
        for (C1302410jzr c1302410jzr : this.LIZ) {
            if (c1302410jzr.LIZJ()) {
                this.LIZLLL.put(c1302410jzr.LL.toString(), c1302410jzr);
            } else {
                this.LIZJ.put(Integer.valueOf(c1302410jzr.LLILLJJLI), c1302410jzr);
            }
        }
    }
}
