package X;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0o6a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1460340o6a extends C2217421BqW implements Function1<Pair<? extends Integer, ? extends Integer>, Unit> {
    public C1460340o6a(Object obj) {
        super(1, obj, C1460250o6R.class, "updateBottomLayoutPosition", "updateBottomLayoutPosition(Lkotlin/Pair;)V", 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Pair<? extends Integer, ? extends Integer> pair) {
        ((C1460250o6R) this.receiver).m6(pair);
        return Unit.LIZ;
    }
}
