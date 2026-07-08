package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS208S0000000_20;

/* JADX INFO: renamed from: X.0kTq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321000kTq extends C1320560kT8 {
    public static final C1321000kTq LJ = new C1321000kTq();
    public static final boolean LJFF = true;
    public static final Set<InterfaceC1320280kSg> LJI = Collections.newSetFromMap(new ConcurrentHashMap());
    public static final AFwS208S0000000_20 LJII = AFwS208S0000000_20.get$arr$(102);

    @Override // X.C1320560kT8
    public final void LIZ(InterfaceC1320280kSg interfaceC1320280kSg) {
        if (LJFF) {
            synchronized (this) {
                try {
                    LJ.getClass();
                    C19719512Dh.LIZ(LJI).remove(interfaceC1320280kSg);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        C19719512Dh.LIZ(LJI).remove(interfaceC1320280kSg);
    }

    @Override // X.C1320560kT8
    public final void LIZJ(InterfaceC1320280kSg interfaceC1320280kSg) {
        if (LJFF) {
            synchronized (this) {
                try {
                    LJ.getClass();
                    Set<InterfaceC1320280kSg> set = LJI;
                    if (set.add(interfaceC1320280kSg) && set.size() == 1) {
                        C1168320gVa.LIZJ(AFwS208S0000000_20.get$arr$(101));
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return;
        }
        Set<InterfaceC1320280kSg> set2 = LJI;
        if (set2.add(interfaceC1320280kSg) && set2.size() == 1) {
            C1168320gVa.LIZJ(AFwS208S0000000_20.get$arr$(101));
        }
    }
}
