package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OF5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OF5 {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZIZ(C1252380ihA c1252380ihA) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("user_id", c1252380ihA.LIZ);
        linkedHashMap.put("sec_user_id", c1252380ihA.LIZIZ);
        linkedHashMap.put("type", String.valueOf(c1252380ihA.LIZLLL));
        String str = c1252380ihA.LJI;
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("channel_id", String.valueOf(C737370SwB.LIZ(str)));
        linkedHashMap.put("from", String.valueOf(c1252380ihA.LJ));
        if (Intrinsics.LJFF(linkedHashMap.get("type"), "1")) {
            linkedHashMap.put("from_pre", String.valueOf(C19212010Ec.LIZJ.LJIJJLI(String.valueOf(c1252380ihA.LJ), String.valueOf(c1252380ihA.LJFF))));
            if (C123100dR.LIZ(c1252380ihA.LIZJ)) {
                linkedHashMap.put("context_owner_user_id", c1252380ihA.LIZJ);
            }
        } else {
            linkedHashMap.put("from_pre", String.valueOf(c1252380ihA.LJFF));
        }
        if (C123100dR.LIZ(c1252380ihA.LJIILLIIL)) {
            String str2 = c1252380ihA.LJIILLIIL;
            if (str2 != null) {
                linkedHashMap.put("rec_type", str2);
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        String str3 = c1252380ihA.LJII;
        if (str3 != null) {
            linkedHashMap.put("item_id", str3);
        }
        Map<String, String> map = c1252380ihA.LJIIL;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        linkedHashMap.put("action_time", String.valueOf(System.currentTimeMillis()));
        C844470XAv.LIZ.getClass();
        linkedHashMap.put("is_network_available", String.valueOf(C0XF1.LIZLLL(C844470XAv.LIZ())));
        return linkedHashMap;
    }

    public static InterfaceC346201Wa LIZ(final String str, Map map) {
        C613960O6g c613960O6gLIZ = C613940O6e.LIZ().LIZ(new C613130O3b(map));
        C0O7F.LJ(c613960O6gLIZ, new InterfaceC613660O5c<C613150O3d>() { // from class: X.0O5e
            @Override // X.InterfaceC613660O5c
            public final C613670O5d<C613150O3d> LIZ(C613670O5d<C613150O3d> c613670O5d) {
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c613670O5d.LIZ);
                if (thM5exceptionOrNullimpl != null && !(thM5exceptionOrNullimpl instanceof TimeoutException)) {
                    return new C613670O5d<>(c613670O5d.LIZ, new C613690O5f(0, true, 2));
                }
                return c613670O5d;
            }
        });
        C0O7F.LIZ(c613960O6gLIZ, new AbstractC614210O7f(str) { // from class: X.0O7m
            public final String LIZIZ;
            public final C614270O7l LIZJ;

            @Override // X.InterfaceC614350O7t
            public final String LIZ() {
                return this.LIZIZ;
            }

            @Override // X.AbstractC614210O7f
            public final AbstractC614250O7j LIZIZ() {
                return this.LIZJ;
            }

            {
                this.LIZIZ = str;
                C614270O7l c614270O7l = C614270O7l.LIZIZ;
                c614270O7l.LIZ = C614260O7k.LIZIZ.LIZ | c614270O7l.LIZ;
                this.LIZJ = c614270O7l;
            }
        });
        return c613960O6gLIZ.LIZIZ();
    }
}
