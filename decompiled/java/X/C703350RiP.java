package X;

import Y.AObjectS354S0100000_11;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0RiP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C703350RiP {
    public final C700390Rdd LIZ;
    public final Function1<String, Unit> LIZIZ;
    public final LinkedHashSet<String> LIZJ = new LinkedHashSet<>();

    public final void LIZ(String str) {
        Iterable iterableLLIIII;
        C700400Rde c700400Rde = (C700400Rde) ((Map) this.LIZ.LIZIZ.getValue()).get(str);
        if (c700400Rde == null || (iterableLLIIII = C13LP.LLIIII(c700400Rde.LIZJ.keySet())) == null) {
            iterableLLIIII = C13BV.INSTANCE;
        }
        for (String str2 : C13LP.LJLLJ(iterableLLIIII)) {
            if (this.LIZJ.add(str2)) {
                this.LIZIZ.invoke(str2);
                LIZ(str2);
            }
        }
    }

    public C703350RiP(C700390Rdd c700390Rdd, AObjectS354S0100000_11 aObjectS354S0100000_11) {
        this.LIZ = c700390Rdd;
        this.LIZIZ = aObjectS354S0100000_11;
    }
}
