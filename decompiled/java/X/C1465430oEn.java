package X;

import Y.AObjectS245S0100000_22;
import Y.AObserverS225S0100000_22;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VESize;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oEn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465430oEn extends AbstractC2255721DQs<InterfaceC1454730nxX> implements InterfaceC1454730nxX, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLILZLL;
    public static final int LLIZ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1455850nzL.class, null);
    public InterfaceC1452170ntP LLILZIL;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465430oEn.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1465430oEn.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1465430oEn.class, "editAdapterApi", "getEditAdapterApi()Lcom/ss/android/ugc/gamora/editor/adapter/EditAdapterApi;", 0);
        c09r3.getClass();
        LLILZLL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLIZ = 8;
    }

    public InterfaceC1454730nxX X1() {
        return this;
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLL.getValue(this, LLILZLL[1]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLILZLL[0]);
    }

    public final InterfaceC1455850nzL Z1() {
        return (InterfaceC1455850nzL) this.LLILZ.getValue(this, LLILZLL[2]);
    }

    @Override // X.InterfaceC1454730nxX
    public void e6() {
        InfoStickerModel infoStickerModel;
        String str;
        InterfaceC1452170ntP value = JY0().g().getValue();
        if (value == null) {
            return;
        }
        this.LLILZIL = value;
        if (LJJJLIIL().getInfoStickerModel() == null) {
            LJJJLIIL().setInfoStickerModel(new InfoStickerModel());
        }
        InfoStickerModel infoStickerModel2 = LJJJLIIL().getInfoStickerModel();
        if ((infoStickerModel2 == null || infoStickerModel2.stickers == null) && (infoStickerModel = LJJJLIIL().getInfoStickerModel()) != null) {
            infoStickerModel.stickers = new ArrayList();
        }
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.type = 2;
        WWAModel wWAModel = LJJJLIIL().creativeModel.initialModel.wwaModel;
        if (wWAModel == null || (str = wWAModel.textSticker) == null || a0.LJJJIL(str)) {
            return;
        }
        WWAModel wWAModel2 = LJJJLIIL().creativeModel.initialModel.wwaModel;
        if (wWAModel2 != null) {
            wWAModel2.textSticker = null;
        }
        TextStickerData textStickerDataW1 = W1(str);
        C0F7U.LJIIJ(C1664590tQ1.LJIIIZ(this), JY0(), "music_promotion_text_sticker", textStickerDataW1, new AwS231S0300000_22(this, stickerItemModel, textStickerDataW1, 22));
    }

    public final void o2() {
        if (C1416310mxZ.LJJLIIIJJIZ(LJJJLIIL())) {
            JY0().l02().observe(this, new AObserverS225S0100000_22(this, 100));
        } else {
            e6();
        }
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        JY0().ww2().observe(this, new AObjectS245S0100000_22(this, 166));
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        X1();
        return this;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1465430oEn(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final TextStickerData W1(String str) {
        int i;
        int i2;
        VESize initSize;
        VESize initSize2;
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZIL;
        int duration = 0;
        if (interfaceC1452170ntP != null && (initSize2 = interfaceC1452170ntP.getInitSize()) != null) {
            i = initSize2.width;
        } else {
            i = 0;
        }
        InterfaceC1452170ntP interfaceC1452170ntP2 = this.LLILZIL;
        if (interfaceC1452170ntP2 != null && (initSize = interfaceC1452170ntP2.getInitSize()) != null) {
            i2 = initSize.height;
        } else {
            i2 = 0;
        }
        TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        textStickerData.setStartTime(0);
        InterfaceC1452170ntP interfaceC1452170ntP3 = this.LLILZIL;
        if (interfaceC1452170ntP3 != null) {
            duration = interfaceC1452170ntP3.getDuration();
        }
        textStickerData.setEndTime(duration);
        textStickerData.setX(i * 0.5f);
        textStickerData.setY(i2 * 0.5f);
        textStickerData.setTextStr(str);
        textStickerData.setTextWrapList(C123P.LIZLLL(str));
        textStickerData.setBgMode(1);
        textStickerData.setColor(-1);
        textStickerData.setFontType("Proxima-Nova-Semibold.otf");
        return textStickerData;
    }
}
