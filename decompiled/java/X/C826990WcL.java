package X;

import android.content.Context;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.secapi.ISecApi;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.ttvideoengine.TTVideoEngine;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.business.kidsmode.ChangeDeviceIdForKidsModeUtils$resetForNewDeviceID$1", f = "ChangeDeviceIdForKidsModeUtils.kt", l = {}, m = "invokeSuspend")
public final class C826990WcL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826990WcL(boolean z, Runnable runnable, InterfaceC1364105Vn<? super C826990WcL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = z;
        this.LLILLJJLI = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C826990WcL(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChangeDeviceIdForKidsModeUtils@3f1c.resetForNewDeviceID$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C826970WcJ c826970WcJ = C826970WcJ.LIZ;
        boolean z = this.LL;
        c826970WcJ.getClass();
        C826970WcJ.LIZ(z);
        if (this.LL) {
            C844470XAv.LIZ.getClass();
            Context contextLIZ = C844470XAv.LIZ();
            boolean z2 = this.LL;
            final Runnable runnable = this.LLILLJJLI;
            AppLog.resetDidWhenSwitchChildMode(contextLIZ, z2, 30000L, new InterfaceC2211211BgV() { // from class: X.0WcK
                @Override // X.InterfaceC2211211BgV
                public final void LIZ() {
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // X.InterfaceC2211211BgV
                public final void LIZIZ(String str, String str2) {
                    String str3;
                    String str4;
                    C792400V6o.LIZ("device_id", str);
                    C792400V6o.LIZ("install_id", str2);
                    C803190Vf3.LIZ().LIZ = str;
                    HashMap map = new HashMap();
                    if (str == null) {
                        str3 = "";
                    } else {
                        str3 = str;
                    }
                    map.put("deviceid", str3);
                    C844470XAv.LIZ.getClass();
                    C844470XAv.LIZ();
                    TTVideoEngine.LJLJLLL(map);
                    C1551950qUL c1551950qULLJIILL = C1552050qUV.LJIILL();
                    if (c1551950qULLJIILL != null) {
                        c1551950qULLJIILL.LJI(str);
                    }
                    IExternalService iExternalService = (IExternalService) ServiceManager.get().getService(IExternalService.class);
                    if (str == null) {
                        str4 = "";
                    } else {
                        str4 = str;
                    }
                    iExternalService.updateVESDKDeviceId(str4);
                    C807620VmC c807620VmC = C807630VmD.LIZ;
                    C827000WcM c827000WcM = c807620VmC.LJII;
                    if (c827000WcM == null) {
                        c827000WcM = new C827000WcM();
                    }
                    c807620VmC.LIZ(c827000WcM);
                    C827070WcT.LIZ.getClass();
                    C827070WcT.LIZIZ();
                    ISecApi iSecApi = (ISecApi) ServiceManager.get().getService(ISecApi.class);
                    if (str == null) {
                        str = "";
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    iSecApi.updateDeviceIdAndInstallId(str, str2);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            });
        } else {
            C786410Ut5.A2().removeAllCookies(null);
            Runnable runnable2 = this.LLILLJJLI;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChangeDeviceIdForKidsModeUtils@3f1c.resetForNewDeviceID$1");
        return unit;
    }
}
