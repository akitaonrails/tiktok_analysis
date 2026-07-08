package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AFwS329S0000000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Cj9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C321610Cj9 {
    public EnumC322640Cko LIZ;
    public final InterfaceC1631620sYq<? super LinearLayoutManager, ? super Context, ? super Integer, Boolean> LIZIZ;
    public final InterfaceC1631620sYq<? super C336550DHh, ? super RecyclerView, ? super Integer, Integer> LIZJ;

    public C321610Cj9() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C321610Cj9)) {
            return false;
        }
        C321610Cj9 c321610Cj9 = (C321610Cj9) obj;
        return this.LIZ == c321610Cj9.LIZ && Intrinsics.LJFF(this.LIZIZ, c321610Cj9.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c321610Cj9.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C321610Cj9(EnumC322640Cko enumC322640Cko, int i) {
        AFwS329S0000000_4 aFwS329S0000000_4;
        enumC322640Cko = (i & 1) != 0 ? EnumC322640Cko.NORMAL : enumC322640Cko;
        if ((i & 2) != 0) {
            aFwS329S0000000_4 = AFwS329S0000000_4.get$arr$(4);
        } else {
            aFwS329S0000000_4 = null;
        }
        this(enumC322640Cko, aFwS329S0000000_4, (i & 4) != 0 ? AFwS329S0000000_4.get$arr$(5) : null);
    }

    public C321610Cj9(EnumC322640Cko enumC322640Cko, InterfaceC1631620sYq<? super LinearLayoutManager, ? super Context, ? super Integer, Boolean> interfaceC1631620sYq, InterfaceC1631620sYq<? super C336550DHh, ? super RecyclerView, ? super Integer, Integer> interfaceC1631620sYq2) {
        this.LIZ = enumC322640Cko;
        this.LIZIZ = interfaceC1631620sYq;
        this.LIZJ = interfaceC1631620sYq2;
    }
}
