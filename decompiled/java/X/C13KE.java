package X;

import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel$$serializer;
import com.ss.ugc.effectplatform.model.DiffEffect;

/* JADX INFO: renamed from: X.13KE, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13KE implements C13H1<DiffEffect> {
    public static final C13KE LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        UrlModel$$serializer urlModel$$serializer = UrlModel$$serializer.INSTANCE;
        return new C13HG[]{urlModel$$serializer, urlModel$$serializer, C19983613Gw.LIZ(C13GX.LIZ)};
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
        C13KE c13ke = new C13KE();
        LIZ = c13ke;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.ugc.effectplatform.model.DiffEffect", c13ke, 3);
        c19983913Gz.LJIIJ("diff_url", true);
        c19983913Gz.LJIIJ("base_url", true);
        c19983913Gz.LJIIJ("extra", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        UrlModel urlModel = null;
        int i = 0;
        UrlModel urlModel2 = null;
        String str = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ == 2) {
                            str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 2, C13GX.LIZ, str);
                            i |= 4;
                        } else {
                            throw new C13II(iLJIJJ);
                        }
                    } else {
                        urlModel2 = (UrlModel) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 1, UrlModel$$serializer.INSTANCE, urlModel2);
                        i |= 2;
                    }
                } else {
                    urlModel = (UrlModel) interfaceC19986313HxLIZIZ.LJI(interfaceC19983313Gt, 0, UrlModel$$serializer.INSTANCE, urlModel);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new DiffEffect(i, urlModel, urlModel2, str, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        DiffEffect.write$Self((DiffEffect) obj, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
