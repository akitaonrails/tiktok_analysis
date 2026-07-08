package X;

import android.content.Context;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.service.CaptionSheetServiceImpl;
import com.ss.android.ugc.aweme.service.ICaptionSheetService;
import com.ss.android.ugc.aweme.setting.serverpush.model.PushSettings;
import java.util.List;

/* JADX INFO: renamed from: X.15z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20698615z6 implements ICaptionSheetService {
    public static final C20698615z6 LIZIZ = new C20698615z6();
    public final /* synthetic */ ICaptionSheetService LIZ;

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZ(Aweme aweme, Context context, PushSettings pushSettings, C19EG c19eg, String str, String str2) {
        this.LIZ.LIZ(aweme, context, pushSettings, c19eg, str, str2);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZIZ(Aweme aweme, Context context, List list, C19EG c19eg, String str) {
        this.LIZ.LIZIZ(aweme, context, list, c19eg, str);
    }

    @Override // com.ss.android.ugc.aweme.service.ICaptionSheetService
    public final void LIZJ(EnumC20698315z3 enumC20698315z3, C20698515z5 c20698515z5) {
        this.LIZ.LIZJ(enumC20698315z3, c20698515z5);
    }

    public C20698615z6() {
        ICaptionSheetService iCaptionSheetService;
        Object objLIZ = C04TD.LIZ(ICaptionSheetService.class, false);
        if (objLIZ != null) {
            iCaptionSheetService = (ICaptionSheetService) objLIZ;
        } else {
            if (C04TD.X3 == null) {
                synchronized (ICaptionSheetService.class) {
                    if (C04TD.X3 == null) {
                        C04TD.X3 = new CaptionSheetServiceImpl();
                    }
                }
            }
            iCaptionSheetService = C04TD.X3;
        }
        this.LIZ = iCaptionSheetService;
    }
}
