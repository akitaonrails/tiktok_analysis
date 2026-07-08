package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.relation.service.InviteFriendsService;
import com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService;
import kotlin.jvm.internal.AwS422S0200000_21;

/* JADX INFO: renamed from: X.0iEd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234690iEd implements IInviteFriendsService {
    public static final C1234690iEd LIZIZ = new C1234690iEd();
    public final /* synthetic */ IInviteFriendsService LIZ;

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234320iE2 LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final C0T09 LIZIZ(C19EG c19eg, boolean z) {
        return this.LIZ.LIZIZ(c19eg, z);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234330iE3 LIZJ() {
        return this.LIZ.LIZJ();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1362350lYX LIZLLL(Context context, Bundle bundle) {
        return this.LIZ.LIZLLL(context, bundle);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234700iEe LJ(Context context, Bundle bundle, String str, String str2, AwS422S0200000_21 awS422S0200000_21, AwS422S0200000_21 awS422S0200000_212) {
        return this.LIZ.LJ(context, bundle, str, str2, awS422S0200000_21, awS422S0200000_212);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJFF(Activity activity) {
        this.LIZ.LJFF(activity);
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final void LJI() {
        this.LIZ.LJI();
    }

    @Override // com.ss.android.ugc.aweme.relation.spi.IInviteFriendsService
    public final InterfaceC1234410iEB LJII() {
        return this.LIZ.LJII();
    }

    public C1234690iEd() {
        IInviteFriendsService iInviteFriendsService;
        Object objLIZ = C04TD.LIZ(IInviteFriendsService.class, false);
        if (objLIZ != null) {
            iInviteFriendsService = (IInviteFriendsService) objLIZ;
        } else {
            if (C04TD.B3 == null) {
                synchronized (IInviteFriendsService.class) {
                    if (C04TD.B3 == null) {
                        C04TD.B3 = new InviteFriendsService();
                    }
                }
            }
            iInviteFriendsService = C04TD.B3;
        }
        this.LIZ = iInviteFriendsService;
    }
}
