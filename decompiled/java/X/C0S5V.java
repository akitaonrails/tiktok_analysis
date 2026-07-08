package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S5V, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class C0S5V implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ C0SB7 LL;

    public C0S5V(C0SB7 c0sb7) {
        this.LL = c0sb7;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C1696260uF6(2, this.LL, C0SB7.class, "handleMasterToggleChanged", "handleMasterToggleChanged(Lcom/ss/android/ugc/aweme/sharedmodel/MasterToggleState;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        C708250RqJ c708250RqJ = (C708250RqJ) obj;
        C0SB7 c0sb7 = this.LL;
        c0sb7.getClass();
        c0sb7.LIZ("switch_toggle", c708250RqJ.LIZIZ, c708250RqJ.LIZ);
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
