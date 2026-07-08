package X;

import com.ss.android.ugc.aweme.feed.model.FcpSlotConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.02rv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C722502rv {
    public static final List<C722602rw> LIZ(List<FcpSlotConfig> list) {
        Set setLLIIJI;
        Set setLLIIJI2;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (FcpSlotConfig fcpSlotConfig : (ArrayList) list) {
            String str = fcpSlotConfig.slotId;
            if (str == null) {
                str = "";
            }
            List<String> list2 = fcpSlotConfig.whitelistComponentKeys;
            if (list2 == null || (setLLIIJI = C13LP.LLIIJI(list2)) == null) {
                setLLIIJI = C08CX.INSTANCE;
            }
            List<String> list3 = fcpSlotConfig.blacklistComponentKeys;
            if (list3 == null || (setLLIIJI2 = C13LP.LLIIJI(list3)) == null) {
                setLLIIJI2 = C08CX.INSTANCE;
            }
            arrayList.add(new C722602rw(setLLIIJI, setLLIIJI2, str));
        }
        return arrayList;
    }
}
