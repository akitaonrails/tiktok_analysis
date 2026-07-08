package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.userservice.api.IUserService;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0zbO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902280zbO extends AbstractC1902270zbN {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, final EnumC1063300dmC enumC1063300dmC) {
        final InterfaceC1902300zbQ interfaceC1902300zbQ = (InterfaceC1902300zbQ) xBaseParamModel;
        C11NZ.LJIJJLI(new InterfaceC1478005qU() { // from class: X.0zbP
            @Override // X.InterfaceC1478005qU
            public final void subscribe(C09AJ<FollowStatus> c09aj) {
                IUserService iUserService;
                FollowStatus followStatusLJIIIIZZ;
                C1C7U.LIZ("SyncSpecActFollowStatusMethod@649d.handle$1");
                String uid = interfaceC1902300zbQ.getUid();
                String secUid = interfaceC1902300zbQ.getSecUid();
                int iIntValue = interfaceC1902300zbQ.getType().intValue();
                if (uid != null && secUid != null && enumC1063300dmC != null && (iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null)) != null && (followStatusLJIIIIZZ = iUserService.LJIIIIZZ(iIntValue, -1, -1, -1, uid, secUid, "", "", null, new HashMap())) != null) {
                    c09aj.onNext(followStatusLJIIIIZZ);
                }
                C1C7U.LIZIZ("SyncSpecActFollowStatusMethod@649d.handle$1");
            }
        }).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C19336410ks(interfaceC1902300zbQ, completionBlock, 3));
    }
}
