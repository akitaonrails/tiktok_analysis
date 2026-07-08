package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS315S0000000_28;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.1000, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class AnonymousClass1000 {
    public final Map<String, InterfaceC1917440zzq> LIZ;
    public final InterfaceC1917490zzv LIZIZ;
    public InterfaceC1917440zzq LIZJ;
    public final Map<String, String> LIZLLL = new LinkedHashMap();
    public final Map<String, String> LJ = new LinkedHashMap();

    public AnonymousClass1000(AnonymousClass1005 anonymousClass1005) {
        this.LIZ = C2097608Jq.LJIIZILJ(anonymousClass1005.LIZ);
        this.LIZIZ = anonymousClass1005.LIZIZ;
    }

    public final void LIZ(String str, Map<String, ? extends Object> map) {
        InterfaceC1917440zzq interfaceC1917440zzq = this.LIZ.get(str);
        this.LIZJ = interfaceC1917440zzq;
        if (interfaceC1917440zzq != null) {
            interfaceC1917440zzq.LIZ(map, new C1917500zzw(this, str), new AwS607S0100000_28(this, 261), AFwS315S0000000_28.get$arr$(41));
        }
    }
}
