package X;

import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.friends.model.SummonFriendItem;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.09Wl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2385709Wl {
    public static final /* synthetic */ int LJIIL = 0;
    public boolean LJFF;
    public boolean LJI;
    public long LJII;
    public final MutableLiveData<List<C2386409Ws>> LIZ = new MutableLiveData<>();
    public final MutableLiveData<List<C2386409Ws>> LIZIZ = new MutableLiveData<>();
    public final MutableLiveData<List<C2386409Ws>> LIZJ = new MutableLiveData<>();
    public String LIZLLL = "";
    public long LJ = -1;
    public final C1DFK LJIIIIZZ = C23118094a.LIZ();
    public final C2502509rL LJIIIZ = new C2502509rL(CoroutineExceptionHandler.LJJLIL, 7);
    public final List<SummonFriendItem> LJIIJ = new ArrayList();
    public final List<C2386409Ws> LJIIJJI = new ArrayList();

    public static boolean LIZ(User user) {
        C0CHQ.LIZ().getRegionService();
        String strLIZ = C20186013yc.LIZ();
        String region = user.getRegion();
        if (strLIZ == null || strLIZ.length() == 0 || !Intrinsics.LJFF(strLIZ, region)) {
            return false;
        }
        return true;
    }

    public final boolean LIZJ(String str, boolean z) {
        if (str.length() == 0) {
            return false;
        }
        this.LIZLLL = str;
        if (!z) {
            this.LJII = 0L;
            this.LJI = false;
        } else if (!this.LJI) {
            return false;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ.plus(this.LJIIIIZZ).plus(this.LJIIIZ)), null, null, new C2386009Wo(this, str, z, null), 3);
        return true;
    }

    public static void LIZIZ(C2385709Wl c2385709Wl, boolean z, AFwS231S0000000_3 aFwS231S0000000_3, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            aFwS231S0000000_3 = null;
        }
        c2385709Wl.getClass();
        if (!z) {
            c2385709Wl.LJ = System.currentTimeMillis() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
            c2385709Wl.LJFF = false;
        } else if (!c2385709Wl.LJFF) {
            if (aFwS231S0000000_3 == null) {
                return;
            }
            aFwS231S0000000_3.invoke(Boolean.FALSE);
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2108108Nr.LIZ.plus(c2385709Wl.LJIIIIZZ).plus(new C2185708hL(CoroutineExceptionHandler.LJJLIL, z, aFwS231S0000000_3))), null, null, new C09BO(c2385709Wl, z, null), 3);
    }
}
