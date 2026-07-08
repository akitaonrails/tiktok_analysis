package X;

import com.ss.android.ugc.aweme.cubes.GoogleCubesService;
import com.ss.android.ugc.aweme.profile.model.User;

/* JADX INFO: renamed from: X.0Xfx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854710Xfx implements InterfaceC586170Myt {
    public final int $t;
    public Object l0;

    public static final /* synthetic */ void onAccountResult$1(C854710Xfx c854710Xfx, int i, boolean z, int i2, User user) {
        ((InterfaceC1631630sYr) c854710Xfx.l0).invoke(Integer.valueOf(i), Boolean.valueOf(z), 0, user);
    }

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
        }
    }

    public C854710Xfx(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onAccountResult$0(C854710Xfx c854710Xfx, int i, boolean z, int i2, User user) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onLogin(");
        sbLIZ.append(z);
        sbLIZ.append(", ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(user);
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        if (z) {
            if (i != 1) {
                if (i == 3) {
                    C811110Vrp.LIZ.getClass();
                    C811110Vrp.LIZ();
                    return;
                }
                return;
            }
            ((GoogleCubesService) c854710Xfx.l0).LIZJ(EnumC1483805rQ.UPDATE_BY_LOGIN, true);
        }
    }

    public static final void onAccountResult$2(C854710Xfx c854710Xfx, int i, boolean z, int i2, User user) {
        Runnable runnable = (Runnable) c854710Xfx.l0;
        if (runnable != null) {
            runnable.run();
        }
    }
}
