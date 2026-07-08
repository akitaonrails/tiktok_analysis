package X;

import java.security.MessageDigest;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.0e57, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1075030e57 {
    public final Function1<String, String> LIZ;
    public final Map<String, C1074830e4n> LIZIZ;
    public final C2218501BsG LIZJ;
    public final Map<String, String> LIZLLL;

    public C1075030e57(C2218501BsG c2218501BsG) {
        AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(MessageDigest.getInstance("SHA-256"), 146);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        this.LIZ = awS582S0100000_3;
        this.LIZIZ = linkedHashMap;
        this.LIZJ = c2218501BsG;
        this.LIZLLL = linkedHashMap2;
    }
}
