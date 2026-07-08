package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IUnKnownOwnershipBusinessOuterService;

/* JADX INFO: renamed from: X.0MvQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C584020MvQ {
    public static volatile long LIZ;
    public static final IUnKnownOwnershipBusinessOuterService LIZIZ = (IUnKnownOwnershipBusinessOuterService) PluggableExtentionKt.pluggableSpi(IUnKnownOwnershipBusinessOuterService.class);

    public static String LIZ(String str, EnumC1604800rra enumC1604800rra) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC1604800rra.name());
        sbLIZ.append("_");
        sbLIZ.append(str);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
