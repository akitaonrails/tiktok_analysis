package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.056s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12996056s implements InterfaceC12999056v {
    public final String LIZ;
    public final C12992056o LIZIZ;
    public final Map<EnumC12995056r, InterfaceC12997056t> LIZJ;

    @Override // X.InterfaceC12999056v
    public final Set<EnumC12995056r> LIZJ() {
        return this.LIZJ.keySet();
    }

    public final void LJFF() {
        AnonymousClass0571 anonymousClass0571;
        C13002056y c13002056y = C13002056y.LIZ;
        String str = this.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13002056y.getClass();
        if (str.length() != 0) {
            C13002056y.LIZJ();
            synchronized (C13002056y.LIZJ) {
                try {
                    anonymousClass0571 = C13002056y.LIZLLL;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (anonymousClass0571 == null || str.length() == 0) {
                return;
            }
            Keva kevaLIZ = anonymousClass0571.LIZ();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("last_local_update_ms_");
            sbLIZ.append(str);
            kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ), jCurrentTimeMillis);
        }
    }

    @Override // X.InterfaceC12999056v
    public final List<InterfaceC12997056t> LIZ(EnumC12995056r enumC12995056r) {
        List<InterfaceC12997056t> listSingletonList;
        InterfaceC12997056t interfaceC12997056t = this.LIZJ.get(enumC12995056r);
        if (interfaceC12997056t == null || (listSingletonList = Collections.singletonList(interfaceC12997056t)) == null) {
            return C13BV.INSTANCE;
        }
        return listSingletonList;
    }

    @Override // X.InterfaceC12999056v
    public final void LIZLLL(EnumC12995056r enumC12995056r, String str) {
        InterfaceC12997056t interfaceC12997056t = this.LIZJ.get(enumC12995056r);
        if (interfaceC12997056t == null) {
            return;
        }
        interfaceC12997056t.LIZJ(str);
        LJFF();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C12996056s(String str, C12992056o c12992056o, Map<EnumC12995056r, ? extends InterfaceC12997056t> map) {
        this.LIZ = str;
        this.LIZIZ = c12992056o;
        this.LIZJ = map;
    }

    @Override // X.InterfaceC12999056v
    public final boolean LIZIZ(EnumC12995056r enumC12995056r, String str, long j) {
        InterfaceC12997056t interfaceC12997056t = this.LIZJ.get(enumC12995056r);
        if (interfaceC12997056t != null) {
            return interfaceC12997056t.LIZIZ(j, str);
        }
        return false;
    }

    @Override // X.InterfaceC12999056v
    public final void LJ(EnumC12995056r enumC12995056r, String str, long j, long j2) {
        InterfaceC12997056t interfaceC12997056t = this.LIZJ.get(enumC12995056r);
        if (interfaceC12997056t == null) {
            return;
        }
        interfaceC12997056t.LIZLLL(j, j2, str);
        LJFF();
    }
}
