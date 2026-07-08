package X;

import android.os.SystemClock;
import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS115S1200000_32;

/* JADX INFO: renamed from: X.18c8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21320618c8 extends C09AY implements InterfaceC1685430txd<String, String, String, Boolean, String, Long, Unit> {
    public final /* synthetic */ JsWorkerWrapper LL;
    public final /* synthetic */ C20221814Am LLILLJJLI;
    public final /* synthetic */ Function1<JsWorkerWrapper, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21320618c8(JsWorkerWrapper jsWorkerWrapper, C20221814Am c20221814Am, AwS115S1200000_32 awS115S1200000_32) {
        super(6);
        this.LL = jsWorkerWrapper;
        this.LLILLJJLI = c20221814Am;
        this.LLILLL = awS115S1200000_32;
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(String str, String str2, String str3, Boolean bool, String str4, Long l) {
        JsWorker jsWorker;
        String str5;
        IECommerceHostService iECommerceHostService;
        boolean z;
        String str6 = str;
        boolean zBooleanValue = bool.booleanValue();
        String str7 = str4;
        long jLongValue = l.longValue();
        String name = null;
        if (str6 != null) {
            C1701450uNT c1701450uNT = C1701450uNT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jsWorker: name: ");
            JsWorkerWrapper jsWorkerWrapper = this.LL;
            if (jsWorkerWrapper != null) {
                str5 = jsWorkerWrapper.LIZIZ;
            } else {
                str5 = null;
            }
            sbLIZ.append(str5);
            sbLIZ.append(" init.js has loaded");
            C2188811AlT.LIZIZ(sbLIZ);
            C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
            JsWorkerWrapper jsWorkerWrapper2 = this.LL;
            if (jsWorkerWrapper2 != null) {
                jsWorkerWrapper2.LIZIZ(str6, "_init");
            }
            JsWorkerWrapper jsWorkerWrapper3 = this.LL;
            if (jsWorkerWrapper3 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("app.version = ");
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                    if (iECommerceHostService != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name2 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService != null) {
                        name = iECommerceHostService.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                sbLIZ2.append(((IApplicationDependencyService) iECommerceHostService).getVersionInfo().LIZIZ);
                jsWorkerWrapper3.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            JsWorkerWrapper jsWorkerWrapper4 = this.LL;
            if (jsWorkerWrapper4 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("app.initJsOffline = ");
                sbLIZ3.append(zBooleanValue);
                jsWorkerWrapper4.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
            JsWorkerWrapper jsWorkerWrapper5 = this.LL;
            if (jsWorkerWrapper5 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("app.initJsSourceFrom = \"");
                sbLIZ4.append(str7);
                sbLIZ4.append('\"');
                jsWorkerWrapper5.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            }
            JsWorkerWrapper jsWorkerWrapper6 = this.LL;
            if (jsWorkerWrapper6 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("app.initJsVersion = ");
                sbLIZ5.append(jLongValue);
                jsWorkerWrapper6.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            }
            JsWorkerWrapper jsWorkerWrapper7 = this.LL;
            if (jsWorkerWrapper7 != null) {
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("app.log(\"VmSdkService: jsWorker: name: ");
                sbLIZ6.append(this.LL.LIZIZ);
                sbLIZ6.append(" init.js execute finish\");");
                jsWorkerWrapper7.LIZ(C2188811AlT.LIZIZ(sbLIZ6));
            }
            InterfaceC21321018cC interfaceC21321018cC = this.LLILLJJLI.LIZLLL;
            if (interfaceC21321018cC != null) {
                interfaceC21321018cC.onSuccess();
            }
            Function1<JsWorkerWrapper, Unit> function1 = this.LLILLL;
            if (function1 != null) {
                function1.invoke(this.LL);
            }
            C1749760vdO.LIZIZ("load_init_script", "load_init_js", "", C1749760vdO.LIZ("load_init_script"), "", true);
        } else {
            C1749760vdO.LIZIZ("load_init_script", "load_init_js", "", C1749760vdO.LIZ("load_init_script"), "", false);
            C1701450uNT c1701450uNT2 = C1701450uNT.LIZ;
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append("jsWorker: initPath: ");
            JsWorkerWrapper jsWorkerWrapper8 = this.LL;
            if (jsWorkerWrapper8 != null) {
                name = jsWorkerWrapper8.LIZIZ;
            }
            sbLIZ7.append(name);
            sbLIZ7.append(" load init script error, initScript is null");
            C2188811AlT.LIZIZ(sbLIZ7);
            C1701450uNT.LIZ(c1701450uNT2, "VmSdkService", 4);
            JsWorkerWrapper jsWorkerWrapper9 = this.LL;
            if (jsWorkerWrapper9 != null && (jsWorker = jsWorkerWrapper9.LIZ) != null) {
                jsWorker.terminate();
            }
        }
        return Unit.LIZ;
    }
}
