package X;

import com.bytedance.ies.ugc.ttkvstorageapi.IUserAccount;
import com.bytedance.ies.ugc.ttkvstorageimpl.UserAccountImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Map;
import kotlin.text.u;

/* JADX INFO: renamed from: X.1ArB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2192351ArB {
    public static final C2192351ArB LIZ = new C2192351ArB();
    public static final HashMap<String, HashMap<String, C2192371ArD>> LIZIZ = new HashMap<>();
    public static final HashMap<String, HashMap<String, C2192371ArD>> LIZJ = new HashMap<>();

    public static HashMap LIZ(String str, EnumC20429814wq enumC20429814wq) {
        String currentUid;
        HashMap<String, C2192371ArD> map = C2192361ArC.LIZ;
        HashMap<String, HashMap<String, C2192371ArD>> map2 = LIZIZ;
        if (enumC20429814wq == EnumC20429814wq.SP) {
            map = C2192361ArC.LIZIZ;
            map2 = LIZJ;
        }
        if (map.containsKey(str)) {
            if (C2192411ArH.LIZ == null) {
                C2192411ArH.LIZ = UserAccountImpl.LIZIZ();
            }
            IUserAccount iUserAccount = C2192411ArH.LIZ;
            if (iUserAccount == null || (currentUid = iUserAccount.getCurrentUid()) == null) {
                currentUid = UserAccountImpl.LIZIZ().getCurrentUid();
            }
            HashMap<String, C2192371ArD> map3 = map2.get(currentUid);
            if (map3 == null) {
                synchronized (map2) {
                    try {
                        map3 = new HashMap<>();
                        map2.put(currentUid, map3);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            HashMap<String, C2192371ArD> map4 = map3;
            if (!map4.containsKey(str)) {
                C2192351ArB c2192351ArB = LIZ;
                C2192371ArD c2192371ArD = map.get(str);
                c2192351ArB.getClass();
                if (c2192371ArD != null) {
                    HashMap<String, C2192371ArD> map5 = map2.get(currentUid);
                    if (map5 == null) {
                        map5 = new HashMap<>();
                    }
                    HashMap<String, String> map6 = c2192371ArD.LIZ;
                    HashMap map7 = new HashMap();
                    for (Map.Entry<String, String> entry : map6.entrySet()) {
                        map7.put(entry.getKey(), u.LJJIFFI(entry.getValue(), "{%uid}", currentUid, false));
                    }
                    map5.put(str, new C2192371ArD(map7));
                    map2.put(currentUid, map5);
                }
            }
            return map4;
        }
        return null;
    }
}
