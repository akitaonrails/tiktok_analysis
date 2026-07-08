package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AwS124S1200000_8;
import kotlin.jvm.internal.AwS157S1100000_8;

/* JADX INFO: renamed from: X.0L8j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC538070L8j implements InterfaceC538100L8m {
    public boolean LIZ;
    public C538080L8k LIZJ;
    public float LJFF;
    public C0FQS LJI;
    public C0L94 LIZIZ = C0L94.NONE;
    public final Set<InterfaceC538100L8m> LIZLLL = new LinkedHashSet();
    public final Set<InterfaceC538100L8m> LJ = new LinkedHashSet();

    @Override // X.InterfaceC538100L8m
    public void LJIJJ() {
        this.LIZ = true;
    }

    @Override // X.InterfaceC538100L8m
    public int LJIL() {
        return 1;
    }

    @Override // X.InterfaceC538100L8m
    public final boolean LJIJ() {
        Set<InterfaceC538100L8m> set = this.LIZLLL;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<InterfaceC538100L8m> it2 = set.iterator();
            while (it2.hasNext()) {
                if (it2.next().getStatus() != C0L94.SUCCESS) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean LJJIIJZLJL() {
        C0L94 c0l94 = this.LIZIZ;
        return c0l94 == C0L94.CANCELED || c0l94 == C0L94.FAILED || c0l94 == C0L94.SUCCESS;
    }

    @Override // X.InterfaceC538100L8m
    public boolean LJIIJJI() {
        C538080L8k c538080L8kLJIILLIIL = LJIILLIIL();
        if (c538080L8kLJIILLIIL != null) {
            return c538080L8kLJIILLIIL.LJIIJJI();
        }
        return false;
    }

    @Override // X.InterfaceC538100L8m
    public void LJJIII() {
        if (LJJIIJZLJL()) {
            C381530Exb.LIZIZ(this, "task is finished when onNotifyTaskFailed");
            return;
        }
        int i = C538110L8n.LIZ[this.LIZIZ.ordinal()];
        if (i == 1) {
            this.LIZIZ = C0L94.FAILED;
        } else if (i == 2) {
            cancel();
        }
        C381530Exb.LIZIZ(this, "notifyTaskFailed");
    }

    @Override // X.InterfaceC354490Dv5
    public void cancel() {
        if (LJJIIJZLJL()) {
            C381530Exb.LIZIZ(this, "task is finished when cancel");
            return;
        }
        this.LIZIZ = C0L94.CANCELED;
        C0FQS c0fqs = this.LJI;
        if (c0fqs != null) {
            C383980F3s.LIZIZ(new AwS157S1100000_8(c0fqs, getTaskName(), 2));
        }
        C381530Exb.LIZIZ(this, "cancel");
    }

    @Override // X.InterfaceC538100L8m
    public boolean LJI() {
        return this.LIZ;
    }

    @Override // X.InterfaceC538100L8m
    public final Iterable<InterfaceC538100L8m> LJIIIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC538100L8m
    public final float LJIILIIL() {
        return this.LJFF;
    }

    @Override // X.InterfaceC538100L8m
    public C538080L8k LJIILLIIL() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC538100L8m
    public final C0L94 getStatus() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC538100L8m
    public void LJII(C538080L8k c538080L8k) {
        this.LIZJ = c538080L8k;
    }

    @Override // X.InterfaceC538100L8m
    public final void LJIIJ(InterfaceC538100L8m interfaceC538100L8m) {
        if (this.LIZLLL.remove(interfaceC538100L8m)) {
            interfaceC538100L8m.LJJII(this);
        }
    }

    @Override // X.InterfaceC538100L8m
    public final void LJIILJJIL(InterfaceC538100L8m interfaceC538100L8m) {
        if (this.LIZLLL.add(interfaceC538100L8m)) {
            interfaceC538100L8m.LJIJJLI(this);
        }
    }

    @Override // X.InterfaceC538100L8m
    public boolean LJIIZILJ(C0FQS c0fqs) {
        if (this.LIZIZ != C0L94.NONE) {
            C381530Exb.LIZIZ(this, "execute already");
            return false;
        }
        this.LIZIZ = C0L94.EXECUTING;
        C381530Exb.LIZIZ(this, "execute");
        this.LJI = c0fqs;
        C383980F3s.LIZIZ(new AwS157S1100000_8(c0fqs, getTaskName(), 3));
        return true;
    }

    @Override // X.InterfaceC538100L8m
    public final void LJIJJLI(InterfaceC538100L8m interfaceC538100L8m) {
        if (this.LJ.add(interfaceC538100L8m)) {
            interfaceC538100L8m.LJIILJJIL(this);
        }
    }

    @Override // X.InterfaceC538100L8m
    public final void LJJII(InterfaceC538100L8m interfaceC538100L8m) {
        if (this.LJ.remove(interfaceC538100L8m)) {
            interfaceC538100L8m.LJIIJ(this);
        }
    }

    public void LJJIIZ(C381350ExJ c381350ExJ) {
        if (LJJIIJZLJL()) {
            C381530Exb.LIZIZ(this, "task is finished when onTaskFailed");
            return;
        }
        this.LIZIZ = C0L94.FAILED;
        C381530Exb.LIZIZ(this, "onTaskFailed");
        this.LJFF = 1.0f;
        C0FQS c0fqs = this.LJI;
        if (c0fqs != null) {
            C383980F3s.LIZIZ(new AwS124S1200000_8(c0fqs, getTaskName(), c381350ExJ, 0));
        }
        C538080L8k c538080L8kLJIILLIIL = LJIILLIIL();
        if (c538080L8kLJIILLIIL != null) {
            c538080L8kLJIILLIIL.LJJIIZ(c381350ExJ);
        }
    }

    public void LJJIIZI(float f) {
        if (LJJIIJZLJL()) {
            C381530Exb.LIZIZ(this, "onTaskUpdateProgress: isFinished");
            return;
        }
        this.LJFF = f;
        C538080L8k c538080L8kLJIILLIIL = LJIILLIIL();
        if (c538080L8kLJIILLIIL != null) {
            c538080L8kLJIILLIIL.LJJIIZI(0.0f);
        }
    }

    @Override // X.InterfaceC538100L8m
    public void LIZJ(C0FQS c0fqs, C381330ExH c381330ExH) {
        if (this.LIZIZ != C0L94.EXECUTING) {
            C381530Exb.LIZIZ(this, "onTaskSuccess already");
            return;
        }
        LJJIIZI(1.0f);
        this.LIZIZ = C0L94.SUCCESS;
        C381530Exb.LIZIZ(this, "onTaskSuccess");
        C383980F3s.LIZIZ(new AwS124S1200000_8(c0fqs, getTaskName(), c381330ExH, 1));
        Set<InterfaceC538100L8m> set = this.LJ;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC538100L8m interfaceC538100L8m : set) {
            if (interfaceC538100L8m.LJIJ()) {
                arrayList.add(interfaceC538100L8m);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((InterfaceC538100L8m) it2.next()).LJIIZILJ(c0fqs);
        }
    }
}
