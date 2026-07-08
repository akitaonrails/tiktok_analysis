package X;

import com.bytedance.android.widget.Widget;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS591S0100000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ujl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C780630Ujl {
    public Widget LIZ;
    public final Class<? extends LiveRecyclableWidget> LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final Object[] LJ;
    public EnumC780830Uk5 LJFF;
    public EnumC2011707uN LJI;
    public Function0<Unit> LJII;
    public Function1<? super Widget, Unit> LJIIIIZZ;

    public C780630Ujl() {
        this(null, null, null, null, null, 511);
    }

    public final int hashCode() {
        Widget widget = this.LIZ;
        int iHashCode = (widget != null ? widget.hashCode() : 0) * 31;
        Class<? extends LiveRecyclableWidget> cls = this.LIZIZ;
        int iHashCode2 = (iHashCode + (cls != null ? cls.hashCode() : 0)) * 31;
        Integer num = this.LIZJ;
        int iIntValue = (((iHashCode2 + (num != null ? num.intValue() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31;
        Object[] objArr = this.LJ;
        int iHashCode3 = (iIntValue + (objArr != null ? Arrays.hashCode(objArr) : 0)) * 31;
        EnumC780830Uk5 enumC780830Uk5 = this.LJFF;
        int iHashCode4 = (iHashCode3 + (enumC780830Uk5 != null ? enumC780830Uk5.hashCode() : 0)) * 31;
        EnumC2011707uN enumC2011707uN = this.LJI;
        int iHashCode5 = (iHashCode4 + (enumC2011707uN != null ? enumC2011707uN.hashCode() : 0)) * 31;
        Function0<Unit> function0 = this.LJII;
        int iHashCode6 = (iHashCode5 + (function0 != null ? function0.hashCode() : 0)) * 31;
        Function1<? super Widget, Unit> function1 = this.LJIIIIZZ;
        return iHashCode6 + (function1 != null ? function1.hashCode() : 0);
    }

    public final String toString() {
        String simpleName;
        Class<?> cls = this.LIZIZ;
        if (cls != null) {
            simpleName = cls.getSimpleName();
        } else {
            Widget widget = this.LIZ;
            if (widget != null) {
                cls = widget.getClass();
                simpleName = cls.getSimpleName();
            } else {
                simpleName = null;
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("widgetClass: ");
        sbLIZ.append(simpleName);
        sbLIZ.append(", async: ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", priority: ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" ,group:");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", widget: ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", widgetClass: ");
        sbLIZ.append(simpleName);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        String name;
        String name2;
        String name3;
        if (!(obj instanceof C780630Ujl)) {
            return false;
        }
        C780630Ujl c780630Ujl = (C780630Ujl) obj;
        Class<? extends LiveRecyclableWidget> cls = c780630Ujl.LIZIZ;
        String name4 = null;
        if (cls != null) {
            name = cls.getName();
        } else {
            name = null;
        }
        Class<? extends LiveRecyclableWidget> cls2 = this.LIZIZ;
        if (cls2 != null) {
            name2 = cls2.getName();
        } else {
            name2 = null;
        }
        if (!Intrinsics.LJFF(name, name2)) {
            return false;
        }
        Widget widget = c780630Ujl.LIZ;
        if (widget != null) {
            name3 = widget.getClass().getName();
        } else {
            name3 = null;
        }
        Widget widget2 = this.LIZ;
        if (widget2 != null) {
            name4 = widget2.getClass().getName();
        }
        if (!Intrinsics.LJFF(name3, name4)) {
            return false;
        }
        return true;
    }

    public C780630Ujl(LiveWidget liveWidget, Class cls, Integer num, Object[] objArr, AwS591S0100000_12 awS591S0100000_12, int i) {
        boolean z;
        liveWidget = (i & 1) != 0 ? null : liveWidget;
        cls = (i & 2) != 0 ? null : cls;
        num = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            z = true;
        } else {
            z = false;
        }
        objArr = (i & 16) != 0 ? null : objArr;
        awS591S0100000_12 = (i & 256) != 0 ? null : awS591S0100000_12;
        this.LIZ = liveWidget;
        this.LIZIZ = cls;
        this.LIZJ = num;
        this.LIZLLL = z;
        this.LJ = objArr;
        this.LJFF = null;
        this.LJI = null;
        this.LJII = null;
        this.LJIIIIZZ = awS591S0100000_12;
    }
}
