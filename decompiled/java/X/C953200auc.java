package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS67S0210000_15;

/* JADX INFO: renamed from: X.0auc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class C953200auc extends C2217421BqW implements InterfaceC1631620sYq<List<? extends C953540avA>, Boolean, Boolean, Unit> {
    public C953200auc(Object obj) {
        super(3, obj, C953190aub.class, "handleData", "handleData(Ljava/util/List;ZZ)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(List<? extends C953540avA> list, Boolean bool, Boolean bool2) {
        List<? extends C953540avA> list2 = list;
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        C953190aub c953190aub = (C953190aub) this.receiver;
        c953190aub.getClass();
        boolean z = false;
        if (list2 != null && !list2.isEmpty()) {
            c953190aub.LLILZLL = list2;
            C953470av3 c953470av3 = C953470av3.LIZ;
            RecyclerView recyclerView = c953190aub.LLILLL;
            if (zBooleanValue || zBooleanValue2) {
                z = true;
            }
            AwS67S0210000_15 awS67S0210000_15 = new AwS67S0210000_15(zBooleanValue, (boolean) c953190aub, (C953190aub) list2, (List<C953540avA>) 4);
            c953470av3.getClass();
            C953470av3.LJFF(recyclerView, list2, awS67S0210000_15, z);
        }
        return Unit.LIZ;
    }
}
