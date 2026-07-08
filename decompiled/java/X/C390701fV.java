package X;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS595S0100000_16;

/* JADX INFO: renamed from: X.01fV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C390701fV {
    public final int LIZ;
    public final Function1<Integer, Boolean> LIZIZ;
    public final Map<String, C388901fD> LIZJ = new LinkedHashMap();
    public long LIZLLL;
    public int LJ;
    public boolean LJFF;
    public long LJI;

    public final void LIZJ() {
        for (C388901fD c388901fD : ((LinkedHashMap) this.LIZJ).values()) {
            AnonymousClass0956 anonymousClass0956 = c388901fD.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c388901fD.LIZLLL = null;
        }
        ((LinkedHashMap) this.LIZJ).clear();
        this.LJFF = false;
        this.LJI = 0L;
    }

    public final void LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pause: isPaused = ");
        sbLIZ.append(this.LJFF);
        C1022620cia.LIZ("CarouselStayTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJFF) {
            return;
        }
        this.LJI = System.currentTimeMillis() - this.LIZLLL;
        this.LJFF = true;
        for (C388901fD c388901fD : ((LinkedHashMap) this.LIZJ).values()) {
            AnonymousClass0956 anonymousClass0956 = c388901fD.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            c388901fD.LIZLLL = null;
        }
    }

    public final void LIZIZ(C390801fW c390801fW) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registerTask: size = ");
        sbLIZ.append(this.LIZJ.size());
        C1022620cia.LIZ("CarouselStayTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LIZJ.containsKey(c390801fW.LIZ)) {
            return;
        }
        this.LIZJ.put(c390801fW.LIZ, new C388901fD(c390801fW.LIZIZ, new C020W(c390801fW, this, 22), new C020W(c390801fW, this, 23)));
    }

    public C390701fV(int i, AwS595S0100000_16 awS595S0100000_16) {
        this.LIZ = i;
        this.LIZIZ = awS595S0100000_16;
    }

    public final void LIZLLL(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("resume: position = ");
        sbLIZ.append(i);
        sbLIZ.append(", isPaused = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", fromUserInteraction = ");
        sbLIZ.append(z);
        C1022620cia.LIZ("CarouselStayTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJFF) {
            this.LJFF = false;
            if (this.LJ == i && z) {
                LJ(i, this.LJI);
            } else {
                LJ(i, 0L);
            }
            this.LJI = 0L;
        }
    }

    public final void LJ(int i, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start: position = ");
        sbLIZ.append(i);
        sbLIZ.append(", elapsedTime = ");
        sbLIZ.append(j);
        C1022620cia.LIZ("CarouselStayTimerManager", C2188811AlT.LIZIZ(sbLIZ));
        this.LJ = i;
        this.LJI = 0L;
        this.LIZLLL = System.currentTimeMillis() - j;
        for (C388901fD c388901fD : ((LinkedHashMap) this.LIZJ).values()) {
            AnonymousClass0956 anonymousClass0956 = c388901fD.LIZLLL;
            if (anonymousClass0956 != null) {
                anonymousClass0956.LIZIZ(null);
            }
            if (c388901fD.LIZIZ.invoke(Integer.valueOf(i)).booleanValue()) {
                c388901fD.LIZLLL = C23250099c.LIZLLL(c388901fD.LJ, null, null, new C01SM(c388901fD, j, i, null), 3);
            }
        }
    }
}
