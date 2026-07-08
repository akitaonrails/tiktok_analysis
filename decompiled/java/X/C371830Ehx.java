package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.stickers.StickerNewEngineModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.aweme.tools.sticker.core.text.model.TextStickerModel;
import com.ss.android.ugc.gamora.editorpro.framework.datastore.EditModelProvider;
import ge.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS59S0210000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ehx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371830Ehx extends i<InterfaceC365030ESv, C371870Ei1, C371860Ei0, C1165904hF> implements InterfaceC379610EuV, InterfaceC365030ESv {
    public static final C371850Ehz LLJJJJ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJJIL;
    public static final int LLJJJJLIIL;
    public final C19A3 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final InterfaceC1731706qJ LLJJ;
    public final InterfaceC1731706qJ LLJJI;
    public final InterfaceC1731706qJ LLJJIII;
    public final InterfaceC1731706qJ LLJJIJI;
    public final InterfaceC1731706qJ LLJJIJIIJIL;
    public final InterfaceC1731706qJ LLJJIJIL;
    public boolean LLJJJ;
    public String LLJJJIL;

    /* JADX WARN: Type inference failed for: r0v13, types: [X.0Ehz] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C371830Ehx.class, "consoleBarApi", "getConsoleBarApi()Lcom/ss/ugc/android/editor/components/base/api/ConsoleBarApiComponent;", 0);
        C13LE.LIZ.getClass();
        LLJJJJJIL = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C371830Ehx.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0), new C2217381BqS(C371830Ehx.class, "captionRecognizeApi", "getCaptionRecognizeApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/EditorProCaptionRecognizeProviderApi;", 0), new C2217381BqS(C371830Ehx.class, "captionApi", "getCaptionApi()Lcom/ss/android/ugc/aweme/shortvideo/subtitle/CaptionApiComponent;", 0), new C2217381BqS(C371830Ehx.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0), new C2217381BqS(C371830Ehx.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLJJJJ = new Object() { // from class: X.0Ehz
        };
        LLJJJJLIIL = 8;
    }

    @Override // X.InterfaceC365030ESv
    public void UV() {
    }

    private final C0EPM F4() {
        return (C0EPM) this.LLJJIJI.getValue(this, LLJJJJJIL[3]);
    }

    private final C0ER1 H4() {
        return (C0ER1) this.LLJJIII.getValue(this, LLJJJJJIL[2]);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLJJIJIIJIL.getValue(this, LLJJJJJIL[4]);
    }

    private final InterfaceC360800ECo K4() {
        return (InterfaceC360800ECo) this.LLJJ.getValue(this, LLJJJJJIL[0]);
    }

    private final VideoPublishEditModel LJJJLIIL() {
        return (VideoPublishEditModel) this.LLJJIJIL.getValue(this, LLJJJJJIL[5]);
    }

    private final C0EY2 O4() {
        return (C0EY2) this.LLJJI.getValue(this, LLJJJJJIL[1]);
    }

    private final VideoPublishEditModel getEditModel() {
        if (C364210EPr.LIZIZ) {
            EditModelProvider.Companion.getClass();
            VideoPublishEditModel editModel = C0E1T.LIZ().getEditModel();
            if (editModel != null) {
                return editModel;
            }
        }
        return new VideoPublishEditModel();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00bb, code lost:
    
        if (r5 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String T4() {
        /*
            r6 = this;
            X.19A3 r0 = r6.LLJILJILJ
            android.content.Context r5 = r0.requireSceneContext()
            boolean r2 = r6.LLJJJ
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail[] r0 = X.C371890Ei3.LIZJ()
            r1 = 0
            if (r0 == 0) goto L87
            java.util.List r4 = X.C13LQ.LJJLL(r0)
        L13:
            r3 = 0
            if (r4 == 0) goto L80
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L80
            X.0Ei3 r0 = X.C371890Ei3.LIZ
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r0.getClass()
            X.C371890Ei3.LJ(r4)
            if (r2 == 0) goto L2f
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail r0 = X.C371890Ei3.LIZ(r5)
            com.bytedance.mt.protector.impl.collections.ListProtector.add(r4, r3, r0)
        L2f:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            java.lang.String r5 = r0.getAppLanguage()
            java.lang.String r0 = r6.LLJJJIL
            if (r0 == 0) goto L58
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            if (r0 != 0) goto L58
            java.lang.String r1 = r6.LLJJJIL
            if (r1 != 0) goto L47
            java.lang.String r1 = ""
        L47:
            int r0 = r1.length()
            if (r0 <= 0) goto L89
            java.lang.String r0 = r6.P4(r1)
            int r0 = r0.length()
            if (r0 <= 0) goto L89
            return r1
        L58:
            boolean r0 = r6.LLJJJ
            if (r0 == 0) goto L76
            java.util.List r0 = X.C1208004o2.LIZ()
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L76
            X.0Ei3 r1 = X.C371890Ei3.LIZ
            android.app.Activity r0 = X.C1664590tQ1.LJII(r6)
            r1.getClass()
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail r0 = X.C371890Ei3.LIZ(r0)
            java.lang.String r1 = r0.localName
            goto L47
        L76:
            X.0F5c r0 = new X.0F5c
            r0.<init>()
            java.lang.String r1 = r0.LIZ(r1)
            goto L47
        L80:
            java.lang.String r0 = "InlineCaptionFragment -> obtain language list failed"
            X.C201955140j.LIZ(r0)
            r4 = r1
            goto L2f
        L87:
            r4 = r1
            goto L13
        L89:
            java.lang.String r0 = "bn"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
            if (r0 == 0) goto L93
            java.lang.String r5 = "Bengali"
        L93:
            if (r4 == 0) goto Lbd
            java.util.Iterator r2 = r4.iterator()
        L99:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb1
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail) r0
            java.lang.String r0 = r0.localName
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L99
            if (r1 == 0) goto Lb1
        Lb0:
            return r5
        Lb1:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r4, r3)
            com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail r0 = (com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail) r0
            if (r0 == 0) goto Lbd
            java.lang.String r5 = r0.localName
            if (r5 != 0) goto Lb0
        Lbd:
            X.1Ds4 r0 = X.C0CHQ.LIZ()
            java.lang.String r5 = r0.getAppLanguage()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C371830Ehx.T4():java.lang.String");
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C371860Ei0> o2() {
        return AFwS191S0000000_5.get$arr$(179);
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C1165904hF> w2() {
        return new AwS549S0100000_5(this, 654);
    }

    @Override // X.InterfaceC365030ESv
    public void LJIIL() {
        hide();
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    public final C19A3 getParentScene() {
        return this.LLJILJILJ;
    }

    private final String P4(String str) {
        VideoPublishEditModel editModel;
        String str2;
        Context contextRequireSceneContext = this.LLJILJILJ.requireSceneContext();
        C0EY2 c0ey2O4 = O4();
        LanguageDetail languageDetail = null;
        if (c0ey2O4 != null) {
            editModel = c0ey2O4.getEditModel();
        } else {
            editModel = null;
        }
        ArrayList<LanguageDetail> arrayListLIZLLL = C371890Ei3.LIZLLL(contextRequireSceneContext, editModel);
        if (arrayListLIZLLL != null) {
            Iterator<LanguageDetail> it2 = arrayListLIZLLL.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                LanguageDetail next = it2.next();
                if (Intrinsics.LJFF(next.localName, str)) {
                    languageDetail = next;
                    break;
                }
            }
            LanguageDetail languageDetail2 = languageDetail;
            if (languageDetail2 != null && (str2 = languageDetail2.code) != null) {
                return str2;
            }
            return "";
        }
        return "";
    }

    @Override // X.InterfaceC365030ESv
    public void rx(C0ETT c0ett) {
        AbstractC2217051Bpv abstractC2217051BpvLLLFFI;
        MutableLiveData<Integer> mutableLiveData;
        CreativeModel creativeModel;
        StickerNewEngineModel stickerNewEngineModel;
        List<TextStickerModel> list;
        AbstractC2217051Bpv abstractC2217051BpvLLLFFI2;
        MutableLiveData<Integer> mutableLiveData2;
        InterfaceC360800ECo interfaceC360800ECoK4;
        boolean z = true;
        boolean z2 = false;
        if (C0E2B.LIZ() && (interfaceC360800ECoK4 = K4()) != null) {
            C0EB4.LIZIZ(interfaceC360800ECoK4, new EnumC373450EkZ[]{EnumC373450EkZ.UNDO, EnumC373450EkZ.REDO, EnumC373450EkZ.FULL_SCREEN, EnumC373450EkZ.KEY_FRAME}, 4, null, null, null, 28);
        }
        this.LLJJJ = c0ett.LJIIL;
        this.LLJJJIL = c0ett.LJIILJJIL;
        Integer value = null;
        if (C289250BVj.LIZ(getEditModel())) {
            C0EPM c0epmF4 = F4();
            if (c0epmF4 != null && (abstractC2217051BpvLLLFFI2 = c0epmF4.LLLFFI(null, true)) != null && (mutableLiveData2 = abstractC2217051BpvLLLFFI2.LJIL) != null) {
                value = mutableLiveData2.getValue();
            }
        } else {
            C0ER1 c0er1H4 = H4();
            if (c0er1H4 != null && (abstractC2217051BpvLLLFFI = c0er1H4.LLLFFI(null, true)) != null && (mutableLiveData = abstractC2217051BpvLLLFFI.LJIL) != null) {
                value = mutableLiveData.getValue();
            }
        }
        VideoPublishEditModel videoPublishEditModelLJJJLIIL = LJJJLIIL();
        if (videoPublishEditModelLJJJLIIL != null && (creativeModel = videoPublishEditModelLJJJLIIL.creativeModel) != null && (stickerNewEngineModel = creativeModel.stickerModel) != null && (list = stickerNewEngineModel.textStickerModels) != null) {
            if (!list.isEmpty()) {
                Iterator<TextStickerModel> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (C0F8Y.LJIIIIZZ(it2.next())) {
                        break;
                    }
                }
                z = false;
                z2 = z;
            } else {
                z = false;
                z2 = z;
            }
        }
        i3(new AwS59S0210000_5(c0ett, z2, value, 6));
        show();
    }

    public C371830Ehx(C19A3 c19a3, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c19a3;
        this.LLJILLL = c1drg;
        this.LLJJ = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC360800ECo.class, null);
        this.LLJJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EY2.class, null);
        this.LLJJIII = C1664770tQJ.LIZIZ(getDiContainer(), C0ER1.class, null);
        this.LLJJIJI = C1664770tQJ.LIZIZ(getDiContainer(), C0EPM.class, null);
        this.LLJJIJIIJIL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
        this.LLJJIJIL = C1664770tQJ.LIZIZ(getDiContainer(), VideoPublishEditModel.class, null);
    }
}
