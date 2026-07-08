package X;

import X.C0U23;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0U1J, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public abstract class C0U1J<T extends C0U23> {
    public final CopyOnWriteArrayList<T> LIZ;
    public int LIZIZ;
    public AbstractC765580U1k LIZJ;
    public boolean LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public long LJI;
    public InterfaceC765610U1n LJII;
    public boolean LJIIIIZZ = true;

    public abstract C0U1L LIZJ();

    public abstract AbstractC765580U1k LIZLLL();

    public abstract void LJ(T t);

    public abstract void LJI(T t);

    public final void LIZ() {
        C20441214yg.LIZIZ("LiveApplog", "clear");
        LJIIJ();
        AbstractC765580U1k abstractC765580U1k = this.LIZJ;
        if (abstractC765580U1k != null) {
            abstractC765580U1k.setEnable(false);
        }
        AbstractC765580U1k abstractC765580U1k2 = this.LIZJ;
        if (abstractC765580U1k2 != null) {
            abstractC765580U1k2.LLJJIJIIJIL("");
        }
        this.LIZ.clear();
        this.LIZIZ = 0;
        this.LJI = 0L;
    }

    public final void LJIIIIZZ() {
        C20441214yg.LIZIZ("LiveApplog", "reset");
        AbstractC765580U1k abstractC765580U1k = this.LIZJ;
        if (abstractC765580U1k != null) {
            abstractC765580U1k.setEnable(false);
            abstractC765580U1k.LLJI(null, null);
            abstractC765580U1k.LLJJIJIL(1.0f);
            abstractC765580U1k.LLJILJIL(1.0f);
            abstractC765580U1k.LLJJJIL(0.0d);
            abstractC765580U1k.LLJJIJIIJIL(null);
        }
    }

    public final void LJIIJ() {
        if (this.LJ) {
            LIZJ().LIZ();
        }
        this.LJFF = false;
        this.LJ = false;
    }

    public final AbstractC765580U1k LIZIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SongListManager.getAudioFilterManager, audioFilterMgr:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" , initAudioFilterManager():");
        sbLIZ.append(LIZLLL());
        C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ));
        AbstractC765580U1k abstractC765580U1kLIZLLL = this.LIZJ;
        if (abstractC765580U1kLIZLLL == null) {
            abstractC765580U1kLIZLLL = LIZLLL();
            if (abstractC765580U1kLIZLLL == null) {
                return null;
            }
            this.LIZJ = abstractC765580U1kLIZLLL;
            LJFF(abstractC765580U1kLIZLLL);
        }
        return abstractC765580U1kLIZLLL;
    }

    public C0U1J(CopyOnWriteArrayList<T> copyOnWriteArrayList) {
        this.LIZ = copyOnWriteArrayList;
    }

    public void LJFF(AbstractC765580U1k abstractC765580U1k) {
        abstractC765580U1k.LLJIJIL(new InterfaceC765610U1n(this) { // from class: X.0U1j
            public final /* synthetic */ C0U1J<C0U23> LIZ;

            @Override // X.InterfaceC765600U1m
            public final void start() {
                C0U1J<C0U23> c0u1j = this.LIZ;
                c0u1j.LJ = true;
                InterfaceC765610U1n interfaceC765610U1n = c0u1j.LJII;
                if (interfaceC765610U1n != null) {
                    interfaceC765610U1n.start();
                }
            }

            @Override // X.InterfaceC765600U1m
            public final void stop() {
                C0U1J<C0U23> c0u1j = this.LIZ;
                c0u1j.LJ = false;
                c0u1j.LJFF = false;
                c0u1j.getClass();
                InterfaceC765610U1n interfaceC765610U1n = this.LIZ.LJII;
                if (interfaceC765610U1n != null) {
                    interfaceC765610U1n.stop();
                }
            }

            {
                this.LIZ = this;
            }

            @Override // X.InterfaceC765600U1m
            public final void onProgress(long j) {
                C0U1J<C0U23> c0u1j = this.LIZ;
                c0u1j.LJI = j;
                InterfaceC765610U1n interfaceC765610U1n = c0u1j.LJII;
                if (interfaceC765610U1n != null) {
                    interfaceC765610U1n.onProgress(j);
                }
            }

            @Override // X.InterfaceC765610U1n
            public final void J(int i, Exception exc) {
                C0U1J<C0U23> c0u1j = this.LIZ;
                c0u1j.LJ = false;
                c0u1j.LJFF = false;
                InterfaceC765610U1n interfaceC765610U1n = c0u1j.LJII;
                if (interfaceC765610U1n != null) {
                    interfaceC765610U1n.J(i, exc);
                }
            }
        });
        abstractC765580U1k.LLJJ();
        abstractC765580U1k.LLJJI(true);
        abstractC765580U1k.LLJILJILJ();
        abstractC765580U1k.LLIZLLLIL();
    }

    public boolean LJII(int i, boolean z) {
        C0U23 c0u23;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SongListMaanger.playAt, block:");
        sbLIZ.append(this.LJIIIIZZ);
        C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIIIZZ) {
            C20441214yg.LIZIZ("KaraokeMulti", "SongListManager Blocked");
            return false;
        }
        if (this.LIZ.size() <= i || (c0u23 = (C0U23) C13LP.LJJJLZIJ(i, this.LIZ)) == null) {
            return false;
        }
        if (this.LJ && !z) {
            return false;
        }
        if (this.LJFF && !z) {
            LIZJ().LIZIZ();
            LJ(c0u23);
        } else {
            C20441214yg.LIZIZ("legolas_play", "SongListMaanger.playAt,getPlayer()");
            LIZJ().LIZLLL(c0u23);
            LJI(c0u23);
        }
        this.LJFF = false;
        this.LJ = true;
        return true;
    }

    public final void LJIIIZ(AbstractC765580U1k abstractC765580U1k, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("songListManager.setAudioFilterManager, audioFilterMgr:");
        sbLIZ.append(abstractC765580U1k);
        C20441214yg.LIZIZ("legolas_play", C2188811AlT.LIZIZ(sbLIZ));
        this.LIZJ = abstractC765580U1k;
        if (abstractC765580U1k != null) {
            if (z) {
                LJFF(abstractC765580U1k);
            }
            LIZJ().LIZJ(abstractC765580U1k);
        }
    }
}
