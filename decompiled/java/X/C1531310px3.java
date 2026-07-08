package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.Map;

/* JADX INFO: renamed from: X.0px3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531310px3 implements InterfaceC1531280px0 {
    public final String LIZ;
    public final C1531220pwu LIZIZ;
    public CompletionBlock<InterfaceC1531350px7> LIZJ;
    public Map<String, ? extends Object> LIZLLL;

    public C1531310px3(String str, C1531220pwu c1531220pwu) {
        this.LIZ = str;
        this.LIZIZ = c1531220pwu;
    }

    public final synchronized void LIZIZ(Throwable th, String str, Integer num) {
        Integer first;
        String message;
        CompletionBlock<InterfaceC1531350px7> completionBlock = this.LIZJ;
        if (completionBlock != null) {
            C1531220pwu c1531220pwu = this.LIZIZ;
            C1537480q70 c1537480q70 = c1531220pwu.LIZIZ;
            String str2 = this.LIZ;
            C443120HZe<Integer, String, ? extends Throwable> c443120HZe = c1531220pwu.LJIIIZ;
            if (c443120HZe != null) {
                first = c443120HZe.getFirst();
            } else {
                first = null;
            }
            C1522300piW.LIZJ(c1537480q70, null, 0, str2, first);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("errorCode: ");
            sbLIZ.append(num);
            sbLIZ.append(", errorMsg: ");
            if (th == null) {
                message = null;
            } else {
                message = th.getMessage();
            }
            sbLIZ.append(message);
            sbLIZ.append(", ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1531350px7.class, null);
            InterfaceC1531350px7 interfaceC1531350px7 = (InterfaceC1531350px7) xBaseModelLIZJ;
            interfaceC1531350px7.setState(0);
            interfaceC1531350px7.setResult(null);
            interfaceC1531350px7.setMode("segmenting");
            completionBlock.onFailure(0, strLIZIZ, (XBaseResultModel) xBaseModelLIZJ);
            this.LIZJ = null;
        }
    }

    @Override // X.InterfaceC1531280px0
    public final synchronized void LIZ(Integer num, String str, Throwable th, Map map) {
        InterfaceC1531300px2 interfaceC1531300px2;
        CompletionBlock<InterfaceC1531350px7> completionBlock = this.LIZJ;
        if (completionBlock != null) {
            if (num != null) {
                LIZIZ(th, str, num);
            } else {
                C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
                if (C1161970gLL.LIZIZ().LIZ && (interfaceC1531300px2 = (InterfaceC1531300px2) this.LIZIZ.LIZIZ.LJFF(InterfaceC1531300px2.class)) != null) {
                    C1531270pwz.LIZ(interfaceC1531300px2, null, null, null, this.LIZ, map, 7);
                }
                C1522300piW.LIZJ(this.LIZIZ.LIZIZ, null, 1, this.LIZ, null);
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1531350px7.class, null);
                InterfaceC1531350px7 interfaceC1531350px7 = (InterfaceC1531350px7) xBaseModelLIZJ;
                interfaceC1531350px7.setState(1);
                interfaceC1531350px7.setResult(map);
                interfaceC1531350px7.setMode("segmenting");
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
            }
            this.LIZJ = null;
            return;
        }
        this.LIZLLL = map;
    }
}
