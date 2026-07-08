package X;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.141r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C201989141r {
    public final ConcurrentHashMap<String, InterfaceC201990141s> LIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC201990141s> LIZIZ = new ConcurrentHashMap<>();

    public final void LIZIZ() {
        for (Map.Entry<String, InterfaceC201990141s> entry : this.LIZ.entrySet()) {
            entry.getKey();
            entry.getValue().release();
        }
        for (Map.Entry<String, InterfaceC201990141s> entry2 : this.LIZIZ.entrySet()) {
            entry2.getKey();
            entry2.getValue().release();
        }
        this.LIZ.clear();
        this.LIZIZ.clear();
    }

    public final void LIZ(String str) {
        InterfaceC201990141s interfaceC201990141sRemove = this.LIZ.remove(str);
        if (interfaceC201990141sRemove != null) {
            interfaceC201990141sRemove.cancel();
        }
        InterfaceC201990141s interfaceC201990141sRemove2 = this.LIZIZ.remove(str);
        if (interfaceC201990141sRemove2 != null) {
            interfaceC201990141sRemove2.cancel();
        }
    }

    public final void LIZJ(String str, InterfaceC201990141s interfaceC201990141s) {
        if (interfaceC201990141s instanceof C143W) {
            this.LIZ.remove(str);
        } else {
            this.LIZIZ.remove(str);
        }
    }
}
