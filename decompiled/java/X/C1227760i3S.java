package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.IMGroupChatApi;
import com.ss.android.ugc.aweme.im.common.model.BaseContact;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.saas.host.api.live.IMLiveDataService;
import com.ss.android.ugc.tiktok.im.contact.selector.api.AbsContactSelectorFragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.0i3S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1227760i3S {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(final AbstractC1225770i0F abstractC1225770i0F, final String str, final String str2, final List list, final boolean z, Function1 function1) {
        C19EG activity;
        final AbsContactSelectorFragment fragment;
        final InterfaceC1227250i2d interfaceC1227250i2dLJIJI;
        C1227860i3c c1227860i3c;
        InterfaceC1226510i1R interfaceC1226510i1R = abstractC1225770i0F.LLILLL;
        if (interfaceC1226510i1R != null) {
            activity = interfaceC1226510i1R.getActivity();
        } else {
            activity = null;
        }
        if ((activity instanceof C19EG) && activity != null && interfaceC1226510i1R != null && (fragment = interfaceC1226510i1R.getFragment()) != null) {
            final C054G c054gLIZ = C2296808zG.LIZ(new C1266260j3Y(CoroutineExceptionHandler.LJJLIL, abstractC1225770i0F, 2).plus(C2296908zH.LIZ()));
            IMGroupChatApi iMGroupChatApiLIZ = IMGroupChatApi.LIZIZ.LIZ();
            if (iMGroupChatApiLIZ != null) {
                interfaceC1227250i2dLJIJI = iMGroupChatApiLIZ.LJIJI(abstractC1225770i0F);
            } else {
                interfaceC1227250i2dLJIJI = null;
            }
            final AbstractC1225780i0G abstractC1225780i0GLJJJJLL = abstractC1225770i0F.LJJJJLL();
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((IMUser) obj).getFollowStatus() != 2) {
                    arrayList.add(obj);
                }
            }
            if (z) {
                c1227860i3c = new C1227860i3c(abstractC1225770i0F, str, null);
            } else {
                c1227860i3c = null;
            }
            final C1227520i34 c1227520i34 = new C1227520i34(z, function1, abstractC1225770i0F, list, arrayList, str2, interfaceC1227250i2dLJIJI, abstractC1225780i0GLJJJJLL, fragment);
            if (!TextUtils.isEmpty(str2)) {
                final C1227860i3c c1227860i3c2 = c1227860i3c;
                C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZJ(str2, new InterfaceC863600XuI<C0Y8T>() { // from class: X.0i3B
                    @Override // X.InterfaceC863600XuI
                    public final void LIZIZ(C0YMW c0ymw) {
                    }

                    @Override // X.InterfaceC863600XuI
                    public final void onSuccess(C0Y8T c0y8t) {
                        C0Y8T c0y8t2 = c0y8t;
                        if (c0y8t2 != null) {
                            c1227520i34.invoke(c0y8t2);
                            List<IMUser> list2 = list;
                            ArrayList arrayList2 = new ArrayList();
                            for (IMUser iMUser : list2) {
                                if (iMUser.getFollowStatus() == 2) {
                                    arrayList2.add(iMUser);
                                }
                            }
                            C23250099c.LIZLLL(c054gLIZ, C0PEM.LIZJ, null, new C1227270i2f(arrayList2, c0y8t2, c0y8t2, str2, interfaceC1227250i2dLJIJI, abstractC1225780i0GLJJJJLL, abstractC1225770i0F, fragment, c1227860i3c2, str, null), 2);
                        }
                    }
                });
                return;
            }
            Pair[] pairArr = new Pair[3];
            pairArr[0] = new Pair("room_id", str);
            pairArr[1] = new Pair("invitation_wait_num", String.valueOf(arrayList.size()));
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((BaseContact) it2.next()).getUid());
            }
            pairArr[2] = new Pair("invitation_wait_to_user_id_set", C13LP.LJJLIIIJ(arrayList2, ",", null, null, 0, null, null, 62));
            final HashMap mapLJI = C2097608Jq.LJI(pairArr);
            C1231470i9R c1231470i9RLIZIZ = C1618506Vj.LIZIZ(IMGroupChatApi.LIZIZ, "live", "live_endpage");
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                String uid = ((BaseContact) it3.next()).getUid();
                if (uid == null) {
                    uid = "";
                }
                arrayList3.add(uid);
            }
            final C1227860i3c c1227860i3c3 = c1227860i3c;
            c1231470i9RLIZIZ.LIZ(new C1229390i65(arrayList3, null, EnumC913760Zt0.NORMAL_GROUP_CHAT, "live", "co_streaming", null, null, null, null, 482), new C1229400i66(abstractC1225780i0GLJJJJLL.LJIIIZ().LIZJ(), (String) null, mapLJI, 10), new C1231500i9U() { // from class: X.0i3R
                @Override // X.C1231500i9U, X.InterfaceC863580XuG
                /* JADX INFO: renamed from: LIZJ */
                public final void LJ(C0Y8T c0y8t, C0YMW c0ymw) {
                    String conversationId;
                    Long lLJIILIIL;
                    if (c0y8t != null && (conversationId = c0y8t.getConversationId()) != null && (lLJIILIIL = C2095008Iq.LJIILIIL(conversationId)) != null) {
                        long jLongValue = lLJIILIIL.longValue();
                        c1227520i34.invoke(c0y8t);
                        if (z) {
                            IMLiveDataService.LIZ.getClass();
                            IMLiveDataService value = C1227780i3U.LIZIZ.getValue();
                            if (value != null) {
                                value.g1(new ArrayList(Collections.singletonList(Long.valueOf(jLongValue))));
                            }
                        }
                        C23250099c.LIZLLL(c054gLIZ, C0PEM.LIZJ, null, new C1496005tO(c1227860i3c3, c0y8t, list, mapLJI, str, jLongValue, null), 2);
                    }
                }
            }, null);
        }
    }
}
