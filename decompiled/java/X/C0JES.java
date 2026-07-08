package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.forward.ForwardMedia;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.AutoCutStyleNextBtnConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChooseMediaViewModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.onthisday.OnThisDayTiktokMediaModel;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.onthisday.material.viewmodel.CombinedMaterialListViewModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS586S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JES, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JES implements C0J1E {
    public final Scene LIZ;
    public final CombinedMaterialListViewModel LIZIZ;
    public final C0JEQ LIZJ;
    public final ShortVideoContext LIZLLL;
    public final ChooseMediaViewModel LJ;
    public final Function1<Boolean, Unit> LJFF;
    public final Function1<Integer, Unit> LJI;
    public final String LJII;
    public final String LJIIIIZZ;
    public final String LJIIIZ;

    public final int LJ() {
        int i = this.LIZJ.LIZ;
        int size = ((ArrayList) this.LIZIZ.LLJ).size();
        return i > size ? size : i;
    }

    public final void LJIIIIZZ() {
        if (((ArrayList) this.LIZIZ.LLIZLLLIL).isEmpty()) {
            this.LJ.ER2(this.LJIIIIZZ, false);
        } else {
            this.LJ.ER2(C786410Ut5.j4(this.LJII, Arrays.copyOf(new Object[]{Integer.valueOf(((ArrayList) this.LIZIZ.LLIZLLLIL).size())}, 1)), true);
        }
    }

    @Override // X.C0J1E
    public final C0JEQ getConfig() {
        return this.LIZJ;
    }

    @Override // X.C0J1E
    public final void LIZ(List<? extends Object> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof OnThisDayTiktokMediaModel) {
                arrayList.add(obj);
            }
        }
        List<OnThisDayTiktokMediaModel> list2 = this.LIZIZ.LLIZLLLIL;
        ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(list2, 10));
        Iterator<OnThisDayTiktokMediaModel> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((MediaModel) it2.next()).id);
        }
        Set setLLIIJI = C13LP.LLIIJI(arrayList2);
        ArrayList<TikTokMediaModel> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (setLLIIJI.contains(((MediaModel) obj2).id)) {
                arrayList3.add(obj2);
            }
        }
        for (TikTokMediaModel tikTokMediaModel : arrayList3) {
            Iterator it3 = ((ArrayList) this.LIZIZ.LLIZLLLIL).iterator();
            int i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                if (Intrinsics.LJFF(((MediaModel) it3.next()).id, ((MediaModel) tikTokMediaModel).id)) {
                    if (i >= 0) {
                        tikTokMediaModel.selectIndex = ((TikTokMediaModel) ListProtector.get(this.LIZIZ.LLIZLLLIL, i)).selectIndex;
                    }
                } else {
                    i++;
                }
            }
        }
        this.LIZIZ.vQ2(arrayList);
        this.LJ.AR2(new ArrayList(this.LIZIZ.LLJ), true);
    }

    @Override // X.C0J1E
    public final boolean LIZJ(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        if (onThisDayTiktokMediaModel.selectIndex <= 0 && ((ArrayList) this.LIZIZ.LLIZLLLIL).size() >= this.LIZJ.LIZ) {
            return true;
        }
        return false;
    }

    public static int LJFF(C0JEN c0jen, OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        String str;
        List<Object> listLJJLIIIJLLLLLLLZ = c0jen.LJJLIIIJLLLLLLLZ();
        int size = listLJJLIIIJLLLLLLLZ.size();
        for (int i = 0; i < size; i++) {
            Object obj = ListProtector.get(listLJJLIIIJLLLLLLLZ, i);
            if (obj instanceof OnThisDayTiktokMediaModel) {
                ForwardMedia forwardMedia = onThisDayTiktokMediaModel.forwardMedia;
                if (forwardMedia != null) {
                    String str2 = forwardMedia.sourceId;
                    ForwardMedia forwardMedia2 = ((OnThisDayTiktokMediaModel) obj).forwardMedia;
                    if (forwardMedia2 != null) {
                        str = forwardMedia2.sourceId;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(str2, str)) {
                        return i;
                    }
                }
                if (Intrinsics.LJFF(((MediaModel) onThisDayTiktokMediaModel).id, ((MediaModel) obj).id)) {
                    return i;
                }
            }
        }
        return -1;
    }

    @Override // X.C0J1E
    public final void LIZLLL(final View view, final OnThisDayTiktokMediaModel onThisDayTiktokMediaModel) {
        C19A3 c19a3;
        C526910KlV c526910KlV;
        if (LIZJ(onThisDayTiktokMediaModel)) {
            return;
        }
        Scene sceneLIZ = C0EBE.LIZ(view);
        if (sceneLIZ != null) {
            C19A3 c19a32 = (C19A3) sceneLIZ;
            final ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = new ChoosePhotoPreviewPageConfig(0);
            choosePhotoPreviewPageConfig.showDockInPreviewPage = true;
            choosePhotoPreviewPageConfig.minSelectedPhotoCount = 1;
            choosePhotoPreviewPageConfig.showAutoCutBtn = true;
            choosePhotoPreviewPageConfig.hideAutoCutWithShowAutoCutModel = true;
            choosePhotoPreviewPageConfig.nextRuleAdjustment = true;
            choosePhotoPreviewPageConfig.forceHideMediaRecyclerView = true;
            choosePhotoPreviewPageConfig.autoCutStyleNextBtnConfig = new AutoCutStyleNextBtnConfig(16.0f, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48)));
            InterfaceC526970Klb interfaceC526970Klb = new InterfaceC526970Klb() { // from class: X.0JET
                @Override // X.InterfaceC526970Klb
                public final boolean LIZLLL(TikTokMediaModel tikTokMediaModel) {
                    return true;
                }

                @Override // X.InterfaceC526970Klb
                public final boolean LJ(TikTokMediaModel tikTokMediaModel) {
                    return true;
                }

                @Override // X.InterfaceC526970Klb
                public final int LJI() {
                    return 3;
                }

                @Override // X.InterfaceC526970Klb
                public final void LJIIIIZZ() {
                }

                @Override // X.InterfaceC526970Klb
                public final boolean LJIIIZ() {
                    return true;
                }

                @Override // X.InterfaceC526970Klb
                public final boolean LIZ() {
                    return ((ArrayList) this.LIZIZ.LLIZLLLIL).size() >= this.LJ();
                }

                @Override // X.InterfaceC526970Klb
                public final int LIZIZ() {
                    return ((ArrayList) this.LIZIZ.LLJ).indexOf(onThisDayTiktokMediaModel);
                }

                @Override // X.InterfaceC526970Klb
                public final List<TikTokMediaModel> LIZJ() {
                    return this.LIZIZ.LLIZLLLIL;
                }

                @Override // X.InterfaceC526970Klb
                public final boolean LJII() {
                    return choosePhotoPreviewPageConfig.supportRepeatSelect;
                }

                @Override // X.InterfaceC526970Klb
                public final View LJFF(TikTokMediaModel tikTokMediaModel) {
                    return view;
                }
            };
            Bundle bundle = new Bundle();
            C786410Ut5.LJJIJL(bundle, "PREVIEW_CONFIG", choosePhotoPreviewPageConfig);
            C786410Ut5.LJJIJL(bundle, "key_short_video_context", this.LIZLLL);
            bundle.putBoolean("from_album_thumbnail", false);
            bundle.putBoolean("from_eoy_entry", true);
            ChooseMediaViewModel chooseMediaViewModel = this.LJ;
            chooseMediaViewModel.getClass();
            chooseMediaViewModel.LLJJI = EnumC538230L8z.ALL;
            chooseMediaViewModel.wR2(chooseMediaViewModel.LLIZ);
            this.LJ.xR2((ArrayList) this.LIZIZ.LLIZLLLIL);
            if (c19a32.findSceneByTag("PreviewRootScene") == null) {
                Scene sceneLIZ2 = C2350509Ix.LIZ(bundle, C526910KlV.class);
                if ((sceneLIZ2 instanceof C526910KlV) && (c526910KlV = (C526910KlV) sceneLIZ2) != null) {
                    c526910KlV.LLLLZIL = interfaceC526970Klb;
                }
                sceneLIZ2.disableSceneRestore();
                if ((sceneLIZ2 instanceof C19A3) && (c19a3 = (C19A3) sceneLIZ2) != null) {
                    c19a3.disableSupportRestore();
                }
                c19a32.add(R.id.drg, sceneLIZ2, "PreviewRootScene");
                return;
            }
            return;
        }
        throw new IllegalStateException("Scene not found");
    }

    @Override // X.C0J1E
    public final void LIZIZ(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, C0J1D c0j1d, C0J19 c0j19) {
        LJII(onThisDayTiktokMediaModel, c0j1d, c0j19, true);
    }

    public final void LJI(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, C0J1D c0j1d, C0J19 c0j19, boolean z) {
        if (z && !C530690Krb.LIZJ(onThisDayTiktokMediaModel) && C0L0K.LIZIZ(this.LIZ.requireSceneContext(), C2471909mP.LJIJ(onThisDayTiktokMediaModel), "on_this_day_page", false, 24)) {
            return;
        }
        if (z) {
            CombinedMaterialListViewModel combinedMaterialListViewModel = this.LIZIZ;
            if (!((ArrayList) combinedMaterialListViewModel.LLIZLLLIL).contains(onThisDayTiktokMediaModel)) {
                ((ArrayList) combinedMaterialListViewModel.LLIZLLLIL).add(onThisDayTiktokMediaModel);
            }
            onThisDayTiktokMediaModel.selectIndex = ((ArrayList) this.LIZIZ.LLIZLLLIL).size();
            int iLJFF = LJFF(c0j1d, onThisDayTiktokMediaModel);
            if (iLJFF != -1) {
                c0j1d.notifyItemChanged(iLJFF, "update_select_state");
            } else {
                int iLJFF2 = LJFF(c0j19, onThisDayTiktokMediaModel);
                if (iLJFF2 != -1) {
                    c0j19.notifyItemChanged(iLJFF2, "update_select_state");
                }
            }
        } else {
            int i = onThisDayTiktokMediaModel.selectIndex;
            if (i > 0) {
                int size = ((ArrayList) this.LIZIZ.LLIZLLLIL).size();
                while (i < size) {
                    TikTokMediaModel tikTokMediaModel = (TikTokMediaModel) ListProtector.get(this.LIZIZ.LLIZLLLIL, i);
                    tikTokMediaModel.selectIndex--;
                    int iLJFF3 = LJFF(c0j1d, (OnThisDayTiktokMediaModel) ListProtector.get(this.LIZIZ.LLIZLLLIL, i));
                    if (iLJFF3 != -1) {
                        c0j1d.notifyItemChanged(iLJFF3, "update_select_state");
                    } else {
                        int iLJFF4 = LJFF(c0j19, (OnThisDayTiktokMediaModel) ListProtector.get(this.LIZIZ.LLIZLLLIL, i));
                        if (iLJFF4 != -1) {
                            c0j19.notifyItemChanged(iLJFF4, "update_select_state");
                        }
                    }
                    i++;
                }
                ((ArrayList) this.LIZIZ.LLIZLLLIL).remove(onThisDayTiktokMediaModel);
                onThisDayTiktokMediaModel.selectIndex = -1;
                int iLJFF5 = LJFF(c0j1d, onThisDayTiktokMediaModel);
                if (iLJFF5 != -1) {
                    c0j1d.notifyItemChanged(iLJFF5, "update_select_state");
                } else {
                    int iLJFF6 = LJFF(c0j19, onThisDayTiktokMediaModel);
                    if (iLJFF6 != -1) {
                        c0j19.notifyItemChanged(iLJFF6, "update_select_state");
                    }
                }
            }
        }
        Function1<Integer, Unit> function1 = this.LJI;
        if (function1 != null) {
            function1.invoke(Integer.valueOf(((ArrayList) this.LIZIZ.LLIZLLLIL).size()));
        }
        if (z) {
            this.LJ.sR2(onThisDayTiktokMediaModel);
        } else {
            this.LJ.tR2(onThisDayTiktokMediaModel);
        }
        this.LJ.rR2();
        LJIIIIZZ();
        if (z) {
            if (((ArrayList) this.LIZIZ.LLIZLLLIL).size() == LJ()) {
                this.LJFF.invoke(Boolean.TRUE);
                c0j1d.notifyItemRangeChanged(0, c0j1d.getItemCount(), "update_gray_item");
                c0j19.notifyItemRangeChanged(0, c0j19.getItemCount(), "update_gray_item");
                return;
            }
            return;
        }
        if (((ArrayList) this.LIZIZ.LLIZLLLIL).size() != LJ() - 1) {
            return;
        }
        this.LJFF.invoke(Boolean.FALSE);
        c0j1d.notifyItemRangeChanged(0, c0j1d.getItemCount(), "update_gray_item");
        c0j19.notifyItemRangeChanged(0, c0j19.getItemCount(), "update_gray_item");
    }

    public final void LJII(OnThisDayTiktokMediaModel onThisDayTiktokMediaModel, C0J1D c0j1d, C0J19 c0j19, boolean z) {
        boolean z2 = true;
        if (LIZJ(onThisDayTiktokMediaModel)) {
            Context contextRequireSceneContext = this.LIZ.requireSceneContext();
            CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
            creativeToastBuilder.message(this.LJIIIZ);
            creativeToastBuilder.isTuxToastLegacy(true);
            C1390380mHk.LIZJ(contextRequireSceneContext, 3087, creativeToastBuilder);
            return;
        }
        if (onThisDayTiktokMediaModel.selectIndex > 0) {
            z2 = false;
        }
        LJI(onThisDayTiktokMediaModel, c0j1d, c0j19, z2);
        if (z2) {
            C0ML7 c0ml7 = C0ML7.LIZ;
            CreativeModel creativeModel = this.LIZLLL.creativeModel;
            String str = onThisDayTiktokMediaModel.selectType;
            c0ml7.getClass();
            C0ML7.LJIILL(creativeModel, false, false, z, str, null);
        }
    }

    public C0JES(Scene scene, CombinedMaterialListViewModel combinedMaterialListViewModel, C0JEQ c0jeq, ShortVideoContext shortVideoContext, ChooseMediaViewModel chooseMediaViewModel, AwS586S0100000_7 awS586S0100000_7, AwS586S0100000_7 awS586S0100000_72) {
        this.LIZ = scene;
        this.LIZIZ = combinedMaterialListViewModel;
        this.LIZJ = c0jeq;
        this.LIZLLL = shortVideoContext;
        this.LJ = chooseMediaViewModel;
        this.LJFF = awS586S0100000_7;
        this.LJI = awS586S0100000_72;
        this.LJII = scene.requireSceneContext().getResources().getString(c0jeq.LJFF);
        this.LJIIIIZZ = scene.requireSceneContext().getResources().getString(c0jeq.LJ);
        this.LJIIIZ = C786410Ut5.j4(scene.requireSceneContext().getString(c0jeq.LIZIZ), Arrays.copyOf(new Object[]{Integer.valueOf(c0jeq.LIZ)}, 1));
    }
}
