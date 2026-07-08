package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.friends.service.RelationService;
import kotlin.jvm.internal.AwS598S0100000_19;

/* JADX INFO: renamed from: X.0iZf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1247730iZf {
    public static void LIZ(InterfaceC1247720iZe interfaceC1247720iZe) {
        RelationService relationService = (RelationService) PluggableExtentionKt.pluggableSpi$default(RelationService.class, false, false, false, 14, null);
        if (relationService != null && relationService.LJ()) {
            return;
        }
        interfaceC1247720iZe.Cn(new AwS598S0100000_19(interfaceC1247720iZe, 270));
    }
}
