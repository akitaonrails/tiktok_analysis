package X;

import android.content.Context;
import android.net.Uri;
import android.os.Message;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.common.utility.collection.WeakHandler;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import com.ss.android.ugc.aweme.relation.usercard.ability.IUserCardListAbility;
import com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility;
import java.util.List;

/* JADX INFO: renamed from: X.0ivT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1261250ivT {
    public static final C1261250ivT LIZ = new C1261250ivT();

    public static void LIZJ(EnumC1261300ivY enumC1261300ivY, C1261270ivV c1261270ivV) {
        C1261280ivW c1261280ivW = new C1261280ivW();
        c1261280ivW.LJJLIIIJ = enumC1261300ivY;
        c1261280ivW.LJJLIIIJILLIZJL = c1261270ivV.LJIJJ;
        c1261280ivW.LJIILJJIL();
    }

    public static void LIZLLL(C1261860iwS c1261860iwS, LifecycleOwner lifecycleOwner) {
        ComplianceServiceProvider.LJJ().LIZIZ(C724240Sb0.LIZ(lifecycleOwner), new Uri.Builder().appendQueryParameter("owner_id", c1261860iwS.getUid()).appendQueryParameter("object_id", c1261860iwS.getUid()).appendQueryParameter("report_type", "user"));
    }

    public static void LIZ(Context context, C1261860iwS c1261860iwS, C1261270ivV c1261270ivV) {
        String str;
        String str2;
        IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
        IMUser.Companion.getClass();
        EnterChatParams enterChatParams = new EnterChatParams(context, C2201941BFw.LIZJ(c1261860iwS));
        String str3 = null;
        if (c1261270ivV != null) {
            str = c1261270ivV.LIZ;
        } else {
            str = null;
        }
        enterChatParams.setEnterFromForMob(str);
        if (c1261270ivV != null) {
            str2 = c1261270ivV.LIZIZ;
        } else {
            str2 = null;
        }
        enterChatParams.setEnterMethodForMob(str2);
        if (c1261270ivV != null) {
            str3 = c1261270ivV.LIZLLL;
        }
        enterChatParams.setPreviousPage(str3);
        imChatService.LJIILLIIL(enterChatParams, null);
    }

    public static void LIZIZ(EnumC1261310ivZ enumC1261310ivZ, C1261270ivV c1261270ivV, Integer num) {
        C1261260ivU c1261260ivU = new C1261260ivU();
        c1261260ivU.LJJLIIIJ = enumC1261310ivZ;
        c1261260ivU.LJJLIIIJILLIZJL = c1261270ivV.LJIJJ;
        c1261260ivU.LIZLLL = c1261270ivV.LIZ;
        c1261260ivU.LJJLIIIJL = c1261270ivV.LJII;
        c1261260ivU.LJJLIIIJJI = c1261270ivV.LIZIZ;
        c1261260ivU.LJJLIIIJJIZ = num;
        c1261260ivU.LJIILJJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0153 A[PHI: r6
      0x0153: PHI (r6v4 boolean) = (r6v2 boolean), (r6v2 boolean), (r6v5 boolean) binds: [B:30:0x01a0, B:32:0x01ae, B:17:0x0151] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(android.content.Context r89, X.C1261860iwS r90, com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility r91, X.C1261270ivV r92) {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1261250ivT.LJFF(android.content.Context, X.0iwS, com.ss.android.ugc.aweme.relation.usercard.ability.RecUserCellTrackAbility, X.0ivV):void");
    }

    public static void LJ(final Context context, final LifecycleOwner lifecycleOwner, final C1261860iwS c1261860iwS, final IUserCardListAbility iUserCardListAbility, final RecUserCellTrackAbility recUserCellTrackAbility, final C1261270ivV c1261270ivV) {
        int iIntValue;
        WeakHandler weakHandler = new WeakHandler(new WeakHandler.IHandler() { // from class: X.0ivX
            @Override // com.bytedance.common.utility.collection.WeakHandler.IHandler
            public final void handleMsg(Message message) {
                String str;
                C1261250ivT c1261250ivT = C1261250ivT.LIZ;
                C1261860iwS c1261860iwS2 = c1261860iwS;
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                Context context2 = context;
                IUserCardListAbility iUserCardListAbility2 = iUserCardListAbility;
                RecUserCellTrackAbility recUserCellTrackAbility2 = recUserCellTrackAbility;
                C1261270ivV c1261270ivV2 = c1261270ivV;
                c1261250ivT.getClass();
                if (message != null) {
                    int i = message.what;
                    if (i != 50) {
                        switch (i) {
                            case 53:
                                if (context2 != null && iUserCardListAbility2 != null && recUserCellTrackAbility2 != null) {
                                    C1261250ivT.LIZ(context2, c1261860iwS2, c1261270ivV2);
                                    break;
                                }
                                break;
                            case 54:
                            case 55:
                                if (iUserCardListAbility2 != null) {
                                    if (c1261270ivV2 != null) {
                                        str = c1261270ivV2.LIZ;
                                    } else {
                                        str = null;
                                    }
                                    iUserCardListAbility2.eZ(c1261860iwS2, str);
                                }
                                break;
                        }
                        return;
                    }
                    if (lifecycleOwner2 == null) {
                        return;
                    }
                    C1261250ivT.LIZLLL(c1261860iwS2, lifecycleOwner2);
                }
            }
        });
        C19EG c19egLIZ = C724240Sb0.LIZ(lifecycleOwner);
        List<? extends Aweme> list = c1261860iwS.getMatchedFriendStruct().awemeList;
        Integer aliasPermission = c1261860iwS.getAliasPermission();
        if (aliasPermission != null) {
            iIntValue = aliasPermission.intValue();
        } else {
            iIntValue = 0;
        }
        if (c1261860iwS.getShareInfo() != null) {
            C621180OYa.LIZ.LJJLIIIJL(weakHandler, c19egLIZ, c1261860iwS, list, "", "maf_list", Integer.valueOf(iIntValue));
        }
    }
}
