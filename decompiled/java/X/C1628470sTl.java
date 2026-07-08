package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sTl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final /* synthetic */ class C1628470sTl implements InterfaceC346701Wf, InterfaceC1635506an {
    public final /* synthetic */ C1628410sTf LL;

    public C1628470sTl(C1628410sTf c1628410sTf) {
        this.LL = c1628410sTf;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC346701Wf) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C1696260uF6(2, this.LL, C1628410sTf.class, "propClick", "propClick(Lcom/ss/android/ugc/slideslip/et/EffectClickMobInfo;)V", 4);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC346701Wf
    public final Object emit(Object obj, InterfaceC1364105Vn interfaceC1364105Vn) {
        this.LL.H2((C1627860sSm) obj);
        Unit unit = Unit.LIZ;
        C099R.LJFF();
        return unit;
    }
}
