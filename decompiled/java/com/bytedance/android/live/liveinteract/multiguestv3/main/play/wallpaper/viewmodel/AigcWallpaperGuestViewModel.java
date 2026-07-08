package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel;

import X.AnonymousClass0956;
import X.C001A;
import X.C0HGO;
import X.C0HGR;
import X.C0HGS;
import X.C0PEM;
import X.C11JF;
import X.C1533950q1J;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C776250Uch;
import X.C924790aAn;
import X.C930540aK4;
import X.C939000aXi;
import X.C943090aeJ;
import X.C943120aeM;
import X.C956680b0E;
import X.InterfaceC497601wk;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperPlayOrderDismissEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestAigcWallpaperConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import webcast.data.multi_guest_play.WallpaperContent;
import webcast.data.multi_guest_play.WallpaperContext;
import webcast.im.WallpaperMessage;
import webcast.im.WallpaperReviewMessage;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperGuestViewModel extends BaseAigcWallpaperViewModel implements OnMessageListener {
    public final DataChannel LLJJ;
    public AnonymousClass0956 LLJJI;
    public AnonymousClass0956 LLJJIII;
    public C11JF LLJJIJI;
    public C11JF LLJJIJIIJIL;
    public String LLJJIJIL;
    public String LLJJJ;
    public volatile MutableLiveData<Integer> LLJJJIL;
    public final MutableLiveData<Integer> LLJJJJ;

    public final void FQ2() {
        C11JF c11jf = this.LLJJIJIIJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJIIJIL = null;
        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "stopTotalTimeCountDown");
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        IMessageManager iMessageManager = (IMessageManager) this.LLJJ.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJI;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJIII;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        this.LLJJI = null;
        this.LLJJIII = null;
        C11JF c11jf = this.LLJJIJI;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJJIJI = null;
        FQ2();
        super.onCleared();
    }

    public AigcWallpaperGuestViewModel(DataChannel dataChannel) {
        super(dataChannel);
        this.LLJJ = dataChannel;
        this.LLJJIJIL = "";
        this.LLJJJ = "";
        MultiGuestAigcWallpaperConfigSetting multiGuestAigcWallpaperConfigSetting = MultiGuestAigcWallpaperConfigSetting.INSTANCE;
        this.LLJJJIL = new MutableLiveData<>(Integer.valueOf((int) (multiGuestAigcWallpaperConfigSetting.getEachRoundTotalTime() / ((long) 60))));
        this.LLJJJJ = new MutableLiveData<>(Integer.valueOf(multiGuestAigcWallpaperConfigSetting.getMaxRetryCount()));
        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", " AigcWallpaperGuestViewModel init");
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.WALLPAPER_MESSAGE.getIntType(), this);
        } else {
            C20441214yg.LJ("AigcWallpaperGuestViewModelTAG", "MessageManagerData == null");
        }
        IMessageManager iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.WALLPAPER_REVIEW_MESSAGE.getIntType(), this);
        } else {
            C20441214yg.LJ("AigcWallpaperGuestViewModelTAG", "MessageManagerData == null");
        }
    }

    public final void EQ2(WallpaperMessage wallpaperMessage) {
        Long lValueOf;
        this.LLJJ.zW(AigcWallpaperStatus.class, Boolean.TRUE);
        DataChannel dataChannel = this.LLJJ;
        WallpaperContent wallpaperContent = wallpaperMessage.wallpaperContent;
        if (wallpaperContent != null) {
            lValueOf = Long.valueOf(wallpaperContent.wallpaperId);
        } else {
            lValueOf = null;
        }
        dataChannel.SX0(C956680b0E.class, lValueOf);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String methodName;
        String methodName2;
        List<WallpaperContext> list;
        List<WallpaperContext> list2;
        String str;
        List<WallpaperContext> list3;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage: ");
        List<WallpaperContext> list4 = null;
        String methodName3 = null;
        if (iMessage != null) {
            methodName = iMessage.getMethodName();
        } else {
            methodName = null;
        }
        sbLIZ.append(methodName);
        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ));
        if (((Number) C924790aAn.LIZLLL().LIZIZ).intValue() < 1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("onMessage: ");
            if (iMessage != null) {
                methodName3 = iMessage.getMethodName();
            }
            sbLIZ2.append(methodName3);
            sbLIZ2.append(", but LinkPlayerState.inst().data < LinkPlayerState.STATE_WAITING");
            C20441214yg.LJ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("onMessage: ");
        if (iMessage != null) {
            methodName2 = iMessage.getMethodName();
        } else {
            methodName2 = null;
        }
        sbLIZ3.append(methodName2);
        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ3));
        if (iMessage instanceof WallpaperMessage) {
            if (!C930540aK4.LJJIII() && ((WallpaperMessage) iMessage).messageType != 5) {
                C20441214yg.LJIIL("AigcWallpaperGuestViewModelTAG", "receivew message WallpaperMessage, but isLinked = false && type  ");
                return;
            }
            WallpaperMessage wallpaperMessage = (WallpaperMessage) iMessage;
            int i = wallpaperMessage.messageType;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i == 5) {
                            C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "receivew message WALLPAPER_USER_LIST_CHANGE");
                            EQ2(wallpaperMessage);
                            MutableLiveData<Pair<List<WallpaperContext>, List<WallpaperContext>>> mutableLiveData = this.LLILZ;
                            WallpaperContent wallpaperContent = wallpaperMessage.wallpaperContent;
                            if (wallpaperContent != null) {
                                list3 = wallpaperContent.finishedUserList;
                                list4 = wallpaperContent.playUserList;
                            } else {
                                list3 = null;
                            }
                            mutableLiveData.postValue(new Pair<>(list3, list4));
                            WallpaperContent wallpaperContent2 = wallpaperMessage.wallpaperContent;
                            if (wallpaperContent2 != null) {
                                C939000aXi c939000aXi = C939000aXi.LIZ;
                                DataChannel dataChannel = this.LLJJ;
                                List<WallpaperContext> list5 = wallpaperContent2.finishedUserList;
                                List<WallpaperContext> list6 = wallpaperContent2.playUserList;
                                c939000aXi.getClass();
                                C939000aXi.LJIIJ(dataChannel, list5, list6, true);
                                this.LLIZLLLIL.LIZLLL(wallpaperContent2.wallpaperUrl);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    if (!C930540aK4.LJJIII()) {
                        return;
                    }
                    C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "receivew message WALLPAPER_END_GAME");
                    this.LLJJ.zW(AigcWallpaperStatus.class, Boolean.FALSE);
                    this.LLJJ.SX0(C956680b0E.class, -1L);
                    InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C0HGS(this, null), 2);
                    if (C1533950q1J.LJ(this.LLIZ)) {
                        C939000aXi c939000aXi2 = C939000aXi.LIZ;
                        DataChannel dataChannel2 = this.LLJJ;
                        String str2 = this.LLIZ;
                        c939000aXi2.getClass();
                        C939000aXi.LJII(dataChannel2, str2, null);
                    }
                    this.LLIZLLLIL.LIZ();
                    C939000aXi c939000aXi3 = C939000aXi.LIZ;
                    DataChannel dataChannel3 = this.LLJJ;
                    c939000aXi3.getClass();
                    dataChannel3.LC0(AigcWallpaperPlayOrderDismissEvent.class, Boolean.TRUE);
                    FQ2();
                    this.LLIZ = "";
                    return;
                }
                C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "receivew message WALLPAPER_NEXT_USER");
                EQ2(wallpaperMessage);
                MutableLiveData<Pair<List<WallpaperContext>, List<WallpaperContext>>> mutableLiveData2 = this.LLILZ;
                WallpaperContent wallpaperContent3 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent3 != null) {
                    list = wallpaperContent3.finishedUserList;
                    list2 = wallpaperContent3.playUserList;
                } else {
                    list = null;
                    list2 = null;
                }
                mutableLiveData2.postValue(new Pair<>(list, list2));
                if (!BaseAigcWallpaperViewModel.AQ2(wallpaperMessage)) {
                    C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "receivew message WALLPAPER_NEXT_USER, but not match, so return");
                    return;
                }
                WallpaperContent wallpaperContent4 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent4 != null && (str = wallpaperContent4.wallpaperUrl) != null) {
                    this.LLIZLLLIL.LIZLLL(str);
                }
                if (C1533950q1J.LJ(this.LLIZ)) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("currentCountDownUid.isNotNullOrEmpty, remove: ");
                    sbLIZ4.append(this.LLIZ);
                    C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ4));
                    C939000aXi c939000aXi4 = C939000aXi.LIZ;
                    DataChannel dataChannel4 = this.LLJJ;
                    String str3 = this.LLIZ;
                    c939000aXi4.getClass();
                    C939000aXi.LJII(dataChannel4, str3, null);
                } else {
                    C939000aXi c939000aXi5 = C939000aXi.LIZ;
                    c939000aXi5.getClass();
                    if (C1533950q1J.LJ(C939000aXi.LIZIZ)) {
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("audience change to guest, remove audience crated countdown, remove: ");
                        sbLIZ5.append(C939000aXi.LIZIZ);
                        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ5));
                        DataChannel dataChannel5 = this.LLJJ;
                        String str4 = C939000aXi.LIZIZ;
                        c939000aXi5.getClass();
                        C939000aXi.LJII(dataChannel5, null, str4);
                        C939000aXi.LIZIZ = null;
                    }
                }
                WallpaperContent wallpaperContent5 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent5 != null && wallpaperContent5.playUserId == C930540aK4.LJIIL()) {
                    InterfaceC497601wk viewModelScope2 = ViewModelKt.getViewModelScope(this);
                    C1DFH c1dfh2 = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope2, C2107308Nj.LIZ, null, new C0HGR(this, null), 2);
                } else if (this.LLJJIJIIJIL != null) {
                    FQ2();
                    InterfaceC497601wk viewModelScope3 = ViewModelKt.getViewModelScope(this);
                    C1DFH c1dfh3 = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope3, C2107308Nj.LIZ, null, new C0HGO(this, null), 2);
                }
                WallpaperContent wallpaperContent6 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent6 == null) {
                    return;
                }
                C939000aXi c939000aXi6 = C939000aXi.LIZ;
                long millis = TimeUnit.NANOSECONDS.toMillis(wallpaperContent6.sendTimestamp);
                DataChannel dataChannel6 = this.LLJJ;
                String strValueOf = String.valueOf(wallpaperContent6.playUserId);
                c939000aXi6.getClass();
                C939000aXi.LJIIIZ(millis, dataChannel6, strValueOf, null);
                StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                sbLIZ6.append("startAigcPlayCountDown, playerUid: ");
                sbLIZ6.append(wallpaperContent6.playUserId);
                C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ6));
                this.LLIZ = String.valueOf(wallpaperContent6.playUserId);
                return;
            }
            if (!C930540aK4.LJJIII()) {
                return;
            }
            C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "receivew message WALLPAPER_CREATE_GAME");
            EQ2(wallpaperMessage);
            this.LLIZLLLIL.LIZIZ();
            this.LLIZ = "";
            return;
        }
        if (!(iMessage instanceof WallpaperReviewMessage) || !C930540aK4.LJJIII()) {
            return;
        }
        C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "receivew message WallpaperReviewMessage");
        WallpaperReviewMessage wallpaperReviewMessage = (WallpaperReviewMessage) iMessage;
        if (!zQ2(wallpaperReviewMessage)) {
            C20441214yg.LJ("AigcWallpaperGuestViewModelTAG", "not matched, so return");
            return;
        }
        C943120aeM.LJIILJJIL();
        if (wallpaperReviewMessage.reviewResult == 20) {
            C20441214yg.LIZIZ("AigcWallpaperGuestViewModelTAG", "review message passed");
            yQ2(wallpaperReviewMessage);
            return;
        }
        StringBuilder sbLIZ7 = C2188811AlT.LIZ();
        sbLIZ7.append("review message not passed, ");
        sbLIZ7.append(wallpaperReviewMessage.reviewResult);
        C20441214yg.LJ("AigcWallpaperGuestViewModelTAG", C2188811AlT.LIZIZ(sbLIZ7));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C943090aeJ(this, iMessage, null), 2);
        C943120aeM.LJII(Integer.valueOf((int) wallpaperReviewMessage.reviewResult), "tns_image_review_fail", null);
    }
}
