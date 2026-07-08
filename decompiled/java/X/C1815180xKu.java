package X;

import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.intelligent.RichTextPreviewView;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.cell.IntelligentDecorationBoardForYouPowerCell;
import com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.templates.intelligent.assems.vm.IntelligentBoardTemplateForYouListViewModel;
import com.bytedance.android.livesdk.model.Board;
import com.bytedance.android.livesdk.model.RecommendBoardInfo;
import com.bytedance.android.livesdk.model.SourcePB;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0xKu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1815180xKu extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ IntelligentDecorationBoardForYouPowerCell LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1815180xKu(IntelligentDecorationBoardForYouPowerCell intelligentDecorationBoardForYouPowerCell) {
        super(1);
        this.LL = intelligentDecorationBoardForYouPowerCell;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        RichTextPreviewView richTextPreviewView;
        String str;
        Bitmap bitmapLIZLLL;
        SourcePB sourcePB;
        InterfaceC1814530xJr boardsDisplayStateManager;
        String str2;
        View view2 = view;
        IntelligentDecorationBoardForYouPowerCell intelligentDecorationBoardForYouPowerCell = this.LL;
        C1157020gDM c1157020gDM = intelligentDecorationBoardForYouPowerCell.LLIZ;
        if (c1157020gDM != null && (richTextPreviewView = intelligentDecorationBoardForYouPowerCell.LLILLJJLI) != null) {
            final IntelligentBoardTemplateForYouListViewModel intelligentBoardTemplateForYouListViewModelI5 = intelligentDecorationBoardForYouPowerCell.I5();
            view2.getContext();
            final Board boardLIZ = C125800ds.LIZ(c1157020gDM.LL);
            if (boardLIZ != null) {
                RecommendBoardInfo recommendBoardInfo = boardLIZ.recommendBoardInfo;
                if (recommendBoardInfo != null && recommendBoardInfo.recommendBoardId != 0) {
                    boardLIZ.id = 0L;
                }
                if (C500260Jjc.LJJIJLIJ()) {
                    String str3 = "";
                    InterfaceC390601fU effectBoardService = ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getEffectBoardService("anchor", "");
                    if (effectBoardService != null) {
                        effectBoardService.LJ();
                    }
                    IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
                    if (iEffectService != null && (boardsDisplayStateManager = iEffectService.getBoardsDisplayStateManager()) != null) {
                        HashMap map = new HashMap();
                        String str4 = ((C1218790hoz) intelligentBoardTemplateForYouListViewModelI5.LLJILJIL.getValue()).LL;
                        if (str4 != null) {
                            str3 = str4;
                        }
                        map.put("decoration_entrance", str3);
                        if (C125800ds.LIZIZ(boardLIZ)) {
                            str2 = "1";
                        } else {
                            str2 = CardStruct.IStatusCode.DEFAULT;
                        }
                        map.put("is_empty", str2);
                        map.put("previous_page", "decoration_template_edit");
                        boardsDisplayStateManager.LJI(boardLIZ, map);
                    }
                    intelligentBoardTemplateForYouListViewModelI5.LL.gD();
                    intelligentBoardTemplateForYouListViewModelI5.LL.mY();
                    intelligentBoardTemplateForYouListViewModelI5.xQ2("edit");
                } else {
                    RecommendBoardInfo recommendBoardInfo2 = boardLIZ.recommendBoardInfo;
                    if (recommendBoardInfo2 != null && (sourcePB = recommendBoardInfo2.sourcePb) != null) {
                        str = sourcePB.generateVersion;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str, "image_version")) {
                        ImageModel imageModel = boardLIZ.previewImage;
                        if (imageModel == null && (imageModel = (ImageModel) C13LP.LJJJLL(boardLIZ.previewImageList)) == null) {
                            intelligentBoardTemplateForYouListViewModelI5.LL.QL1(boardLIZ, null);
                        } else {
                            C1121670fIL.LJ(imageModel).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLL(new C09JN() { // from class: X.0xKv
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("IntelligentBoardTemplateForYouListViewModel@e08f.loadImageVersionPreviewAndSave$1");
                                    intelligentBoardTemplateForYouListViewModelI5.LL.QL1(boardLIZ, (Bitmap) obj);
                                    C1C7U.LIZIZ("IntelligentBoardTemplateForYouListViewModel@e08f.loadImageVersionPreviewAndSave$1");
                                }
                            }, new C09JN() { // from class: X.0xKw
                                @Override // X.C09JN
                                public final void accept(Object obj) {
                                    C1C7U.LIZ("IntelligentBoardTemplateForYouListViewModel@e08f.loadImageVersionPreviewAndSave$2");
                                    intelligentBoardTemplateForYouListViewModelI5.LL.QL1(boardLIZ, null);
                                    C1C7U.LIZIZ("IntelligentBoardTemplateForYouListViewModel@e08f.loadImageVersionPreviewAndSave$2");
                                }
                            });
                        }
                    } else {
                        ViewGroup dslBoardContainer = richTextPreviewView.getDslBoardContainer();
                        if (dslBoardContainer != null && (bitmapLIZLLL = C1092440eXC.LIZLLL(dslBoardContainer)) != null) {
                            intelligentBoardTemplateForYouListViewModelI5.LL.QL1(boardLIZ, bitmapLIZLLL);
                        }
                    }
                    intelligentBoardTemplateForYouListViewModelI5.xQ2("use");
                }
            }
        }
        return Unit.LIZ;
    }
}
