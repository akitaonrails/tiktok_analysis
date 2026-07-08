package X;

import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.AwS50S0100100_16;

/* JADX INFO: renamed from: X.0cfd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1020790cfd extends AbstractC1023720ckM {
    public static final /* synthetic */ int LIZIZ = 0;
    public final C1023630ckD<?>[] LIZ;

    @Override // X.AbstractC1023380cjo, X.C1023640ckE
    public final C1023630ckD<?>[] getInternalLogics() {
        return this.LIZ;
    }

    public C1020790cfd(Object... objArr) {
        super(Arrays.copyOf(objArr, objArr.length));
        this.LIZ = new C1023630ckD[0];
    }

    public static final void LJJIIZ(C0N2S c0n2s, long j) {
        C1020790cfd c1020790cfd = new C1020790cfd(new Object[0]);
        C1030840cvq.LIZ.getClass();
        c1020790cfd.log(C1030840cvq.LIZJ, new AwS50S0100100_16(c0n2s, j, 2));
    }

    @Override // X.AbstractC1023380cjo
    public final void logInternal(String str, Map<String, ? extends Object> map) {
        super.logInternal(str, map);
    }
}
