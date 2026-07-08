package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.ImageVideoSharedModel;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode;
import com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenPrompt;
import com.ss.android.ugc.aweme.creative.model.edit.ImageAlbumData;
import com.ss.android.ugc.aweme.creative.model.edit.SingleImageData;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.tools.service.AiChatFeatureServiceImpl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS194S0000000_8;

/* JADX INFO: renamed from: X.1EPA, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EPA extends C09AY implements Function0<C569210MUd> {
    public final /* synthetic */ AiChatFeatureServiceImpl LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1EPA(AiChatFeatureServiceImpl aiChatFeatureServiceImpl) {
        super(0);
        this.LL = aiChatFeatureServiceImpl;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0MUd] */
    @Override // kotlin.jvm.functions.Function0
    public final C569210MUd invoke() {
        if (this.LL.LIZIZ().isFeatureEnabled()) {
            return new InterfaceC1429470nIn() { // from class: X.0MUd
                public final C01GW LIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(620));

                @Override // X.InterfaceC1429470nIn
                public final InterfaceC528120KnS LIZIZ() {
                    return (InterfaceC528120KnS) this.LIZ.getValue();
                }

                @Override // X.InterfaceC1429470nIn
                public final boolean LJIIIIZZ(CreativeModel creativeModel) {
                    if (creativeModel == null || creativeModel.aiChatGenModel == null) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC1429470nIn
                public final boolean LIZ(CreativeModel creativeModel, int i) {
                    List<SingleImageData> imageList;
                    ImageVideoSharedModel imageVideoSharedModel;
                    ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
                    if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null || imageList.size() <= i || (imageVideoSharedModel = ((SingleImageData) ListProtector.get(imageList, i)).getImageVideoSharedModel()) == null || imageVideoSharedModel.getAiChatGenNodeId() == null) {
                        return false;
                    }
                    return true;
                }

                @Override // X.InterfaceC1429470nIn
                public final List<Integer> LJI(CreativeModel creativeModel, boolean z) {
                    List<SingleImageData> imageList;
                    Integer numValueOf;
                    int i = 0;
                    if (z) {
                        ImageAlbumData imageAlbumData = creativeModel.imageAlbumModel;
                        if (imageAlbumData == null || (imageList = imageAlbumData.getImageList()) == null) {
                            return null;
                        }
                        ArrayList arrayList = new ArrayList();
                        for (SingleImageData singleImageData : imageList) {
                            int i2 = i + 1;
                            if (i >= 0) {
                                ImageVideoSharedModel imageVideoSharedModel = singleImageData.getImageVideoSharedModel();
                                if (imageVideoSharedModel != null && imageVideoSharedModel.getAiChatGenNodeId() != null && (numValueOf = Integer.valueOf(i)) != null) {
                                    arrayList.add(numValueOf);
                                }
                                i = i2;
                            } else {
                                C1697810uHb.LJIJI();
                                throw null;
                            }
                        }
                        return arrayList;
                    }
                    return Collections.singletonList(0);
                }

                @Override // X.InterfaceC1429470nIn
                public final AIChatGenPrompt LIZJ(CreativeModel creativeModel, EditPreviewInfo editPreviewInfo, boolean z) {
                    AIChatGenNode aIChatGenNodeLIZLLL = LIZLLL(creativeModel, editPreviewInfo, z);
                    if (aIChatGenNodeLIZLLL != null) {
                        return aIChatGenNodeLIZLLL.getPrompt();
                    }
                    return null;
                }

                /* JADX WARN: Removed duplicated region for block: B:57:0x00b3  */
                @Override // X.InterfaceC1429470nIn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeModel r10, com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r11, boolean r12) {
                    /*
                        Method dump skipped, instruction units count: 253
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C569210MUd.LIZLLL(com.ss.android.ugc.aweme.creative.model.CreativeModel, com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean):com.ss.android.ugc.aweme.creative.model.aichat.AIChatGenNode");
                }

                /* JADX WARN: Removed duplicated region for block: B:48:0x0082  */
                /* JADX WARN: Removed duplicated region for block: B:56:0x00b3  */
                /* JADX WARN: Removed duplicated region for block: B:61:0x00c2  */
                @Override // X.InterfaceC1429470nIn
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean LJ(com.ss.android.ugc.aweme.creative.model.CreativeModel r10, com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo r11, boolean r12) {
                    /*
                        Method dump skipped, instruction units count: 300
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C569210MUd.LJ(com.ss.android.ugc.aweme.creative.model.CreativeModel, com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo, boolean):boolean");
                }

                @Override // X.InterfaceC1429470nIn
                public final boolean LJFF(CreativeModel creativeModel, EditPreviewInfo editPreviewInfo, boolean z) {
                    if (LIZLLL(creativeModel, editPreviewInfo, z) != null) {
                        return true;
                    }
                    return false;
                }

                @Override // X.InterfaceC1429470nIn
                public final Integer LJII(CreativeModel creativeModel, EditPreviewInfo editPreviewInfo, boolean z) {
                    AIChatGenNode aIChatGenNodeLIZLLL = LIZLLL(creativeModel, editPreviewInfo, z);
                    if (aIChatGenNodeLIZLLL != null) {
                        return aIChatGenNodeLIZLLL.getContextOriginImageCount();
                    }
                    return null;
                }
            };
        }
        return null;
    }
}
