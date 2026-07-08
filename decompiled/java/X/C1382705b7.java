package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS546S0100000_2;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.05b7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1382705b7 {
    public static final /* synthetic */ int LJ = 0;
    public final InterfaceC1677030tk5<Float> LIZ;
    public final boolean LIZIZ;
    public final C1381605aw<EnumC1382405b4> LIZJ;
    public InterfaceC1690500u5o LIZLLL;

    @InterfaceC1294060jmO
    public C1382705b7() {
        throw null;
    }

    public static final InterfaceC1690500u5o LIZ(C1382705b7 c1382705b7) {
        InterfaceC1690500u5o interfaceC1690500u5o = c1382705b7.LIZLLL;
        if (interfaceC1690500u5o != null) {
            return interfaceC1690500u5o;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The density on ModalBottomSheetState (");
        sbLIZ.append(c1382705b7);
        sbLIZ.append(") was not set. Did you use ModalBottomSheetState with the ModalBottomSheetLayout composable?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public final Object LIZJ(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLIZIZ = LIZIZ(this, EnumC1382405b4.Hidden, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    public final Object LIZLLL(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C1381605aw<EnumC1382405b4> c1381605aw = this.LIZJ;
        EnumC1382405b4 enumC1382405b4 = EnumC1382405b4.HalfExpanded;
        if (!c1381605aw.LIZIZ().containsKey(enumC1382405b4)) {
            enumC1382405b4 = EnumC1382405b4.Expanded;
        }
        Object objLIZIZ = LIZIZ(this, enumC1382405b4, interfaceC1364105Vn);
        if (objLIZIZ == C099R.LJFF()) {
            return objLIZIZ;
        }
        return Unit.LIZ;
    }

    public static Object LIZIZ(C1382705b7 c1382705b7, EnumC1382405b4 enumC1382405b4, InterfaceC1364105Vn interfaceC1364105Vn) {
        Object objLIZJ = C1381205as.LIZJ(((C13FI) c1382705b7.LIZJ.LJIIJ).LIZIZ(), c1382705b7.LIZJ, enumC1382405b4, interfaceC1364105Vn);
        if (objLIZJ != C099R.LJFF()) {
            return Unit.LIZ;
        }
        return objLIZJ;
    }

    @InterfaceC1294060jmO
    public C1382705b7(EnumC1382405b4 enumC1382405b4, InterfaceC1677030tk5<Float> interfaceC1677030tk5, boolean z, Function1<? super EnumC1382405b4, Boolean> function1) {
        this.LIZ = interfaceC1677030tk5;
        this.LIZIZ = z;
        this.LIZJ = new C1381605aw<>(enumC1382405b4, new AwS581S0100000_2(this, 43), new AwS546S0100000_2(this, 34), interfaceC1677030tk5, function1);
        if (z && enumC1382405b4 == EnumC1382405b4.HalfExpanded) {
            "The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.".toString();
            throw new IllegalArgumentException("The initial value must not be set to HalfExpanded if skipHalfExpanded is set to true.");
        }
    }
}
