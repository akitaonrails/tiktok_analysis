package X;

import Y.AObserverS225S0100000_22;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.creative.model.WWAModel;
import com.ss.android.ugc.aweme.editSticker.model.InfoStickerModel;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0oEo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465440oEo extends AbstractC2255721DQs<InterfaceC1451410nsB> implements InterfaceC1451410nsB, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZLLLIL;
    public static final int LLJ;
    public final C1DRG LL;
    public InterfaceC1452170ntP LLILZ;
    public boolean LLILZIL;
    public String LLILZLL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);
    public final InterfaceC1731706qJ LLIZ = C1664770tQJ.LIZIZ(getDiContainer(), C0FVY.class, null);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465440oEo.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1465440oEo.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1465440oEo.class, "itemEditStickerNewEngineApi", "getItemEditStickerNewEngineApi()Lcom/ss/android/ugc/aweme/image/sticker/newengine/ItemEditStickerNewEngineApi;", 0);
        c09r3.getClass();
        LLIZLLLIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3};
        LLJ = 8;
    }

    public InterfaceC1451410nsB X1() {
        return this;
    }

    private final InterfaceC1451050nrb Z1() {
        return (InterfaceC1451050nrb) this.LLILLL.getValue(this, LLIZLLLIL[1]);
    }

    public final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLILLJJLI.getValue(this, LLIZLLLIL[0]);
    }

    public final C0FVY o2() {
        return (C0FVY) this.LLIZ.getValue(this, LLIZLLLIL[2]);
    }

    public final void w2() {
        if (this.LLILZIL) {
            return;
        }
        this.LLILZIL = true;
        if (C1416310mxZ.LJJLIIIJJIZ(LJJJLIIL())) {
            e6();
        } else {
            e6();
        }
    }

    @Override // X.InterfaceC1451410nsB
    public void e6() {
        InfoStickerModel infoStickerModel;
        ViewGroup viewGroup;
        InterfaceC1452170ntP value = Z1().g().getValue();
        if (value == null) {
            return;
        }
        this.LLILZ = value;
        if (LJJJLIIL().getInfoStickerModel() == null) {
            LJJJLIIL().setInfoStickerModel(new InfoStickerModel());
        }
        InfoStickerModel infoStickerModel2 = LJJJLIIL().getInfoStickerModel();
        if ((infoStickerModel2 == null || infoStickerModel2.stickers == null) && (infoStickerModel = LJJJLIIL().getInfoStickerModel()) != null) {
            infoStickerModel.stickers = new ArrayList();
        }
        StickerItemModel stickerItemModel = new StickerItemModel();
        stickerItemModel.type = 2;
        String str = this.LLILZLL;
        if (str == null) {
            return;
        }
        TextStickerData textStickerDataW1 = W1(str);
        C0FVY c0fvyO2 = o2();
        View viewXw = c0fvyO2 != null ? c0fvyO2.xw() : null;
        if (!(viewXw instanceof ViewGroup) || (viewGroup = (ViewGroup) viewXw) == null) {
            return;
        }
        C0F7U.LJIIIZ(C1664590tQ1.LJIIIZ(this), viewGroup, "music_promotion_text_sticker", textStickerDataW1, new AwS231S0300000_22(this, stickerItemModel, textStickerDataW1, 21));
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        String str;
        super.onCreate();
        WWAModel wWAModel = LJJJLIIL().creativeModel.initialModel.wwaModel;
        if (wWAModel == null || (str = wWAModel.textSticker) == null || a0.LJJJIL(str)) {
            return;
        }
        WWAModel wWAModel2 = LJJJLIIL().creativeModel.initialModel.wwaModel;
        if (wWAModel2 != null) {
            wWAModel2.textSticker = null;
        }
        this.LLILZLL = str;
        Z1().gJ().observe(this, new AObserverS225S0100000_22(this, 99));
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

    public C1465440oEo(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final TextStickerData W1(String str) {
        TextStickerData textStickerData = new TextStickerData(null, 0, 0, 0, null, null, 0, 0, 0, 0, null, null, false, null, 0L, 0L, 0.0f, 0.0f, 0L, false, false, false, null, null, 0.0f, 0.0f, false, false, false, 0, null, null, null, null, 0, null, null, 0, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, 0, 0, 0.0f, null, false, null, null, null, null, null, null, null, false, null, 0L, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, false, false, 0, 0, null, 0, null, null, null, null, null, false, false, null, null, false, false, false, false, null, -1, -1, -1, 4095, null);
        int duration = 0;
        textStickerData.setStartTime(0);
        InterfaceC1452170ntP interfaceC1452170ntP = this.LLILZ;
        if (interfaceC1452170ntP != null) {
            duration = interfaceC1452170ntP.getDuration();
        }
        textStickerData.setEndTime(duration);
        textStickerData.setX(0.0f);
        textStickerData.setY(0.0f);
        textStickerData.setTextStr(str);
        textStickerData.setTextWrapList(C123P.LIZLLL(str));
        textStickerData.setBgMode(1);
        textStickerData.setColor(-1);
        textStickerData.setFontType("Proxima-Nova-Semibold.otf");
        return textStickerData;
    }
}
