package X;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS225S0000000_34;

/* JADX INFO: renamed from: X.1Aq4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2191661Aq4 {
    public static final C01GW<ConcurrentHashMap<EnumC2191941AqW, InterfaceC2191651Aq3>> LIZLLL = C452501pT.LIZIZ(AFwS225S0000000_34.get$arr$(299));
    public final InterfaceC2190561AoI LIZ;
    public final Context LIZIZ;
    public final String LIZJ;

    public final InterfaceC2191651Aq3 LIZ(EnumC2191941AqW enumC2191941AqW) {
        InterfaceC2191651Aq3 interfaceC2191651Aq3PutIfAbsent;
        ConcurrentHashMap<EnumC2191941AqW, InterfaceC2191651Aq3> value = LIZLLL.getValue();
        InterfaceC2191651Aq3 c2191621Aq0 = value.get(enumC2191941AqW);
        if (c2191621Aq0 == null && (interfaceC2191651Aq3PutIfAbsent = value.putIfAbsent(enumC2191941AqW, (c2191621Aq0 = new C2191621Aq0(this.LIZ, this.LIZIZ, this.LIZJ, enumC2191941AqW)))) != null) {
            c2191621Aq0 = interfaceC2191651Aq3PutIfAbsent;
        }
        return c2191621Aq0;
    }

    public C2191661Aq4(InterfaceC2190561AoI interfaceC2190561AoI, Context context, String str) {
        this.LIZ = interfaceC2190561AoI;
        this.LIZIZ = context;
        this.LIZJ = str;
    }
}
