package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0YfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C879730YfD implements InterfaceC889880Yva {
    public static final C879730YfD LIZ = new C879730YfD();
    public static final C2252321DDq LIZIZ = C1BNE.LIZ(null);

    public static Keva LIZJ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null || curUserId.length() == 0 || Intrinsics.LJFF(curUserId, CardStruct.IStatusCode.DEFAULT)) {
            return null;
        }
        int enumValue = C19212010Ec.LIZJ.LIZJ().getEnumValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("dm_inbox_visible_tabs_");
        sbLIZ.append(curUserId);
        sbLIZ.append('_');
        sbLIZ.append(enumValue);
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC889880Yva
    public final List<FilterTabType> LIZ() {
        String string;
        Iterable iterable;
        C05RV c05rvLIZJ = C19212010Ec.LIZJ.LIZJ();
        if (!(c05rvLIZJ != C05RV.BUSINESS_INBOX ? false : C0C64.LJIILLIIL().LJIIIZ(31744, "enable_pro_inbox_tab_list_optimization", true, false))) {
            return null;
        }
        Set setLIZ = C879710YfB.LIZ(c05rvLIZJ);
        Keva kevaLIZJ = LIZJ();
        if (kevaLIZJ != null && (string = kevaLIZJ.getString("hidden_tabs", null)) != null) {
            if (string.length() == 0) {
                C08CX c08cx = C08CX.INSTANCE;
                iterable = c08cx;
                if (c08cx != null) {
                }
            } else {
                List<String> listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(string, new String[]{","}, 0, 6);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (String str : listLJJLIIIJILLIZJL) {
                    FilterTabType.Companion.getClass();
                    FilterTabType filterTabTypeLIZ = C879720YfC.LIZ(str);
                    if (filterTabTypeLIZ != null) {
                        linkedHashSet.add(filterTabTypeLIZ);
                    }
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("tryLoadHiddenCache: cacheStr=");
                sbLIZ.append(string);
                sbLIZ.append(", parsedHiddenTabs=");
                sbLIZ.append(linkedHashSet);
                C2188811AlT.LIZIZ(sbLIZ);
                iterable = linkedHashSet;
            }
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            for (Object obj : iterable) {
                if (setLIZ.contains(obj)) {
                    linkedHashSet2.add(obj);
                }
            }
            setLIZ = linkedHashSet2;
        }
        if (setLIZ.isEmpty()) {
            return null;
        }
        List<FilterTabType> listLJIIIIZZ = C19212010Ec.LIZJ.LJIIIIZZ();
        ArrayList arrayList = new ArrayList();
        for (FilterTabType filterTabType : listLJIIIIZZ) {
            FilterTabType.Companion.getClass();
            if (!FilterTabType.NOT_DISPLAY_TAB_TYPE_SET.contains(filterTabType) && !setLIZ.contains(filterTabType)) {
                arrayList.add(filterTabType);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC889880Yva
    public final C2252321DDq LIZIZ() {
        return LIZIZ;
    }
}
