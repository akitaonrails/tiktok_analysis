package X;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ddX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057930ddX extends AbstractC1023720ckM {
    public static final HashMap<String, Integer> LIZIZ = new HashMap<>();
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1057930ddX(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    @Override // X.AbstractC1023380cjo
    public final void logInternal(String str, Map<String, ? extends Object> map) {
        super.logInternal(str, map);
    }
}
