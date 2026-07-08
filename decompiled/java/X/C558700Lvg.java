package X;

import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import com.ss.android.ugc.aweme.services.external.IAIGCQuotaService;
import com.ss.android.ugc.aweme.services.external.RefreshQuotaScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.gamora.editor.ailive.util.AILiveDialogConfigList;
import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0Lvg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558700Lvg extends AbstractC2255721DQs<C0MEH> implements C0MEH, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final C0MEH LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final C01GW LLILZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(264));
    public final C01GW LLILZIL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(265));
    public final C01GW LLILZLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(266));

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C558700Lvg.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLIZLLLIL = 8;
    }

    private final IAIGCQuotaService Z1() {
        return (IAIGCQuotaService) this.LLILZIL.getValue();
    }

    private final String getSource() {
        return (String) this.LLILZLL.getValue();
    }

    public final ICreationAsyncTaskManager X1() {
        return (ICreationAsyncTaskManager) this.LLILZ.getValue();
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLIZ[0]);
    }

    public final void o2() {
        C0MES.LIZ.getClass();
        AILiveDialogConfigList.AILiveDialogConfig aILiveDialogConfigLIZJ = C0MES.LIZJ(5, "quota", null);
        if (aILiveDialogConfigLIZJ == null) {
            return;
        }
        C0MES.LJ(new C0MET(C1664590tQ1.LJIIIZ(this), aILiveDialogConfigLIZJ.topIcon, aILiveDialogConfigLIZJ.title, aILiveDialogConfigLIZJ.subtitle, aILiveDialogConfigLIZJ.confirmBtn, aILiveDialogConfigLIZJ.cancelBtn, new AwS552S0100000_8(this, 573), new AwS552S0100000_8(this, 574)));
        C564410MBr c564410MBr = C564410MBr.LIZ;
        VideoPublishEditModel editModel = getEditModel();
        c564410MBr.getClass();
        C564410MBr.LJIIZILJ(editModel, "show");
    }

    @Override // X.C0MEH
    public boolean Of0() {
        if (!bS0()) {
            return false;
        }
        o2();
        return true;
    }

    @Override // X.C0MEH
    public boolean bS0() {
        return C0LXU.LIZ(getSource(), true).quotaRemain <= 0;
    }

    public C0MEH W1() {
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

    public C558700Lvg(C1DRG c1drg) {
        this.LL = c1drg;
    }

    @Override // X.C0MEH
    public void refreshQuotaCache(RefreshQuotaScene refreshQuotaScene) {
        IAIGCQuotaService iAIGCQuotaServiceZ1 = Z1();
        if (iAIGCQuotaServiceZ1 != null) {
            iAIGCQuotaServiceZ1.refreshQuotaCache(getSource(), refreshQuotaScene);
        }
    }
}
