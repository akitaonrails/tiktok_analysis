package X;

import android.util.LruCache;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS223S0000000_32;

/* JADX INFO: renamed from: X.18cM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21322018cM {
    public static final C01GW<ConcurrentHashMap<String, C1154740g9g>> LJI = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(320));
    public final LruCache<String, C21323018cW> LIZ = new LruCache<>(100);
    public final ConcurrentHashMap<String, InterfaceC1540190qBN> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, Set<String>> LIZJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, MynaGeckoChannelPreloadInfo> LIZLLL = new ConcurrentHashMap<>();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(321));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(322));

    public final C21329018dU LIZ(String str) {
        C21329018dU c21329018dU = (C21329018dU) ((ConcurrentHashMap) this.LJ.getValue()).get(str);
        if (c21329018dU == null) {
            C21329018dU c21329018dU2 = new C21329018dU((Object) null);
            ((ConcurrentHashMap) this.LJ.getValue()).put(str, c21329018dU2);
            return c21329018dU2;
        }
        return c21329018dU;
    }
}
