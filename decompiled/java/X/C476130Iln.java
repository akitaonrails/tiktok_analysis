package X;

import Y.AfS176S0100000_7;
import Y.AfS2S0200100_7;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.usermanage.MarkUserApi;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Iln, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476130Iln {
    public static final C11RK<Pair<Long, Boolean>> LIZ = new C11RK<>();

    public static C19500811Re LIZ(User user, C0IR5 c0ir5, LifecycleOwner lifecycleOwner) {
        long id = user.getId();
        C19500811Re c19500811ReLJJLIIJ = ((MarkUserApi) C482260Ivg.LIZJ(MarkUserApi.class)).mark(id, user.getSecUid()).LJJIJIIJIL(new C09JN() { // from class: X.00RS
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MarkUserManager@3cea.mark$observable$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && baseResponse.data != null) {
                    C1C7U.LIZIZ("MarkUserManager@3cea.mark$observable$1");
                    return;
                }
                throw new IllegalStateException("data error");
            }
        }).LJIILIIL(new C0UO0()).LJJLIIJ();
        ((C0J1N) c19500811ReLJJLIIJ.LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS2S0200100_7(id, user, c0ir5, 10), new AfS176S0100000_7(c0ir5, 237));
        return c19500811ReLJJLIIJ.LJJLIIJ();
    }

    public static C19500811Re LIZIZ(User user, C0IR5 c0ir5, LifecycleOwner lifecycleOwner) {
        long id = user.getId();
        C19500811Re c19500811ReLJJLIIJ = ((MarkUserApi) C482260Ivg.LIZJ(MarkUserApi.class)).unmark(id, user.getSecUid()).LJJIJIIJIL(new C09JN() { // from class: X.00RT
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("MarkUserManager@3cea.unmark$observable$1");
                BaseResponse baseResponse = (BaseResponse) obj;
                if (baseResponse != null && baseResponse.data != null) {
                    C1C7U.LIZIZ("MarkUserManager@3cea.unmark$observable$1");
                    return;
                }
                throw new IllegalStateException("data error");
            }
        }).LJIILIIL(new C0UO0()).LJJLIIJ();
        ((C0J1N) c19500811ReLJJLIIJ.LIZJ(C11RD.LJ(lifecycleOwner))).LIZ(new AfS2S0200100_7(id, user, c0ir5, 11), new AfS176S0100000_7(c0ir5, 238));
        return c19500811ReLJJLIIJ.LJJLIIJ();
    }
}
