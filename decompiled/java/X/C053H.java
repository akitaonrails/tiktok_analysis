package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS187S0000000_2;
import y4e.b;
import z4e.b;

/* JADX INFO: renamed from: X.053H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public abstract class C053H<FREQUENCY_RULE_CONFIG extends b, EXIT_RULE_CONFIG extends y4e.b, STORAGE_TYPE> implements C053S<STORAGE_TYPE> {
    public final FREQUENCY_RULE_CONFIG LIZ;
    public final AnonymousClass0531 LIZIZ;
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(879));

    @Override // X.C053S
    public abstract boolean LJI(long j, String str);

    public final C053I<String> LJIIIIZZ() {
        return (C053I) this.LIZJ.getValue();
    }

    @Override // X.C053S
    public final List<String> LIZ() {
        return LJ().LJ();
    }

    @Override // X.C053S
    public void LIZLLL(String str) {
        LJ().LJI(str);
    }

    public final Pair<Boolean, STORAGE_TYPE> LJII(String str) {
        return LJ().getData(str);
    }

    public final String LJIIIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C053H(FREQUENCY_RULE_CONFIG frequency_rule_config, AnonymousClass0531 anonymousClass0531) {
        this.LIZ = frequency_rule_config;
        this.LIZIZ = anonymousClass0531;
    }

    @Override // X.C053S
    public Pair LIZJ(long j, String str) {
        return new Pair(Boolean.valueOf(LJI(j, str)), Long.valueOf(j));
    }
}
