package X;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1543500qGi {
    public static final /* synthetic */ int LIZLLL = 0;
    public boolean LIZ;
    public InterfaceC634840OvC LIZIZ;
    public final ConcurrentHashMap<String, C1543510qGj> LIZJ;

    public C1543500qGi() {
        new ConcurrentHashMap();
        this.LIZJ = new ConcurrentHashMap<>();
    }

    public final void LIZ(Class<? extends InterfaceC1063710dmr> cls, EnumC1063300dmC enumC1063300dmC, String str) {
        if (cls != null) {
            if (this.LIZJ.get(str) == null) {
                this.LIZJ.put(str, new C1543510qGj(this.LIZ, this.LIZIZ));
            }
            C1543510qGj c1543510qGj = this.LIZJ.get(str);
            if (c1543510qGj != null) {
                c1543510qGj.LIZIZ(cls, enumC1063300dmC);
            }
        }
    }
}
