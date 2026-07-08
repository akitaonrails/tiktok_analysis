package X;

import android.content.Context;
import com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService;
import com.ss.android.ugc.tiktok.addyours.service.InviteFriendsServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0DeB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C344010DeB implements IInviteFriendsService {
    public static final C344010DeB LIZIZ = new C344010DeB();
    public final /* synthetic */ IInviteFriendsService LIZ;

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC330080Cwo> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final Class<? extends InterfaceC330080Cwo> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.tiktok.addyours.service.IInviteFriendsService
    public final void LIZJ(Context context, Class<? extends InterfaceC330080Cwo> cls, Function1<? super C343930De3, Unit> function1) {
        this.LIZ.LIZJ(context, cls, function1);
    }

    public C344010DeB() {
        IInviteFriendsService iInviteFriendsService;
        Object objLIZ = C04TD.LIZ(IInviteFriendsService.class, false);
        if (objLIZ != null) {
            iInviteFriendsService = (IInviteFriendsService) objLIZ;
        } else {
            if (C04TD.R6 == null) {
                synchronized (IInviteFriendsService.class) {
                    if (C04TD.R6 == null) {
                        C04TD.R6 = new InviteFriendsServiceImpl();
                    }
                }
            }
            iInviteFriendsService = C04TD.R6;
        }
        this.LIZ = iInviteFriendsService;
    }
}
