package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import com.tiktok.ttkmedia.configcenter.ConfigCenter;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oLE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1469420oLE {
    public static volatile int LIZ;

    public static final void LIZ(C308310C6r c308310C6r) {
        try {
            if (c308310C6r.LIZ >= 40000) {
                LIZIZ(null, c308310C6r);
                int i = c308310C6r.LIZ;
                if (50000 <= i && i < 60001) {
                    LJ(c308310C6r);
                    return;
                }
                return;
            }
            LJ(c308310C6r);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJ(C308310C6r c308310C6r) {
        int i = c308310C6r.LIZJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        if (i == 6) {
                            TTVideoEngine.LLILLJJLI(c308310C6r.LIZ, ((JSONArray) c308310C6r.LIZIZ).toString());
                            return;
                        }
                        return;
                    }
                    TTVideoEngine.LLILLJJLI(c308310C6r.LIZ, C786410Ut5.J3((JSONObject) c308310C6r.LIZIZ));
                    return;
                }
                TTVideoEngine.LLILLJJLI(c308310C6r.LIZ, (String) c308310C6r.LIZIZ);
                return;
            }
            TTVideoEngine.LLIIIILZ(c308310C6r.LIZ, ((Long) c308310C6r.LIZIZ).longValue());
            return;
        }
        TTVideoEngine.LLFII(c308310C6r.LIZ, ((Integer) c308310C6r.LIZIZ).intValue());
    }

    public static void LIZIZ(InterfaceC1467440oI2 interfaceC1467440oI2, C308310C6r c308310C6r) {
        if (interfaceC1467440oI2 == null) {
            interfaceC1467440oI2 = ConfigCenter.LJI().LIZ;
        }
        switch (c308310C6r.LIZJ) {
            case 1:
                interfaceC1467440oI2.LIZJ(c308310C6r.LIZ, ((Integer) c308310C6r.LIZIZ).intValue());
                break;
            case 2:
                interfaceC1467440oI2.LIZIZ(c308310C6r.LIZ, ((Long) c308310C6r.LIZIZ).longValue());
                break;
            case 3:
                interfaceC1467440oI2.LJFF(((Float) c308310C6r.LIZIZ).floatValue(), c308310C6r.LIZ);
                break;
            case 4:
                interfaceC1467440oI2.LIZ(c308310C6r.LIZ, (String) c308310C6r.LIZIZ);
                break;
            case 5:
                interfaceC1467440oI2.LJ(c308310C6r.LIZ, (JSONObject) c308310C6r.LIZIZ);
                break;
            case 6:
                interfaceC1467440oI2.LIZ(c308310C6r.LIZ, ((JSONArray) c308310C6r.LIZIZ).toString());
                break;
        }
    }

    public static final void LIZLLL(InterfaceC1467440oI2 interfaceC1467440oI2, List<? extends C308310C6r> list) {
        if (list != null && !list.isEmpty()) {
            for (C308310C6r c308310C6r : list) {
                if (c308310C6r.LIZIZ != null) {
                    try {
                        LIZIZ(interfaceC1467440oI2, c308310C6r);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }

    public static final void LIZJ(InterfaceC1467440oI2 interfaceC1467440oI2, List<? extends C308310C6r> list, boolean z) {
        if (list != null && !list.isEmpty()) {
            int iLLIZ = C1474810oTv.LLIZ();
            int iLLILZLL = C1474810oTv.LLILZLL();
            for (C308310C6r c308310C6r : list) {
                if (c308310C6r.LIZIZ != null) {
                    try {
                        int i = c308310C6r.LIZ;
                        if (iLLILZLL <= i && i <= iLLIZ) {
                            LIZIZ(interfaceC1467440oI2, c308310C6r);
                        } else if (z) {
                            LIZ(c308310C6r);
                        }
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
        }
    }
}
