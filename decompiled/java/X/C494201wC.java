package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.follow.spi.FollowTabAbility;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.01wC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C494201wC {
    public static final FollowTabAbility LIZ(Fragment fragment) {
        return (FollowTabAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), FollowTabAbility.class, null);
    }

    public static final void LIZIZ(long j, Function0<Unit> function0) {
        if (j <= 0) {
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C494101wB(function0, null), 3);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C494001wA(j, function0, null), 3);
        }
    }
}
