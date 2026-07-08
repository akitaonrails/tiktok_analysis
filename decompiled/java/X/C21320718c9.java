package X;

import com.bytedance.vmsdk.worker.JsWorker;
import com.ss.android.ugc.aweme.ecommerce.vmsdk.JsWorkerWrapper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS320S0000000_32;

/* JADX INFO: renamed from: X.18c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21320718c9 extends C09AY implements InterfaceC1685430txd<String, String, String, Boolean, String, Long, Unit> {
    public final /* synthetic */ JsWorkerWrapper LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C20221814Am LLILLL;
    public final /* synthetic */ Function2<JsWorkerWrapper, String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21320718c9(JsWorkerWrapper jsWorkerWrapper, C20221814Am c20221814Am, String str, AFwS320S0000000_32 aFwS320S0000000_32) {
        super(6);
        this.LL = jsWorkerWrapper;
        this.LLILLJJLI = str;
        this.LLILLL = c20221814Am;
        this.LLILZ = aFwS320S0000000_32;
    }

    @Override // X.InterfaceC1685430txd
    public final Unit invoke(String str, String str2, String str3, Boolean bool, String str4, Long l) {
        JsWorker jsWorker;
        String str5 = str;
        boolean zBooleanValue = bool.booleanValue();
        String str6 = str4;
        long jLongValue = l.longValue();
        String str7 = null;
        if (str5 != null) {
            C1701450uNT c1701450uNT = C1701450uNT.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("jsWorker: name: ");
            JsWorkerWrapper jsWorkerWrapper = this.LL;
            if (jsWorkerWrapper != null) {
                str7 = jsWorkerWrapper.LIZIZ;
            }
            sbLIZ.append(str7);
            sbLIZ.append(" business.js has loaded");
            sbLIZ.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ);
            C1701450uNT.LIZ(c1701450uNT, "VmSdkService", 4);
            JsWorkerWrapper jsWorkerWrapper2 = this.LL;
            if (jsWorkerWrapper2 != null) {
                jsWorkerWrapper2.LIZIZ(str5, jsWorkerWrapper2.LIZIZ);
            }
            JsWorkerWrapper jsWorkerWrapper3 = this.LL;
            if (jsWorkerWrapper3 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("app.jsOffline = ");
                sbLIZ2.append(zBooleanValue);
                jsWorkerWrapper3.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
            }
            JsWorkerWrapper jsWorkerWrapper4 = this.LL;
            if (jsWorkerWrapper4 != null) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("app.jsSourceFrom = \"");
                sbLIZ3.append(str6);
                sbLIZ3.append('\"');
                jsWorkerWrapper4.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
            }
            JsWorkerWrapper jsWorkerWrapper5 = this.LL;
            if (jsWorkerWrapper5 != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("app.jsVersion = ");
                sbLIZ4.append(jLongValue);
                jsWorkerWrapper5.LIZ(C2188811AlT.LIZIZ(sbLIZ4));
            }
            JsWorkerWrapper jsWorkerWrapper6 = this.LL;
            if (jsWorkerWrapper6 != null) {
                jsWorkerWrapper6.LIZ("__MonitorJsLoadTime__ = new Date().getTime();");
            }
            JsWorkerWrapper jsWorkerWrapper7 = this.LL;
            if (jsWorkerWrapper7 != null) {
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("app.log(\"VmSdkService: jsWorker: name: ");
                sbLIZ5.append(this.LL.LIZIZ);
                sbLIZ5.append(" business.js execute finish\");");
                jsWorkerWrapper7.LIZ(C2188811AlT.LIZIZ(sbLIZ5));
            }
            InterfaceC21321018cC interfaceC21321018cC = this.LLILLL.LJ;
            if (interfaceC21321018cC != null) {
                interfaceC21321018cC.onSuccess();
            }
            Function2<JsWorkerWrapper, String, Unit> function2 = this.LLILZ;
            if (function2 != null) {
                function2.invoke(this.LL, str2);
            }
            C1749760vdO.LIZIZ("load_service_script", "load_common_check_js", "", C1749760vdO.LIZ("load_service_script"), "", true);
        } else {
            C1749760vdO.LIZIZ("load_service_script", "load_common_check_js", "", C1749760vdO.LIZ("load_service_script"), "", false);
            C1701450uNT c1701450uNT2 = C1701450uNT.LIZ;
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append("jsWorker: initPath: ");
            JsWorkerWrapper jsWorkerWrapper8 = this.LL;
            if (jsWorkerWrapper8 != null) {
                str7 = jsWorkerWrapper8.LIZIZ;
            }
            sbLIZ6.append(str7);
            sbLIZ6.append(" load service script error, serviceScript is null");
            sbLIZ6.append(this.LLILLJJLI);
            C2188811AlT.LIZIZ(sbLIZ6);
            C1701450uNT.LIZ(c1701450uNT2, "VmSdkService", 4);
            JsWorkerWrapper jsWorkerWrapper9 = this.LL;
            if (jsWorkerWrapper9 != null && (jsWorker = jsWorkerWrapper9.LIZ) != null) {
                jsWorker.terminate();
            }
        }
        return Unit.LIZ;
    }
}
