package X;

import com.bytedance.keva.Keva;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.054E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054E extends C09AY implements Function0<Keva> {
    public C054E() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Keva invoke() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activity_status_");
        String curUserId = C0I0B.LJFF.LIZ().getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        sbLIZ.append(curUserId);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }
}
