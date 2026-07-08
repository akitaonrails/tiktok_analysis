package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.11uT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final /* synthetic */ class C19650711uT implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ C19650811uU LL;

    public C19650711uT(C19650811uU c19650811uU) {
        this.LL = c19650811uU;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C1696260uF6(2, this.LL, C19650811uU.class, "onBlockUIUpdate", "onBlockUIUpdate(Z)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        C19650811uU c19650811uU = this.LL;
        c19650811uU.LJIIIIZZ = zBooleanValue;
        c19650811uU.LIZJ.invoke(Boolean.valueOf(zBooleanValue));
        if (!zBooleanValue) {
            c19650811uU.LIZ();
        }
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
