package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oW7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1476170oW7 implements InterfaceC1476200oWA {
    public InterfaceC1476200oWA LIZ;
    public final CopyOnWriteArrayList<InterfaceC1476360oWQ> LIZIZ = new CopyOnWriteArrayList<>();

    @Override // X.InterfaceC1476200oWA
    public final void onStartComplete() {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.onStartComplete();
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final void LIZIZ(C1475790oVV c1475790oVV) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.LIZIZ(c1475790oVV);
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final void LIZLLL(JSONObject jSONObject) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.LIZLLL(jSONObject);
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final HashMap<String, String> LJII(String str) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            return interfaceC1476200oWA.LJII(str);
        }
        return null;
    }

    @Override // X.InterfaceC1476200oWA
    public final void LJIIIIZZ(C1475430oUv c1475430oUv) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.LJIIIIZZ(c1475430oUv);
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final String getCheckSumInfo(String str) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            return interfaceC1476200oWA.getCheckSumInfo(str);
        }
        return null;
    }

    @Override // X.InterfaceC1476200oWA
    public final boolean loadLibrary(String str) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            return interfaceC1476200oWA.loadLibrary(str);
        }
        return false;
    }

    @Override // X.InterfaceC1476200oWA
    public final void LIZ(String str, JSONObject jSONObject) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.LIZ(str, jSONObject);
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final String LJFF(String str, EnumC2281151EQn enumC2281151EQn) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            return interfaceC1476200oWA.LJFF(str, enumC2281151EQn);
        }
        return null;
    }

    @Override // X.InterfaceC1476200oWA
    public final String LIZJ(Map<String, String> map, String str, EnumC2281151EQn enumC2281151EQn) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            return interfaceC1476200oWA.LIZJ(map, str, enumC2281151EQn);
        }
        return null;
    }

    @Override // X.InterfaceC1476200oWA
    public final void LJI(int i, String str, JSONObject jSONObject) {
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.LJI(i, str, jSONObject);
        }
        if (jSONObject != null && i == 0) {
            try {
                long jOptLong = jSONObject.optLong("loader_download_size", 0L);
                String str2 = "";
                int iOptInt = jSONObject.optInt("task_type");
                if (iOptInt == 1) {
                    str2 = "play";
                } else if (iOptInt == 2) {
                    str2 = "preload";
                }
                if (!TextUtils.isEmpty(str2) && jOptLong > 0) {
                    C793770VBv.LJIJ(jOptLong, str2, "video", str2);
                    if (C308260C6m.LIZ()) {
                        C0X4T.LJ(jOptLong, str2);
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    @Override // X.InterfaceC1476200oWA
    public final void LJ(int i, long j, long j2, String str) {
        Iterator<InterfaceC1476360oWQ> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ();
        }
        InterfaceC1476200oWA interfaceC1476200oWA = this.LIZ;
        if (interfaceC1476200oWA != null) {
            interfaceC1476200oWA.LJ(i, j, j2, str);
        }
    }
}
