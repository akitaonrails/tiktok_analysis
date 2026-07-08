package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0EH3, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0EH3 extends C2217421BqW implements Function1<List<? extends C361980EHc>, Unit> {
    public C0EH3(C361870EGr c361870EGr) {
        super(1, c361870EGr, C361870EGr.class, "onMobListShow", "onMobListShow(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C361980EHc> list) {
        ((C361870EGr) this.receiver).S5(list);
        return Unit.LIZ;
    }
}
