package X;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: renamed from: X.0X6M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6M {
    public String LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final C0X61 LIZLLL;
    public final C0X6Z LJ = new C0X6Z();

    public C0X6M(WeakReference weakReference, String str, String str2, Map map, boolean z, C0X61 c0x61) {
        InterfaceC1541990qEH interfaceC1541990qEH;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = map;
        this.LIZLLL = c0x61;
        Object obj = weakReference.get();
        if ((obj instanceof InterfaceC1541990qEH) && (interfaceC1541990qEH = (InterfaceC1541990qEH) obj) != null) {
            interfaceC1541990qEH.getHybridContext();
        }
    }
}
