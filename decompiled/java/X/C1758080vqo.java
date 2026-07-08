package X;

import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vqo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1758080vqo {
    public final EnumC1758060vqm LIZ;
    public final InterfaceC665370Q7z LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(371));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(370));
    public boolean LJ;

    public final ConcurrentHashMap<String, Integer> LIZJ() {
        return (ConcurrentHashMap) this.LIZLLL.getValue();
    }

    public final ConcurrentHashSet<String> LIZLLL() {
        return (ConcurrentHashSet) this.LIZJ.getValue();
    }

    public final String LIZ() {
        return C13LP.LJJLIIIJ(C2097808Js.LJIL(LIZJ()), ",", null, null, 0, null, AnonymousClass0207.get$arr$(86), 30);
    }

    public final String LIZIZ() {
        return C13LP.LJJLIIIJ(C13LP.LLIIII(LIZLLL()), ",", null, null, 0, null, null, 62);
    }

    public final boolean LJI(String str) {
        Integer num = LIZJ().get(str);
        if (num != null && num.intValue() == 4) {
            return true;
        }
        return false;
    }

    public C1758080vqo(EnumC1758060vqm enumC1758060vqm, InterfaceC665370Q7z interfaceC665370Q7z) {
        this.LIZ = enumC1758060vqm;
        this.LIZIZ = interfaceC665370Q7z;
    }

    public final void LJFF(String str, String str2) {
        if (this.LJ) {
            return;
        }
        if (Intrinsics.LJFF(str2, "Myna") && !LIZJ().contains(str)) {
            LIZJ().put(str, 4);
        }
        if (!LIZLLL().contains(str)) {
            LIZLLL().add(str);
        }
    }

    public final void LJ(String str, String str2, boolean z) {
        int i;
        if (!this.LJ && Intrinsics.LJFF(str2, "Myna") && LJI(str)) {
            ConcurrentHashMap<String, Integer> concurrentHashMapLIZJ = LIZJ();
            if (z) {
                i = 1;
            } else {
                i = 2;
            }
            concurrentHashMapLIZJ.put(str, Integer.valueOf(i));
        }
    }
}
