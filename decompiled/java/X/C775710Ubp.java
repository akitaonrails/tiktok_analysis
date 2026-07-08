package X;

import com.bytedance.android.livesdk.api.BroadcastRoomApiKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import tikcast.api.epiphron.UploadFeatureRequest;

/* JADX INFO: renamed from: X.0Ubp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.stablemode.IMDowngradeTask$changeTraffic$1", f = "IMDowngradeTask.kt", l = {64}, m = "invokeSuspend")
public final class C775710Ubp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EnumC775860Uc4 LLILLL;
    public final /* synthetic */ C775690Ubn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C775710Ubp(EnumC775860Uc4 enumC775860Uc4, C775690Ubn c775690Ubn, InterfaceC1364105Vn<? super C775710Ubp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = enumC775860Uc4;
        this.LLILZ = c775690Ubn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C775710Ubp c775710Ubp = new C775710Ubp(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c775710Ubp.LLILLJJLI = obj;
        return c775710Ubp;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        UploadFeatureRequest uploadFeatureRequest;
        Object c098200Yq;
        Object obj2;
        C1C7U.LIZ("IMDowngradeTask@1c19.changeTraffic$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                uploadFeatureRequest = this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                    uploadFeatureRequest = uploadFeatureRequest;
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj2 = uploadFeatureRequest;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            uploadFeatureRequest = new UploadFeatureRequest();
            EnumC775860Uc4 enumC775860Uc4 = this.LLILLL;
            C775690Ubn c775690Ubn = this.LLILZ;
            uploadFeatureRequest.bizParams.put("anchor_stable_mode_v2", String.valueOf(enumC775860Uc4.getLevelValue()));
            long jLIZIZ = 0;
            if (c775690Ubn.LIZJ == 0) {
                DataChannel dataChannel = c775690Ubn.LIZLLL;
                if (dataChannel != null) {
                    jLIZIZ = C500260Jjc.LIZIZ(dataChannel);
                }
                c775690Ubn.LIZJ = jLIZIZ;
            }
            uploadFeatureRequest.baseInfo.put("owner_user_id", String.valueOf(c775690Ubn.LIZJ));
            Object obj3 = this.LLILLL;
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("changeTraffic, level: ");
                sbLIZ.append(obj3);
                sbLIZ.append(", request: ");
                sbLIZ.append(uploadFeatureRequest);
                C20441214yg.LIZIZ("IMDowngradeTask", C2188811AlT.LIZIZ(sbLIZ));
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                BroadcastRoomApiKt broadcastRoomApiKtLIZIZ = C01QD.LIZ().LIZIZ();
                this.LLILLJJLI = uploadFeatureRequest;
                this.LL = 1;
                obj = broadcastRoomApiKtLIZIZ.upload(uploadFeatureRequest, this);
                uploadFeatureRequest = uploadFeatureRequest;
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("IMDowngradeTask@1c19.changeTraffic$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                obj2 = uploadFeatureRequest;
            }
        }
        c098200Yq = (C470590Icr) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        obj2 = uploadFeatureRequest;
        Object obj4 = this.LLILLL;
        C775690Ubn c775690Ubn2 = this.LLILZ;
        if (C189200o6.m8isSuccessimpl(c098200Yq)) {
            C20441214yg.LIZIZ("IMDowngradeTask", "changeTraffic success, level: " + obj4 + ", request: " + obj2);
            if (obj4 == EnumC775860Uc4.NONE) {
                c775690Ubn2.LIZ = false;
            }
        }
        Object obj5 = this.LLILLL;
        C775690Ubn c775690Ubn3 = this.LLILZ;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("changeTraffic fail, level: ");
            sbLIZ2.append(obj5);
            sbLIZ2.append(", request: ");
            sbLIZ2.append(obj2);
            C20441214yg.LJFF("IMDowngradeTask", C2188811AlT.LIZIZ(sbLIZ2), thM5exceptionOrNullimpl);
            if (obj5 == EnumC775860Uc4.NONE) {
                c775690Ubn3.LIZ = true;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("IMDowngradeTask@1c19.changeTraffic$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
