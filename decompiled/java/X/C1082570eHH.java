package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0eHH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1082570eHH extends C2217421BqW implements Function1<Boolean, Unit> {
    public C1082570eHH(C1082620eHM c1082620eHM) {
        super(1, c1082620eHM, C1082620eHM.class, "onSlotBulletCurtainLayoutChange", "onSlotBulletCurtainLayoutChange$liveroomfunction_impl_release(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        boolean zBooleanValue = bool.booleanValue();
        C1082620eHM c1082620eHM = (C1082620eHM) this.receiver;
        c1082620eHM.LLJILJIL = zBooleanValue;
        if (!zBooleanValue) {
            c1082620eHM.LLJZIJLIL = 0;
        }
        return Unit.LIZ;
    }
}
