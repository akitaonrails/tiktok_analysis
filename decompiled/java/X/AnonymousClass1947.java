package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.1947, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final /* synthetic */ class AnonymousClass1947 extends C2217421BqW implements Function1<Integer, Unit> {
    public AnonymousClass1947(Object obj) {
        super(1, obj, AnonymousClass1941.class, "setPermissionActual", "setPermissionActual(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        ((AnonymousClass1941) this.receiver).M5(num.intValue());
        return Unit.LIZ;
    }
}
