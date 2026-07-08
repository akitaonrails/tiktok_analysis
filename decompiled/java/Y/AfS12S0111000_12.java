package Y;

import X.C09JN;
import X.C0IJT;
import X.C1C7U;
import X.C474500IjA;
import X.C500260Jjc;
import X.C751350Tdd;
import com.bytedance.android.livesdk.model.UserAttr;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragment;
import com.bytedance.android.livesdk.moderator.ModeratorPermissionEditFragmentSheet;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes13.dex */
public class AfS12S0111000_12 implements C09JN {
    public final int $t;
    public int i2;
    public Object l0;
    public boolean z1;

    @Override // X.C09JN
    public final void accept(Object obj) {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS12S0111000_12 afS12S0111000_12, Object obj) {
        UserAttr userAttr;
        Map<Integer, Integer> map;
        C1C7U.LIZ("ModeratorPermissionEditFragment@751f.updatePermission$1");
        ModeratorPermissionEditFragment moderatorPermissionEditFragment = (ModeratorPermissionEditFragment) afS12S0111000_12.l0;
        Pair pair = new Pair(Integer.valueOf(afS12S0111000_12.i2), Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(afS12S0111000_12.z1)) ? 1 : 0));
        if (!moderatorPermissionEditFragment.LLJILJIL && (userAttr = (UserAttr) moderatorPermissionEditFragment.LLJJIJIIJIL.getValue()) != null && (map = userAttr.adminPermissions) != null) {
            map.put((Integer) pair.getFirst(), (Integer) pair.getSecond());
        }
        ((ModeratorPermissionEditFragment) afS12S0111000_12.l0).WR(afS12S0111000_12.i2, afS12S0111000_12.z1, true);
        C1C7U.LIZIZ("ModeratorPermissionEditFragment@751f.updatePermission$1");
    }

    public static final void accept$1(AfS12S0111000_12 afS12S0111000_12, Object obj) {
        String str;
        UserAttr userAttr;
        Map<Integer, Integer> map;
        C1C7U.LIZ("ModeratorPermissionEditFragmentSheet@bb7d.updatePermission$1");
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet = (ModeratorPermissionEditFragmentSheet) afS12S0111000_12.l0;
        Pair pair = new Pair(Integer.valueOf(afS12S0111000_12.i2), Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(afS12S0111000_12.z1)) ? 1 : 0));
        if (!moderatorPermissionEditFragmentSheet.LLLFFI && (userAttr = (UserAttr) moderatorPermissionEditFragmentSheet.LLLIIIL.getValue()) != null && (map = userAttr.adminPermissions) != null) {
            map.put((Integer) pair.getFirst(), (Integer) pair.getSecond());
        }
        ModeratorPermissionEditFragmentSheet moderatorPermissionEditFragmentSheet2 = (ModeratorPermissionEditFragmentSheet) afS12S0111000_12.l0;
        boolean z = afS12S0111000_12.z1;
        int i = afS12S0111000_12.i2;
        moderatorPermissionEditFragmentSheet2.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_moderator_setting_click");
        moderatorPermissionEditFragmentSheet2.yS(c474500IjALIZ);
        c474500IjALIZ.LJJII(C751350Tdd.LIZIZ(i), "setting_name");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "to_status");
        c474500IjALIZ.LIZ();
        C1C7U.LIZIZ("ModeratorPermissionEditFragmentSheet@bb7d.updatePermission$1");
    }

    public AfS12S0111000_12(Object obj, int i, boolean z, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i2 = i;
        this.z1 = z;
    }
}
