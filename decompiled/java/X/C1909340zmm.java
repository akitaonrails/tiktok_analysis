package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ug.multiapp.IUgCommonExService;

/* JADX INFO: renamed from: X.0zmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1909340zmm implements IUgCommonExService {
    public static final C1909340zmm LIZIZ = new C1909340zmm();
    public final /* synthetic */ IUgCommonExService LIZ;

    @Override // com.ss.android.ugc.aweme.ug.multiapp.IUgCommonExService
    public final boolean LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.ug.multiapp.IUgCommonExService
    public final boolean LIZIZ(Context context) {
        return this.LIZ.LIZIZ(context);
    }

    public C1909340zmm() {
        IUgCommonExService iUgCommonExService = (IUgCommonExService) PluggableExtentionKt.pluggableSpi$default(IUgCommonExService.class, false, false, false, 14, null);
        if (iUgCommonExService != null) {
            this.LIZ = iUgCommonExService;
        } else {
            "no implementation IUgCommonExService".toString();
            throw new IllegalStateException("no implementation IUgCommonExService");
        }
    }
}
