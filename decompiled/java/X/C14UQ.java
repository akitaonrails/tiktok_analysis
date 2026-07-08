package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.14UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14UQ implements InterfaceC20273014Ue {
    public final /* synthetic */ CompletionBlock<C14UZ> LIZ;

    public C14UQ(CompletionBlock<C14UZ> completionBlock) {
        this.LIZ = completionBlock;
    }

    @Override // X.InterfaceC20273014Ue
    public final void LIZIZ(C14UE c14ue) {
        ArrayList arrayList = new ArrayList();
        List<C14UM> list = c14ue.LIZ;
        if (list != null) {
            for (C14UM c14um : list) {
                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C14UR.class, null);
                C14UR c14ur = (C14UR) xBaseModelLIZJ;
                c14ur.setTempFilePath(c14um.LIZ);
                c14ur.setSize(Long.valueOf(c14um.LIZIZ));
                c14ur.setMediaType(c14um.LIZJ);
                c14ur.setBase64Data(c14um.LIZLLL);
                c14ur.setMimeType(c14um.LJ);
                arrayList.add(xBaseModelLIZJ);
            }
        }
        CompletionBlock<C14UZ> completionBlock = this.LIZ;
        XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C14UZ.class, null);
        ((C14UZ) xBaseModelLIZJ2).setTempFiles(arrayList);
        completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
    }

    @Override // X.InterfaceC20273014Ue
    public final void onFailure(int i, String str) {
        C2382909Vj.LIZ(this.LIZ, i, str, null, 4);
    }
}
