package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EH1, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EH1 extends C2217421BqW implements Function2<C361980EHc, Integer, Unit> {
    public C0EH1(C361870EGr c361870EGr) {
        super(2, c361870EGr, C361870EGr.class, "onMobItemClick", "onMobItemClick(Lcom/ss/ugc/android/editor/base/bottombar/FunctionItem;I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(C361980EHc c361980EHc, Integer num) {
        int iIntValue = num.intValue();
        ((C361870EGr) this.receiver).N5(c361980EHc, iIntValue);
        return Unit.LIZ;
    }
}
