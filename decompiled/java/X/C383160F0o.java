package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0F0o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C383160F0o extends C2217421BqW implements Function1<Integer, Unit> {
    public C383160F0o(Object obj) {
        super(1, obj, C383070F0f.class, "onRemove", "onRemove(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((C383070F0f) this.receiver).LIZIZ(num.intValue());
        return Unit.LIZ;
    }
}
