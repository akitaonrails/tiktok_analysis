package Y;

import X.C05P0;
import X.C0FNV;
import X.C10H5;
import X.C10I5;
import X.C10SV;
import X.C10SX;
import X.C10U1;
import X.C10WS;
import X.C10WT;
import X.C11G4;
import X.C11N2;
import X.C1273904yf;
import X.C127M;
import X.C12ES;
import X.C1303280k1G;
import X.C1336205Ku;
import X.C13LP;
import X.C1458310o3J;
import X.C14KQ;
import X.C15438062q;
import X.C1619980sG4;
import X.C1890270zI1;
import X.C1890290zI3;
import X.C1892600zLm;
import X.C1892750zM1;
import X.C1901440za2;
import X.C1901500za8;
import X.C1902240zbK;
import X.C1902250zbL;
import X.C1903190zcr;
import X.C1911040zpW;
import X.C1911410zq7;
import X.C19253210Ty;
import X.C19299010eq;
import X.C19EG;
import X.C19EH;
import X.C1A4K;
import X.C20600915jL;
import X.C21212117zj;
import X.C2188811AlT;
import X.C2344009Gk;
import X.C294530BgZ;
import X.C418440Gaw;
import X.C786410Ut5;
import X.C807840VmY;
import X.C814420VxA;
import X.DialogC1389620mGW;
import X.EnumC1903200zcs;
import X.EnumC19241510Pl;
import X.EnumC756810TmR;
import X.InterfaceC1891350zJl;
import X.ViewOnAttachStateChangeListenerC20604515jv;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.slot.IIconSlot;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKAgeGateUiUpgradeRegistrationFragment;
import com.ss.android.ugc.aweme.account.agegate.customdataforsdk.TTKRegistrationBaseFragment;
import com.ss.android.ugc.aweme.account.login.ViewPagerBottomSheetBehavior;
import com.ss.android.ugc.aweme.compliance.agegate.coarsetonarrow.AgeGateExistingStartFragment;
import com.ss.android.ugc.aweme.compliance.business.contentpreferences.ContentPreferencesPage;
import com.ss.android.ugc.aweme.compliance.privacy.pauseinteraction.utils.SingleLiveDataWrapper;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinPageFragment;
import com.ss.android.ugc.aweme.inbox.followerv2.InboxFollowerFragmentV2;
import com.ss.android.ugc.aweme.inbox.tablet.TabletInboxEmptyFragment;
import com.ss.android.ugc.aweme.inbox.tablet.TabletInboxViewModel;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import com.ss.android.ugc.aweme.journey.step.swipeup.NujRevampSwipeUpComponent;
import com.ss.android.ugc.aweme.music.model.Music;
import com.ss.android.ugc.aweme.notification.creator.NotificationContainerFragment;
import com.ss.android.ugc.aweme.notification.sysnotice.SystemNotificationContainerFragment;
import com.ss.android.ugc.aweme.notification.v2.NotificationResultFragment;
import com.ss.android.ugc.aweme.notification.view.FixedLinearlayoutManager;
import com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment;
import com.ss.android.ugc.aweme.pns.agegate.viewmodels.PNSBaseAgeGateViewModel;
import com.ss.android.ugc.aweme.pns.universalpopup.core.utils.SingleLiveEvent;
import com.ss.android.ugc.aweme.refactor.integration.NUJComponentFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.subscription.utils.SingleLiveData;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes29.dex */
public class AObserverS188S0200000_28 implements Observer {
    public final int $t;
    public Object l0;
    public Object l1;

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
            case 22:
                onChanged$22(this, obj);
                break;
        }
    }

    public static final void onChanged$0(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        C19EG activity;
        Boolean bool = (Boolean) obj;
        if (C294530BgZ.LIZ()) {
            if (bool.booleanValue()) {
                TTKAgeGateUiUpgradeRegistrationFragment tTKAgeGateUiUpgradeRegistrationFragment = (TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0;
                if (tTKAgeGateUiUpgradeRegistrationFragment.LLJLL == null && (activity = tTKAgeGateUiUpgradeRegistrationFragment.getActivity()) != null) {
                    TTKAgeGateUiUpgradeRegistrationFragment tTKAgeGateUiUpgradeRegistrationFragment2 = (TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0;
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
                    dialogC1389620mGW.LJJLIIJ(true);
                    dialogC1389620mGW.LJJLL(false);
                    dialogC1389620mGW.setCancelable(false);
                    tTKAgeGateUiUpgradeRegistrationFragment2.LLJLL = dialogC1389620mGW;
                }
                DialogC1389620mGW dialogC1389620mGW2 = ((TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0).LLJLL;
                if (dialogC1389620mGW2 != null) {
                    C0FNV.LIZJ(dialogC1389620mGW2);
                    return;
                }
                return;
            }
            DialogC1389620mGW dialogC1389620mGW3 = ((TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0).LLJLL;
            if (dialogC1389620mGW3 == null) {
                return;
            }
            C0FNV.LIZIZ(dialogC1389620mGW3);
            return;
        }
        if (bool.booleanValue()) {
            TTKAgeGateUiUpgradeRegistrationFragment tTKAgeGateUiUpgradeRegistrationFragment3 = (TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0;
            DialogC1389620mGW dialogC1389620mGW4 = new DialogC1389620mGW(((View) aObserverS188S0200000_28.l1).getContext());
            dialogC1389620mGW4.LJJLIIJ(true);
            dialogC1389620mGW4.LJJLL(false);
            dialogC1389620mGW4.setCancelable(false);
            tTKAgeGateUiUpgradeRegistrationFragment3.LLJLL = dialogC1389620mGW4;
            DialogC1389620mGW dialogC1389620mGW5 = ((TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0).LLJLL;
            if (dialogC1389620mGW5 == null) {
                return;
            }
            C786410Ut5.J4(dialogC1389620mGW5);
            return;
        }
        DialogC1389620mGW dialogC1389620mGW6 = ((TTKAgeGateUiUpgradeRegistrationFragment) aObserverS188S0200000_28.l0).LLJLL;
        if (dialogC1389620mGW6 == null) {
            return;
        }
        dialogC1389620mGW6.hide();
    }

    public static final void onChanged$1(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        C19EG activity;
        Boolean bool = (Boolean) obj;
        if (C294530BgZ.LIZ()) {
            if (bool.booleanValue()) {
                TTKRegistrationBaseFragment tTKRegistrationBaseFragment = (TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0;
                if (tTKRegistrationBaseFragment.LLJLL == null && (activity = tTKRegistrationBaseFragment.getActivity()) != null) {
                    TTKRegistrationBaseFragment tTKRegistrationBaseFragment2 = (TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0;
                    DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(activity);
                    dialogC1389620mGW.LJJLIIJ(true);
                    dialogC1389620mGW.LJJLL(false);
                    dialogC1389620mGW.setCancelable(false);
                    tTKRegistrationBaseFragment2.LLJLL = dialogC1389620mGW;
                }
                DialogC1389620mGW dialogC1389620mGW2 = ((TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0).LLJLL;
                if (dialogC1389620mGW2 != null) {
                    C0FNV.LIZJ(dialogC1389620mGW2);
                    return;
                }
                return;
            }
            DialogC1389620mGW dialogC1389620mGW3 = ((TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0).LLJLL;
            if (dialogC1389620mGW3 == null) {
                return;
            }
            C0FNV.LIZIZ(dialogC1389620mGW3);
            return;
        }
        if (bool.booleanValue()) {
            TTKRegistrationBaseFragment tTKRegistrationBaseFragment3 = (TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0;
            DialogC1389620mGW dialogC1389620mGW4 = new DialogC1389620mGW(((View) aObserverS188S0200000_28.l1).getContext());
            dialogC1389620mGW4.LJJLIIJ(true);
            dialogC1389620mGW4.LJJLL(false);
            dialogC1389620mGW4.setCancelable(false);
            tTKRegistrationBaseFragment3.LLJLL = dialogC1389620mGW4;
            DialogC1389620mGW dialogC1389620mGW5 = ((TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0).LLJLL;
            if (dialogC1389620mGW5 == null) {
                return;
            }
            C786410Ut5.J4(dialogC1389620mGW5);
            return;
        }
        DialogC1389620mGW dialogC1389620mGW6 = ((TTKRegistrationBaseFragment) aObserverS188S0200000_28.l0).LLJLL;
        if (dialogC1389620mGW6 == null) {
            return;
        }
        dialogC1389620mGW6.hide();
    }

    public static final void onChanged$10(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        Object next;
        List listLLIIII = C13LP.LLIIII(((Map) obj).values());
        EnumC19241510Pl enumC19241510Pl = (EnumC19241510Pl) aObserverS188S0200000_28.l0;
        Iterator it2 = listLLIIII.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (enumC19241510Pl == ((C10SX) next).LIZ) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C10SX c10sx = (C10SX) next;
        if (c10sx != null) {
            ((Observer) aObserverS188S0200000_28.l1).onChanged(c10sx.LIZIZ);
        }
    }

    public static final void onChanged$11(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        Collection collectionValues = ((Map) obj).values();
        EnumC19241510Pl enumC19241510Pl = (EnumC19241510Pl) aObserverS188S0200000_28.l0;
        for (Object obj2 : collectionValues) {
            C10SX c10sx = (C10SX) obj2;
            if (enumC19241510Pl == c10sx.LIZ && Intrinsics.LJFF(c10sx.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                if (obj2 != null) {
                    ((C11N2) aObserverS188S0200000_28.l1).onNext(obj2);
                    return;
                }
                return;
            }
        }
    }

    public static final void onChanged$12(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        if (((SingleLiveEvent) aObserverS188S0200000_28.l0).pending.compareAndSet(true, false)) {
            ((Observer) aObserverS188S0200000_28.l1).onChanged(obj);
        }
    }

    public static final void onChanged$13(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        if (((SingleLiveData) aObserverS188S0200000_28.l0).pending.compareAndSet(true, false)) {
            ((Observer) aObserverS188S0200000_28.l1).onChanged(obj);
        }
    }

    public static final void onChanged$14(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        String str;
        View view = (View) aObserverS188S0200000_28.l0;
        String idStr = null;
        if (view != null && view.getParent() != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C10I5 c10i5 = (C10I5) aObserverS188S0200000_28.l1;
            if (jCurrentTimeMillis - c10i5.LLIZ > 2500) {
                C1458310o3J c1458310o3J = C1458310o3J.LIZ;
                String aid = c10i5.LLILLJJLI.getAid();
                Music music = ((C10I5) aObserverS188S0200000_28.l1).LLILLJJLI.getMusic();
                if (music != null) {
                    idStr = music.getIdStr();
                }
                if (C10I5.LJIILL(((C10I5) aObserverS188S0200000_28.l1).LLILLJJLI)) {
                    str = "copyright";
                } else {
                    str = "other";
                }
                c1458310o3J.getClass();
                C1458310o3J.LJI(aid, idStr, str);
                ((C10I5) aObserverS188S0200000_28.l1).LLIZ = System.currentTimeMillis();
            }
        }
    }

    public static final void onChanged$15(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        Fragment tabletInboxEmptyFragment;
        Serializable serializable;
        EnterChatParams enterChatParams;
        View viewFindViewById;
        boolean zVQ2;
        C1902240zbK c1902240zbK = (C1902240zbK) obj;
        TabletInboxViewModel tabletInboxViewModel = ((InboxFragmentV2) aObserverS188S0200000_28.l0).LLJZ;
        if (tabletInboxViewModel != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("TabletViewModel: Creating a fragment of type ");
            sbLIZ.append(c1902240zbK.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1902250zbL c1902250zbL = tabletInboxViewModel.LL;
            EnumC1903200zcs enumC1903200zcs = c1902240zbK.LIZ;
            Bundle bundle = c1902240zbK.LIZIZ;
            c1902250zbL.getClass();
            switch (C1903190zcr.LIZ[enumC1903200zcs.ordinal()]) {
                case 1:
                    tabletInboxEmptyFragment = new TabletInboxEmptyFragment();
                    break;
                case 2:
                    if (bundle != null) {
                        serializable = bundle.getSerializable("key_enter_chat_params");
                    } else {
                        serializable = null;
                    }
                    if (serializable instanceof EnterChatParams) {
                        enterChatParams = (EnterChatParams) serializable;
                        if (enterChatParams != null) {
                            enterChatParams.setTabletOptimizationEnabled(true);
                        }
                    } else {
                        enterChatParams = null;
                    }
                    if (bundle != null) {
                        C786410Ut5.LJJIZ(bundle, "key_enter_chat_params", enterChatParams);
                    }
                    tabletInboxEmptyFragment = C1336205Ku.LIZ(false).getImChatService().LIZLLL(bundle);
                    if (tabletInboxEmptyFragment == null) {
                        return;
                    }
                    break;
                case 3:
                    tabletInboxEmptyFragment = new BulletinPageFragment();
                    if (bundle != null) {
                        bundle.putBoolean("hide_back_button", true);
                    }
                    tabletInboxEmptyFragment.setArguments(bundle);
                    break;
                case 4:
                    tabletInboxEmptyFragment = new NotificationContainerFragment();
                    tabletInboxEmptyFragment.setArguments(bundle);
                    break;
                case 5:
                    tabletInboxEmptyFragment = new InboxFollowerFragmentV2();
                    if (bundle == null) {
                        Bundle bundle2 = new Bundle();
                        bundle2.putBoolean("tablet_create_top_nav", true);
                        tabletInboxEmptyFragment.setArguments(bundle2);
                    } else {
                        bundle.putBoolean("tablet_create_top_nav", true);
                        tabletInboxEmptyFragment.setArguments(bundle);
                    }
                    break;
                case 6:
                    tabletInboxEmptyFragment = new SystemNotificationContainerFragment();
                    if (bundle == null) {
                        Bundle bundle3 = new Bundle();
                        bundle3.putBoolean("hide_back_button", true);
                        tabletInboxEmptyFragment.setArguments(bundle3);
                    } else {
                        bundle.putBoolean("hide_back_button", true);
                        tabletInboxEmptyFragment.setArguments(bundle);
                    }
                    break;
                default:
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("InboxScreenType is not supported: ");
                    sbLIZ2.append(enumC1903200zcs);
                    throw new UnsupportedOperationException(C2188811AlT.LIZIZ(sbLIZ2));
            }
            C19EH c19ehLJIIJ = ((InboxFragmentV2) aObserverS188S0200000_28.l0).getParentFragmentManager().LJIIJ();
            c19ehLJIIJ.LJIJ(R.id.kj4, tabletInboxEmptyFragment, null);
            c19ehLJIIJ.LJIIJ();
            C1890290zI3 c1890290zI3DS = ((InboxFragmentV2) aObserverS188S0200000_28.l0).dS();
            List<T> list = ((InboxFragmentV2) aObserverS188S0200000_28.l0).dS().LL.LJFF;
            InboxFragmentV2 inboxFragmentV2 = (InboxFragmentV2) aObserverS188S0200000_28.l0;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1891350zJl interfaceC1891350zJl = ((C1890270zI1) it2.next()).LIZ;
                TabletInboxViewModel tabletInboxViewModel2 = inboxFragmentV2.LLJZ;
                if (tabletInboxViewModel2 != null) {
                    zVQ2 = tabletInboxViewModel2.vQ2(interfaceC1891350zJl);
                } else {
                    zVQ2 = false;
                }
                arrayList.add(new C1890270zI1(interfaceC1891350zJl, zVQ2));
            }
            c1890290zI3DS.getClass();
            c1890290zI3DS.LLLII(arrayList, new ARunnableS97S0200000_28(c1890290zI3DS, arrayList, 30));
            c1890290zI3DS.LLILLL = false;
            if (c1902240zbK.LIZ != EnumC1903200zcs.CHAT || (viewFindViewById = ((View) aObserverS188S0200000_28.l1).findViewById(R.id.cax)) == null) {
                return;
            }
            InboxFragmentV2 inboxFragmentV22 = (InboxFragmentV2) aObserverS188S0200000_28.l0;
            ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49)) - C14KQ.LIZLLL(inboxFragmentV22.getContext());
                C786410Ut5.W5(viewFindViewById, layoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
    }

    public static final void onChanged$16(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        LinearLayoutManager linearLayoutManager;
        List<T> list = ((C20600915jL) obj).LIZ;
        C1901440za2 c1901440za2 = C1901440za2.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("liveData observe, jumpAfterLoadMore: ");
        c1901440za2.getClass();
        sbLIZ.append(C1901440za2.LJIIIIZZ);
        sbLIZ.append(", loadingIndex: ");
        sbLIZ.append(C1901440za2.LJIIIZ);
        sbLIZ.append(", data size: ");
        sbLIZ.append(list.size());
        C1901440za2.LJIIJ(C2188811AlT.LIZIZ(sbLIZ));
        if (C1901440za2.LJIIIZ > 0) {
            RecyclerView.LayoutManager layoutManager = ((ViewOnAttachStateChangeListenerC20604515jv) aObserverS188S0200000_28.l0).getLayoutManager();
            if ((layoutManager instanceof FixedLinearlayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
                Object objLJJJLZIJ = C13LP.LJJJLZIJ(C1901440za2.LJIIIZ, list);
                if (list.size() <= C1901440za2.LJIIIZ || (objLJJJLZIJ != null && !(objLJJJLZIJ instanceof C1273904yf))) {
                    C1901500za8 c1901500za8 = ((NotificationResultFragment) aObserverS188S0200000_28.l1).LLJILJIL;
                    if (c1901500za8 != null) {
                        c1901500za8.LIZ();
                    }
                    Object objLJJJLZIJ2 = C13LP.LJJJLZIJ(linearLayoutManager.findLastVisibleItemPosition(), list);
                    if (objLJJJLZIJ2 != null && C1901440za2.LJIIIIZZ && !(objLJJJLZIJ2 instanceof C1273904yf)) {
                        ((NotificationResultFragment) aObserverS188S0200000_28.l1).PR(false);
                    }
                }
            }
        }
    }

    public static final void onChanged$17(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        Integer num = (Integer) obj;
        if (num != null) {
            C10WS c10ws = (C10WS) aObserverS188S0200000_28.l0;
            PNSAgeGateContainerFragment pNSAgeGateContainerFragment = (PNSAgeGateContainerFragment) aObserverS188S0200000_28.l1;
            int iIntValue = num.intValue();
            c10ws.er(pNSAgeGateContainerFragment.requireContext().getResources().getQuantityString(2131755084, iIntValue, Integer.valueOf(iIntValue)));
        }
    }

    public static final void onChanged$18(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        int i;
        C19299010eq c19299010eqLJI;
        Date date;
        Date date2 = (Date) obj;
        PNSBaseAgeGateViewModel pNSBaseAgeGateViewModelPR = ((PNSAgeGateContainerFragment) aObserverS188S0200000_28.l0).PR();
        pNSBaseAgeGateViewModelPR.getClass();
        Calendar calendar = Calendar.getInstance();
        C10WT c10wt = pNSBaseAgeGateViewModelPR.LLILLL;
        if (c10wt != null && (c19299010eqLJI = c10wt.LJI()) != null && (date = c19299010eqLJI.defaultDate) != null) {
            calendar.setTime(date);
        }
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        if (calendar.get(2) != calendar2.get(2) || calendar.get(5) != calendar2.get(5)) {
            pNSBaseAgeGateViewModelPR.LLJL = false;
        }
        if (pNSBaseAgeGateViewModelPR.LLJJJJ == 0) {
            pNSBaseAgeGateViewModelPR.LLJJJJ = System.currentTimeMillis();
        }
        pNSBaseAgeGateViewModelPR.LLJJJ = date2;
        String str = null;
        pNSBaseAgeGateViewModelPR.LLJJJIL = null;
        MutableLiveData<Integer> mutableLiveData = pNSBaseAgeGateViewModelPR.LLJJIJIIJIL;
        Calendar calendar3 = Calendar.getInstance();
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        if (date2 == null) {
            i = -1;
        } else {
            gregorianCalendar.setTime(date2);
            i = calendar3.get(1) - gregorianCalendar.get(1);
            if (calendar3.get(2) != gregorianCalendar.get(2) ? calendar3.get(2) < gregorianCalendar.get(2) : calendar3.get(5) < gregorianCalendar.get(5)) {
                i--;
            }
        }
        mutableLiveData.postValue(Integer.valueOf(i));
        MutableLiveData<String> mutableLiveData2 = pNSBaseAgeGateViewModelPR.LLJJIJI;
        Date date3 = pNSBaseAgeGateViewModelPR.LLJJJ;
        if (date3 != null) {
            str = pNSBaseAgeGateViewModelPR.LLJIJIL.format(date3);
        }
        String str2 = "";
        if (str == null) {
            str = "";
        }
        mutableLiveData2.postValue(str);
        pNSBaseAgeGateViewModelPR.LLJJI.postValue(Boolean.TRUE);
        C10WS c10ws = (C10WS) aObserverS188S0200000_28.l1;
        String str3 = ((DateFormat) ((PNSAgeGateContainerFragment) aObserverS188S0200000_28.l0).LLJ.getValue()).format(date2);
        if (str3 != null) {
            str2 = str3;
        }
        c10ws.Kq(str2);
    }

    public static final void onChanged$19(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        boolean zLJFF;
        MutableLiveData<Boolean> mutableLiveData;
        Function1 function1 = (Function1) aObserverS188S0200000_28.l0;
        ((C1892600zLm) aObserverS188S0200000_28.l1).getClass();
        ((C1892600zLm) aObserverS188S0200000_28.l1).getClass();
        EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
        IIconSlot.SlotViewModel slotViewModel = ((C1892600zLm) aObserverS188S0200000_28.l1).LLJILJILJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null) {
            zLJFF = Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        function1.invoke(new C1892750zM1("local_service", enumC756810TmR, zLJFF));
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cf, code lost:
    
        if (((java.lang.System.currentTimeMillis() - r3) / 86400000) < 7) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e1, code lost:
    
        if ((!X.C1246790iY9.LIZ().getBoolean("dont_show_again", false)) != false) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void onChanged$2(Y.AObserverS188S0200000_28 r21, java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS188S0200000_28.onChanged$2(Y.AObserverS188S0200000_28, java.lang.Object):void");
    }

    public static final void onChanged$20(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        if (((Boolean) obj).booleanValue()) {
            View view = (View) aObserverS188S0200000_28.l0;
            HandlerHook.viewPost(view, new ARunnableS97S0200000_28((ViewPagerBottomSheetBehavior) aObserverS188S0200000_28.l1, view, 46));
        }
    }

    public static final void onChanged$21(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        boolean zLJFF;
        MutableLiveData<Boolean> mutableLiveData;
        Function1 function1 = (Function1) aObserverS188S0200000_28.l0;
        ((C21212117zj) aObserverS188S0200000_28.l1).getClass();
        ((C21212117zj) aObserverS188S0200000_28.l1).getClass();
        EnumC756810TmR enumC756810TmR = EnumC756810TmR.SLOT_LIVE_WATCHER_TOOLBAR;
        IIconSlot.SlotViewModel slotViewModel = ((C21212117zj) aObserverS188S0200000_28.l1).LLJ;
        if (slotViewModel != null && (mutableLiveData = slotViewModel.LLILZ) != null) {
            zLJFF = Intrinsics.LJFF(mutableLiveData.getValue(), Boolean.TRUE);
        } else {
            zLJFF = false;
        }
        function1.invoke(new C1892750zM1("ec_shop", enumC756810TmR, zLJFF));
    }

    public static final void onChanged$22(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        ((Function1) aObserverS188S0200000_28.l0).invoke(obj);
        NUJComponentFragment nUJComponentFragment = (NUJComponentFragment) aObserverS188S0200000_28.l1;
        nUJComponentFragment.getClass();
        ARunnableS128S0100000_28 aRunnableS128S0100000_28 = new ARunnableS128S0100000_28(nUJComponentFragment, 129);
        if (nUJComponentFragment.getActivity() != null) {
            aRunnableS128S0100000_28.run();
        } else {
            nUJComponentFragment.LLILLJJLI.add(aRunnableS128S0100000_28);
        }
    }

    public static final void onChanged$3(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        ((C1A4K) aObserverS188S0200000_28.l0).notifyDataSetChanged();
        ((AgeGateExistingStartFragment) aObserverS188S0200000_28.l1).WR().setCurrentItem(((AgeGateExistingStartFragment) aObserverS188S0200000_28.l1).WR().getCurrentItem() + ((Integer) obj).intValue());
    }

    public static final void onChanged$4(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        C11G4 c11g4;
        int i;
        Boolean bool = (Boolean) obj;
        C127M accessory = ((ContentPreferencesPage) aObserverS188S0200000_28.l0).ZR().getAccessory();
        if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
            Context context = (Context) aObserverS188S0200000_28.l1;
            if (bool.booleanValue()) {
                i = R.string.mf6;
            } else {
                i = 2131838683;
            }
            c11g4.LJIILJJIL(context.getString(i));
        }
    }

    public static final void onChanged$5(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        C11G4 c11g4;
        int i;
        Boolean bool = (Boolean) obj;
        C127M accessory = ((ContentPreferencesPage) aObserverS188S0200000_28.l0).aS().getAccessory();
        if ((accessory instanceof C11G4) && (c11g4 = (C11G4) accessory) != null) {
            Context context = (Context) aObserverS188S0200000_28.l1;
            if (bool.booleanValue()) {
                i = R.string.mf6;
            } else {
                i = 2131838683;
            }
            c11g4.LJIILJJIL(context.getString(i));
        }
    }

    public static final void onChanged$6(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        C1911040zpW c1911040zpW = (C1911040zpW) obj;
        ((C05P0) aObserverS188S0200000_28.l0).setValue(Boolean.valueOf(c1911040zpW.LJIIJ));
        ((C05P0) aObserverS188S0200000_28.l1).setValue(Boolean.valueOf(c1911040zpW.LJIILJJIL));
    }

    public static final void onChanged$7(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        if (((SingleLiveDataWrapper) aObserverS188S0200000_28.l0).flag.compareAndSet(true, false)) {
            ((Observer) aObserverS188S0200000_28.l1).onChanged(obj);
        }
    }

    public static final void onChanged$8(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        C19253210Ty c19253210Ty = (C19253210Ty) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UI Update: ");
        sbLIZ.append(c19253210Ty);
        C1911410zq7.LIZ("NujRevampSwipeUp", C2188811AlT.LIZIZ(sbLIZ));
        NujRevampSwipeUpComponent nujRevampSwipeUpComponent = (NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0;
        nujRevampSwipeUpComponent.getClass();
        if (c19253210Ty.LJI) {
            C10H5 c10h5 = C10H5.WELCOME_SCREEN_LOADING_SHOW;
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("ui_type", "guided_slide_up");
            C10SV.LIZ(c2344009Gk);
            Map<String, String> map = c2344009Gk.LIZ;
            C807840VmY.LIZ(map);
            C10SV.LIZIZ(c10h5, map);
        }
        if (c19253210Ty.LJII) {
            try {
                C2344009Gk c2344009Gk2 = new C2344009Gk();
                c2344009Gk2.LJIIIIZZ("exit_method", "auto");
                c2344009Gk2.LIZLLL(System.currentTimeMillis() - nujRevampSwipeUpComponent.LLJIJIL, "duration");
                C10H5 c10h52 = C10H5.WELCOME_SCREEN_LOADING_EXIT;
                c2344009Gk2.LJIIIIZZ("ui_type", "guided_slide_up");
                C10SV.LIZ(c2344009Gk2);
                Map<String, String> map2 = c2344009Gk2.LIZ;
                C807840VmY.LIZ(map2);
                C10SV.LIZIZ(c10h52, map2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c19253210Ty.LJIIIIZZ) {
            C10H5 c10h53 = C10H5.WELCOME_SCREEN_SHOW;
            C2344009Gk c2344009Gk3 = new C2344009Gk();
            c2344009Gk3.LJIIIIZZ("enter_from", nujRevampSwipeUpComponent.LLJILJIL);
            c2344009Gk3.LJIIIIZZ("user_type", (String) nujRevampSwipeUpComponent.LLJJIII.getValue());
            c2344009Gk3.LJIIIIZZ("ui_type", "guided_slide_up");
            C10SV.LIZ(c2344009Gk3);
            Map<String, String> map3 = c2344009Gk3.LIZ;
            C807840VmY.LIZ(map3);
            C10SV.LIZIZ(c10h53, map3);
        }
        if (c19253210Ty.LJIIIZ) {
            nujRevampSwipeUpComponent.bS("auto");
        }
        if (c19253210Ty.LIZLLL) {
            ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).WR();
            return;
        }
        ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).LLJJJJLIIL = c19253210Ty.LJ;
        int i = C10U1.LIZ[c19253210Ty.LIZIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).qS(c19253210Ty, 1500L);
                ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).oS().setText(c19253210Ty.LIZ);
                ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).rS(c19253210Ty.LIZJ);
            } else {
                ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).qS(c19253210Ty, 1500L);
                final NujRevampSwipeUpComponent nujRevampSwipeUpComponent2 = (NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0;
                final String str = c19253210Ty.LIZ;
                final TuxTextView tuxTextViewOS = nujRevampSwipeUpComponent2.oS();
                View viewFindViewById = nujRevampSwipeUpComponent2.LLJJJ;
                if (viewFindViewById == null) {
                    View view = nujRevampSwipeUpComponent2.getView();
                    if (view != null) {
                        viewFindViewById = view.findViewById(R.id.wsj);
                    } else {
                        viewFindViewById = null;
                    }
                    nujRevampSwipeUpComponent2.LLJJJ = (C1303280k1G) viewFindViewById;
                }
                C1911410zq7.LIZ("NujRevampSwipeUp", "slideAndFadeAnimation");
                float fLIZJ = C12ES.LIZJ(50.0f, tuxTextViewOS.getContext());
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(tuxTextViewOS, "translationY", 0.0f, -fLIZJ);
                objectAnimatorOfFloat.setDuration(700L);
                objectAnimatorOfFloat.setInterpolator(new AccelerateInterpolator(3.0f));
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(tuxTextViewOS, "translationY", fLIZJ, 0.0f);
                objectAnimatorOfFloat2.setDuration(700L);
                objectAnimatorOfFloat2.setInterpolator(C1619980sG4.LJIIJ());
                objectAnimatorOfFloat2.addListener(new Animator.AnimatorListener() { // from class: X.10U2
                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                    }

                    @Override // android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        tuxTextViewOS.setText(str);
                        nujRevampSwipeUpComponent2.rS(true);
                    }
                });
                ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(viewFindViewById, "translationY", fLIZJ, 0.0f);
                objectAnimatorOfFloat3.setDuration(700L);
                objectAnimatorOfFloat3.setInterpolator(C1619980sG4.LJIIJ());
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfFloat2).after(objectAnimatorOfFloat);
                animatorSet.playTogether(objectAnimatorOfFloat2, objectAnimatorOfFloat3);
                animatorSet.start();
                nujRevampSwipeUpComponent2.LLJJJJ = animatorSet;
            }
        } else {
            C1303280k1G c1303280k1GNS = ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).nS();
            c1303280k1GNS.setAnimation("ug_nuj_swipeupwithdevice_tux_lottie.json");
            c1303280k1GNS.setRepeatMode(1);
            c1303280k1GNS.setRepeatCount(-1);
            c1303280k1GNS.playAnimation();
            ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).oS().setText(c19253210Ty.LIZ);
            ((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0).rS(c19253210Ty.LIZJ);
        }
        if (!c19253210Ty.LJIIJ) {
            return;
        }
        HandlerHook.viewPostDelay((View) aObserverS188S0200000_28.l1, new ARunnableS128S0100000_28((NujRevampSwipeUpComponent) aObserverS188S0200000_28.l0, 43), 800L);
    }

    public static final void onChanged$9(AObserverS188S0200000_28 aObserverS188S0200000_28, Object obj) {
        List listLLIIII = C13LP.LLIIII(((Map) obj).values());
        EnumC19241510Pl enumC19241510Pl = (EnumC19241510Pl) aObserverS188S0200000_28.l0;
        for (Object obj2 : listLLIIII) {
            C10SX c10sx = (C10SX) obj2;
            if (enumC19241510Pl == c10sx.LIZ && Intrinsics.LJFF(c10sx.LIZIZ.showConfig.shouldShow, Boolean.TRUE)) {
                if (obj2 != null) {
                    ((Observer) aObserverS188S0200000_28.l1).onChanged(obj2);
                    return;
                }
                return;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AObserverS188S0200000_28(X.C10WS r2, com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment r3, int r4) {
        /*
            r1 = this;
            r1.$t = r4
            int r4 = 17 - r4
            if (r4 == 0) goto Lf
            r0 = r1
            r0.l0 = r3
            r0.l1 = r2
        Lb:
            r0.<init>()
            return
        Lf:
            r0 = r1
            r0.l0 = r2
            r0.l1 = r3
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AObserverS188S0200000_28.<init>(X.10WS, com.ss.android.ugc.aweme.pns.agegate.ui.view.PNSAgeGateContainerFragment, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AObserverS188S0200000_28(Object obj, View view, ViewPagerBottomSheetBehavior<View> viewPagerBottomSheetBehavior) {
        this.$t = viewPagerBottomSheetBehavior;
        this.l0 = obj;
        this.l1 = view;
    }
}
