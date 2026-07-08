package X;

import com.bytedance.android.livesdk.guide.model.TaskInfo;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ia8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.util.RelationRoseWatchLiveDurationTracker$RecordTimerRunnable$run$1", f = "RelationRoseWatchLiveDurationTracker.kt", l = {258}, m = "invokeSuspend")
public final class C468900Ia8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0IN1 LLILLJJLI;
    public final /* synthetic */ long LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C468900Ia8(C0IN1 c0in1, long j, InterfaceC1364105Vn<? super C468900Ia8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0in1;
        this.LLILLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C468900Ia8(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        Object objLIZIZ;
        InterfaceC2262081DgM interfaceC2262081DgMAuthor;
        C1C7U.LIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLIZIZ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C1134410fct c1134410fctLJI = TaskManagerV2.LIZ.LJI(107);
            if (c1134410fctLJI == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run$1");
                return unit;
            }
            TaskInfo taskInfoLJIIJ = c1134410fctLJI.LJIIJ(this.LLILLJJLI.LL);
            if (taskInfoLJIIJ == null) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run$1");
                return unit2;
            }
            Integer numLJIIJJI = C2095008Iq.LJIIJJI(taskInfoLJIIJ.taskId);
            if (numLJIIJJI != null) {
                int iIntValue = numLJIIJJI.intValue();
                Integer numLJ = C2286608xc.LJ(24);
                Integer numLJ2 = C2286608xc.LJ(107);
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                if (room != null && (interfaceC2262081DgMAuthor = room.author()) != null) {
                    id = interfaceC2262081DgMAuthor.getId();
                } else {
                    id = 0;
                }
                Long lLJFF = C2286608xc.LJFF(id);
                Long lLJFF2 = C2286608xc.LJFF(this.LLILLL);
                this.LL = 1;
                objLIZIZ = C1219670hqP.LIZIZ("client_trigger_process_action", iIntValue, "", null, 2, numLJ, null, numLJ2, lLJFF, lLJFF2, this);
                if (objLIZIZ == objLJFF) {
                    C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run$1");
                    return objLJFF;
                }
            } else {
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run$1");
                return unit3;
            }
        }
        C189200o6.m7isFailureimpl(objLIZIZ);
        Unit unit4 = Unit.LIZ;
        C1C7U.LIZIZ("RelationRoseWatchLiveDurationTracker$RecordTimerRunnable@2757.run$1");
        return unit4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
