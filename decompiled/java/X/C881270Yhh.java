package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.tars.TarsSharedInterface;
import kotlin.jvm.internal.AFwS201S0000000_14;

/* JADX INFO: renamed from: X.0Yhh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C881270Yhh {
    public static final C881270Yhh LIZ = new C881270Yhh();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(342));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(341));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(340));
    public static C0Z0Y LJ;

    public final synchronized C0Z0Y LIZ() {
        if (LJ == null) {
            TarsSharedInterface tarsSharedInterface = (TarsSharedInterface) PluggableExtentionKt.pluggableSpi$default(TarsSharedInterface.class, false, false, false, 14, null);
            LJ = tarsSharedInterface != null ? tarsSharedInterface.LIZ((String) LIZIZ.getValue(), C1697810uHb.LJIIJJI((C882470Yjd) LIZJ.getValue(), (C882900YkK) LIZLLL.getValue())) : null;
        }
        return LJ;
    }
}
