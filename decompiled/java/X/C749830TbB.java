package X;

import Y.AfS181S0100000_12;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveModeratorNewSuggestionSetting;
import com.bytedance.android.livesdk.usermanage.AdminApi;
import com.bytedance.android.livesdk.userservice.UserService;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0TbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C749830TbB {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(InterfaceC749850TbD interfaceC749850TbD, long j, Long l) {
        InterfaceC2262081DgM currentUser;
        long jLongValue;
        InterfaceC2262081DgM currentUser2;
        String secUid = null;
        if (LiveModeratorNewSuggestionSetting.INSTANCE.isEnable()) {
            WeakReference weakReference = new WeakReference(interfaceC749850TbD);
            AdminApi adminApi = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
            String strLJIJ = UserService.getInstance().user().LJIJ(j);
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser != null && (currentUser2 = interfaceC500940JkiUser.getCurrentUser()) != null) {
                secUid = currentUser2.getSecUid();
            }
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            adminApi.fetchAdministratorsNew(j, strLJIJ, secUid, jLongValue).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(weakReference, 218), new AfS181S0100000_12(weakReference, 219));
            return;
        }
        WeakReference weakReference2 = new WeakReference(interfaceC749850TbD);
        AdminApi adminApi2 = (AdminApi) C482260Ivg.LIZJ(AdminApi.class);
        String strLJIJ2 = UserService.getInstance().user().LJIJ(j);
        InterfaceC500940Jki interfaceC500940JkiUser2 = UserService.getInstance().user();
        if (interfaceC500940JkiUser2 != null && (currentUser = interfaceC500940JkiUser2.getCurrentUser()) != null) {
            secUid = currentUser.getSecUid();
        }
        adminApi2.fetchAdministrators(j, strLJIJ2, secUid).LJIILIIL(new C0UO0()).LJJLL(new AfS181S0100000_12(weakReference2, 216), new AfS181S0100000_12(weakReference2, 217));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZIZ(boolean r7, long r8, long r10, long r12, java.lang.String r14, X.C750740Tce r15) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C749830TbB.LIZIZ(boolean, long, long, long, java.lang.String, X.0Tce):void");
    }
}
