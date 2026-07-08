package X;

import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.05KE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05KE extends C09AY implements Function0<C05KD> {
    public C05KE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.05KD] */
    @Override // kotlin.jvm.functions.Function0
    public final C05KD invoke() {
        return new InterfaceC15516065q() { // from class: X.05KD
            @Override // X.InterfaceC15516065q
            public final void LIZJ() {
                C1725506pJ c1725506pJ = C1725506pJ.LIZ;
                List listSingletonList = Collections.singletonList(C05KF.SWITCH_ACCOUNT);
                c1725506pJ.getClass();
                C1725506pJ.LIZIZ(listSingletonList);
            }

            @Override // X.InterfaceC15516065q
            public final void LIZLLL() {
                C1725506pJ.LIZ.getClass();
                C23250099c.LIZLLL(C1725506pJ.LJIIIIZZ, null, null, new C05G8(null), 3);
            }

            @Override // X.InterfaceC15516065q
            public final void LJI() {
                C1725506pJ c1725506pJ = C1725506pJ.LIZ;
                List listSingletonList = Collections.singletonList(C05KF.INBOX_MODE_SWITCH);
                c1725506pJ.getClass();
                C1725506pJ.LIZIZ(listSingletonList);
            }

            @Override // X.InterfaceC15516065q
            public final void LJ(EnumC1725606pK enumC1725606pK) {
                C1725506pJ.LIZ.getClass();
                C1725506pJ.LIZ(enumC1725606pK, true);
            }

            @Override // X.InterfaceC15516065q
            public final <T> Object LIZ(EnumC1725606pK enumC1725606pK, T t, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
                return C1725506pJ.LIZ.LJIIIIZZ(enumC1725606pK, t, interfaceC1364105Vn);
            }

            @Override // X.InterfaceC15516065q
            public final <T> Object LIZIZ(EnumC1725606pK enumC1725606pK, String str, String str2, InterfaceC1364105Vn<? super T> interfaceC1364105Vn) {
                return C1725506pJ.LIZ.LJ(enumC1725606pK, str, str2, interfaceC1364105Vn);
            }

            @Override // X.InterfaceC15516065q
            public final <T> T LJFF(EnumC1725606pK enumC1725606pK, String str, String str2, boolean z, boolean z2) {
                C1725506pJ.LIZ.getClass();
                return (T) C1725506pJ.LJFF(enumC1725606pK, str, str2, z, z2);
            }

            @Override // X.InterfaceC15516065q
            public final Object LJII(EnumC1725606pK enumC1725606pK, String str, String str2, boolean z, C885660Yom c885660Yom) {
                C1725506pJ c1725506pJ = C1725506pJ.LIZ;
                c1725506pJ.getClass();
                Object objLJFF = C1725506pJ.LJFF(enumC1725606pK, str, str2, z, false);
                if (objLJFF == null) {
                    return c1725506pJ.LJ(enumC1725606pK, str, str2, c885660Yom);
                }
                return objLJFF;
            }
        };
    }
}
