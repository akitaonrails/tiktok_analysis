package X;

import com.bytedance.ies.abmock.SettingsManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0nVl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1437510nVl {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(309));

    public static final void LJ(Throwable th) {
        C0CHQ.LIZ().LJIIJJI();
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PublishFailed: ");
        sbLIZ.append(C08KI.LIZ(th));
        c1437510nVlLJJLIIIJ.LIZ("publish", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJFF(int i, String str) {
        C1418620n1I.LIZLLL(i, "", str);
    }

    public final void LIZ(String str, String str2) {
        C1437520nVm c1437520nVm = (C1437520nVm) this.LIZ.getValue();
        c1437520nVm.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("enable_publish_online_business_log", true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[stage-");
            sbLIZ.append(str);
            sbLIZ.append("][thread-");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("] ");
            sbLIZ.append(str2);
            c1437520nVm.LIZ.log(C13LN.LJZL(C1437520nVm.LIZIZ, C2188811AlT.LIZIZ(sbLIZ)));
        }
    }

    public final void LIZIZ(String str, Throwable th) {
        ((C1437520nVm) this.LIZ.getValue()).LIZIZ(str, th);
    }

    public final void LIZJ(String str, String str2) {
        this.LIZ.getValue().getClass();
        C1437520nVm.LIZ();
    }

    public final void LIZLLL(String str, Function0<String> function0) {
        this.LIZ.getValue().getClass();
        C1437520nVm.LIZ();
    }
}
