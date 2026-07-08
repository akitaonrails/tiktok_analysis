package X;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PkY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653720PkY implements InterfaceC652740Piy {
    public final View LL;
    public final Function0<Integer> LLILLJJLI;

    @Override // X.InterfaceC652740Piy
    public final boolean LIZJ() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C653720PkY)) {
            return false;
        }
        C653720PkY c653720PkY = (C653720PkY) obj;
        return Intrinsics.LJFF(this.LL, c653720PkY.LL) && Intrinsics.LJFF(this.LLILLJJLI, c653720PkY.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CheckItemAbility(view=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", positionFetcher=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C653720PkY(View view, Function0<Integer> function0) {
        this.LL = view;
        this.LLILLJJLI = function0;
    }
}
