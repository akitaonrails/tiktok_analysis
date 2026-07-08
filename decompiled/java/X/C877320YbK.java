package X;

import android.app.Activity;
import android.content.Context;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.im.chatlist.api.IMChatListApi;
import com.ss.android.ugc.aweme.inbox.filter.FilterTabType;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS1S1600000_14;
import kotlin.jvm.internal.AwS380S0200000_14;
import kotlin.jvm.internal.AwS4S1310000_14;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.jvm.internal.AwS54S1300000_14;

/* JADX INFO: renamed from: X.0YbK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C877320YbK implements InterfaceC884180YmO {
    public static final C877320YbK LIZ = new C877320YbK();

    public static List LJIIIZ(C878950Ydx c878950Ydx) {
        boolean z;
        Set setLJLIIL;
        C0YB9 c0yb9;
        if (c878950Ydx == null) {
            return null;
        }
        FilterTabType filterTabType = c878950Ydx.LLILLL;
        C0YAJ c0yaj = new C0YAJ();
        C19212010Ec c19212010Ec = C19212010Ec.LIZJ;
        int i = C877420YbU.LIZ[c19212010Ec.LIZJ().ordinal()];
        if (i != 1) {
            if (i == 2 && c19212010Ec.LJIIIIZZ().contains(FilterTabType.SPAM)) {
                C877220YbA c877220YbA = EnumC877300YbI.Companion;
                int value = filterTabType.getValue();
                c877220YbA.getClass();
                EnumC877300YbI enumC877300YbILIZ = C877220YbA.LIZ(value);
                if (enumC877300YbILIZ == EnumC877300YbI.NULL || enumC877300YbILIZ == null) {
                    enumC877300YbILIZ = EnumC877300YbI.ALL;
                }
                int i2 = C877420YbU.LIZJ[enumC877300YbILIZ.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            c0yb9 = new C0YB9(C0YZX.SECONDARY);
                        }
                    } else {
                        c0yb9 = new C0YB9(C0YZX.PRIMARY);
                    }
                    c0yaj.LIZJ = c0yb9;
                }
            }
            z = false;
        } else {
            z = true;
        }
        switch (C877420YbU.LIZIZ[filterTabType.ordinal()]) {
            case 1:
                if (C0CYM.LIZJ.LJIIIIZZ()) {
                    c0yaj.LIZJ = new C0YB9(C0YZX.PRIMARY);
                }
                break;
            case 2:
                c0yaj.LJ = new C0YAS(C0Y97.READ);
                break;
            case 3:
                c0yaj.LIZLLL = C1908607dk.LIZ(EnumC879080YeA.LEAD.getValue());
                break;
            case 4:
                c0yaj.LIZLLL = C1908607dk.LIZ(EnumC879080YeA.STARRED.getValue());
                break;
            case 5:
                c0yaj.LIZLLL = C1908607dk.LIZ(EnumC879080YeA.SPAM.getValue());
                break;
            case 6:
                if (c19212010Ec.LJIIIIZZ().contains(FilterTabType.SPAM)) {
                    setLJLIIL = Collections.singleton(EnumC879080YeA.SECONDARY.getValue());
                } else {
                    setLJLIIL = C13LQ.LJLIIL(new String[]{EnumC879080YeA.SECONDARY.getValue(), EnumC879080YeA.SPAM.getValue()});
                }
                c0yaj.LIZLLL = new C1908707dl(null, C1908607dk.LIZIZ(setLJLIIL), 5);
                break;
            case 7:
                c0yaj.LJI = new C0YBB(EnumC870230YBx.ONE_TO_ONE);
                c0yaj.LJIIIIZZ = C877210Yb9.LIZ();
                break;
        }
        C0YOO c0yoo = new C0YOO();
        ((ArrayList) c0yoo.LIZ).add(new C869690Y9v(c0yaj.LIZ, c0yaj.LIZIZ, c0yaj.LIZJ, c0yaj.LIZLLL, c0yaj.LJ, c0yaj.LJFF, c0yaj.LJI, c0yaj.LJII, c0yaj.LJIIIIZZ, false));
        c0yoo.LJFF = "query_all_for_batch_action";
        c0yoo.LJ = z;
        if (!((ArrayList) c0yoo.LIZ).isEmpty()) {
            C0Y6Q<C867240Y0k> c0y6qLJIIJJI = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIIJJI(new C869710Y9x(C13LP.LLIIII(c0yoo.LIZ), c0yoo.LIZIZ, c0yoo.LIZJ, c0yoo.LIZLLL, c0yoo.LJ, c0yoo.LJFF));
            if (c0y6qLJIIJJI.LIZIZ != null) {
                return null;
            }
            List<C0Y8T> list = c0y6qLJIIJJI.LIZ.LIZIZ;
            ArrayList arrayList = new ArrayList();
            for (C0Y8T c0y8t : list) {
                Set<EnumC880480YgQ> set = C880490YgR.LLILLL;
                if (C880370YgF.LIZ(filterTabType, c878950Ydx.LLILZ, c0y8t, null, null, null)) {
                    arrayList.add(c0y8t);
                }
            }
            return arrayList;
        }
        "At least one filter is required".toString();
        throw new IllegalArgumentException("At least one filter is required");
    }

    public static String LJIIJ(InterfaceC879010Ye3 interfaceC879010Ye3) {
        C878960Ydy c878960Ydy;
        EnumC880520YgU enumC880520YgU;
        C878950Ydx c878950Ydx;
        FilterTabType filterTabType;
        String mobValue;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null && (filterTabType = c878950Ydx.LLILLL) != null && (mobValue = filterTabType.getMobValue()) != null) {
            return mobValue;
        }
        if (!(interfaceC879010Ye3 instanceof C878960Ydy) || (c878960Ydy = (C878960Ydy) interfaceC879010Ye3) == null || (enumC880520YgU = c878960Ydy.LLILLL) == null) {
            return null;
        }
        return enumC880520YgU.getMobValue();
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0i0z] */
    @Override // X.InterfaceC884180YmO
    public final void LIZJ(Context context) {
        AbstractC883730Ylf.LJIIIIZZ.getClass();
        FilterTabType filterTabType = C881500Yi4.LIZLLL().LLILLL;
        Set<EnumC880480YgQ> set = C881500Yi4.LIZLLL().LLILZ;
        C869290Y8h c869290Y8hLIZIZ = new C877210Yb9(filterTabType, set).LIZIZ("query_all_for_batch_action");
        C1227130i2R c1227130i2R = C1227130i2R.LIZ;
        C1226190i0v c1226190i0v = new C1226190i0v(context, new C1226240i10() { // from class: X.0i0z
            @Override // X.C1226240i10, X.InterfaceC1225830i0L
            public final void LJFF(AbstractC1225650i03 abstractC1225650i03) {
                String str;
                if (abstractC1225650i03 instanceof C1225680i06) {
                    if (((C1225680i06) abstractC1225650i03).LIZ.LLJILJIL) {
                        str = "unselect_chat";
                    } else {
                        str = "select_chat";
                    }
                    C885310YoD.LIZ.getClass();
                    C885310YoD.LJJIJIIJIL(str);
                    return;
                }
                if (abstractC1225650i03 instanceof C1225640i02) {
                    C885310YoD.LIZ.getClass();
                    C885310YoD.LJJIJIIJIL("click_search_bar");
                } else if (abstractC1225650i03 instanceof C1225690i07) {
                    C885310YoD.LIZ.getClass();
                    C885310YoD.LJJIJIIJIL("click_add");
                } else {
                    if (!(abstractC1225650i03 instanceof C1225670i05)) {
                        return;
                    }
                    C885310YoD.LIZ.getClass();
                    C885310YoD.LJJIJIIJIL("click_back_btn");
                }
            }
        }, c869290Y8hLIZIZ, new AwS380S0200000_14(filterTabType, (FilterTabType) set, (Set<? extends EnumC880480YgQ>) 91));
        c1227130i2R.getClass();
        C1227130i2R.LJ(context, c1226190i0v);
    }

    public static void LJIIJJI(InterfaceC879010Ye3 interfaceC879010Ye3, Function2 function2) {
        if (C880900Yh6.LIZJ()) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1313505Cb(function2, null), 3);
        } else {
            C1729806q0.LIZ(interfaceC879010Ye3, new C1313605Cc(function2, null));
        }
    }

    public static void LJIIIIZZ(C877320YbK c877320YbK, String str, InterfaceC879010Ye3 interfaceC879010Ye3, List list, String str2) {
        c877320YbK.getClass();
        C1729806q0.LIZ(interfaceC879010Ye3, new C061G(interfaceC879010Ye3, str, str2, list, null, false));
    }

    public static void LJI(String str, List list, List list2, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, Function0 function0) {
        Integer numValueOf;
        Integer numValueOf2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start batchMarkRead, conv size: ");
        if (list2 != null) {
            numValueOf = Integer.valueOf(list2.size());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", convId size: ");
        if (list != null) {
            numValueOf2 = Integer.valueOf(list.size());
        } else {
            numValueOf2 = null;
        }
        sbLIZ.append(numValueOf2);
        sbLIZ.append(", pageKey: ");
        sbLIZ.append(interfaceC879010Ye3);
        C2188811AlT.LIZIZ(sbLIZ);
        C914150Ztd c914150Ztd = new C914150Ztd(function0, 5);
        if (list2 != null && (!list2.isEmpty())) {
            C877320YbK c877320YbK = LIZ;
            String singleTargetMobValue = enumC885270Yo9.getSingleTargetMobValue();
            c877320YbK.getClass();
            C1729806q0.LIZ(interfaceC879010Ye3, new C061F(interfaceC879010Ye3, str, singleTargetMobValue, list2, null, false));
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJIJI(list2, c914150Ztd);
            return;
        }
        if (list != null && (!list.isEmpty())) {
            LJIIIIZZ(LIZ, str, interfaceC879010Ye3, list, enumC885270Yo9.getSingleTargetMobValue());
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIJIL(list, c914150Ztd);
        } else {
            if (function0 == null) {
                return;
            }
            function0.invoke();
        }
    }

    @Override // X.InterfaceC884180YmO
    public final void LIZ(Activity activity, String str, List<String> list, InterfaceC879010Ye3 interfaceC879010Ye3, Function0<Unit> function0, Function0<Unit> function02, boolean z) {
        C878950Ydx c878950Ydx;
        if ((interfaceC879010Ye3 instanceof C878950Ydx) && (c878950Ydx = (C878950Ydx) interfaceC879010Ye3) != null) {
            if (z) {
                LJIIJJI(interfaceC879010Ye3, new C877350YbN(c878950Ydx, activity, str, function0, function02, null));
                return;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = ((ArrayList) list).iterator();
            while (it2.hasNext()) {
                C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ((String) it2.next());
                if (c0y8tLIZ != null) {
                    arrayList.add(c0y8tLIZ);
                }
            }
            LJFF(activity, str, arrayList, c878950Ydx, "delete_selected", function0, function02);
        }
    }

    public final void LJFF(Activity activity, String str, List<C0Y8T> list, C878950Ydx c878950Ydx, String str2, Function0<Unit> function0, Function0<Unit> function02) {
        Activity activityLIZIZ;
        IMChatListApi.LJJIII.getClass();
        C890330YwJ.LIZ().LIZIZ().LJ(list.size(), str, "direct_click", str2, c878950Ydx.LLILLL.getMobValue());
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<C0Y8T> it2 = list.iterator();
        while (it2.hasNext()) {
            String conversationId = it2.next().getConversationId();
            if (conversationId != null) {
                arrayList.add(conversationId);
            }
        }
        String strLJ = C20642515q3.LJ(2131755196, list.size(), Integer.valueOf(list.size()));
        AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
        if (abstractC1387200mCcLJ != null && (activityLIZIZ = abstractC1387200mCcLJ.LIZIZ()) != null) {
            if (C0DHG.LIZ() && C1388190mED.LIZ(activityLIZIZ) != null) {
                C632670Orh.LIZIZ(activityLIZIZ, new C19719212De(-63935632, new C1054050dXH(strLJ, function0, str, list, c878950Ydx, arrayList, function02, activity), true));
            } else {
                C1397580mTM c1397580mTM = new C1397580mTM(activityLIZIZ);
                c1397580mTM.LJI(strLJ);
                c1397580mTM.LIZ(2131830232);
                C985403tE.LIZ(c1397580mTM, new AwS1S1600000_14(function0, str, list, c878950Ydx, arrayList, function02, activity, 0));
                c1397580mTM.LJII = false;
                new C1397510mTF(c1397580mTM).LIZLLL();
            }
            LJIIIIZZ(this, str, c878950Ydx, arrayList, "delete_click");
        }
    }

    public final void LJII(Activity activity, String str, List<String> list, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, boolean z, Function0<Unit> function0) {
        if (list.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
            }
        } else {
            if (!z) {
                LJIIIIZZ(this, str, interfaceC879010Ye3, list, enumC885270Yo9.getSingleTargetMobValue());
            }
            C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZLLL(list, new C877110Yaz(activity, function0, null, new AwS54S1300000_14(activity, str, interfaceC879010Ye3, enumC885270Yo9, 4)));
        }
    }

    public final void LIZLLL(Activity activity, EnumC885270Yo9 enumC885270Yo9, InterfaceC879010Ye3 interfaceC879010Ye3, String str, List list, Function0 function0, boolean z, boolean z2) {
        String strLJ;
        if (list.isEmpty()) {
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        if (list.size() > 99) {
            C0CNO.LIZLLL(0L, new AwS548S0100000_4(activity, 479));
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Boolean bool = null;
        switch (C885280YoA.LIZ[enumC885270Yo9.ordinal()]) {
            case 1:
            case 2:
            case 3:
                arrayList.add(EnumC879080YeA.PRIMARY);
                arrayList2.add(EnumC879080YeA.SECONDARY);
                EnumC885270Yo9 enumC885270Yo92 = EnumC885270Yo9.PRIMARY_UNSPAM;
                if (enumC885270Yo9 == enumC885270Yo92 || C19212010Ec.LIZJ.LIZJ() == C05RV.PRO_CREATOR_INBOX) {
                    arrayList2.add(EnumC879080YeA.SPAM);
                    if (enumC885270Yo9 == enumC885270Yo92) {
                        bool = Boolean.FALSE;
                    }
                }
                strLJ = C20642515q3.LJ(2131755199, list.size(), C20642515q3.LJI(C19212010Ec.LIZJ.LJI()));
                break;
            case 4:
            case 5:
            case 6:
                arrayList.add(EnumC879080YeA.SECONDARY);
                arrayList2.add(EnumC879080YeA.PRIMARY);
                if (enumC885270Yo9 == EnumC885270Yo9.SECONDARY_UNSPAM) {
                    arrayList2.add(EnumC879080YeA.SPAM);
                    bool = Boolean.FALSE;
                }
                strLJ = C20642515q3.LJ(2131755199, list.size(), C20642515q3.LJI(C19212010Ec.LIZJ.LJIIJJI()));
                break;
            case 7:
            case 8:
                arrayList.add(EnumC879080YeA.SPAM);
                arrayList2.add(EnumC879080YeA.SECONDARY);
                bool = Boolean.FALSE;
                strLJ = C20642515q3.LJ(2131755630, list.size(), Integer.valueOf(list.size()));
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
            case 14:
                arrayList2.add(EnumC879080YeA.SPAM);
                arrayList2.add(EnumC879080YeA.SECONDARY);
                bool = Boolean.FALSE;
                strLJ = C20642515q3.LJ(2131755629, list.size(), Integer.valueOf(list.size()));
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                arrayList.add(EnumC879080YeA.STARRED);
                strLJ = C20642515q3.LJ(2131755631, list.size(), Integer.valueOf(list.size()));
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                arrayList2.add(EnumC879080YeA.STARRED);
                strLJ = C20642515q3.LJ(2131755635, list.size(), Integer.valueOf(list.size()));
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                arrayList.add(EnumC879080YeA.SECONDARY);
                arrayList2.add(EnumC879080YeA.PRIMARY);
                arrayList2.add(EnumC879080YeA.SPAM);
                bool = Boolean.FALSE;
                strLJ = C20642515q3.LJ(2131755207, list.size(), String.valueOf(list.size()));
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                arrayList2.add(EnumC879080YeA.SECONDARY);
                arrayList2.add(EnumC879080YeA.SPAM);
                bool = Boolean.FALSE;
                strLJ = C20642515q3.LJ(2131755205, list.size(), String.valueOf(list.size()));
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                    return;
                }
                return;
        }
        if (z2) {
            LJIIIIZZ(this, str, interfaceC879010Ye3, list, enumC885270Yo9.getSingleTargetMobValue());
        }
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIIZ(list, arrayList, arrayList2, bool, new C877110Yaz(activity, function0, new C877400YbS(z, activity, strLJ, z2, enumC885270Yo9, str, interfaceC879010Ye3, list), new AwS4S1310000_14(z, activity, str, interfaceC879010Ye3, enumC885270Yo9, 1)));
    }

    @Override // X.InterfaceC884180YmO
    public final void LIZIZ(Activity activity, String str, List<String> list, InterfaceC879010Ye3 interfaceC879010Ye3, EnumC885270Yo9 enumC885270Yo9, boolean z, boolean z2, Function0<Unit> function0, Function0<Unit> function02) {
        if (function0 != null) {
            function0.invoke();
        }
        switch (C885280YoA.LIZ[enumC885270Yo9.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case BdTuring.TYPE_ECAF /* 9 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
            case BdTuring.TYPE_EMAIL /* 11 */:
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                LIZLLL(activity, enumC885270Yo9, interfaceC879010Ye3, str, list, function02, z, z2);
                return;
            case 14:
            case 15:
                LJIIJJI(interfaceC879010Ye3, new C877330YbL(interfaceC879010Ye3, str, enumC885270Yo9, activity, z, z2, function02, null));
                return;
            case 16:
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                LJ(128, activity, enumC885270Yo9, this, interfaceC879010Ye3, str, list, function02, z, false);
                return;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                LJI(str, list, null, interfaceC879010Ye3, enumC885270Yo9, function02);
                return;
            case 19:
                LJII(activity, str, list, interfaceC879010Ye3, enumC885270Yo9, false, function02);
                return;
            default:
                throw new C1954807lC();
        }
    }

    public static void LJ(int i, Activity activity, EnumC885270Yo9 enumC885270Yo9, C877320YbK c877320YbK, InterfaceC879010Ye3 interfaceC879010Ye3, String str, List list, Function0 function0, boolean z, boolean z2) {
        EnumC877490Ybb enumC877490Ybb;
        Function0 function02 = function0;
        if ((i & 64) != 0) {
            function02 = null;
        }
        boolean z3 = false;
        if ((i & 128) != 0) {
            z2 = false;
        }
        c877320YbK.getClass();
        int i2 = C885280YoA.LIZ[enumC885270Yo9.ordinal()];
        if (i2 != 16) {
            if (i2 != 17) {
                if (function02 != null) {
                    function02.invoke();
                    return;
                }
                return;
            }
        } else {
            z3 = true;
        }
        if (!z2) {
            LJIIIIZZ(c877320YbK, str, interfaceC879010Ye3, list, enumC885270Yo9.getSingleTargetMobValue());
        }
        EnumC877490Ybb.Companion.getClass();
        if (z3) {
            enumC877490Ybb = EnumC877490Ybb.MUTE;
        } else {
            enumC877490Ybb = EnumC877490Ybb.ALL;
        }
        C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LJJIII(list, z3, C2097908Jt.LIZJ(new Pair("a:conv_set_notification", enumC877490Ybb.getValue())), new C877110Yaz(activity, function02, null, new C877380YbQ(z, activity, z3, str, interfaceC879010Ye3, enumC885270Yo9)));
    }
}
