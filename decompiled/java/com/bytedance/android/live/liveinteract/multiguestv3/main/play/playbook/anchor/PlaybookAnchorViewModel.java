package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor;

import X.AbstractC20384214pU;
import X.C01EI;
import X.C01GW;
import X.C01NB;
import X.C09JN;
import X.C1158290gFP;
import X.C11S5;
import X.C1776490wKV;
import X.C19487311Lz;
import X.C1AZW;
import X.C20359414lU;
import X.C20359714lX;
import X.C20360614lg;
import X.C20361214lm;
import X.C20377014oK;
import X.C20379114of;
import X.C20384514pX;
import X.C20388414qA;
import X.C20388614qC;
import X.C20389914qP;
import X.C20441214yg;
import X.C2108408Nu;
import X.C2188811AlT;
import X.C405101hp;
import X.C452501pT;
import X.C473410IhP;
import X.C480460Ism;
import X.C500260Jjc;
import X.C784920Uqg;
import X.C915190ZvJ;
import X.C978360bZC;
import X.InterfaceC20387114px;
import X.InterfaceC986020blY;
import Y.ARunnableS6S0111000_31;
import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.IPlaybookApi;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.RefreshPlaybookListEvent;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestBannerParams;
import com.bytedance.android.live.liveinteract.multilive.model.MultiGuestBannerResponse;
import com.bytedance.android.live.liveinteract.multilive.model.PlaybookUpdateUserSettingParams;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.chatroom.api.LinkApi;
import com.bytedance.android.livesdk.comp.api.logger.service.ILoggerService;
import com.bytedance.android.livesdk.entity.PlayRule;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AwS146S1200000_31;
import kotlin.jvm.internal.AwS575S0100000_31;
import webcast.data.multi_guest_play.ActivePlaybook;
import webcast.data.multi_guest_play.Playbook;
import webcast.data.multi_guest_play.PlaybookTagAggregation;

/* JADX INFO: loaded from: classes32.dex */
public final class PlaybookAnchorViewModel extends BasePlaybookViewModel {
    public final MutableLiveData<Boolean> LLJIJIL;
    public final MutableLiveData<List<Playbook>> LLJILJIL;
    public final MutableLiveData<List<Playbook>> LLJILJILJ;
    public final MutableLiveData<List<Playbook>> LLJILLL;
    public final MutableLiveData<Long> LLJJ;
    public final Map<Integer, MutableLiveData<List<Playbook>>> LLJJI;
    public final MutableLiveData<C20389914qP> LLJJIII;
    public final MutableLiveData<List<PlaybookTagAggregation>> LLJJIJI;
    public final MutableLiveData<C1158290gFP> LLJJIJIIJIL;
    public final Set<Integer> LLJJIJIL;
    public int LLJJJ;
    public final InterfaceC986020blY LLJJJIL;
    public final C01GW LLJJJJ;
    public final C20384514pX LLJJJJJIL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final String xQ2() {
        return "PlaybookAnchorViewModel";
    }

    public final void FQ2() {
        C20441214yg.LIZIZ("PlaybookAnchorViewModel", "clearDataWhenPageClose");
        C20384514pX c20384514pX = this.LLJJJJJIL;
        c20384514pX.LJJ.LIZIZ();
        c20384514pX.LJJIFFI = false;
        this.LLJIJIL.postValue(Boolean.FALSE);
        MutableLiveData<List<Playbook>> mutableLiveData = this.LLJILJIL;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(null);
        }
        MutableLiveData<List<Playbook>> mutableLiveData2 = this.LLJILJILJ;
        if (mutableLiveData2 != null) {
            mutableLiveData2.postValue(null);
        }
        MutableLiveData<List<Playbook>> mutableLiveData3 = this.LLJILLL;
        if (mutableLiveData3 != null) {
            mutableLiveData3.postValue(null);
        }
        MutableLiveData<List<PlaybookTagAggregation>> mutableLiveData4 = this.LLJJIJI;
        if (mutableLiveData4 != null) {
            mutableLiveData4.postValue(null);
        }
        this.LLJJIJIIJIL.postValue(null);
        this.LLJJIJIL.clear();
    }

    public final int LQ2() {
        Object next;
        Iterator<T> it2 = this.LLJJJJJIL.LJ.values().iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (((C20377014oK) next).LJIIIZ) {
                break;
            }
        }
        C20377014oK c20377014oK = (C20377014oK) next;
        if (c20377014oK != null) {
            return c20377014oK.LIZLLL.LJIILLIIL;
        }
        return 0;
    }

    public final List<PlaybookTagAggregation> NQ2() {
        ArrayList arrayList = new ArrayList();
        List<PlaybookTagAggregation> value = this.LLJJIJI.getValue();
        if (value != null) {
            arrayList.addAll(value);
        }
        return arrayList;
    }

    public final void QQ2() {
        C20441214yg.LIZIZ("PlaybookAnchorViewModel", "requestBanner");
        final C20384514pX c20384514pX = this.LLJJJJJIL;
        c20384514pX.getClass();
        C1AZW.LJIIJ(12, C01EI.LIZ(0, "PlaybookAnchorModel"), "requestBanner", null, null);
        C480460Ism.LIZ().getClass();
        LinkApi linkApi = (LinkApi) C480460Ism.LIZLLL(LinkApi.class);
        MultiGuestBannerParams multiGuestBannerParams = new MultiGuestBannerParams();
        multiGuestBannerParams.scene = 2;
        C19487311Lz.LIZJ(linkApi.getMultiGuestBanner(multiGuestBannerParams).LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.14pq
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("PlaybookAnchorModel@281.requestBanner$2");
                C20389914qP c20389914qP = new C20389914qP(((MultiGuestBannerResponse.ResponseData) ((BaseResponse) obj).data).bannerInfo);
                Iterator<InterfaceC20387114px> it2 = c20384514pX.LJIJI.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL(c20389914qP);
                }
                C1C7U.LIZIZ("PlaybookAnchorModel@281.requestBanner$2");
            }
        }), vQ2(), null, null, 30);
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final void clearCache() {
        super.clearCache();
        C915190ZvJ c915190ZvJ = C978360bZC.LIZJ;
        C978360bZC.LJIIIZ = "";
        C978360bZC.LJIIJ = "";
        C978360bZC.LJIILIIL = "";
        C978360bZC.LJIILJJIL = false;
        C978360bZC.LJIIJJI = "";
        C978360bZC.LJIIL = "";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        super.onCleared();
        this.LL.zQ2(this);
        C20384514pX c20384514pX = this.LLJJJJJIL;
        c20384514pX.LJIJI.remove(this.LLJJJJ.getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final void onInit() {
        super.onInit();
        this.LL.CQ2(RefreshPlaybookListEvent.class, this, new C20388414qA(this));
        this.LLJJJJJIL.LJIJI.add((InterfaceC20387114px) this.LLJJJJ.getValue());
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.BasePlaybookViewModel
    public final /* bridge */ /* synthetic */ AbstractC20384214pU wQ2() {
        return this.LLJJJJJIL;
    }

    public final MutableLiveData<List<Playbook>> KQ2(int i) {
        MutableLiveData<List<Playbook>> mutableLiveData = (MutableLiveData) ((LinkedHashMap) this.LLJJI).get(Integer.valueOf(i));
        if (mutableLiveData == null) {
            MutableLiveData<List<Playbook>> mutableLiveData2 = new MutableLiveData<>();
            this.LLJJI.put(Integer.valueOf(i), mutableLiveData2);
            return mutableLiveData2;
        }
        return mutableLiveData;
    }

    public final int MQ2(int i) {
        C1776490wKV c1776490wKV = (C1776490wKV) ((LinkedHashMap) this.LLJJJJJIL.LJJIIJ).get(Integer.valueOf(i));
        if (c1776490wKV != null) {
            return c1776490wKV.LIZIZ;
        }
        return 0;
    }

    public final boolean PQ2(Playbook playbook) {
        Boolean boolValueOf;
        C20377014oK c20377014oK = this.LLJJJJJIL.LJ.get(PlaybookUtilKt.LIZIZ(playbook));
        if (c20377014oK != null) {
            boolValueOf = Boolean.valueOf(c20377014oK.LIZLLL.LJIJJLI);
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    public PlaybookAnchorViewModel(DataChannel dataChannel, WeakReference<Context> weakReference) {
        super(dataChannel);
        this.LLJIJIL = new MutableLiveData<>(Boolean.FALSE);
        this.LLJILJIL = new MutableLiveData<>(null);
        this.LLJILJILJ = new MutableLiveData<>(null);
        this.LLJILLL = new MutableLiveData<>(null);
        this.LLJJ = new MutableLiveData<>(null);
        this.LLJJI = new LinkedHashMap();
        this.LLJJIII = new MutableLiveData<>(null);
        this.LLJJIJI = new MutableLiveData<>(null);
        this.LLJJIJIIJIL = new MutableLiveData<>(null);
        this.LLJJIJIL = new LinkedHashSet();
        this.LLJJJ = 1;
        ILoggerService iLoggerService = (ILoggerService) C2108408Nu.LIZ.LIZIZ(ILoggerService.class);
        this.LLJJJIL = iLoggerService != null ? iLoggerService.mb0() : null;
        this.LLJJJJ = C452501pT.LIZIZ(new C20388614qC(this));
        this.LLJJJJJIL = new C20384514pX(dataChannel, weakReference);
    }

    public final void OQ2(long j, Playbook playbook) {
        Integer numValueOf;
        ActivePlaybook activePlaybookLIZIZ;
        List<C20359414lU> list;
        List<C20359414lU> list2;
        C20377014oK c20377014oK = this.LLJJJJJIL.LJ.get(PlaybookUtilKt.LIZIZ(playbook));
        if (c20377014oK != null) {
            C20359714lX c20359714lX = c20377014oK.LIZLLL;
            C20360614lg c20360614lg = c20359714lX.LJIILJJIL;
            if (c20360614lg != null && (list2 = c20360614lg.LIZIZ) != null) {
                Iterator<C20359414lU> it2 = list2.iterator();
                int i = 0;
                loop0: while (true) {
                    if (it2.hasNext()) {
                        C20359414lU next = it2.next();
                        if (next.LIZ == j) {
                            break;
                        }
                        List<C20361214lm> list3 = next.LIZJ;
                        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                            Iterator<C20361214lm> it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (it3.next().LIZIZ == j) {
                                    break loop0;
                                }
                            }
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                numValueOf = Integer.valueOf(i);
            } else {
                numValueOf = null;
            }
            if (c20359714lX.LJIJJLI && c20359714lX.LJIILJJIL != null && c20359714lX.LJIILL != null && c20359714lX.LJIILIIL != null) {
                if (numValueOf == null || numValueOf.intValue() != -1) {
                    int i2 = c20359714lX.LJIILLIIL;
                    if (numValueOf != null && numValueOf.intValue() == i2) {
                        return;
                    }
                    C20360614lg c20360614lg2 = c20359714lX.LJIILJJIL;
                    if (c20360614lg2 != null && (list = c20360614lg2.LIZIZ) != null) {
                        Iterator<C20359414lU> it4 = list.iterator();
                        while (it4.hasNext()) {
                            Iterator<C20361214lm> it5 = it4.next().LIZJ.iterator();
                            while (it5.hasNext()) {
                                PlayRule playRule = it5.next().LIZLLL;
                                if (playRule != null) {
                                    playRule.LJIILJJIL();
                                }
                            }
                        }
                    }
                    ARunnableS6S0111000_31 aRunnableS6S0111000_31 = c20359714lX.LJIJ;
                    if (aRunnableS6S0111000_31 != null) {
                        C473410IhP.LIZ().removeCallbacks(aRunnableS6S0111000_31);
                        c20359714lX.LJIJ = null;
                    }
                    c20359714lX.LJIILLIIL = 0;
                    c20359714lX.LJIIZILJ = -1L;
                    C500260Jjc.LJJLIIIJILLIZJL(new AwS575S0100000_31(c20359714lX, 1349));
                    PlaybookAnchorServiceV2 playbookAnchorServiceV2LIZIZ = C784920Uqg.LIZIZ(c20359714lX.LIZ);
                    if (playbookAnchorServiceV2LIZIZ != null && (activePlaybookLIZIZ = playbookAnchorServiceV2LIZIZ.LIZIZ()) != null) {
                        activePlaybookLIZIZ.currentStateId = j;
                    }
                    C20379114of c20379114of = c20359714lX.LJIILIIL;
                    Playbook playbook2 = c20359714lX.LJIILL;
                    C20360614lg c20360614lg3 = c20359714lX.LJIILJJIL;
                    if (c20379114of == null || playbook2 == null || c20360614lg3 == null) {
                        return;
                    }
                    c20359714lX.LJIIL(c20379114of, playbook2, c20360614lg3, true, true);
                }
            }
        }
    }

    public final void TQ2(final int i, final Playbook playbook) {
        final C20384514pX c20384514pX = this.LLJJJJJIL;
        c20384514pX.getClass();
        C480460Ism.LIZ().getClass();
        IPlaybookApi iPlaybookApi = (IPlaybookApi) C480460Ism.LIZLLL(IPlaybookApi.class);
        PlaybookUpdateUserSettingParams playbookUpdateUserSettingParams = new PlaybookUpdateUserSettingParams();
        playbookUpdateUserSettingParams.playbookId = playbook.playbookId;
        playbookUpdateUserSettingParams.automationUserSetting = i;
        C19487311Lz.LIZJ(C01NB.LIZ(C01NB.LIZIZ(iPlaybookApi.updateUserSetting(playbookUpdateUserSettingParams), "PlaybookAnchorModel", "updateUserSetting").LJJIJIIJI(C11S5.LIZ()).LJJ(C405101hp.LIZLLL).LJIILL(new C09JN() { // from class: X.14oa
            @Override // X.C09JN
            public final void accept(Object obj) {
                Playbook playbook2;
                C1C7U.LIZ("PlaybookAnchorModel@281.updateUserSetting$5");
                C930480aJy.LIZ.getClass();
                if (C930480aJy.LJJIFFI((C470590Icr) obj)) {
                    C20384514pX c20384514pX2 = c20384514pX;
                    ActivePlaybook activePlaybook = c20384514pX2.LJIIIZ;
                    boolean z = true;
                    if (activePlaybook != null && (playbook2 = activePlaybook.playbook) != null && playbook.playbookId == playbook2.playbookId) {
                        Playbook playbook3 = activePlaybook.playbook;
                        if (playbook3 != null) {
                            playbook3.automationUserSetting = i;
                        }
                        c20384514pX2.LJJIII(activePlaybook, "updateAutomationUserSetting", false, true);
                    }
                    Playbook playbook4 = playbook;
                    playbook4.automationUserSetting = i;
                    C20377014oK c20377014oK = c20384514pX.LJ.get(PlaybookUtilKt.LIZIZ(playbook4));
                    if (c20377014oK != null) {
                        int i2 = i;
                        Playbook playbook5 = playbook;
                        if (i2 != 1) {
                            z = false;
                        }
                        C20359714lX c20359714lX = c20377014oK.LIZLLL;
                        if (c20359714lX.LJIJJLI != z) {
                            c20359714lX.LJIJJLI = z;
                        }
                        C403501hZ.LIZ(new AwS146S1200000_31("updateUserSetting", playbook5, c20377014oK, 10));
                    }
                }
                C1C7U.LIZIZ("PlaybookAnchorModel@281.updateUserSetting$5");
            }
        })), vQ2(), null, null, 30);
    }

    public final void RQ2(long j, long j2, String str) {
        C20384514pX c20384514pX = this.LLJJJJJIL;
        c20384514pX.getClass();
        String strLIZ = C01EI.LIZ(428, "PlaybookAnchorModel");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setUpLocalFlowStrFromOuter, playbookId=");
        sbLIZ.append(j);
        sbLIZ.append(", originalPlaybookContentId=");
        sbLIZ.append(j2);
        C1AZW.LJIIJ(12, strLIZ, C2188811AlT.LIZIZ(sbLIZ), null, null);
        c20384514pX.LJJJJI(PlaybookUtilKt.LJIJ(Long.valueOf(j), Long.valueOf(j2)), str);
    }

    /* JADX WARN: Removed duplicated region for block: B:124:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164 A[PHI: r9
      0x0164: PHI (r9v6 long) = (r9v5 long), (r9v10 long), (r9v10 long) binds: [B:65:0x0160, B:41:0x00c1, B:43:0x00c5] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016a A[PHI: r2 r9
      0x016a: PHI (r2v12 long) = (r2v11 long), (r2v16 long), (r2v16 long) binds: [B:68:0x0166, B:46:0x00cb, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]
      0x016a: PHI (r9v7 long) = (r9v6 long), (r9v9 long), (r9v9 long) binds: [B:68:0x0166, B:46:0x00cb, B:48:0x00cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v68, types: [T, com.bytedance.android.live.liveinteract.multilive.model.PlaybookEndResponse$ResponseData] */
    /* JADX WARN: Type inference failed for: r0v76, types: [X.00Sl] */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.0bOa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void GQ2(final X.InterfaceC170900l9<X.C470590Icr<com.bytedance.android.live.liveinteract.multilive.model.PlaybookEndResponse.ResponseData>> r25, final boolean r26, final boolean r27, final kotlin.jvm.functions.Function0<kotlin.Unit> r28, boolean r29) {
        /*
            Method dump skipped, instruction units count: 669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel.GQ2(X.00l9, boolean, boolean, kotlin.jvm.functions.Function0, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x012d  */
    /* JADX WARN: Type inference failed for: r1v4, types: [T, com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse$ResponseData] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void IQ2(final boolean r12, int r13, int r14, boolean r15, boolean r16, final X.InterfaceC170900l9<X.C470590Icr<com.bytedance.android.live.liveinteract.multilive.model.PlaybookFetchListResponse.ResponseData>> r17) {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel.IQ2(boolean, int, int, boolean, boolean, X.00l9):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139 A[PHI: r2
      0x0139: PHI (r2v6 webcast.data.multi_guest_play.Playbook) = (r2v1 webcast.data.multi_guest_play.Playbook), (r2v12 webcast.data.multi_guest_play.Playbook) binds: [B:69:0x0117, B:80:0x0137] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0  */
    /* JADX WARN: Type inference failed for: r11v0, types: [X.01ra] */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r4v4, types: [T, com.bytedance.android.live.liveinteract.multilive.model.PlaybookStartResponse$ResponseData] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void SQ2(final com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel r26, final X.InterfaceC170900l9 r27, webcast.data.multi_guest_play.Playbook r28, java.lang.Long r29, java.lang.Long r30, java.lang.Long r31, java.lang.String r32, java.util.Map r33, java.lang.String r34, java.lang.String r35, boolean r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, boolean r41, boolean r42, int r43) {
        /*
            Method dump skipped, instruction units count: 1046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel.SQ2(com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.anchor.PlaybookAnchorViewModel, X.00l9, webcast.data.multi_guest_play.Playbook, java.lang.Long, java.lang.Long, java.lang.Long, java.lang.String, java.util.Map, java.lang.String, java.lang.String, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int):void");
    }
}
