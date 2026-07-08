package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.friends.IMFriendsService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0i25, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226910i25 {
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x001c A[PHI: r0
      0x001c: PHI (r0v3 java.lang.String) = (r0v2 java.lang.String), (r0v4 java.lang.String) binds: [B:10:0x0019, B:5:0x000c] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String LIZLLL(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact r2) {
        /*
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMUser
            java.lang.String r1 = ""
            if (r0 == 0) goto Lf
            com.ss.android.ugc.aweme.im.contacts.api.model.IMUser r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMUser) r2
            java.lang.String r0 = r2.getInitialLetter()
            if (r0 != 0) goto L1c
        Le:
            return r1
        Lf:
            boolean r0 = r2 instanceof com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation
            if (r0 == 0) goto Le
            com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation r2 = (com.ss.android.ugc.aweme.im.contacts.api.model.IMConversation) r2
            java.lang.String r0 = r2.getInitialLetter()
            if (r0 != 0) goto L1c
            return r1
        L1c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226910i25.LIZLLL(com.ss.android.ugc.aweme.im.contacts.api.model.IMContact):java.lang.String");
    }

    public static final EnumC1226540i1U LJ(int i) {
        if (i != 5) {
            if (i != 6) {
                if (i != 7) {
                    if (i != 8) {
                        return null;
                    }
                    return EnumC1226540i1U.TAB_KEY_LIVE_TOP_GUEST;
                }
                return EnumC1226540i1U.TAB_KEY_LIVE_SMB;
            }
            return EnumC1226540i1U.TAB_KEY_LIVE_MOST_GIFT_COUNT;
        }
        return EnumC1226540i1U.TAB_KEY_LIVE_MOST_WATCH_TIME;
    }

    public static final void LJFF(AbstractC1225770i0F abstractC1225770i0F, EnumC1227730i3P enumC1227730i3P, boolean z) {
        InterfaceC1226510i1R interfaceC1226510i1R;
        InterfaceC1226510i1R interfaceC1226510i1R2;
        if (enumC1227730i3P != null && (interfaceC1226510i1R = abstractC1225770i0F.LLILLL) != null && interfaceC1226510i1R.LJJ(enumC1227730i3P) != null && (interfaceC1226510i1R2 = abstractC1225770i0F.LLILLL) != null) {
            interfaceC1226510i1R2.LJIIJJI(new C1224600hyM(enumC1227730i3P, (Boolean) null, (String) null, Boolean.valueOf(z), 14), false);
        }
    }

    public static final List<C1227140i2S> LIZIZ(List<Integer> list, long j, Integer num, Long l, String str) {
        Boolean boolValueOf;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<Integer> it2 = list.iterator();
            while (it2.hasNext()) {
                int iIntValue = it2.next().intValue();
                EnumC1226540i1U enumC1226540i1ULJ = LJ(iIntValue);
                if (enumC1226540i1ULJ == null) {
                    boolValueOf = null;
                } else {
                    String strLIZ = C1226560i1W.LIZ(enumC1226540i1ULJ);
                    Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("time_range", String.valueOf(num)), new Pair("invite_list_type", String.valueOf(iIntValue)));
                    if (l != null) {
                        mapLJIIJ.put("room_id", String.valueOf(l.longValue()));
                    }
                    boolValueOf = Boolean.valueOf(arrayList.add(new C1227140i2S(enumC1226540i1ULJ, strLIZ, new C1227280i2g(iIntValue, j, C13BV.INSTANCE, mapLJIIJ), str)));
                }
                arrayList2.add(boolValueOf);
            }
        }
        return arrayList;
    }
}
