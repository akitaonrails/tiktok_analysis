package X;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.design.app.LiveDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.common.BaseLiveShowViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.show.moderator.LiveShowModeratorWidget;
import com.bytedance.android.live.liveinteract.multilive.model.CreateShowParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestParams;
import com.bytedance.android.live.liveinteract.multilive.model.ShowAgainGuestResponse;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentParams;
import com.bytedance.android.live.liveinteract.multilive.model.UpdateShowContentResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import java.util.List;
import webcast.data.multi_guest_play.ShowConfig;

/* JADX INFO: renamed from: X.01GG, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01GG implements C01H0 {
    public final /* synthetic */ LiveShowModeratorWidget LIZ;

    @Override // X.C01H0
    public final void LIZIZ() {
        MutableLiveData<ShowConfig> mutableLiveData;
        ShowConfig value;
        MutableLiveData<ShowConfig> mutableLiveData2;
        ShowConfig value2;
        DialogC430701lx dialogC430701lx;
        MutableLiveData<ShowConfig> mutableLiveData3;
        ShowConfig value3;
        LiveShowModeratorWidget liveShowModeratorWidget = this.LIZ;
        DialogC430701lx dialogC430701lx2 = liveShowModeratorWidget.LLILLL;
        boolean z = false;
        if (dialogC430701lx2 == null || !dialogC430701lx2.isShowing()) {
            if (liveShowModeratorWidget.LLILLL == null) {
                LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget.LL;
                if (liveShowModeratorViewModel == null || (mutableLiveData3 = liveShowModeratorViewModel.LLILZ) == null || (value3 = mutableLiveData3.getValue()) == null) {
                    dialogC430701lx = null;
                } else {
                    Context context = liveShowModeratorWidget.context;
                    C303601Fq c303601Fq = liveShowModeratorWidget.LLJI;
                    DataChannel dataChannel = liveShowModeratorWidget.dataChannel;
                    LiveShowModeratorViewModel liveShowModeratorViewModel2 = liveShowModeratorWidget.LL;
                    dialogC430701lx = new DialogC430701lx(context, c303601Fq, value3, dataChannel, liveShowModeratorViewModel2 != null ? liveShowModeratorViewModel2.LLJILLL : 0, null);
                }
                liveShowModeratorWidget.LLILLL = dialogC430701lx;
            }
            DialogC430701lx dialogC430701lx3 = liveShowModeratorWidget.LLILLL;
            if (dialogC430701lx3 != null) {
                dialogC430701lx3.show();
                C785410UrT.LIZIZ(dialogC430701lx3);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(dialogC430701lx3);
                C816490W1f.LIZ(dialogC430701lx3);
            }
            DialogC430701lx dialogC430701lx4 = liveShowModeratorWidget.LLILLL;
            if (dialogC430701lx4 != null) {
                dialogC430701lx4.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(liveShowModeratorWidget, 10));
            }
            LiveShowModeratorViewModel liveShowModeratorViewModel3 = liveShowModeratorWidget.LL;
            long j = (liveShowModeratorViewModel3 == null || (mutableLiveData2 = liveShowModeratorViewModel3.LLILZ) == null || (value2 = mutableLiveData2.getValue()) == null) ? 300L : value2.durationPerGuest;
            LiveShowModeratorViewModel liveShowModeratorViewModel4 = liveShowModeratorWidget.LL;
            if (liveShowModeratorViewModel4 != null && (mutableLiveData = liveShowModeratorViewModel4.LLILZ) != null && (value = mutableLiveData.getValue()) != null) {
                z = value.allowOpenMicFreely;
            }
            C306901Gx.LJIILJJIL(j, z);
        }
    }

    @Override // X.C01H0
    public final void LIZJ() {
        C782110Um9 c782110Um9 = new C782110Um9(this.LIZ.context);
        c782110Um9.LJIIZILJ(2131843552);
        c782110Um9.LJII(2131843551);
        c782110Um9.LJIILIIL(2131843546, new C515201za(this.LIZ, 2));
        c782110Um9.LJIIJ(2131843580, new InterfaceC743640TFa() { // from class: X.01GM
            @Override // X.InterfaceC743640TFa
            public final void LIZ(LiveDialog liveDialog) {
                liveDialog.dismiss();
            }
        });
        C786410Ut5.E4(c782110Um9.LIZ());
    }

    @Override // X.C01H0
    public final void LJII() {
        LiveShowModeratorWidget liveShowModeratorWidget = this.LIZ;
        DialogC951720asE dialogC951720asE = liveShowModeratorWidget.LLILLJJLI;
        if (dialogC951720asE == null || !dialogC951720asE.isShowing()) {
            if (liveShowModeratorWidget.LLILLJJLI == null) {
                liveShowModeratorWidget.LLILLJJLI = new DialogC951720asE(liveShowModeratorWidget.context, liveShowModeratorWidget.LLJ);
            }
            DialogC951720asE dialogC951720asE2 = liveShowModeratorWidget.LLILLJJLI;
            if (dialogC951720asE2 != null) {
                dialogC951720asE2.show();
                C785410UrT.LIZIZ(dialogC951720asE2);
                PopupMonitorServiceImpl.LIZ.getClass();
                PopupMonitorServiceImpl.LJJJ(dialogC951720asE2);
                C816490W1f.LIZ(dialogC951720asE2);
            }
            DialogC951720asE dialogC951720asE3 = liveShowModeratorWidget.LLILLJJLI;
            if (dialogC951720asE3 != null) {
                dialogC951720asE3.setOnDismissListener(new DialogInterfaceOnDismissListenerC512701zB(liveShowModeratorWidget, 9));
            }
        }
    }

    public C01GG(LiveShowModeratorWidget liveShowModeratorWidget) {
        this.LIZ = liveShowModeratorWidget;
    }

    @Override // X.C01H0
    public final void LIZ(long j) {
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.KQ2(j, new C020U(this, j, 1));
        }
    }

    @Override // X.C01H0
    public final void LIZLLL(long j) {
        AbstractC19484711Kz<C470590Icr<ShowAgainGuestResponse.ResponseData>> abstractC19484711KzShowAgainGuest;
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
        if (liveShowModeratorViewModel != null) {
            C020U c020u = new C020U(this, j, 2);
            ShowAgainGuestParams showAgainGuestParams = new ShowAgainGuestParams();
            showAgainGuestParams.roomId = liveShowModeratorViewModel.LLJ;
            showAgainGuestParams.channelId = liveShowModeratorViewModel.getChannelId();
            showAgainGuestParams.showId = BaseLiveShowViewModel.FQ2();
            showAgainGuestParams.targetUserId = j;
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null && (abstractC19484711KzShowAgainGuest = interfaceC302601FgLIZ.showAgainGuest(showAgainGuestParams)) != null) {
                liveShowModeratorViewModel.EQ2().LIZ(abstractC19484711KzShowAgainGuest.LJFF(new C0UO0()).LJJIIZ(new C516201zk(c020u, 245), new C09JN() { // from class: X.00RQ
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.showAgainGuest$2");
                        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "show again guest failed");
                        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.showAgainGuest$2");
                    }
                }));
            }
        }
    }

    @Override // X.C01H0
    public final void LJ(List<String> list) {
        String strLIZ = C01EI.LIZ(174, "LiveShowAnchorWidget");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onSortedLinkMicIdChange, sortedLinkMicId=");
        sbLIZ.append(list);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.LLJILJILJ = list;
        }
    }

    @Override // X.C01H0
    public final void LJI(C5182020e c5182020e) {
        long jLongValue;
        Long lLJIILLIIL = C930540aK4.LJIILLIIL();
        if (lLJIILLIIL != null) {
            jLongValue = lLJIILLIIL.longValue();
        } else {
            jLongValue = 0;
        }
        C923330a8R c923330a8R = C923330a8R.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShowAnchorWidget_onSkipTransitionClick roomOwnerId:");
        sbLIZ.append(jLongValue);
        C923330a8R.LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.KQ2(jLongValue, new C5182020e(c5182020e, 65));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIIZ(webcast.data.multi_guest_play.ShowContent r6, long r7) {
        /*
            r5 = 0
            if (r6 == 0) goto L43
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r6.showingAndReadyList
            if (r0 == 0) goto L22
            java.util.Iterator r4 = r0.iterator()
        Lb:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r3 = r4.next()
            r0 = r3
            webcast.data.multi_guest_play.ShowListUser r0 = (webcast.data.multi_guest_play.ShowListUser) r0
            long r1 = r0.userId
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto Lb
        L1e:
            webcast.data.multi_guest_play.ShowListUser r3 = (webcast.data.multi_guest_play.ShowListUser) r3
            if (r3 != 0) goto L41
        L22:
            java.util.List<webcast.data.multi_guest_play.ShowListUser> r0 = r6.finishedList
            if (r0 == 0) goto L43
            java.util.Iterator r4 = r0.iterator()
        L2a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L44
            java.lang.Object r3 = r4.next()
            r0 = r3
            webcast.data.multi_guest_play.ShowListUser r0 = (webcast.data.multi_guest_play.ShowListUser) r0
            long r1 = r0.userId
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 != 0) goto L2a
        L3d:
            webcast.data.multi_guest_play.ShowListUser r3 = (webcast.data.multi_guest_play.ShowListUser) r3
            if (r3 == 0) goto L43
        L41:
            java.lang.String r5 = r3.nickname
        L43:
            return r5
        L44:
            r3 = r5
            goto L3d
        L46:
            r3 = r5
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01GG.LJIIIZ(webcast.data.multi_guest_play.ShowContent, long):java.lang.String");
    }

    @Override // X.C01H0
    public final void LJFF(List<CreateShowParams.ListUser> list, C334801Rq c334801Rq) {
        long j;
        boolean z;
        MutableLiveData<ShowConfig> mutableLiveData;
        final LiveShowModeratorWidget liveShowModeratorWidget = this.LIZ;
        LiveShowModeratorViewModel liveShowModeratorViewModel = liveShowModeratorWidget.LL;
        ShowConfig value = null;
        if (liveShowModeratorViewModel != null) {
            liveShowModeratorViewModel.IQ2(new C01G2() { // from class: X.01GI
                @Override // X.C01G2
                public final void LIZIZ() {
                    C923330a8R c923330a8R = C923330a8R.LIZ;
                    C923330a8R.LJIIL(AnonymousClass0206.get$arr$(55));
                }

                @Override // X.C01G2
                public final void LIZ(Throwable th) {
                    C501540Jlg.LIZJ(liveShowModeratorWidget.context, th);
                }
            }, list, null);
        }
        LiveShowModeratorViewModel liveShowModeratorViewModel2 = this.LIZ.LL;
        if (liveShowModeratorViewModel2 != null && (mutableLiveData = liveShowModeratorViewModel2.LLILZ) != null) {
            value = mutableLiveData.getValue();
        }
        if (value != null) {
            j = value.durationPerGuest;
            z = value.allowOpenMicFreely;
        } else {
            j = 300;
            z = false;
        }
        C306901Gx.LJIJJLI(j, z);
    }

    @Override // X.C01H0
    public final void LJIIIIZZ(long j, long j2, long j3) {
        AbstractC19484711Kz<C470590Icr<UpdateShowContentResponse.ResponseData>> abstractC19484711KzUpdateShowContent;
        LiveShowModeratorViewModel liveShowModeratorViewModel = this.LIZ.LL;
        if (liveShowModeratorViewModel != null) {
            AnonymousClass0206 anonymousClass0206 = AnonymousClass0206.get$arr$(51);
            UpdateShowContentParams updateShowContentParams = new UpdateShowContentParams();
            updateShowContentParams.roomId = liveShowModeratorViewModel.LLJ;
            updateShowContentParams.channelId = liveShowModeratorViewModel.getChannelId();
            updateShowContentParams.showId = BaseLiveShowViewModel.FQ2();
            updateShowContentParams.targetUserId = j;
            updateShowContentParams.preUserId = j2;
            updateShowContentParams.nextUserId = j3;
            updateShowContentParams.updateType = 2;
            ShowConfig value = liveShowModeratorViewModel.LLILZ.getValue();
            if (value != null) {
                updateShowContentParams.transitionDurationOfConfig = value.transitionDurationOfConfig;
            }
            InterfaceC302601Fg interfaceC302601FgLIZ = C01FQ.LIZ();
            if (interfaceC302601FgLIZ != null && (abstractC19484711KzUpdateShowContent = interfaceC302601FgLIZ.updateShowContent(updateShowContentParams)) != null) {
                liveShowModeratorViewModel.EQ2().LIZ(abstractC19484711KzUpdateShowContent.LJFF(new C0UO0()).LJJIIZ(new C515801zg(liveShowModeratorViewModel, anonymousClass0206, 53), new C09JN() { // from class: X.00SC
                    @Override // X.C09JN
                    public final void accept(Object obj) {
                        C1C7U.LIZ("LiveShowModeratorViewModel@48fd.updateShowList$2");
                        C20441214yg.LIZIZ("LiveShowModeratorViewModel", "updateShowList failed");
                        C1C7U.LIZIZ("LiveShowModeratorViewModel@48fd.updateShowList$2");
                    }
                }));
            }
        }
    }
}
