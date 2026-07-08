package X;

import com.ss.android.ugc.aweme.favorites.experiment.CollaborativeCollectionConfig;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.internalshare.api.IInternalShareApi;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0i0m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1226100i0m {
    public static final boolean LIZIZ(String str) {
        CollaborativeCollectionConfig collaborativeCollectionConfigLIZJ;
        InterfaceC1364710lcL interfaceC1364710lcLLIZIZ;
        Map<String, Boolean> mapLJI;
        IInternalShareApi iInternalShareApi = (IInternalShareApi) PluggableExtentionKt.pluggableSpi$default(IInternalShareApi.class, false, false, false, 14, null);
        if ((iInternalShareApi == null || (interfaceC1364710lcLLIZIZ = iInternalShareApi.LIZIZ()) == null || (mapLJI = interfaceC1364710lcLLIZIZ.LJI("collaborative_collection_config.is_enable")) == null || !Intrinsics.LJFF(mapLJI.get(str), Boolean.TRUE)) && ((Boolean) C1171750gb7.LIZIZ.getValue()).booleanValue() && (collaborativeCollectionConfigLIZJ = C1171750gb7.LIZJ()) != null && collaborativeCollectionConfigLIZJ.isFullyLaunch == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9 A[PHI: r20
      0x00d9: PHI (r20v3 boolean) = (r20v1 boolean), (r20v4 boolean) binds: [B:53:0x0143, B:37:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0138 A[PHI: r20
      0x0138: PHI (r20v1 boolean) = (r20v0 boolean), (r20v4 boolean), (r20v4 boolean) binds: [B:47:0x0135, B:35:0x00cd, B:37:0x00d7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List<X.AbstractC1223800hx4> LIZ(android.content.Context r25, java.util.List<java.lang.String> r26, java.util.List<? extends com.ss.android.ugc.aweme.im.contacts.api.model.IMContact> r27) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1226100i0m.LIZ(android.content.Context, java.util.List, java.util.List):java.util.List");
    }
}
