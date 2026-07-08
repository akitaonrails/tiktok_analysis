package X;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: X.007P, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007P {
    public static final C007P LIZIZ = new C007P();
    public final Set<Integer> LIZ = new HashSet();

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RequestManagerThreadConfig{enableRemoveSerial=");
        sbLIZ.append(false);
        sbLIZ.append(", coreCmdSet=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", delayInstCoreCmd=");
        sbLIZ.append(false);
        sbLIZ.append(", useDefaultWhenCoreCmdNotReady=");
        sbLIZ.append(false);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
