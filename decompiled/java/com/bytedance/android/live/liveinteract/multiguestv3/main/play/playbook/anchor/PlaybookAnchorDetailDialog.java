package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.C01GW;
import X.C09AY;
import X.C0TVI;
import X.C1119170fEJ;
import X.C1308910kAL;
import X.C14K9;
import X.C168A;
import X.C1EOY;
import X.C20341414ia;
import X.C20345014jA;
import X.C20373514nl;
import X.C20379114of;
import X.C20381014oy;
import X.C20382414pC;
import X.C20382514pD;
import X.C20382714pF;
import X.C20382814pG;
import X.C20441214yg;
import X.C20736316Cj;
import X.C2188811AlT;
import X.C452501pT;
import X.C758170Tod;
import X.C784920Uqg;
import X.C786410Ut5;
import X.C915190ZvJ;
import X.C978360bZC;
import X.C978390bZF;
import X.EnumC20429314wl;
import X.InterfaceC20387814q4;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.design.view.sheet.SheetOptions;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.NeedCloseMultiLiveDialogEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.RefreshPlaybookListEvent;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.model.PlaybookBizChannel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookContent;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookAnchorDetailDialog extends BasePlaybookSheetFragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiJSYlLSwiPSohKSY4ZyImJDElLjo2OzE6emHELIOSE+KSwiZz8/KTxiOSMyMScjJiR9KSsvISAhZhUgKDYxJyonCCEwICo+DSonKSwgDSYyJCor";
    public PlaybookAnchorViewModel LLJZIJLIL;
    public C20382814pG LLL;
    public long LLLF;
    public DataChannel LLLFF;
    public C09AY LLLFFI;
    public boolean LLLFZ;
    public String LLLI;
    public LinearLayout LLLII;
    public volatile boolean LLLIIII;
    public final C01GW LLLIIIIL;
    public final C01GW LLLIIIL;
    public final C01GW LLLIIL;
    public final C01GW LLLIILIL;
    public final boolean LLLIL;
    public final String LLLILZ;
    public boolean LLLILZJ;
    public final C20382714pF LLLILZLLLI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final int getLayoutId() {
        return R.layout.h9l;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void BS() {
        /*
            r3 = this;
            com.bytedance.ies.sdk.datachannel.DataChannel r0 = r3.LLLFF
            if (r0 == 0) goto L23
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorServiceV2 r2 = X.C784920Uqg.LIZIZ(r0)
            if (r2 == 0) goto L23
            boolean r0 = X.C978390bZF.LIZ()
            if (r0 == 0) goto L28
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel r0 = r3.LLJZIJLIL
            if (r0 == 0) goto L18
            X.14wl r1 = r0.LLIZLLLIL
            if (r1 != 0) goto L1a
        L18:
            X.14wl r1 = X.EnumC20429314wl.MULTI_GUEST
        L1a:
            X.14wl r0 = X.EnumC20429314wl.ACTIVITY
            if (r1 != r0) goto L28
            X.14wl r0 = X.EnumC20429314wl.INTERACT
        L20:
            r2.LJJJJ(r0)
        L23:
            r0 = 1
            r3.close(r0)
            return
        L28:
            r0 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorDetailDialog.BS():void");
    }

    public final String ES() {
        return (String) this.LLLIIIIL.getValue();
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final C1119170fEJ gS() {
        if (!this.LLLFZ) {
            return null;
        }
        C1119170fEJ c1119170fEJ = new C1119170fEJ();
        c1119170fEJ.LJI = false;
        ArrayList arrayList = new ArrayList();
        C758170Tod c758170TodVR = VR();
        if (c758170TodVR != null) {
            arrayList.add(c758170TodVR);
        }
        c1119170fEJ.LJ = arrayList;
        return c1119170fEJ;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.14pF] */
    public PlaybookAnchorDetailDialog() {
        C20382814pG c20382814pG = this.LLL;
        this.LLLIIII = c20382814pG != null ? c20382814pG.LJ : false;
        this.LLLIIIIL = C452501pT.LIZIZ(new C20345014jA(this));
        this.LLLIIIL = C452501pT.LIZIZ(new C20382414pC(this));
        this.LLLIIL = C452501pT.LIZIZ(new C20381014oy(this));
        this.LLLIILIL = C452501pT.LIZIZ(new C20382514pD(this));
        this.LLLIL = true;
        this.LLLILZ = "playbook_detail_panel";
        this.LLLILZLLLI = new InterfaceC20387814q4() { // from class: X.14pF
            @Override // X.InterfaceC20387814q4
            public final void LJFF() {
                MutableLiveData<C20379114of> mutableLiveData;
                C20379114of value;
                Playbook playbook = null;
                C1AZW.LJIIJ(12, C01EI.LIZ(0, this.LIZ.ES()), "clickBack2Poly", null, null);
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LIZ;
                DataChannel dataChannel = playbookAnchorDetailDialog.LLLFF;
                PlaybookAnchorViewModel playbookAnchorViewModel = playbookAnchorDetailDialog.LLJZIJLIL;
                if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null) {
                    playbook = value.LIZ;
                }
                PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LIZ.LLJZIJLIL;
                C978360bZC.LJIILIIL(dataChannel, "back", playbook, playbookAnchorViewModel2 != null ? playbookAnchorViewModel2.yQ2() : false, null, 0, 0L, 112);
                this.LIZ.LLLIIII = false;
                this.LIZ.BS();
            }

            @Override // X.InterfaceC20387814q4
            public final void LIZIZ(AwS575S0100000_31 awS575S0100000_31) {
                C20379114of value;
                MutableLiveData<ActivePlaybook> mutableLiveData;
                ActivePlaybook value2;
                final Playbook playbook;
                Boolean boolValueOf;
                Function2 function2;
                int i;
                Function2 function22;
                Boolean boolValueOf2 = null;
                C1AZW.LJIIJ(12, C01EI.LIZ(0, this.LIZ.ES()), "clickRemove", null, null);
                PlaybookAnchorViewModel playbookAnchorViewModel = this.LIZ.LLJZIJLIL;
                if (playbookAnchorViewModel == null || (value = playbookAnchorViewModel.LLILLL.getValue()) == null) {
                    return;
                }
                C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                C978360bZC.LJIILIIL(this.LIZ.LLLFF, "remove", value.LIZ, playbookAnchorViewModel.yQ2(), null, 0, 0L, 112);
                final C501601xO c501601xO = (C501601xO) this.LIZ.LLLIIIL.getValue();
                final C20341314iZ c20341314iZ = new C20341314iZ(this, this.LIZ, awS575S0100000_31);
                PlaybookAnchorViewModel playbookAnchorViewModel2 = c501601xO.LIZIZ;
                if (playbookAnchorViewModel2 != null && (mutableLiveData = playbookAnchorViewModel2.LLILLJJLI) != null && (value2 = mutableLiveData.getValue()) != null && (playbook = value2.playbook) != null) {
                    if ((!playbook.isMyFavorite) && (!playbook.isMyCreation)) {
                        String strLIZ = C01EI.LIZ(0, "PlaybookOpenDetailHelper");
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("beforeRemoveCheck showFavoriteConfirmDialog forceEndTask:");
                        sbLIZ.append(true);
                        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
                        C782110Um9 c782110Um9 = new C782110Um9(c501601xO.LIZ);
                        c782110Um9.LJIIZILJ(2131854114);
                        ActivePlaybook activePlaybook = c501601xO.LIZIZ.LLJJJJJIL.LJIIIZ;
                        if (activePlaybook != null) {
                            boolValueOf2 = Boolean.valueOf(activePlaybook.existsCustomContent);
                        }
                        if (C500260Jjc.LJJJI(boolValueOf2)) {
                            i = 2131854113;
                        } else {
                            i = 2131854112;
                        }
                        c782110Um9.LJII(i);
                        c782110Um9.LJIILL = false;
                        c782110Um9.LJIILIIL(2131854111, new InterfaceC743640TFa() { // from class: X.14pK
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                                DataChannel dataChannel = c501601xO.LIZJ;
                                if (dataChannel != null) {
                                    dataChannel.SX0(C168A.class, Boolean.TRUE);
                                }
                                C501601xO.LIZ(c501601xO, true, c20341314iZ, new C20383814pQ(), 4);
                                DataChannel dataChannel2 = c501601xO.LIZJ;
                                if (dataChannel2 != null) {
                                    Playbook playbook2 = playbook;
                                    Function2 function23 = (Function2) dataChannel2.gg0(PlaybookBizChannel.class);
                                    if (function23 != null) {
                                        function23.invoke(EnumC986300bm0.DID_REMOVE_PLAYBOOK_CONFIRM, playbook2);
                                    }
                                }
                            }
                        });
                        c782110Um9.LJIIJ(2131854087, new InterfaceC743640TFa() { // from class: X.14pM
                            public final /* synthetic */ boolean LIZ = true;

                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                                if (this.LIZ) {
                                    C501601xO.LIZ(c501601xO, false, c20341314iZ, null, 12);
                                }
                                DataChannel dataChannel = c501601xO.LIZJ;
                                if (dataChannel != null) {
                                    Playbook playbook2 = playbook;
                                    Function2 function23 = (Function2) dataChannel.gg0(PlaybookBizChannel.class);
                                    if (function23 != null) {
                                        function23.invoke(EnumC986300bm0.DID_REMOVE_PLAYBOOK_CANCEL, playbook2);
                                    }
                                }
                            }
                        });
                        C786410Ut5.E4(c782110Um9.LIZ());
                        DataChannel dataChannel = c501601xO.LIZJ;
                        if (dataChannel != null && (function22 = (Function2) dataChannel.gg0(PlaybookBizChannel.class)) != null) {
                            function22.invoke(EnumC986300bm0.DID_REMOVE_PLAYBOOK_SHOW, playbook);
                            return;
                        }
                        return;
                    }
                    ActivePlaybook activePlaybook2 = c501601xO.LIZIZ.LLJJJJJIL.LJIIIZ;
                    if (activePlaybook2 != null) {
                        boolValueOf = Boolean.valueOf(activePlaybook2.existsCustomContent);
                    } else {
                        boolValueOf = null;
                    }
                    if (C500260Jjc.LJJJI(boolValueOf)) {
                        if (playbook.isMyCreation) {
                            C501601xO.LIZ(c501601xO, false, c20341314iZ, null, 8);
                            return;
                        }
                        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookOpenDetailHelper"), "beforeRemoveCheck showModifySaveConfirmDialog", null, null);
                        C782110Um9 c782110Um92 = new C782110Um9(c501601xO.LIZ);
                        c782110Um92.LJIIZILJ(2131854118);
                        c782110Um92.LJII(2131854117);
                        c782110Um92.LJIILL = false;
                        c782110Um92.LJIILIIL(2131854116, new InterfaceC743640TFa() { // from class: X.14pL
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                                C766270U4b.LIZLLL(2131854119);
                                C501601xO.LIZ(c501601xO, true, c20341314iZ, null, 12);
                                DataChannel dataChannel2 = c501601xO.LIZJ;
                                if (dataChannel2 != null) {
                                    Playbook playbook2 = playbook;
                                    Function2 function23 = (Function2) dataChannel2.gg0(PlaybookBizChannel.class);
                                    if (function23 != null) {
                                        function23.invoke(EnumC986300bm0.DID_REMOVE_PLAYBOOK_CONFIRM, playbook2);
                                    }
                                }
                            }
                        });
                        c782110Um92.LJIIJ(2131854087, new InterfaceC743640TFa() { // from class: X.14pN
                            @Override // X.InterfaceC743640TFa
                            public final void LIZ(LiveDialog liveDialog) {
                                liveDialog.dismiss();
                                C501601xO.LIZ(c501601xO, false, c20341314iZ, null, 12);
                                DataChannel dataChannel2 = c501601xO.LIZJ;
                                if (dataChannel2 != null) {
                                    Playbook playbook2 = playbook;
                                    Function2 function23 = (Function2) dataChannel2.gg0(PlaybookBizChannel.class);
                                    if (function23 != null) {
                                        function23.invoke(EnumC986300bm0.DID_REMOVE_PLAYBOOK_CANCEL, playbook2);
                                    }
                                }
                            }
                        });
                        C786410Ut5.E4(c782110Um92.LIZ());
                        DataChannel dataChannel2 = c501601xO.LIZJ;
                        if (dataChannel2 == null || (function2 = (Function2) dataChannel2.gg0(PlaybookBizChannel.class)) == null) {
                            return;
                        }
                        function2.invoke(EnumC986300bm0.DID_REMOVE_PLAYBOOK_SHOW, playbook);
                        return;
                    }
                    C501601xO.LIZ(c501601xO, false, c20341314iZ, null, 12);
                }
            }

            @Override // X.InterfaceC20387814q4
            public final void LIZ(C20379114of c20379114of, final AwS575S0100000_31 awS575S0100000_31) {
                MutableLiveData<C20379114of> mutableLiveData;
                C20379114of value;
                final Playbook playbook;
                long j;
                String str;
                String strLIZ;
                String strLIZ2;
                MutableLiveData<ActivePlaybook> mutableLiveData2;
                ActivePlaybook value2;
                Playbook playbook2;
                Playbook playbook3;
                Long lValueOf;
                C1AZW.LJIIJ(12, C01EI.LIZ(0, this.LIZ.ES()), "clickStart", null, null);
                if (c20379114of == null || (playbook = c20379114of.LIZ) == null) {
                    PlaybookAnchorViewModel playbookAnchorViewModel = this.LIZ.LLJZIJLIL;
                    if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null) {
                        playbook = value.LIZ;
                    } else {
                        return;
                    }
                }
                PlaybookContent playbookContent = playbook.content;
                if ((playbookContent != null && (playbookContent.contentStatus == 3 || playbookContent.contentStatus == 0)) || C758560TpG.LIZ) {
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LIZ.LLJZIJLIL;
                    if (playbookAnchorViewModel2 != null && (mutableLiveData2 = playbookAnchorViewModel2.LLILLJJLI) != null && (value2 = mutableLiveData2.getValue()) != null && (playbook2 = value2.playbook) != null && playbook2.playbookId != playbook.playbookId) {
                        final C501601xO c501601xO = (C501601xO) this.LIZ.LLLIIIL.getValue();
                        PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LIZ;
                        final C20382814pG c20382814pG2 = playbookAnchorDetailDialog.LLL;
                        final C20383114pJ c20383114pJ = new C20383114pJ(playbookAnchorDetailDialog, playbook, awS575S0100000_31);
                        PlaybookAnchorViewModel playbookAnchorViewModel3 = c501601xO.LIZIZ;
                        if (playbookAnchorViewModel3 != null) {
                            ActivePlaybook value3 = playbookAnchorViewModel3.LLILLJJLI.getValue();
                            if (value3 == null || ((playbook3 = value3.playbook) != null && playbook3.playbookId == playbook.playbookId)) {
                                c20383114pJ.invoke();
                                return;
                            }
                            String strLIZ3 = C01EI.LIZ(0, "PlaybookOpenDetailHelper");
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("clickPlaybook show replace oldPlaybookId:");
                            Playbook playbook4 = value3.playbook;
                            if (playbook4 != null) {
                                lValueOf = Long.valueOf(playbook4.playbookId);
                            } else {
                                lValueOf = null;
                            }
                            sbLIZ.append(lValueOf);
                            sbLIZ.append(" newPlaybookId:");
                            sbLIZ.append(playbook.playbookId);
                            C1AZW.LJIIJ(12, strLIZ3, C2188811AlT.LIZIZ(sbLIZ), null, null);
                            C782110Um9 c782110Um9 = new C782110Um9(c501601xO.LIZ);
                            c782110Um9.LJIIZILJ(2131854094);
                            c782110Um9.LJII(2131854093);
                            c782110Um9.LJIILL = false;
                            c782110Um9.LJIILIIL(2131854092, new InterfaceC743640TFa() { // from class: X.14pO
                                @Override // X.InterfaceC743640TFa
                                public final void LIZ(LiveDialog liveDialog) {
                                    liveDialog.dismiss();
                                    C501601xO c501601xO2 = c501601xO;
                                    C501601xO.LIZ(c501601xO2, false, new C20382914pH(c501601xO2, playbook, c20382814pG2, c20383114pJ), null, 12);
                                    DataChannel dataChannel = c501601xO.LIZJ;
                                    if (dataChannel != null) {
                                        PlaybookUtilKt.LJIIIZ(dataChannel, playbook);
                                    }
                                }
                            });
                            c782110Um9.LJIIJ(2131854087, new InterfaceC743640TFa() { // from class: X.14pP
                                @Override // X.InterfaceC743640TFa
                                public final void LIZ(LiveDialog liveDialog) {
                                    liveDialog.dismiss();
                                    DataChannel dataChannel = c501601xO.LIZJ;
                                    if (dataChannel != null) {
                                        PlaybookUtilKt.LJIIIIZZ(dataChannel, playbook);
                                    }
                                }
                            });
                            C786410Ut5.E4(c782110Um9.LIZ());
                            DataChannel dataChannel = c501601xO.LIZJ;
                            if (dataChannel == null) {
                                return;
                            }
                            PlaybookUtilKt.LJIIJ(dataChannel, playbook);
                            return;
                        }
                        return;
                    }
                    final PlaybookAnchorDetailDialog playbookAnchorDetailDialog2 = this.LIZ;
                    PlaybookAnchorViewModel playbookAnchorViewModel4 = playbookAnchorDetailDialog2.LLJZIJLIL;
                    if (playbookAnchorViewModel4 != null) {
                        InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>> interfaceC170900l9 = new InterfaceC170900l9<C470590Icr<PlaybookStartResponse.ResponseData>>() { // from class: X.14pI
                            @Override // X.InterfaceC170900l9
                            public final void LIZ(C470590Icr<PlaybookStartResponse.ResponseData> c470590Icr) {
                                PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
                                Function1<Long, Unit> function1;
                                Boolean boolValueOf = null;
                                C1AZW.LJIIJ(12, C01EI.LIZ(0, playbookAnchorDetailDialog2.ES()), "clickStart success", null, null);
                                C20382814pG c20382814pG3 = playbookAnchorDetailDialog2.LLL;
                                if (c20382814pG3 != null && (function1 = c20382814pG3.LJIJJLI) != null) {
                                    function1.invoke(Long.valueOf(playbook.playbookId));
                                }
                                if (C500260Jjc.LJJIL()) {
                                    C20382814pG c20382814pG4 = playbookAnchorDetailDialog2.LLL;
                                    if (c20382814pG4 != null) {
                                        boolValueOf = Boolean.valueOf(c20382814pG4.LJIIIZ);
                                    }
                                    if (C500260Jjc.LJJIJIL(boolValueOf)) {
                                        C766270U4b.LIZLLL(2131854097);
                                    }
                                    DataChannel dataChannel2 = playbookAnchorDetailDialog2.LLLFF;
                                    if (dataChannel2 != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel2)) != null) {
                                        playbookAnchorServiceV2LIZIZ.LJIJI("previewStartPlaybook");
                                    }
                                } else {
                                    C20382814pG c20382814pG5 = playbookAnchorDetailDialog2.LLL;
                                    if (c20382814pG5 != null) {
                                        boolValueOf = Boolean.valueOf(c20382814pG5.LJIIIZ);
                                    }
                                    if (C500260Jjc.LJJIJIL(boolValueOf)) {
                                        C766270U4b.LIZLLL(2131854099);
                                    }
                                }
                                Function0<Unit> function0 = awS575S0100000_31;
                                if (function0 != null) {
                                    function0.invoke();
                                }
                            }

                            @Override // X.InterfaceC170900l9
                            public final void onFailed(Throwable th) {
                                String message;
                                String strLIZ4 = C01EI.LIZ(0, playbookAnchorDetailDialog2.ES());
                                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                sbLIZ2.append("startPlaybook onFailed:");
                                if (th != null) {
                                    message = th.getMessage();
                                } else {
                                    message = null;
                                }
                                sbLIZ2.append(message);
                                C1AZW.LJIIJ(12, strLIZ4, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                            }
                        };
                        Long lValueOf2 = Long.valueOf(playbook.playbookId);
                        PlaybookContent playbookContent2 = playbook.content;
                        long j2 = 0;
                        if (playbookContent2 != null) {
                            j = playbookContent2.playbookContentId;
                        } else {
                            j = 0;
                        }
                        Long lValueOf3 = Long.valueOf(j);
                        PlaybookContent playbookContent3 = playbook.content;
                        if (playbookContent3 != null) {
                            j2 = playbookContent3.originalPlaybookContentId;
                        }
                        Long lValueOf4 = Long.valueOf(j2);
                        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                        String str2 = C978360bZC.LJFF().LIZ;
                        String strLIZ4 = C20392214qm.LIZ();
                        C20382814pG c20382814pG3 = this.LIZ.LLL;
                        if (c20382814pG3 == null || (str = c20382814pG3.LJI) == null) {
                            str = "fun_kit";
                        }
                        String strLIZLLL = C978360bZC.LIZLLL();
                        InterfaceC986020blY interfaceC986020blYMb0 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
                        String str3 = "";
                        if (interfaceC986020blYMb0 == null || (strLIZ = interfaceC986020blYMb0.LIZ(EnumC20429914wr.PAGE, EnumC499801x6.PLAYBOOK)) == null) {
                            strLIZ = "";
                        }
                        InterfaceC986020blY interfaceC986020blYMb02 = ((ILoggerService) C1161920gLG.LIZJ(ILoggerService.class)).mb0();
                        if (interfaceC986020blYMb02 != null && (strLIZ2 = interfaceC986020blYMb02.LIZ(EnumC20429914wr.ENTRANCE, EnumC499801x6.PLAYBOOK)) != null) {
                            str3 = strLIZ2;
                        }
                        PlaybookAnchorViewModel.SQ2(playbookAnchorViewModel4, interfaceC170900l9, null, lValueOf2, lValueOf3, lValueOf4, null, null, str2, strLIZ4, true, str, strLIZLLL, strLIZ, str3, false, false, 114784);
                        return;
                    }
                    return;
                }
                C766270U4b.LIZLLL(2131854078);
            }

            @Override // X.InterfaceC20387814q4
            public final void LIZJ(C20379114of c20379114of, C20359414lU c20359414lU) {
                Playbook playbook;
                MutableLiveData<C20379114of> mutableLiveData;
                C20379114of value;
                Object obj;
                long j;
                Boolean boolValueOf = null;
                if (c20379114of == null || (playbook = c20379114of.LIZ) == null) {
                    PlaybookAnchorViewModel playbookAnchorViewModel = this.LIZ.LLJZIJLIL;
                    if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null) {
                        playbook = value.LIZ;
                    } else {
                        playbook = null;
                    }
                }
                if (c20359414lU.LIZJ.isEmpty()) {
                    j = c20359414lU.LIZ;
                    obj = null;
                } else {
                    obj = ListProtector.get(c20359414lU.LIZJ, 0);
                    j = ((C20361214lm) obj).LIZIZ;
                }
                if (playbook != null) {
                    PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LIZ;
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookAnchorDetailDialog.LLJZIJLIL;
                    if (playbookAnchorViewModel2 != null) {
                        boolValueOf = Boolean.valueOf(playbookAnchorViewModel2.PQ2(playbook));
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                        return;
                    }
                    if (obj != null && ((C20361214lm) obj).LIZJ.LJI != 0) {
                        C766270U4b.LIZLLL(2131854102);
                        return;
                    }
                    PlaybookAnchorViewModel playbookAnchorViewModel3 = playbookAnchorDetailDialog.LLJZIJLIL;
                    if (playbookAnchorViewModel3 != null) {
                        playbookAnchorViewModel3.OQ2(j, playbook);
                    }
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:29:0x00c9  */
            /* JADX WARN: Removed duplicated region for block: B:32:0x00d1  */
            /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x010c  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0149  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
            @Override // X.InterfaceC20387814q4
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZLLL(X.C20361214lm r23, X.C20379114of r24) {
                /*
                    Method dump skipped, instruction units count: 379
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C20382714pF.LIZLLL(X.14lm, X.14of):void");
            }

            @Override // X.InterfaceC20387814q4
            public final void LJ(C20361214lm c20361214lm, C20379114of c20379114of) {
                PlaybookAnchorViewModel playbookAnchorViewModel;
                MutableLiveData<C20379114of> mutableLiveData;
                C20379114of value;
                Playbook playbook;
                Boolean boolValueOf = null;
                if ((c20379114of != null && (playbook = c20379114of.LIZ) != null) || ((playbookAnchorViewModel = this.LIZ.LLJZIJLIL) != null && (mutableLiveData = playbookAnchorViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null)) {
                    PlaybookAnchorDetailDialog playbookAnchorDetailDialog = this.LIZ;
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = playbookAnchorDetailDialog.LLJZIJLIL;
                    if (playbookAnchorViewModel2 != null) {
                        boolValueOf = Boolean.valueOf(playbookAnchorViewModel2.PQ2(playbook));
                    }
                    if (C500260Jjc.LJJIJIIJIL(boolValueOf)) {
                        return;
                    }
                    if (c20361214lm.LIZJ.LJI == 0) {
                        PlaybookAnchorViewModel playbookAnchorViewModel3 = playbookAnchorDetailDialog.LLJZIJLIL;
                        if (playbookAnchorViewModel3 != null) {
                            playbookAnchorViewModel3.OQ2(c20361214lm.LIZIZ, playbook);
                            return;
                        }
                        return;
                    }
                    C766270U4b.LIZLLL(2131854102);
                }
            }
        };
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.09AY, kotlin.jvm.functions.Function0] */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        C20379114of value;
        Playbook playbook;
        Function1<Long, Unit> function1;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value2;
        Playbook playbook2;
        super.onDestroy();
        C1EOY.LIZ.LJJII("playbook_detail_panel");
        C20382814pG c20382814pG = this.LLL;
        if (c20382814pG != null && (function1 = c20382814pG.LJIJ) != null) {
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLJZIJLIL;
            function1.invoke(Long.valueOf((playbookAnchorViewModel == null || (mutableLiveData = playbookAnchorViewModel.LLILLL) == null || (value2 = mutableLiveData.getValue()) == null || (playbook2 = value2.LIZ) == null) ? 0L : playbook2.playbookId));
        }
        PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLJZIJLIL;
        if (playbookAnchorViewModel2 != null) {
            MutableLiveData<C20379114of> mutableLiveData2 = playbookAnchorViewModel2.LLILLL;
            if (mutableLiveData2 == null || (value = mutableLiveData2.getValue()) == null || (playbook = value.LIZ) == null) {
                return;
            } else {
                playbookAnchorViewModel2.AQ2(playbook, this.LLLILZJ);
            }
        }
        ?? r0 = this.LLLFFI;
        if (r0 != 0) {
            r0.invoke();
        }
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C20441214yg.LIZIZ("PlaybookLogHelperUtils", "clearDetailData");
        C978360bZC.LIZIZ = System.currentTimeMillis();
        C978360bZC.LIZ = System.currentTimeMillis();
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final boolean wS() {
        return this.LLLIL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment
    public final String yS() {
        return this.LLLILZ;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int QM(Context context) {
        return C20736316Cj.LIZIZ(R.attr.exw, context);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final SheetOptions iS(Context context) {
        return C20373514nl.LIZ(this.LLLFZ);
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final int l5(Context context) {
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ext, context);
        if (numLIZJ != null) {
            return numLIZJ.intValue();
        }
        return -1;
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, X.InterfaceC20484815Dq
    public final void x1(int i) {
        Function1<Long, Boolean> function1;
        PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ;
        EnumC20429314wl enumC20429314wl;
        long j;
        MutableLiveData<C20379114of> mutableLiveData;
        C20379114of value;
        Playbook playbook;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[onDismiss], cause=");
        sbLIZ.append(i);
        C20441214yg.LIZIZ("PlaybookAnchorDetailDialog", C2188811AlT.LIZIZ(sbLIZ));
        C20382814pG c20382814pG = this.LLL;
        if (c20382814pG != null) {
            function1 = c20382814pG.LJJIII;
        } else {
            function1 = null;
        }
        if (function1 != null && (i == 2 || i == 4)) {
            PlaybookAnchorViewModel playbookAnchorViewModel = this.LLJZIJLIL;
            if (playbookAnchorViewModel != null && (mutableLiveData = playbookAnchorViewModel.LLILLL) != null && (value = mutableLiveData.getValue()) != null && (playbook = value.LIZ) != null) {
                j = playbook.playbookId;
            } else {
                j = 0;
            }
            if (function1.invoke(Long.valueOf(j)).booleanValue()) {
                this.LLLIIII = false;
            }
        }
        if (i == 2 && this.LLLIIII) {
            this.LLLIIII = false;
            if (C978390bZF.LIZ()) {
                BS();
            } else {
                DataChannel dataChannel = this.LLLFF;
                if (dataChannel != null && (playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(dataChannel)) != null) {
                    C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
                    PlaybookAnchorViewModel playbookAnchorViewModel2 = this.LLJZIJLIL;
                    if (playbookAnchorViewModel2 == null || (enumC20429314wl = playbookAnchorViewModel2.LLIZ) == null) {
                        enumC20429314wl = EnumC20429314wl.MULTI_GUEST;
                    }
                    playbookAnchorServiceV2LIZIZ.LJJI(true, "", c915190ZvJ, enumC20429314wl, null);
                }
            }
        }
        DataChannel dataChannel2 = this.LLLFF;
        if (dataChannel2 != null && Intrinsics.LJFF(dataChannel2.gg0(C168A.class), Boolean.TRUE)) {
            DataChannel dataChannel3 = this.LLLFF;
            if (dataChannel3 != null) {
                dataChannel3.SX0(C168A.class, Boolean.FALSE);
            }
            DataChannel dataChannel4 = this.LLLFF;
            if (dataChannel4 != null) {
                dataChannel4.FQ2(RefreshPlaybookListEvent.class);
            }
        }
    }

    @Override // com.bytedance.android.live.design.view.sheet.LiveSheetFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Function1<Long, Unit> function1;
        long j;
        super.onViewCreated(view, bundle);
        if (this.LLLFZ) {
            View viewFindViewById = view.findViewById(R.id.n65);
            if (viewFindViewById != null) {
                C786410Ut5.LJLLLLLL(8, viewFindViewById);
            }
            View viewFindViewById2 = view.findViewById(R.id.eqx);
            if (viewFindViewById2 != null) {
                C14K9.LJIJJ(viewFindViewById2, new C0TVI() { // from class: X.14v3
                    @Override // X.C0TVI
                    public final C20246014Ju onApplyWindowInsets(View view2, C20246014Ju c20246014Ju) {
                        view2.setPadding(view2.getPaddingLeft(), c20246014Ju.LIZ(7).LIZIZ, view2.getPaddingRight(), 0);
                        return c20246014Ju;
                    }
                });
                viewFindViewById2.setBackgroundColor(QM(requireContext()));
            }
        }
        this.LLLII = (LinearLayout) view.findViewById(R.id.nh6);
        DataChannel dataChannel = this.LLLFF;
        if (dataChannel != null) {
            dataChannel.BQ2(this, NeedCloseMultiLiveDialogEvent.class, new C20341414ia(this));
        }
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.tsc);
        if (viewGroup != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(viewGroup, null);
            viewGroup.removeAllViewsInLayout();
            viewGroup.addView((View) this.LLLIIL.getValue());
        }
        C20382814pG c20382814pG = this.LLL;
        if (c20382814pG != null && (function1 = c20382814pG.LJIILLIIL) != null) {
            Playbook playbook = c20382814pG.LJII;
            if (playbook != null) {
                j = playbook.playbookId;
            } else {
                j = c20382814pG.LIZ;
            }
            function1.invoke(Long.valueOf(j));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookSheetFragment, com.bytedance.android.live.design.view.sheet.LiveSheetFragment
    public final View dS(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C1EOY.LIZ.LJIJ("playbook_detail_panel");
        return super.dS(layoutInflater, viewGroup, bundle);
    }
}
