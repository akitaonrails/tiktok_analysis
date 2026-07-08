package X;

import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210241Bew {
    public static void LIZ(C2209901BeO c2209901BeO) {
        C2209541Bdo c2209541Bdo;
        if (c2209901BeO != null && (c2209541Bdo = c2209901BeO.LJLIIL) != null) {
            for (InterfaceC2211441Bgs interfaceC2211441Bgs : (CopyOnWriteArrayList) c2209541Bdo.LIZ) {
                if (interfaceC2211441Bgs instanceof AbstractC2210771Bfn) {
                    ((AbstractC2210771Bfn) interfaceC2211441Bgs).LIZ();
                }
            }
        }
    }

    public static JSONObject LIZIZ(C2209941BeS c2209941BeS, JSONObject jSONObject) {
        C2209541Bdo c2209541Bdo;
        C2209901BeO c2209901BeOLIZ = C1BF5.LIZ(c2209941BeS.LLJILJILJ);
        if (c2209901BeOLIZ != null && (c2209541Bdo = c2209901BeOLIZ.LJLIIL) != null) {
            for (InterfaceC2211441Bgs interfaceC2211441Bgs : (CopyOnWriteArrayList) c2209541Bdo.LIZ) {
                if (interfaceC2211441Bgs instanceof AbstractC2210771Bfn) {
                    ((AbstractC2210771Bfn) interfaceC2211441Bgs).LIZLLL(c2209941BeS, jSONObject);
                }
            }
        }
        return jSONObject;
    }
}
