package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C652830Pj7 implements InterfaceC652740Piy {
    public final View LL;
    public final Function0<Integer> LLILLJJLI;
    public final Function0<Boolean> LLILLL;

    @Override // X.InterfaceC652740Piy
    public final boolean LIZJ() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C652830Pj7)) {
            return false;
        }
        C652830Pj7 c652830Pj7 = (C652830Pj7) obj;
        return Intrinsics.LJFF(this.LL, c652830Pj7.LL) && Intrinsics.LJFF(this.LLILLJJLI, c652830Pj7.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c652830Pj7.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckItemAbility(view=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", positionFetcher=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPlayableCompatFetcher=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC652740Piy
    public final int getPosition() {
        return this.LLILLJJLI.invoke().intValue();
    }

    @Override // X.InterfaceC652740Piy
    public final View getView() {
        return this.LL;
    }

    public C652830Pj7(View view, Function0<Integer> function0, Function0<Boolean> function02) {
        this.LL = view;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }
}
