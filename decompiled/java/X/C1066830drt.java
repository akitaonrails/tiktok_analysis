package X;

import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0drt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066830drt {
    public static final List<InterfaceC1066840dru> LIZ = C1697810uHb.LJ(new C1058120ddq(), new C1393850mNL(), new C21273018Mu(), new C1393880mNO(), new C1058110ddp(), new C1066800drq(), new C1197110hG1());

    public static List LIZ(String str, Aweme aweme, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    AnchorCommonStruct anchorCommonStruct = (AnchorCommonStruct) obj;
                    List<InterfaceC1066840dru> list2 = LIZ;
                    ArrayList arrayList2 = new ArrayList();
                    for (InterfaceC1066840dru interfaceC1066840dru : list2) {
                        if (interfaceC1066840dru.LJFF(i, anchorCommonStruct, aweme, str)) {
                            arrayList2.add(interfaceC1066840dru);
                        }
                    }
                    InterfaceC1066840dru interfaceC1066840dru2 = (InterfaceC1066840dru) C13LP.LJJJLL(arrayList2);
                    if (interfaceC1066840dru2 != null) {
                        arrayList.add(interfaceC1066840dru2.clone());
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        return arrayList;
    }
}
