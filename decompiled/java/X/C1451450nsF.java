package X;

import com.ss.android.ugc.aweme.creative.model.edit.ReuseEffectTemplateInfo;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS10S0000001_22;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0nsF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1451450nsF extends i<InterfaceC1441100nbY, C1451530nsN, C1451460nsG, C1451510nsL> implements InterfaceC1441100nbY, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIJIIJIL;
    public static final int LLJJIJIL;
    public final C1DRG LLJILJILJ;
    public final SingleImageData LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1451450nsF.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1451450nsF.class, "reuseTemplateProcessorApi", "getReuseTemplateProcessorApi()Lcom/ss/android/ugc/aweme/image/phototemplate/reuse/processor/ReuseTemplateProcessorApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1451450nsF.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1451450nsF.class, "imageEditThumbnailApi", "getImageEditThumbnailApi()Lcom/ss/android/ugc/aweme/image/thumbnail/ImageEditThumbnailApi;", 0);
        c09r3.getClass();
        LLJJIJIIJIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4};
        LLJJIJIL = 8;
    }

    private final InterfaceC1451050nrb F4() {
        return (InterfaceC1451050nrb) this.LLJJIII.getValue(this, LLJJIJIIJIL[2]);
    }

    private final InterfaceC1441090nbX H4() {
        return (InterfaceC1441090nbX) this.LLJJIJI.getValue(this, LLJJIJIIJIL[3]);
    }

    private final InterfaceC1451500nsK O4() {
        return (InterfaceC1451500nsK) this.LLJJI.getValue(this, LLJJIJIIJIL[1]);
    }

    public final VideoPublishEditModel K4() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJJIJIIJIL[0]);
    }

    public final void T4() {
        ReuseEffectTemplateInfo reuseEffectTemplateInfo = this.LLJILLL.getReuseEffectTemplateInfo();
        if (reuseEffectTemplateInfo != null) {
            reuseEffectTemplateInfo.setReuseFail(false);
        }
        InterfaceC1451500nsK interfaceC1451500nsKO4 = O4();
        if (interfaceC1451500nsKO4 != null) {
            interfaceC1451500nsKO4.pR0(this.LLJILLL);
        }
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451460nsG> o2() {
        return new AwS566S0100000_22(this, 158);
    }

    @Override // X.InterfaceC1441100nbY
    public void v() {
        i3(AFwS261S0000000_22.get$arr$(72));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1451510nsL> w2() {
        return new AwS566S0100000_22(this, 159);
    }

    public final void P4() {
        InterfaceC1451500nsK interfaceC1451500nsKO4 = O4();
        if (interfaceC1451500nsKO4 != null) {
            interfaceC1451500nsKO4.D70(this.LLJILLL);
        }
        if (C1441080nbW.LIZ(K4())) {
            int iH7 = F4().h7();
            F4().LLLZLL(iH7);
            InterfaceC1441090nbX interfaceC1441090nbXH4 = H4();
            if (interfaceC1441090nbXH4 != null) {
                interfaceC1441090nbXH4.LLLZLL(iH7);
                return;
            }
            return;
        }
        this.LLJILLL.setReuseEffectTemplateInfo(null);
        int iH72 = F4().h7();
        InterfaceC1441090nbX interfaceC1441090nbXH42 = H4();
        if (interfaceC1441090nbXH42 != null) {
            interfaceC1441090nbXH42.Za2(iH72, this.LLJILLL.getSrcImageInfo().getPath());
        }
    }

    @Override // ge.i, X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        ReuseEffectTemplateInfo reuseEffectTemplateInfo = this.LLJILLL.getReuseEffectTemplateInfo();
        if (reuseEffectTemplateInfo == null || !reuseEffectTemplateInfo.getReuseFail()) {
            return;
        }
        v();
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJILJILJ;
    }

    @Override // X.InterfaceC1441100nbY
    public void Sm(float f) {
        i3(new AwS10S0000001_22(f, 0));
    }

    public C1451450nsF(C19A3 c19a3, C1DRG c1drg, SingleImageData singleImageData) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = singleImageData;
        this.LLJJ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1451500nsK.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1441090nbX.class, null);
    }
}
