package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Ks4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C530980Ks4 extends C2217421BqW implements Function2<List<? extends C539860LFg>, Boolean, Unit> {
    public C530980Ks4(C531030Ks9 c531030Ks9) {
        super(2, c531030Ks9, C531030Ks9.class, "onPlay", "onPlay(Ljava/util/List;Z)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(List<? extends C539860LFg> list, Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        ((C531030Ks9) this.receiver).E5(list, zBooleanValue);
        return Unit.LIZ;
    }
}
