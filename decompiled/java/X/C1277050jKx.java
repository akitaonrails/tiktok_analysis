package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0jKx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277050jKx implements InterfaceC1277190jLB {
    public final String LIZ;
    public final EnumC1277330jLP LIZIZ;
    public final Function2<String, EnumC1277330jLP, Unit> LIZJ;

    @Override // X.InterfaceC1277190jLB
    public final void execute() {
        try {
            this.LIZJ.invoke(this.LIZ, this.LIZIZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("subscribeAuxStream fail, streamId=");
            sbLIZ.append(this.LIZ);
            C20441214yg.LJFF("SubscribeAuxStreamPendingTask", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    @Override // X.InterfaceC1277190jLB
    public final C00FE triggerTiming() {
        return C00FE.ON_START_SUCCESS;
    }

    public C1277050jKx(String str, EnumC1277330jLP enumC1277330jLP, C1276980jKq c1276980jKq) {
        this.LIZ = str;
        this.LIZIZ = enumC1277330jLP;
        this.LIZJ = c1276980jKq;
    }
}
