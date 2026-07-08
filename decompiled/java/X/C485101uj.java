package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01uj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C485101uj extends C2217421BqW implements Function1<Boolean, Unit> {
    public C485101uj(Object obj) {
        super(1, obj, InterfaceC395901gL.class, "onDragStatusChange", "onDragStatusChange(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        ((InterfaceC395901gL) this.receiver).LIZ(bool.booleanValue());
        return Unit.LIZ;
    }
}
