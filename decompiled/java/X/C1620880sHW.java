package X;

import com.ss.android.ugc.aweme.base.ui.assem.FeedSkylightListAssem;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0sHW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1620880sHW implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC586170Myt
    public final void onAccountResult(int i, boolean z, int i2, User user) {
        switch (this.$t) {
            case 0:
                onAccountResult$0(this, i, z, i2, user);
                break;
            case 1:
                onAccountResult$1(this, i, z, i2, user);
                break;
            case 2:
                onAccountResult$2(this, i, z, i2, user);
                break;
            case 3:
                onAccountResult$3(this, i, z, i2, user);
                break;
        }
    }

    public C1620880sHW(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C1620880sHW c1620880sHW, int i, boolean z, int i2, User user) {
        if (i != 2 && i != 3) {
            return;
        }
        C1596130rdb c1596130rdb = C1596130rdb.LIZ;
        Integer numValueOf = Integer.valueOf(((FeedSkylightListAssem) c1620880sHW.l0).ap());
        c1596130rdb.getClass();
        C1596130rdb.LIZLLL().put(numValueOf, new C1596120rda(0));
    }

    public static final void onAccountResult$1(C1620880sHW c1620880sHW, int i, boolean z, int i2, User user) {
        ((InterfaceC1573880r3i) c1620880sHW.l0).LLLLLLL(i, z);
    }

    public static final void onAccountResult$2(C1620880sHW c1620880sHW, int i, boolean z, int i2, User user) {
        ((C1588700rRc) c1620880sHW.l0).getClass();
        if (z) {
            C1588700rRc.LIZJ = null;
        }
    }

    public static final void onAccountResult$3(C1620880sHW c1620880sHW, int i, boolean z, int i2, User user) {
        if (z && i == 1) {
            ((C1618830sED) c1620880sHW.l0).LJJIII();
        }
    }
}
