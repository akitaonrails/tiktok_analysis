package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNodeSrcInfo;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.tools.IAiChatFeatureService;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nNd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1432470nNd extends AbstractC2255721DQs<InterfaceC1432490nNf> implements InterfaceC1432490nNf, InterfaceC379610EuV {
    public static final C1432480nNe LLILZLL;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLIZ;
    public static final int LLIZLLLIL;
    public final C1DRG LL;
    public final InterfaceC1432490nNf LLILLJJLI = this;
    public final InterfaceC1731706qJ LLILLL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1432450nNb.class, null);
    public final InterfaceC1731706qJ LLILZ = C1664770tQJ.LIZ(getDiContainer(), VideoPublishEditModel.class, null);
    public final InterfaceC1731706qJ LLILZIL = C1664770tQJ.LIZ(getDiContainer(), InterfaceC1451050nrb.class, null);

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0nNe] */
    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1432470nNd.class, "applyComponent", "getApplyComponent()Lcom/ss/android/ugc/tools/entry/creation/api/AiChatEditApplyApi;", 0);
        C13LE.LIZ.getClass();
        LLIZ = new InterfaceC2217461Bqa[]{c2217381BqS, new C2217381BqS(C1432470nNd.class, "model", "getModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0), new C2217381BqS(C1432470nNd.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/image/preview/ImageEditPreviewApi;", 0)};
        LLILZLL = new Object() { // from class: X.0nNe
        };
        LLIZLLLIL = 8;
    }

    private final InterfaceC1432450nNb X1() {
        return (InterfaceC1432450nNb) this.LLILLL.getValue(this, LLIZ[0]);
    }

    private final InterfaceC1451050nrb o2() {
        return (InterfaceC1451050nrb) this.LLILZIL.getValue(this, LLIZ[2]);
    }

    private final VideoPublishEditModel w2() {
        return (VideoPublishEditModel) this.LLILZ.getValue(this, LLIZ[1]);
    }

    @Override // X.InterfaceC1432490nNf
    public void fq() {
        IAiChatFeatureService iAiChatFeatureService;
        InterfaceC21300818Xm interfaceC21300818XmLIZ;
        C21290818Tq.LIZ("AiChatEditFeatureComponent", "onToolbarItemClicked");
        X1();
        AIChatGenNode aIChatGenNodeZ1 = Z1();
        if (aIChatGenNodeZ1 == null || (iAiChatFeatureService = (IAiChatFeatureService) PluggableExtentionKt.pluggableSpi$default(IAiChatFeatureService.class, false, false, false, 14, null)) == null || (interfaceC21300818XmLIZ = iAiChatFeatureService.LIZ()) == null) {
            return;
        }
        Context contextLJIIIZ = C1664590tQ1.LJIIIZ(this);
        AIChatGenModel aIChatGenModel = w2().creativeModel.aiChatGenModel;
        String str = w2().mShootWay;
        if (str == null) {
            str = "";
        }
        String enterFrom = w2().getEnterFrom();
        interfaceC21300818XmLIZ.LIZJ(contextLJIIIZ, aIChatGenModel, aIChatGenNodeZ1, str, enterFrom != null ? enterFrom : "");
    }

    private final AIChatGenNode Z1() {
        List<SingleImageData> imageList;
        ImageAlbumData imageAlbumData = w2().getImageAlbumData();
        if (imageAlbumData != null && (imageList = imageAlbumData.getImageList()) != null) {
            AIChatGenModel aIChatGenModel = w2().creativeModel.aiChatGenModel;
            AIChatGenNode aIChatGenNode = aIChatGenModel != null ? aIChatGenModel.postAIChatGenNode : null;
            SingleImageData singleImageData = (SingleImageData) C13LP.LJJJLZIJ(o2().h7(), imageList);
            if (singleImageData != null) {
                ImageVideoSharedModel imageVideoSharedModel = singleImageData.getImageVideoSharedModel();
                if (Intrinsics.LJFF(imageVideoSharedModel != null ? imageVideoSharedModel.getAiChatGenNodeId() : null, aIChatGenNode != null ? aIChatGenNode.getUuid() : null)) {
                    return aIChatGenNode;
                }
                AIChatGenNodeSrcInfo aIChatGenNodeSrcInfo = new AIChatGenNodeSrcInfo(singleImageData.getSrcImageInfo().getPath(), singleImageData.getSrcImageInfo().getWidth(), singleImageData.getSrcImageInfo().getHeight());
                return new AIChatGenNode(UUID.randomUUID().toString(), aIChatGenNodeSrcInfo, null, Collections.singletonList(aIChatGenNodeSrcInfo), null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null);
            }
        }
        return null;
    }

    @Override // X.AbstractC2255721DQs
    public void onCreate() {
        super.onCreate();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onCreate ");
        sbLIZ.append(w2().creativeModel.aiChatGenModel);
        C21290818Tq.LIZ("AiChatEditFeatureComponent", C2188811AlT.LIZIZ(sbLIZ));
    }

    public InterfaceC1432490nNf W1() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LL;
    }

    public C1432470nNd(C1DRG c1drg) {
        this.LL = c1drg;
    }
}
