package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01ei, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C385801ei {
    public final int LIZ;
    public final InterfaceC1631620sYq<Fragment, LifecycleOwner, C499640Jic, Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C385801ei)) {
            return false;
        }
        C385801ei c385801ei = (C385801ei) obj;
        return this.LIZ == c385801ei.LIZ && Intrinsics.LJFF(this.LIZIZ, c385801ei.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c385801ei.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c385801ei.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SettingItemRegistration(tag=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bindView=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onItemShow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onItemHide=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C385801ei(int i, InterfaceC1631620sYq<? super Fragment, ? super LifecycleOwner, ? super C499640Jic, Unit> interfaceC1631620sYq, Function0<Unit> function0, Function0<Unit> function02) {
        this.LIZ = i;
        this.LIZIZ = interfaceC1631620sYq;
        this.LIZJ = function0;
        this.LIZLLL = function02;
    }
}
