package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS569S0100000_25;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.0tmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1678560tmY {
    public static final /* synthetic */ int LIZJ = 0;
    public final C1381605aw<EnumC1678550tmX> LIZ;
    public InterfaceC1690500u5o LIZIZ;

    public static final InterfaceC1690500u5o LIZ(C1678560tmY c1678560tmY) {
        InterfaceC1690500u5o interfaceC1690500u5o = c1678560tmY.LIZIZ;
        if (interfaceC1690500u5o != null) {
            return interfaceC1690500u5o;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("The density on DrawerState (");
        sbLIZ.append(c1678560tmY);
        sbLIZ.append(") was not set. Did you use DrawerState with the Drawer composable?");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public C1678560tmY(EnumC1678550tmX enumC1678550tmX, Function1<? super EnumC1678550tmX, Boolean> function1) {
        this.LIZ = new C1381605aw<>(enumC1678550tmX, new AwS604S0100000_25(this, 40), new AwS569S0100000_25(this, 47), C1678520tmU.LIZLLL, function1);
    }
}
