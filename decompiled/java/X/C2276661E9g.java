package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1E9g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276661E9g implements InterfaceC914930Zut<C2276691E9j> {
    public final /* synthetic */ C2276601E9a LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC2276651E9f> LIZIZ;
    public final /* synthetic */ C1E9Z LIZJ;

    @Override // X.InterfaceC914930Zut
    public final void onSuccess(C2276691E9j c2276691E9j) {
        C2276691E9j c2276691E9j2 = c2276691E9j;
        this.LIZ.getClass();
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2276651E9f.class, null);
        C1E9Z c1e9z = this.LIZJ;
        InterfaceC2276651E9f interfaceC2276651E9f = (InterfaceC2276651E9f) xBaseModelLIZJ;
        String roomID = c2276691E9j2.LIZ;
        if (roomID == null) {
            roomID = c1e9z.getRoomID();
        }
        interfaceC2276651E9f.setRoomID(roomID);
        String userID = c2276691E9j2.LIZIZ;
        if (userID == null) {
            userID = c1e9z.getUserID();
        }
        interfaceC2276651E9f.setUserID(userID);
        int i = c2276691E9j2.LIZJ;
        if (i == null) {
            i = 0;
        }
        interfaceC2276651E9f.setErrorCode(i);
        interfaceC2276651E9f.setErrorMsg(c2276691E9j2.LIZLLL);
        this.LIZIZ.onSuccess(interfaceC2276651E9f, "");
    }

    public C2276661E9g(C2276601E9a c2276601E9a, CompletionBlock<InterfaceC2276651E9f> completionBlock, C1E9Z c1e9z) {
        this.LIZ = c2276601E9a;
        this.LIZIZ = completionBlock;
        this.LIZJ = c1e9z;
    }

    @Override // X.InterfaceC914930Zut
    public final void LIZ(int i, String str, Throwable th) {
        this.LIZ.getClass();
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2276651E9f.class, null);
        C1E9Z c1e9z = this.LIZJ;
        InterfaceC2276651E9f interfaceC2276651E9f = (InterfaceC2276651E9f) xBaseModelLIZJ;
        interfaceC2276651E9f.setRoomID(c1e9z.getRoomID());
        interfaceC2276651E9f.setUserID(c1e9z.getUserID());
        interfaceC2276651E9f.setErrorMsg(str);
        interfaceC2276651E9f.setErrorCode(Integer.valueOf(i));
        this.LIZIZ.onSuccess(interfaceC2276651E9f, "");
    }
}
