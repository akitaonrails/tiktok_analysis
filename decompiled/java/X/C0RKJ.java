package X;

import com.bytedance.assem.arch.reused.ReusedUIContentAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.ITextModeService;
import com.ss.android.ugc.aweme.service.TextModeServiceImpl;

/* JADX INFO: renamed from: X.0RKJ, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RKJ implements ITextModeService {
    public static final C0RKJ LIZIZ = new C0RKJ();
    public final /* synthetic */ ITextModeService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final C13IQ<?> LIZ() {
        return this.LIZ.LIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final C13IQ<? extends ReusedUIContentAssem<? extends C03H5>> LIZIZ() {
        return this.LIZ.LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final boolean LIZJ(Aweme aweme) {
        return this.LIZ.LIZJ(aweme);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final Object LIZLLL(Object obj) {
        return this.LIZ.LIZLLL(obj);
    }

    @Override // com.ss.android.ugc.aweme.service.ITextModeService
    public final C13IQ<?> LJ() {
        return this.LIZ.LJ();
    }

    public C0RKJ() {
        ITextModeService iTextModeService;
        Object objLIZ = C04TD.LIZ(ITextModeService.class, false);
        if (objLIZ != null) {
            iTextModeService = (ITextModeService) objLIZ;
        } else {
            if (C04TD.q4 == null) {
                synchronized (ITextModeService.class) {
                    if (C04TD.q4 == null) {
                        C04TD.q4 = new TextModeServiceImpl();
                    }
                }
            }
            iTextModeService = C04TD.q4;
        }
        this.LIZ = iTextModeService;
    }
}
