package X;

import android.view.View;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.creative.model.editorpro.EditorProDraftModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.u4;
import com.ss.android.ugc.aweme.tools.sticker.core.lyric.model.LyricStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.AwS103S0400000_5;
import kotlin.jvm.internal.AwS134S0400000_5;
import kotlin.jvm.internal.AwS214S0300000_5;
import kotlin.jvm.internal.AwS249S0300000_5;
import kotlin.jvm.internal.AwS371S0200000_5;
import kotlin.jvm.internal.AwS41S0500000_5;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EpM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C376420EpM extends AbstractC381020Ewm<InterfaceC372610EjD> implements InterfaceC372610EjD, InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJIII;
    public static final int LLJJIJI;
    public final C1DRG LLILLL;
    public final C372480Ej0 LLILZ;
    public final InterfaceC372610EjD LLILZIL;
    public final InterfaceC1731706qJ LLILZLL;
    public final InterfaceC1731706qJ LLIZ;
    public final InterfaceC497601wk LLIZLLLIL;
    public final C0EMK LLJ;
    public final C376430EpN LLJI;
    public final C0EG1 LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C376420EpM.class, "epLoaderApi", "getEpLoaderApi()Lcom/ss/android/ugc/gamora/editorpro/startup/EditorProLoaderApi;", 0);
        C09R3 c09r3 = C13LE.LIZ;
        c09r3.getClass();
        C2217381BqS c2217381BqS2 = new C2217381BqS(C376420EpM.class, "trackApi", "getTrackApi()Lcom/ss/android/ugc/gamora/editorpro/framework/track/api/TrackPanelApi;", 0);
        c09r3.getClass();
        LLJJIII = new InterfaceC2217461Bqa[]{c2217381BqS, c2217381BqS2};
        LLJJIJI = 8;
    }

    private final C0EY2 H2() {
        return (C0EY2) this.LLILZLL.getValue(this, LLJJIII[0]);
    }

    @Override // X.InterfaceC372610EjD
    public void Ds() {
        View view;
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege == null || (view = c0ege.LIZJ) == null) {
            return;
        }
        view.performClick();
    }

    public final C376610Epf W2() {
        return (C376610Epf) this.LLJJI.getValue();
    }

    public final C0E93 X1() {
        return (C0E93) this.LLJILJIL.getValue();
    }

    public final C376460EpQ c3() {
        return (C376460EpQ) this.LLJILLL.getValue();
    }

    @Override // X.InterfaceC372610EjD
    public void g4() {
        View view;
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege == null || (view = c0ege.LIZIZ) == null) {
            return;
        }
        view.performClick();
    }

    public final C0E5S i3() {
        return (C0E5S) this.LLIZ.getValue(this, LLJJIII[1]);
    }

    public final C372540Ej6 o2() {
        return (C372540Ej6) this.LLJJ.getValue();
    }

    public final C380170EvP w2() {
        return (C380170EvP) this.LLJILJILJ.getValue();
    }

    private final C0ELJ G2() {
        C0EHI value = H2().zu2().getValue();
        if (value != null) {
            return value.LJ;
        }
        return null;
    }

    @Override // X.InterfaceC372610EjD
    public void Xd0() {
        W2().LJIIIZ = true;
    }

    @Override // X.InterfaceC372610EjD
    public EnumC376530EpX cK2() {
        return c3().LIZ();
    }

    public final VideoPublishEditModel getEditModel() {
        C0EHJ c0ehj;
        C0EHI value = H2().zu2().getValue();
        if (value == null || (c0ehj = value.LIZ) == null) {
            return null;
        }
        return c0ehj.LIZ;
    }

    @Override // X.InterfaceC372610EjD
    public void ol() {
        C376610Epf c376610EpfW2 = W2();
        c376610EpfW2.getClass();
        c376610EpfW2.LIZIZ(new AwS549S0100000_5(c376610EpfW2, 892));
    }

    @Override // X.AbstractC2255721DQs
    public void onDestroy() {
        super.onDestroy();
        C2296808zG.LIZJ(this.LLIZLLLIL, null);
    }

    public final C0EMK T2() {
        return this.LLJ;
    }

    public InterfaceC372610EjD Z1() {
        return this.LLILZIL;
    }

    @Override // X.AbstractC2255721DQs
    public /* bridge */ /* synthetic */ C05YF getApiComponent() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC372610EjD
    public void E42(boolean z) {
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege == null) {
            return;
        }
        if (z) {
            View view = c0ege.LIZIZ;
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
            }
            View view2 = c0ege.LIZIZ;
            if (view2 != null) {
                view2.setClickable(true);
                return;
            }
            return;
        }
        View view3 = c0ege.LIZIZ;
        if (view3 != null) {
            C786410Ut5.T4(view3, 0.34f);
        }
        View view4 = c0ege.LIZIZ;
        if (view4 == null) {
            return;
        }
        view4.setClickable(false);
    }

    @Override // X.InterfaceC372610EjD
    public void dB1(boolean z) {
        View view;
        C0EGE c0ege = this.LLILZ.LLLILZ;
        if (c0ege == null) {
            return;
        }
        if (z) {
            View view2 = c0ege.LIZIZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(0, view2);
            }
            View view3 = c0ege.LIZJ;
            if (view3 != null) {
                C786410Ut5.LJLLLLLL(0, view3);
            }
            if (C365010ESt.LIZIZ(G2()) && (view = c0ege.LIZLLL) != null) {
                C786410Ut5.LJLLLLLL(0, view);
                return;
            }
            return;
        }
        View view4 = c0ege.LIZIZ;
        if (view4 != null) {
            C786410Ut5.LJLLLLLL(8, view4);
        }
        View view5 = c0ege.LIZJ;
        if (view5 != null) {
            C786410Ut5.LJLLLLLL(8, view5);
        }
        View view6 = c0ege.LIZLLL;
        if (view6 == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(8, view6);
    }

    public C376420EpM(C1DRG c1drg, C372480Ej0 c372480Ej0) {
        super(c1drg);
        this.LLILLL = c1drg;
        this.LLILZ = c372480Ej0;
        this.LLILZIL = this;
        this.LLILZLL = C1664770tQJ.LIZ(getDiContainer(), C0EY2.class, null);
        this.LLIZ = C1664770tQJ.LIZ(getDiContainer(), C0E5S.class, null);
        this.LLIZLLLIL = C2296808zG.LIZIZ();
        this.LLJ = new C0EMK(getDiContainer(), c372480Ej0);
        this.LLJI = new C376430EpN(c372480Ej0);
        this.LLJIJIL = new C0EG1(getDiContainer(), c372480Ej0);
        this.LLJILJIL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 880));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 882));
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(this, 884));
        this.LLJJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 881));
        this.LLJJI = C452501pT.LIZIZ(new AwS549S0100000_5(this, 883));
    }

    @Override // X.InterfaceC372610EjD
    public void FP2(Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        C0ELJ c0elj;
        boolean z;
        C0E48 c0e48LIZ;
        boolean z2;
        boolean zIsAdvancedEdit;
        boolean z3;
        boolean z4;
        boolean zBZ;
        boolean z5;
        int i;
        InterfaceC376450EpP interfaceC376450EpPLIZJ;
        CreativeModel creativeModel;
        EditorProDraftModel editorProDraftModel;
        InterfaceC376450EpP interfaceC376450EpPLIZJ2;
        boolean z6;
        CreativeModel creativeModel2;
        EditorProDraftModel editorProDraftModel2;
        InterfaceC376450EpP interfaceC376450EpPLIZJ3;
        InterfaceC1453420nvQ interfaceC1453420nvQ;
        InterfaceC361710EGb interfaceC361710EGb;
        C376610Epf c376610EpfW2 = W2();
        C0EHI value = ((C0EY2) c376610EpfW2.LJII.getValue()).zu2().getValue();
        if (value != null) {
            c0elj = value.LJ;
        } else {
            c0elj = null;
        }
        if (((C0EY2) c376610EpfW2.LJII.getValue()).Tl0().getValue() != null) {
            z = true;
        } else {
            z = false;
        }
        if (c0elj != null && z) {
            VideoPublishEditModel videoPublishEditModelLIZLLL = c376610EpfW2.LIZLLL();
            if (videoPublishEditModelLIZLLL != null && (c0e48LIZ = C349830DnZ.LIZ(c376610EpfW2.LIZ)) != null && c376610EpfW2.LIZIZ.LLLILZ != null) {
                if (c0elj.getFromRetouch()) {
                    C0EAE c0eae = C0EAE.LIZ;
                    C0EAE.LJ(videoPublishEditModelLIZLLL, EnumC373620Ekq.DISCARD);
                }
                if (c0elj.getRetouchMultiTrackMode() && (interfaceC361710EGb = (InterfaceC361710EGb) c376610EpfW2.LIZ.LJIIL(null, InterfaceC361710EGb.class)) != null) {
                    interfaceC361710EGb.LR1(true);
                }
                if (!c0elj.getFromRetouch() && !c0elj.getEffectMultiTrackMode() && c0elj.getChangeBanMusicMode() == null) {
                    if (videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft) {
                        zIsAdvancedEdit = videoPublishEditModelLIZLLL.getEditorProModel().getHasDraftAgain();
                    } else {
                        zIsAdvancedEdit = videoPublishEditModelLIZLLL.getEditorProModel().isAdvancedEdit();
                    }
                    if (!c0e48LIZ.Bo().LIZ() && !zIsAdvancedEdit) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (C365940EWi.LIZ(videoPublishEditModelLIZLLL) && c376610EpfW2.LJIIIZ && (interfaceC1453420nvQ = (InterfaceC1453420nvQ) c376610EpfW2.LIZ.LJIIL(null, InterfaceC1453420nvQ.class)) != null && interfaceC1453420nvQ.yV0()) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (!videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft) {
                        C363500EMy.LIZ.getClass();
                        if (C363500EMy.LJIIL(videoPublishEditModelLIZLLL)) {
                            z3 = true;
                        }
                    }
                    C363500EMy.LIZ.getClass();
                    if (C363500EMy.LJIILIIL(videoPublishEditModelLIZLLL) && (!C354090DuR.LJI.isEmpty())) {
                        z3 = true;
                    }
                    C1398350mUb c1398350mUb = C1398350mUb.LIZIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("EPSaveAndCancelComponent: clickCancel: hasEdited = ");
                    sbLIZ.append(z3);
                    C201955140j.LJIILJJIL(c1398350mUb, C2188811AlT.LIZIZ(sbLIZ));
                    if (!u4.LJJIL(videoPublishEditModelLIZLLL) && !C1416310mxZ.LJJJJIZL(videoPublishEditModelLIZLLL) && (!C354090DuR.LJI.isEmpty())) {
                        c376610EpfW2.LJI.LIZ(c0e48LIZ, videoPublishEditModelLIZLLL, AFwS191S0000000_5.get$arr$(270), AFwS191S0000000_5.get$arr$(313));
                        return;
                    }
                    InterfaceC376450EpP interfaceC376450EpPLIZJ4 = c376610EpfW2.LIZJ();
                    if (interfaceC376450EpPLIZJ4 != null) {
                        zBZ = interfaceC376450EpPLIZJ4.bZ();
                    } else {
                        zBZ = false;
                    }
                    if (!C363500EMy.LJIIIZ(videoPublishEditModelLIZLLL) && ((Boolean) C273670Ao1.LIZ.getValue()).booleanValue() && !videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft && !videoPublishEditModelLIZLLL.isFromCrash() && (C363500EMy.LJIILIIL(videoPublishEditModelLIZLLL) || u4.LJJIZ(videoPublishEditModelLIZLLL) || C363500EMy.LJIIL(videoPublishEditModelLIZLLL) || videoPublishEditModelLIZLLL.creativeModel.editorProSchemeModel.isDeepLink)) {
                        if ((C363500EMy.LJIILIIL(videoPublishEditModelLIZLLL) || u4.LJJIZ(videoPublishEditModelLIZLLL) || C363500EMy.LJIIL(videoPublishEditModelLIZLLL)) && C0A16.LIZ()) {
                            if (!z3 && !C363500EMy.LJIILIIL(videoPublishEditModelLIZLLL)) {
                                if (!u4.LJJIL(videoPublishEditModelLIZLLL) && !C1416310mxZ.LJJJJIZL(videoPublishEditModelLIZLLL)) {
                                    c376610EpfW2.LJ(function2, c0e48LIZ, c0elj);
                                    return;
                                }
                                InterfaceC559500Lwy interfaceC559500Lwy = (InterfaceC559500Lwy) c376610EpfW2.LIZ.LJIIL(null, InterfaceC559500Lwy.class);
                                if (interfaceC559500Lwy != null) {
                                    interfaceC559500Lwy.Bw0();
                                }
                                Boolean bool = Boolean.FALSE;
                                function2.invoke(bool, bool);
                                return;
                            }
                            c376610EpfW2.LJI(videoPublishEditModelLIZLLL, z3, function2, function0);
                            return;
                        }
                        if (c376610EpfW2.LJIIJ) {
                            return;
                        }
                        c376610EpfW2.LJIIJ = true;
                        c376610EpfW2.LIZJ.LJIILLIIL("shoot_page_edit_tab", "editor_tab_exit_auto_save", function2, z3);
                        return;
                    }
                    if (Intrinsics.LJFF(videoPublishEditModelLIZLLL.getEditorProModel().getActionsViaEPMoreOptions(), "save_draft_via_more") && !videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft && !videoPublishEditModelLIZLLL.isFromCrash()) {
                        if (c376610EpfW2.LJIIJ) {
                            return;
                        }
                        c376610EpfW2.LJIIJ = true;
                        c376610EpfW2.LIZJ.LJIILLIIL("shoot_page_edit_tab", "editor_tab_exit_auto_save", function2, z3);
                        return;
                    }
                    if (videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft && C0C64.LJIILLIIL().LJIIIZ(31744, "studio_create_tab_click_cancel_remove_panel", true, false)) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (C1416310mxZ.LJJ(videoPublishEditModelLIZLLL) || zBZ || C363500EMy.LJIIJ(videoPublishEditModelLIZLLL) || (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_back_button_type", true) == 2 && C372630EjF.LIZ(c0elj, videoPublishEditModelLIZLLL) && (c0e48LIZ.Bo().LIZ() || c0elj.isRestoreData()))) {
                        if (z5) {
                            c376610EpfW2.LJFF(function0, function2);
                            return;
                        }
                        if (C357610E0h.LIZ() && C363500EMy.LJIIJ(videoPublishEditModelLIZLLL) && (interfaceC376450EpPLIZJ = c376610EpfW2.LIZJ()) != null && interfaceC376450EpPLIZJ.lo2()) {
                            C1402930mbz.LJII(videoPublishEditModelLIZLLL, "ep");
                        }
                        if (!C1428470nHB.LJJJJIZL(videoPublishEditModelLIZLLL) && !C377240Eqg.LIZIZ(videoPublishEditModelLIZLLL)) {
                            i = 2131846553;
                        } else {
                            i = 2131825353;
                        }
                        C380170EvP.LIZ(c376610EpfW2.LJ, new C380160EvO[]{new C380160EvO(1, 2131846554, R.raw.icon_trash_bin, new AwS41S0500000_5(videoPublishEditModelLIZLLL, c376610EpfW2, c0elj, c0e48LIZ, function2, 5)), new C380160EvO(0, i, R.raw.icon_draft, new AwS41S0500000_5(videoPublishEditModelLIZLLL, (VideoPublishEditModel) c0e48LIZ, (C0E48) c376610EpfW2, (C376610Epf) function0, (Function0<Unit>) function2, (Function2<? super Boolean, ? super Boolean, Unit>) 6))}, new AwS371S0200000_5(videoPublishEditModelLIZLLL, c0e48LIZ, 187));
                        return;
                    }
                    if (C365940EWi.LIZ(videoPublishEditModelLIZLLL) && videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft && z3 && !c376610EpfW2.LJIIIZ) {
                        C1397580mTM c1397580mTM = new C1397580mTM(c376610EpfW2.LIZIZ.requireActivity());
                        c1397580mTM.LIZ(2131830679);
                        C985403tE.LIZ(c1397580mTM, new AwS103S0400000_5(c376610EpfW2, (C376610Epf) function2, (Function2<? super Boolean, ? super Boolean, Unit>) c0e48LIZ, (C0E48) c0elj, (C0ELJ) 5));
                        new C1397510mTF(c1397580mTM).LIZLLL();
                        return;
                    }
                    if (C365940EWi.LIZ(videoPublishEditModelLIZLLL) && !videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft && (z3 || z4)) {
                        C380170EvP.LIZ(c376610EpfW2.LJ, new C380160EvO[]{new C380160EvO(1, 2131846554, R.raw.icon_trash_bin, new AwS41S0500000_5(videoPublishEditModelLIZLLL, c376610EpfW2, c0elj, c0e48LIZ, function2, 7)), new C380160EvO(0, 2131846553, R.raw.icon_draft, new AwS214S0300000_5(c376610EpfW2, (C376610Epf) function2, (Function2<? super Boolean, ? super Boolean, Unit>) videoPublishEditModelLIZLLL, (VideoPublishEditModel) 26))}, new AwS584S0100000_5(videoPublishEditModelLIZLLL, 756));
                        return;
                    }
                    if (C1428470nHB.LJFF(videoPublishEditModelLIZLLL) && !C0EN1.LIZ()) {
                        c376610EpfW2.LJFF(function0, function2);
                        return;
                    }
                    if (((u4.LJJIL(videoPublishEditModelLIZLLL) && !C1428470nHB.LJJLIIIJJI(videoPublishEditModelLIZLLL)) || C1416310mxZ.LJJJJIZL(videoPublishEditModelLIZLLL) || ((creativeModel = videoPublishEditModelLIZLLL.creativeModel) != null && (editorProDraftModel = creativeModel.editorProDraftModel) != null && editorProDraftModel.isEnterFromEditorTabDraft)) && (z3 || videoPublishEditModelLIZLLL.mDraftToEditFrom == 2)) {
                        if (c0elj.enterFromSideMenu()) {
                            c376610EpfW2.LIZJ.LIZIZ(function0, function2, false, false, true, false);
                            return;
                        }
                        if (C363500EMy.LJIILIIL(videoPublishEditModelLIZLLL) && C0A16.LIZ()) {
                            if (z5) {
                                c376610EpfW2.LJFF(function0, function2);
                                return;
                            } else {
                                c376610EpfW2.LJI(videoPublishEditModelLIZLLL, z3, function2, function0);
                                return;
                            }
                        }
                        if ((u4.LJJIZ(videoPublishEditModelLIZLLL) || C363500EMy.LJIIL(videoPublishEditModelLIZLLL)) && C0A16.LIZ()) {
                            if (!z3 && videoPublishEditModelLIZLLL.mDraftToEditFrom != 2) {
                                if (!u4.LJJIL(videoPublishEditModelLIZLLL) && !C1416310mxZ.LJJJJIZL(videoPublishEditModelLIZLLL)) {
                                    c376610EpfW2.LJ(function2, c0e48LIZ, c0elj);
                                    return;
                                }
                                InterfaceC559500Lwy interfaceC559500Lwy2 = (InterfaceC559500Lwy) c376610EpfW2.LIZ.LJIIL(null, InterfaceC559500Lwy.class);
                                if (interfaceC559500Lwy2 != null) {
                                    interfaceC559500Lwy2.Bw0();
                                }
                                Boolean bool2 = Boolean.FALSE;
                                function2.invoke(bool2, bool2);
                                return;
                            }
                            if (z5) {
                                c376610EpfW2.LJFF(function0, function2);
                                return;
                            } else {
                                c376610EpfW2.LJI(videoPublishEditModelLIZLLL, z3, function2, function0);
                                return;
                            }
                        }
                        if (!C363500EMy.LJIIIZ(videoPublishEditModelLIZLLL) && !videoPublishEditModelLIZLLL.creativeModel.draftInfoModel.isDraft && !videoPublishEditModelLIZLLL.isFromCrash()) {
                            if (c376610EpfW2.LJIIJ) {
                                return;
                            }
                            c376610EpfW2.LJIIJ = true;
                            c376610EpfW2.LIZJ.LJIILLIIL("shoot_page_edit_tab", "editor_tab_exit_auto_save", function2, z3);
                            return;
                        }
                        c376610EpfW2.LJFF(function0, function2);
                        return;
                    }
                    if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_editor_pro_back_button_type", true) > 0 && C372630EjF.LIZ(c0elj, c376610EpfW2.LIZLLL()) && (c0e48LIZ.Bo().LIZ() || c0elj.isRestoreData() || c0elj.getAutoOpenEPFromAsyncMagic() || c0elj.getAutoOpenEPFromAIGC())) {
                        c376610EpfW2.LIZJ.LIZIZ(function0, function2, false, false, true, false);
                        if (!C379370Eu7.LIZIZ(c376610EpfW2.LIZLLL()) || (interfaceC376450EpPLIZJ3 = c376610EpfW2.LIZJ()) == null) {
                            return;
                        }
                        interfaceC376450EpPLIZJ3.yC1(false);
                        return;
                    }
                    C372540Ej6 c372540Ej6 = c376610EpfW2.LIZLLL;
                    c372540Ej6.getClass();
                    C0E48 c0e48LIZ2 = C349830DnZ.LIZ(c372540Ej6.LIZ);
                    if (c0e48LIZ2 != null) {
                        Boolean bool3 = Boolean.FALSE;
                        if (!((Boolean) c0e48LIZ2.S7().LIZJ("is_showing_album_page", bool3)).booleanValue()) {
                            VideoPublishEditModel videoPublishEditModelLIZIZ = c372540Ej6.LIZIZ();
                            if (videoPublishEditModelLIZIZ != null && (creativeModel2 = videoPublishEditModelLIZIZ.creativeModel) != null && (editorProDraftModel2 = creativeModel2.editorProDraftModel) != null && editorProDraftModel2.isEnterFromEditorTabDraft) {
                                InterfaceC1453420nvQ interfaceC1453420nvQ2 = (InterfaceC1453420nvQ) c372540Ej6.LIZ.LJIIL(null, InterfaceC1453420nvQ.class);
                                if (interfaceC1453420nvQ2 != null) {
                                    interfaceC1453420nvQ2.dC1();
                                }
                            } else if ((u4.LJJIL(videoPublishEditModelLIZIZ) || C1416310mxZ.LJJJJIZL(videoPublishEditModelLIZIZ)) && videoPublishEditModelLIZIZ != null && videoPublishEditModelLIZIZ.creativeModel.draftInfoModel.isDraft) {
                                function2.invoke(bool3, bool3);
                            } else {
                                if (c0e48LIZ2.LLLLLLIL() != null) {
                                    z6 = false;
                                    ((C0E5S) c372540Ej6.LJI.getValue()).w6(null, false, false);
                                } else {
                                    z6 = false;
                                }
                                c0e48LIZ2.S7().LIZIZ(Boolean.TRUE, "about_to_exit_edit_page", z6);
                                c372540Ej6.LIZLLL(function2, true);
                            }
                        }
                    }
                    if (!C379370Eu7.LIZIZ(c376610EpfW2.LIZLLL()) || (interfaceC376450EpPLIZJ2 = c376610EpfW2.LIZJ()) == null) {
                        return;
                    }
                    interfaceC376450EpPLIZJ2.yC1(true);
                    return;
                }
                C372540Ej6 c372540Ej62 = c376610EpfW2.LIZLLL;
                c372540Ej62.getClass();
                C0E48 c0e48LIZ3 = C349830DnZ.LIZ(c372540Ej62.LIZ);
                if (c0e48LIZ3 == null || ((Boolean) c0e48LIZ3.S7().LIZJ("is_showing_album_page", Boolean.FALSE)).booleanValue()) {
                    return;
                }
                if (c0e48LIZ3.LLLLLLIL() != null) {
                    z2 = false;
                    ((C0E5S) c372540Ej62.LJI.getValue()).w6(null, false, false);
                } else {
                    z2 = false;
                }
                c0e48LIZ3.S7().LIZIZ(Boolean.TRUE, "about_to_exit_edit_page", z2);
                c372540Ej62.LIZLLL(function2, true);
                return;
            }
            return;
        }
        Boolean bool4 = Boolean.FALSE;
        function2.invoke(bool4, bool4);
    }

    @Override // X.InterfaceC372610EjD
    public void TO1(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z) {
        o2().LIZ(function2, z);
    }

    @Override // X.InterfaceC372610EjD
    public boolean jl0(Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2) {
        List<LyricStickerModel> listI4;
        C376610Epf c376610EpfW2 = W2();
        C0EHC c0ehc = (C0EHC) c376610EpfW2.LIZ.LJIIL(null, C0EHC.class);
        if (c0ehc != null && (listI4 = c0ehc.i4()) != null && !listI4.isEmpty()) {
            c376610EpfW2.LIZIZ(new AwS249S0300000_5(c376610EpfW2, (C376610Epf) function0, (Function0<Unit>) function2, (Function2<? super Boolean, ? super Boolean, Unit>) 15));
            return false;
        }
        return c376610EpfW2.LIZ(function0, function2);
    }

    public final boolean m3(Function0<Unit> function0, Function2<? super Boolean, ? super Boolean, Unit> function2, Function0<Unit> function02) {
        Boolean boolValueOf;
        C376610Epf c376610EpfW2 = W2();
        c376610EpfW2.getClass();
        if (C379370Eu7.LIZIZ(c376610EpfW2.LIZLLL())) {
            InterfaceC376450EpP interfaceC376450EpPLIZJ = c376610EpfW2.LIZJ();
            if (interfaceC376450EpPLIZJ != null) {
                boolValueOf = Boolean.valueOf(interfaceC376450EpPLIZJ.mM0(new AwS134S0400000_5(c376610EpfW2, (C376610Epf) function0, (Function0<Unit>) function2, (Function2<? super Boolean, ? super Boolean, Unit>) function02, (Function0<Unit>) 2), AFwS191S0000000_5.get$arr$(269)));
            } else {
                boolValueOf = null;
            }
            if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC372610EjD
    public void QJ0(Function2<? super Boolean, ? super Boolean, Unit> function2, boolean z, boolean z2, boolean z3) {
        c3().LIZIZ(AFwS191S0000000_5.get$arr$(266), function2, false, z, z2, z3);
    }
}
