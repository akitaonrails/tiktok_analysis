package X;

/* JADX INFO: renamed from: X.13IH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13IH implements C13H1<C10VH> {
    public static final C13IH LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13HI c13hi = C13HI.LIZ;
        C13H6 c13h6 = C13H6.LIZ;
        return new C13HG[]{c13hi, c13h6, c13h6, c13hi};
    }

    @Override // X.C13HG, X.InterfaceC19984413He, X.InterfaceC19984213Hc
    public final InterfaceC19983313Gt getDescriptor() {
        return descriptor;
    }

    @Override // X.C13H1
    public final /* synthetic */ C13HG[] typeParametersSerializers() {
        return C13H3.LIZ;
    }

    static {
        C13IH c13ih = new C13IH();
        LIZ = c13ih;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.nu.feed.ShortcutRefreshEntryManager.ShortcutEntryForFeedRefreshSettingsModel", c13ih, 4);
        c19983913Gz.LJIIJ("skip_num", true);
        c19983913Gz.LJIIJ("tooltip_delay_show", true);
        c19983913Gz.LJIIJ("tooltip_duration", true);
        c19983913Gz.LJIIJ("tooltip_max_show_times", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        int i = 0;
        int iLJIJJLI = 0;
        int iLJIJJLI2 = 0;
        long jLJIIIIZZ = 0;
        long jLJIIIIZZ2 = 0;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ != 2) {
                            if (iLJIJJ == 3) {
                                iLJIJJLI2 = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 3);
                                i |= 8;
                            } else {
                                throw new C13II(iLJIJJ);
                            }
                        } else {
                            jLJIIIIZZ2 = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 2);
                            i |= 4;
                        }
                    } else {
                        jLJIIIIZZ = interfaceC19986313HxLIZIZ.LJIIIIZZ(interfaceC19983313Gt, 1);
                        i |= 2;
                    }
                } else {
                    iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new C10VH(i, iLJIJJLI, jLJIIIIZZ, jLJIIIIZZ2, iLJIJJLI2);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C10VH c10vh = (C10VH) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c10vh.LIZ != 8) {
            interfaceC19986513HzLIZIZ.LJ(0, c10vh.LIZ, interfaceC19983313Gt);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c10vh.LIZIZ != 0) {
            interfaceC19986513HzLIZIZ.LJFF(interfaceC19983313Gt, 1, c10vh.LIZIZ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c10vh.LIZJ != 3000) {
            interfaceC19986513HzLIZIZ.LJFF(interfaceC19983313Gt, 2, c10vh.LIZJ);
        }
        if (interfaceC19986513HzLIZIZ.LJIJJ() || c10vh.LIZLLL != 1) {
            interfaceC19986513HzLIZIZ.LJ(3, c10vh.LIZLLL, interfaceC19983313Gt);
        }
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
