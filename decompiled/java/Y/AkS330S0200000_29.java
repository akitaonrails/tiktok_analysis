package Y;

import X.C1265190j1p;
import X.C1265420j2C;
import X.C15438062q;
import X.C993750by1;
import X.EnumC1247010iYV;
import X.InterfaceC1253830ijV;
import X.InterfaceC1487280oo2;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.live.ILiveOuterService;
import com.ss.android.ugc.aweme.notice.api.ab.AddOptionForGuidanceExp;
import com.ss.android.ugc.aweme.profile.model.FollowingItemList;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.NotificationChoiceState;
import com.ss.android.ugc.profile.business.live.notificationlive.ui.PushSettingNotificationChoiceViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationSettingsViewModel;
import com.ss.android.ugc.profile.business.live.notificationpost.PostNotificationStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS115S0110000_29;

/* JADX INFO: loaded from: classes30.dex */
public class AkS330S0200000_29 implements InterfaceC1487280oo2 {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC1487280oo2
    public final Object apply(Object obj) {
        switch (this.$t) {
            case 0:
                return apply$0(this, obj);
            case 1:
                return apply$1(this, obj);
            case 2:
                return apply$2(this, obj);
            case 3:
                return apply$3(this, obj);
            default:
                return null;
        }
    }

    public static final Object apply$0(AkS330S0200000_29 akS330S0200000_29, Object obj) {
        int i;
        int size;
        int i2;
        FollowingItemList followingItemList = (FollowingItemList) obj;
        PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) akS330S0200000_29.l0;
        pushSettingNotificationChoiceViewModel.getClass();
        if (followingItemList != null) {
            pushSettingNotificationChoiceViewModel.setState(new AwS115S0110000_29(followingItemList, true, 9));
        }
        ((PushSettingNotificationChoiceViewModel) akS330S0200000_29.l0).hR2(followingItemList);
        boolean z = followingItemList.hasMore;
        int i3 = followingItemList.offset;
        long j = followingItemList.minTime;
        boolean z2 = followingItemList.recommendHasMore;
        if (((PushSettingNotificationChoiceViewModel) akS330S0200000_29.l0).LLILZLL) {
            i = 1;
        } else {
            i = ((C1265190j1p) ((NotificationChoiceState) akS330S0200000_29.l1).getListState().getPayload()).LJ + 1;
        }
        List<User> list = followingItemList.items;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C1265190j1p c1265190j1p = new C1265190j1p(z, i3, j, z2, i, size, false, 192);
        List<User> list2 = followingItemList.items;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<User> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1265420j2C(0, it2.next(), (String) null, (EnumC1247010iYV) null, 28));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        ListProtector.add(arrayList2, 0, new C993750by1(18, 2));
        InterfaceC1253830ijV interfaceC1253830ijVLJJL = ((ILiveOuterService) ServiceManager.get().getService(ILiveOuterService.class)).k4().LJJL();
        if (interfaceC1253830ijVLJJL.LIZIZ()) {
            ListProtector.add(arrayList2, 1, new C993750by1(19, 2));
            i2 = 2;
        } else {
            i2 = 1;
        }
        if (interfaceC1253830ijVLJJL.LIZJ()) {
            ListProtector.add(arrayList2, i2, new C993750by1(21, 2));
            i2++;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("show_sub_only_space_push_setting", false)) {
            ListProtector.add(arrayList2, i2, new C993750by1(22, 2));
            i2++;
        }
        int i4 = i2 + 1;
        ListProtector.add(arrayList2, i2, new C993750by1(23, 2));
        if (interfaceC1253830ijVLJJL.LJIIJ()) {
            ListProtector.add(arrayList2, i4, new C993750by1(24, 2));
            i4++;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("live_enable_background_push", false)) {
            ListProtector.add(arrayList2, i4, new C993750by1(60, 2));
            i4++;
        }
        if (true ^ arrayList2.isEmpty()) {
            ListProtector.add(arrayList2, i4, new C993750by1(17, 2));
        }
        return new Pair(arrayList2, c1265190j1p);
    }

    public static final Object apply$1(AkS330S0200000_29 akS330S0200000_29, Object obj) {
        int i;
        FollowingItemList followingItemList = (FollowingItemList) obj;
        ((PushSettingNotificationChoiceViewModel) akS330S0200000_29.l0).hR2(followingItemList);
        PushSettingNotificationChoiceViewModel pushSettingNotificationChoiceViewModel = (PushSettingNotificationChoiceViewModel) akS330S0200000_29.l0;
        pushSettingNotificationChoiceViewModel.getClass();
        int size = 0;
        if (followingItemList != null) {
            pushSettingNotificationChoiceViewModel.setState(new AwS115S0110000_29(followingItemList, false, 9));
        }
        List<User> list = followingItemList.items;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<User> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1265420j2C(0, it2.next(), (String) null, (EnumC1247010iYV) null, 28));
        }
        boolean z = followingItemList.hasMore;
        int i2 = followingItemList.offset;
        long j = followingItemList.minTime;
        boolean z2 = followingItemList.recommendHasMore;
        if (((PushSettingNotificationChoiceViewModel) akS330S0200000_29.l0).LLILZLL) {
            i = 1;
        } else {
            i = ((C1265190j1p) ((NotificationChoiceState) akS330S0200000_29.l1).getListState().getPayload()).LJ + 1;
        }
        List<User> list2 = followingItemList.items;
        if (list2 != null) {
            size = list2.size();
        }
        return new Pair(arrayList, new C1265190j1p(z, i2, j, z2, i, size, false, 192));
    }

    public static final Object apply$2(AkS330S0200000_29 akS330S0200000_29, Object obj) {
        int size;
        FollowingItemList followingItemList = (FollowingItemList) obj;
        PostNotificationSettingsViewModel postNotificationSettingsViewModel = (PostNotificationSettingsViewModel) akS330S0200000_29.l0;
        postNotificationSettingsViewModel.getClass();
        int i = 1;
        if (followingItemList != null) {
            postNotificationSettingsViewModel.setState(new AwS115S0110000_29(followingItemList, true, 10));
        }
        ((PostNotificationSettingsViewModel) akS330S0200000_29.l0).hR2(followingItemList);
        boolean z = followingItemList.hasMore;
        int i2 = followingItemList.offset;
        long j = followingItemList.minTime;
        boolean z2 = followingItemList.recommendHasMore;
        if (!((PostNotificationSettingsViewModel) akS330S0200000_29.l0).LLILZLL) {
            i = 1 + ((C1265190j1p) ((PostNotificationStatus) akS330S0200000_29.l1).getListState().getPayload()).LJ;
        }
        List<User> list = followingItemList.items;
        if (list != null) {
            size = list.size();
        } else {
            size = 0;
        }
        C1265190j1p c1265190j1p = new C1265190j1p(z, i2, j, z2, i, size, false, 192);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C993750by1(18, 2));
        arrayList.add(new C993750by1(17, 2));
        if (AddOptionForGuidanceExp.LJFF) {
            arrayList.add(new C993750by1(20, 2));
        }
        List<User> list2 = followingItemList.items;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<User> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Boolean.valueOf(arrayList.add(new C1265420j2C(0, it2.next(), (String) null, (EnumC1247010iYV) null, 28))));
        }
        return new Pair(arrayList, c1265190j1p);
    }

    public static final Object apply$3(AkS330S0200000_29 akS330S0200000_29, Object obj) {
        int i;
        FollowingItemList followingItemList = (FollowingItemList) obj;
        ((PostNotificationSettingsViewModel) akS330S0200000_29.l0).hR2(followingItemList);
        PostNotificationSettingsViewModel postNotificationSettingsViewModel = (PostNotificationSettingsViewModel) akS330S0200000_29.l0;
        postNotificationSettingsViewModel.getClass();
        int size = 0;
        if (followingItemList != null) {
            postNotificationSettingsViewModel.setState(new AwS115S0110000_29(followingItemList, false, 10));
        }
        List<User> list = followingItemList.items;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<User> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(new C1265420j2C(0, it2.next(), (String) null, (EnumC1247010iYV) null, 28));
        }
        boolean z = followingItemList.hasMore;
        int i2 = followingItemList.offset;
        long j = followingItemList.minTime;
        boolean z2 = followingItemList.recommendHasMore;
        if (((PostNotificationSettingsViewModel) akS330S0200000_29.l0).LLILZLL) {
            i = 1;
        } else {
            i = ((C1265190j1p) ((PostNotificationStatus) akS330S0200000_29.l1).getListState().getPayload()).LJ + 1;
        }
        List<User> list2 = followingItemList.items;
        if (list2 != null) {
            size = list2.size();
        }
        return new Pair(arrayList, new C1265190j1p(z, i2, j, z2, i, size, false, 192));
    }

    public AkS330S0200000_29(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
