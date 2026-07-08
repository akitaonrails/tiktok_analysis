package X;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0SrU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C734460SrU {
    public final String LIZ;
    public final String LIZIZ = "ttk_aweme_digg_full_monitor";
    public final ConcurrentHashMap<String, Object> LIZJ = new ConcurrentHashMap<>();
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(462));

    public C734460SrU(String str) {
        this.LIZ = str;
    }

    public final Object LIZ(String str) {
        return this.LIZJ.get(str);
    }

    public final void LIZIZ(String str, Object obj) {
        this.LIZJ.put(str, obj);
    }
}
