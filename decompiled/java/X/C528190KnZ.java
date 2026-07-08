package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.offline.tools.debug.gp.IToolsDebugGpService;
import com.ss.android.ugc.aweme.service.ITemplateDebugService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvChoosePhotoScene;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0KnZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528190KnZ extends C09AY implements Function0<Unit> {
    public C528190KnZ(MvChoosePhotoScene mvChoosePhotoScene) {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        ITemplateDebugService iTemplateDebugService = (ITemplateDebugService) PluggableExtentionKt.pluggableSpi$default(ITemplateDebugService.class, false, false, false, 14, null);
        if (iTemplateDebugService != null) {
            iTemplateDebugService.LIZLLL();
        }
        IToolsDebugGpService iToolsDebugGpService = (IToolsDebugGpService) PluggableExtentionKt.pluggableSpi$default(IToolsDebugGpService.class, false, false, false, 14, null);
        if (iToolsDebugGpService != null) {
            iToolsDebugGpService.isOpen();
        }
        return Unit.LIZ;
    }
}
