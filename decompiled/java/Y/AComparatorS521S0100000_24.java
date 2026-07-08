package Y;

import X.AbstractC1598130rgp;
import X.C1597990rgb;
import X.C1598410rhH;
import X.C1598860ri0;
import X.C20085613iQ;
import X.InterfaceC1598460rhM;
import X.InterfaceC1891350zJl;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.inbox.response.InboxLiveNotice;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.inbox.SkylightHighlightsItem;
import com.ss.android.ugc.aweme.story.inbox.StoryInboxItem;
import com.ss.android.ugc.aweme.story.inbox.ThoughtInboxItem;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes25.dex */
public class AComparatorS521S0100000_24 implements Comparator {
    public final int $t;
    public Object l0;

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return compare$0(this, obj, obj2);
            case 1:
                return compare$1(this, obj, obj2);
            default:
                return 0;
        }
    }

    public AComparatorS521S0100000_24(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final int compare$0(AComparatorS521S0100000_24 aComparatorS521S0100000_24, Object obj, Object obj2) {
        int itemPriority;
        double d;
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj2;
        ((C1598410rhH) aComparatorS521S0100000_24.l0).getClass();
        int itemPriority2 = 100000;
        if (interfaceC1891350zJl instanceof InterfaceC1598460rhM) {
            itemPriority = ((InterfaceC1598460rhM) interfaceC1891350zJl).getItemPriority(100000);
        } else {
            itemPriority = 100000;
        }
        ((C1598410rhH) aComparatorS521S0100000_24.l0).getClass();
        if (interfaceC1891350zJl2 instanceof InterfaceC1598460rhM) {
            itemPriority2 = ((InterfaceC1598460rhM) interfaceC1891350zJl2).getItemPriority(100000);
        }
        int i = itemPriority - itemPriority2;
        if (i == 0) {
            ((C1598410rhH) aComparatorS521S0100000_24.l0).getClass();
            double d2 = 100000.0d;
            if (interfaceC1891350zJl instanceof C1598860ri0) {
                d = ((C1598860ri0) interfaceC1891350zJl).LLILZ;
            } else {
                d = 100000.0d;
            }
            ((C1598410rhH) aComparatorS521S0100000_24.l0).getClass();
            if (interfaceC1891350zJl2 instanceof C1598860ri0) {
                d2 = ((C1598860ri0) interfaceC1891350zJl2).LLILZ;
            }
            double d3 = d - d2;
            if (d3 == 0.0d) {
                return 0;
            }
            if (d3 > 0.0d) {
                return 1;
            }
            return -1;
        }
        return i;
    }

    public static final int compare$1(AComparatorS521S0100000_24 aComparatorS521S0100000_24, Object obj, Object obj2) {
        int iIndexOf;
        String uid;
        User user;
        String uid2;
        User user2;
        InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) obj;
        int iIndexOf2 = Integer.MAX_VALUE;
        Object obj3 = "";
        if (interfaceC1891350zJl instanceof StoryInboxItem) {
            Object obj4 = ((LinkedHashMap) ((C1597990rgb) aComparatorS521S0100000_24.l0).LJII).get(AwemeExtKt.getAuthorUid(((StoryInboxItem) interfaceC1891350zJl).getStoryCollection()));
            if (obj4 == null) {
                obj4 = "";
            }
            iIndexOf = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj4);
        } else if (interfaceC1891350zJl instanceof AbstractC1598130rgp) {
            Map<String, String> map = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIIIZZ;
            InboxLiveNotice inboxLiveNoticeLIZIZ = ((AbstractC1598130rgp) interfaceC1891350zJl).LIZIZ();
            if (inboxLiveNoticeLIZIZ == null || (user = inboxLiveNoticeLIZIZ.user) == null || (uid = user.getUid()) == null) {
                uid = "";
            }
            Object obj5 = ((LinkedHashMap) map).get(uid);
            if (obj5 == null) {
                obj5 = "";
            }
            iIndexOf = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj5);
        } else if (interfaceC1891350zJl instanceof SkylightHighlightsItem) {
            Object obj6 = ((LinkedHashMap) ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIIZ).get(AwemeExtKt.getAuthorUid(((SkylightHighlightsItem) interfaceC1891350zJl).getHighlightCollection()));
            if (obj6 == null) {
                obj6 = "";
            }
            iIndexOf = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj6);
        } else if (interfaceC1891350zJl instanceof ThoughtInboxItem) {
            Map<String, String> map2 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIILJJIL;
            String uid3 = ((ThoughtInboxItem) interfaceC1891350zJl).getThoughtUser().getUid();
            if (uid3 == null) {
                uid3 = "";
            }
            Object obj7 = ((LinkedHashMap) map2).get(uid3);
            if (obj7 == null) {
                obj7 = "";
            }
            iIndexOf = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj7);
        } else {
            iIndexOf = Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(iIndexOf);
        InterfaceC1891350zJl interfaceC1891350zJl2 = (InterfaceC1891350zJl) obj2;
        if (interfaceC1891350zJl2 instanceof StoryInboxItem) {
            Object obj8 = ((LinkedHashMap) ((C1597990rgb) aComparatorS521S0100000_24.l0).LJII).get(AwemeExtKt.getAuthorUid(((StoryInboxItem) interfaceC1891350zJl2).getStoryCollection()));
            if (obj8 != null) {
                obj3 = obj8;
            }
            iIndexOf2 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj3);
        } else if (interfaceC1891350zJl2 instanceof AbstractC1598130rgp) {
            Map<String, String> map3 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIIIZZ;
            InboxLiveNotice inboxLiveNoticeLIZIZ2 = ((AbstractC1598130rgp) interfaceC1891350zJl2).LIZIZ();
            if (inboxLiveNoticeLIZIZ2 == null || (user2 = inboxLiveNoticeLIZIZ2.user) == null || (uid2 = user2.getUid()) == null) {
                uid2 = "";
            }
            Object obj9 = ((LinkedHashMap) map3).get(uid2);
            if (obj9 != null) {
                obj3 = obj9;
            }
            iIndexOf2 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj3);
        } else if (interfaceC1891350zJl2 instanceof SkylightHighlightsItem) {
            Object obj10 = ((LinkedHashMap) ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIIZ).get(AwemeExtKt.getAuthorUid(((SkylightHighlightsItem) interfaceC1891350zJl2).getHighlightCollection()));
            if (obj10 != null) {
                obj3 = obj10;
            }
            iIndexOf2 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj3);
        } else if (interfaceC1891350zJl2 instanceof ThoughtInboxItem) {
            Map<String, String> map4 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIILJJIL;
            String uid4 = ((ThoughtInboxItem) interfaceC1891350zJl2).getThoughtUser().getUid();
            if (uid4 == null) {
                uid4 = "";
            }
            Object obj11 = ((LinkedHashMap) map4).get(uid4);
            if (obj11 != null) {
                obj3 = obj11;
            }
            iIndexOf2 = ((C1597990rgb) aComparatorS521S0100000_24.l0).LJIIJJI.indexOf(obj3);
        }
        return C20085613iQ.LIZIZ(numValueOf, Integer.valueOf(iIndexOf2));
    }
}
