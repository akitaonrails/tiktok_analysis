package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1058970dfD extends C1543000qFu implements InterfaceC1543060qG0, InterfaceC1058850df1 {
    public final InterfaceC1059000dfG LIZ;
    public final boolean LIZIZ;
    public final ConcurrentHashMap<String, C1051810dTf> LIZJ;
    public final AtomicBoolean LIZLLL;
    public Context LJ;
    public final C01GW LJFF;
    public final Map<String, Class<? extends InterfaceC1063710dmr>> LJI;

    public C1058970dfD() {
        this(null, false, 3);
    }

    @Override // X.C1543000qFu
    public final C1058990dfF LIZLLL() {
        if (!C1544000qHW.LJIIZILJ && this.LIZIZ) {
            return (C1058990dfF) this.LJFF.getValue();
        }
        return null;
    }

    @Override // X.C1543000qFu
    public final List<Class<? extends InterfaceC1063710dmr>> LJI() {
        ArrayList arrayList = new ArrayList();
        Map<String, Class<? extends InterfaceC1063710dmr>> map = this.LJI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            InterfaceC1059000dfG interfaceC1059000dfG = this.LIZ;
            if (interfaceC1059000dfG == null || interfaceC1059000dfG.LIZ((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            arrayList.add(((Map.Entry) it2.next()).getValue());
        }
        return arrayList;
    }

    @Override // X.InterfaceC1543060qG0
    public final void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH) {
        this.LIZLLL.set(true);
        this.LIZJ.clear();
    }

    public C1058970dfD(InterfaceC1059000dfG interfaceC1059000dfG, boolean z) {
        Map<String, Class<? extends InterfaceC1063710dmr>> mapLJJJJJL;
        this.LIZ = interfaceC1059000dfG;
        this.LIZIZ = z;
        this.LIZJ = new ConcurrentHashMap<>();
        this.LIZLLL = new AtomicBoolean(false);
        this.LJFF = C452501pT.LIZIZ(new AwS560S0100000_16(this, 309));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi != null && (mapLJJJJJL = iSparkHostApi.LJJJJJL()) != null) {
            linkedHashMap.putAll(mapLJJJJJL);
        }
        this.LJI = linkedHashMap;
    }

    @Override // X.InterfaceC1543060qG0
    public final void LIZ(Context context, InterfaceC1541990qEH interfaceC1541990qEH) {
        C1543410qGZ c1543410qGZLJIIJ;
        List<Class<? extends InterfaceC1063710dmr>> listLJJJJIZL;
        if (this.LIZIZ) {
            synchronized (this) {
                try {
                    this.LJ = context;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            C1075770e6J c1075770e6J = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
            if (c1075770e6J != null) {
                if (!C1544000qHW.LJIIZILJ) {
                    C1058920df8 c1058920df8 = C1058920df8.LIZ;
                    boolean z = this.LIZIZ;
                    c1058920df8.getClass();
                    List listLJ = C1058920df8.LJ(interfaceC1541990qEH, context, this, z);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : (ArrayList) listLJ) {
                        C650250Pex c650250Pex = (C650250Pex) obj;
                        InterfaceC1059000dfG interfaceC1059000dfG = this.LIZ;
                        if (interfaceC1059000dfG == null || interfaceC1059000dfG.LIZIZ(c650250Pex)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        c1075770e6J.LJIILJJIL((C650250Pex) it2.next());
                    }
                } else {
                    C1058920df8 c1058920df82 = C1058920df8.LIZ;
                    boolean z2 = this.LIZIZ;
                    c1058920df82.getClass();
                    C1058920df8.LJ(interfaceC1541990qEH, context, this, z2);
                }
            }
        } else {
            C1075770e6J c1075770e6J2 = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
            if (c1075770e6J2 != null) {
                if (!C1544000qHW.LJIIZILJ) {
                    C1058920df8.LIZ.getClass();
                    List listLJ2 = C1058920df8.LJ(interfaceC1541990qEH, context, this, false);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : (ArrayList) listLJ2) {
                        C650250Pex c650250Pex2 = (C650250Pex) obj2;
                        InterfaceC1059000dfG interfaceC1059000dfG2 = this.LIZ;
                        if (interfaceC1059000dfG2 == null || interfaceC1059000dfG2.LIZIZ(c650250Pex2)) {
                            arrayList2.add(obj2);
                        }
                    }
                    Iterator it3 = arrayList2.iterator();
                    while (it3.hasNext()) {
                        c1075770e6J2.LJIILJJIL((C650250Pex) it3.next());
                    }
                } else {
                    C1058920df8 c1058920df83 = C1058920df8.LIZ;
                    boolean z3 = this.LIZIZ;
                    c1058920df83.getClass();
                    C1058920df8.LJ(interfaceC1541990qEH, context, this, z3);
                }
            }
        }
        C1075770e6J c1075770e6J3 = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
        if (c1075770e6J3 != null) {
            c1543410qGZLJIIJ = c1075770e6J3.LJIIJ();
        } else {
            c1543410qGZLJIIJ = null;
        }
        C1058920df8.LIZ.getClass();
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        if (iSparkHostApi == null || (listLJJJJIZL = iSparkHostApi.LJJJJIZL()) == null) {
            listLJJJJIZL = C13BV.INSTANCE;
        }
        for (Class<? extends InterfaceC1063710dmr> cls : listLJJJJIZL) {
            if (c1543410qGZLJIIJ != null) {
                c1543410qGZLJIIJ.LJFF(cls, EnumC1063300dmC.ALL);
            }
        }
        C1075770e6J c1075770e6J4 = (C1075770e6J) interfaceC1541990qEH.getHybridContext().LJFF(C1075770e6J.class);
        if (c1075770e6J4 != null) {
            c1075770e6J4.LJIILIIL("crossPlatform");
        }
    }

    @Override // X.InterfaceC1058850df1
    public final void LIZIZ(String str, C1543350qGT c1543350qGT) {
        this.LIZJ.put(str, c1543350qGT);
    }
}
