package X;

import com.bytedance.android.livesdk.drawerfeed.tab.DrawerTabsItem;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingCustomSetting;
import com.bytedance.android.livesdk.setting.LiveDrawerTabLandingSupportTypeSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ian, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C469310Ian {
    public String LIZ;
    public Long LIZIZ;
    public final Map<String, Boolean> LIZJ = new LinkedHashMap();
    public List<DrawerTabsItem> LIZLLL;

    public final boolean LIZ(String str, List list) {
        if (str == null || str.length() == 0) {
            return false;
        }
        if (Intrinsics.LJFF(this.LIZLLL, list)) {
            if (this.LIZJ.containsKey(str)) {
                Boolean bool = (Boolean) ((LinkedHashMap) this.LIZJ).get(str);
                if (bool == null) {
                    return false;
                }
                return bool.booleanValue();
            }
        } else {
            this.LIZLLL = list;
            ((LinkedHashMap) this.LIZJ).clear();
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(str, ((DrawerTabsItem) it2.next()).tabType)) {
                this.LIZJ.put(str, Boolean.TRUE);
                return true;
            }
        }
        this.LIZJ.put(str, Boolean.FALSE);
        return false;
    }

    public final boolean LIZIZ(List list, boolean z, boolean z2) {
        String str;
        Long lValueOf;
        boolean zLJFF;
        if (LiveDrawerTabLandingCustomSetting.INSTANCE.getValue() && (z2 || z)) {
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            Long lValueOf2 = null;
            if (room != null) {
                str = room.drawerTabPosition;
            } else {
                str = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("enableLandingTab: roomId=");
            if (room != null) {
                lValueOf = Long.valueOf(room.getId());
            } else {
                lValueOf = null;
            }
            sbLIZ.append(lValueOf);
            sbLIZ.append(", lastTabLandingRoom=");
            sbLIZ.append(this.LIZIZ);
            sbLIZ.append(", newDrawerTabPosition=");
            sbLIZ.append(str);
            sbLIZ.append(", lastRoomDrawerTabPosition=");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(", currentTabType=");
            C467800IWc c467800IWc = C467800IWc.LJIJ;
            sbLIZ.append(c467800IWc.LJIIIIZZ);
            C2188811AlT.LIZIZ(sbLIZ);
            Long l = this.LIZIZ;
            if (room != null) {
                lValueOf2 = Long.valueOf(room.getId());
            }
            if (Intrinsics.LJFF(l, lValueOf2)) {
                return false;
            }
            if (LiveDrawerTabLandingSupportTypeSetting.contains(str) && LIZ(str, list)) {
                zLJFF = Intrinsics.LJFF(str, c467800IWc.LJIIIIZZ);
            } else {
                if (LiveDrawerTabLandingSupportTypeSetting.contains(this.LIZ)) {
                    return true;
                }
                ArrayList arrayList = (ArrayList) list;
                if (!arrayList.isEmpty()) {
                    zLJFF = Intrinsics.LJFF(((DrawerTabsItem) ListProtector.get(arrayList, 0)).tabType, c467800IWc.LJIIIIZZ);
                }
            }
            return !zLJFF;
        }
        return false;
    }
}
