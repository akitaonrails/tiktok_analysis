package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0Rbf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C699170Rbf implements InterfaceC699890Rcp {
    public final EnumC699120Rba LIZ;
    public final ConcurrentHashMap<EnumC699150Rbd, Set<C699770Rcd>> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZJ() {
        if (C2770015k.LIZ()) {
            synchronized (this.LIZIZ) {
                try {
                    this.LIZIZ.clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public C699170Rbf(EnumC699120Rba enumC699120Rba) {
        this.LIZ = enumC699120Rba;
    }

    public final Set<C699770Rcd> LIZ(EnumC699150Rbd enumC699150Rbd) {
        Set<C699770Rcd> setLLIIJI;
        if (!C2770015k.LIZ()) {
            return C08CX.INSTANCE;
        }
        try {
            synchronized (this.LIZIZ) {
                try {
                    Set<C699770Rcd> set = this.LIZIZ.get(enumC699150Rbd);
                    if (set == null || (setLLIIJI = C13LP.LLIIJI(set)) == null) {
                        setLLIIJI = C08CX.INSTANCE;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            return setLLIIJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "FunnelData collect exception");
            return C08CX.INSTANCE;
        }
    }

    public final void LIZIZ(Aweme aweme, EnumC699150Rbd enumC699150Rbd, List<C699770Rcd> list) {
        String aid;
        if (!C2770015k.LIZ()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("record: aid=");
        if (aweme != null) {
            aid = aweme.getAid();
        } else {
            aid = null;
        }
        sbLIZ.append(aid);
        sbLIZ.append(" type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" step=");
        sbLIZ.append(enumC699150Rbd);
        sbLIZ.append(" dataList=");
        sbLIZ.append(list);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("FunnelData");
        sbLIZ2.append(": ");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (list.isEmpty()) {
            return;
        }
        try {
            synchronized (this.LIZIZ) {
                try {
                    Set<C699770Rcd> linkedHashSet = this.LIZIZ.get(enumC699150Rbd);
                    if (linkedHashSet == null) {
                        linkedHashSet = new LinkedHashSet<>();
                        this.LIZIZ.put(enumC699150Rbd, linkedHashSet);
                    }
                    linkedHashSet.addAll(list);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "FunnelData record exception");
        }
    }
}
