package X;

import Y.AObserverS225S0100000_22;
import android.text.TextUtils;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.ies.nle.editor_jni.NLEResourceNode;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.service.IToolsOfflineService;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoFileInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.videolength.IVideoLengthChecker;
import com.ss.android.ugc.tiktok.tools.performance.api.settings.LazyLoadEditLazyGroupPhase1;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS601S0100000_22;

/* JADX INFO: renamed from: X.0nbv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441330nbv extends AbstractC2255721DQs<C05YF> implements C05YF, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJIJIL;
    public static final int LLJILJIL;
    public final C1DRG LL;
    public final C05YF LLILLJJLI = this;
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS566S0100000_22(this, 609));
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), AbstractC214814194y.class, null);
    public final InterfaceC1731706qJ LLILZLL = C1664770tQJ.LIZ(getDiContainer(), AbstractC1453750nvx.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public boolean LLIZLLLIL;
    public InterfaceC1452130ntL LLJ;
    public Boolean LLJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1441330nbv.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1441330nbv.class, "rootScene", "getRootScene()Lcom/ss/android/ugc/aweme/adaptation/TikTokSAARootGroupScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1441330nbv.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1441330nbv.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJILJIL = 8;
    }

    private final AbstractC1453750nvx W1() {
        return (AbstractC1453750nvx) this.LLILZLL.getValue(this, LLJIJIL[2]);
    }

    private final InterfaceC572170McJ X1() {
        return (InterfaceC572170McJ) this.LLILLL.getValue();
    }

    private final VideoPublishEditModel Z1() {
        return (VideoPublishEditModel) this.LLIZ.getValue(this, LLJIJIL[3]);
    }

    public final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILZ.getValue(this, LLJIJIL[0]);
    }

    public final AbstractC214814194y o2() {
        return (AbstractC214814194y) this.LLILZIL.getValue(this, LLJIJIL[1]);
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent) {
            ((C0ETY) getDiContainer().LJII(C0ETY.class, null)).Sd(InterfaceC1452130ntL.class, new AwS601S0100000_22(this, 412));
        }
        JY0().Yh().observe(this, new AObserverS225S0100000_22(this, 91));
        JY0().ww2().observe(this, new AObserverS225S0100000_22(this, 92));
        IToolsOfflineService iToolsOfflineService = (IToolsOfflineService) PluggableExtentionKt.pluggableSpi$default(IToolsOfflineService.class, false, false, false, 14, null);
        if (iToolsOfflineService != null) {
            o2().requireView();
            iToolsOfflineService.LIZJ();
        }
    }

    @Override // X.AbstractC2255721DQs
    public C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1441330nbv(C1DRG c1drg) {
        this.LL = c1drg;
    }

    public final void G2(C1456890o11 c1456890o11) {
        InterfaceC1444170ngV interfaceC1444170ngVLLLLLJIL;
        X1().LIZ(c1456890o11);
        if (LazyLoadEditLazyGroupPhase1.LIZ().enableLazySafeComponent && !this.LLIZLLLIL) {
            this.LLJI = Boolean.valueOf(c1456890o11.LIZJ);
            InterfaceC1452130ntL interfaceC1452130ntL = this.LLJ;
            if (interfaceC1452130ntL != null) {
                interfaceC1452130ntL.Nd(c1456890o11.LIZJ);
                return;
            }
            return;
        }
        this.LLJI = null;
        InterfaceC1452130ntL interfaceC1452130ntL2 = (InterfaceC1452130ntL) findReadyComponent(this, InterfaceC1452130ntL.class);
        if (interfaceC1452130ntL2 != null) {
            interfaceC1452130ntL2.Nd(c1456890o11.LIZJ);
        }
        if (!c1456890o11.LIZ && W1().LLLLLLZ() && (interfaceC1444170ngVLLLLLJIL = W1().LLLLLJIL()) != null) {
            interfaceC1444170ngVLLLLLJIL.LJJJJLL();
        }
    }

    public final void w2(InterfaceC1452170ntP interfaceC1452170ntP) {
        NLEModel nLEModelLLZ;
        EditVideoSegment editVideoSegment;
        IVideoLengthChecker iVideoLengthChecker;
        if (interfaceC1452170ntP == null) {
            return;
        }
        Z1().setVideoLength(interfaceC1452170ntP.getDuration());
        X1().refresh();
        C1662160tM6 c1662160tM6 = C1662160tM6.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublishEditActivity, video duration ");
        sbLIZ.append(interfaceC1452170ntP.getDuration());
        C201955140j.LIZJ(c1662160tM6, C2188811AlT.LIZIZ(sbLIZ));
        if (!C1428470nHB.LJIIZILJ(Z1()) && (iVideoLengthChecker = (IVideoLengthChecker) PluggableExtentionKt.pluggableSpi$default(IVideoLengthChecker.class, false, false, false, 14, null)) != null) {
            iVideoLengthChecker.LIZJ(o2(), Z1(), JY0(), W1());
        }
        if (Z1().isMvThemeVideoType() && interfaceC1452170ntP.getDuration() > 0 && (editVideoSegment = (EditVideoSegment) C13LP.LJJJLL(Z1().getPreviewInfo().getVideoList())) != null) {
            ListProtector.set(Z1().getPreviewInfo().getVideoList(), 0, EditVideoSegment.copy$default(editVideoSegment, editVideoSegment.getVideoPath(), editVideoSegment.getAudioPath(), new VideoFileInfo(editVideoSegment.getVideoFileInfo().getWidth(), editVideoSegment.getVideoFileInfo().getHeight(), interfaceC1452170ntP.getDuration(), 30, 0, 0, 0, 0, 0.0f, 480, null), null, 8, null));
        }
        if (C290590BaD.LIZ() && (nLEModelLLZ = JY0().LLZ()) != null) {
            Set<String> set = Z1().creativeModel.editModel.originalNLEResourceInfo;
            Iterator<NLEResourceNode> it2 = nLEModelLLZ.getAllResources().iterator();
            while (it2.hasNext()) {
                String resourceId = it2.next().getResourceId();
                if (!TextUtils.isEmpty(resourceId)) {
                    set.add(resourceId);
                }
            }
        }
    }
}
