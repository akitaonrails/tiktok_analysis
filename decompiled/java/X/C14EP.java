package X;

import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.14EP, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14EP {
    public final C14ER LIZ;
    public final Object LIZIZ;
    public final C14EO LIZJ;
    public volatile boolean LIZLLL = true;

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        if (EventBus.LJ()) {
            iHashCode = this.LIZ.LIZ;
            iHashCode2 = this.LIZJ.LJFF.hashCode();
        } else {
            iHashCode = this.LIZIZ.hashCode();
            iHashCode2 = this.LIZJ.LJFF.hashCode();
        }
        return iHashCode + iHashCode2;
    }

    public final boolean equals(Object obj) {
        if (EventBus.LJ()) {
            if (!(obj instanceof C14EP)) {
                return false;
            }
            C14EP c14ep = (C14EP) obj;
            if (this.LIZ.equals(c14ep.LIZ) && this.LIZJ.equals(c14ep.LIZJ)) {
                return true;
            }
            return false;
        }
        if (!(obj instanceof C14EP)) {
            return false;
        }
        C14EP c14ep2 = (C14EP) obj;
        if (this.LIZIZ == c14ep2.LIZIZ && this.LIZJ.equals(c14ep2.LIZJ)) {
            return true;
        }
        return false;
    }

    public C14EP(C14ER c14er, C14EO c14eo) {
        this.LIZ = c14er;
        this.LIZJ = c14eo;
    }

    public C14EP(Object obj, C14EO c14eo) {
        this.LIZIZ = obj;
        this.LIZJ = c14eo;
    }
}
