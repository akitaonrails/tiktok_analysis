package com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel;

import X.AbstractC19994813Le;
import X.AnonymousClass0956;
import X.C001A;
import X.C0PEM;
import X.C1533950q1J;
import X.C1DFH;
import X.C20441214yg;
import X.C2107308Nj;
import X.C2188811AlT;
import X.C23250099c;
import X.C776250Uch;
import X.C926820aE4;
import X.C930540aK4;
import X.C939000aXi;
import X.C942980ae8;
import X.C943020aeC;
import X.C943030aeD;
import X.C943040aeE;
import X.C943070aeH;
import X.C943120aeM;
import X.C956680b0E;
import X.InterfaceC497601wk;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.liveinteract.multiguestv3.AigcWallpaperStatus;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperInCountDownChannel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.channel.AigcWallpaperPlayOrderDismissEvent;
import com.bytedance.android.live.liveinteract.multilive.model.WallpaperEndResponse;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.multi_guest_play.WallpaperContent;
import webcast.data.multi_guest_play.WallpaperContext;
import webcast.im.WallpaperMessage;
import webcast.im.WallpaperReviewMessage;

/* JADX INFO: loaded from: classes16.dex */
public final class AigcWallpaperAnchorViewModel extends BaseAigcWallpaperViewModel implements OnMessageListener {
    public static final /* synthetic */ int LLJJL = 0;
    public final DataChannel LLJJ;
    public final MutableLiveData<Integer> LLJJI;
    public final MutableLiveData LLJJIII;
    public volatile boolean LLJJIJI;
    public AnonymousClass0956 LLJJIJIIJIL;
    public AnonymousClass0956 LLJJIJIL;
    public AnonymousClass0956 LLJJJ;
    public String LLJJJIL;
    public String LLJJJJ;
    public int LLJJJJJIL;
    public boolean LLJJJJLIIL;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.BaseAigcWallpaperViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        List list;
        List list2;
        List<WallpaperContext> second;
        List<WallpaperContext> first;
        C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", "onCleared");
        IMessageManager iMessageManager = (IMessageManager) this.LLJJ.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        AnonymousClass0956 anonymousClass0956 = this.LLJJIJIIJIL;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09562 = this.LLJJIJIL;
        if (anonymousClass09562 != null) {
            anonymousClass09562.LIZIZ(null);
        }
        AnonymousClass0956 anonymousClass09563 = this.LLJJJ;
        if (anonymousClass09563 != null) {
            anonymousClass09563.LIZIZ(null);
        }
        this.LLJJIJIIJIL = null;
        this.LLJJIJIL = null;
        this.LLJJJ = null;
        Pair<List<WallpaperContext>, List<WallpaperContext>> value = this.LLILZ.getValue();
        if (value != null && (first = value.getFirst()) != null) {
            first.clear();
        }
        Pair<List<WallpaperContext>, List<WallpaperContext>> value2 = this.LLILZ.getValue();
        if (value2 != null && (second = value2.getSecond()) != null) {
            second.clear();
        }
        Pair pair = (Pair) this.LLILZIL.getValue();
        if (pair != null && (list2 = (List) pair.getFirst()) != null) {
            list2.clear();
        }
        Pair pair2 = (Pair) this.LLILZIL.getValue();
        if (pair2 != null && (list = (List) pair2.getSecond()) != null) {
            list.clear();
        }
        super.onCleared();
    }

    public final void EQ2() {
        this.LLJJIJIIJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C943030aeD(this, null), 2);
    }

    public final void GQ2() {
        this.LLJJJ = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C942980ae8(this, null), 2);
    }

    public AigcWallpaperAnchorViewModel(DataChannel dataChannel) {
        super(dataChannel);
        this.LLJJ = dataChannel;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>();
        this.LLJJI = mutableLiveData;
        this.LLJJIII = mutableLiveData;
        this.LLJJJIL = "";
        this.LLJJJJ = "";
        this.LLJJJJJIL = -1;
        C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", " AigcWallpaperAnchorViewModel init");
        IMessageManager iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.WALLPAPER_MESSAGE.getIntType(), this);
        } else {
            C20441214yg.LJ("AigcWallpaperAnchorViewModelTAG", "MessageManagerData == null");
        }
        IMessageManager iMessageManager2 = (IMessageManager) dataChannel.gg0(C776250Uch.class);
        if (iMessageManager2 != null) {
            iMessageManager2.addMessageListener(C001A.WALLPAPER_REVIEW_MESSAGE.getIntType(), this);
        } else {
            C20441214yg.LJ("AigcWallpaperAnchorViewModelTAG", "MessageManagerData == null");
        }
    }

    public static String HQ2(Context context) {
        return context.getString(new Integer[]{2131842421, 2131842427, 2131842428, 2131842429, 2131842430, 2131842431, 2131842432, 2131842433, 2131842434, 2131842422, 2131842423, 2131842424, 2131842425, 2131842426}[AbstractC19994813Le.Default.nextInt(14)].intValue());
    }

    public final void FQ2(int i) {
        this.LLJJIJIL = C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C943020aeC(this, i, null), 2);
    }

    public final void IQ2(C926820aE4<WallpaperEndResponse.ResponseData> c926820aE4) {
        String str;
        C939000aXi c939000aXi = C939000aXi.LIZ;
        WallpaperContent wallpaperContent = c926820aE4.data.wallpaperContent;
        if (wallpaperContent != null) {
            str = wallpaperContent.wallpaperUrl;
        } else {
            str = null;
        }
        DataChannel dataChannel = this.LLJJ;
        c939000aXi.getClass();
        C939000aXi.LIZLLL(false, null, str, null, null, 2, dataChannel);
        this.LLJJ.zW(AigcWallpaperStatus.class, Boolean.FALSE);
        this.LLJJ.SX0(C956680b0E.class, -1L);
        C20441214yg.LJIIIZ("AigcWallpaperAnchorViewModelTAG", "resetAigcStatuData success");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        String methodName;
        Long lValueOf;
        String str;
        List<WallpaperContext> list;
        List<WallpaperContext> list2;
        List<WallpaperContext> list3;
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage: ");
        List<WallpaperContext> list4 = null;
        if (iMessage != null) {
            methodName = iMessage.getMethodName();
        } else {
            methodName = null;
        }
        sbLIZ.append(methodName);
        C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", C2188811AlT.LIZIZ(sbLIZ));
        if (iMessage instanceof WallpaperMessage) {
            WallpaperMessage wallpaperMessage = (WallpaperMessage) iMessage;
            if (!BaseAigcWallpaperViewModel.AQ2(wallpaperMessage)) {
                C20441214yg.LJ("AigcWallpaperAnchorViewModelTAG", "isValidMsg!!!");
                return;
            }
            int i = wallpaperMessage.messageType;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 5) {
                            return;
                        }
                        C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", "receivew message WALLPAPER_LIST_CHANGE");
                        C939000aXi c939000aXi = C939000aXi.LIZ;
                        WallpaperContent wallpaperContent = wallpaperMessage.wallpaperContent;
                        if (wallpaperContent != null) {
                            list = wallpaperContent.finishedUserList;
                        } else {
                            list = null;
                        }
                        c939000aXi.getClass();
                        C939000aXi.LJI(list);
                        WallpaperContent wallpaperContent2 = wallpaperMessage.wallpaperContent;
                        if (wallpaperContent2 != null) {
                            list2 = wallpaperContent2.playUserList;
                        } else {
                            list2 = null;
                        }
                        C939000aXi.LJI(list2);
                        MutableLiveData<Pair<List<WallpaperContext>, List<WallpaperContext>>> mutableLiveData = this.LLILZ;
                        WallpaperContent wallpaperContent3 = wallpaperMessage.wallpaperContent;
                        if (wallpaperContent3 != null) {
                            list3 = wallpaperContent3.finishedUserList;
                            list4 = wallpaperContent3.playUserList;
                        } else {
                            list3 = null;
                        }
                        mutableLiveData.postValue(new Pair<>(list3, list4));
                        WallpaperContent wallpaperContent4 = wallpaperMessage.wallpaperContent;
                        if (wallpaperContent4 != null) {
                            C939000aXi.LJIIJ(this.LLJJ, wallpaperContent4.finishedUserList, wallpaperContent4.playUserList, false);
                        }
                        WallpaperContent wallpaperContent5 = wallpaperMessage.wallpaperContent;
                        if (wallpaperContent5 == null || (str2 = wallpaperContent5.wallpaperUrl) == null) {
                            return;
                        }
                        this.LLIZLLLIL.LIZLLL(str2);
                        return;
                    }
                    C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", "receivew message WALLPAPER_END_GAME");
                    this.LLJJ.zW(AigcWallpaperInCountDownChannel.class, Boolean.FALSE);
                    if (C1533950q1J.LJ(this.LLIZ)) {
                        C939000aXi c939000aXi2 = C939000aXi.LIZ;
                        DataChannel dataChannel = this.LLJJ;
                        String str3 = this.LLIZ;
                        c939000aXi2.getClass();
                        C939000aXi.LJII(dataChannel, null, str3);
                    }
                    C939000aXi c939000aXi3 = C939000aXi.LIZ;
                    DataChannel dataChannel2 = this.LLJJ;
                    c939000aXi3.getClass();
                    dataChannel2.LC0(AigcWallpaperPlayOrderDismissEvent.class, Boolean.TRUE);
                    this.LLIZLLLIL.LIZ();
                    InterfaceC497601wk viewModelScope = ViewModelKt.getViewModelScope(this);
                    C1DFH c1dfh = C0PEM.LIZ;
                    C23250099c.LIZLLL(viewModelScope, C2107308Nj.LIZ, null, new C943040aeE(this, wallpaperMessage, null), 2);
                    this.LLJJJIL = "";
                    this.LLJJJJ = "";
                    this.LLJJJJJIL = -1;
                    if (this.LLJJJJLIIL) {
                        C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", "destroyAigcWallpaperMode http request had handled the end case, don't need handle anything in here");
                        this.LLJJJJLIIL = false;
                        return;
                    } else {
                        WallpaperContent wallpaperContent6 = wallpaperMessage.wallpaperContent;
                        if (wallpaperContent6 == null) {
                            return;
                        }
                        C939000aXi.LIZLLL(true, null, wallpaperContent6.wallpaperUrl, null, null, 3, this.LLJJ);
                        return;
                    }
                }
                C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", "receivew message WALLPAPER_NEXT_USER");
                if (!BaseAigcWallpaperViewModel.AQ2(wallpaperMessage)) {
                    return;
                }
                WallpaperContent wallpaperContent7 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent7 != null) {
                    lValueOf = Long.valueOf(wallpaperContent7.playUserId);
                } else {
                    lValueOf = null;
                }
                if (Intrinsics.LJFF(lValueOf, C930540aK4.LJIIZILJ())) {
                    return;
                }
                WallpaperContent wallpaperContent8 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent8 != null && (str = wallpaperContent8.wallpaperUrl) != null) {
                    this.LLIZLLLIL.LIZLLL(str);
                }
                WallpaperContent wallpaperContent9 = wallpaperMessage.wallpaperContent;
                if (wallpaperContent9 == null) {
                    return;
                }
                if (C1533950q1J.LJ(this.LLIZ)) {
                    C939000aXi c939000aXi4 = C939000aXi.LIZ;
                    DataChannel dataChannel3 = this.LLJJ;
                    String str4 = this.LLIZ;
                    c939000aXi4.getClass();
                    C939000aXi.LJII(dataChannel3, str4, null);
                }
                this.LLJJ.zW(AigcWallpaperInCountDownChannel.class, Boolean.TRUE);
                C939000aXi c939000aXi5 = C939000aXi.LIZ;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long millis = timeUnit.toMillis(wallpaperContent9.sendTimestamp);
                DataChannel dataChannel4 = this.LLJJ;
                String strValueOf = String.valueOf(wallpaperContent9.playUserId);
                c939000aXi5.getClass();
                C939000aXi.LJIIIZ(millis, dataChannel4, strValueOf, null);
                this.LLIZ = String.valueOf(wallpaperContent9.playUserId);
                C939000aXi.LIZLLL(true, Long.valueOf(wallpaperContent9.wallpaperId), wallpaperContent9.wallpaperUrl, Long.valueOf(wallpaperContent9.playUserId), Long.valueOf(timeUnit.toMillis(wallpaperContent9.sendTimestamp)), 0, this.LLJJ);
                return;
            }
            this.LLJJIJI = false;
            return;
        }
        if (!(iMessage instanceof WallpaperReviewMessage)) {
            return;
        }
        WallpaperReviewMessage wallpaperReviewMessage = (WallpaperReviewMessage) iMessage;
        if (!zQ2(wallpaperReviewMessage)) {
            C20441214yg.LJ("AigcWallpaperAnchorViewModelTAG", "not matched, so return");
            return;
        }
        C943120aeM.LJIILJJIL();
        if (wallpaperReviewMessage.reviewResult == 20) {
            C20441214yg.LIZIZ("AigcWallpaperAnchorViewModelTAG", "review message passed");
            yQ2(wallpaperReviewMessage);
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("review message not passed, ");
        sbLIZ2.append(wallpaperReviewMessage.reviewResult);
        C20441214yg.LJ("AigcWallpaperAnchorViewModelTAG", C2188811AlT.LIZIZ(sbLIZ2));
        C23250099c.LIZLLL(ViewModelKt.getViewModelScope(this), C0PEM.LIZJ, null, new C943070aeH(this, iMessage, null), 2);
        C943120aeM.LJII(Integer.valueOf((int) wallpaperReviewMessage.reviewResult), "tns_image_review_fail", null);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object JQ2(X.C926820aE4<com.bytedance.android.live.liveinteract.multilive.model.WallpaperCreateResponse.ResponseData> r14, long r15, long r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            r13 = this;
            r3 = r19
            boolean r0 = r3 instanceof X.C943130aeN
            if (r0 == 0) goto L75
            r12 = r3
            X.0aeN r12 = (X.C943130aeN) r12
            int r2 = r12.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r12.LLILLL = r2
        L14:
            java.lang.Object r4 = r12.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r12.LLILLL
            r2 = 1
            if (r0 == 0) goto L47
            if (r0 != r2) goto L7b
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0aE4 r4 = (X.C926820aE4) r4
            if (r4 == 0) goto L73
            T r0 = r4.data
            com.bytedance.android.live.liveinteract.multilive.model.WallpaperEndResponse$ResponseData r0 = (com.bytedance.android.live.liveinteract.multilive.model.WallpaperEndResponse.ResponseData) r0
            if (r0 == 0) goto L73
            boolean r0 = r0.success
            if (r0 != r2) goto L73
        L32:
            java.lang.String r1 = "AigcWallpaperAnchorViewModelTAG"
            if (r2 == 0) goto L41
            r13.IQ2(r4)
            java.lang.String r0 = "resetAigcWallpaperMode: success, has reset aigc wallpaper mode"
            X.C20441214yg.LIZIZ(r1, r0)
        L3e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L41:
            java.lang.String r0 = "resetAigcWallpaperMode:failed. reset aigc wallpaper mode failed"
            X.C20441214yg.LJ(r1, r0)
            goto L3e
        L47:
            X.C155000ia.LIZIZ(r4)
            r13.LLJJIJI = r2
            T r0 = r14.data
            com.bytedance.android.live.liveinteract.multilive.model.WallpaperCreateResponse$ResponseData r0 = (com.bytedance.android.live.liveinteract.multilive.model.WallpaperCreateResponse.ResponseData) r0
            webcast.data.multi_guest_play.WallpaperContent r0 = r0.wallpaperContent
            if (r0 == 0) goto L72
            long r9 = r0.wallpaperId
            X.0Ism r1 = X.C480460Ism.LIZ()
            java.lang.Class<com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.service.AigcWallpaperService> r0 = com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.service.AigcWallpaperService.class
            r1.getClass()
            java.lang.Object r4 = X.C480460Ism.LIZLLL(r0)
            com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.service.AigcWallpaperService r4 = (com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.service.AigcWallpaperService) r4
            r11 = 0
            r12.LLILLL = r2
            r7 = r17
            r5 = r15
            java.lang.Object r4 = r4.destroyAigcWallpaperMode(r5, r7, r9, r11, r12)
            if (r4 != r3) goto L24
            return r3
        L72:
            r4 = 0
        L73:
            r2 = 0
            goto L32
        L75:
            X.0aeN r12 = new X.0aeN
            r12.<init>(r13, r3)
            goto L14
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.wallpaper.viewmodel.AigcWallpaperAnchorViewModel.JQ2(X.0aE4, long, long, X.05Vn):java.lang.Object");
    }
}
