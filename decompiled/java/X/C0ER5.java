package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ER5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0ER5 extends C2217421BqW implements InterfaceC1631630sYr<List<? extends Integer>, List<? extends C0EVA>, Boolean, Boolean, Unit> {
    public C0ER5(C364480EQs c364480EQs) {
        super(4, c364480EQs, C364480EQs.class, "onFilterWordSelectChanged", "onFilterWordSelectChanged(Ljava/util/List;Ljava/util/List;ZZ)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1631630sYr
    public final Unit invoke(List<? extends Integer> list, List<? extends C0EVA> list2, Boolean bool, Boolean bool2) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        ((C364480EQs) this.receiver).M5(list, list2, zBooleanValue, zBooleanValue2);
        return Unit.LIZ;
    }
}
