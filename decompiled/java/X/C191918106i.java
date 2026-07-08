package X;

import android.view.View;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.inbox.service.IInboxService;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionItem;
import com.ss.android.ugc.tiktok.tpsc.model.PrivacySettingsRestrictionOption;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS271S0000000_28;
import kotlin.jvm.internal.AwS40S1110000_28;
import kotlin.jvm.internal.AwS607S0100000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.106i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C191918106i {
    public static final C191918106i LIZ = new C191918106i();
    public static final C191852103u LIZIZ;
    public static final C191852103u LIZJ;
    public static final C191852103u LIZLLL;

    static {
        C104A[] c104aArr = new C104A[1];
        C104S c104s = new C104S(R.raw.icon_comment_fill, new C103N(2131845081), null, false, Collections.singletonList(C191975108n.LIZJ("comment", "comment", AFwS271S0000000_28.get$arr$(41))), null, 44);
        if (LIZ()) {
            c104s.LJFF = new C103N(AFwS271S0000000_28.get$arr$(42));
        }
        c104aArr[0] = c104s;
        LIZIZ = C191853103v.LIZIZ(c104aArr);
        LIZJ = C191853103v.LIZIZ(new C104A[]{new C104S(R.raw.icon_paperplane_fill, new C103N(2131845082), null, false, Collections.singletonList(C191975108n.LIZJ("chatsets", "direct_message", AFwS271S0000000_28.get$arr$(43))), null, 44)});
        C191852103u c191852103uLIZIZ = C191853103v.LIZIZ(new C104A[]{new C104S(R.raw.icon_paperplane_fill, new C103N(2131830795), null, true, C1697810uHb.LJIIJJI(C191975108n.LIZJ("dm_setting_friends", "dm_setting_friends", AFwS271S0000000_28.get$arr$(44)), C191975108n.LIZJ("dm_setting_potential_connection", "dm_setting_potential_connection", AFwS271S0000000_28.get$arr$(45)), C191975108n.LIZJ("dm_setting_others", "dm_setting_others", AFwS271S0000000_28.get$arr$(46))), new C103N(AFwS271S0000000_28.get$arr$(47)), 4)});
        c191852103uLIZIZ.LJFF = true;
        LIZLLL = c191852103uLIZIZ;
    }

    public static boolean LIZ() {
        int i;
        List list;
        C191956107u.LIZ.getClass();
        C191880104w c191880104w = C191880104w.LIZ;
        c191880104w.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI = C191880104w.LJIIJJI(0, "comment_batch");
        if (privacySettingsRestrictionItemLJIIJJI == null || !((i = privacySettingsRestrictionItemLJIIJJI.resType) == 15 || i == 14 || i == 16)) {
            return false;
        }
        c191880104w.getClass();
        PrivacySettingsRestrictionItem privacySettingsRestrictionItemLJIIJJI2 = C191880104w.LJIIJJI(0, "comment");
        if (privacySettingsRestrictionItemLJIIJJI2 == null || (list = privacySettingsRestrictionItemLJIIJJI2.values) == null) {
            list = C13BV.INSTANCE;
        }
        if (list.isEmpty()) {
            return false;
        }
        Iterator it2 = list.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            int i2 = ((PrivacySettingsRestrictionOption) it2.next()).showType;
            if (i2 != 2 && i2 != 1) {
                z = false;
            }
        }
        return z;
    }

    public static boolean LIZIZ() {
        IInboxService iInboxService = (IInboxService) PluggableExtentionKt.pluggableSpi$default(IInboxService.class, false, false, false, 14, null);
        return (iInboxService != null ? iInboxService.LIZJ() : null) == C05RV.BUSINESS_INBOX;
    }

    public static void LIZJ(int i, String str) {
        C20684815ws.LJIILLIIL("permission_change_confirmation", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("confirm_action", String.valueOf(i))));
    }

    public static void LIZLLL(int i, Integer num, String str) {
        String str2;
        if (num != null && num.intValue() == i) {
            return;
        }
        if (Intrinsics.LJFF(str, "dm_setting_potential_connection")) {
            str2 = "potential_connections";
        } else if (!Intrinsics.LJFF(str, "dm_setting_others")) {
            return;
        } else {
            str2 = "others_on_tiktok";
        }
        C20684815ws.LJIILLIIL("change_dm_permission", C2097608Jq.LJIIIIZZ(new Pair("enter_from", str2), new Pair("receive_messages_in", String.valueOf(i))));
    }

    public static void LJ(View view, int i, int i2, String str, boolean z, boolean z2, Function0 function0) {
        C1397580mTM c1397580mTM = new C1397580mTM(view.getContext());
        c1397580mTM.LJFF(i);
        c1397580mTM.LIZ(i2);
        c1397580mTM.LJII = false;
        if (z) {
            C1397720mTa.LIZ(c1397580mTM, C1383370m6R.LJIIJ(2131831337), new AwS607S0100000_28(c1397580mTM, 63));
        }
        C985403tE.LIZ(c1397580mTM, new AwS40S1110000_28(str, function0, z2, 0));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }
}
