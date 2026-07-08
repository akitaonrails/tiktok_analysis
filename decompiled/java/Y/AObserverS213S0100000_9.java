package Y;

import X.C0PEM;
import X.C1177630gkb;
import X.C123100dR;
import X.C1235870iGX;
import X.C1389890mGx;
import X.C13LP;
import X.C1571790r0L;
import X.C1697810uHb;
import X.C1954807lC;
import X.C19Y3;
import X.C1DFH;
import X.C20600815jK;
import X.C2107308Nj;
import X.C2113808Pw;
import X.C2188811AlT;
import X.C23250099c;
import X.C582640MtC;
import X.C582650MtD;
import X.C583980MvM;
import X.C588490N6h;
import X.C588550N6n;
import X.C604810Nnr;
import X.C606770Nr1;
import X.C607370Nrz;
import X.C615380OBs;
import X.C616980OHw;
import X.C617000OHy;
import X.C630930Oot;
import X.C631000Op0;
import X.C635570OwN;
import X.C635630OwT;
import X.C724240Sb0;
import X.C786410Ut5;
import X.EnumC615370OBr;
import X.EnumC617010OHz;
import X.InterfaceC1891350zJl;
import X.InterfaceC2217461Bqa;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import X.ViewOnAttachStateChangeListenerC20631115oD;
import Y.AObserverS213S0100000_9;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.assem.arch.viewModel.AssemVMLazy;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.authorize.I18nScopesFragment;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.CheckupRelationFragment;
import com.ss.android.ugc.aweme.compliance.protection.timelock.ui.assem.SleepHourComponent;
import com.ss.android.ugc.aweme.featureeffectvideo.model.FeatureVideoViewModel;
import com.ss.android.ugc.aweme.feed.adapter.widget.player.LivePreviewPlayerWidget;
import com.ss.android.ugc.aweme.feed.component.ReachBottomCacheComponent;
import com.ss.android.ugc.aweme.friendstab.nonpersonalized.FriendsNonPersonalizedAssem;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.music.model.MusicOwnerInfo;
import com.ss.android.ugc.aweme.music.v2.MusicDetailFragment;
import com.ss.android.ugc.aweme.music.v2.assem.MusicDescAssem;
import com.ss.android.ugc.aweme.music.v2.assem.MusicPgcMetaInfoWithArtistAssem;
import com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeDetailSettingFragment;
import com.ss.android.ugc.aweme.notification.SystemNotificationUnsubscribeSettingFragmentNew;
import com.ss.android.ugc.aweme.notification.bean.NotificationSubscribeSettingsList;
import com.ss.android.ugc.aweme.poi.revisit.api.PoiRevisitApi;
import com.ss.android.ugc.aweme.poi.revisit.view.PoiRevisitHorizontalCardAssem;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import com.ss.android.ugc.aweme.prop.fragment.DesignerStickerDetailAwemeListFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.feed.platform.panel.base.EventCenter;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS24S0010000_9;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public class AObserverS213S0100000_9 implements Observer {
    public final int $t;
    public Object l0;

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        switch (this.$t) {
            case 0:
                onChanged$0(this, obj);
                break;
            case 1:
                onChanged$1(this, obj);
                break;
            case 2:
                onChanged$2(this, obj);
                break;
            case 3:
                onChanged$3(this, obj);
                break;
            case 4:
                onChanged$4(this, obj);
                break;
            case 5:
                onChanged$5(this, obj);
                break;
            case 6:
                onChanged$6(this, obj);
                break;
            case 7:
                onChanged$7(this, obj);
                break;
            case 8:
                onChanged$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onChanged$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onChanged$10(this, obj);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onChanged$11(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onChanged$12(this, obj);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onChanged$13(this, obj);
                break;
            case 14:
                onChanged$14(this, obj);
                break;
            case 15:
                onChanged$15(this, obj);
                break;
            case 16:
                onChanged$16(this, obj);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onChanged$17(this, obj);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onChanged$18(this, obj);
                break;
            case 19:
                onChanged$19(this, obj);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onChanged$20(this, obj);
                break;
            case 21:
                onChanged$21(this, obj);
                break;
        }
    }

    public AObserverS213S0100000_9(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onChanged$0(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        if (obj != null) {
            LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope((SleepHourComponent) aObserverS213S0100000_9.l0);
            C1DFH c1dfh = C0PEM.LIZ;
            C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ, null, new C1571790r0L((SleepHourComponent) aObserverS213S0100000_9.l0, null), 2);
        }
    }

    public static final void onChanged$1(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        C582650MtD c582650MtD = (C582650MtD) obj;
        if (C583980MvM.LIZ()) {
            ((LivePreviewPlayerWidget) aObserverS213S0100000_9.l0).T1(c582650MtD, "buffered");
        }
    }

    public static final void onChanged$10(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        String str;
        List<PoiRevisitApi.PoiRevisitCardModel> list;
        String str2;
        Integer numValueOf;
        C1177630gkb c1177630gkb = (C1177630gkb) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Horizontal Card Assem observe target poi id: ");
        if (c1177630gkb != null) {
            str = c1177630gkb.LIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        PoiRevisitApi.PoiRevisitCardListResponse poiRevisitCardListResponseWQ2 = ((PoiRevisitHorizontalCardAssem) aObserverS213S0100000_9.l0).hp().wQ2(true, true, true);
        if (poiRevisitCardListResponseWQ2 != null && (list = poiRevisitCardListResponseWQ2.poiCardList) != null) {
            PoiRevisitHorizontalCardAssem poiRevisitHorizontalCardAssem = (PoiRevisitHorizontalCardAssem) aObserverS213S0100000_9.l0;
            int i = 0;
            for (PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    PoiRevisitApi.PoiRevisitCardModel poiRevisitCardModel2 = poiRevisitCardModel;
                    if (c1177630gkb != null) {
                        str2 = c1177630gkb.LIZ;
                    } else {
                        str2 = null;
                    }
                    if (C123100dR.LIZ(str2) && Intrinsics.LJFF(poiRevisitCardModel2.poiId, c1177630gkb.LIZ)) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Horizontal Card Assem observe target poi id: ");
                        sbLIZ2.append(c1177630gkb.LIZ);
                        sbLIZ2.append(" index: ");
                        sbLIZ2.append(i);
                        sbLIZ2.append(", currentIndex=");
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD = poiRevisitHorizontalCardAssem.LLJJIJI;
                        if (viewOnAttachStateChangeListenerC20631115oD != null) {
                            numValueOf = Integer.valueOf(viewOnAttachStateChangeListenerC20631115oD.getCurrentItem());
                        } else {
                            numValueOf = null;
                        }
                        sbLIZ2.append(numValueOf);
                        C2188811AlT.LIZIZ(sbLIZ2);
                        ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD2 = poiRevisitHorizontalCardAssem.LLJJIJI;
                        if (viewOnAttachStateChangeListenerC20631115oD2 == null || i != viewOnAttachStateChangeListenerC20631115oD2.getCurrentItem()) {
                            poiRevisitHorizontalCardAssem.LLJJIJIIJIL = true;
                            ViewOnAttachStateChangeListenerC20631115oD viewOnAttachStateChangeListenerC20631115oD3 = poiRevisitHorizontalCardAssem.LLJJIJI;
                            if (viewOnAttachStateChangeListenerC20631115oD3 != null) {
                                HandlerHook.viewPost(viewOnAttachStateChangeListenerC20631115oD3, new ARunnableS20S0101000_9(i, poiRevisitHorizontalCardAssem, 5));
                            }
                        }
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
    }

    public static final void onChanged$11(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        int i = C617000OHy.LIZ[((EnumC617010OHz) obj).ordinal()];
        if (i != 1) {
            if (i == 2) {
                C616980OHw c616980OHw = (C616980OHw) aObserverS213S0100000_9.l0;
                c616980OHw.LL.setLoading(false);
                C604810Nnr c604810Nnr = c616980OHw.LLILLJJLI;
                if (c604810Nnr != null) {
                    c616980OHw.LIZJ(c604810Nnr.LJFF);
                    return;
                }
                return;
            }
            return;
        }
        C616980OHw c616980OHw2 = (C616980OHw) aObserverS213S0100000_9.l0;
        c616980OHw2.LL.setLoading(false);
        C604810Nnr c604810Nnr2 = c616980OHw2.LLILLJJLI;
        if (c604810Nnr2 == null) {
            return;
        }
        c616980OHw2.LIZJ(c604810Nnr2.LJI);
    }

    public static final void onChanged$12(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C606770Nr1 c606770Nr1 = (C606770Nr1) aObserverS213S0100000_9.l0;
        c606770Nr1.LIZ.LIZ(new C588490N6h(iIntValue, (ArrayList) c606770Nr1.LIZIZ.getValue()));
    }

    public static final void onChanged$13(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Integer num = (Integer) obj;
        C19Y3 c19y3 = ((CheckupRelationFragment) aObserverS213S0100000_9.l0).LLIZLLLIL;
        if (c19y3 != null) {
            HandlerHook.viewPost(c19y3, new ARunnableS78S0200000_9(c19y3, num, 70));
        }
    }

    public static final void onChanged$14(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Integer num = (Integer) obj;
        C19Y3 c19y3 = ((CheckupRelationFragment) aObserverS213S0100000_9.l0).LLIZLLLIL;
        if (c19y3 != null) {
            HandlerHook.viewPost(c19y3, new ARunnableS78S0200000_9(c19y3, num, 71));
        }
    }

    public static final void onChanged$15(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Integer num = (Integer) obj;
        CheckupRelationFragment checkupRelationFragment = (CheckupRelationFragment) aObserverS213S0100000_9.l0;
        C19Y3 c19y3 = checkupRelationFragment.LLIZLLLIL;
        if (c19y3 != null) {
            HandlerHook.viewPost(c19y3, new ARunnableS42S0300000_9(checkupRelationFragment, c19y3, num, 12));
        }
    }

    public static final void onChanged$16(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        EnumC615370OBr enumC615370OBr = (EnumC615370OBr) obj;
        if (enumC615370OBr != null) {
            int i = C615380OBs.LIZ[enumC615370OBr.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                throw new C1954807lC();
                            }
                            return;
                        } else {
                            ((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).LLJJJJ.clearData();
                            ((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).LLJJIJIL.LJIIIIZZ();
                            ((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).cb(false, false);
                            return;
                        }
                    }
                    C1235870iGX c1235870iGX = ((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).LLJJIJIL;
                    if (c1235870iGX != null) {
                        C786410Ut5.LLLLIILL(c1235870iGX, 8);
                    }
                    C1389890mGx c1389890mGx = new C1389890mGx((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0);
                    c1389890mGx.LJIIJ("Error while removing the feature video");
                    c1389890mGx.LJIIJJI();
                    FeatureVideoViewModel featureVideoViewModelUS = ((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).uS();
                    featureVideoViewModelUS.LLILLJJLI.postValue(EnumC615370OBr.STOP);
                    return;
                }
                DesignerStickerDetailAwemeListFragment designerStickerDetailAwemeListFragment = (DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0;
                designerStickerDetailAwemeListFragment.LLLILZLLLI = null;
                designerStickerDetailAwemeListFragment.LLLJL = 3;
                FeatureVideoViewModel featureVideoViewModelUS2 = designerStickerDetailAwemeListFragment.uS();
                featureVideoViewModelUS2.LLILLJJLI.postValue(EnumC615370OBr.STOP);
                return;
            }
            C1235870iGX c1235870iGX2 = ((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).LLJJIJIL;
            if (c1235870iGX2 != null) {
                c1235870iGX2.LJIIIIZZ();
                C786410Ut5.LLLLIILL(((DesignerStickerDetailAwemeListFragment) aObserverS213S0100000_9.l0).LLJJIJIL, 0);
            }
        }
    }

    public static final void onChanged$17(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Iterable iterable = (Iterable) obj;
        C635630OwT c635630OwT = ((I18nScopesFragment) aObserverS213S0100000_9.l0).LLIZ;
        if (c635630OwT == null) {
            c635630OwT = null;
        }
        List listLJLJJLL = C13LP.LJLJJLL(C13LP.LJLLLL(new AComparatorS24S0000000_5(139), iterable));
        ((ArrayList) c635630OwT.LL).clear();
        ((ArrayList) c635630OwT.LL).addAll(listLJLJJLL);
        c635630OwT.notifyDataSetChanged();
    }

    public static final void onChanged$18(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Iterable iterable = (Iterable) obj;
        C635630OwT c635630OwT = ((I18nScopesFragment) aObserverS213S0100000_9.l0).LLIZ;
        if (c635630OwT == null) {
            c635630OwT = null;
        }
        List listLJLJJLL = C13LP.LJLJJLL(C13LP.LJLLLL(new AComparatorS28S0000000_9(22), iterable));
        ((ArrayList) c635630OwT.LLILLJJLI).clear();
        ((ArrayList) c635630OwT.LLILLJJLI).addAll(listLJLJJLL);
        c635630OwT.notifyDataSetChanged();
    }

    public static final void onChanged$19(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        int iIntValue = ((Number) obj).intValue();
        C607370Nrz c607370Nrz = (C607370Nrz) aObserverS213S0100000_9.l0;
        c607370Nrz.LIZ.LIZ(new C588550N6n(iIntValue, c607370Nrz.LIZ()));
    }

    public static final void onChanged$2(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        C582640MtC c582640MtC = (C582640MtC) obj;
        if (C583980MvM.LIZIZ()) {
            ((LivePreviewPlayerWidget) aObserverS213S0100000_9.l0).T1(c582640MtC, c582640MtC.LIZJ);
        }
    }

    public static final void onChanged$20(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj;
        SystemNotificationUnsubscribeDetailSettingFragment systemNotificationUnsubscribeDetailSettingFragment = (SystemNotificationUnsubscribeDetailSettingFragment) aObserverS213S0100000_9.l0;
        View viewFindViewById = systemNotificationUnsubscribeDetailSettingFragment.LLILLJJLI;
        if (viewFindViewById == null) {
            View view = systemNotificationUnsubscribeDetailSettingFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.rmx);
            } else {
                viewFindViewById = null;
            }
            systemNotificationUnsubscribeDetailSettingFragment.LLILLJJLI = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
    }

    public static final void onChanged$21(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        String str = (String) obj;
        SystemNotificationUnsubscribeDetailSettingFragment systemNotificationUnsubscribeDetailSettingFragment = (SystemNotificationUnsubscribeDetailSettingFragment) aObserverS213S0100000_9.l0;
        View viewFindViewById = systemNotificationUnsubscribeDetailSettingFragment.LLILZ;
        if (viewFindViewById == null) {
            View view = systemNotificationUnsubscribeDetailSettingFragment.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.xzv);
            } else {
                viewFindViewById = null;
            }
            systemNotificationUnsubscribeDetailSettingFragment.LLILZ = (TuxTextView) viewFindViewById;
        }
        TextView textView = (TextView) viewFindViewById;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public static final void onChanged$3(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        final ReachBottomCacheComponent reachBottomCacheComponent = (ReachBottomCacheComponent) aObserverS213S0100000_9.l0;
        if (reachBottomCacheComponent.LLJI) {
            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new Runnable() { // from class: X.0Nrd
                public final void LIZ() {
                    final ReachBottomCacheComponent reachBottomCacheComponent2 = reachBottomCacheComponent;
                    if (reachBottomCacheComponent2.LLJI) {
                        reachBottomCacheComponent2.LLJI = false;
                        if (C289790BXl.LIZ()) {
                            C786410Ut5.LJJZZIII(C2113808Pw.LIZIZ.LL, new Runnable() { // from class: X.0Nrj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("ReachBottomCacheComponent@d5f7.onFirstFrame$1");
                                    try {
                                        reachBottomCacheComponent2.bo("first");
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("ReachBottomCacheComponent@d5f7.onFirstFrame$1");
                                }
                            });
                        } else {
                            reachBottomCacheComponent2.bo("first");
                        }
                    }
                    AObserverS213S0100000_9 aObserverS213S0100000_92 = reachBottomCacheComponent2.LLJIJIL;
                    if (aObserverS213S0100000_92 != null) {
                        EventCenter eventCenter = reachBottomCacheComponent2.getEventCenter();
                        if (eventCenter != null) {
                            eventCenter.AQ2(aObserverS213S0100000_92);
                        }
                        reachBottomCacheComponent2.LLJIJIL = null;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("ReachBottomCacheComponent@d5f7.eventInit$1$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("ReachBottomCacheComponent@d5f7.eventInit$1$1");
                }
            });
        }
    }

    public static final void onChanged$4(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Boolean bool = (Boolean) obj;
        AssemVMLazy assemVMLazy = ((FriendsNonPersonalizedAssem) aObserverS213S0100000_9.l0).LLIZLLLIL;
        InterfaceC2217461Bqa<Object>[] interfaceC2217461BqaArr = FriendsNonPersonalizedAssem.LLJ;
        boolean zBooleanValue = false;
        AssemViewModel value = assemVMLazy.getValue();
        if (bool != null) {
            zBooleanValue = bool.booleanValue();
        }
        value.setState(new AwS24S0010000_9(zBooleanValue, 18));
    }

    public static final void onChanged$5(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        Music music;
        List<MusicOwnerInfo> songWriter;
        FollowStatus followStatus = (FollowStatus) obj;
        MusicDetail musicDetailLIZ = ((MusicDetailFragment) aObserverS213S0100000_9.l0).VR().getState().LL.LIZ();
        if (musicDetailLIZ != null && (music = musicDetailLIZ.music) != null && (songWriter = music.getSongWriter()) != null) {
            C631000Op0.LIZIZ(followStatus, songWriter);
        }
    }

    public static final void onChanged$6(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        C630930Oot c630930Oot;
        FragmentManager fragmentManager;
        FollowStatus followStatus = (FollowStatus) obj;
        MusicDescAssem musicDescAssem = (MusicDescAssem) aObserverS213S0100000_9.l0;
        Music music = musicDescAssem.LLJJJJ;
        if (music != null) {
            Pair pairMp = MusicDescAssem.mp(music);
            C630930Oot c630930Oot2 = musicDescAssem.LLJJJ;
            if (c630930Oot2 != null && c630930Oot2.getVisibility() == 0 && ((Boolean) pairMp.getFirst()).booleanValue() && C631000Op0.LIZIZ(followStatus, (List) pairMp.getSecond()) && (c630930Oot = musicDescAssem.LLJJJ) != null) {
                List<? extends MusicOwnerInfo> list = (List) pairMp.getSecond();
                Fragment fragmentLJI = C724240Sb0.LJI(musicDescAssem);
                if (fragmentLJI != null) {
                    fragmentManager = fragmentLJI.getFragmentManager();
                } else {
                    fragmentManager = null;
                }
                c630930Oot.LIZ(list, fragmentManager, musicDescAssem.LLJJJJ);
            }
        }
    }

    public static final void onChanged$7(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        if (C631000Op0.LIZIZ((FollowStatus) obj, ((MusicPgcMetaInfoWithArtistAssem) aObserverS213S0100000_9.l0).LLLFZ)) {
            ((MusicPgcMetaInfoWithArtistAssem) aObserverS213S0100000_9.l0).lp();
        }
    }

    public static final void onChanged$8(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj;
        SystemNotificationUnsubscribeSettingFragmentNew systemNotificationUnsubscribeSettingFragmentNew = (SystemNotificationUnsubscribeSettingFragmentNew) aObserverS213S0100000_9.l0;
        View viewFindViewById = systemNotificationUnsubscribeSettingFragmentNew.LL;
        if (viewFindViewById == null) {
            View view = systemNotificationUnsubscribeSettingFragmentNew.getView();
            if (view != null) {
                viewFindViewById = view.findViewById(R.id.rmx);
            } else {
                viewFindViewById = null;
            }
            systemNotificationUnsubscribeSettingFragmentNew.LL = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        }
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewFindViewById;
        if (viewOnAttachStateChangeListenerC20604515jv != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
    }

    public static final void onChanged$9(AObserverS213S0100000_9 aObserverS213S0100000_9, Object obj) {
        NotificationSubscribeSettingsList notificationSubscribeSettingsList = (NotificationSubscribeSettingsList) obj;
        if (notificationSubscribeSettingsList != null) {
            C635570OwN c635570OwN = (C635570OwN) aObserverS213S0100000_9.l0;
            if (notificationSubscribeSettingsList.status_code == 0) {
                c635570OwN.LJI = notificationSubscribeSettingsList;
                if (c635570OwN.LIZLLL) {
                    c635570OwN.LIZIZ();
                    c635570OwN.LIZLLL = false;
                    return;
                }
                return;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c635570OwN.LIZ);
            c1389890mGx.LJIIIZ(R.string.jb4);
            c1389890mGx.LJIIJJI();
        }
    }
}
