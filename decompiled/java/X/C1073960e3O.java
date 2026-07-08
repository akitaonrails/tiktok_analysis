package X;

import com.ss.android.ugc.aweme.relation.experiment.FriendRecListRedesignSetting;
import java.util.Set;
import kotlin.jvm.internal.AFwS204S0000000_16;

/* JADX INFO: renamed from: X.0e3O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1073960e3O {
    public static final Set<Integer> LIZ = C13LQ.LJLIIL(new Integer[]{1, 3, 4, 5, 6});
    public static final FriendRecListRedesignSetting LIZIZ = new FriendRecListRedesignSetting(0, 7);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(364));

    public static FriendRecListRedesignSetting LIZJ() {
        return (FriendRecListRedesignSetting) LIZJ.getValue();
    }

    public static boolean LIZ() {
        return (LIZJ().group == 0 || LIZJ().group == 4) ? false : true;
    }

    public static boolean LIZIZ() {
        return (LIZJ().group == 0 || LIZJ().group == 5) ? false : true;
    }
}
