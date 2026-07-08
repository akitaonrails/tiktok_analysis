package X;

import com.bytedance.android.livesdk.api.LivePCSPermissionAPI;
import com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBGoLivePageResponse;

/* JADX INFO: renamed from: X.01QM, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.LiveBroadcastPreviewFragment$queryGoLive$1", f = "LiveBroadcastPreviewFragment.kt", l = {1558}, m = "invokeSuspend")
public final class C01QM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ LiveBroadcastPreviewFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QM(LiveBroadcastPreviewFragment liveBroadcastPreviewFragment, InterfaceC1364105Vn<? super C01QM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = liveBroadcastPreviewFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01QM c01qm = new C01QM(this.LLILLL, interfaceC1364105Vn);
        c01qm.LLILLJJLI = obj;
        return c01qm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        LiveBroadcastPreviewFragment liveBroadcastPreviewFragment;
        C1C7U.LIZ("LiveBroadcastPreviewFragment@146.queryGoLive$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    liveBroadcastPreviewFragment = (LiveBroadcastPreviewFragment) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                liveBroadcastPreviewFragment = this.LLILLL;
                C20441214yg.LIZIZ("GoLivePageApi", "queryGoLive call goLivePageApi");
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                C0UVW c0uvwLIZ = C01QD.LIZ();
                c0uvwLIZ.getClass();
                LivePCSPermissionAPI livePCSPermissionAPI = (LivePCSPermissionAPI) c0uvwLIZ.LIZJ(LivePCSPermissionAPI.class);
                this.LLILLJJLI = liveBroadcastPreviewFragment;
                this.LL = 1;
                obj = livePCSPermissionAPI.goLivePageApi(true, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.queryGoLive$1");
                    return objLJFF;
                }
            }
            C470590Icr c470590Icr = (C470590Icr) obj;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("queryGoLive response=");
            sbLIZ.append(c470590Icr);
            C20441214yg.LIZIZ("GoLivePageApi", C2188811AlT.LIZIZ(sbLIZ));
            C500260Jjc.LJJLIIIJJIZ(new C020Y(c470590Icr, (C470590Icr<SMBGoLivePageResponse.Data>) liveBroadcastPreviewFragment, (LiveBroadcastPreviewFragment) 30));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveBroadcastPreviewFragment@146.queryGoLive$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
