package X;

import com.ss.android.ugc.aweme.discover.model.DiscoverSectionList;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AFwS347S0000000_25;

/* JADX INFO: renamed from: X.0spE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1641780spE extends C11SY {
    public static final C1641790spF LIZLLL = new C199609138d<C11E7, DiscoverSectionList>() { // from class: X.0spF
    };
    public final C19472811Gk LIZJ;

    public C1641780spE() {
        C19472811Gk c19472811Gk = new C19472811Gk();
        this.LIZJ = c19472811Gk;
        LJJIJIIJIL(C11T2.LIZIZ(c19472811Gk), C11T2.LIZ(LIZLLL), C0LJ7.LIZ(AFwS347S0000000_25.get$arr$(26)));
    }

    public final C19476611Hw LJJIJIL(C11E7 c11e7, boolean z) {
        C11NZ<DiscoverSectionList> c11nzRequest;
        if (c11e7.cursor == -1 && z) {
            c11nzRequest = new C11T7(AFwS311S0000000_25.get$arr$(70), C1639420slQ.LIZ(this.LIZJ, LIZLLL)).request(c11e7);
        } else {
            c11nzRequest = this.LIZJ.request(c11e7);
        }
        return c11nzRequest.LJL(C11S5.LIZ());
    }
}
