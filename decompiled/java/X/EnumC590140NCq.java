package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NCq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC590140NCq {
    public static final EnumC590140NCq INS;
    public static final /* synthetic */ EnumC590140NCq[] LLILLL;
    public final AtomicBoolean LL = new AtomicBoolean(false);
    public final List<InterfaceC590150NCr> LLILLJJLI = new CopyOnWriteArrayList();

    static {
        EnumC590140NCq enumC590140NCq = new EnumC590140NCq();
        INS = enumC590140NCq;
        LLILLL = new EnumC590140NCq[]{enumC590140NCq};
    }

    public static EnumC590140NCq[] values() {
        return (EnumC590140NCq[]) LLILLL.clone();
    }

    public boolean isEnable() {
        return this.LL.get();
    }

    public static EnumC590140NCq valueOf(String str) {
        return (EnumC590140NCq) C08FF.LIZ(EnumC590140NCq.class, str);
    }

    public void addModeChangeListener(InterfaceC590150NCr interfaceC590150NCr) {
        if (!((CopyOnWriteArrayList) this.LLILLJJLI).contains(interfaceC590150NCr)) {
            ((CopyOnWriteArrayList) this.LLILLJJLI).add(interfaceC590150NCr);
        }
    }

    public void removeModeChangeListener(InterfaceC590150NCr interfaceC590150NCr) {
        ((CopyOnWriteArrayList) this.LLILLJJLI).remove(interfaceC590150NCr);
    }

    public void setEnable(boolean z) {
        if (isEnable() == z) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FreeDataMode setEnable:");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LL.set(z);
        Iterator it2 = ((CopyOnWriteArrayList) this.LLILLJJLI).iterator();
        while (it2.hasNext()) {
            ((InterfaceC590150NCr) it2.next()).LIZ(z);
        }
    }
}
