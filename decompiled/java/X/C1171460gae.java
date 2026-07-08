package X;

import Y.AfS111S0300000_18;
import Y.AfS45S1100000_12;
import Y.AfS68S0400000_18;
import Y.AfS6S1210000_18;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.favorites.business.collection.CollaborativeUser;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionDetail;
import com.ss.android.ugc.aweme.favorites.business.collection.CollectionManageRequest;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS553S0100000_9;
import kotlin.jvm.internal.AwS588S0100000_9;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0gae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1171460gae {
    public static final C1171460gae LIZ = new C1171460gae();
    public static AbstractDialogC1171850gbH LIZIZ;
    public static boolean LIZJ;

    public static void LIZIZ(Context context, Aweme aweme, String str, boolean z) {
        boolean z2;
        boolean z3;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            View viewFindViewById = c19egLIZIZ.getWindow().getDecorView().findViewById(R.id.viewpager);
            String aid = aweme.getAid();
            C1171530gal c1171530gal = new C1171530gal(aid, z, AwemeExtKt.isCollected(aweme), false, str, false, 48);
            AwS588S0100000_9 awS588S0100000_9 = new AwS588S0100000_9(aweme, 648);
            if (!new C1171340gaS().LLILLL.LLJLILLLLZIIL(Boolean.valueOf(c1171530gal.LLILLL))) {
                C1171300gaO c1171300gaO = new C1171340gaS().LLILLL;
                boolean z4 = c1171530gal.LLILLL;
                if (aid != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                c1171300gaO.u0(0L, null, true, null, null, true, z4, z3).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS68S0400000_18(awS588S0100000_9, c1171530gal, c19egLIZIZ, viewFindViewById, 1), new C09JN() { // from class: X.00Nu
                    @Override // X.C09JN
                    public final /* bridge */ /* synthetic */ void accept(Object obj) {
                        C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$2");
                        C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$2");
                    }
                });
                return;
            }
            C1171300gaO c1171300gaO2 = new C1171340gaS().LLILLL;
            boolean z5 = c1171530gal.LLILLL;
            if (aid != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c1171300gaO2.u0(0L, null, true, null, null, C1171750gb7.LIZ(), z5, z2).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS111S0300000_18(c1171530gal, c19egLIZIZ, viewFindViewById, 0), new C09JN() { // from class: X.00Nv
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$4");
                    C1C7U.LIZIZ("FeedAddToFavoritesPopToast@bc43.directShowFavoritesSheet$4");
                }
            });
        }
    }

    public static void LIZJ(Context context, Aweme aweme, String str, boolean z) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
        if (c19egLIZIZ != null) {
            C1171530gal.LJI(new C1171530gal(aweme.getAid(), z, AwemeExtKt.isCollected(aweme), false, str, false, 48), c19egLIZIZ, new AwS553S0100000_9(aweme, 1831), 2);
        }
    }

    public static void LIZ(Aweme aweme, String str, boolean z, Context context, CollectionDetail collectionDetail, Integer num) {
        String str2;
        String string;
        C737030Svd c737030Svd = new C737030Svd(106);
        Bundle bundle = new Bundle();
        C786410Ut5.LJJJI("group_id", aweme.getAid(), bundle);
        C786410Ut5.LJJJI("enter_method", "click_bubble_add", bundle);
        c737030Svd.LIZJ = bundle;
        C1440005kM.LIZ(c737030Svd);
        Integer num2 = collectionDetail.type;
        int iIntValue = 0;
        ArrayList arrayList = null;
        Integer num3 = null;
        int i = 1;
        if (num2 != null && num2.intValue() == 1 && ((str2 = collectionDetail.id) == null || str2.length() == 0)) {
            C19EG c19egLIZIZ = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ != null) {
                String string2 = c19egLIZIZ.getString(2131834461);
                C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
                Object[] objArr = new Object[1];
                String str3 = collectionDetail.name;
                if (str3 != null) {
                    string = a0.LJLIIIL(str3).toString();
                } else {
                    string = null;
                }
                objArr[0] = string;
                c1389890mGx.LJIIJ(C786410Ut5.j4(string2, Arrays.copyOf(objArr, 1)));
                c1389890mGx.LJFF(R.raw.icon_tick_fill_small);
                c1389890mGx.LJII(R.attr.a0i);
                c1389890mGx.LJIIJJI();
                String str4 = collectionDetail.name;
                Integer num4 = collectionDetail.type;
                List listSingletonList = Collections.singletonList(aweme.getAid());
                CollectionDetail.Status status = collectionDetail.status;
                if (status != null) {
                    num3 = status.state;
                }
                new C1171340gaS().LLILLL.LLZLLIL(new CollectionManageRequest(1, null, str4, null, null, listSingletonList, null, null, num3, null, num4, null), z).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new AfS6S1210000_18(z, collectionDetail, aweme, str, 1), new AfS45S1100000_12(c19egLIZIZ, str, 4));
            }
        } else {
            C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(context);
            if (c19egLIZIZ2 != null) {
                C1171530gal c1171530gal = new C1171530gal(aweme.getAid(), z, AwemeExtKt.isCollected(aweme), false, str, false, 48);
                List<CollaborativeUser> list = collectionDetail.collaborativeUserList;
                if (list != null) {
                    arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                    Iterator<CollaborativeUser> it2 = list.iterator();
                    while (it2.hasNext()) {
                        String str5 = it2.next().uid;
                        if (str5 == null) {
                            str5 = "";
                        }
                        arrayList.add(str5);
                    }
                }
                i = 1;
                c1171530gal.LIZJ(c19egLIZIZ2, true, collectionDetail, arrayList, false, "click_bubble_add");
            }
        }
        Integer num5 = collectionDetail.type;
        if (num5 != null && num5.intValue() == i && z) {
            C1367960lha.LIZ.getClass();
            C1367960lha.LIZ().onWantToGoClick();
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LJIIIIZZ("collection_id", collectionDetail.id);
        c2344009Gk.LJIIIIZZ("enter_method", "click_bubble");
        c2344009Gk.LJIIIIZZ("collection_name", collectionDetail.name);
        if (num != null) {
            iIntValue = num.intValue();
        }
        c2344009Gk.LIZJ(iIntValue, "order");
        C20684815ws.LJIILLIIL("click_favourite_collection", c2344009Gk.LIZ);
    }
}
