package X;

import Y.AObjectS241S0100000_8;
import Y.AObjectS245S0100000_22;
import Y.AObjectS246S0100000_25;
import Y.AfS157S0200000_22;
import Y.AfS177S0100000_8;
import Y.AfS191S0100000_22;
import Y.AfS194S0100000_25;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.sticker.api.IMStickerApi;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.ogc.news.sticker.IArticleStickerService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.watermark.MTCreativeFeatureService;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS261S0000000_22;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0oEQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public class C1465200oEQ extends Scene implements InterfaceC1166920gTK, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LLJI;
    public final C1664750tQH LLJILJILJ;
    public final C1664750tQH LLJJ;
    public final C1664750tQH LLJJI;
    public final C1664750tQH LLJJIII;
    public final C01GW LLJJIJI;
    public boolean LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final Set<String> LLJJJIL;
    public InterfaceC1406950miT LLJJJJ;
    public final C11NJ LLJJJJJIL;
    public String LLJIJIL = "click_button";
    public long LLJILJIL = -1;
    public long LLJILLL = -1;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C1465200oEQ.class, "editStickerPanelApi", "getEditStickerPanelApi()Lcom/ss/android/ugc/gamora/editor/sticker/panel/EditStickerPanelApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C1465200oEQ.class, "publishEditModel", "getPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS3 = new C2217381BqS(C1465200oEQ.class, "editPreviewApi", "getEditPreviewApi()Lcom/ss/android/ugc/aweme/shortvideo/preview/EditPreviewApi;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS4 = new C2217381BqS(C1465200oEQ.class, "musicController", "getMusicController()Lcom/ss/android/ugc/gamora/editor/IEditMusicController;", 0);
        c09r3.getClass();
        C2217381BqS c2217381BqS5 = new C2217381BqS(C1465200oEQ.class, "lyricBusinessApi", "getLyricBusinessApi()Lcom/ss/android/ugc/gamora/lyrics/ILyricStickerEffectDataLogicComponent;", 0);
        c09r3.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2, c2217381BqS3, c2217381BqS4, c2217381BqS5};
    }

    public int LLLIIIIL() {
        return 10;
    }

    public void LLLLII(boolean z) {
    }

    public boolean LLLLIILL(Effect effect) {
        return false;
    }

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final InterfaceC1465230oET LLLIILIL() {
        return (InterfaceC1465230oET) this.LLJILJILJ.getValue(this, LLJJJJLIIL[0]);
    }

    public final InterfaceC1465240oEU LLLIL() {
        return (InterfaceC1465240oEU) this.LLJJJ.getValue();
    }

    public final VideoPublishEditModel LLLILZ() {
        return (VideoPublishEditModel) this.LLJJ.getValue(this, LLJJJJLIIL[1]);
    }

    public final C1413490mt1 LLLILZLLLI() {
        return (C1413490mt1) this.LLJJIJI.getValue();
    }

    public void LLLJL() {
        C1653260t7k.LIZIZ("click_edit_sticker_entrance");
    }

    @Override // com.bytedance.scene.Scene
    public final void onDestroyView() {
        super.onDestroyView();
        if (!this.LLJJJJJIL.LLILLJJLI) {
            this.LLJJJJJIL.dispose();
        }
        LLLIL().LJIIIIZZ();
        if (((Boolean) C273340AnU.LIZ.getValue()).booleanValue()) {
            C1634250sd5.LIZIZ = C1634250sd5.LIZ;
        } else {
            C1634250sd5.LIZIZ = AFwS261S0000000_22.get$arr$(218);
        }
        if (C578400MmM.LIZ) {
            C201955140j.LIZJ(C1632480saE.LIZIZ, "EditStickerPanelScene -> onDestroyView -> RecentUsedStickerDataRepo -> reset");
            C1634780sdw c1634780sdw = C1634780sdw.LJII;
            if (c1634780sdw != null) {
                c1634780sdw.LJ.removeObservers(this);
                c1634780sdw.LIZLLL.removeObservers(this);
                c1634780sdw.LJFF.clear();
            }
            C1634780sdw.LJII = null;
            return;
        }
        C1632480saE c1632480saE = C1632480saE.LIZIZ;
        C201955140j.LIZJ(c1632480saE, "EditStickerPanelScene -> onDestroyView -> RecentUsedStickerDataRepo -> don't reset");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RecentUsedStickerDataRepo -> updateNeedClearStatus: needClear = ");
        sbLIZ.append(true);
        C201955140j.LIZJ(c1632480saE, C2188811AlT.LIZIZ(sbLIZ));
        C578400MmM.LIZ = true;
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LLJI;
    }

    public C1465200oEQ(C1DRG c1drg) {
        this.LLJI = c1drg;
        this.LLJILJILJ = C1664770tQJ.LIZ(c1drg, InterfaceC1465230oET.class, null);
        this.LLJJ = C1664770tQJ.LIZ(c1drg, VideoPublishEditModel.class, null);
        this.LLJJI = C1664770tQJ.LIZ(c1drg, InterfaceC1455860nzM.class, null);
        this.LLJJIII = C1664770tQJ.LIZ(c1drg, InterfaceC1454960nxu.class, null);
        C1664770tQJ.LIZIZ(c1drg, InterfaceC366450EYh.class, null);
        this.LLJJIJI = C452501pT.LIZIZ(new AwS566S0100000_22(this, 738));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 507));
        this.LLJJJ = C452501pT.LIZIZ(new AwS566S0100000_22(this, 737));
        this.LLJJJIL = new LinkedHashSet();
        this.LLJJJJJIL = new C11NJ();
    }

    public boolean LLLII(Effect effect) {
        boolean z;
        boolean zLJIIIZ;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean zLJIIIZ2;
        boolean zLJIIIZ3;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        AVMusic aVMusicExtractAVMusic = MusicBeanUtilKt.extractAVMusic(LLLILZ().creativeModel.musicBuzModel);
        if (C1403850mdT.LJFF(LLLILZ()) && aVMusicExtractAVMusic != null && aVMusicExtractAVMusic.hasLyricCopyRight()) {
            z = true;
        } else {
            z = false;
        }
        if (C0BW5.LIZ()) {
            zLJIIIZ = ((Boolean) C306020Bz6.LIZ.getValue()).booleanValue();
        } else {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_edit_sticker_donation", true, false);
        }
        if (zLJIIIZ && !C0CHQ.LIZ().getAccountService().LIZ() && !LLLILZ().isEnterFromDM() && C0CHQ.LIZ().getAccountService().isLogin()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (C19634611rs.LIZ() && !LLLILZ().isEnterFromDM()) {
            MTCreativeFeatureService.LIZIZ().LIZ();
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z13 = !LLLILZ().isEnterFromDM();
        boolean z14 = !LLLILZ().isEnterFromDM();
        C1367960lha.LIZ.getClass();
        if (C1367960lha.LIZ().LLFF() && !LLLILZ().isEnterFromDM()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean zLJII = u4.LJII(LLLILZ());
        boolean zLJI = C1403850mdT.LJI(LLLILZ());
        List<String> listLJJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJ(C1428470nHB.LJJZZI(LLLILZ()), C1428470nHB.LLIIIJ(LLLILZ()));
        if (listLJJ != null && !listLJJ.isEmpty()) {
            z5 = false;
        } else {
            z5 = true;
        }
        C1465260oEW c1465260oEW = C1465260oEW.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLILZ = LLLILZ();
        c1465260oEW.getClass();
        if (!C1428470nHB.LJJZZI(videoPublishEditModelLLLILZ) && !C1428470nHB.LLIIIJ(videoPublishEditModelLLLILZ)) {
            if (C1444940nhk.LJII(videoPublishEditModelLLLILZ.getCanvasVideoData())) {
                zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_static_sticker_support_in_single_photo", true, false);
            } else {
                zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_static_sticker_support_in_video", true, false);
            }
        } else {
            zLJIIIZ2 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_static_sticker_support_in_multiple_photo", true, false);
        }
        VideoPublishEditModel videoPublishEditModelLLLILZ2 = LLLILZ();
        if (!C1428470nHB.LJJZZI(videoPublishEditModelLLLILZ2) && !C1428470nHB.LLIIIJ(videoPublishEditModelLLLILZ2)) {
            if (C1444940nhk.LJII(videoPublishEditModelLLLILZ2.getCanvasVideoData())) {
                zLJIIIZ3 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_static_text_sticker_support_in_single_photo", true, false);
            } else {
                zLJIIIZ3 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_static_text_sticker_support_in_video", true, false);
            }
        } else {
            zLJIIIZ3 = C0C64.LJIILLIIL().LJIIIZ(31744, "studio_static_text_sticker_support_in_multiple_photo", true, false);
        }
        VideoPublishEditModel videoPublishEditModelLLLILZ3 = LLLILZ();
        if ((C1428470nHB.LJLIIL(videoPublishEditModelLLLILZ3) && !u4.LJLL(videoPublishEditModelLLLILZ3) && C2490009pK.LIZ()) || (!u4.LJLL(videoPublishEditModelLLLILZ3) && C1444940nhk.LJII(videoPublishEditModelLLLILZ3.getCanvasVideoData()))) {
            z6 = false;
        } else {
            z6 = true;
        }
        boolean z15 = !LLLILZ().isEnterFromDM();
        boolean z16 = !LLLILZ().isEnterFromDM();
        int followerCount = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUser().getFollowerCount();
        if (((Number) C283060B7o.LIZ.getValue()).intValue() == 1 && ((u4.LJLL(LLLILZ()) || (((Boolean) C265210AaN.LIZ.getValue()).booleanValue() && (C1444940nhk.LJI(LLLILZ().getCanvasVideoData()) || C1444940nhk.LJIIJ(LLLILZ().getCanvasVideoData()) || (C1428470nHB.LLIIIJ(LLLILZ()) && u4.LJJJIL(LLLILZ()))))) && followerCount >= ((Number) C265180AaK.LIZ.getValue()).intValue())) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!LLLILZ().isEnterFromDM() && (IMStickerApi.LIZ.LIZIZ().getImSocialAvatarService().LJIILJJIL(null, null) instanceof C0HWY)) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (C298450Bmt.LIZ() && (u4.LJLL(LLLILZ()) || u4.LJIIZILJ(LLLILZ()))) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (C0CH3.LIZ() && !(this instanceof C1465210oER)) {
            z10 = true;
        } else {
            z10 = false;
        }
        IArticleStickerService.Companion.getClass();
        InterfaceC19622811py interfaceC19622811pyLIZ = C19603211mo.LIZ();
        if (interfaceC19622811pyLIZ != null) {
            z11 = true;
            if (interfaceC19622811pyLIZ.LJI()) {
                z12 = true;
            }
            if (!LLLLIILL(effect) || ((!z && C1462570oAB.LJIILL(effect)) || ((!z2 && C1462570oAB.LJIIIIZZ(effect)) || ((!zLJII && C1462570oAB.LIZJ(effect)) || ((!zLJI && C1462570oAB.LJIJ(effect)) || ((!z3 && C1462570oAB.LJIILJJIL(effect)) || ((!z13 && effect.getTags().contains("pollsticker")) || ((!zLJIIIZ2 && C1465260oEW.LIZIZ(effect)) || ((!zLJIIIZ3 && C1465260oEW.LIZJ(effect)) || ((!z6 && C1465260oEW.LIZ(effect)) || ((C1462570oAB.LJ(effect) && C1465250oEV.LIZ(effect)) || ((!z14 && (C1462570oAB.LJIIZILJ(effect) || effect.getTags().contains("hashtag"))) || ((!z10 && C1462570oAB.LJIIJ(effect)) || ((!z4 && effect.getTags().contains("location")) || ((!z5 && C1462570oAB.LJIIIZ(effect)) || ((!z15 && C1462570oAB.LJIIL(effect)) || ((!z16 && effect.getTags().contains("emojislidersticker")) || ((!z7 && effect.getTags().contains("linksticker")) || ((!z12 && C1462570oAB.LIZLLL(effect)) || ((!z8 && C1462570oAB.LJIJJ(effect)) || (!z9 && effect.getTags().contains("secretreplies")))))))))))))))))))))) {
                return false;
            }
            return z11;
        }
        z11 = true;
        z12 = false;
        if (!LLLLIILL(effect)) {
        }
        return false;
    }

    public void LLLJ(int i) {
        if (this.LLJILLL <= 0) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLJILLL;
        this.LLJILLL = -1L;
        if (jCurrentTimeMillis <= 0) {
            return;
        }
        this.LLJILJIL = LLLIILIL().Cu().LIZJ().longValue();
        C0LAB c0labLJIILIIL = C1403850mdT.LJIILIIL(LLLILZ());
        c0labLJIILIIL.LIZIZ(jCurrentTimeMillis, "duration");
        c0labLJIILIIL.LJ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        if (this.LLJILJIL != -1) {
            c0labLJIILIIL.LIZIZ(System.currentTimeMillis() - this.LLJILJIL, "click_show_duration");
        }
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("tool_performance_enter_sticker_tab", c0labLJIILIIL.LIZ);
    }

    public boolean LLLLIIIILLL(EffectCategoryResponse effectCategoryResponse) {
        ArrayList arrayList = new ArrayList();
        List<String> listLJJ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJ(C1428470nHB.LJJZZI(LLLILZ()), C1428470nHB.LLIIIJ(LLLILZ()));
        if (listLJJ != null) {
            arrayList.addAll(listLJJ);
        }
        return arrayList.contains(effectCategoryResponse.getKey());
    }

    @Override // com.bytedance.scene.Scene
    public final void onActivityCreated(Bundle bundle) {
        Context context;
        super.onActivityCreated(bundle);
        if (C300240Bpm.LIZ() && (context = this.mView.getContext()) != null) {
            float fLJFF = C418440Gaw.LJFF(C497820Jfg.LIZIZ(context), context);
            C1640600snK.LIZ = (((fLJFF - 12.0f) - (2 * 0.0f)) / 3) - 20.0f;
            C1640600snK.LIZIZ = (((fLJFF - 28.0f) - (4 * 10.0f)) / 5) - 20.0f;
        }
        C1466910oHB c1466910oHB = new C1466910oHB(this, 4);
        C11NJ c11nj = this.LLJJJJJIL;
        C19475711Hn c19475711HnLJFF = LLLIL().LJFF();
        AfS191S0100000_22 afS191S0100000_22 = new AfS191S0100000_22(this, 28);
        C09HM c09hm = C09HN.LIZ;
        c11nj.LIZ(c19475711HnLJFF.LJJLL(afS191S0100000_22, c09hm));
        this.LLJJJJJIL.LIZ(LLLIL().LJI().LJJLL(new AfS191S0100000_22(this, 29), c09hm));
        this.LLJJJJJIL.LIZ(LLLIL().LIZ().LJJLL(new AfS157S0200000_22(c1466910oHB, this, 2), c09hm));
        this.LLJJJJJIL.LIZ(LLLIL().LIZIZ().LJJLL(new AfS177S0100000_8(this, 45), c09hm));
        this.LLJJJJJIL.LIZ(LLLIL().LIZLLL().LJJLL(new AfS191S0100000_22(this, 30), c09hm));
        this.LLJJJJJIL.LIZ(LLLIL().LJII().LJJLL(new AfS194S0100000_25(this, 51), c09hm));
        this.LLJJJJJIL.LIZ(LLLIL().LJ().LJJLL(new AfS194S0100000_25(this, 52), c09hm));
        LLLIILIL().V7().LIZ(this, new AObjectS245S0100000_22(this, 226));
        LLLIILIL().Tg().LIZ(this, new AObjectS245S0100000_22(this, 227));
        LLLIILIL().i8().LIZ(this, new AObjectS245S0100000_22(this, 221));
        LLLIILIL().hr().LIZ(this, new AObjectS241S0100000_8(this, 47));
        LLLIILIL().p9().LIZ(this, new AObjectS246S0100000_25(this, 330));
        LLLIILIL().L9().LIZ(this, new AObjectS245S0100000_22(this, 222));
        LLLIILIL().Fs().LIZ(this, new AObjectS245S0100000_22(this, 223));
        LLLIILIL().sj().LIZ(this, new AObjectS245S0100000_22(this, 224));
        ((InterfaceC1454960nxu) this.LLJJIII.getValue(this, LLJJJJLIIL[3])).Zq().LJ(this, new AObjectS245S0100000_22(this, 225));
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    public void LLLIZZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab, boolean z) {
        c0lab.LIZ(0, "is_editor_pro");
        c0lab.LIZ(videoPublishEditModel.creativeModel.pugcTemplateData.isFromCreateTemplate ? 1 : 0, "is_from_create_template");
        c0lab.LIZ(1, "is_panel_sticker");
    }

    @Override // com.bytedance.scene.Scene
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.eoa, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void selectNonNullSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.InterfaceC1166920gTK
    public final <S extends C004I, A> void subscribeEvent(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends C0LCS<? extends A>> interfaceC2217241BqE, C1765020w20<C11EC<C0LCS<A>>> c1765020w20, Function2<? super InterfaceC1166920gTK, ? super A, Unit> function2) {
        C1170060gYO.LIZLLL(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
