package X;

import android.text.TextUtils;
import android.view.View;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.videoimagemixed.VideoImageMixedController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KnK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C528040KnK implements InterfaceC528100KnQ {
    public final /* synthetic */ VideoImageMixedController LIZ;
    public final /* synthetic */ boolean LIZIZ;

    /* JADX WARN: Type inference failed for: r0v54, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // X.InterfaceC528100KnQ
    public final void LIZIZ(TikTokMediaModel tikTokMediaModel) {
        if (tikTokMediaModel == null) {
            return;
        }
        VideoImageMixedController videoImageMixedController = this.LIZ;
        int i = 1;
        if (videoImageMixedController.LLLLIILL && videoImageMixedController.LLJJLIIIJLLLLLLLZ.size() <= 1) {
            C533790Kwb c533790Kwb = C533790Kwb.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("AutoPickPreview [mixed.deleteItem] blocked by min-count, id=");
            sbLIZ.append(((MediaModel) tikTokMediaModel).id);
            sbLIZ.append(", selectSize=");
            sbLIZ.append(this.LIZ.LLJJLIIIJLLLLLLLZ.size());
            C201955140j.LJIILJJIL(c533790Kwb, C2188811AlT.LIZIZ(sbLIZ));
            ?? r0 = this.LIZ.LLLLIILLL;
            if (r0 != 0) {
                r0.invoke();
                return;
            }
            return;
        }
        for (TikTokMediaModel tikTokMediaModel2 : this.LIZ.LLJJLIIIJLLLLLLLZ) {
            if (this.LIZ.LLLLLJLJLL) {
                if (Intrinsics.LJFF(tikTokMediaModel.LJFF(), tikTokMediaModel2.LJFF()) && TextUtils.equals(tikTokMediaModel.LJIILLIIL(), tikTokMediaModel2.LJIILLIIL())) {
                    tikTokMediaModel2.selectIndex = -1;
                } else {
                    tikTokMediaModel2.selectIndex = i;
                    i++;
                }
            } else if (Intrinsics.LJFF(tikTokMediaModel.LJFF(), tikTokMediaModel2.LJFF())) {
                tikTokMediaModel2.selectIndex = -1;
            } else {
                tikTokMediaModel2.selectIndex = i;
                i++;
            }
        }
        VideoImageMixedController videoImageMixedController2 = this.LIZ;
        videoImageMixedController2.LJJJLL(tikTokMediaModel);
        videoImageMixedController2.LJLIIL();
        videoImageMixedController2.LJJZZI(new C525960Kjy(tikTokMediaModel));
        videoImageMixedController2.LJJJJLL();
        AbstractC528270Knh abstractC528270Knh = this.LIZ.LLLIZZ;
        if (abstractC528270Knh != null) {
            abstractC528270Knh.LLLZIL(tikTokMediaModel);
        }
        AbstractC528270Knh abstractC528270Knh2 = this.LIZ.LLLL;
        if (abstractC528270Knh2 != null) {
            abstractC528270Knh2.LLLZIL(tikTokMediaModel);
        }
        AbstractC528270Knh abstractC528270Knh3 = this.LIZ.LLLJ;
        if (abstractC528270Knh3 != null) {
            abstractC528270Knh3.LLLZIL(tikTokMediaModel);
        }
        AbstractC528270Knh abstractC528270Knh4 = this.LIZ.LLLJIL;
        if (abstractC528270Knh4 != null) {
            abstractC528270Knh4.LLLZIL(tikTokMediaModel);
        }
        AbstractC528270Knh abstractC528270Knh5 = this.LIZ.LLLJL;
        if (abstractC528270Knh5 != null) {
            abstractC528270Knh5.LLLZIL(tikTokMediaModel);
        }
        AbstractC528270Knh abstractC528270Knh6 = this.LIZ.LLLLII;
        if (abstractC528270Knh6 != null) {
            abstractC528270Knh6.LLLZIL(tikTokMediaModel);
        }
        AbstractC528270Knh abstractC528270Knh7 = this.LIZ.LLLIZZ;
        if (abstractC528270Knh7 != null) {
            abstractC528270Knh7.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh8 = this.LIZ.LLLL;
        if (abstractC528270Knh8 != null) {
            abstractC528270Knh8.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh9 = this.LIZ.LLLJ;
        if (abstractC528270Knh9 != null) {
            abstractC528270Knh9.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh10 = this.LIZ.LLLJIL;
        if (abstractC528270Knh10 != null) {
            abstractC528270Knh10.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh11 = this.LIZ.LLLJL;
        if (abstractC528270Knh11 != null) {
            abstractC528270Knh11.LLLLLLJ();
        }
        AbstractC528270Knh abstractC528270Knh12 = this.LIZ.LLLLII;
        if (abstractC528270Knh12 != null) {
            abstractC528270Knh12.LLLLLLJ();
        }
        InterfaceC528100KnQ interfaceC528100KnQ = this.LIZ.LLLI;
        if (interfaceC528100KnQ != null) {
            interfaceC528100KnQ.LIZIZ(tikTokMediaModel);
        }
        C522180Kds c522180Kds = C522180Kds.LIZ;
        boolean zLJIILJJIL = tikTokMediaModel.LJIILJJIL();
        boolean z = this.LIZIZ;
        VideoImageMixedController videoImageMixedController3 = this.LIZ;
        boolean z2 = videoImageMixedController3.LLLIILIL;
        boolean zLJJLIIJ = videoImageMixedController3.LJJLIIJ();
        c522180Kds.getClass();
        C0LAB c0labLIZ = C522180Kds.LIZ(zLJIILJJIL);
        c0labLIZ.LIZ(z ? 1 : 0, "is_editor_pro");
        c0labLIZ.LIZ(z2 ? 1 : 0, "is_pip");
        c0labLIZ.LIZ(zLJJLIIJ ? 1 : 0, "if_photo_prop");
        C20684815ws.LJIILLIIL("edit_clip_delete", c0labLIZ.LIZ);
    }

    public C528040KnK(VideoImageMixedController videoImageMixedController, boolean z) {
        this.LIZ = videoImageMixedController;
        this.LIZIZ = z;
    }

    @Override // X.InterfaceC528100KnQ
    public final void LIZ(int i, int i2) {
        this.LIZ.LJLJJL(i, i2, false);
    }

    @Override // X.InterfaceC528100KnQ
    public final void LIZJ(TikTokMediaModel tikTokMediaModel, View view) {
        InterfaceC528100KnQ interfaceC528100KnQ = this.LIZ.LLLI;
        if (interfaceC528100KnQ != null) {
            interfaceC528100KnQ.LIZJ(tikTokMediaModel, view);
        }
        if (tikTokMediaModel != null) {
            C522180Kds c522180Kds = C522180Kds.LIZ;
            boolean zLJIILJJIL = tikTokMediaModel.LJIILJJIL();
            ShortVideoContext shortVideoContext = this.LIZ.LL;
            c522180Kds.getClass();
            C0LAB c0labLIZ = C522180Kds.LIZ(zLJIILJJIL);
            c0labLIZ.LJ("edit_way", "click");
            c0labLIZ.LIZ(0, "is_from_preview_page");
            C531700KtE.LIZ(c0labLIZ, shortVideoContext);
            C20684815ws.LJIILLIIL("edit_clip_preview", c0labLIZ.LIZ);
        }
    }
}
