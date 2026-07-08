package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;

/* JADX INFO: renamed from: X.0jJr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1276370jJr {
    public final Room LIZ;
    public final boolean LIZIZ;
    public final C0TD5 LIZJ;
    public final String LIZLLL;
    public InterfaceC754220TiG LJ;
    public InterfaceC1276380jJs LJFF;
    public C742930TCh LJI;
    public boolean LJII;
    public String LJIIIIZZ;
    public long LJIIIZ;
    public int LJIIJ;
    public final C11PQ<AbstractC742900TCe> LJIIJJI;
    public final C11PQ<Integer> LJIIL;
    public final C743080TCw LJIILIIL;

    public final C1276440jJy LIZIZ() {
        AbstractC1273900jFs abstractC1273900jFs;
        C1269340j8W c1269340j8WLLD;
        C1276440jJy c1276440jJy = new C1276440jJy();
        InterfaceC754220TiG interfaceC754220TiG = this.LJ;
        InterfaceC1273910jFt liveCore = interfaceC754220TiG != null ? interfaceC754220TiG.getLiveCore() : null;
        if (!(liveCore instanceof AbstractC1273900jFs) || (abstractC1273900jFs = (AbstractC1273900jFs) liveCore) == null || (c1269340j8WLLD = abstractC1273900jFs.LLD()) == null) {
            return c1276440jJy;
        }
        if (!this.LIZIZ) {
            c1276440jJy.LIZ = c1269340j8WLLD.LJIILJJIL(0);
            c1276440jJy.LIZIZ = c1269340j8WLLD.LJIILIIL(0);
            return c1276440jJy;
        }
        c1276440jJy.LIZ = c1269340j8WLLD.LJJIL(1);
        int iLJJIJIIJIL = c1269340j8WLLD.LJJIJIIJIL(1);
        c1276440jJy.LIZIZ = iLJJIJIIJIL;
        if (iLJJIJIIJIL >= 2000) {
            c1276440jJy.LIZ = 1080;
            c1276440jJy.LIZIZ = (int) (1080 * (iLJJIJIIJIL / c1276440jJy.LIZ));
        }
        return c1276440jJy;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.0TCw] */
    public C1276370jJr(Room room, boolean z, C0TD5 c0td5) {
        this.LIZ = room;
        this.LIZIZ = z;
        this.LIZJ = c0td5;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Engine]");
        sbLIZ.append("DualDeviceRtc");
        this.LIZLLL = C2188811AlT.LIZIZ(sbLIZ);
        this.LJIIIZ = -1L;
        this.LJIIJJI = C11PQ.LJLLLLLL(new AbstractC742900TCe() { // from class: X.0TCr
            public final String toString() {
                return "StateNone{}";
            }
        });
        this.LJIIL = C11PQ.LJLLLLLL(0);
        this.LJIILIIL = new InterfaceC775310UbB() { // from class: X.0TCw
            @Override // X.InterfaceC775310UbB
            public final void LIZ() {
            }
        };
    }

    public static void LIZ(C1276370jJr c1276370jJr, String str, String str2) {
        c1276370jJr.getClass();
        C1AZW.LIZ.getClass();
        C1AZW.LIZ(str2, str, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x04eb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0589  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0388  */
    /* JADX WARN: Type inference failed for: r10v9, types: [X.0TCh] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26) {
        /*
            Method dump skipped, instruction units count: 1445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1276370jJr.LIZJ(java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }
}
