package X;

import com.ss.android.ugc.feed.platform.componentmanager.FcpNodeProtocol;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Reg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C701040Reg {
    public final String LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C701200Rew());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C701210Rex());
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(19));

    public final ConcurrentHashMap<String, C700970ReZ> LIZIZ() {
        return (ConcurrentHashMap) this.LIZIZ.getValue();
    }

    public final ConcurrentHashMap<String, InterfaceC700010Rd1> LIZLLL() {
        return (ConcurrentHashMap) this.LIZJ.getValue();
    }

    public final ConcurrentHashMap<String, FcpNodeProtocol> LJFF() {
        return (ConcurrentHashMap) this.LIZLLL.getValue();
    }

    public C701040Reg(String str) {
        this.LIZ = str;
    }

    public final C700970ReZ LIZ(String str) {
        if (str != null && str.length() != 0) {
            return LIZIZ().get(str);
        }
        return null;
    }

    public final InterfaceC700010Rd1 LIZJ(String str) {
        if (str != null && str.length() != 0) {
            return LIZLLL().get(str);
        }
        return null;
    }

    public final FcpNodeProtocol LJ(String str) {
        if (str != null && str.length() != 0) {
            return LJFF().get(str);
        }
        return null;
    }

    public final void LJI(String str, InterfaceC700010Rd1 interfaceC700010Rd1) {
        if (str != null && str.length() != 0 && interfaceC700010Rd1 != null) {
            LIZLLL().put(str, interfaceC700010Rd1);
        }
    }
}
