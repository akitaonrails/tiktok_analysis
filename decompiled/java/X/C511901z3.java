package X;

import android.text.Editable;
import android.view.View;
import android.widget.CompoundButton;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.editor.more.PlaybookEditorMoreDialog;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateVisibilityParams;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.comp.api.game.GameAutoCoverChannel;
import com.bytedance.android.livesdk.game.api.InGameRankApi;
import com.bytedance.android.livesdk.game.broadcast.bgbroadcast.api.GameAutoCoverApi;
import com.bytedance.android.livesdk.game.broadcast.dialog.GameInGameRankDialog;
import com.bytedance.android.livesdk.game.preview.widget.GameAutoCoverWidget;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01z3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C511901z3 implements CompoundButton.OnCheckedChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (this.$t) {
            case 0:
                onCheckedChanged$0(this, compoundButton, z);
                break;
            case 1:
                onCheckedChanged$1(this, compoundButton, z);
                break;
            case 2:
                onCheckedChanged$2(this, compoundButton, z);
                break;
            case 3:
                onCheckedChanged$3(this, compoundButton, z);
                break;
            case 4:
                onCheckedChanged$4(this, compoundButton, z);
                break;
            case 5:
                onCheckedChanged$5(this, compoundButton, z);
                break;
            case 6:
                onCheckedChanged$6(this, compoundButton, z);
                break;
            case 7:
                onCheckedChanged$7(this, compoundButton, z);
                break;
            case 8:
                onCheckedChanged$8(this, compoundButton, z);
                break;
        }
    }

    public C511901z3(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
    public static final void onCheckedChanged$0(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        ((C259800zU) c511901z3.l0).element = Boolean.valueOf(z);
    }

    public static final void onCheckedChanged$1(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        final int i;
        final PlaybookAnchorViewModel playbookAnchorViewModel;
        if (z) {
            i = 2;
        } else {
            i = 1;
        }
        PlaybookEditorMoreDialog playbookEditorMoreDialog = (PlaybookEditorMoreDialog) c511901z3.l0;
        playbookEditorMoreDialog.LLL.playbookVisibility = i;
        playbookEditorMoreDialog.LLLFZ.invoke(Boolean.valueOf(z), ((PlaybookEditorMoreDialog) c511901z3.l0).LLL);
        PlaybookEditorMoreDialog playbookEditorMoreDialog2 = (PlaybookEditorMoreDialog) c511901z3.l0;
        BasePlaybookViewModel basePlaybookViewModel = playbookEditorMoreDialog2.LLLF;
        if ((basePlaybookViewModel instanceof PlaybookAnchorViewModel) && (playbookAnchorViewModel = (PlaybookAnchorViewModel) basePlaybookViewModel) != null) {
            final long j = playbookEditorMoreDialog2.LLL.playbookId;
            final C20384514pX c20384514pX = playbookAnchorViewModel.LLJJJJJIL;
            c20384514pX.getClass();
            String strLIZ = C01EI.LIZ(0, "PlaybookAnchorModel");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateVisibility, playbookId=");
            sbLIZ.append(j);
            sbLIZ.append(", visibility=");
            sbLIZ.append(i);
            C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
            C480460Ism.LIZ().getClass();
            IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
            PlaybookUpdateVisibilityParams playbookUpdateVisibilityParams = new PlaybookUpdateVisibilityParams();
            playbookUpdateVisibilityParams.playbookId = j;
            playbookUpdateVisibilityParams.visibility = i;
            C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(iPlaybookApi.updateVisibility(playbookUpdateVisibilityParams), "PlaybookAnchorModel", "updateVisibility").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.00lC
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorModel@281.updateVisibility$2");
                    c20384514pX.getClass();
                    String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorModel");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateVisibility success, playbookId=");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", visibility=");
                    sbLIZ2.append(i);
                    C1AZW.LJIIJ(12, strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.updateVisibility$2");
                }
            }).LJIIL(new C09JN() { // from class: X.00lD
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorModel@281.updateVisibility$3");
                    c20384514pX.getClass();
                    String strLIZ2 = C01EI.LIZ(0, "PlaybookAnchorModel");
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateVisibility failed, playbookId=");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", visibility=");
                    sbLIZ2.append(i);
                    sbLIZ2.append(", it=");
                    sbLIZ2.append(((Throwable) obj).getMessage());
                    C1AZW.LJFF(strLIZ2, C2188811AlT.LIZIZ(sbLIZ2), null, null);
                    C1C7U.LIZIZ("PlaybookAnchorModel@281.updateVisibility$3");
                }
            })).LJFF(new C0UO0()), playbookAnchorViewModel.vQ2(), new C09JN() { // from class: X.00lS
                public final /* synthetic */ InterfaceC170900l9<Pair<Long, Integer>> LLILLJJLI = null;

                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorViewModel@aab5.updateVisibility$1");
                    playbookAnchorViewModel.getClass();
                    C20441214yg.LJIIIZ("PlaybookAnchorViewModel", "updateVisibility successfully");
                    InterfaceC170900l9<Pair<Long, Integer>> interfaceC170900l9 = this.LLILLJJLI;
                    if (interfaceC170900l9 != null) {
                        interfaceC170900l9.LIZ(new Pair<>(Long.valueOf(j), Integer.valueOf(i)));
                    }
                    C1C7U.LIZIZ("PlaybookAnchorViewModel@aab5.updateVisibility$1");
                }
            }, new C09JN() { // from class: X.00lT
                public final /* synthetic */ InterfaceC170900l9<Pair<Long, Integer>> LLILLJJLI = null;

                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("PlaybookAnchorViewModel@aab5.updateVisibility$2");
                    Throwable th = (Throwable) obj;
                    playbookAnchorViewModel.getClass();
                    C20441214yg.LJ("PlaybookAnchorViewModel", "updateVisibility failure");
                    InterfaceC170900l9<Pair<Long, Integer>> interfaceC170900l9 = this.LLILLJJLI;
                    if (interfaceC170900l9 != null) {
                        interfaceC170900l9.onFailed(th);
                    }
                    C1C7U.LIZIZ("PlaybookAnchorViewModel@aab5.updateVisibility$2");
                }
            }, 24);
        }
    }

    public static final void onCheckedChanged$2(C511901z3 c511901z3, CompoundButton compoundButton, final boolean z) {
        String str;
        GameInGameRankDialog gameInGameRankDialog = (GameInGameRankDialog) c511901z3.l0;
        C11JF c11jf = gameInGameRankDialog.LLJ;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        int i = 0;
        gameInGameRankDialog.LLJ = (C11JF) C11NZ.LJLJL(1L, TimeUnit.SECONDS, C11S5.LIZ()).LJJJ(new InterfaceC1487280oo2() { // from class: X.00xn
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                long j;
                C480460Ism.LIZ().getClass();
                InGameRankApi inGameRankApi = (InGameRankApi) C480460Ism.LIZLLL(InGameRankApi.class);
                if (z) {
                    j = 1;
                } else {
                    j = 0;
                }
                return inGameRankApi.updateInGameRankSetting(j);
            }
        }, false).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00K8
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameInGameRankDialog@63ff.switchInGameRankSetting$3");
                C1C7U.LIZIZ("GameInGameRankDialog@63ff.switchInGameRankSetting$3");
            }
        }, new C09JN() { // from class: X.00Me
            @Override // X.C09JN
            public final /* bridge */ /* synthetic */ void accept(Object obj) {
                C1C7U.LIZ("GameInGameRankDialog@63ff.switchInGameRankSetting$4");
                C1C7U.LIZIZ("GameInGameRankDialog@63ff.switchInGameRankSetting$4");
            }
        });
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_ingame_rank_setting_click");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) gameInGameRankDialog.LL.getValue()).longValue()), "anchor_id");
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII("screen_share", "live_type");
        if (z) {
            str = "open";
        } else {
            str = "close";
        }
        c474500IjALIZ.LJJII(str, "click_type");
        if (gameInGameRankDialog.getRoomId() != 0) {
            c474500IjALIZ.LJJII(Long.valueOf(gameInGameRankDialog.getRoomId()), "room_id");
        }
        if (gameInGameRankDialog.getRoomId() != 0) {
            i = 1;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_streaming");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Boolean] */
    public static final void onCheckedChanged$3(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        ((C259800zU) c511901z3.l0).element = Boolean.valueOf(z);
    }

    public static final void onCheckedChanged$4(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        Editable text;
        String string;
        CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = (CountDownForAllV2SettingsDialog) c511901z3.l0;
        C1749190vcT c1749190vcT = countDownForAllV2SettingsDialog.LLLIILIL;
        if (c1749190vcT != null) {
            C500260Jjc.LJLJLJ(c1749190vcT, C500260Jjc.LJJJI(Boolean.valueOf(z)));
        }
        View view = countDownForAllV2SettingsDialog.LLLILZLLLI;
        if (view != null) {
            C500260Jjc.LJLJLJ(view, C500260Jjc.LJJJI(Boolean.valueOf(z)));
        }
        C16F5 c16f5 = countDownForAllV2SettingsDialog.LLLILZJ;
        if (c16f5 != null) {
            C500260Jjc.LJLJLJ(c16f5, !z);
        }
        long j = 0;
        if (!z) {
            countDownForAllV2SettingsDialog.LLLILZ = 0L;
            C16FS c16fs = countDownForAllV2SettingsDialog.LLLLILI;
            if (c16fs != null) {
                c16fs.setEnabled(true);
            }
            countDownForAllV2SettingsDialog.LLLLII = countDownForAllV2SettingsDialog.LLLL;
            countDownForAllV2SettingsDialog.LLLL = "";
            return;
        }
        countDownForAllV2SettingsDialog.LLLL = countDownForAllV2SettingsDialog.LLLLII;
        C1748440vbG c1748440vbG = countDownForAllV2SettingsDialog.LLLIL;
        if (c1748440vbG != null && (text = c1748440vbG.getText()) != null && (string = text.toString()) != null) {
            try {
                j = CastLongProtector.parseLong(string);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        countDownForAllV2SettingsDialog.LLLILZ = j;
    }

    public static final void onCheckedChanged$5(C511901z3 c511901z3, CompoundButton compoundButton, final boolean z) {
        String str;
        GameAutoCoverWidget gameAutoCoverWidget = (GameAutoCoverWidget) c511901z3.l0;
        C11JF c11jf = gameAutoCoverWidget.LLILZIL;
        if (c11jf != null && !c11jf.isDisposed()) {
            c11jf.dispose();
        }
        gameAutoCoverWidget.LLILZIL = (C11JF) C11NZ.LJLJL(1L, TimeUnit.SECONDS, C11S5.LIZ()).LJJJ(new InterfaceC1487280oo2() { // from class: X.00xp
            @Override // X.InterfaceC1487280oo2
            public final Object apply(Object obj) {
                int i;
                C480460Ism.LIZ().getClass();
                GameAutoCoverApi gameAutoCoverApi = (GameAutoCoverApi) C480460Ism.LIZLLL(GameAutoCoverApi.class);
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                return gameAutoCoverApi.updateScreenShotStatus(i);
            }
        }, false).LJIILIIL(new C0UO0()).LJJLL(new C09JN() { // from class: X.00Qv
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameAutoCoverWidget@7acd.switchGameAutoCover$6");
                if (((BaseResponse) obj).statusCode != 0) {
                    C766270U4b.LIZLLL(2131842705);
                }
                C1C7U.LIZIZ("GameAutoCoverWidget@7acd.switchGameAutoCover$6");
            }
        }, new C09JN() { // from class: X.00KF
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("GameAutoCoverWidget@7acd.switchGameAutoCover$7");
                C766270U4b.LIZLLL(2131842705);
                C1C7U.LIZIZ("GameAutoCoverWidget@7acd.switchGameAutoCover$7");
            }
        });
        DataChannel dataChannel = ((GameAutoCoverWidget) c511901z3.l0).dataChannel;
        if (dataChannel != null) {
            dataChannel.zW(GameAutoCoverChannel.class, Boolean.valueOf(z));
        }
        if (!z) {
            C766270U4b.LIZLLL(2131841285);
        }
        ((GameAutoCoverWidget) c511901z3.l0).x1(z);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_cover_modify_screenshot_click");
        c474500IjALIZ.LJJII(((GameAutoCoverWidget) c511901z3.l0).LLILZ.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(((GameAutoCoverWidget) c511901z3.l0).LL, "live_type");
        if (z) {
            str = "on";
        } else {
            str = "off";
        }
        c474500IjALIZ.LJJII(str, "screenshot_status");
        c474500IjALIZ.LIZ();
    }

    public static final void onCheckedChanged$6(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        ((Function1) c511901z3.l0).invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$7(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        ((Function1) c511901z3.l0).invoke(Boolean.valueOf(z));
    }

    public static final void onCheckedChanged$8(C511901z3 c511901z3, CompoundButton compoundButton, boolean z) {
        ((Function1) c511901z3.l0).invoke(Boolean.valueOf(z));
    }
}
