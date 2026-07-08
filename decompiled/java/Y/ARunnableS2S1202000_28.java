package Y;

import X.C1870520ymA;
import X.C1909107dp;
import X.C1C7U;
import X.InterfaceC1870510ym9;
import X.InterfaceC1872280yp0;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes29.dex */
public class ARunnableS2S1202000_28 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        CompletionBlock completionBlock = (CompletionBlock) this.l1;
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1872280yp0.class, null);
        int i = this.i3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.l2;
        int i2 = this.i4;
        String str = this.s0;
        InterfaceC1872280yp0 interfaceC1872280yp0 = (InterfaceC1872280yp0) xBaseModelLIZJ;
        interfaceC1872280yp0.setHttpCode(Integer.valueOf(i));
        interfaceC1872280yp0.setHeader(linkedHashMap);
        interfaceC1872280yp0.setClientCode(Integer.valueOf(i2));
        interfaceC1872280yp0.setResponse(str);
        interfaceC1872280yp0.setResponseType("base64");
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
    }

    public static final void run$0(ARunnableS2S1202000_28 aRunnableS2S1202000_28) {
        boolean zLIZ;
        C1C7U.LIZ("XRequestForThirdMethodIDL@e66c.handle$1$streamResponseCallback$1$handleConnection$4");
        try {
            aRunnableS2S1202000_28.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XRequestForThirdMethodIDL@e66c.handle$1$streamResponseCallback$1$handleConnection$4");
    }

    public static final void run$1(ARunnableS2S1202000_28 aRunnableS2S1202000_28) {
        boolean zLIZ;
        C1C7U.LIZ("XDownloadFileMethod@53bf.handleDownloadFile$2$responseCallback$1$handleConnection$6");
        try {
            InterfaceC1870510ym9 interfaceC1870510ym9 = (InterfaceC1870510ym9) aRunnableS2S1202000_28.l1;
            C1870520ymA c1870520ymA = new C1870520ymA();
            int i = aRunnableS2S1202000_28.i3;
            int i2 = aRunnableS2S1202000_28.i4;
            LinkedHashMap linkedHashMap = (LinkedHashMap) aRunnableS2S1202000_28.l2;
            String str = aRunnableS2S1202000_28.s0;
            c1870520ymA.LIZ = Integer.valueOf(i);
            c1870520ymA.LIZIZ = Integer.valueOf(i2);
            c1870520ymA.LIZJ = linkedHashMap;
            c1870520ymA.LIZLLL = str;
            interfaceC1870510ym9.LIZ(c1870520ymA, "");
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("XDownloadFileMethod@53bf.handleDownloadFile$2$responseCallback$1$handleConnection$6");
    }

    public ARunnableS2S1202000_28(int i, int i2, Object obj, String str, Object obj2, int i3) {
        this.$t = i3;
        this.l1 = obj;
        this.i3 = i;
        this.l2 = obj2;
        this.i4 = i2;
        this.s0 = str;
    }
}
