package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.lynx.tasm.LynxView;
import com.tiktok.forestx.RequestParamsX;
import j27.s;
import kotlin.jvm.internal.AwS106S1200000_23;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0qNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547960qNu implements InterfaceC1547990qNx<C1290210jgB> {
    public final boolean LIZ;
    public final EnumC1533980q1M LIZIZ;
    public final C1537480q70 LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1547990qNx
    public final C1290210jgB LIZ(String str) {
        InterfaceC1532260pya interfaceC1532260pyaLJIILJJIL;
        C259800zU c259800zU = new C259800zU();
        C1537480q70 c1537480q70 = this.LIZJ;
        String str2 = null;
        if (c1537480q70 == null || (interfaceC1532260pyaLJIILJJIL = C1537480q70.LJIILJJIL(c1537480q70, false, null, 3)) == null) {
            C1532680pzG.LIZ.getClass();
            interfaceC1532260pyaLJIILJJIL = C1532680pzG.LJJ;
            if (!C1535630q41.LJJIII) {
                interfaceC1532260pyaLJIILJJIL = null;
            }
        }
        if (interfaceC1532260pyaLJIILJJIL != null) {
            RequestParamsX requestParamsX = new RequestParamsX(null, null, 3, null);
            C1537480q70 c1537480q702 = this.LIZJ;
            if (c1537480q702 != null) {
                str2 = c1537480q702.containerId;
            }
            requestParamsX.groupId = str2;
            requestParamsX.source = "SparkXSync";
            EnumC1533980q1M enumC1533980q1M = this.LIZIZ;
            if (enumC1533980q1M != null) {
                requestParamsX.resourceScene = enumC1533980q1M;
            }
            if (!this.LIZ) {
                requestParamsX.disableCdn = true;
            }
            interfaceC1532260pyaLJIILJJIL.LIZ(str, requestParamsX, new AwS106S1200000_23(c259800zU, (C259800zU<C1290210jgB>) str, (String) this, (C1547960qNu) 3));
            return (C1290210jgB) c259800zU.element;
        }
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(this.LIZJ, false);
        if (iResourceServiceXLIZIZ != null) {
            RequestParams requestParams = new RequestParams(null, 1, null);
            EnumC1533980q1M enumC1533980q1M2 = this.LIZIZ;
            if (enumC1533980q1M2 != null) {
                requestParams.resourceScene = enumC1533980q1M2;
            }
            if (!this.LIZ) {
                requestParams.disableCdn = true;
            }
            iResourceServiceXLIZIZ.fetchResourceAsyncIfNeed(str, requestParams, new AwS106S1200000_23(c259800zU, (C259800zU<C1290210jgB>) str, (String) this, (C1547960qNu) 4));
        }
        return (C1290210jgB) c259800zU.element;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(X.C1290210jgB r1, java.lang.String r2) {
        /*
            if (r2 == 0) goto L9
            int r0 = r2.hashCode()
            switch(r0) {
                case -1408207997: goto L2e;
                case 98349: goto L23;
                case 98230121: goto L18;
                case 230960163: goto Ld;
                default: goto L9;
            }
        L9:
            r0 = 0
        La:
            r1.LIZJ = r0
            return
        Ld:
            java.lang.String r0 = "builtin"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0jgE r0 = X.EnumC1290240jgE.BUILTIN
            goto La
        L18:
            java.lang.String r0 = "gecko"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0jgE r0 = X.EnumC1290240jgE.GECKO
            goto La
        L23:
            java.lang.String r0 = "cdn"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0jgE r0 = X.EnumC1290240jgE.CDN
            goto La
        L2e:
            java.lang.String r0 = "assets"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0jgE r0 = X.EnumC1290240jgE.BUILTIN
            goto La
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1547960qNu.LIZIZ(X.0jgB, java.lang.String):void");
    }

    public C1547960qNu(s sVar, boolean z, EnumC1533980q1M enumC1533980q1M) {
        C1537710q7N c1537710q7N;
        this.LIZ = z;
        this.LIZIZ = enumC1533980q1M;
        LynxView lynxViewLJIILJJIL = sVar.LJIILJJIL();
        C1537480q70 hybridContext = null;
        if ((lynxViewLJIILJJIL instanceof C1537710q7N) && (c1537710q7N = (C1537710q7N) lynxViewLJIILJJIL) != null) {
            hybridContext = c1537710q7N.getHybridContext();
        }
        this.LIZJ = hybridContext;
    }
}
