package X;

import android.view.View;
import android.widget.CompoundButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10Iz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19224710Iz implements C10J0 {
    public final Function0<Unit> LIZ;
    public final Function0<Boolean> LIZIZ;
    public final CompoundButton.OnCheckedChangeListener LIZJ;
    public final Function1<View, Unit> LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C19224710Iz() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19224710Iz)) {
            return false;
        }
        C19224710Iz c19224710Iz = (C19224710Iz) obj;
        return Intrinsics.LJFF(this.LIZ, c19224710Iz.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19224710Iz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c19224710Iz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c19224710Iz.LIZLLL);
    }

    public final int hashCode() {
        Function0<Unit> function0 = this.LIZ;
        int iHashCode = (function0 == null ? 0 : function0.hashCode()) * 31;
        Function0<Boolean> function02 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function02 == null ? 0 : function02.hashCode())) * 31;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (onCheckedChangeListener == null ? 0 : onCheckedChangeListener.hashCode())) * 31;
        Function1<View, Unit> function1 = this.LIZLLL;
        return iHashCode3 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitcherCellPublishOptionActions(onClickWhenDisable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onInterceptToggle=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", onCheckedChangeListener=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", onOptionShow=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C10J0
    public final Function1<View, Unit> LIZ() {
        return this.LIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C19224710Iz(Function0<Unit> function0, Function0<Boolean> function02, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Function1<? super View, Unit> function1) {
        this.LIZ = function0;
        this.LIZIZ = function02;
        this.LIZJ = onCheckedChangeListener;
        this.LIZLLL = function1;
    }

    public /* synthetic */ C19224710Iz(Function0 function0, Function0 function02, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, Function1 function1, int i) {
        this((i & 1) != 0 ? null : function0, (i & 2) != 0 ? null : function02, (i & 4) != 0 ? null : onCheckedChangeListener, (i & 8) != 0 ? null : function1);
    }
}
