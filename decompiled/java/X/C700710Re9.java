package X;

import com.ss.android.ugc.aweme.feed.model.GlobalComponentData;
import com.ss.android.ugc.feed.platform.componentmanager.data.FeedComponentPriorityData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Re9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public /* synthetic */ class C700710Re9 extends C2217421BqW implements InterfaceC1631630sYr<C700720ReA, C700760ReE, List<? extends String>, List<? extends String>, List<String>> {
    public static final C700710Re9 LL = new C700710Re9();

    public C700710Re9() {
        super(4, C700690Re7.class, "calculateStandardizedForMN2Area", "calculateStandardizedForMN2Area(Lcom/ss/android/ugc/feed/platform/cell/interact/next/standardized/store/StandardizeStoreContext;Lcom/ss/android/ugc/feed/platform/componentmanager/FcpPolicyRule;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", 1);
    }

    @Override // X.InterfaceC1631630sYr
    public final List<String> invoke(C700720ReA c700720ReA, C700760ReE c700760ReE, List<? extends String> list, List<? extends String> list2) {
        String str;
        Map<String, GlobalComponentData> mapLJ;
        C700720ReA c700720ReA2 = c700720ReA;
        C700760ReE c700760ReE2 = c700760ReE;
        List<? extends String> list3 = list;
        List<? extends String> list4 = list2;
        Map<String, InterfaceC1631630sYr<C700720ReA, C700760ReE, List<String>, List<String>, List<String>>> map = C700690Re7.LIZ;
        if (c700760ReE2 != null) {
            str = c700760ReE2.LIZ;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "m_n_area")) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        int i = c700760ReE2.LIZJ;
        FeedComponentPriorityData feedComponentPriorityDataInvoke = c700720ReA2.LJ.invoke();
        if (feedComponentPriorityDataInvoke == null || (mapLJ = feedComponentPriorityDataInvoke.globalComponentMap) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        if (i == 0) {
            arrayList.addAll(list4);
            ArrayList arrayList2 = new ArrayList();
            for (String str2 : list3) {
                if (!arrayList.contains(str2)) {
                    arrayList2.add(str2);
                }
            }
            arrayList.addAll(arrayList2);
            return arrayList;
        }
        for (String str3 : list4) {
            if (i > 0 && list3.contains(str3)) {
                arrayList.add(str3);
                i--;
            }
        }
        for (String str4 : list3) {
            if (!arrayList.contains(str4)) {
                if (i > 0) {
                    arrayList.add(str4);
                    i--;
                } else {
                    GlobalComponentData globalComponentData = mapLJ.get(str4);
                    if (globalComponentData != null && globalComponentData.getShowStrategy() == 2 && c700760ReE2.LIZLLL == 1) {
                        arrayList.add(str4);
                    }
                }
            }
        }
        return arrayList;
    }
}
