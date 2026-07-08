package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.profile.ListLiveCircleItemVM;

/* JADX INFO: renamed from: X.0eOj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087190eOj {
    public static ListLiveCircleItemVM LIZ(int i, C19EG c19eg) {
        InterfaceC1087200eOk.LJJIJIIJIL.getClass();
        if (i == 1) {
            return (ListLiveCircleItemVM) ViewModelProviders.of(c19eg, new C1151690g4l(c19eg, 3)).get(ListLiveCircleItemVM.ListLiveCircleItemVMFollowing.class);
        }
        if (i == 2) {
            return (ListLiveCircleItemVM) ViewModelProviders.of(c19eg, new C1151690g4l(c19eg, 2)).get(ListLiveCircleItemVM.ListLiveCircleItemVMFollower.class);
        }
        return (ListLiveCircleItemVM) ViewModelProviders.of(c19eg, new C1151690g4l(c19eg, 1)).get(ListLiveCircleItemVM.class);
    }
}
