package X;

import android.content.Context;
import com.bytedance.router.OnActivityResultCallback;
import com.ss.android.ugc.aweme.internal.AVTagServiceImpl;
import com.ss.android.ugc.aweme.internal.IAVTagService;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.190N, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C190N implements IAVTagService {
    public static final C190N LIZIZ = new C190N();
    public final /* synthetic */ IAVTagService LIZ;

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZ() {
        this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final int LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final boolean LIZJ(boolean z) {
        return this.LIZ.LIZJ(z);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LIZLLL(C19EG c19eg, String str, int i, List list, InterfaceC1631620sYq interfaceC1631620sYq) {
        this.LIZ.LIZLLL(c19eg, str, i, list, interfaceC1631620sYq);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJ(Context context, String str, int i, List list, OnActivityResultCallback onActivityResultCallback) {
        this.LIZ.LJ(context, str, i, list, onActivityResultCallback);
    }

    @Override // com.ss.android.ugc.aweme.internal.IAVTagService
    public final void LJFF(C19EG c19eg, Function0 function0) {
        this.LIZ.LJFF(c19eg, function0);
    }

    public C190N() {
        IAVTagService iAVTagService;
        Object objLIZ = C04TD.LIZ(IAVTagService.class, false);
        if (objLIZ != null) {
            iAVTagService = (IAVTagService) objLIZ;
        } else {
            if (C04TD.w1 == null) {
                synchronized (IAVTagService.class) {
                    if (C04TD.w1 == null) {
                        C04TD.w1 = new AVTagServiceImpl();
                    }
                }
            }
            iAVTagService = C04TD.w1;
        }
        this.LIZ = iAVTagService;
    }
}
