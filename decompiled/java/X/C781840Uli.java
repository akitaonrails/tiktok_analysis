package X;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS556S0100000_12;

/* JADX INFO: renamed from: X.0Uli, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C781840Uli {
    public final List<View> LIZ;
    public final Function0<Unit> LIZIZ;
    public final Function0<Unit> LIZJ;
    public EnumC781850Ulj LIZLLL;
    public final Map<View, View.OnLayoutChangeListener> LJ = new LinkedHashMap();
    public boolean LJFF;

    public final void LIZ() {
        boolean z;
        List<View> list = this.LIZ;
        boolean z2 = false;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<View> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().getVisibility() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        List<View> list2 = this.LIZ;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = true;
        } else {
            Iterator<View> it3 = list2.iterator();
            while (it3.hasNext()) {
                if (it3.next().getVisibility() == 0) {
                    break;
                }
            }
            z2 = true;
        }
        EnumC781850Ulj enumC781850Ulj = z ? EnumC781850Ulj.LL : z2 ? EnumC781850Ulj.LLILLJJLI : EnumC781850Ulj.LLILLL;
        if (enumC781850Ulj != this.LIZLLL) {
            this.LIZLLL = enumC781850Ulj;
            int iOrdinal = enumC781850Ulj.ordinal();
            if (iOrdinal == 0) {
                this.LIZIZ.invoke();
            } else if (iOrdinal == 1) {
                this.LIZJ.invoke();
            } else if (iOrdinal != 2) {
                throw new C1954807lC();
            }
        }
    }

    public C781840Uli(List list, AwS556S0100000_12 awS556S0100000_12, AwS556S0100000_12 awS556S0100000_122) {
        this.LIZ = list;
        this.LIZIZ = awS556S0100000_12;
        this.LIZJ = awS556S0100000_122;
    }
}
