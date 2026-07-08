package X;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0My9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C585710My9 {
    public final RecyclerView LIZ;

    public C585710My9(RecyclerView recyclerView) {
        this.LIZ = recyclerView;
    }

    public final void LIZ(Integer num, Function1<? super InterfaceC584630MwP, Unit> function1) {
        InterfaceC648350Pbt interfaceC648350Pbt;
        InterfaceC584630MwP preload;
        if (num != null) {
            num.intValue();
            Object objFindViewHolderForAdapterPosition = this.LIZ.findViewHolderForAdapterPosition(num.intValue() + 1);
            if ((objFindViewHolderForAdapterPosition instanceof InterfaceC648350Pbt) && (interfaceC648350Pbt = (InterfaceC648350Pbt) objFindViewHolderForAdapterPosition) != null && (preload = interfaceC648350Pbt.getPreload()) != null && preload.isAvailable()) {
                function1.invoke(preload);
            }
        }
    }
}
