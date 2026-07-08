package X;

import j27.s;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14BH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BH implements C14BI {
    public C14BG LIZ;
    public final ConcurrentHashMap<String, InterfaceC2178151AMj> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.C14BI
    public final InterfaceC2178151AMj LIZ(s sVar, String str) {
        if (Intrinsics.LJFF(str, "default")) {
            if (this.LIZ == null) {
                this.LIZ = new C14BG(sVar);
            }
            return this.LIZ;
        }
        return this.LIZIZ.get(str);
    }
}
