package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NAC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NAC extends C09AY implements Function0<Keva> {
    public final /* synthetic */ C0NAB LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NAC(C0NAB c0nab) {
        super(0);
        this.LL = c0nab;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        if (Intrinsics.LJFF(this.LL.LJIIL, "main")) {
            return Keva.getRepo("com.bytedance.pythia");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("com.bytedance.pythia.");
        sbLIZ.append(this.LL.LJIIL);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
