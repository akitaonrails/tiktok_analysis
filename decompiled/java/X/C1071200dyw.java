package X;

import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dyw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1071200dyw implements InterfaceC1070020dx2 {
    public C1071220dyy LIZ;

    public final C095D LIZ() {
        if (C1071170dyt.LIZIZ.LIZIZ()) {
            return new C095D(new C448401oo(null));
        }
        IAccountUserService iAccountUserService = (IAccountUserService) PluggableExtentionKt.pluggableSpi$default(IAccountUserService.class, false, false, false, 14, null);
        return (iAccountUserService == null || !Intrinsics.LJFF(iAccountUserService.LJFF(), Boolean.TRUE)) ? new C095D(new C1071320dz8(this, null)) : new C095D(new C1071230dyz(this, null));
    }

    public C1071200dyw(C1071620dzc c1071620dzc) {
        this.LIZ = new C1071220dyy(c1071620dzc, 2);
    }
}
