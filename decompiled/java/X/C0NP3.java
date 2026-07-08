package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.common.experiment.ImSpecialEffectsFrequencyControlSettings;
import com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NP3, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.messagelist.database.AwemeManageServiceImpl$performDatabaseSync$2", f = "AwemeManageServiceImpl.kt", l = {112}, m = "invokeSuspend")
public final class C0NP3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public long LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ AwemeManageServiceImpl LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0NP3(AwemeManageServiceImpl awemeManageServiceImpl, InterfaceC1364105Vn<? super C0NP3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = awemeManageServiceImpl;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0NP3(this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        long jCurrentTimeMillis;
        List<C0NPC> listLIZJ;
        C1C7U.LIZ("AwemeManageServiceImpl@876f.performDatabaseSync$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            if (i != 0) {
                if (i == 1) {
                    jCurrentTimeMillis = this.LL;
                    listLIZJ = (List) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                jCurrentTimeMillis = System.currentTimeMillis();
                ImSpecialEffectsFrequencyControlSettings.ImSpecialEffectsFrequencyControlModel imSpecialEffectsFrequencyControlModelLIZ = ImSpecialEffectsFrequencyControlSettings.LIZ();
                long jMax = Math.max(imSpecialEffectsFrequencyControlModelLIZ.shareAgainRetroactiveValidityPeriod + imSpecialEffectsFrequencyControlModelLIZ.shareAgainValidityWindow, imSpecialEffectsFrequencyControlModelLIZ.shareHighFreqValidityWindow);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("performDatabaseSync: querying with timeWindow=");
                sbLIZ.append(jMax);
                sbLIZ.append(" ms");
                C2188811AlT.LIZIZ(sbLIZ);
                AwemeManageServiceImpl awemeManageServiceImpl = this.LLILZ;
                long jLIZ = C0NP2.LIZ(jMax);
                awemeManageServiceImpl.getClass();
                List listLJIIZILJ = C0YNY.LIZ(InterfaceC874680YTa.LIZ).LJIIZILJ(Long.MAX_VALUE, null, true, new int[]{1809, 1803}, false, false, jLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("performDatabaseSync: queryMessagesFromIMSdk returned ");
                sbLIZ2.append(listLJIIZILJ.size());
                sbLIZ2.append(" messages");
                C2188811AlT.LIZIZ(sbLIZ2);
                this.LLILZ.getClass();
                listLIZJ = AwemeManageServiceImpl.LIZJ(listLJIIZILJ);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("performDatabaseSync: parseAndFilterEntities returned ");
                ArrayList arrayList = (ArrayList) listLIZJ;
                sbLIZ3.append(arrayList.size());
                sbLIZ3.append(" valid entities");
                C2188811AlT.LIZIZ(sbLIZ3);
                if (arrayList.isEmpty()) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("AwemeManageServiceImpl@876f.performDatabaseSync$2");
                    return unit;
                }
                AwemeManageServiceImpl awemeManageServiceImpl2 = this.LLILZ;
                this.LLILLJJLI = listLIZJ;
                this.LL = jCurrentTimeMillis;
                this.LLILLL = 1;
                if (awemeManageServiceImpl2.LIZ(listLIZJ, this) == objLJFF) {
                    C1C7U.LIZIZ("AwemeManageServiceImpl@876f.performDatabaseSync$2");
                    return objLJFF;
                }
            }
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("Database sync completed in ");
            sbLIZ4.append(System.currentTimeMillis() - jCurrentTimeMillis);
            sbLIZ4.append("ms, synced ");
            sbLIZ4.append(listLIZJ.size());
            sbLIZ4.append(" entities");
            C2188811AlT.LIZIZ(sbLIZ4);
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("AwemeManageServiceImpl@876f.performDatabaseSync$2");
            return unit2;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            System.currentTimeMillis();
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
