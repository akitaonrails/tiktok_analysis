package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.edit.EditEffectModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.jvm.internal.AwS46S0010000_34;

/* JADX INFO: renamed from: X.1Bp7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
@InterfaceC2201231BDd(models = {EditEffectModel.class}, scopes = {InterfaceC1456930o15.class, InterfaceC2216361Boo.class})
public final class C2216551Bp7 extends AbstractC2216521Bp4<InterfaceC364140EPk, CreativeModel, EditEffectModel> implements InterfaceC364140EPk {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJ;
    public static final int LLJI;
    public final InterfaceC364140EPk LLILZLL;
    public final InterfaceC1555820qaa<EditEffectModel> LLIZ;
    public final InterfaceC1731706qJ LLIZLLLIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2216551Bp7.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C13LE.LIZ.getClass();
        LLJ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LLJI = 8;
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLIZLLLIL.getValue(this, LLJ[0]);
    }

    @Override // X.AbstractC2216521Bp4
    public InterfaceC1555820qaa<EditEffectModel> Z1() {
        return this.LLIZ;
    }

    public InterfaceC364140EPk c3() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZLL;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
    }

    public C2216551Bp7(C1DRG c1drg) {
        super(c1drg);
        this.LLILZLL = this;
        C2216601BpC c2216601BpC = C2216601BpC.LL;
        C1555860qae c1555860qae = new C1555860qae(CreativeModel.class, CreativeModel.class);
        c1555860qae.LIZJ.add(new C2216581BpA(c1555860qae.LIZIZ, c2216601BpC));
        this.LLIZ = new C1555860qae(c1555860qae.LIZ, EditEffectModel.class, c1555860qae.LIZJ);
        this.LLIZLLLIL = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }

    @Override // X.InterfaceC364140EPk
    public void sI1(boolean z) {
        Boolean boolValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditEffectModelDataComponent setHasClippedEffect:");
        sbLIZ.append(z);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        W2(new AwS46S0010000_34(z, 2));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("EditEffectModelDataComponent editEffectModelWriter hasClippedEffect value:");
        EditEffectModel editEffectModel = o2().get();
        if (editEffectModel != null) {
            boolValueOf = Boolean.valueOf(editEffectModel.hasClippedEffect);
        } else {
            boolValueOf = null;
        }
        sbLIZ2.append(boolValueOf);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("EditEffectModelDataComponent creativeModel hasClippedEffect value:");
        sbLIZ3.append(getEditModel().creativeModel.editEffectModel.hasClippedEffect);
        C201955140j.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }
}
