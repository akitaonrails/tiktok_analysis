package X;

import kotlinx.coroutines.EventLoopImplBase;

/* JADX INFO: renamed from: X.1DEj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public abstract class AbstractRunnableC2252511DEj implements Runnable, Comparable<AbstractRunnableC2252511DEj>, InterfaceC2238208po, InterfaceC2252551DEn {
    public long LL;
    public int LLILLJJLI = -1;
    public volatile Object _heap;

    @Override // X.InterfaceC2238208po
    public final void dispose() {
        C2252561DEo c2252561DEo;
        synchronized (this) {
            Object obj = this._heap;
            C09AU c09au = C2252571DEp.LIZ;
            if (obj == c09au) {
                return;
            }
            if ((obj instanceof C2252561DEo) && (c2252561DEo = (C2252561DEo) obj) != null) {
                c2252561DEo.LIZJ(this);
            }
            this._heap = c09au;
        }
    }

    @Override // X.InterfaceC2252551DEn
    public final C2252531DEl<?> LJFF() {
        Object obj = this._heap;
        if (obj instanceof C2252531DEl) {
            return (C2252531DEl) obj;
        }
        return null;
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Delayed[nanos=");
        sbLIZ.append(this.LL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC2252551DEn
    public final int getIndex() {
        return this.LLILLJJLI;
    }

    public AbstractRunnableC2252511DEj(long j) {
        this.LL = j;
    }

    @Override // X.InterfaceC2252551DEn
    public final void LJII(C2252561DEo c2252561DEo) {
        if (this._heap != C2252571DEp.LIZ) {
            this._heap = c2252561DEo;
        } else {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(AbstractRunnableC2252511DEj abstractRunnableC2252511DEj) {
        long j = this.LL - abstractRunnableC2252511DEj.LL;
        if (j > 0) {
            return 1;
        }
        if (j < 0) {
            return -1;
        }
        return 0;
    }

    @Override // X.InterfaceC2252551DEn
    public final void setIndex(int i) {
        this.LLILLJJLI = i;
    }

    public final int LJIIIZ(long j, C2252561DEo c2252561DEo, EventLoopImplBase eventLoopImplBase) {
        Object obj;
        synchronized (this) {
            if (this._heap == C2252571DEp.LIZ) {
                return 2;
            }
            synchronized (c2252561DEo) {
                Object[] objArr = c2252561DEo.LIZ;
                if (objArr != null) {
                    obj = objArr[0];
                } else {
                    obj = null;
                }
                AbstractRunnableC2252511DEj abstractRunnableC2252511DEj = (AbstractRunnableC2252511DEj) obj;
                if (eventLoopImplBase.isCompleted()) {
                    return 1;
                }
                if (abstractRunnableC2252511DEj != null) {
                    long j2 = abstractRunnableC2252511DEj.LL;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - c2252561DEo.LIZJ > 0) {
                        c2252561DEo.LIZJ = j;
                    }
                } else {
                    c2252561DEo.LIZJ = j;
                }
                long j3 = this.LL;
                long j4 = c2252561DEo.LIZJ;
                if (j3 - j4 < 0) {
                    this.LL = j4;
                }
                c2252561DEo.LIZ(this);
                return 0;
            }
        }
    }
}
