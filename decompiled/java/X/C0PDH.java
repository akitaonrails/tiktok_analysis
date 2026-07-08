package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PDH, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PDH implements InterfaceC111300bX {
    public final ViewOnAttachStateChangeListenerC20604515jv LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PDH) && Intrinsics.LJFF(this.LL, ((C0PDH) obj).LL);
    }

    public final int hashCode() {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = this.LL;
        if (viewOnAttachStateChangeListenerC20604515jv == null) {
            return 0;
        }
        return viewOnAttachStateChangeListenerC20604515jv.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiCreateEntranceHierarchyData(powerList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PDH(ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv) {
        this.LL = viewOnAttachStateChangeListenerC20604515jv;
    }
}
