package X;

import com.bytedance.ies.ugc.aweme.commercialize.scene.api.IAdSceneService;
import com.ss.android.ugc.aweme.feed.controller.PlayerController;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0Mr7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581350Mr7 implements InterfaceC582460Msu {
    public final /* synthetic */ PlayerController LIZ;

    public final void LIZ() {
        IAdSceneService iAdSceneService = (IAdSceneService) ServiceManager.get().getService(IAdSceneService.class);
        if (iAdSceneService != null) {
            iAdSceneService.LIZIZ();
            Aweme awemeLLILLIZIL = this.LIZ.LLILLIZIL();
            C1022290ci3.LJIJJLI(1, this.LIZ.adPlayTimes + 1, this.LIZ.getContext(), awemeLLILLIZIL);
        }
    }

    public C581350Mr7(PlayerController playerController) {
        this.LIZ = playerController;
    }
}
