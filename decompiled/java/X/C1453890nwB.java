package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.external.IConfigService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditContainerScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.utils.ActivityStack;

/* JADX INFO: renamed from: X.0nwB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1453890nwB extends AbstractC2255721DQs<InterfaceC1454680nxS> implements InterfaceC1454680nxS, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZIL;
    public static final int LLILZLL;
    public final C1DRG LL;
    public final InterfaceC1454680nxS LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final String LLILZ = getEditModel().getNewDraftId();

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1453890nwB.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLILZIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLILZLL = 8;
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZIL[0]);
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        InterfaceC20597015ii interfaceC20597015iiLIZJ;
        super.onDestroy();
        Activity activity = (Activity) C13LQ.LJJJJIZL(ActivityStack.getActivityStack());
        if (activity == null || getEditModel().mShootWay == null || (interfaceC20597015iiLIZJ = C20622515mp.LIZJ(activity)) == null) {
            return;
        }
        if ((interfaceC20597015iiLIZJ.LC() instanceof VideoPublishEditContainerScene) || (interfaceC20597015iiLIZJ.LC() instanceof ImageEditRootScene)) {
            IConfigService iConfigServiceConfigService = ((IExternalService) ServiceManager.get().getService(IExternalService.class)).configService();
            String str = getEditModel().mShootWay;
            if (str == null) {
                str = "";
            }
            String str2 = this.LLILZ;
            iConfigServiceConfigService.mobUserExitEditAction(str, str2 != null ? str2 : "");
        }
    }

    public InterfaceC1454680nxS W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1453890nwB(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
