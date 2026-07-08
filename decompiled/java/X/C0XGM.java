package X;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0XGM, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XGM extends C09AY implements Function0<Unit> {
    public final /* synthetic */ int LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0XGM(int i) {
        super(0);
        this.LL = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        CopyOnWriteArrayList<Integer> copyOnWriteArrayList = C2261941Dg8.LJIIJJI;
        copyOnWriteArrayList.add(Integer.valueOf(this.LL));
        C2261941Dg8.LIZ.getClass();
        C2261941Dg8.LIZIZ().storeString("extra_info", copyOnWriteArrayList.toString());
        return Unit.LIZ;
    }
}
