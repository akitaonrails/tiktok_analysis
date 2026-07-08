package X;

import java.util.List;

/* JADX INFO: renamed from: X.07rx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1996707rx {
    public final EnumC1996807ry LIZ;
    public final List<EnumC2274181Dzs> LIZIZ;
    public final List<EnumC1996507rv> LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("WaveNetSchedulerConfig(taskType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", triggerConditions=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", interruptConditions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", priorityLevel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1996707rx(EnumC1996807ry enumC1996807ry, List<? extends EnumC2274181Dzs> list, List<? extends EnumC1996507rv> list2, int i) {
        this.LIZ = enumC1996807ry;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = i;
    }
}
