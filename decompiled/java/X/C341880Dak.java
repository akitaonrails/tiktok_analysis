package X;

import androidx.lifecycle.Observer;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowItem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowListAssem;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Dak, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C341880Dak implements Observer, InterfaceC1635506an {
    public final /* synthetic */ ManageFollowListAssem LL;

    public C341880Dak(ManageFollowListAssem manageFollowListAssem) {
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
        return new C2217421BqW(1, this.LL, ManageFollowListAssem.class, "onAliasChanged", "onAliasChanged(Lcom/ss/android/ugc/ur/alias/DisplayAlias;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        ManageFollowItem manageFollowItemListGetAt;
        C1243340iSa c1243340iSa = (C1243340iSa) obj;
        ManageFollowVM manageFollowVMIp = this.LL.ip();
        List<ITEM> listListGetAll = manageFollowVMIp.listGetAll();
        if (listListGetAll != 0) {
            Iterator it2 = listListGetAll.iterator();
            int i = 0;
            while (it2.hasNext()) {
                if (Intrinsics.LJFF(((ManageFollowItem) it2.next()).simpleUser.uid, c1243340iSa.LIZ)) {
                    if (i != -1 && (manageFollowItemListGetAt = manageFollowVMIp.listGetAt(i)) != null && c1243340iSa.LIZIZ.length() != 0) {
                        manageFollowVMIp.listSetItemAt(i, ManageFollowItem.LIZ(manageFollowItemListGetAt, false, c1243340iSa.LIZIZ, false, 55));
                        return;
                    }
                    return;
                }
                i++;
            }
        }
    }
}
