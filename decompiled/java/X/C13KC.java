package X;

import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel;
import com.ss.android.ugc.effectmanager.effect.model.HorizontalEffectsModel$$serializer;
import com.ss.ugc.effectplatform.model.stream.HorizontalEffectsResponseV2;

/* JADX INFO: renamed from: X.13KC, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
@InterfaceC1294060jmO
public /* synthetic */ class C13KC implements C13H1<HorizontalEffectsResponseV2> {
    public static final C13KC LIZ;
    public static final InterfaceC19983313Gt descriptor;

    @Override // X.C13H1
    public final C13HG<?>[] childSerializers() {
        C13GX c13gx = C13GX.LIZ;
        return new C13HG[]{C19983613Gw.LIZ(HorizontalEffectsModel$$serializer.INSTANCE), C19983613Gw.LIZ(c13gx), C13HI.LIZ, c13gx};
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
        C13KC c13kc = new C13KC();
        LIZ = c13kc;
        C19983913Gz c19983913Gz = new C19983913Gz("com.ss.ugc.effectplatform.model.stream.HorizontalEffectsResponseV2", c13kc, 4);
        c19983913Gz.LJIIJ("data", true);
        c19983913Gz.LJIIJ("message", true);
        c19983913Gz.LJIIJ("status_code", true);
        c19983913Gz.LJIIJ("data_type", true);
        descriptor = c19983913Gz;
    }

    @Override // X.InterfaceC19984213Hc
    public final Object deserialize(C13HB c13hb) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986313Hx interfaceC19986313HxLIZIZ = c13hb.LIZIZ(interfaceC19983313Gt);
        interfaceC19986313HxLIZIZ.LJJII();
        HorizontalEffectsModel horizontalEffectsModel = null;
        int i = 0;
        int iLJIJJLI = 0;
        String str = null;
        String strLJIILL = null;
        while (true) {
            int iLJIJJ = interfaceC19986313HxLIZIZ.LJIJJ(interfaceC19983313Gt);
            if (iLJIJJ != -1) {
                if (iLJIJJ != 0) {
                    if (iLJIJJ != 1) {
                        if (iLJIJJ != 2) {
                            if (iLJIJJ == 3) {
                                strLJIILL = interfaceC19986313HxLIZIZ.LJIILL(interfaceC19983313Gt, 3);
                                i |= 8;
                            } else {
                                throw new C13II(iLJIJJ);
                            }
                        } else {
                            iLJIJJLI = interfaceC19986313HxLIZIZ.LJIJJLI(interfaceC19983313Gt, 2);
                            i |= 4;
                        }
                    } else {
                        str = (String) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 1, C13GX.LIZ, str);
                        i |= 2;
                    }
                } else {
                    horizontalEffectsModel = (HorizontalEffectsModel) interfaceC19986313HxLIZIZ.LJIIIZ(interfaceC19983313Gt, 0, HorizontalEffectsModel$$serializer.INSTANCE, horizontalEffectsModel);
                    i |= 1;
                }
            } else {
                interfaceC19986313HxLIZIZ.LJIIJJI(interfaceC19983313Gt);
                return new HorizontalEffectsResponseV2(i, horizontalEffectsModel, str, iLJIJJLI, strLJIILL, null);
            }
        }
    }

    @Override // X.InterfaceC19984413He
    public final void serialize(C13HD c13hd, Object obj) {
        InterfaceC19983313Gt interfaceC19983313Gt = descriptor;
        InterfaceC19986513Hz interfaceC19986513HzLIZIZ = c13hd.LIZIZ(interfaceC19983313Gt);
        HorizontalEffectsResponseV2.write$Self$ckresource_model_release((HorizontalEffectsResponseV2) obj, interfaceC19986513HzLIZIZ, interfaceC19983313Gt);
        interfaceC19986513HzLIZIZ.LIZLLL();
    }
}
