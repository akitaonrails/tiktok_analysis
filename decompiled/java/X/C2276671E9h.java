package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;

/* JADX INFO: renamed from: X.1E9h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2276671E9h implements InterfaceC914930Zut<C2276691E9j> {
    public final /* synthetic */ C1E9W LIZ;
    public final /* synthetic */ CompletionBlock<InterfaceC2276681E9i> LIZIZ;
    public final /* synthetic */ C1E9X LIZJ;

    @Override // X.InterfaceC914930Zut
    public final void onSuccess(C2276691E9j c2276691E9j) {
        C2276691E9j c2276691E9j2 = c2276691E9j;
        this.LIZ.getClass();
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2276681E9i.class, null);
        C1E9X c1e9x = this.LIZJ;
        InterfaceC2276681E9i interfaceC2276681E9i = (InterfaceC2276681E9i) xBaseModelLIZJ;
        String roomID = c2276691E9j2.LIZ;
        if (roomID == null) {
            roomID = c1e9x.getRoomID();
        }
        interfaceC2276681E9i.setRoomID(roomID);
        String userID = c2276691E9j2.LIZIZ;
        if (userID == null) {
            userID = c1e9x.getUserID();
        }
        interfaceC2276681E9i.setUserID(userID);
        int i = c2276691E9j2.LIZJ;
        if (i == null) {
            i = 0;
        }
        interfaceC2276681E9i.setErrorCode(i);
        interfaceC2276681E9i.setErrorMsg(c2276691E9j2.LIZLLL);
        this.LIZIZ.onSuccess(interfaceC2276681E9i, "");
    }

    public C2276671E9h(C1E9W c1e9w, CompletionBlock<InterfaceC2276681E9i> completionBlock, C1E9X c1e9x) {
        this.LIZ = c1e9w;
        this.LIZIZ = completionBlock;
        this.LIZJ = c1e9x;
    }

    @Override // X.InterfaceC914930Zut
    public final void LIZ(int i, String str, Throwable th) {
        this.LIZ.getClass();
        XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC2276681E9i.class, null);
        C1E9X c1e9x = this.LIZJ;
        InterfaceC2276681E9i interfaceC2276681E9i = (InterfaceC2276681E9i) xBaseModelLIZJ;
        interfaceC2276681E9i.setRoomID(c1e9x.getRoomID());
        interfaceC2276681E9i.setUserID(c1e9x.getRoomID());
        interfaceC2276681E9i.setErrorMsg(str);
        interfaceC2276681E9i.setErrorCode(Integer.valueOf(i));
        this.LIZIZ.onSuccess(interfaceC2276681E9i, "");
    }
}
