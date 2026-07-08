package X;

import Y.AfS154S0200000_18;
import Y.AfS181S0100000_12;
import Y.AfS68S0400000_18;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bytedance.router.SmartRoute;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.contacts.api.IMContactApi;
import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import com.ss.android.ugc.aweme.im.service.service.IIMChatService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* JADX INFO: renamed from: X.0hYi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1208700hYi extends AbstractViewOnClickListenerC372950Ejl {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.AbstractViewOnClickListenerC372950Ejl
    public final void LIZ(View view) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, view);
                break;
            case 1:
                LIZ$1(this, view);
                break;
            case 2:
                LIZ$2(this, view);
                break;
            case 3:
                LIZ$3(this, view);
                break;
            case 4:
                LIZ$4(this, view);
                break;
            default:
                super.LIZ(view);
                break;
        }
    }

    public static final void LIZ$0(C1208700hYi c1208700hYi, View view) {
        String currentUserID;
        CollectionDetail collectionDetailQS;
        List<CollaborativeUser> list = (List) c1208700hYi.l0;
        String str = null;
        if (list != null || ((collectionDetailQS = ((CollectionContentFragment) c1208700hYi.l1).qS()) != null && (list = collectionDetailQS.collaborativeUserList) != null)) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<CollaborativeUser> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().uid);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                    currentUserID = "";
                }
                if (!Intrinsics.LJFF(obj, currentUserID)) {
                    arrayList2.add(obj);
                }
            }
            str = (String) C13LP.LJJJLZIJ(0, arrayList2);
        }
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        final C19EG c19eg = (C19EG) c1208700hYi.l2;
        final CollectionContentFragment collectionContentFragment = (CollectionContentFragment) c1208700hYi.l1;
        c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.0i6D
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                Activity activityLIZIZ = c19eg;
                if (activityLIZIZ == null) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null) {
                        activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                    } else {
                        activityLIZIZ = null;
                    }
                }
                EnterChatParams enterChatParams = new EnterChatParams((Context) activityLIZIZ, iMUser);
                enterChatParams.setEnterFromForMob(collectionContentFragment.LLJI);
                enterChatParams.setEnterMethodForMob("click_collection_banner");
                enterChatParams.setQuickChat(true);
                imChatService.LJIILLIIL(enterChatParams, null);
            }
        }, str, null, "", false);
    }

    public static final void LIZ$1(C1208700hYi c1208700hYi, View view) {
        String str = ((CollectionContentFragment) c1208700hYi.l0).LLJ;
        List list = (List) c1208700hYi.l1;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C1171050gZz) it2.next()).LIZ.getAid());
        }
        CollectionManageRequest collectionManageRequest = new CollectionManageRequest(11, str, null, null, null, null, arrayList, null, null, null, null, null);
        C11O8 c11o8LJJJLZIJ = new C1171340gaS().LLILLL.LLZLLIL(collectionManageRequest, false).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
        CollectionContentFragment collectionContentFragment = (CollectionContentFragment) c1208700hYi.l0;
        List list2 = (List) c1208700hYi.l1;
        C19EG c19eg = (C19EG) c1208700hYi.l2;
        ((CollectionContentFragment) c1208700hYi.l0).kS().LIZ(c11o8LJJJLZIJ.LJJLL(new AfS68S0400000_18(collectionContentFragment, list2, collectionManageRequest, c19eg, 0), new AfS181S0100000_12(c19eg, 125)));
    }

    public static final void LIZ$2(C1208700hYi c1208700hYi, View view) {
        SmartRoute smartRouteLIZ = ((C1171910gbN) c1208700hYi.l0).LIZ((Activity) c1208700hYi.l1, 1038, "click_add_collection");
        smartRouteLIZ.withParam("extra_mob_tab_name", "collection");
        smartRouteLIZ.open();
        final C1171910gbN c1171910gbN = (C1171910gbN) c1208700hYi.l0;
        final CollectionDetail collectionDetail = (CollectionDetail) c1208700hYi.l2;
        c1171910gbN.getClass();
        C0NB9.LIZ(new C0NBA() { // from class: X.0gbP
            @Override // X.C0NBA
            public final void LIZ(C0NBB c0nbb) throws JSONException {
                c0nbb.LIZ("enter_from", c1171910gbN.LIZJ);
                c0nbb.LIZ("group_id", c1171910gbN.LIZ);
                c0nbb.LIZ("toast_type", "add_collection");
                c0nbb.LIZ("collection_id", collectionDetail.id);
            }
        }, "favourite_notice_click");
    }

    public static final void LIZ$3(C1208700hYi c1208700hYi, View view) {
        boolean z;
        ((C1171530gal) c1208700hYi.l0).LIZ().LJ("FeedAddToFavoritesPopToast doClick isCacheEmpty true");
        ((C013C) c1208700hYi.l1).element = true;
        C1206780hVc.LIZ("click favorite toast");
        C20684815ws.LJIJI("click_collection_banner", new Pair(((C1171530gal) c1208700hYi.l0).LLILLJJLI, "enter_from"), new Pair("click_fav_button", "enter_method"), new Pair(((C1171530gal) c1208700hYi.l0).LL, "group_id"));
        C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
        C1171530gal c1171530gal = (C1171530gal) c1208700hYi.l0;
        boolean z2 = c1171530gal.LLILLL;
        if (c1171530gal.LL != null) {
            z = true;
        } else {
            z = false;
        }
        c1171300gaO.u0(0L, null, true, null, null, C1171750gb7.LIZ(), z2, z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS154S0200000_18((C19EG) c1208700hYi.l2, (C1171530gal) c1208700hYi.l0, 6), new C09JN() { // from class: X.0gak
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.showAt$4$doClick$2");
                C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.showAt$4$doClick$2");
            }
        });
    }

    public static final void LIZ$4(C1208700hYi c1208700hYi, View view) {
        String str;
        String currentUserID;
        List list = (List) c1208700hYi.l0;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
                if (iUserService == null || (currentUserID = iUserService.getCurrentUserID()) == null) {
                    currentUserID = "";
                }
                if (!Intrinsics.LJFF(obj, currentUserID)) {
                    arrayList.add(obj);
                }
            }
            str = (String) C13LP.LJJJLZIJ(0, arrayList);
        } else {
            str = null;
        }
        IMContactApi.LIZ.getClass();
        C1BGS c1bgsLJ = C069P.LIZ().LJ();
        final C19EG c19eg = (C19EG) c1208700hYi.l1;
        final C1171530gal c1171530gal = (C1171530gal) c1208700hYi.l2;
        c1bgsLJ.LIZJ(new InterfaceC1480505qt() { // from class: X.0i6E
            @Override // X.InterfaceC1480505qt
            public final void LIZ(Throwable th) {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZJ() {
            }

            @Override // X.InterfaceC1480505qt
            public final void LIZIZ(IMUser iMUser) {
                IIMChatService imChatService = C1336205Ku.LIZ(false).getImChatService();
                Activity activityLIZIZ = c19eg;
                if (activityLIZIZ == null) {
                    AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
                    if (abstractC1387200mCcLJ != null) {
                        activityLIZIZ = abstractC1387200mCcLJ.LIZIZ();
                    } else {
                        activityLIZIZ = null;
                    }
                }
                EnterChatParams enterChatParams = new EnterChatParams((Context) activityLIZIZ, iMUser);
                enterChatParams.setEnterFromForMob(c1171530gal.LLILLJJLI);
                enterChatParams.setEnterMethodForMob("click_collection_banner");
                enterChatParams.setQuickChat(true);
                imChatService.LJIILLIIL(enterChatParams, null);
            }
        }, str, null, "", false);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public C1208700hYi(com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment r4, java.util.List r5, X.C19EG r6, int r7) {
        /*
            r3 = this;
            r3.$t = r7
            if (r7 == 0) goto L11
            r2 = r3
            r2.l0 = r4
            r2.l1 = r5
            r2.l2 = r6
            r0 = 500(0x1f4, double:2.47E-321)
        Ld:
            r2.<init>(r0)
            return
        L11:
            r2 = r3
            r2.l0 = r5
            r2.l1 = r4
            r2.l2 = r6
            r0 = 500(0x1f4, double:2.47E-321)
            goto Ld
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1208700hYi.<init>(com.ss.android.ugc.aweme.favorites.business.collection.CollectionContentFragment, java.util.List, X.19EG, int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1208700hYi(Object obj, Object obj2, Object obj3, int i) {
        super(500L);
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
