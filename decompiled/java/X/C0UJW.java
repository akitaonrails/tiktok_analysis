package X;

import com.bytedance.android.livesdk.livesetting.broadcast.AnchorPreviewNoPermissionOptABSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.host.IHostAction;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.BottomContainerComponent;

/* JADX INFO: renamed from: X.0UJW, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0UJW {
    public static boolean LIZ = true;
    public static boolean LIZIZ = true;
    public static final List<Integer> LIZJ = C1697810uHb.LJIIJJI(4, 5, 6, 7, 8, 11, 10, 12, 14, 15, 16, 17, 18, 19, 20, 21, 22, 24, 26, 27, 28, 29);
    public static int LIZLLL = C0UON.LIZ();
    public static final Map<Integer, Integer> LJ;
    public static final Map<Integer, Integer> LJFF;
    public static boolean LJI;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(4, Integer.valueOf(R.raw.icon_camera_flip_camera));
        linkedHashMap.put(5, Integer.valueOf(R.raw.icon_live_enhance));
        linkedHashMap.put(6, Integer.valueOf(R.raw.icon_color_effect));
        linkedHashMap.put(7, Integer.valueOf(R.raw.icon_gear));
        linkedHashMap.put(11, Integer.valueOf(R.raw.icon_arrow_turn_up_right));
        linkedHashMap.put(10, Integer.valueOf(R.raw.icon_live_interaction));
        linkedHashMap.put(14, Integer.valueOf(R.raw.icon_star_ring));
        Integer numValueOf = Integer.valueOf(R.raw.icon_noticeboard);
        linkedHashMap.put(16, numValueOf);
        linkedHashMap.put(17, Integer.valueOf(R.raw.icon_horizontal_rectangles_ltr));
        linkedHashMap.put(18, Integer.valueOf(R.raw.icon_open_book_sparkle));
        linkedHashMap.put(19, Integer.valueOf(R.raw.icon_live_viewer_wishes));
        Integer numValueOf2 = Integer.valueOf(R.raw.icon_bubble_arrow);
        linkedHashMap.put(20, numValueOf2);
        linkedHashMap.put(20, numValueOf2);
        linkedHashMap.put(23, Integer.valueOf(R.raw.icon_heart_split));
        linkedHashMap.put(26, Integer.valueOf(R.raw.icon_shopping_live_giveaway));
        linkedHashMap.put(27, numValueOf);
        linkedHashMap.put(28, Integer.valueOf(R.raw.icon_coupon_label));
        linkedHashMap.put(29, Integer.valueOf(R.raw.icon_misc));
        LJ = linkedHashMap;
        LJFF = new LinkedHashMap();
        LJI = true;
    }

    public static List LIZIZ() {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, List<BottomContainerComponent>>> c20337914i1 = C0UKZ.LLILII;
        List<BottomContainerComponent> list = c20337914i1.LIZIZ().get(strValueOf);
        if (list == null || list.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            BottomContainerComponent bottomContainerComponent = new BottomContainerComponent();
            bottomContainerComponent.type = 4;
            arrayList.add(bottomContainerComponent);
            BottomContainerComponent bottomContainerComponent2 = new BottomContainerComponent();
            bottomContainerComponent2.type = 5;
            arrayList.add(bottomContainerComponent2);
            BottomContainerComponent bottomContainerComponent3 = new BottomContainerComponent();
            bottomContainerComponent3.type = 6;
            arrayList.add(bottomContainerComponent3);
            if (!AnchorPreviewNoPermissionOptABSetting.INSTANCE.enable() || LIZLLL != 3) {
                BottomContainerComponent bottomContainerComponent4 = new BottomContainerComponent();
                bottomContainerComponent4.type = 7;
                arrayList.add(bottomContainerComponent4);
            }
            return arrayList;
        }
        boolean z = LJI;
        boolean zIsPrivateAccount = ((IHostAction) C1161920gLG.LIZJ(IHostAction.class)).isPrivateAccount();
        List<BottomContainerComponent> list2 = c20337914i1.LIZIZ().get(String.valueOf(UserService.getInstance().user().getCurrentUserId()));
        if (list2 == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        for (BottomContainerComponent bottomContainerComponent5 : list2) {
            int i = bottomContainerComponent5.type;
            if (i != 11) {
                if (i != 15 || z) {
                    arrayList2.add(bottomContainerComponent5);
                }
            } else if (!zIsPrivateAccount) {
                arrayList2.add(bottomContainerComponent5);
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

    public static String LIZJ(int i) {
        BottomContainerComponent bottomContainerComponentLIZ = LIZ(i);
        if (bottomContainerComponentLIZ != null) {
            return bottomContainerComponentLIZ.iconUrl;
        }
        return null;
    }

    public static String LIZLLL(int i) {
        BottomContainerComponent bottomContainerComponentLIZ = LIZ(i);
        if (bottomContainerComponentLIZ != null) {
            return bottomContainerComponentLIZ.name;
        }
        return null;
    }

    public static void LJ(List list) {
        String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
        C20337914i1<Map<String, List<BottomContainerComponent>>> c20337914i1 = C0UKZ.LLILII;
        Map<String, List<BottomContainerComponent>> mapLIZIZ = c20337914i1.LIZIZ();
        mapLIZIZ.put(strValueOf, list);
        c20337914i1.LJFF(mapLIZIZ);
    }

    public static void LJFF(List list) {
        LIZ = true;
        LIZIZ = true;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                int i = ((BottomContainerComponent) it2.next()).type;
                if (i == 16) {
                    LIZ = false;
                } else if (i == 14) {
                    LIZIZ = false;
                }
            }
        }
    }
}
