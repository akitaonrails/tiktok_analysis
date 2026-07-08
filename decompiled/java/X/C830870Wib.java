package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C830870Wib implements InterfaceC830890Wid {
    public final String LIZ;
    public final List<AbstractC2213701BkW> LIZIZ;
    public Object LIZJ;
    public C830930Wih LIZLLL;
    public final Map<String, List<InterfaceC830810WiV>> LJ;
    public ConcurrentLinkedQueue<C830830WiX> LJFF;
    public final Map<String, Map<String, Object>> LJI;

    public C830870Wib() {
        throw null;
    }

    @Override // X.InterfaceC830890Wid
    public final List<InterfaceC830900Wie> LIZJ() {
        return C19719512Dh.LIZIZ(this.LIZIZ);
    }

    @Override // X.InterfaceC830890Wid
    public final String getSceneKey() {
        return this.LIZ;
    }

    @Override // X.InterfaceC830890Wid
    public final Map<String, Object> LIZ(String str) {
        try {
            return (Map) ((LinkedHashMap) this.LJI).get(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    @Override // X.InterfaceC830890Wid
    public final AbstractC2213701BkW LIZIZ(String str) {
        for (AbstractC2213701BkW abstractC2213701BkW : this.LIZIZ) {
            if (Intrinsics.LJFF(abstractC2213701BkW.LIZIZ, str)) {
                return abstractC2213701BkW;
            }
        }
        return null;
    }

    public C830870Wib(String str, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = null;
        this.LIZLLL = null;
        this.LJ = linkedHashMap;
        this.LJFF = null;
        this.LJI = new LinkedHashMap();
    }

    @Override // X.InterfaceC830890Wid
    public final Object LIZLLL(String str, String str2) {
        Object obj = null;
        try {
            Map map = (Map) ((LinkedHashMap) this.LJI).get(str);
            if (map != null) {
                obj = map.get(str2);
                return obj;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return obj;
    }
}
