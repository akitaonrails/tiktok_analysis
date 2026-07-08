package X;

import Y.ARunnableS102S0100000_2;
import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel;
import com.ss.android.ugc.aweme.detailpage.manageadmin.viewmodel.ManageAdminViewModel;
import com.ss.android.ugc.aweme.group.MockedConvVM;
import com.ss.android.ugc.aweme.im.chatroom.api.model.EnterChatParams;
import com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.group.GroupChatVM;
import com.ss.android.ugc.aweme.im.service.analytics.IIMErrorUtils;
import com.ss.android.ugc.aweme.live.reminder.TurnOnGoLiveBannerGuideCardAssem;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: renamed from: X.06wN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1769306wN implements InterfaceC863600XuI {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$4(C1769306wN c1769306wN, C0YMW c0ymw) {
    }

    public static final void LIZIZ$9(C1769306wN c1769306wN, C0YMW c0ymw) {
    }

    @Override // X.InterfaceC863600XuI
    public final void LIZIZ(C0YMW c0ymw) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, c0ymw);
                break;
            case 1:
                LIZIZ$1(this, c0ymw);
                break;
            case 2:
                LIZIZ$2(this, c0ymw);
                break;
            case 3:
                LIZIZ$3(this, c0ymw);
                break;
            case 4:
                LIZIZ$4(this, c0ymw);
                break;
            case 5:
                LIZIZ$5(this, c0ymw);
                break;
            case 6:
                LIZIZ$6(this, c0ymw);
                break;
            case 7:
                LIZIZ$7(this, c0ymw);
                break;
            case 8:
                LIZIZ$8(this, c0ymw);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                LIZIZ$9(this, c0ymw);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                LIZIZ$10(this, c0ymw);
                break;
        }
    }

    @Override // X.InterfaceC863600XuI
    public final void onSuccess(Object obj) {
        switch (this.$t) {
            case 0:
                onSuccess$0(this, obj);
                break;
            case 1:
                onSuccess$1(this, obj);
                break;
            case 2:
                onSuccess$2(this, obj);
                break;
            case 3:
                onSuccess$3(this, obj);
                break;
            case 4:
                onSuccess$4(this, obj);
                break;
            case 5:
                onSuccess$5(this, obj);
                break;
            case 6:
                onSuccess$6(this, obj);
                break;
            case 7:
                onSuccess$7(this, obj);
                break;
            case 8:
                onSuccess$8(this, obj);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onSuccess$9(this, obj);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onSuccess$10(this, obj);
                break;
        }
    }

    public C1769306wN(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C1769306wN c1769306wN, C0YMW c0ymw) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("enterGroupChat fetch conversation info error = ");
        sbLIZ.append(c0ymw);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ$1(C1769306wN c1769306wN, C0YMW c0ymw) {
        ((MockedConvVM) c1769306wN.l0).setState(AFwS229S0000000_2.get$arr$(35));
    }

    public static final void LIZIZ$10(C1769306wN c1769306wN, C0YMW c0ymw) {
        if (((InterfaceC20236714Gf) c1769306wN.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769306wN.l0;
            C189200o6.m2constructorimpl(null);
            interfaceC20236714Gf.resumeWith(null);
        }
    }

    public static final void LIZIZ$2(C1769306wN c1769306wN, C0YMW c0ymw) {
        Activity activityLIZIZ;
        Context context = ((TurnOnGoLiveBannerGuideCardAssem) c1769306wN.l0).getContext();
        if (context != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
            c1389890mGx.LJIIIZ(2131828141);
            c1389890mGx.LJFF(R.raw.icon_exclamation_mark_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
        }
    }

    public static final void LIZIZ$3(C1769306wN c1769306wN, C0YMW c0ymw) {
        String conversationId;
        Integer numValueOf;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GroupChatNoticeViewModel deleteConversation ");
        C913140Zs0 c913140Zs0WQ2 = ((GroupChatNoticeViewModel) c1769306wN.l0).wQ2();
        String statusMsg = null;
        if (c913140Zs0WQ2 != null) {
            conversationId = c913140Zs0WQ2.getConversationId();
        } else {
            conversationId = null;
        }
        sbLIZ.append(conversationId);
        sbLIZ.append(" fail ,");
        if (c0ymw != null) {
            numValueOf = Integer.valueOf(c0ymw.getCode());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", ");
        if (c0ymw != null) {
            statusMsg = c0ymw.getStatusMsg();
        }
        sbLIZ.append(statusMsg);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final void LIZIZ$5(C1769306wN c1769306wN, C0YMW c0ymw) {
        String checkMsg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to fetch conversation ");
        if (c0ymw != null) {
            checkMsg = c0ymw.getCheckMsg();
        } else {
            checkMsg = null;
        }
        sbLIZ.append(checkMsg);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0ymw != null) {
            c0ymw.getThrowable();
        }
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769306wN.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC20236714Gf.resumeWith(null);
    }

    public static final void LIZIZ$6(C1769306wN c1769306wN, C0YMW c0ymw) {
        String checkMsg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to fetch conversation ");
        if (c0ymw != null) {
            checkMsg = c0ymw.getCheckMsg();
        } else {
            checkMsg = null;
        }
        sbLIZ.append(checkMsg);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0ymw != null) {
            c0ymw.getThrowable();
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1769306wN.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void LIZIZ$7(C1769306wN c1769306wN, C0YMW c0ymw) {
        String checkMsg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("failed to fetch conversation ");
        if (c0ymw != null) {
            checkMsg = c0ymw.getCheckMsg();
        } else {
            checkMsg = null;
        }
        sbLIZ.append(checkMsg);
        C2188811AlT.LIZIZ(sbLIZ);
        if (c0ymw != null) {
            c0ymw.getThrowable();
        }
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1769306wN.l0;
        C189200o6.m2constructorimpl(null);
        interfaceC1364105Vn.resumeWith(null);
    }

    public static final void LIZIZ$8(C1769306wN c1769306wN, C0YMW c0ymw) {
        IIMErrorUtils.LIZ.getClass();
        IIMErrorUtils iIMErrorUtilsLIZ = C903320ZcA.LIZ();
        if (iIMErrorUtilsLIZ != null) {
            C0I0B.LJFF.LIZJ();
            iIMErrorUtilsLIZ.LIZLLL(C894660Z7w.LIZ(), c0ymw);
        }
    }

    public static final void onSuccess$0(C1769306wN c1769306wN, Object obj) {
        C1481605r4.LIZIZ(new ARunnableS102S0100000_2((EnterChatParams) c1769306wN.l0, 0));
    }

    public static final void onSuccess$1(C1769306wN c1769306wN, Object obj) {
        ((MockedConvVM) c1769306wN.l0).setState(AFwS229S0000000_2.get$arr$(36));
    }

    public static final void onSuccess$10(C1769306wN c1769306wN, Object obj) {
        if (((InterfaceC20236714Gf) c1769306wN.l0).isActive()) {
            InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769306wN.l0;
            C189200o6.m2constructorimpl(obj);
            interfaceC20236714Gf.resumeWith(obj);
        }
    }

    public static final void onSuccess$2(C1769306wN c1769306wN, Object obj) {
        Activity activityLIZIZ;
        String string;
        ((TurnOnGoLiveBannerGuideCardAssem) c1769306wN.l0).getClass();
        String strLIZIZ = C461720I8s.LIZIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("turn_on_go_live_notification_guide_card_repo_");
        sbLIZ.append(C461720I8s.LIZIZ());
        Keva repo = Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("has_consumed_turn_on_go_live_notification_guide_card_");
        sbLIZ2.append(strLIZIZ);
        repo.storeBoolean(C2188811AlT.LIZIZ(sbLIZ2), true);
        ((TurnOnGoLiveBannerGuideCardAssem) c1769306wN.l0).op();
        Context context = ((TurnOnGoLiveBannerGuideCardAssem) c1769306wN.l0).getContext();
        if (context != null && (activityLIZIZ = C737910Sx3.LIZIZ(context)) != null) {
            TurnOnGoLiveBannerGuideCardAssem turnOnGoLiveBannerGuideCardAssem = (TurnOnGoLiveBannerGuideCardAssem) c1769306wN.l0;
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZIZ);
            Context context2 = turnOnGoLiveBannerGuideCardAssem.getContext();
            if (context2 != null) {
                string = context2.getString(2131847340);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJJI();
        }
        TurnOnGoLiveBannerGuideCardAssem turnOnGoLiveBannerGuideCardAssem2 = (TurnOnGoLiveBannerGuideCardAssem) c1769306wN.l0;
        turnOnGoLiveBannerGuideCardAssem2.getClass();
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(turnOnGoLiveBannerGuideCardAssem2), C0PEM.LIZJ, null, new C1709806mm(turnOnGoLiveBannerGuideCardAssem2, "turn_on", null), 2);
    }

    public static final void onSuccess$4(C1769306wN c1769306wN, Object obj) {
        C0Y8T c0y8t = (C0Y8T) obj;
        if (c0y8t != null) {
            GroupChatVM groupChatVM = (GroupChatVM) c1769306wN.l0;
            groupChatVM.getClass();
            groupChatVM.setState(new AwS581S0100000_2(c0y8t, 592));
            ((GroupChatVM) c1769306wN.l0).zQ2();
        }
    }

    public static final void onSuccess$5(C1769306wN c1769306wN, Object obj) {
        InterfaceC20236714Gf interfaceC20236714Gf = (InterfaceC20236714Gf) c1769306wN.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC20236714Gf.resumeWith(obj);
    }

    public static final void onSuccess$6(C1769306wN c1769306wN, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1769306wN.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }

    public static final void onSuccess$7(C1769306wN c1769306wN, Object obj) {
        InterfaceC1364105Vn interfaceC1364105Vn = (InterfaceC1364105Vn) c1769306wN.l0;
        C189200o6.m2constructorimpl(obj);
        interfaceC1364105Vn.resumeWith(obj);
    }

    public static final void onSuccess$8(C1769306wN c1769306wN, Object obj) {
        C23250099c.LIZLLL(((ManageAdminViewModel) c1769306wN.l0).getAssemVMScope(), C0PEM.LIZJ, null, new C1219530hqB((List) obj, (ManageAdminViewModel) c1769306wN.l0, null), 2);
    }

    public static final void onSuccess$9(C1769306wN c1769306wN, Object obj) {
        List list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(String.valueOf(((C0YAE) it2.next()).getUid()));
            }
            C23250099c.LIZLLL(C2296808zG.LIZ(((AbstractC2252651DEx) c1769306wN.l0).plus(new AnonymousClass0204(CoroutineExceptionHandler.LJJLIL, 15))), null, null, new C05L3(arrayList, null), 3);
        }
    }

    public static final /* bridge */ /* synthetic */ void onSuccess$3(C1769306wN c1769306wN, Object obj) {
    }
}
