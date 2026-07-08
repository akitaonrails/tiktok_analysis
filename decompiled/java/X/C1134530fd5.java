package X;

import com.bytedance.android.livesdk.guide.model.TaskInfoResponse;
import com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS205S0000000_17;

/* JADX INFO: renamed from: X.0fd5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.bytedance.android.livesdk.impl.revenue.strategy.base.TaskManagerV2$preloadTmrTasks$1", f = "TaskManagerV2.kt", l = {557}, m = "invokeSuspend")
public final class C1134530fd5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1134530fd5(InterfaceC1364105Vn<? super C1134530fd5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1134530fd5(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long id;
        Object objLJ;
        C1C7U.LIZ("TaskManagerV2@3e9c.preloadTmrTasks$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
                objLJ = ((C189200o6) obj).m10unboximpl();
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            String scene = EnumC1134590fdB.NEXT_DAY_TASK_INFO.getScene();
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C1134550fd7 c1134550fd7 = C1134550fd7.LIZ;
            long jLJ = C1134550fd7.LJ();
            this.LL = 1;
            objLJ = C1219670hqP.LJ(7, 1, 0, 3, id, jLJ, null, scene, null, null, null, this, false, false);
            if (objLJ == objLJFF) {
                C1C7U.LIZIZ("TaskManagerV2@3e9c.preloadTmrTasks$1");
                return objLJFF;
            }
        }
        if (C189200o6.m8isSuccessimpl(objLJ)) {
            TaskInfoResponse.Data data = (TaskInfoResponse.Data) objLJ;
            C470360IcU.LIZ(AFwS205S0000000_17.get$arr$(56));
            TaskManagerV2.LIZJ = data;
            GsonProtectorUtils.toJson(C19748512Ol.LIZJ, data);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TaskManagerV2@3e9c.preloadTmrTasks$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1134530fd5(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
