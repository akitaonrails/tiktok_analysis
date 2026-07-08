package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.notice.repo.list.bean.CategorySetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.ChannelSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.EntranceSettings;
import com.ss.android.ugc.aweme.notice.repo.list.bean.GroupUnsubscribeSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SubscribeCombineSetting;
import com.ss.android.ugc.aweme.notification.bean.UnSubscribeSettingsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C635440OwA {
    public static List<GroupUnsubscribeSetting> LIZ;
    public static EntranceSettings LIZIZ;
    public static final List<InterfaceC635450OwB> LIZJ = new ArrayList();

    public static void LIZ(GroupUnsubscribeSetting groupUnsubscribeSetting) {
        if (groupUnsubscribeSetting == null) {
            return;
        }
        if (LIZ == null) {
            LIZ = new ArrayList();
        }
        List<GroupUnsubscribeSetting> list = LIZ;
        if (list != null) {
            Iterator<GroupUnsubscribeSetting> it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                if (it2.next().group == groupUnsubscribeSetting.group) {
                    if (i != -1) {
                        List<GroupUnsubscribeSetting> list2 = LIZ;
                        if (list2 != null) {
                            ListProtector.set(list2, i, groupUnsubscribeSetting);
                            return;
                        }
                        return;
                    }
                } else {
                    i++;
                }
            }
        }
        List<GroupUnsubscribeSetting> list3 = LIZ;
        if (list3 == null) {
            return;
        }
        list3.add(groupUnsubscribeSetting);
    }

    public static void LIZIZ(int i, boolean z, Integer num) {
        boolean z2;
        CategorySetting categorySetting;
        int i2;
        GroupUnsubscribeSetting next;
        SubscribeCombineSetting subscribeCombineSetting;
        ChannelSetting channelSetting;
        List<CategorySetting> list;
        boolean z3;
        ChannelSetting channelSetting2;
        boolean z4;
        List<GroupUnsubscribeSetting> list2 = LIZ;
        if (list2 != null) {
            Iterator<GroupUnsubscribeSetting> it2 = list2.iterator();
            while (true) {
                z2 = true;
                categorySetting = null;
                i2 = 0;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.group == i) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            GroupUnsubscribeSetting groupUnsubscribeSetting = next;
            if (groupUnsubscribeSetting != null) {
                if (C635610OwR.LIZ()) {
                    if (num == null) {
                        SubscribeCombineSetting subscribeCombineSetting2 = groupUnsubscribeSetting.subscribeCombineSetting;
                        if (subscribeCombineSetting2 != null && (channelSetting2 = subscribeCombineSetting2.channelSetting) != null) {
                            if (!z) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            channelSetting2.isSubscribe = Boolean.valueOf(z4);
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("updateSubscribe Channel:");
                        sbLIZ.append(i);
                        sbLIZ.append(", isSubscribe = ");
                        if (z) {
                            z2 = false;
                        }
                        sbLIZ.append(z2);
                        C2188811AlT.LIZIZ(sbLIZ);
                    } else {
                        SubscribeCombineSetting subscribeCombineSetting3 = groupUnsubscribeSetting.subscribeCombineSetting;
                        if (subscribeCombineSetting3 != null && (list = subscribeCombineSetting3.categorySettings) != null) {
                            Iterator<CategorySetting> it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                CategorySetting next2 = it3.next();
                                if (Intrinsics.LJFF(next2.label, num)) {
                                    categorySetting = next2;
                                    break;
                                }
                            }
                            CategorySetting categorySetting2 = categorySetting;
                            if (categorySetting2 != null) {
                                if (!z) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                categorySetting2.isSubscribe = z3;
                            }
                        }
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("updateSubscribe Channel:");
                        sbLIZ2.append(i);
                        sbLIZ2.append(",Category:");
                        sbLIZ2.append(num);
                        sbLIZ2.append(", isSubscribe = ");
                        if (z) {
                            z2 = false;
                        }
                        sbLIZ2.append(z2);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        if (!z && (subscribeCombineSetting = groupUnsubscribeSetting.subscribeCombineSetting) != null && (channelSetting = subscribeCombineSetting.channelSetting) != null) {
                            channelSetting.isSubscribe = Boolean.TRUE;
                        }
                    }
                    C635700Owa.LIZ.getClass();
                    C635700Owa.LIZJ(i);
                } else {
                    List<UnSubscribeSettingsData> list3 = groupUnsubscribeSetting.unsubscribeCategoryList;
                    if (list3 != null) {
                        Iterator<UnSubscribeSettingsData> it4 = list3.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (Intrinsics.LJFF(it4.next().label, num)) {
                                    break;
                                } else {
                                    i2++;
                                }
                            } else {
                                i2 = -1;
                                break;
                            }
                        }
                        int i3 = C2187451AjH.LIZ;
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("index = ");
                        sbLIZ3.append(i2);
                        sbLIZ3.append(", size = ");
                        sbLIZ3.append(list3.size());
                        C1720106oR.LJI("SNUnsubscribeDataHelper", C2188811AlT.LIZIZ(sbLIZ3));
                        if (i2 >= 0) {
                            UnSubscribeSettingsData unSubscribeSettingsData = (UnSubscribeSettingsData) ListProtector.get(list3, i2);
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("update unsubscribe data group = ");
                            sbLIZ4.append(i);
                            sbLIZ4.append(", category = ");
                            sbLIZ4.append(num);
                            sbLIZ4.append(", isUnsubscribe = ");
                            sbLIZ4.append(z);
                            sbLIZ4.append(", oldUnsubscribe = ");
                            sbLIZ4.append(unSubscribeSettingsData.isUnsubscribe);
                            C1720106oR.LJI("SNUnsubscribeDataHelper", C2188811AlT.LIZIZ(sbLIZ4));
                            ListProtector.set(list3, i2, UnSubscribeSettingsData.LIZ(unSubscribeSettingsData, z));
                        }
                    }
                }
            }
        }
        for (InterfaceC635450OwB interfaceC635450OwB : (ArrayList) LIZJ) {
            if (num == null) {
                interfaceC635450OwB.dz0(i, z);
            } else {
                interfaceC635450OwB.Cb0(i, num.intValue(), z);
            }
        }
    }
}
