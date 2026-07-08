package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService;
import com.ss.android.ugc.aweme.tools.integration.plugin.integration.api.CreativeToolsBizPluginService;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0LeV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C548050LeV implements IAIPortraitCreationService {
    public static final C548050LeV LIZ = new C548050LeV();

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final <T> boolean LIZ(T t) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final boolean LIZLLL(CreativeModel creativeModel) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final boolean LJ(CreativeModel creativeModel, int i) {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final boolean LJFF() {
        return false;
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final ArrayList<String> LIZIZ(CreativeModel creativeModel) {
        return new ArrayList<>();
    }

    @Override // com.ss.android.ugc.aweme.portrait.service.IAIPortraitCreationService
    public final void LIZJ(C19EG c19eg) {
        CreativeToolsBizPluginService.LIZ.getClass();
        CreativeToolsBizPluginService creativeToolsBizPluginServiceLIZ = C0LOV.LIZ();
        if (creativeToolsBizPluginServiceLIZ != null) {
            creativeToolsBizPluginServiceLIZ.LIZIZ(c19eg, "ai_portrait", true);
        }
    }
}
