package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.profile.business.ur.following.ui.assem.IFollowingListAbility;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowListAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.SimpleUser;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AwS583S0100000_4;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dae, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C341820Dae implements Observer, InterfaceC1635506an {
    public final /* synthetic */ ManageFollowListAssem LL;

    public C341820Dae(ManageFollowListAssem manageFollowListAssem) {
        this.LL = manageFollowListAssem;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC1635506an)) {
            return Intrinsics.LJFF(getFunctionDelegate(), ((InterfaceC1635506an) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // X.InterfaceC1635506an
    public final InterfaceC1451105m9<?> getFunctionDelegate() {
        return new C2217421BqW(1, this.LL, ManageFollowListAssem.class, "onRelationChanged", "onRelationChanged(Lcom/ss/android/ugc/aweme/profile/model/FollowStatus;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        String userId;
        Object obj2;
        Object next;
        FollowStatus followStatus = (FollowStatus) obj;
        ManageFollowListAssem manageFollowListAssem = this.LL;
        manageFollowListAssem.getClass();
        Fragment fragmentLJI = C724240Sb0.LJI(manageFollowListAssem);
        if (fragmentLJI != null && !fragmentLJI.isResumed() && (userId = followStatus.getUserId()) != null && followStatus.getFollowStatus() == 0) {
            ManageFollowVM manageFollowVMIp = manageFollowListAssem.ip();
            IFollowingListAbility iFollowingListAbility = (IFollowingListAbility) manageFollowListAssem.LLJIJIL.getValue();
            List<ITEM> listListGetAll = manageFollowVMIp.listGetAll();
            if (listListGetAll != 0) {
                Iterator it2 = listListGetAll.iterator();
                while (true) {
                    obj2 = null;
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (Intrinsics.LJFF(((ManageFollowItem) next).simpleUser.uid, userId)) {
                            break;
                        }
                    } else {
                        next = null;
                        break;
                    }
                }
                ManageFollowItem manageFollowItem = (ManageFollowItem) next;
                if (manageFollowItem != null) {
                    manageFollowVMIp.listRemoveItem(manageFollowItem);
                    Set<SimpleUser> set = ((C339250DRr) manageFollowVMIp.getState()).LL.LIZ;
                    Iterator<T> it3 = set.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        Object next2 = it3.next();
                        if (Intrinsics.LJFF(((SimpleUser) next2).uid, userId)) {
                            obj2 = next2;
                            break;
                        }
                    }
                    C19719512Dh.LIZ(set).remove(obj2);
                    manageFollowVMIp.setState(new AwS583S0100000_4(set, (Set<SimpleUser>) 204));
                    if (iFollowingListAbility != null) {
                        iFollowingListAbility.ZK0(Collections.singletonList(userId));
                    }
                }
            }
        }
    }
}
