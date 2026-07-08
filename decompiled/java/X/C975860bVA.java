package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0bVA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C975860bVA extends C2217421BqW implements Function0<Unit> {
    public C975860bVA(C975830bV7 c975830bV7) {
        super(0, c975830bV7, C975830bV7.class, "onLynxErrorDuringPrepare", "onLynxErrorDuringPrepare()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        EnumC964170bCJ enumC964170bCJY2;
        C975800bV4 c975800bV4 = (C975800bV4) this.receiver;
        InterfaceC975520bUc interfaceC975520bUc = c975800bV4.LIZIZ;
        if (interfaceC975520bUc == null || (enumC964170bCJY2 = interfaceC975520bUc.Y2()) == null) {
            enumC964170bCJY2 = EnumC964170bCJ.NONE;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLynxError, currentStatus: ");
        sbLIZ.append(enumC964170bCJY2);
        C20441214yg.LIZIZ("BaseMultiMatchState", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC964170bCJY2 == EnumC964170bCJ.PREPARING) {
            C975800bV4.LJJIIJ(c975800bV4, EnumC975850bV9.LYNX_UI_ERROR);
        }
        return Unit.LIZ;
    }
}
