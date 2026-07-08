package X;

import Y.ARunnableS31S0400000_23;
import android.content.Context;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.runtime.depend.IHostPermissionDepend;
import com.bytedance.sdk.xbridge.runtime.depend.IHostThreadPoolExecutorDepend;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0pDR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1503030pDR extends AbstractC1503190pDh {
    public static final IHostPermissionDepend LIZLLL() {
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ != null) {
            return c1874950ytJ.LIZ;
        }
        return null;
    }

    public final void LJ(Context context, InterfaceC1503100pDY interfaceC1503100pDY, CompletionBlock<InterfaceC1503250pDn> completionBlock) throws Throwable {
        LinkedHashMap linkedHashMapLJII;
        ExecutorService normalThreadExecutor;
        IHostThreadPoolExecutorDepend iHostThreadPoolExecutorDepend;
        List<InterfaceC1503120pDa> formDataBody = interfaceC1503100pDY.getFormDataBody();
        if (formDataBody != null) {
            ArrayList<Pair> arrayList = new ArrayList(C15438062q.LJIJJ(formDataBody, 10));
            for (InterfaceC1503120pDa interfaceC1503120pDa : formDataBody) {
                C0VSJ c0vsjLIZJ = LIZJ(context, interfaceC1503120pDa.getValue(), completionBlock, interfaceC1503120pDa.getKey());
                if (c0vsjLIZJ != null) {
                    arrayList.add(new Pair(interfaceC1503120pDa.getKey(), c0vsjLIZJ));
                } else {
                    return;
                }
            }
            linkedHashMapLJII = new LinkedHashMap();
            for (Pair pair : arrayList) {
                linkedHashMapLJII.put(pair.getFirst(), pair.getSecond());
            }
        } else {
            String filePath = interfaceC1503100pDY.getFilePath();
            if (filePath != null && filePath.length() != 0) {
                C0VSJ c0vsjLIZJ2 = LIZJ(context, interfaceC1503100pDY.getFilePath(), completionBlock, "filePath");
                if (c0vsjLIZJ2 == null || (linkedHashMapLJII = C2097608Jq.LJII(new Pair("file", c0vsjLIZJ2))) == null) {
                    return;
                }
            } else {
                C2382909Vj.LIZ(completionBlock, -3, "filePath or formDataBody can not be null.", null, 4);
                return;
            }
        }
        C1874950ytJ c1874950ytJ = C1874950ytJ.LJIIL;
        if (c1874950ytJ == null || (iHostThreadPoolExecutorDepend = c1874950ytJ.LJII) == null || (normalThreadExecutor = iHostThreadPoolExecutorDepend.getNormalThreadExecutor()) == null) {
            normalThreadExecutor = C2126108Up.LIZ;
        }
        normalThreadExecutor.execute(new ARunnableS31S0400000_23(interfaceC1503100pDY, linkedHashMapLJII, this, completionBlock, 2));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bd  */
    @Override // X.AbstractC1549150qPp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel r17, final com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock r18, X.EnumC1063300dmC r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1503030pDR.handle(com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel, com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, X.0dmC):void");
    }

    public static final C0VSJ LIZJ(Context context, String str, CompletionBlock completionBlock, String str2) throws Throwable {
        boolean z;
        boolean z2 = false;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("The file path should not be empty.The key is ");
            sbLIZ.append(str2);
            C2382909Vj.LIZ(completionBlock, -3, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            return null;
        }
        C09N4.LIZ.getClass();
        String strLIZ = C09N4.LIZ(context, str);
        if (strLIZ == null || strLIZ.length() == 0) {
            z2 = true;
        }
        if (z2) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("File is not exist.The key is ");
            sbLIZ2.append(str2);
            C2382909Vj.LIZ(completionBlock, -9, C2188811AlT.LIZIZ(sbLIZ2), null, 4);
            return null;
        }
        C0VSJ c0vsj = new C0VSJ(strLIZ);
        if (!c0vsj.exists()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("File is not exist.The key is ");
            sbLIZ3.append(str2);
            C2382909Vj.LIZ(completionBlock, -9, C2188811AlT.LIZIZ(sbLIZ3), null, 4);
            return null;
        }
        if (!c0vsj.isFile()) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("File is not file.The key is ");
            sbLIZ4.append(str2);
            C2382909Vj.LIZ(completionBlock, -9, C2188811AlT.LIZIZ(sbLIZ4), null, 4);
            return null;
        }
        return c0vsj;
    }
}
