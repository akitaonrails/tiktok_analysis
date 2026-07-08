package X;

import androidx.lifecycle.LiveData;
import com.ss.android.ugc.aweme.feed.model.im.MixStickerInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.common.model.UrlModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS91S1300000_29;

/* JADX INFO: renamed from: X.11zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19684811zy extends AbstractC2255721DQs<AnonymousClass1201> implements InterfaceC379610EuV, AnonymousClass1201 {
    public static final AnonymousClass1200 LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public static final C1910890zpH LLJ;
    public final C1DRG LL;
    public final InterfaceC1731706qJ LLILLJJLI = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1446740nke.class, null);
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZIZ(getDiContainer(), InterfaceC1461350o8D.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final AnonymousClass1201 LLILZIL = this;

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1200] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C19684811zy.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/gamora/editor/preview/TiktokEditPreviewApi;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C19684811zy.class, "editStickerApi", "getEditStickerApi()Lcom/ss/android/ugc/gamora/editor/sticker/core/EditStickerApi;", 0), new C2217381BqS(C19684811zy.class, "editModel", "getEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0)};
        LLILZLL = new Object() { // from class: X.1200
        };
        LLIZLLLIL = 8;
        LLJ = C1910890zpH.LIZLLL.LIZ(EnumC1910860zpE.SOCIAL_AVATAR);
    }

    private final InterfaceC1446740nke JY0() {
        return (InterfaceC1446740nke) this.LLILLJJLI.getValue(this, LLIZ[0]);
    }

    private final VideoPublishEditModel getEditModel() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[2]);
    }

    private final InterfaceC1461350o8D o2() {
        return (InterfaceC1461350o8D) this.LLILLL.getValue(this, LLIZ[1]);
    }

    private final void W1() {
        final MixStickerInfo mixStickerInfo = getEditModel().creativeModel.mixStickerInfo;
        final C0VSJ c0vsj = new C0VSJ(C0CHQ.LIZ().LJJIIJZLJL().getPathAdapter().LJIILJJIL(""));
        C1331660kl2.LJIIJ(new C03IT(mixStickerInfo != null ? mixStickerInfo.getStickerUrls() : null)).LJIILJJIL(new InterfaceC605070NoH() { // from class: X.11zz
            @Override // X.InterfaceC605070NoH
            public final void onCanceled() {
                C19684811zy.LLJ.LIZ("AnimatedStoryComponent", "mix sticker image download canceled");
            }

            @Override // X.InterfaceC605070NoH
            public final void LIZ(File file) throws Throwable {
                String string;
                Long stickerId;
                C0VSJ c0vsj2 = new C0VSJ(c0vsj, "sticker_image.webp");
                File parentFile = c0vsj2.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                if (file != null) {
                    C08QA.LJIILLIIL(file, c0vsj2, true, 4);
                }
                MixStickerInfo mixStickerInfo2 = mixStickerInfo;
                if (mixStickerInfo2 == null || (stickerId = mixStickerInfo2.getStickerId()) == null || (string = stickerId.toString()) == null || string.length() <= 0) {
                    string = "mix_studio_anim";
                }
                C01TT.LIZLLL(new AwS91S1300000_29(this, c0vsj2, string, mixStickerInfo, 1));
            }

            @Override // X.InterfaceC605070NoH
            public final void onFailed(Throwable th) {
                C19684811zy.LLJ.LIZ("AnimatedStoryComponent", "mix sticker image download failed");
            }
        });
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        if (getEditModel().creativeModel.draftInfoModel.isDraft) {
            return;
        }
        W1();
    }

    public AnonymousClass1201 Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C19684811zy(C1DRG c1drg) {
        this.LL = c1drg;
    }

    private final Effect X1(File file, String str, MixStickerInfo mixStickerInfo) {
        List<String> stickerUrls;
        Effect effect = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0L, null, null, 0L, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0L, null, null, null, 0L, 0L, null, null, null, null, null, false, false, -1, -1, 15, null);
        effect.setId(str);
        effect.setEffectId(str);
        effect.setEffect_id(str);
        effect.setResource_id(str);
        effect.setResourceId(str);
        effect.setEffectType(0);
        effect.setUnzipPath(file.getAbsolutePath());
        effect.setTags(C1697810uHb.LJ("mix_studio_story_sticker"));
        UrlModel iconUrl = effect.getIconUrl();
        if (mixStickerInfo == null || (stickerUrls = mixStickerInfo.getStickerUrls()) == null) {
            stickerUrls = C13BV.INSTANCE;
        }
        iconUrl.setUrlList(new ArrayList(stickerUrls));
        return effect;
    }

    public final void w2(File file, String str, MixStickerInfo mixStickerInfo) {
        C0FW6 c0fw6LJIIIZ;
        LiveData<InterfaceC1452170ntP> liveDataG;
        InterfaceC1452170ntP value;
        C348100Dkm c348100DkmLIZIZ;
        InterfaceC1461350o8D interfaceC1461350o8DO2 = o2();
        InterfaceC1446740nke interfaceC1446740nkeJY0 = JY0();
        if (interfaceC1446740nkeJY0 != null && (liveDataG = interfaceC1446740nkeJY0.g()) != null && (value = liveDataG.getValue()) != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(value)) != null) {
            c0fw6LJIIIZ = c348100DkmLIZIZ.LJIIIZ();
        } else {
            c0fw6LJIIIZ = null;
        }
        if (interfaceC1461350o8DO2 != null) {
            interfaceC1461350o8DO2.Ph(X1(file, str, mixStickerInfo), null);
            LLJ.LIZ("AnimatedStoryComponent", "animated mix sticker added via EditStickerApi.onStickerChoose");
        } else {
            if (c0fw6LJIIIZ != null) {
                C348460DlM c348460DlM = new C348460DlM(0);
                c348460DlM.LJIIL = file.getAbsolutePath();
                c348460DlM.LJIILL = str;
                c0fw6LJIIIZ.LJIIL(c348460DlM);
                LLJ.LJII("AnimatedStoryComponent", "animated mix sticker added via NLE stickerManager; no EditStickerApi — limited overlay");
                return;
            }
            LLJ.LJII("AnimatedStoryComponent", "animated mix sticker not added: EditStickerApi and NLE stickerManager missing");
        }
    }
}
