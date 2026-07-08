package X;

import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager;
import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager$mainIdleSignal$1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0y9U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1846540y9U extends C09AY implements Function0<Object> {
    public C1846540y9U() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC1846560y9W interfaceC1846560y9WLIZ = C1847660yBI.LIZ();
        boolean z = interfaceC1846560y9WLIZ != null && interfaceC1846560y9WLIZ.LJI();
        VTreeBuildManager.LJ = 1;
        if (z) {
            VTreeBuildManager.LJII.getClass();
            return C189200o6.m1boximpl(VTreeBuildManager$mainIdleSignal$1.LIZ(0));
        }
        VTreeBuildManager.LJII.LIZIZ(0);
        return Unit.LIZ;
    }
}
