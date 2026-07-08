package X;

import com.bytedance.android.livesdk.api.BroadcastRoomApiKt;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.room.DeviceSignalInfo;
import webcast.api.room.UploadDeviceSignalReq;

/* JADX INFO: renamed from: X.0UVX, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.tns.TnsSignalReport$report$5", f = "TnsSignalReport.kt", l = {146}, m = "invokeSuspend")
public final class C0UVX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C773300UVc LLILLL;
    public final /* synthetic */ DeviceSignalInfo LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UVX(C773300UVc c773300UVc, DeviceSignalInfo deviceSignalInfo, InterfaceC1364105Vn<? super C0UVX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c773300UVc;
        this.LLILZ = deviceSignalInfo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0UVX c0uvx = new C0UVX(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c0uvx.LLILLJJLI = obj;
        return c0uvx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("TnsSignalReport@29a8.report$5");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C773300UVc c773300UVc = this.LLILLL;
                DeviceSignalInfo deviceSignalInfo = this.LLILZ;
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                BroadcastRoomApiKt broadcastRoomApiKtLIZIZ = C01QD.LIZ().LIZIZ();
                UploadDeviceSignalReq uploadDeviceSignalReq = new UploadDeviceSignalReq();
                uploadDeviceSignalReq.roomId = c773300UVc.LJI;
                uploadDeviceSignalReq.deviceSignalInfo = deviceSignalInfo;
                this.LL = 1;
                obj = broadcastRoomApiKtLIZIZ.uploadDeviceSignal(uploadDeviceSignalReq, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("TnsSignalReport@29a8.report$5");
                    return objLJFF;
                }
            }
            c098200Yq = (C470590Icr) obj;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C20441214yg.LIZIZ("DeviceSignalInfo", thM5exceptionOrNullimpl.getMessage());
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TnsSignalReport@29a8.report$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
