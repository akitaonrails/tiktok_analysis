package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.actionhandler.IActionHandlerService;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubscriptionQuestionnaireHourFrequencySetting;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.exp.DMInboxChangeRightZoneClickableSizeExp;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0208, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public class AnonymousClass0208 extends C09AY implements Function2 {
    public static final /* synthetic */ AtomicReferenceArray arr$ = new AtomicReferenceArray(82);
    public final int $t;

    public static AnonymousClass0208 get$arr$(int i) {
        AnonymousClass0208 anonymousClass0208 = (AnonymousClass0208) arr$.get(i);
        if (anonymousClass0208 != null) {
            return anonymousClass0208;
        }
        arr$.compareAndSet(i, null, new AnonymousClass0208(i));
        return (AnonymousClass0208) arr$.get(i);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$t) {
            case 0:
                return invoke$0(this, obj, obj2);
            case 1:
                return invoke$1(this, obj, obj2);
            case 2:
                return invoke$2(this, obj, obj2);
            case 3:
                return invoke$3(this, obj, obj2);
            case 4:
                return invoke$4(this, obj, obj2);
            case 5:
                return invoke$5(this, obj, obj2);
            case 6:
                return invoke$6(this, obj, obj2);
            case 7:
                return invoke$7(this, obj, obj2);
            case 8:
                return invoke$8(this, obj, obj2);
            case BdTuring.TYPE_ECAF /* 9 */:
                return invoke$9(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                return invoke$10(this, obj, obj2);
            case BdTuring.TYPE_EMAIL /* 11 */:
                return invoke$11(this, obj, obj2);
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                return invoke$12(this, obj, obj2);
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                return invoke$13(this, obj, obj2);
            case 14:
                return invoke$14(this, obj, obj2);
            case 15:
                return invoke$15(this, obj, obj2);
            case 16:
                return invoke$16(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                return invoke$17(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                return invoke$18(this, obj, obj2);
            case 19:
                return invoke$19(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                return invoke$20(this, obj, obj2);
            case 21:
                return invoke$21(this, obj, obj2);
            case 22:
                return invoke$22(this, obj, obj2);
            case 23:
                return invoke$23(this, obj, obj2);
            case LiveSubscriptionQuestionnaireHourFrequencySetting.DEFAULT /* 24 */:
                return invoke$24(this, obj, obj2);
            case 25:
                return invoke$25(this, obj, obj2);
            case 26:
                return invoke$26(this, obj, obj2);
            case 27:
                return invoke$27(this, obj, obj2);
            case 28:
                return invoke$28(this, obj, obj2);
            case 29:
                return invoke$29(this, obj, obj2);
            case 30:
                return invoke$30(this, obj, obj2);
            case 31:
                return invoke$31(this, obj, obj2);
            case 32:
                return invoke$32(this, obj, obj2);
            case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                return invoke$33(this, obj, obj2);
            case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                return invoke$34(this, obj, obj2);
            case 35:
                return invoke$35(this, obj, obj2);
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                return invoke$36(this, obj, obj2);
            case 37:
                return invoke$37(this, obj, obj2);
            case 38:
                return invoke$38(this, obj, obj2);
            case 39:
                return invoke$39(this, obj, obj2);
            case 40:
                return invoke$40(this, obj, obj2);
            case 41:
                return invoke$41(this, obj, obj2);
            case 42:
                return invoke$42(this, obj, obj2);
            case 43:
                return invoke$43(this, obj, obj2);
            case 44:
                return invoke$44(this, obj, obj2);
            case 45:
                return invoke$45(this, obj, obj2);
            case 46:
                return invoke$46(this, obj, obj2);
            case 47:
                return invoke$47(this, obj, obj2);
            case 48:
                return invoke$48(this, obj, obj2);
            case 49:
                return invoke$49(this, obj, obj2);
            case BaseNotice.RECOMMEND_LIVE /* 50 */:
                return invoke$50(this, obj, obj2);
            case 51:
                return invoke$51(this, obj, obj2);
            case 52:
                return invoke$52(this, obj, obj2);
            case 53:
                return invoke$53(this, obj, obj2);
            case 54:
                return invoke$54(this, obj, obj2);
            case 55:
                return invoke$55(this, obj, obj2);
            case 56:
                return invoke$56(this, obj, obj2);
            case 57:
                return invoke$57(this, obj, obj2);
            case 58:
                return invoke$58(this, obj, obj2);
            case 59:
                return invoke$59(this, obj, obj2);
            case 60:
                return invoke$60(this, obj, obj2);
            case 61:
                return invoke$61(this, obj, obj2);
            case BaseNotice.CREATOR /* 62 */:
                return invoke$62(this, obj, obj2);
            case 63:
                return invoke$63(this, obj, obj2);
            case 64:
                return invoke$64(this, obj, obj2);
            case 65:
                return invoke$65(this, obj, obj2);
            case 66:
                return invoke$66(this, obj, obj2);
            case 67:
                return invoke$67(this, obj, obj2);
            case 68:
                return invoke$68(this, obj, obj2);
            case 69:
                return invoke$69(this, obj, obj2);
            case 70:
                return invoke$70(this, obj, obj2);
            case 71:
                return invoke$71(this, obj, obj2);
            case DMInboxChangeRightZoneClickableSizeExp.NEW_DP_SIZE /* 72 */:
                return invoke$72(this, obj, obj2);
            case 73:
                return invoke$73(this, obj, obj2);
            case 74:
                return invoke$74(this, obj, obj2);
            case 75:
                return invoke$75(this, obj, obj2);
            case 76:
                return invoke$76(this, obj, obj2);
            case 77:
                return invoke$77(this, obj, obj2);
            case 78:
                return invoke$78(this, obj, obj2);
            case 79:
                return invoke$79(this, obj, obj2);
            case 80:
                return invoke$80(this, obj, obj2);
            case 81:
                return invoke$81(this, obj, obj2);
            default:
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0208(int i) {
        super(2);
        this.$t = i;
    }

    public static final Object invoke$0(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Fragment fragmentLJI;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (((C291001Au) obj2).LIZ() != null && (fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(fragmentLJI);
            c1389890mGx.LJIIIZ(2131828054);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$1(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$10(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        return Boolean.TRUE;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$11(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Boolean) obj).booleanValue();
        ((Number) obj2).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$12(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        boolean z;
        if (obj.getClass() == obj2.getClass()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$13(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        String str = (String) obj2;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse((String) obj), "url");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        try {
            c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj3 = c098200Yq2;
        }
        return Boolean.valueOf(u.LJIJI(str2, (String) obj3, false));
    }

    public static final Object invoke$14(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) obj, (Uri) obj2));
    }

    public static final Object invoke$15(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(((IActionHandlerService) C1161920gLG.LIZJ(IActionHandlerService.class)).handle((Context) obj, (Uri) obj2));
    }

    public static final Object invoke$16(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return ((Uri) obj).getAuthority();
    }

    public static final Object invoke$17(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return ((Uri) obj).getPath();
    }

    public static final Object invoke$18(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return ((Uri) obj).getPathSegments();
    }

    public static final Object invoke$19(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get("__PATH__");
        str = null;
        if (obj3 != null && (obj3 instanceof String) && (str = (String) obj3) != null) {
            for (String str2 : a0.LJJLIIIJILLIZJL(str, new String[]{File.separator}, 0, 6)) {
                if (!a0.LJJJIL(str2)) {
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return str2;
    }

    public static final /* bridge */ /* synthetic */ Object invoke$2(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Number) obj).intValue();
        return Unit.LIZ;
    }

    public static final Object invoke$20(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        List<String> pathSegments = ((Uri) obj).getPathSegments();
        if (pathSegments == null) {
            return null;
        }
        return C13LP.LJJJLL(pathSegments);
    }

    public static final Object invoke$21(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        String str;
        Object obj3 = ((Map) obj).get("__PATH__");
        String str2 = null;
        if (obj3 != null && (obj3 instanceof String) && (str = (String) obj3) != null) {
            List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{File.separator}, 0, 6);
            ListIterator listIterator = listLJJLIIIJILLIZJL.listIterator(listLJJLIIIJILLIZJL.size());
            while (listIterator.hasPrevious()) {
                str2 = (String) listIterator.previous();
                if (!a0.LJJJIL(str2)) {
                }
            }
            throw new NoSuchElementException("List contains no element matching the predicate.");
        }
        return str2;
    }

    public static final Object invoke$22(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        List<String> pathSegments = ((Uri) obj).getPathSegments();
        if (pathSegments == null) {
            return null;
        }
        return C13LP.LJJLIIIJL(pathSegments);
    }

    public static final Object invoke$23(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        HandlerHook.viewPostDelay(uIAssem.LJJIJL(), new RunnableC514501zT(uIAssem, (C291001Au) obj2, 18), 50L);
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$24(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        int i;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue()) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        return Unit.LIZ;
    }

    public static final Object invoke$25(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((ViewOnAttachStateChangeListenerC20604515jv) ((UIAssem) obj).LJJIJL().findViewById(R.id.qjt)).getState().LJIILL((Collection) obj2, null);
        return Unit.LIZ;
    }

    public static final Object invoke$26(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        View viewLJJIJL;
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        UIAssem uIAssem = (UIAssem) obj;
        List list = (List) obj2;
        if (!list.isEmpty() && (viewLJJIJL = uIAssem.LJJIJL()) != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.ald)) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(list, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$27(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        View viewFindViewById;
        View viewFindViewById2;
        UIAssem uIAssem = (UIAssem) obj;
        View viewFindViewById3 = null;
        if (((Boolean) obj2).booleanValue()) {
            View viewLJJIJL = uIAssem.LJJIJL();
            if (viewLJJIJL != null) {
                viewFindViewById2 = viewLJJIJL.findViewById(R.id.nnp);
            } else {
                viewFindViewById2 = null;
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById2);
            View viewLJJIJL2 = uIAssem.LJJIJL();
            if (viewLJJIJL2 != null) {
                viewFindViewById3 = viewLJJIJL2.findViewById(R.id.pyd);
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById3);
        } else {
            View viewLJJIJL3 = uIAssem.LJJIJL();
            if (viewLJJIJL3 != null) {
                viewFindViewById = viewLJJIJL3.findViewById(R.id.nnp);
            } else {
                viewFindViewById = null;
            }
            C786410Ut5.LJLLLLLL(8, viewFindViewById);
            View viewLJJIJL4 = uIAssem.LJJIJL();
            if (viewLJJIJL4 != null) {
                viewFindViewById3 = viewLJJIJL4.findViewById(R.id.pyd);
            }
            C786410Ut5.LJLLLLLL(0, viewFindViewById3);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$28(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            ((Number) c291001Au.LIZ).intValue();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$29(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIJ(uIAssem.LJJIJL().getContext().getString(2131848367));
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$3(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((AccessibilityNodeInfoCompat) obj2).setClassName(Button.class.getName());
        return Unit.LIZ;
    }

    public static final Object invoke$30(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ() != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIJ(uIAssem.LJJIJL().getContext().getString(2131848367));
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$31(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        boolean z;
        if (((Number) obj).doubleValue() >= ((Number) obj2).doubleValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$32(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        boolean z;
        if (((Number) obj).doubleValue() <= ((Number) obj2).doubleValue()) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static /* bridge */ /* synthetic */ Object invoke$33(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        int i;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (zBooleanValue) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LJLLLLLL(i, viewLJJIJL);
        return Unit.LIZ;
    }

    public static final Object invoke$34(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C20684815ws.LJIJ((String) obj, (JSONObject) obj2);
        return Unit.LIZ;
    }

    public static final Object invoke$35(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (Intrinsics.LJFF(map.get(FollowStatusChangeMethod.PARAM_UID), map2.get(FollowStatusChangeMethod.PARAM_UID)) && !Intrinsics.LJFF(map.get(FollowStatusChangeMethod.PARAM_UID), "")) {
            return map2;
        }
        return null;
    }

    public static final Object invoke$36(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (Intrinsics.LJFF(map.get(FollowStatusChangeMethod.PARAM_UID), map2.get(FollowStatusChangeMethod.PARAM_UID)) && !Intrinsics.LJFF(map.get(FollowStatusChangeMethod.PARAM_UID), "")) {
            return map2;
        }
        return null;
    }

    public static final Object invoke$37(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Function1) obj2).invoke(Integer.valueOf(Math.max(((Number) ((Function0) obj).invoke()).intValue() - 1, 0)));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* bridge */ /* synthetic */ Object invoke$38(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            Boolean.valueOf(((Boolean) c291001Au.LIZ).booleanValue()).booleanValue();
            C786410Ut5.LJLLLLLL(0, uIAssem.LJJIJL());
        }
        return Unit.LIZ;
    }

    public static final Object invoke$39(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((HashMap) obj2).put("enter_from", "chat");
        return Boolean.TRUE;
    }

    public static final Object invoke$4(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C442001nm c442001nm;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (c442001nm = (C442001nm) c291001Au.LIZ()) != null) {
            String str = c442001nm.LIZ;
            if (c442001nm.LIZIZ) {
                C1906580ziK.LIZJ().LJIIJ().LJLIIL(1L).LJJLJLI(new C515701zf(str, 4));
            } else {
                C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
                if (c19egLIZ != null && !c19egLIZ.isFinishing() && !c19egLIZ.isDestroyed()) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                    c1389890mGx.LJIIJ(str);
                    c1389890mGx.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$40(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        Collection collection = (Collection) obj2;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null) {
            viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.qjt);
        } else {
            viewOnAttachStateChangeListenerC20604515jv = null;
        }
        viewOnAttachStateChangeListenerC20604515jv.getState().LJIILL(collection, null);
        return Unit.LIZ;
    }

    public static final Object invoke$41(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        String str = (String) obj2;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse((String) obj), "url");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        try {
            c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj3 = c098200Yq2;
        }
        return Boolean.valueOf(u.LJIJI(str2, (String) obj3, false));
    }

    public static final Object invoke$42(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String str = (String) obj2;
        if (str != null && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$43(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str.length() != 0 && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[gear_center] ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$44(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        String str = (String) ((C291001Au) obj2).LIZ();
        if (str != null && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$45(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        if (((Boolean) ((C291001Au) obj2).LIZ).booleanValue() && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$46(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        BaseResponse baseResponse;
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (baseResponse = (BaseResponse) c291001Au.LIZ) != null && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ(baseResponse.status_msg);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$47(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (((CharSequence) c291001Au.LIZ).length() != 0 && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJFF(R.raw.icon_tick_circle_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJ((CharSequence) c291001Au.LIZ);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$48(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C19EG c19egLIZ;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (((CharSequence) c291001Au.LIZ).length() != 0 && (c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ((CharSequence) c291001Au.LIZ);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$49(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C01CL.LIZ((String) obj), C01CL.LIZ((String) obj2)));
    }

    public static final Object invoke$5(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        boolean z;
        ((Number) obj).floatValue();
        if (((Number) obj2).floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$50(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && c291001Au.LIZ() != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIIZ(2131836755);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$51(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        String string;
        UIAssem uIAssem = (UIAssem) obj;
        if (obj2 != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            Context context = uIAssem.getContext();
            if (context != null) {
                string = context.getString(2131834313);
            } else {
                string = null;
            }
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$52(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view = (View) obj;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            marginLayoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
            C786410Ut5.W5(view, marginLayoutParams);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$53(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    public static final Object invoke$54(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(C01CL.LIZ((String) obj), C01CL.LIZ((String) obj2)));
    }

    public static final Object invoke$55(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        View view = (View) obj;
        if (view != null) {
            C948503nH.LIZLLL(view, C0PEM.LIZ, new C320801Mg(view, null));
        }
        return Unit.LIZ;
    }

    public static final Object invoke$56(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Integer num;
        UIAssem uIAssem = (UIAssem) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null && (num = (Integer) c291001Au.LIZ()) != null) {
            int iIntValue = num.intValue();
            C1389890mGx c1389890mGx = new C1389890mGx(uIAssem.LJJIJL());
            c1389890mGx.LJIIIZ(iIntValue);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$57(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        String str = (String) obj2;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse((String) obj), "url");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str2 = (String) c098200Yq;
        try {
            c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "url");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq2)) {
            obj3 = c098200Yq2;
        }
        return Boolean.valueOf(u.LJIJI(str2, (String) obj3, false));
    }

    public static final Object invoke$58(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        C19EG c19egLIZ = C724240Sb0.LIZ((AbstractC738140SxQ) obj);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ((CharSequence) c291001Au.LIZ());
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$59(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        C19EG c19egLIZ = C724240Sb0.LIZ((AbstractC738140SxQ) obj);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJFF(R.raw.icon_arrow_clockwise_fill);
            c1389890mGx.LJII(R.attr.a1h);
            c1389890mGx.LJIIJ((CharSequence) c291001Au.LIZ);
            c1389890mGx.LJIIJJI();
        }
        return Unit.LIZ;
    }

    public static final Object invoke$6(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        ((Number) obj2).floatValue();
        return Boolean.TRUE;
    }

    public static final Object invoke$60(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C291001Au c291001Au = (C291001Au) obj2;
        C19EG c19egLIZ = C724240Sb0.LIZ((AbstractC738140SxQ) obj);
        if (c19egLIZ != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
            c1389890mGx.LJIIJ((CharSequence) c291001Au.LIZ());
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
            C2204961BRm.LLJJJ(c19egLIZ, 6666, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO6td57H0CL/+Jna8RRdcx55PC1r6GCR9gd9aWSaDaIZSlBRTHOH9zOnJJ/gOZfz+Wo=", null));
            c19egLIZ.finish();
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object invoke$61(X.AnonymousClass0208 r1, java.lang.Object r2, java.lang.Object r3) {
        /*
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r3)
            if (r0 != 0) goto L17
            r1 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r2, r3, r1)
            if (r0 != 0) goto L17
            boolean r0 = kotlin.text.a0.LJJIIZI(r3, r2, r1)
            if (r0 == 0) goto L18
        L17:
            r1 = 1
        L18:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0208.invoke$61(X.0208, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static final Object invoke$62(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }

    public static final Object invoke$63(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ViewOnAttachStateChangeListenerC20604515jv viewOnAttachStateChangeListenerC20604515jv;
        C20600815jK<InterfaceC1891350zJl> state;
        Collection collection = (Collection) obj2;
        View viewLJJIJL = ((UIAssem) obj).LJJIJL();
        if (viewLJJIJL != null && (viewOnAttachStateChangeListenerC20604515jv = (ViewOnAttachStateChangeListenerC20604515jv) viewLJJIJL.findViewById(R.id.rmx)) != null && (state = viewOnAttachStateChangeListenerC20604515jv.getState()) != null) {
            state.LJIILL(collection, null);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$64(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Violation report error: ");
        sbLIZ.append(obj2);
        C1720106oR.LIZ("minis-ReportActivity", C2188811AlT.LIZIZ(sbLIZ));
        return Unit.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$65(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        DialogFragment dialogFragment;
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            Boolean.valueOf(((Boolean) c291001Au.LIZ).booleanValue()).booleanValue();
            Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
            if ((fragmentLJI instanceof DialogFragment) && (dialogFragment = (DialogFragment) fragmentLJI) != null) {
                dialogFragment.dismissAllowingStateLoss();
            }
        }
        return Unit.LIZ;
    }

    public static final Object invoke$66(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C426750GoL.LJIIIZ((View) obj2, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), null, Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4))), false, 20);
        return Unit.LIZ;
    }

    public static final Object invoke$67(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Function1) obj2).invoke(Integer.valueOf(Math.max(((Number) ((Function0) obj).invoke()).intValue() - 1, 0)));
        return Unit.LIZ;
    }

    public static final Object invoke$68(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        String str = (String) obj;
        String str2 = (String) obj2;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "source");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        try {
            c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "promote_by");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str4 = (String) c098200Yq2;
        try {
            c098200Yq3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "source");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        String str5 = (String) c098200Yq3;
        try {
            c098200Yq4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "promote_by");
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq4)) {
            obj3 = c098200Yq4;
        }
        String str6 = (String) obj3;
        boolean z = false;
        if (u.LJIJI(str3, str5, false) && u.LJIJI(str4, str6, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final Object invoke$69(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        Object c098200Yq;
        Object c098200Yq2;
        Object c098200Yq3;
        Object c098200Yq4;
        Object c098200Yq5;
        Object c098200Yq6;
        String str = (String) obj;
        String str2 = (String) obj2;
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "source");
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Object obj3 = null;
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        try {
            c098200Yq2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "promote_by");
            C189200o6.m2constructorimpl(c098200Yq2);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq2 = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq2);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq2)) {
            c098200Yq2 = null;
        }
        String str4 = (String) c098200Yq2;
        try {
            c098200Yq3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "source");
            C189200o6.m2constructorimpl(c098200Yq3);
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            c098200Yq3 = new C098200Yq(th3);
            C189200o6.m2constructorimpl(c098200Yq3);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq3)) {
            c098200Yq3 = null;
        }
        String str5 = (String) c098200Yq3;
        try {
            c098200Yq4 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "promote_by");
            C189200o6.m2constructorimpl(c098200Yq4);
        } catch (Throwable th4) {
            TryCatchGuardChecker.doCheck(th4);
            c098200Yq4 = new C098200Yq(th4);
            C189200o6.m2constructorimpl(c098200Yq4);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq4)) {
            c098200Yq4 = null;
        }
        String str6 = (String) c098200Yq4;
        try {
            c098200Yq5 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "item_id");
            C189200o6.m2constructorimpl(c098200Yq5);
        } catch (Throwable th5) {
            TryCatchGuardChecker.doCheck(th5);
            c098200Yq5 = new C098200Yq(th5);
            C189200o6.m2constructorimpl(c098200Yq5);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq5)) {
            c098200Yq5 = null;
        }
        String str7 = (String) c098200Yq5;
        try {
            c098200Yq6 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str2), "item_id");
            C189200o6.m2constructorimpl(c098200Yq6);
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            c098200Yq6 = new C098200Yq(th6);
            C189200o6.m2constructorimpl(c098200Yq6);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq6)) {
            obj3 = c098200Yq6;
        }
        boolean z = false;
        if (u.LJIJI(str7, (String) obj3, false) && u.LJIJI(str3, str5, false) && u.LJIJI(str4, str6, false)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public static final /* bridge */ /* synthetic */ Object invoke$7(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        ((Boolean) obj2).booleanValue();
        return Unit.LIZ;
    }

    public static final Object invoke$70(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (str.length() != 0 && str2.length() != 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[gear_center] ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ(C2188811AlT.LIZIZ(sbLIZ), str2);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$71(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        TextView textView;
        View view = (View) obj;
        String str = (String) obj2;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$72(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        TextView textView;
        View view = (View) obj;
        String str = (String) obj2;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$73(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        TextView textView;
        View view = (View) obj;
        String str = (String) obj2;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$74(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        TextView textView;
        View view = (View) obj;
        String str = (String) obj2;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$75(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        TextView textView;
        View view = (View) obj;
        String str = (String) obj2;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$76(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        TextView textView;
        View view = (View) obj;
        String str = (String) obj2;
        if ((view instanceof TuxTextView) && (textView = (TextView) view) != null) {
            textView.setText(str);
        }
        return Unit.LIZ;
    }

    public static final Object invoke$77(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(obj, obj2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object invoke$78(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) obj;
        C291001Au c291001Au = (C291001Au) obj2;
        if (c291001Au != null) {
            if (((Boolean) c291001Au.LIZ).booleanValue()) {
                C19EG c19egLIZ = C724240Sb0.LIZ(abstractC738140SxQ);
                if (c19egLIZ != null) {
                    C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZ);
                    c1389890mGx.LIZ(true);
                    c1389890mGx.LJIIIZ(2131850545);
                    c1389890mGx.LJIIJJI();
                }
                C19EG c19egLIZ2 = C724240Sb0.LIZ(abstractC738140SxQ);
                if (c19egLIZ2 != null) {
                    c19egLIZ2.finish();
                }
            } else {
                Fragment fragmentLJI = C724240Sb0.LJI(abstractC738140SxQ);
                if (fragmentLJI != null) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(fragmentLJI);
                    c1389890mGx2.LJIIIZ(2131848597);
                    c1389890mGx2.LJIIJJI();
                }
            }
        }
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$79(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C786410Ut5.LJLIIL(((Number) obj2).longValue(), C404501hj.LIZ, (Runnable) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$8(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        ((Function1) obj2).invoke(Integer.valueOf(Math.max(((Number) ((Function0) obj).invoke()).intValue() - 1, 0)));
        return Unit.LIZ;
    }

    public static /* bridge */ /* synthetic */ Object invoke$80(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        C786410Ut5.LJLIIL(((Number) obj2).longValue(), C404501hj.LIZ, (Runnable) obj);
        return Unit.LIZ;
    }

    public static final Object invoke$81(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        return Boolean.valueOf(Intrinsics.LJFF(((Aweme) obj).getAid(), ((Aweme) obj2).getAid()));
    }

    public static final Object invoke$9(AnonymousClass0208 anonymousClass0208, Object obj, Object obj2) {
        boolean z;
        ((Number) obj).floatValue();
        if (((Number) obj2).floatValue() > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
