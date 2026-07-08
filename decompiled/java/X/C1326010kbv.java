package X;

import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Size;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS104S1000000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1326010kbv implements InterfaceC1321110kU1 {
    public final String LIZ;

    @Override // X.InterfaceC1321110kU1
    public final void LIZJ() {
    }

    @Override // X.InterfaceC1321110kU1
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC1321110kU1
    public final void LJ() {
    }

    public C1326010kbv(String str) {
        this.LIZ = str;
    }

    @Override // X.InterfaceC1321110kU1
    public final C1325710kbR LIZIZ(Uri uri, Object obj) {
        LinkedHashMap linkedHashMap;
        String string = uri.toString();
        SystemClock.elapsedRealtimeNanos();
        Map mapLIZ = C0169003j.LIZ(obj);
        if (mapLIZ != null) {
            linkedHashMap = new LinkedHashMap(mapLIZ);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        if (linkedHashMap.get("page_name") == null) {
            linkedHashMap.put("page_name", this.LIZ);
        }
        C1066210dqt.LIZJ(string, "lynx", linkedHashMap);
        String str = C1326840kdG.LIZ.LIZLLL(string, false).LIZ;
        if (!Intrinsics.LJFF(str, string)) {
            C1066210dqt.LIZJ(str, "lynx", linkedHashMap);
        }
        SystemClock.elapsedRealtimeNanos();
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS104S1000000_20(str, 3));
        C1326230kcH.LIZJ(c01gwLIZIZ);
        return ((C1325700kbQ) c01gwLIZIZ.getValue()).LIZ();
    }

    @Override // X.InterfaceC1321110kU1
    public final String LJFF(String str, Map<String, ? extends Object> map) {
        Object obj;
        String str2;
        Object obj2;
        String str3;
        Object obj3;
        String str4;
        Object obj4;
        String str5 = null;
        if (str == null) {
            return null;
        }
        if (map != null) {
            obj = map.get("ec_biz_scene");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (map != null) {
            obj2 = map.get("page_name");
        } else {
            obj2 = null;
        }
        if (!(obj2 instanceof String) || (str3 = (String) obj2) == null) {
            str3 = this.LIZ;
        }
        if (map != null) {
            obj3 = map.get("order");
        } else {
            obj3 = null;
        }
        if (obj3 instanceof String) {
            str4 = (String) obj3;
        } else {
            str4 = null;
        }
        if (map != null) {
            obj4 = map.get("data_source");
        } else {
            obj4 = null;
        }
        if (obj4 instanceof String) {
            str5 = (String) obj4;
        }
        C1334210kp9.LIZJ(str, str2, str3, str4, str5, 232);
        return str;
    }

    @Override // X.InterfaceC1321110kU1
    public final void LIZ(String str, Context context, C0N7L c0n7l, Pair pair, C21328118dL c21328118dL, Map map, InterfaceC1338120kvS interfaceC1338120kvS) {
        Object obj;
        boolean z;
        Size size = null;
        if (map != null) {
            obj = map.get("ec_biz_scene");
        } else {
            obj = null;
        }
        if (!(obj instanceof String)) {
            obj = null;
        }
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        String strLJFF = LJFF(str, map);
        long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
        if (obj != null && C314740CVk.LIZ.enableLynxForceResize) {
            size = (Size) C20160313uT.LIZIZ().get(obj);
        }
        C1326790kdB.LIZ.getClass();
        C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJFF);
        long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
        c1331670kl3LIZLLL.LJJIJL(context);
        if (((Number) pair.getFirst()).intValue() > 0 && ((Number) pair.getSecond()).intValue() > 0) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            int iIntValue2 = ((Number) pair.getSecond()).intValue();
            c1331670kl3LIZLLL.LJIIIIZZ = iIntValue;
            c1331670kl3LIZLLL.LJIIIZ = iIntValue2;
        } else if (size != null) {
            int width = size.getWidth();
            int height = size.getHeight();
            c1331670kl3LIZLLL.LJIIIIZZ = width;
            c1331670kl3LIZLLL.LJIIIZ = height;
        }
        c1331670kl3LIZLLL.LJJII(new C1339370kxT(interfaceC1338120kvS, 1));
        if (c0n7l == C0N7L.INLINE_IMAGE) {
            z = true;
        } else {
            z = false;
        }
        c21328118dL.LIZ(jElapsedRealtimeNanos2 - jElapsedRealtimeNanos, jElapsedRealtimeNanos3 - jElapsedRealtimeNanos2, SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos3, z);
    }
}
