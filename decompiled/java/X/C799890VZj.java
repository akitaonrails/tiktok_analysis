package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VZj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C799890VZj {
    public final List<InterfaceC800080Va2> LIZ = Collections.synchronizedList(new ArrayList());
    public final List<InterfaceC800080Va2> LIZIZ = Collections.synchronizedList(new ArrayList());
    public final List<InterfaceC800080Va2> LIZJ = Collections.synchronizedList(new ArrayList());
    public final ConcurrentHashMap<InterfaceC800080Va2, EnumC799980VZs> LIZLLL = new ConcurrentHashMap<>();

    public final void LIZIZ() {
        this.LIZ.addAll(0, this.LIZJ);
        this.LIZ.addAll(this.LIZIZ);
        for (InterfaceC800080Va2 interfaceC800080Va2 : this.LIZ) {
            EnumC799980VZs enumC799980VZs = this.LIZLLL.get(interfaceC800080Va2);
            C799900VZk c799900VZk = C799900VZk.LIZ;
            c799900VZk.getClass();
            InterfaceC799860VZg interfaceC799860VZg = C799900VZk.LJI;
            if (interfaceC799860VZg != null) {
                interfaceC799860VZg.LIZJ(interfaceC800080Va2);
            }
            c799900VZk.getClass();
            HashMap<EnumC799980VZs, InterfaceC800100Va4> map = C799900VZk.LJIIIIZZ;
            InterfaceC800100Va4 interfaceC800100Va4 = map.get(enumC799980VZs);
            if (interfaceC800100Va4 != null) {
                interfaceC800100Va4.LIZJ(interfaceC800080Va2);
            }
            c799900VZk.getClass();
            InterfaceC800100Va4 interfaceC800100Va42 = map.get(enumC799980VZs);
            if (interfaceC800100Va42 != null) {
                interfaceC800100Va42.LIZ(interfaceC800080Va2);
            }
        }
        this.LIZIZ.clear();
        this.LIZJ.clear();
        this.LIZ.clear();
        this.LIZLLL.clear();
    }

    public final void LIZ(InterfaceC800080Va2 interfaceC800080Va2) {
        if (interfaceC800080Va2.meetTrigger()) {
            C799900VZk.LIZ.getClass();
            if (C799900VZk.LJFF != null && C799900VZk.LJ != null) {
                if ((!C799900VZk.LJFF().LIZ().isEmpty()) && C799900VZk.LJFF().LIZ().contains(interfaceC800080Va2.key())) {
                    return;
                }
                EnumC799980VZs enumC799980VZsTriggerType = interfaceC800080Va2.triggerType();
                Integer num = C0VZX.LIZ;
                if (num == null) {
                    return;
                }
                if (num.intValue() != (interfaceC800080Va2.targetProcess() & C0VZX.LIZ.intValue())) {
                    return;
                }
                this.LIZLLL.put(interfaceC800080Va2, enumC799980VZsTriggerType);
                if (enumC799980VZsTriggerType != EnumC799980VZs.TASK_BACKGROUND && enumC799980VZsTriggerType != EnumC799980VZs.TASK_FIRST_WINDOW_FOCUS && enumC799980VZsTriggerType != EnumC799980VZs.TASK_BOOT_FINISH) {
                    this.LIZ.add(interfaceC800080Va2);
                    return;
                }
                if (interfaceC800080Va2 instanceof InterfaceC799590VYf) {
                    int iPriority = ((InterfaceC799590VYf) interfaceC800080Va2).priority();
                    if (iPriority != 0) {
                        if (iPriority != 1) {
                            if (iPriority != 2) {
                                return;
                            }
                            this.LIZJ.add(interfaceC800080Va2);
                            return;
                        }
                        this.LIZ.add(interfaceC800080Va2);
                        return;
                    }
                    this.LIZIZ.add(interfaceC800080Va2);
                    return;
                }
                this.LIZ.add(interfaceC800080Va2);
            }
        }
    }
}
