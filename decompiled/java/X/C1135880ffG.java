package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0ffG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135880ffG {
    public final InterfaceC1136020ffU LIZ;
    public int LIZLLL;
    public int LJI;
    public int LJII;
    public transient int LJIIIZ;
    public transient int LJIIJ;
    public int LJIIJJI;
    public long LJIIL;
    public long LJIILIIL;
    public long LJIILJJIL;
    public boolean LJIILLIIL;
    public C1135280feI LJIIZILJ;
    public ConcurrentHashMap<String, String> LJIJ;
    public boolean LJIJI;
    public boolean LJIJJ;
    public String LIZIZ = "";
    public EnumC743790TFp LIZJ = EnumC743790TFp.NONE;
    public final HashSet<C1136900fgu> LJ = new HashSet<>();
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS561S0100000_17(this, 677));
    public HashSet<InterfaceC1136020ffU> LJIIIIZZ = new HashSet<>();
    public volatile int LJIILL = LSPassThroughRecordSizeConfig.DEFAULT;

    public final int LIZ() {
        if (this.LJI == 0) {
            this.LJI = this.LIZ.getRepeatCount();
        }
        return this.LJI;
    }

    public final Queue<Pair<Integer, Boolean>> LIZIZ() {
        return (Queue) this.LJFF.getValue();
    }

    public final int LIZJ() {
        if (this.LIZLLL == 0) {
            this.LIZLLL = this.LIZ.getRepeatCount();
        }
        return this.LIZLLL;
    }

    public final int LIZLLL() {
        return C1135870ffF.LIZJ(this.LIZ) * this.LIZ.getRepeatCount();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GiftQueueLocalModel(totalAmount=");
        sbLIZ.append(LIZLLL());
        sbLIZ.append(", currentProcess/target = ");
        sbLIZ.append(LIZ());
        sbLIZ.append('/');
        sbLIZ.append(LIZJ());
        sbLIZ.append(", signature=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", downloadingStatus=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1135880ffG(InterfaceC1136020ffU interfaceC1136020ffU) {
        this.LIZ = interfaceC1136020ffU;
    }

    public final void LJ(InterfaceC1136020ffU interfaceC1136020ffU) {
        C1136900fgu next;
        Iterator<C1136900fgu> it2 = this.LJ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (next.LIZ == 0) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C1136900fgu c1136900fgu = next;
        if (c1136900fgu != null) {
            this.LJ.remove(c1136900fgu);
            this.LJ.add(C1136900fgu.LIZ(c1136900fgu, interfaceC1136020ffU.LJJI().LIZJ() + 1, 14));
        }
        this.LJ.addAll(interfaceC1136020ffU.LJJI().LJ);
    }
}
