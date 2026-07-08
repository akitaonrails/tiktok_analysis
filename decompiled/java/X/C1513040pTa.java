package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.cache.FollowingFeedAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pTa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513040pTa extends C09AY implements Function0<C1513030pTZ> {
    public final /* synthetic */ FollowingFeedAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1513040pTa(FollowingFeedAssem followingFeedAssem) {
        super(0);
        this.LL = followingFeedAssem;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [X.0pTZ] */
    @Override // kotlin.jvm.functions.Function0
    public final C1513030pTZ invoke() {
        final FollowingFeedAssem followingFeedAssem = this.LL;
        return new InterfaceC1006670cIr<C1602200rnO>() { // from class: X.0pTZ
            @Override // X.InterfaceC1006670cIr
            public final void LJIIJ(C1602200rnO c1602200rnO, C1602200rnO c1602200rnO2) {
                if (c1602200rnO2.LIZJ()) {
                    int i = C2187451AjH.LIZ;
                    LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(followingFeedAssem);
                    C1DFB c1dfb = C0PEM.LIZJ;
                    C23250099c.LIZLLL(lifecycleScope, c1dfb, null, new C1588790rRl(followingFeedAssem, null), 2);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(followingFeedAssem), c1dfb, null, new C805080Vi6(null), 2);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(followingFeedAssem), c1dfb, null, new C804970Vhv(null), 2);
                    C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(followingFeedAssem), c1dfb, null, new C592420NLk(null), 2);
                    C1BCA.LJJIJIIJI(EnumC312610CNf.SATRTUP, this);
                }
            }
        };
    }
}
