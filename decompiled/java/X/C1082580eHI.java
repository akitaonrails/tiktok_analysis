package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eHI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1082580eHI extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1082580eHI(C1082650eHP c1082650eHP) {
        super(1, c1082650eHP, C1082650eHP.class, "onNormalInteract", "onNormalInteract$liveroomfunction_impl_release(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C1082650eHP c1082650eHP = (C1082650eHP) this.receiver;
        c1082650eHP.LLILLJJLI = zBooleanValue;
        c1082650eHP.LIZ();
        return Unit.LIZ;
    }
}
