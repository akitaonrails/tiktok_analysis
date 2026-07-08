package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.1Bp8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC2201231BDd(models = {EditEffectModel.class}, scopes = {InterfaceC1456930o15.class, InterfaceC2216361Boo.class})
public final class C2216561Bp8 extends AbstractC2216531Bp5<InterfaceC364140EPk, CreativeModel> implements InterfaceC364140EPk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJILJIL;
    public static final int LLJILJILJ;
    public final InterfaceC364140EPk LLIZ;
    public final Class<CreativeModel> LLIZLLLIL;
    public final C2216661BpI LLJ;
    public final InterfaceC1731706qJ LLJI;
    public final C01GW LLJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2216561Bp8.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJILJIL = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJILJILJ = 8;
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLJI.getValue(this, LLJILJIL[0]);
    }

    private final InterfaceC2216671BpJ i3() {
        return (InterfaceC2216671BpJ) this.LLJIJIL.getValue();
    }

    @Override // X.AbstractC2216531Bp5
    public Class<CreativeModel> T2() {
        return this.LLIZLLLIL;
    }

    @Override // X.AbstractC2216531Bp5
    public C2216661BpI Z1() {
        return this.LLJ;
    }

    public InterfaceC364140EPk c3() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLIZ;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public C2216561Bp8(C1DRG c1drg) {
        super(c1drg);
        this.LLIZ = this;
        this.LLIZLLLIL = CreativeModel.class;
        C2216661BpI c2216661BpI = new C2216661BpI();
        C2216591BpB c2216591BpB = C2216591BpB.LL;
        ((ArrayList) c2216661BpI.LIZ).add(new C2216631BpF(c2216591BpB));
        this.LLJ = c2216661BpI;
        this.LLJI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJIJIL = C452501pT.LIZIZ(new C2216541Bp6(this));
    }

    @Override // X.InterfaceC364140EPk
    public void sI1(boolean z) {
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditEffectModelDataComponent setHasClippedEffect:");
        sbLIZ.append(z);
        C201955140j.LIZJ(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ));
        i3().LIZLLL().LJIIIIZZ(Boolean.valueOf(z));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EditEffectModelDataComponent editEffectModelWriter hasClippedEffect value:");
        sbLIZ2.append(((Boolean) i3().LIZLLL().LJI()).booleanValue());
        C201955140j.LIZJ(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("EditEffectModelDataComponent creativeModel hasClippedEffect value:");
        sbLIZ3.append(getEditModel().creativeModel.editEffectModel.hasClippedEffect);
        C201955140j.LIZJ(c20012313Rx, C2188811AlT.LIZIZ(sbLIZ3));
    }
}
