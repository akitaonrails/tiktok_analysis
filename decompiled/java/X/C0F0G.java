package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F0G, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C0F0G extends C2217421BqW implements Function1<List<? extends C379170Etn>, Unit> {
    public C0F0G(C382590EzJ c382590EzJ) {
        super(1, c382590EzJ, C382590EzJ.class, "setMediaSelected", "setMediaSelected(Ljava/util/List;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(List<? extends C379170Etn> list) {
        ((C382590EzJ) this.receiver).S5(list);
        return Unit.LIZ;
    }
}
