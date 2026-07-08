package X;

import com.ss.android.ugc.aweme.experiment.BottomTab;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.friendstab.service.FriendsFeedServiceImpl;
import com.ss.android.ugc.aweme.homepage.IFriendTabExpApi;
import com.ss.android.ugc.aweme.homepage.api.msadapt.IMSAdaptionService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0CXK, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXK extends C09AY implements Function0<Integer> {
    public C0CXK() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        TabConfig tabConfigLJIIJJI;
        Map<String, ArrayList<BottomTab>> map;
        TabConfig tabConfigLJIIJJI2;
        Integer num;
        int iIntValue = 0;
        if (C1585030rLh.LJIIJJI() != null && !C1585030rLh.LJIJJLI() && (tabConfigLJIIJJI = C1585030rLh.LJIIJJI()) != null && (map = tabConfigLJIIJJI.bottomTab) != null && (tabConfigLJIIJJI2 = C1585030rLh.LJIIJJI()) != null && (num = tabConfigLJIIJJI2.expectedBottomSize) != null && ((num.intValue() == 5 || num.intValue() == 6) && map.size() == num.intValue())) {
            int iIntValue2 = num.intValue();
            int i = 0;
            loop0: while (true) {
                if (i < iIntValue2) {
                    ArrayList<BottomTab> arrayList = map.get(String.valueOf(i));
                    if (arrayList != null) {
                        Iterator<BottomTab> it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            if (it2.next().bottomTabKey == null) {
                                break loop0;
                            }
                        }
                    }
                    i++;
                } else if (!C1585030rLh.LJIIZILJ()) {
                    C0CXL.LIZ.getClass();
                    IFriendTabExpApi iFriendTabExpApiLJ = FriendsFeedServiceImpl.LJ();
                    if ((iFriendTabExpApiLJ.LIZJ() || iFriendTabExpApiLJ.LIZLLL() != -1) && !C10EU.LJIIIIZZ()) {
                        IMSAdaptionService iMSAdaptionService = (IMSAdaptionService) ServiceManager.get().getService(IMSAdaptionService.class);
                        C844470XAv.LIZ.getClass();
                        if (!iMSAdaptionService.LIZJ(C844470XAv.LIZ())) {
                            iIntValue = ((Number) C0CXL.LJ.getValue()).intValue();
                        }
                    }
                }
            }
        }
        return Integer.valueOf(iIntValue);
    }
}
