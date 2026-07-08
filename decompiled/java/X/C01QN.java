package X;

import com.bytedance.android.livesdk.api.LivePCSPermissionAPI;
import com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import webcast.api.smb.SMBGoLivePageResponse;

/* JADX INFO: renamed from: X.01QN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.widget.serviceplus.PreviewServicePlusWidget$fetchSmbQualification$3", f = "PreviewServicePlusWidget.kt", l = {768}, m = "invokeSuspend")
public final class C01QN extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ PreviewServicePlusWidget LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01QN(PreviewServicePlusWidget previewServicePlusWidget, InterfaceC1364105Vn<? super C01QN> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = previewServicePlusWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01QN c01qn = new C01QN(this.LLILLL, interfaceC1364105Vn);
        c01qn.LLILLJJLI = obj;
        return c01qn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        PreviewServicePlusWidget previewServicePlusWidget;
        C1C7U.LIZ("PreviewServicePlusWidget@d196.fetchSmbQualification$3");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    previewServicePlusWidget = (PreviewServicePlusWidget) this.LLILLJJLI;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                previewServicePlusWidget = this.LLILLL;
                C01GW<C0UVW> c01gw = C0UVW.LIZIZ;
                C0UVW c0uvwLIZ = C01QD.LIZ();
                c0uvwLIZ.getClass();
                LivePCSPermissionAPI livePCSPermissionAPI = (LivePCSPermissionAPI) c0uvwLIZ.LIZJ(LivePCSPermissionAPI.class);
                this.LLILLJJLI = previewServicePlusWidget;
                this.LL = 1;
                obj = livePCSPermissionAPI.goLivePageApi(true, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("PreviewServicePlusWidget@d196.fetchSmbQualification$3");
                    return objLJFF;
                }
            }
            C500260Jjc.LJJLIIIJJIZ(new C020Y((C470590Icr) obj, (C470590Icr<SMBGoLivePageResponse.Data>) previewServicePlusWidget, (PreviewServicePlusWidget) 20));
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PreviewServicePlusWidget@d196.fetchSmbQualification$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
