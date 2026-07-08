package X;

import android.os.Bundle;
import androidx.navigation.NavBackStackEntry;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS107S0210000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13qG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20134213qG extends AbstractC20133613qA {
    public final AbstractC20133313q7<? extends C20131713pr> LJI;
    public final /* synthetic */ C20134113qF LJII;

    /* JADX WARN: Removed duplicated region for block: B:16:0x005e  */
    @Override // X.AbstractC20133613qA
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(androidx.navigation.NavBackStackEntry r5) {
        /*
            r4 = this;
            X.13qF r0 = r4.LJII
            java.util.Map<androidx.navigation.NavBackStackEntry, java.lang.Boolean> r0 = r0.LJJI
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r1 = r0.get(r5)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            super.LIZIZ(r5)
            X.13qF r0 = r4.LJII
            java.util.Map<androidx.navigation.NavBackStackEntry, java.lang.Boolean> r0 = r0.LJJI
            r0.remove(r5)
            X.13qF r0 = r4.LJII
            X.13E8<androidx.navigation.NavBackStackEntry> r0 = r0.LJI
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L8d
            X.13qF r0 = r4.LJII
            r0.LJJIII(r5)
            androidx.lifecycle.LifecycleRegistry r0 = r5.LLIZLLLIL
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            boolean r0 = r1.isAtLeast(r0)
            if (r0 == 0) goto L3c
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            r5.LIZ(r0)
        L3c:
            X.13qF r0 = r4.LJII
            X.13E8<androidx.navigation.NavBackStackEntry> r1 = r0.LJI
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L72
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L72
        L4a:
            if (r3 != 0) goto L61
            X.13qF r0 = r4.LJII
            androidx.navigation.NavControllerViewModel r0 = r0.LJIILJJIL
            if (r0 == 0) goto L61
            java.lang.String r1 = r5.LLILZLL
            java.util.Map<java.lang.String, androidx.lifecycle.ViewModelStore> r0 = r0.LL
            java.lang.Object r0 = r0.remove(r1)
            androidx.lifecycle.ViewModelStore r0 = (androidx.lifecycle.ViewModelStore) r0
            if (r0 == 0) goto L61
            r0.clear()
        L61:
            X.13qF r0 = r4.LJII
            r0.LJJIIJ()
            X.13qF r0 = r4.LJII
            X.1DDq r1 = r0.LJII
            java.util.List r0 = r0.LJIL()
            r1.setValue(r0)
        L71:
            return
        L72:
            java.util.Iterator r2 = r1.iterator()
        L76:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4a
            java.lang.Object r0 = r2.next()
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            java.lang.String r1 = r0.LLILZLL
            java.lang.String r0 = r5.LLILZLL
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L76
            goto L61
        L8d:
            boolean r0 = r4.LIZLLL
            if (r0 != 0) goto L71
            X.13qF r0 = r4.LJII
            r0.LJJIIJ()
            X.13qF r0 = r4.LJII
            X.1DDq r1 = r0.LJII
            java.util.List r0 = r0.LJIL()
            r1.setValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20134213qG.LIZIZ(androidx.navigation.NavBackStackEntry):void");
    }

    @Override // X.AbstractC20133613qA
    public final void LJ(NavBackStackEntry navBackStackEntry) {
        AbstractC20133313q7 abstractC20133313q7LIZIZ = this.LJII.LJIJJ.LIZIZ(navBackStackEntry.LLILLJJLI.LL);
        if (Intrinsics.LJFF(abstractC20133313q7LIZIZ, this.LJI)) {
            Function1<? super NavBackStackEntry, Unit> function1 = this.LJII.LJIL;
            if (function1 != null) {
                function1.invoke(navBackStackEntry);
                super.LJ(navBackStackEntry);
                return;
            }
            return;
        }
        Object obj = ((LinkedHashMap) this.LJII.LJIJJLI).get(abstractC20133313q7LIZIZ);
        if (obj != null) {
            ((AbstractC20133613qA) obj).LJ(navBackStackEntry);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavigatorBackStack for ");
        sbLIZ.append(navBackStackEntry.LLILLJJLI.LL);
        sbLIZ.append(" should already be created");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalStateException(strLIZIZ);
    }

    public final void LJII(NavBackStackEntry navBackStackEntry) {
        super.LJ(navBackStackEntry);
    }

    public C20134213qG(C20134113qF c20134113qF, AbstractC20133313q7<? extends C20131713pr> abstractC20133313q7) {
        this.LJII = c20134113qF;
        this.LJI = abstractC20133313q7;
    }

    @Override // X.AbstractC20133613qA
    public final NavBackStackEntry LIZ(C20131713pr c20131713pr, Bundle bundle) {
        C20134113qF c20134113qF = this.LJII;
        return C197062128e.LIZ(c20134113qF.LIZ, c20131713pr, bundle, c20134113qF.LJIIIIZZ(), this.LJII.LJIILJJIL);
    }

    @Override // X.AbstractC20133613qA
    public final void LIZJ(NavBackStackEntry navBackStackEntry, boolean z) {
        AbstractC20133313q7 abstractC20133313q7LIZIZ = this.LJII.LJIJJ.LIZIZ(navBackStackEntry.LLILLJJLI.LL);
        if (Intrinsics.LJFF(abstractC20133313q7LIZIZ, this.LJI)) {
            C20134113qF c20134113qF = this.LJII;
            Function1<? super NavBackStackEntry, Unit> function1 = c20134113qF.LJJ;
            if (function1 != null) {
                function1.invoke(navBackStackEntry);
                super.LIZJ(navBackStackEntry, z);
                return;
            }
            AwS107S0210000_30 awS107S0210000_30 = new AwS107S0210000_30(this, navBackStackEntry, z, 1);
            int iIndexOf = c20134113qF.LJI.indexOf(navBackStackEntry);
            if (iIndexOf < 0) {
                return;
            }
            int i = iIndexOf + 1;
            if (i != c20134113qF.LJI.size()) {
                c20134113qF.LJIJI(c20134113qF.LJI.get(i).LLILLJJLI.LLIZLLLIL, true, false);
            }
            c20134113qF.LJIJJ(navBackStackEntry, false, new C13E8<>());
            awS107S0210000_30.invoke();
            c20134113qF.LJJIIJZLJL();
            c20134113qF.LIZIZ();
            return;
        }
        ((AbstractC20133613qA) ((LinkedHashMap) this.LJII.LJIJJLI).get(abstractC20133313q7LIZIZ)).LIZJ(navBackStackEntry, z);
    }

    @Override // X.AbstractC20133613qA
    public final void LIZLLL(NavBackStackEntry navBackStackEntry, boolean z) {
        super.LIZLLL(navBackStackEntry, z);
        this.LJII.LJJI.put(navBackStackEntry, Boolean.valueOf(z));
    }
}
