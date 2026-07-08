package X;

import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.ss.android.ugc.aweme.service.IPhotoViewModel;
import com.ss.android.ugc.aweme.service.PhotoViewModelImpl;
import kotlin.jvm.internal.AwS635S0100000_21;

/* JADX INFO: renamed from: X.0RI2, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RI2 implements IPhotoViewModel {
    public static final C0RI2 LIZIZ = new C0RI2();
    public final /* synthetic */ IPhotoViewModel LIZ;

    @Override // com.ss.android.ugc.aweme.service.IPhotoViewModel
    public final void LIZ(ReusedUIAssem reusedUIAssem, AwS635S0100000_21 awS635S0100000_21) {
        this.LIZ.LIZ(reusedUIAssem, awS635S0100000_21);
    }

    public C0RI2() {
        IPhotoViewModel iPhotoViewModel;
        Object objLIZ = C04TD.LIZ(IPhotoViewModel.class, false);
        if (objLIZ != null) {
            iPhotoViewModel = (IPhotoViewModel) objLIZ;
        } else {
            if (C04TD.h4 == null) {
                synchronized (IPhotoViewModel.class) {
                    if (C04TD.h4 == null) {
                        C04TD.h4 = new PhotoViewModelImpl();
                    }
                }
            }
            iPhotoViewModel = C04TD.h4;
        }
        this.LIZ = iPhotoViewModel;
    }
}
