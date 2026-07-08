package X;

import android.content.Context;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;

/* JADX INFO: renamed from: X.0i0q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226140i0q {
    public static final String LIZ(IMContact iMContact) {
        String strLIZIZ;
        if (iMContact instanceof IMUser) {
            IMFriendsService.LIZ.getClass();
            IMFriendsService iMFriendsServiceLIZ = C898270ZLt.LIZ();
            if (iMFriendsServiceLIZ != null && (strLIZIZ = iMFriendsServiceLIZ.LIZIZ(iMContact.getUid(), iMContact.getDisplayName())) != null) {
                return strLIZIZ;
            }
        } else {
            String displayName = iMContact.getDisplayName();
            if (displayName != null) {
                return displayName;
            }
        }
        return "";
    }

    public static final void LIZIZ(C1224840hyk c1224840hyk, AbstractC1225770i0F abstractC1225770i0F) {
        String nickName;
        Object obj = c1224840hyk.LLJI.get("item_disable_reason");
        if (obj != EnumC1226150i0r.IN_GROUP) {
            if (obj == EnumC1226150i0r.NO_GROUP_PERMISSION) {
                C1226680i1i.LIZLLL(abstractC1225770i0F, abstractC1225770i0F.LJJJJLL().LIZIZ().getString(2131831400));
                return;
            }
            if (obj == EnumC1226150i0r.NO_CHAT_PERMISSION) {
                Context contextLIZIZ = abstractC1225770i0F.LJJJJLL().LIZIZ();
                Object[] objArr = new Object[1];
                IMUser iMUserLIZ = C1225230hzN.LIZ(c1224840hyk);
                if (iMUserLIZ == null || (nickName = iMUserLIZ.getNickName()) == null) {
                    nickName = "";
                }
                objArr[0] = nickName;
                C1226680i1i.LIZLLL(abstractC1225770i0F, contextLIZIZ.getString(2131831120, objArr));
                return;
            }
        }
        InterfaceC1226510i1R interfaceC1226510i1R = abstractC1225770i0F.LLILLL;
        if (interfaceC1226510i1R != null && interfaceC1226510i1R.LJIIJ() && !c1224840hyk.LLJILJIL && !c1224840hyk.LLJILLL) {
            C1226680i1i.LIZLLL(abstractC1225770i0F, abstractC1225770i0F.LJJJJLL().LIZIZ().getString(2131835236));
        }
    }

    public static final void LIZJ(AbstractC1225770i0F abstractC1225770i0F, EnumC1227730i3P enumC1227730i3P, boolean z) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        InterfaceC1226510i1R interfaceC1226510i1R2;
        if (enumC1227730i3P != null && (interfaceC1226510i1R = abstractC1225770i0F.LLILLL) != null && interfaceC1226510i1R.LJJ(enumC1227730i3P) != null && (interfaceC1226510i1R2 = abstractC1225770i0F.LLILLL) != null) {
            interfaceC1226510i1R2.LJIIJJI(new C1224600hyM(enumC1227730i3P, (Boolean) null, (String) null, Boolean.valueOf(z), 14), false);
        }
    }
}
