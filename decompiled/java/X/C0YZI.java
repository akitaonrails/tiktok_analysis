package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0YZI, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YZI extends C09AY implements Function0<Keva> {
    public C0YZI() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("message_repo_key");
        sbLIZ.append((Object) C461720I8s.LIZIZ());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
