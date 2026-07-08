package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS566S0100000_22;

/* JADX INFO: renamed from: X.0oER, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465210oER extends C1465200oEQ {
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;

    @Override // X.C1465200oEQ
    public final int LLLIIIIL() {
        return 46;
    }

    @Override // X.C1465200oEQ
    public final boolean LLLLIIIILLL(EffectCategoryResponse effectCategoryResponse) {
        return false;
    }

    @Override // X.C1465200oEQ
    public final void LLLJL() {
        if (this.LLJILLL <= 0) {
            return;
        }
        Long lLIZJ = LLLIILIL().Cu().LIZJ();
        if (lLIZJ.longValue() <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - lLIZJ.longValue();
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        C0EU6 c0eu6 = (C0EU6) this.LLJJLIIIJLLLLLLLZ.getValue();
        Long lValueOf = Long.valueOf(jCurrentTimeMillis);
        Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
        c0eu6.getClass();
        if (lValueOf != null) {
            c0eu6.LIZLLL = Long.valueOf(lValueOf.longValue());
        }
        if (lValueOf2 != null) {
            c0eu6.LJFF = Long.valueOf(lValueOf2.longValue());
        }
        c0eu6.LIZ();
        super.LLLJL();
    }

    public C1465210oER(C1DRG c1drg) {
        super(c1drg);
        this.LLJJL = C452501pT.LIZIZ(new AwS566S0100000_22(c1drg, 794));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 795));
    }

    @Override // X.C1465200oEQ
    public final boolean LLLII(Effect effect) {
        boolean z;
        List<String> listLJJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJ(C1428470nHB.LJJZZI(LLLILZ()), C1428470nHB.LLIIIJ(LLLILZ()));
        if (listLJJ != null && !listLJJ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (!C1462570oAB.LJIILL(effect) && !C1462570oAB.LJIIIIZZ(effect) && !C1462570oAB.LIZJ(effect) && !C1462570oAB.LJIJ(effect) && !C1462570oAB.LJIILJJIL(effect) && !effect.getTags().contains("pollsticker") && ((!C1462570oAB.LJ(effect) || !C1465250oEV.LIZ(effect)) && !C1462570oAB.LJIIZILJ(effect) && !effect.getTags().contains("hashtag") && !C1462570oAB.LJIIJ(effect) && !effect.getTags().contains("location") && !C1462570oAB.LJIIL(effect) && !effect.getTags().contains("emojislidersticker") && !effect.getTags().contains("linksticker"))) {
            if (C1462570oAB.LJ(effect) && !C1465250oEV.LIZ(effect)) {
                return true;
            }
            if ((z || !C1462570oAB.LJIIIZ(effect)) && !C1462570oAB.LJIJJ(effect) && !C1462570oAB.LJIILIIL(effect)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C1465200oEQ
    public final void LLLJ(int i) {
        if (this.LLJILLL <= 0) {
            return;
        }
        Long lLIZJ = LLLIILIL().Cu().LIZJ();
        if (lLIZJ.longValue() <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - lLIZJ.longValue();
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        ((C0EU6) this.LLJJLIIIJLLLLLLLZ.getValue()).LIZIZ(jCurrentTimeMillis);
        super.LLLJ(i);
    }

    @Override // X.C1465200oEQ
    public final void LLLLII(boolean z) {
        C0E48 c0e48 = (C0E48) this.LLJJL.getValue();
        if (c0e48 != null) {
            c0e48.S7().LIZIZ(Boolean.valueOf(z), "is_sticker_panel_visible", false);
        }
    }

    @Override // X.C1465200oEQ
    public final boolean LLLLIILL(Effect effect) {
        List<String> tags;
        List<String> tags2;
        List<String> tags3;
        List<String> tags4;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_image_hashtag_sticker", true, false) && (((tags2 = effect.getTags()) != null && tags2.contains("hashtag_embed")) || (((tags3 = effect.getTags()) != null && tags3.contains("hashtag_global")) || ((tags4 = effect.getTags()) != null && tags4.contains("hashtag_single"))))) {
            return false;
        }
        if ((C1462570oAB.LIZJ(effect) || !C1462570oAB.LJIJ(effect) || !C1428520nHG.LJJIIZI(LLLILZ())) && (tags = effect.getTags()) != null && !tags.isEmpty()) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(EnumC1465290oEZ.AI_STICKER.getValue(), EnumC1465290oEZ.CUSTOM_STICKER.getValue(), EnumC1465290oEZ.CUSTOM_STICKER_ENTRANCE.getValue(), EnumC1465290oEZ.NON_GIPHY_INFO_STICKER.getValue());
            List<String> tags5 = effect.getTags();
            if (tags5 != null) {
                Iterator<String> it2 = tags5.iterator();
                while (it2.hasNext()) {
                    if (listLJIIJJI.contains(it2.next())) {
                        return false;
                    }
                }
            }
            if (C1462570oAB.LIZIZ(effect) == 1 && !C1462570oAB.LJIILLIIL(effect)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.C1465200oEQ
    public final void LLLIZZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, boolean z) {
        c0lab.LIZ(1, "is_editor_pro");
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        if (z) {
            c0lab.LIZ(0, "is_panel_sticker");
        }
    }
}
