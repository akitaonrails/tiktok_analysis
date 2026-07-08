package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS587S0100000_8;

/* JADX INFO: renamed from: X.0KjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C525530KjH implements InterfaceC469360Ias {
    public final /* synthetic */ C526910KlV LL;

    public C525530KjH(C526910KlV c526910KlV) {
        this.LL = c526910KlV;
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrollStateChanged(int i) {
        C527400KmI c527400KmI = null;
        C527270Km5 c527270Km5 = null;
        if (i == 1) {
            C526910KlV c526910KlV = this.LL;
            C527270Km5 c527270Km52 = c526910KlV.LLJJIJI;
            if (c527270Km52 != null) {
                c527270Km5 = c527270Km52;
            }
            c526910KlV.LLJJIII = c527270Km5.getCurrentItem();
            return;
        }
        C527270Km5 c527270Km53 = this.LL.LLJJIJI;
        if (c527270Km53 == null) {
            c527270Km53 = null;
        }
        int currentItem = c527270Km53.getCurrentItem();
        C526910KlV c526910KlV2 = this.LL;
        int i2 = c526910KlV2.LLJJIII;
        if (currentItem != i2 || i != 0) {
            return;
        }
        C527400KmI c527400KmI2 = c526910KlV2.LLJJIJIIJIL;
        if (c527400KmI2 != null) {
            c527400KmI = c527400KmI2;
        }
        InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI.LJJIZ(i2);
        if (interfaceC525540KjILJJIZ == null) {
            return;
        }
        interfaceC525540KjILJJIZ.LJJZZIII();
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageSelected(int i) {
        boolean z;
        Integer numLLLLJ;
        ArrayList<TikTokMediaModel> arrayList;
        if (this.LL.getSceneContext() == null) {
            return;
        }
        this.LL.LLLJ = i;
        C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoPickPreview [PreviewRoot] onPageSelected: page=");
        sbLIZ.append(i);
        sbLIZ.append(", firstEnter=");
        sbLIZ.append(this.LL.LLJILLL);
        sbLIZ.append(", canShowDock=");
        sbLIZ.append(this.LL.LLLLIILL.showDockInPreviewPage);
        sbLIZ.append(", adapterNull=");
        if (this.LL.LLLILZ == null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", vpDataSize=");
        C527400KmI c527400KmI = this.LL.LLJJIJIIJIL;
        Integer numValueOf = null;
        if (c527400KmI == null) {
            c527400KmI = null;
        }
        sbLIZ.append(c527400KmI.LLJIJIL.size());
        C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LL.LLLLIILL;
        if (choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isEditorProReplace || choosePhotoPreviewPageConfig.LIZJ() || C529980KqS.LIZJ(this.LL.LLLLIILL.chooseSceneMode)) {
            this.LL.getClass();
            C526910KlV c526910KlV = this.LL;
            C527400KmI c527400KmI2 = c526910KlV.LLJJIJIIJIL;
            if (c527400KmI2 == null) {
                c527400KmI2 = null;
            }
            c526910KlV.LLZLI(c527400KmI2.LLJIJIL);
            this.LL.LLZLLIL();
        }
        C526910KlV c526910KlV2 = this.LL;
        C527400KmI c527400KmI3 = c526910KlV2.LLJJIJIIJIL;
        if (c527400KmI3 == null) {
            c527400KmI3 = null;
        }
        InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI3.LJJIZ(c526910KlV2.LLLJ);
        if (interfaceC525540KjILJJIZ != null) {
            interfaceC525540KjILJJIZ.onPageSelected();
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig2 = this.LL.LLLLIILL;
        if (!choosePhotoPreviewPageConfig2.isUgcTemplate && !choosePhotoPreviewPageConfig2.isEditorProReplace && !choosePhotoPreviewPageConfig2.LIZJ()) {
            C526910KlV c526910KlV3 = this.LL;
            C527400KmI c527400KmI4 = c526910KlV3.LLJJIJIIJIL;
            if (c527400KmI4 == null) {
                c527400KmI4 = null;
            }
            c526910KlV3.LLZLI(c527400KmI4.LLJIJIL);
        }
        C526910KlV c526910KlV4 = this.LL;
        if (!c526910KlV4.LLJILLL) {
            C527400KmI c527400KmI5 = c526910KlV4.LLJJIJIIJIL;
            if (c527400KmI5 == null) {
                c527400KmI5 = null;
            }
            c526910KlV4.LLLLILI(c527400KmI5.LLJIJIL, new AwS587S0100000_8(c526910KlV4, 212));
            C527400KmI c527400KmI6 = this.LL.LLJJIJIIJIL;
            if (c527400KmI6 == null) {
                c527400KmI6 = null;
            }
            TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) C13LP.LJJJLZIJ(i, c527400KmI6.LLJIJIL);
            if (tikTokMediaModel != null) {
                C526910KlV c526910KlV5 = this.LL;
                ChooseMediaViewModel chooseMediaViewModel = c526910KlV5.LLJJJJJIL;
                if (chooseMediaViewModel == null) {
                    chooseMediaViewModel = null;
                }
                chooseMediaViewModel.getClass();
                chooseMediaViewModel.yR2(new AwS587S0100000_8(tikTokMediaModel, 149));
                if (c526910KlV5.LLLLIILL.showDockInPreviewPage) {
                    AbstractC529520Kpi abstractC529520Kpi = c526910KlV5.LLLILZ;
                    if (abstractC529520Kpi != null) {
                        numLLLLJ = abstractC529520Kpi.LLLLJ(tikTokMediaModel);
                    } else {
                        numLLLLJ = null;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("AutoPickPreview [PreviewRoot] onPageSelected setPreviewItem: id=");
                    sbLIZ2.append(((MediaModel) tikTokMediaModel).id);
                    sbLIZ2.append(", selectIndex=");
                    sbLIZ2.append(tikTokMediaModel.selectIndex);
                    sbLIZ2.append(", result=");
                    sbLIZ2.append(numLLLLJ);
                    sbLIZ2.append(", dockMediaSize=");
                    AbstractC529520Kpi abstractC529520Kpi2 = c526910KlV5.LLLILZ;
                    if (abstractC529520Kpi2 != null && (arrayList = abstractC529520Kpi2.LL) != null) {
                        numValueOf = Integer.valueOf(arrayList.size());
                    }
                    sbLIZ2.append(numValueOf);
                    C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ2));
                    if (numLLLLJ != null) {
                        c526910KlV5.LLLLIL(numLLLLJ.intValue() + 1);
                    }
                }
            }
            C526910KlV c526910KlV6 = this.LL;
            if (!c526910KlV6.LLLLIILL.isFromAutoCutAgent) {
                c526910KlV6.LLLZ();
            }
        }
    }

    @Override // X.InterfaceC469360Ias
    public final void onPageScrolled(int i, float f, int i2) {
        C527270Km5 c527270Km5 = this.LL.LLJJIJI;
        C527400KmI c527400KmI = null;
        if (c527270Km5 == null) {
            c527270Km5 = null;
        }
        int currentItem = c527270Km5.getCurrentItem();
        C526910KlV c526910KlV = this.LL;
        int i3 = c526910KlV.LLJJIII;
        if (currentItem == i3 && i2 > 0) {
            C527400KmI c527400KmI2 = c526910KlV.LLJJIJIIJIL;
            if (c527400KmI2 != null) {
                c527400KmI = c527400KmI2;
            }
            InterfaceC525540KjI interfaceC525540KjILJJIZ = c527400KmI.LJJIZ(i3);
            if (interfaceC525540KjILJJIZ != null) {
                interfaceC525540KjILJJIZ.LLJ();
            }
        }
    }
}
