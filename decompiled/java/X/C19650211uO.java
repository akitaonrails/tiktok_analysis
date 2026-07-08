package X;

import com.ss.android.ugc.aweme.creative.model.edit.ImageSynthesisResult;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.image.switchmode.payload.AutoCutImageLoadResult;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import ge.i;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS273S0000000_29;
import kotlin.jvm.internal.AwS135S0101000_29;
import kotlin.jvm.internal.AwS41S0010000_29;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.AwS608S0100000_29;

/* JADX INFO: renamed from: X.11uO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19650211uO extends i<InterfaceC1418610n1H, C19649211uE, C19649611uI, C19649311uF> implements InterfaceC1418610n1H {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJ;
    public static final int LLJJJIL;
    public final C1DRG LLJILJILJ;
    public final C19A3 LLJILLL;
    public final InterfaceC1410280mnq LLJJ;
    public final InterfaceC1417050myl LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final Function0<C19649611uI> LLJJIJIIJIL;
    public final Function0<C19649311uF> LLJJIJIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19650211uO.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C19650211uO.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        LLJJJ = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJJIL = 8;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIII.getValue(this, LLJJJ[0]);
    }

    public final VideoPublishEditModel F4() {
        return (VideoPublishEditModel) this.LLJJIJI.getValue(this, LLJJJ[1]);
    }

    public final int H4() {
        InterfaceC1417050myl interfaceC1417050myl = this.LLJJI;
        if (interfaceC1417050myl != null) {
            return interfaceC1417050myl.ZM1();
        }
        return 0;
    }

    public final int K4() {
        InterfaceC1417050myl interfaceC1417050myl = this.LLJJI;
        if (interfaceC1417050myl != null) {
            return interfaceC1417050myl.lw2();
        }
        return 0;
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19649611uI> o2() {
        return this.LLJJIJIIJIL;
    }

    @Override // ge.i, X.InterfaceC1455500nym
    public void show() {
        super.show();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C19649311uF> w2() {
        return this.LLJJIJIL;
    }

    public final void O4(boolean z) {
        InterfaceC1410280mnq interfaceC1410280mnq = this.LLJJ;
        if (interfaceC1410280mnq != null) {
            interfaceC1410280mnq.nI0(new AutoCutImageLoadResult(z, true, 0));
        }
    }

    public final Unit P4(boolean z) {
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null) {
            interfaceC1446740nkeJY0.rh0(z);
            return Unit.LIZ;
        }
        return null;
    }

    public final void T4(String str) {
        InterfaceC1417050myl interfaceC1417050myl = this.LLJJI;
        if (interfaceC1417050myl != null) {
            interfaceC1417050myl.Il2(str);
        }
    }

    @Override // X.InterfaceC1418610n1H
    public void Y81(VideoPublishEditModel videoPublishEditModel) {
        show();
        i3(new AwS608S0100000_29(videoPublishEditModel, 142));
    }

    @Override // X.InterfaceC1418610n1H
    public void fq1(List<SingleImageData> list) {
        i3(new AwS608S0100000_29(list, (List<SingleImageData>) 143));
    }

    @Override // X.InterfaceC1418610n1H
    public void kv1(boolean z) {
        i3(AFwS273S0000000_29.get$arr$(103));
    }

    @Override // X.InterfaceC1418610n1H
    public void yR1(boolean z) {
        if (z) {
            show();
        }
        i3(new AwS41S0010000_29(z, 11));
    }

    public C19650211uO(C1DRG c1drg, C19A3 c19a3) {
        super(c19a3);
        this.LLJILJILJ = c1drg;
        this.LLJILLL = c19a3;
        this.LLJJ = (InterfaceC1410280mnq) c1drg.LJIIL(null, InterfaceC1410280mnq.class);
        this.LLJJI = (InterfaceC1417050myl) c1drg.LJIIL(null, InterfaceC1417050myl.class);
        this.LLJJIII = new C1664740tQG(c1drg.LJIILIIL(null, InterfaceC1446740nke.class), InterfaceC1446740nke.class);
        this.LLJJIJI = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJIJIIJIL = new AwS573S0100000_29(this, 202);
        this.LLJJIJIL = new AwS573S0100000_29(this, 203);
    }

    @Override // X.InterfaceC1418610n1H
    public void BH2(int i, ImageSynthesisResult imageSynthesisResult) {
        i3(new AwS135S0101000_29(i, imageSynthesisResult, 2));
    }
}
