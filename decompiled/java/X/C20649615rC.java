package X;

import com.ss.android.ugc.aweme.outreach.dispersion.data.OutreachSyncConfigModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.15rC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20649615rC extends C09AY implements Function1<Boolean, Unit> {
    public C20649615rC() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Boolean bool) {
        if (bool.booleanValue()) {
            C20649015r6 c20649015r6 = C20649015r6.LIZ;
            EnumC1779290wP1 enumC1779290wP1 = EnumC1779290wP1.FULL_SYNC;
            C20649415rA.LIZ.getClass();
            int i = ((OutreachSyncConfigModel) C20649415rA.LIZLLL.getValue()).retryTimes;
            c20649015r6.getClass();
            C20649015r6.LIZIZ(enumC1779290wP1, i);
        } else {
            C20649315r9.LIZ.getClass();
            if (!C20649315r9.LIZJ.isEmpty()) {
                C20649015r6 c20649015r62 = C20649015r6.LIZ;
                EnumC1779290wP1 enumC1779290wP12 = EnumC1779290wP1.INCREMENTAL_SYNC;
                C20649415rA.LIZ.getClass();
                int i2 = ((OutreachSyncConfigModel) C20649415rA.LIZLLL.getValue()).retryTimes;
                c20649015r62.getClass();
                C20649015r6.LIZIZ(enumC1779290wP12, i2);
            }
        }
        return Unit.LIZ;
    }
}
