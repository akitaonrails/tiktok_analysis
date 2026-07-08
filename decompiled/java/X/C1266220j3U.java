package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.profile.business.profile.tab.AwemeListFragmentImpl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0j3U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266220j3U implements InterfaceC1478005qU {
    public final int $t;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ c09aj) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, c09aj);
                break;
            case 1:
                subscribe$1(this, c09aj);
                break;
            case 2:
                subscribe$2(this, c09aj);
                break;
            case 3:
                subscribe$3(this, c09aj);
                break;
            case 4:
                subscribe$4(this, c09aj);
                break;
        }
    }

    public static final void subscribe$0(C1266220j3U c1266220j3U, C09AJ c09aj) {
        AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) c1266220j3U.l1;
        FeedItemList feedItemList = (FeedItemList) c1266220j3U.l2;
        String str = c1266220j3U.s0;
        awemeListFragmentImpl.getClass();
        C1C7U.LIZ("AwemeListFragmentImpl@a373.onUserStoryDeleted$1L");
        ((C1255780ime) awemeListFragmentImpl.LLJJJJJIL.LL).LJIILJJIL(feedItemList, str);
        C1C7U.LIZIZ("AwemeListFragmentImpl@a373.onUserStoryDeleted$1L");
    }

    public static final void subscribe$1(C1266220j3U c1266220j3U, C09AJ c09aj) {
        C1C7U.LIZ("AvatarPreloadUtil@8581.startPreload$asyncTask$1");
        for (Object obj : (List) c1266220j3U.l1) {
            if (c09aj.isDisposed()) {
                break;
            }
            ((C118300cf) c1266220j3U.l2).element++;
            if (obj instanceof C1265420j2C) {
                C1265420j2C c1265420j2C = (C1265420j2C) obj;
                UrlModel avatarThumb = c1265420j2C.LLILLJJLI.getAvatarThumb();
                if (avatarThumb != null || (avatarThumb = c1265420j2C.LLILLJJLI.getAvatarMedium()) != null) {
                    List<String> urlList = avatarThumb.getUrlList();
                    if (urlList != null) {
                        C1331660kl2.LJIIJ(new C03IT(urlList)).LJJIII();
                    }
                }
            }
        }
        C1264480j0g c1264480j0g = C1264480j0g.LIZ;
        String str = c1266220j3U.s0;
        int i = ((C118300cf) c1266220j3U.l2).element;
        int size = ((List) c1266220j3U.l1).size();
        c1264480j0g.getClass();
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_from", str);
        c2344009Gk.LIZJ(i, "preload_size");
        c2344009Gk.LIZJ(size, "total_size");
        C20684815ws.LJIILLIIL("avatar_preload", c2344009Gk.LIZ);
        C1C7U.LIZIZ("AvatarPreloadUtil@8581.startPreload$asyncTask$1");
    }

    public static final void subscribe$2(C1266220j3U c1266220j3U, C09AJ c09aj) {
        FeedItemList feedItemListLJIILL;
        C1255780ime c1255780ime = (C1255780ime) c1266220j3U.l1;
        String str = c1266220j3U.s0;
        Aweme aweme = (Aweme) c1266220j3U.l2;
        c1255780ime.getClass();
        if (C1ELC.LIZIZ()) {
            Object obj = C1253720ijK.LIZ;
            feedItemListLJIILL = C1255730imZ.LIZIZ(str);
        } else {
            feedItemListLJIILL = c1255780ime.LJIILL(str);
        }
        if (feedItemListLJIILL != null && feedItemListLJIILL.getItems() != null) {
            C729980SkG.LIZIZ(feedItemListLJIILL.getItems(), aweme, null);
            c1255780ime.LJIILJJIL(feedItemListLJIILL, str);
        }
    }

    public static final void subscribe$3(C1266220j3U c1266220j3U, C09AJ c09aj) {
        FeedItemList feedItemListLJIILL;
        C1255780ime c1255780ime = (C1255780ime) c1266220j3U.l1;
        String str = c1266220j3U.s0;
        Collection collection = (Collection) c1266220j3U.l2;
        c1255780ime.getClass();
        if (C1ELC.LIZIZ()) {
            Object obj = C1253720ijK.LIZ;
            feedItemListLJIILL = C1255730imZ.LIZIZ(str);
        } else {
            feedItemListLJIILL = c1255780ime.LJIILL(str);
        }
        if (feedItemListLJIILL != null && feedItemListLJIILL.getItems() != null) {
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                C729980SkG.LIZIZ(feedItemListLJIILL.getItems(), (Aweme) it2.next(), null);
            }
            c1255780ime.LJIILJJIL(feedItemListLJIILL, str);
        }
    }

    public static final void subscribe$4(C1266220j3U c1266220j3U, C09AJ c09aj) {
        FeedItemList feedItemListLJIILL;
        C1255780ime c1255780ime = (C1255780ime) c1266220j3U.l1;
        String str = c1266220j3U.s0;
        Aweme aweme = (Aweme) c1266220j3U.l2;
        c1255780ime.getClass();
        if (C1ELC.LIZIZ()) {
            Object obj = C1253720ijK.LIZ;
            feedItemListLJIILL = C1255730imZ.LIZIZ(str);
        } else {
            feedItemListLJIILL = c1255780ime.LJIILL(str);
        }
        if (feedItemListLJIILL == null) {
            feedItemListLJIILL = new FeedItemList();
        }
        if (feedItemListLJIILL.getItems() == null) {
            feedItemListLJIILL.setItems(new ArrayList(1));
        }
        feedItemListLJIILL.dataUserId = str;
        ListProtector.add(feedItemListLJIILL.getItems(), 0, aweme);
        c1255780ime.LJIILJJIL(feedItemListLJIILL, str);
    }

    public C1266220j3U(Object obj, Object obj2, String str, int i) {
        this.$t = i;
        this.l1 = obj;
        this.l2 = obj2;
        this.s0 = str;
    }
}
