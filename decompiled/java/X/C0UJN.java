package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.BottomContainerComponent;

/* JADX INFO: renamed from: X.0UJN, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UJN {
    public static final List<Integer> LIZ = C1697810uHb.LJIIJJI(7, 23, 17, 11, 15, 14);
    public static final Map<Integer, Integer> LIZIZ = new LinkedHashMap();
    public static boolean LIZJ = true;

    public static List LIZIZ() {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, List<BottomContainerComponent>>> c20337914i1 = C0UKZ.LLILIL;
        List<BottomContainerComponent> list = c20337914i1.LIZIZ().get(strValueOf);
        if (list != null ? list.isEmpty() : true) {
            ArrayList arrayList = new ArrayList();
            BottomContainerComponent bottomContainerComponent = new BottomContainerComponent();
            bottomContainerComponent.type = 7;
            arrayList.add(bottomContainerComponent);
            BottomContainerComponent bottomContainerComponent2 = new BottomContainerComponent();
            bottomContainerComponent2.type = 23;
            arrayList.add(bottomContainerComponent2);
            BottomContainerComponent bottomContainerComponent3 = new BottomContainerComponent();
            bottomContainerComponent3.type = 17;
            arrayList.add(bottomContainerComponent3);
            BottomContainerComponent bottomContainerComponent4 = new BottomContainerComponent();
            bottomContainerComponent4.type = 11;
            arrayList.add(bottomContainerComponent4);
            BottomContainerComponent bottomContainerComponent5 = new BottomContainerComponent();
            bottomContainerComponent5.type = 15;
            arrayList.add(bottomContainerComponent5);
            return arrayList;
        }
        boolean z = LIZJ;
        boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
        List<BottomContainerComponent> list2 = c20337914i1.LIZIZ().get(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (BottomContainerComponent bottomContainerComponent6 : list2) {
            int i = bottomContainerComponent6.type;
            if (i != 11) {
                if (i != 15 || z) {
                    arrayList2.add(bottomContainerComponent6);
                }
            } else if (!zIsPrivateAccount) {
                arrayList2.add(bottomContainerComponent6);
            }
        }
        return arrayList2;
    }

    public static BottomContainerComponent LIZ(int i) {
        List listLIZIZ = LIZIZ();
        Object obj = null;
        if (listLIZIZ == null) {
            return null;
        }
        Iterator it2 = listLIZIZ.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((BottomContainerComponent) next).type == i) {
                obj = next;
                break;
            }
        }
        return (BottomContainerComponent) obj;
    }
}
