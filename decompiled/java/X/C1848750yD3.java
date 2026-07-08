package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yD3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1848750yD3 {
    public final InterfaceC2220701Bvo LIZ;
    public final String LIZIZ;
    public final Gson LIZJ;
    public final Map<String, Pair<String, String>> LIZLLL;
    public volatile long LJ;

    public final boolean LIZ() {
        String str = this.LIZIZ;
        this.LIZ.LJIJJ(a0.LJJZZIII('/', str, str), true);
        return this.LIZ.LJIL(this.LIZIZ, GsonProtectorUtils.toJson(this.LIZJ, this.LIZLLL)).LIZIZ.LIZ;
    }

    public C1848750yD3(InterfaceC2220701Bvo interfaceC2220701Bvo, String str) {
        long length;
        byte[] bytes;
        String str2;
        this.LIZ = interfaceC2220701Bvo;
        this.LIZIZ = str;
        Gson gson = new Gson();
        this.LIZJ = gson;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.LIZLLL = concurrentHashMap;
        C2220231Bv3 c2220231Bv3 = interfaceC2220701Bvo.LJIIZILJ(0, -1, str, Charsets.UTF_8).LIZIZ;
        if (c2220231Bv3.LIZ) {
            Map<String, Object> map = c2220231Bv3.LIZLLL;
            Object obj = map != null ? map.get("data") : null;
            if ((obj instanceof String) && (str2 = (String) obj) != null) {
                if (str2.length() > 0) {
                    concurrentHashMap.putAll((Map) GsonProtectorUtils.fromJson(gson, str2, new TypeToken<Map<String, ? extends Pair<? extends String, ? extends String>>>() { // from class: X.00VR
                    }.getType()));
                }
            } else {
                return;
            }
        }
        Iterator it2 = concurrentHashMap.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            String str3 = (String) ((Pair) it2.next()).getFirst();
            if (str3 != null && (bytes = str3.getBytes(Charsets.UTF_8)) != null) {
                length = bytes.length;
            } else {
                length = 0;
            }
            j += length;
        }
        this.LJ = j;
    }

    public final void LIZIZ(String str, String str2, String str3) {
        long jLIZ;
        String str4;
        Pair pair = (Pair) ((ConcurrentHashMap) this.LIZLLL).put(str, new Pair(str2, str3));
        long j = this.LJ;
        long jLIZ2 = C1848700yCy.LIZ(str2);
        if (pair != null && (str4 = (String) pair.getFirst()) != null) {
            jLIZ = C1848700yCy.LIZ(str4);
        } else {
            jLIZ = 0;
        }
        this.LJ = j + (jLIZ2 - jLIZ);
        if (this.LJ < 0) {
            this.LJ = 0L;
        }
    }
}
