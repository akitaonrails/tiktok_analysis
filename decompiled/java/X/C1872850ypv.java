package X;

import android.app.Application;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.sdk.xbridge.runtime.depend.IHostContextDepend;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.PiperData;
import java.util.Date;

/* JADX INFO: renamed from: X.0ypv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1872850ypv extends AbstractC1872860ypw {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Application application;
        Object objLIZ;
        Object objLIZ2;
        C1531540pxQ c1531540pxQ;
        String str;
        IHostContextDepend iHostContextDepend;
        InterfaceC1872890ypz interfaceC1872890ypz = (InterfaceC1872890ypz) xBaseParamModel;
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null && (iHostContextDepend = c1874950ytJ.LIZLLL) != null) {
            application = iHostContextDepend.getApplication();
        } else {
            application = null;
        }
        if (application == null) {
            C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
            return;
        }
        String key = interfaceC1872890ypz.getKey();
        boolean z = true;
        if (key.length() == 0) {
            C2382909Vj.LIZ(completionBlock, -3, "Key in the params is empty", null, 4);
            return;
        }
        String biz = interfaceC1872890ypz.getBiz();
        if (biz == null) {
            biz = "";
        }
        try {
            C1298620jtk c1298620jtkLIZ = C1298630jtl.LIZ(application);
            if (biz.length() == 0) {
                objLIZ = c1298620jtkLIZ.LIZIZ(key);
            } else {
                objLIZ = c1298620jtkLIZ.LIZ(biz, key);
            }
            C1298620jtk c1298620jtkLIZ2 = C1298630jtl.LIZ(application);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(key);
            sbLIZ.append("_TIME");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (biz.length() == 0) {
                objLIZ2 = c1298620jtkLIZ2.LIZIZ(strLIZIZ);
            } else {
                objLIZ2 = c1298620jtkLIZ2.LIZ(biz, strLIZIZ);
            }
            if ((objLIZ2 instanceof String) && (str = (String) objLIZ2) != null) {
                try {
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (!new Date().before(new Date(CastLongProtector.parseLong(str)))) {
                    int i = C1872870ypx.LLILLL;
                    C1298650jtn.LIZ(application, biz, key);
                    objLIZ = null;
                }
            }
            InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
            if (interfaceC634840OvC == null || (c1531540pxQ = (C1531540pxQ) interfaceC634840OvC.LIZIZ(C1531540pxQ.class)) == null || !c1531540pxQ.LIZ(getName())) {
                z = false;
            }
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1872910yq1.class, null);
            InterfaceC1872910yq1 interfaceC1872910yq1 = (InterfaceC1872910yq1) xBaseModelLIZJ;
            if (z && !(objLIZ instanceof String)) {
                objLIZ = new PiperData(objLIZ);
            }
            interfaceC1872910yq1.setData(objLIZ);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("failed to properly getStorageItem with exception ");
            sbLIZ2.append(e2);
            C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
        }
    }
}
