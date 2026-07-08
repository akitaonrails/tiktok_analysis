package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import com.ss.android.ugc.aweme.creative.model.tangram.TangramTempModel;
import com.ss.android.ugc.aweme.effect.EffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0npa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1449800npa extends AbstractC2255721DQs<InterfaceC1449810npb> implements InterfaceC379610EuV, InterfaceC1449810npb {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1455500nym.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455860nzM.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZIZ(getDiContainer(), AbstractC1453750nvx.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1449800npa.class, "editEffectApi", "getEditEffectApi()Lcom/ss/android/ugc/aweme/shortvideo/edit/effect/EditEffectApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1449800npa.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1449800npa.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1449800npa.class, "editRootScene", "getEditRootScene()Lcom/ss/android/ugc/gamora/editor/rootscene/IEditRootScene;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLIZ = 8;
    }

    public InterfaceC1449810npb W1() {
        return this;
    }

    private final InterfaceC1455500nym X1() {
        return (InterfaceC1455500nym) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final InterfaceC1455860nzM Z1() {
        return (InterfaceC1455860nzM) this.LLILZ.getValue(this, LLILZLL[2]);
    }

    public final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    public final AbstractC1453750nvx o2() {
        return (AbstractC1453750nvx) this.LLILZIL.getValue(this, LLILZLL[3]);
    }

    public final void applyEffect() {
        List<? extends Effect> list;
        TangramTempModel tangramTempModel = getEditModel().creativeModel.tangramTempModel;
        if (tangramTempModel == null || (list = tangramTempModel.presetEffects) == null) {
            return;
        }
        ArrayList<EffectModel> arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        int i = 0;
        for (Effect effect : list) {
            int i2 = i + 1;
            if (i < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            EffectModel effectModelLIZ = C0F4X.LIZ(i, effect, "", getEditModel().creativeModel.effectEntrancePosition);
            effectModelLIZ.index = -1;
            effectModelLIZ.selectFrom = getEditModel().mShootWay;
            effectModelLIZ.entrancePoint = "null";
            arrayList.add(effectModelLIZ);
            i = i2;
        }
        for (EffectModel effectModel : arrayList) {
            InterfaceC1455500nym interfaceC1455500nymX1 = X1();
            if (interfaceC1455500nymX1 != null) {
                interfaceC1455500nymX1.KD(effectModel, "", -1, false, false);
            }
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        Z1().g().observe(this, new AObjectS245S0100000_22(this, 53));
        Z1().ww2().observe(this, new AObserverS225S0100000_22(this, 42));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        W1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1449800npa(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
