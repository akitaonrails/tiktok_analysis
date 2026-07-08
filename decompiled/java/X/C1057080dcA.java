package X;

import com.ss.android.ugc.tiktok.commercialize.dispatcher.impl.settings.CommonDispatchConfigModel;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1057080dcA extends AbstractC1056960dby implements InterfaceC1057000dc2 {
    public final C01GW LIZIZ = C452501pT.LIZIZ(new C1057090dcB());
    public final C01GW LIZJ = C452501pT.LIZIZ(new C1057020dc4());
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C1057170dcJ(this));
    public int LJ = EnumC1057160dcI.CPU_BUSY.getValue();
    public final C01GW LJFF = C452501pT.LIZIZ(new C1057140dcG(this));
    public final C01GW LJI = C452501pT.LIZIZ(new C1057210dcN(this));
    public final C01GW LJII = C452501pT.LIZIZ(new C1057200dcM(this));

    @Override // X.InterfaceC1057000dc2
    public final void LIZ() {
        ((AtomicBoolean) this.LIZIZ.getValue()).set(true);
        int i = this.LJ;
        LJ(i, i);
    }

    @Override // X.AbstractC1056960dby
    public final EnumC588020N4m LIZIZ() {
        return this.LJ == 0 ? EnumC588020N4m.IDLE : EnumC588020N4m.BUSY;
    }

    @Override // X.AbstractC1056960dby
    public final void LIZJ() {
        Boolean bool = ((CommonDispatchConfigModel) this.LIZJ.getValue()).enableCheckSliding;
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            C1BCA.LJJII((C0CMW) this.LJI.getValue());
        }
        C1BCA.LJIJ((InterfaceC1702110uOX) this.LJFF.getValue(), true, 0L, (C1057270dcT) this.LIZLLL.getValue());
        if (Intrinsics.LJFF(((CommonDispatchConfigModel) this.LIZJ.getValue()).enableCheckMainThread, bool2)) {
            C1BCA.LJIL((C1BC6) this.LJII.getValue());
        }
    }

    @Override // X.AbstractC1056960dby
    public final EnumC1017030cZZ LIZLLL() {
        return EnumC1017030cZZ.MAIN_IDLE;
    }

    public final void LJ(int i, int i2) {
        EnumC588020N4m enumC588020N4m;
        EnumC588020N4m enumC588020N4m2;
        this.LJ = i2;
        if (Intrinsics.LJFF(((CommonDispatchConfigModel) this.LIZJ.getValue()).enableCheckColdLaunch, Boolean.TRUE) && !((AtomicBoolean) this.LIZIZ.getValue()).get()) {
            return;
        }
        if (i == 0) {
            enumC588020N4m = EnumC588020N4m.IDLE;
        } else {
            enumC588020N4m = EnumC588020N4m.BUSY;
        }
        if (i2 == 0) {
            enumC588020N4m2 = EnumC588020N4m.IDLE;
        } else {
            enumC588020N4m2 = EnumC588020N4m.BUSY;
        }
        InterfaceC1057220dcO interfaceC1057220dcO = this.LIZ;
        if (interfaceC1057220dcO != null) {
            interfaceC1057220dcO.LIZ(enumC588020N4m, enumC588020N4m2);
        }
    }
}
