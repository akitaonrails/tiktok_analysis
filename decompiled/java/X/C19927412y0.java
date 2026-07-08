package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.12y0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19927412y0 implements InterfaceC19929112yH {
    public final AbstractC19927312xz LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    @Override // X.InterfaceC19929112yH
    public final int LIZ() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJJIJL();
    }

    @Override // X.InterfaceC19929112yH
    public final long LJII() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJIL();
    }

    @Override // X.InterfaceC19929112yH
    public final boolean LJIIIIZZ() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJIILIIL();
    }

    @Override // X.InterfaceC19929112yH
    public final int LJIIJJI() throws C19926812xu {
        LJJJJJ(5);
        return this.LIZ.LJIIZILJ();
    }

    @Override // X.InterfaceC19929112yH
    public final String LJIIL() throws C19926812xu {
        LJJJJJ(2);
        return this.LIZ.LJJIJIIJI();
    }

    @Override // X.InterfaceC19929112yH
    public final int LJIILJJIL() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJJIIZI();
    }

    @Override // X.InterfaceC19929112yH
    public final AbstractC19922812xG LJIILL() throws C19926812xu {
        LJJJJJ(2);
        return this.LIZ.LJIILJJIL();
    }

    @Override // X.InterfaceC19929112yH
    public final long LJIILLIIL() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJJIJLIJ();
    }

    @Override // X.InterfaceC19929112yH
    public final long LJIJJLI() throws C19926812xu {
        LJJJJJ(1);
        return this.LIZ.LJIJ();
    }

    @Override // X.InterfaceC19929112yH
    public final int LJJIFFI() throws C19926812xu {
        LJJJJJ(5);
        return this.LIZ.LJJIIJZLJL();
    }

    @Override // X.InterfaceC19929112yH
    public final String LJJII() throws C19926812xu {
        LJJJJJ(2);
        return this.LIZ.LJJIJIIJIL();
    }

    @Override // X.InterfaceC19929112yH
    public final int LJJIII() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJIILLIIL();
    }

    @Override // X.InterfaceC19929112yH
    public final int LJJIJ() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJIJJLI();
    }

    @Override // X.InterfaceC19929112yH
    public final long LJJIJIIJIL() throws C19926812xu {
        LJJJJJ(1);
        return this.LIZ.LJJIIZ();
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIL() throws C19926812xu {
        LJJJJJ(2);
        this.LIZ.LJIIL(this.LIZ.LJJIJL());
        throw null;
    }

    @Override // X.InterfaceC19929112yH
    public final long LJJJI() throws C19926812xu {
        LJJJJJ(0);
        return this.LIZ.LJJIJ();
    }

    @Override // X.InterfaceC19929112yH
    public final double readDouble() throws C19926812xu {
        LJJJJJ(1);
        return this.LIZ.LJIILL();
    }

    @Override // X.InterfaceC19929112yH
    public final float readFloat() throws C19926812xu {
        LJJJJJ(5);
        return this.LIZ.LJIJI();
    }

    @Override // X.InterfaceC19929112yH
    public final void LJFF() {
        this.LIZ.getClass();
    }

    @Override // X.InterfaceC19929112yH
    public final boolean LJI() {
        int i;
        if (this.LIZ.LJII() || (i = this.LIZIZ) == this.LIZJ) {
            return false;
        }
        return this.LIZ.LJJIL(i);
    }

    @Override // X.InterfaceC19929112yH
    public final int LJIJ() {
        int i = this.LIZLLL;
        if (i != 0) {
            this.LIZIZ = i;
            this.LIZLLL = 0;
        } else {
            this.LIZIZ = this.LIZ.LJJIJIL();
        }
        int i2 = this.LIZIZ;
        if (i2 == 0 || i2 == this.LIZJ) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // X.InterfaceC19929112yH
    public final int getTag() {
        return this.LIZIZ;
    }

    public C19927412y0(AbstractC19927312xz abstractC19927312xz) {
        C19922012x8.LIZ(abstractC19927312xz, "input");
        this.LIZ = abstractC19927312xz;
        abstractC19927312xz.LJ = this;
    }

    public static final void LJJJJJL(int i) throws C19926612xs {
        if ((i & 3) == 0) {
        } else {
            throw C19926612xs.LJI();
        }
    }

    public static final void LJJJJL(int i) throws C19926612xs {
        if ((i & 7) == 0) {
        } else {
            throw C19926612xs.LJI();
        }
    }

    @Override // X.InterfaceC19929112yH
    public final void LIZIZ(List<Integer> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19889012ro.LJJLL(this.LIZ.LJJIIZI());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19889012ro.LJJLL(this.LIZ.LJJIIZI());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Integer.valueOf(this.LIZ.LJJIIZI()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Integer.valueOf(this.LIZ.LJJIIZI()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LIZJ(List<Long> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            int i = this.LIZIZ & 7;
            if (i != 1) {
                if (i == 2) {
                    int iLJJIJL = this.LIZ.LJJIJL();
                    LJJJJL(iLJJIJL);
                    int iLJI = this.LIZ.LJI() + iLJJIJL;
                    do {
                        c19888812rm.LJ(this.LIZ.LJJIIZ());
                    } while (this.LIZ.LJI() < iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888812rm.LJ(this.LIZ.LJJIIZ());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int iLJJIJL2 = this.LIZ.LJJIJL();
                LJJJJL(iLJJIJL2);
                int iLJI2 = this.LIZ.LJI() + iLJJIJL2;
                do {
                    list.add(Long.valueOf(this.LIZ.LJJIIZ()));
                } while (this.LIZ.LJI() < iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Long.valueOf(this.LIZ.LJJIIZ()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LIZLLL(List<Integer> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19889012ro.LJJLL(this.LIZ.LJIJJLI());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19889012ro.LJJLL(this.LIZ.LJIJJLI());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Integer.valueOf(this.LIZ.LJIJJLI()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Integer.valueOf(this.LIZ.LJIJJLI()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJIIIZ(List<String> list) throws C19926812xu {
        LJJJJI(list, true);
    }

    @Override // X.InterfaceC19929112yH
    public final void LJIILIIL(List<Long> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19888812rm.LJ(this.LIZ.LJJIJ());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888812rm.LJ(this.LIZ.LJJIJ());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Long.valueOf(this.LIZ.LJJIJ()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Long.valueOf(this.LIZ.LJJIJ()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJIJI(List<Float> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888112rf) {
            C19888112rf c19888112rf = (C19888112rf) list;
            int i = this.LIZIZ & 7;
            if (i != 2) {
                if (i != 5) {
                    throw C19926612xs.LIZLLL();
                }
                do {
                    c19888112rf.LJ(this.LIZ.LJIJI());
                    if (this.LIZ.LJII()) {
                        return;
                    } else {
                        iLJJIJIL2 = this.LIZ.LJJIJIL();
                    }
                } while (iLJJIJIL2 == this.LIZIZ);
                this.LIZLLL = iLJJIJIL2;
                return;
            }
            int iLJJIJL = this.LIZ.LJJIJL();
            LJJJJJL(iLJJIJL);
            int iLJI = this.LIZ.LJI() + iLJJIJL;
            do {
                c19888112rf.LJ(this.LIZ.LJIJI());
            } while (this.LIZ.LJI() < iLJI);
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw C19926612xs.LIZLLL();
            }
            do {
                list.add(Float.valueOf(this.LIZ.LJIJI()));
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL == this.LIZIZ);
            this.LIZLLL = iLJJIJIL;
            return;
        }
        int iLJJIJL2 = this.LIZ.LJJIJL();
        LJJJJJL(iLJJIJL2);
        int iLJI2 = this.LIZ.LJI() + iLJJIJL2;
        do {
            list.add(Float.valueOf(this.LIZ.LJIJI()));
        } while (this.LIZ.LJI() < iLJI2);
    }

    @Override // X.InterfaceC19929112yH
    public final void LJIJJ(List<AbstractC19922812xG> list) throws C19926812xu {
        int iLJJIJIL;
        if ((this.LIZIZ & 7) != 2) {
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(LJIILL());
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJIL(List<Integer> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            int i = this.LIZIZ & 7;
            if (i != 2) {
                if (i != 5) {
                    throw C19926612xs.LIZLLL();
                }
                do {
                    c19889012ro.LJJLL(this.LIZ.LJJIIJZLJL());
                    if (this.LIZ.LJII()) {
                        return;
                    } else {
                        iLJJIJIL2 = this.LIZ.LJJIJIL();
                    }
                } while (iLJJIJIL2 == this.LIZIZ);
                this.LIZLLL = iLJJIJIL2;
                return;
            }
            int iLJJIJL = this.LIZ.LJJIJL();
            LJJJJJL(iLJJIJL);
            int iLJI = this.LIZ.LJI() + iLJJIJL;
            do {
                c19889012ro.LJJLL(this.LIZ.LJJIIJZLJL());
            } while (this.LIZ.LJI() < iLJI);
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw C19926612xs.LIZLLL();
            }
            do {
                list.add(Integer.valueOf(this.LIZ.LJJIIJZLJL()));
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL == this.LIZIZ);
            this.LIZLLL = iLJJIJIL;
            return;
        }
        int iLJJIJL2 = this.LIZ.LJJIJL();
        LJJJJJL(iLJJIJL2);
        int iLJI2 = this.LIZ.LJI() + iLJJIJL2;
        do {
            list.add(Integer.valueOf(this.LIZ.LJJIIJZLJL()));
        } while (this.LIZ.LJI() < iLJI2);
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJI(List<Long> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19888812rm.LJ(this.LIZ.LJIL());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888812rm.LJ(this.LIZ.LJIL());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Long.valueOf(this.LIZ.LJIL()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Long.valueOf(this.LIZ.LJIL()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIIJ(List<Boolean> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888412ri) {
            C19888412ri c19888412ri = (C19888412ri) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19888412ri.LJ(this.LIZ.LJIILIIL());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888412ri.LJ(this.LIZ.LJIILIIL());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Boolean.valueOf(this.LIZ.LJIILIIL()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Boolean.valueOf(this.LIZ.LJIILIIL()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIIZ(List<Long> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19888812rm.LJ(this.LIZ.LJJIJLIJ());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888812rm.LJ(this.LIZ.LJJIJLIJ());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Long.valueOf(this.LIZ.LJJIJLIJ()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Long.valueOf(this.LIZ.LJJIJLIJ()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIJIIJI(List<Long> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888812rm) {
            C19888812rm c19888812rm = (C19888812rm) list;
            int i = this.LIZIZ & 7;
            if (i != 1) {
                if (i == 2) {
                    int iLJJIJL = this.LIZ.LJJIJL();
                    LJJJJL(iLJJIJL);
                    int iLJI = this.LIZ.LJI() + iLJJIJL;
                    do {
                        c19888812rm.LJ(this.LIZ.LJIJ());
                    } while (this.LIZ.LJI() < iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888812rm.LJ(this.LIZ.LJIJ());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int iLJJIJL2 = this.LIZ.LJJIJL();
                LJJJJL(iLJJIJL2);
                int iLJI2 = this.LIZ.LJI() + iLJJIJL2;
                do {
                    list.add(Long.valueOf(this.LIZ.LJIJ()));
                } while (this.LIZ.LJI() < iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Long.valueOf(this.LIZ.LJIJ()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIJIL(List<Integer> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            int i = this.LIZIZ & 7;
            if (i != 2) {
                if (i != 5) {
                    throw C19926612xs.LIZLLL();
                }
                do {
                    c19889012ro.LJJLL(this.LIZ.LJIIZILJ());
                    if (this.LIZ.LJII()) {
                        return;
                    } else {
                        iLJJIJIL2 = this.LIZ.LJJIJIL();
                    }
                } while (iLJJIJIL2 == this.LIZIZ);
                this.LIZLLL = iLJJIJIL2;
                return;
            }
            int iLJJIJL = this.LIZ.LJJIJL();
            LJJJJJL(iLJJIJL);
            int iLJI = this.LIZ.LJI() + iLJJIJL;
            do {
                c19889012ro.LJJLL(this.LIZ.LJIIZILJ());
            } while (this.LIZ.LJI() < iLJI);
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 2) {
            if (i2 != 5) {
                throw C19926612xs.LIZLLL();
            }
            do {
                list.add(Integer.valueOf(this.LIZ.LJIIZILJ()));
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL == this.LIZIZ);
            this.LIZLLL = iLJJIJIL;
            return;
        }
        int iLJJIJL2 = this.LIZ.LJJIJL();
        LJJJJJL(iLJJIJL2);
        int iLJI2 = this.LIZ.LJI() + iLJJIJL2;
        do {
            list.add(Integer.valueOf(this.LIZ.LJIIZILJ()));
        } while (this.LIZ.LJI() < iLJI2);
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIJL(List<String> list) throws C19926812xu {
        LJJJJI(list, false);
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIJLIJ(List<Double> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19888612rk) {
            C19888612rk c19888612rk = (C19888612rk) list;
            int i = this.LIZIZ & 7;
            if (i != 1) {
                if (i == 2) {
                    int iLJJIJL = this.LIZ.LJJIJL();
                    LJJJJL(iLJJIJL);
                    int iLJI = this.LIZ.LJI() + iLJJIJL;
                    do {
                        c19888612rk.LJ(this.LIZ.LJIILL());
                    } while (this.LIZ.LJI() < iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19888612rk.LJ(this.LIZ.LJIILL());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 1) {
            if (i2 == 2) {
                int iLJJIJL2 = this.LIZ.LJJIJL();
                LJJJJL(iLJJIJL2);
                int iLJI2 = this.LIZ.LJI() + iLJJIJL2;
                do {
                    list.add(Double.valueOf(this.LIZ.LJIILL()));
                } while (this.LIZ.LJI() < iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Double.valueOf(this.LIZ.LJIILL()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJIZ(List<Integer> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19889012ro.LJJLL(this.LIZ.LJIILLIIL());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19889012ro.LJJLL(this.LIZ.LJIILLIIL());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Integer.valueOf(this.LIZ.LJIILLIIL()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Integer.valueOf(this.LIZ.LJIILLIIL()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final void LJJJ(List<Integer> list) throws C19926612xs {
        int iLJJIJIL;
        int iLJJIJIL2;
        if (list instanceof C19889012ro) {
            C19889012ro c19889012ro = (C19889012ro) list;
            int i = this.LIZIZ & 7;
            if (i != 0) {
                if (i == 2) {
                    int iLJI = this.LIZ.LJI() + this.LIZ.LJJIJL();
                    do {
                        c19889012ro.LJJLL(this.LIZ.LJJIJL());
                    } while (this.LIZ.LJI() < iLJI);
                    LJJJJIZL(iLJI);
                    return;
                }
                throw C19926612xs.LIZLLL();
            }
            do {
                c19889012ro.LJJLL(this.LIZ.LJJIJL());
                if (this.LIZ.LJII()) {
                    return;
                } else {
                    iLJJIJIL2 = this.LIZ.LJJIJIL();
                }
            } while (iLJJIJIL2 == this.LIZIZ);
            this.LIZLLL = iLJJIJIL2;
            return;
        }
        int i2 = this.LIZIZ & 7;
        if (i2 != 0) {
            if (i2 == 2) {
                int iLJI2 = this.LIZ.LJI() + this.LIZ.LJJIJL();
                do {
                    list.add(Integer.valueOf(this.LIZ.LJJIJL()));
                } while (this.LIZ.LJI() < iLJI2);
                LJJJJIZL(iLJI2);
                return;
            }
            throw C19926612xs.LIZLLL();
        }
        do {
            list.add(Integer.valueOf(this.LIZ.LJJIJL()));
            if (this.LIZ.LJII()) {
                return;
            } else {
                iLJJIJIL = this.LIZ.LJJIJIL();
            }
        } while (iLJJIJIL == this.LIZIZ);
        this.LIZLLL = iLJJIJIL;
    }

    public final void LJJJJIZL(int i) throws C19926612xs {
        if (this.LIZ.LJI() == i) {
        } else {
            throw C19926612xs.LJII();
        }
    }

    public final void LJJJJJ(int i) throws C19926812xu {
        if ((this.LIZIZ & 7) == i) {
        } else {
            throw C19926612xs.LIZLLL();
        }
    }

    @Override // X.InterfaceC19929112yH
    public final <T> T LJIIJ(Class<T> cls, C19926312xp c19926312xp) throws C19926812xu {
        LJJJJJ(2);
        InterfaceC19924912xb<T> interfaceC19924912xbLIZ = C19921412x2.LIZJ.LIZ(cls);
        T tNewInstance = interfaceC19924912xbLIZ.newInstance();
        LJJJJ(tNewInstance, interfaceC19924912xbLIZ, c19926312xp);
        interfaceC19924912xbLIZ.LJI(tNewInstance);
        return tNewInstance;
    }

    @Override // X.InterfaceC19929112yH
    public final <T> T LJJIIZI(Class<T> cls, C19926312xp c19926312xp) throws C19926812xu {
        LJJJJJ(3);
        InterfaceC19924912xb<T> interfaceC19924912xbLIZ = C19921412x2.LIZJ.LIZ(cls);
        T tNewInstance = interfaceC19924912xbLIZ.newInstance();
        LJJJIL(tNewInstance, interfaceC19924912xbLIZ, c19926312xp);
        interfaceC19924912xbLIZ.LJI(tNewInstance);
        return tNewInstance;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r4 != false) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x002e -> B:17:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJJJI(java.util.List<java.lang.String> r3, boolean r4) throws X.C19926812xu {
        /*
            r2 = this;
            int r0 = r2.LIZIZ
            r1 = r0 & 7
            r0 = 2
            if (r1 != r0) goto L50
            boolean r0 = r3 instanceof X.InterfaceC19921312x1
            if (r0 == 0) goto L2c
            if (r4 != 0) goto L4b
            X.12x1 r3 = (X.InterfaceC19921312x1) r3
        Lf:
            X.12xG r0 = r2.LJIILL()
            r3.LJL(r0)
            X.12xz r0 = r2.LIZ
            boolean r0 = r0.LJII()
            if (r0 == 0) goto L1f
            return
        L1f:
            X.12xz r0 = r2.LIZ
            int r1 = r0.LJJIJIL()
            int r0 = r2.LIZIZ
            if (r1 == r0) goto Lf
            r2.LIZLLL = r1
            return
        L2c:
            if (r4 != 0) goto L4b
            java.lang.String r0 = r2.LJIIL()
        L32:
            r3.add(r0)
            X.12xz r0 = r2.LIZ
            boolean r0 = r0.LJII()
            if (r0 == 0) goto L3e
            return
        L3e:
            X.12xz r0 = r2.LIZ
            int r1 = r0.LJJIJIL()
            int r0 = r2.LIZIZ
            if (r1 == r0) goto L2c
            r2.LIZLLL = r1
            return
        L4b:
            java.lang.String r0 = r2.LJJII()
            goto L32
        L50:
            X.12xu r0 = X.C19926612xs.LIZLLL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19927412y0.LJJJJI(java.util.List, boolean):void");
    }

    @Override // X.InterfaceC19929112yH
    public final <T> void LJ(T t, InterfaceC19924912xb<T> interfaceC19924912xb, C19926312xp c19926312xp) throws C19926812xu {
        LJJJJJ(2);
        LJJJJ(t, interfaceC19924912xb, c19926312xp);
    }

    @Override // X.InterfaceC19929112yH
    public final <T> void LJIIZILJ(T t, InterfaceC19924912xb<T> interfaceC19924912xb, C19926312xp c19926312xp) throws C19926812xu {
        LJJJJJ(3);
        LJJJIL(t, interfaceC19924912xb, c19926312xp);
    }

    @Override // X.InterfaceC19929112yH
    public final <T> void LJJ(List<T> list, InterfaceC19924912xb<T> interfaceC19924912xb, C19926312xp c19926312xp) throws C19926812xu {
        int iLJJIJIL;
        int i = this.LIZIZ;
        if ((i & 7) != 3) {
            throw C19926612xs.LIZLLL();
        }
        do {
            T tNewInstance = interfaceC19924912xb.newInstance();
            LJJJIL(tNewInstance, interfaceC19924912xb, c19926312xp);
            interfaceC19924912xb.LJI(tNewInstance);
            list.add(tNewInstance);
            if (!this.LIZ.LJII() && this.LIZLLL == 0) {
                iLJJIJIL = this.LIZ.LJJIJIL();
            } else {
                return;
            }
        } while (iLJJIJIL == i);
        this.LIZLLL = iLJJIJIL;
    }

    @Override // X.InterfaceC19929112yH
    public final <T> void LJJIIJZLJL(List<T> list, InterfaceC19924912xb<T> interfaceC19924912xb, C19926312xp c19926312xp) throws C19926812xu {
        int iLJJIJIL;
        int i = this.LIZIZ;
        if ((i & 7) != 2) {
            throw C19926612xs.LIZLLL();
        }
        do {
            T tNewInstance = interfaceC19924912xb.newInstance();
            LJJJJ(tNewInstance, interfaceC19924912xb, c19926312xp);
            interfaceC19924912xb.LJI(tNewInstance);
            list.add(tNewInstance);
            if (!this.LIZ.LJII() && this.LIZLLL == 0) {
                iLJJIJIL = this.LIZ.LJJIJIL();
            } else {
                return;
            }
        } while (iLJJIJIL == i);
        this.LIZLLL = iLJJIJIL;
    }

    public final <T> void LJJJIL(T t, InterfaceC19924912xb<T> interfaceC19924912xb, C19926312xp c19926312xp) {
        int i = this.LIZJ;
        this.LIZJ = ((this.LIZIZ >>> 3) << 3) | 4;
        try {
            interfaceC19924912xb.LJIIIIZZ(t, this, c19926312xp);
            if (this.LIZIZ == this.LIZJ) {
                this.LIZJ = i;
                return;
            }
            throw C19926612xs.LJI();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZJ = i;
            throw th;
        }
    }

    public final <T> void LJJJJ(T t, InterfaceC19924912xb<T> interfaceC19924912xb, C19926312xp c19926312xp) {
        int iLJJIJL = this.LIZ.LJJIJL();
        this.LIZ.LIZIZ();
        int iLJIIL = this.LIZ.LJIIL(iLJJIJL);
        this.LIZ.LIZ++;
        interfaceC19924912xb.LJIIIIZZ(t, this, c19926312xp);
        this.LIZ.LIZ(0);
        r1.LIZ--;
        this.LIZ.LJIIJJI(iLJIIL);
    }
}
