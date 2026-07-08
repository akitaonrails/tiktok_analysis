package X;

/* JADX INFO: renamed from: X.13IL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13IL implements C13H1<C19267310Zj> {
    public static final C13IL LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{c13gx, c13gx};
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
        C13IL c13il = new C13IL();
        LIZ = c13il;
        C19983913Gz c19983913Gz = new C19983913Gz("com.tiktok.kmp.deeplink.s2l.shortlinkcache.ShortLinkCacheManager.ShortLinkCacheEntry", c13il, 2);
        c19983913Gz.LJIIJ("longLink", false);
        c19983913Gz.LJIIJ("createTime", false);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        String strLJIILL = null;
        int i = 0;
        String strLJIILL2 = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ == 1) {
                        strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 1);
                        i |= 2;
                    } else {
                        throw new C13II(iLJIJJ);
                    }
                } else {
                    strLJIILL2 = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 0);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new C19267310Zj(i, strLJIILL2, strLJIILL);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        C19267310Zj c19267310Zj = (C19267310Zj) obj;
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 0, c19267310Zj.LIZ);
        interfaceC19986513HzLIZIZ.LJIILIIL(interfaceC19983313Gt, 1, c19267310Zj.LIZIZ);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
