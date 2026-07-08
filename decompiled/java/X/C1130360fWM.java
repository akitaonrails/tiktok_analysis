package X;

import com.bytedance.android.livesdk.gift.base.platform.core.manager.GiftManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0fWM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1130360fWM {
    public static List LIZ(long j) {
        if (j <= 0) {
            return null;
        }
        InterfaceC1128210fSt interfaceC1128210fStInst = GiftManager.inst();
        if (interfaceC1128210fStInst.getCachedGiftListRoomId() != j) {
            return null;
        }
        List listLJJJJLI = C13LP.LJJJJLI(interfaceC1128210fStInst.getGiftPageList());
        if (((ArrayList) listLJJJJLI).isEmpty()) {
            return null;
        }
        return listLJJJJLI;
    }
}
