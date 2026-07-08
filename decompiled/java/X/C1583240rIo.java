package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.friendstab.interfaces.IFriendsTabRouterAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0rIo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1583240rIo extends C09AY implements Function0<Unit> {
    public C1583240rIo() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C19EG c19eg;
        IFriendsTabRouterAbility iFriendsTabRouterAbilityLIZ;
        Activity activityLJFF = C2214201BlK.LJFF();
        if ((activityLJFF instanceof C19EG) && (c19eg = (C19EG) activityLJFF) != null && (iFriendsTabRouterAbilityLIZ = C1583510rJF.LIZ(c19eg)) != null) {
            iFriendsTabRouterAbilityLIZ.pk0("", "homepage_friends");
        }
        return Unit.LIZ;
    }
}
