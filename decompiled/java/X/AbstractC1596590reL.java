package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUser;
import com.ss.android.ugc.aweme.feed.module.FollowingInterestUsersResponse;
import java.util.List;

/* JADX INFO: renamed from: X.0reL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public abstract class AbstractC1596590reL implements InterfaceC1596870ren {
    @Override // X.InterfaceC1596870ren
    public InterfaceC1596200rdi LIZ() {
        return new InterfaceC1596200rdi() { // from class: X.0reN
            @Override // X.InterfaceC1596200rdi
            public final C1595260rcC<? extends List<InterfaceC1891350zJl>> LJFF(boolean z, boolean z2) {
                return null;
            }

            @Override // X.InterfaceC1596200rdi
            public final boolean LJIILIIL() {
                return false;
            }

            @Override // X.InterfaceC1596200rdi
            public final boolean LJIIZILJ() {
                return false;
            }
        };
    }

    @Override // X.InterfaceC1596870ren
    public InterfaceC1596210rdj LIZIZ() {
        return new InterfaceC1596210rdj() { // from class: X.0reM
            @Override // X.InterfaceC1596210rdj
            public final boolean LJIILLIIL() {
                return false;
            }

            @Override // X.InterfaceC1596210rdj
            public final void LJIL(Context context, List<FollowingInterestUser> list) {
            }

            @Override // X.InterfaceC1596210rdj
            public final boolean LJIJJLI() {
                return C1601110rld.LIZ();
            }
        };
    }

    @Override // X.InterfaceC1596870ren
    public InterfaceC1596220rdk LIZJ() {
        return new InterfaceC1596220rdk() { // from class: X.0reO
            @Override // X.InterfaceC1596220rdk
            public final String LIZ() {
                return null;
            }

            @Override // X.InterfaceC1596220rdk
            public final boolean LJJIFFI(boolean z) {
                return z;
            }

            @Override // X.InterfaceC1596220rdk
            public final FollowingInterestUsersResponse LJIJ(int i) {
                return C1596470re9.LIZIZ(null, false, false, 14);
            }
        };
    }
}
