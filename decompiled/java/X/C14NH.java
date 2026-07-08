package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.forest.Forest;
import com.bytedance.geckox.settings.model.MatchRule;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.main.service.II18nService;
import com.ss.android.ugc.aweme.nimblecard.tako.config.TemplateConfig;
import com.ss.android.ugc.aweme.nimblecard.tako.context.NimbleTemplateContext;
import com.ss.android.ugc.aweme.nimblecard.tako.model.CardData;
import com.ss.android.ugc.aweme.nimblecard.tako.model.Layout;
import com.ss.android.ugc.aweme.nimblecard.tako.model.TemplateData;
import com.tiktok.geckox.ng.model.Event;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS48S0200100_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.14NH, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14NH {
    public static final C14NH LIZ = new C14NH();
    public static final C14N6 LIZIZ;
    public static boolean LIZJ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final Map<String, Object> LJFF;

    static {
        C14N6 c14n6 = new C14N6();
        LIZIZ = c14n6;
        LIZLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(285));
        LJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(286));
        LJFF = c14n6.LIZ;
    }

    public static C21328418dO LIZLLL() {
        C21328418dO c21328418dO = new C21328418dO(0);
        for (Map.Entry entry : ((LinkedHashMap) C1909810znX.LIZ).entrySet()) {
            c21328418dO.LIZJ.put((String) entry.getKey(), (InterfaceC332330D1b) entry.getValue());
        }
        return c21328418dO;
    }

    public static C21328418dO LJIIJJI() {
        return (C21328418dO) LJ.getValue();
    }

    public static void LJIILL() {
        try {
            C1552630qVR.LIZ.onEventTrigger(new Event("tako_nimble_templates_gecko", null, null, MatchRule.MATCH_ONE, null, EnumC919040a1W.NORMAL));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ExecutorService executorService = C1909880zne.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1909880zne.LIZJ("", null, message, 26);
        }
    }

    public static void LIZ(List list) {
        C14N6 c14n6 = LIZIZ;
        c14n6.getClass();
        try {
            CopyOnWriteArrayList<C14NJ> copyOnWriteArrayList = c14n6.LIZJ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
            Iterator<C14NJ> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getName());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!setLLIIJI.contains(((C14NJ) obj).getName())) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                c14n6.LIZJ.addAll(arrayList2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ExecutorService executorService = C1909880zne.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1909880zne.LIZJ("", "add_component_or_action_list", message, 24);
        }
    }

    public static void LIZIZ(List list) {
        C14N6 c14n6 = LIZIZ;
        c14n6.getClass();
        try {
            CopyOnWriteArrayList<C14NZ> copyOnWriteArrayList = c14n6.LIZIZ;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
            Iterator<C14NZ> it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().getClass());
            }
            Set setLLIIJI = C13LP.LLIIJI(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (!setLLIIJI.contains(((C14NZ) obj).getClass())) {
                    arrayList2.add(obj);
                }
            }
            if (!arrayList2.isEmpty()) {
                c14n6.LIZIZ.addAll(arrayList2);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            ExecutorService executorService = C1909880zne.LIZ;
            String message = e.getMessage();
            if (message == null) {
                message = "";
            }
            C1909880zne.LIZJ("", "add_component_or_action_list", message, 24);
        }
    }

    public static TemplateData LJI(Integer num) {
        Object next;
        CardData cardData;
        if (num == null) {
            return null;
        }
        Iterator<T> it2 = C14N5.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List list = (List) ((Map.Entry) next).getValue();
                if (list != null && list.contains(num)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (cardData = (CardData) entry.getKey()) == null) {
            return null;
        }
        return cardData.dslJson;
    }

    public static CardData LJII(Integer num) {
        Object next;
        if (num == null) {
            return null;
        }
        Iterator<T> it2 = C14N5.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List list = (List) ((Map.Entry) next).getValue();
                if (list != null && list.contains(num)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (CardData) entry.getKey();
    }

    public static CardData LJIIIIZZ(String str) {
        Object next;
        Iterator<T> it2 = C14N5.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(((CardData) ((Map.Entry) next).getKey()).fileName, str)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return (CardData) entry.getKey();
    }

    public static String LJIIIZ(Integer num) {
        Object next;
        CardData cardData;
        if (num == null) {
            return null;
        }
        Iterator<T> it2 = C14N5.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List list = (List) ((Map.Entry) next).getValue();
                if (list != null && list.contains(num)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (cardData = (CardData) entry.getKey()) == null) {
            return null;
        }
        return cardData.fileName;
    }

    public static String LJIIJ(Integer num) {
        Object next;
        CardData cardData;
        if (num == null) {
            return null;
        }
        Iterator<T> it2 = C14N5.LIZ.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                List list = (List) ((Map.Entry) next).getValue();
                if (list != null && list.contains(num)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (cardData = (CardData) entry.getKey()) == null) {
            return null;
        }
        return cardData.cardVersion;
    }

    public static final Integer LIZJ(C14NX c14nx, String str) {
        boolean z;
        Number number;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        Object objLJI = C20252814Mk.LJI(c14nx.LJIIZILJ(str));
        if (!(objLJI instanceof Number) || (number = (Number) objLJI) == null) {
            return null;
        }
        return Integer.valueOf(Math.round(C418440Gaw.LIZIZ(number)));
    }

    public static Object LJIILIIL(String str, Map map) {
        if (C20252814Mk.LJFF(str)) {
            return LJIIJJI().LIZ(C20252814Mk.LJII(str), map, null, C20252814Mk.LIZ);
        }
        return C20252814Mk.LJ(str);
    }

    public static void LJIILJJIL(Integer num, String str) {
        if (str != null && num != null) {
            num.intValue();
            for (Map.Entry<CardData, List<Integer>> entry : C14N5.LIZ.entrySet()) {
                CardData key = entry.getKey();
                List<Integer> value = entry.getValue();
                if (Intrinsics.LJFF(key.fileName, str)) {
                    if (value != null && !value.contains(num)) {
                        value.add(num);
                        return;
                    }
                    return;
                }
            }
        }
    }

    public static void LJ(Map map, NimbleTemplateContext nimbleTemplateContext, C21328418dO c21328418dO) {
        String strT2;
        if (c21328418dO != null) {
            if (map != null) {
                II18nService iI18nService = (II18nService) PluggableExtentionKt.pluggableSpi$default(II18nService.class, false, false, false, 14, null);
                if (iI18nService == null || (strT2 = iI18nService.LIZ()) == null) {
                    strT2 = C786410Ut5.t2(Locale.getDefault());
                }
                Object obj = map.get(strT2);
                if (obj != null) {
                    c21328418dO.LIZIZ.put("starlingData", obj);
                }
            }
            c21328418dO.LIZIZ.put("templateContext", nimbleTemplateContext);
        }
    }

    public static void LJFF(String str, List list, Map map) {
        if (list == null || str == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            String str2 = File.separator;
            sbLIZ.append(str2);
            sbLIZ.append(str);
            sbLIZ.append(str2);
            sbLIZ.append("index.json");
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            String str3 = ((TemplateConfig) C0R3T.LIZIZ.getValue()).cdnPrefix;
            if (str3 == null) {
                str3 = "";
            }
            sbLIZ2.append(str3);
            sbLIZ2.append("tako_nimble_templates");
            sbLIZ2.append(str2);
            sbLIZ2.append(str);
            sbLIZ2.append(str2);
            sbLIZ2.append("index.json");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C365501bR(strLIZIZ, new C0X9E(jCurrentTimeMillis, str, list, map), new C487301v5((Forest) C14N5.LIZIZ.getValue()), strLIZIZ2, null, "tako_nimble_templates", new AtomicBoolean(false), null), 3);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C14N5.LIZ(list, str, null, map, jCurrentTimeMillis, e.toString());
        }
    }

    public static NimbleTemplateContext LJIIL(CardData cardData, Context context, Map map, LifecycleOwner lifecycleOwner, boolean z) {
        TemplateData templateData;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Integer num;
        Integer num2;
        int iIntValue;
        int iIntValue2;
        int iIntValue3;
        int iIntValue4;
        if (cardData == null || (templateData = cardData.dslJson) == null) {
            return null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        NimbleTemplateContext nimbleTemplateContext = new NimbleTemplateContext(LIZIZ, context, LIZLLL(), UUID.randomUUID().toString());
        nimbleTemplateContext.LLJ = map;
        if (lifecycleOwner != null) {
            nimbleTemplateContext.LLIZ = lifecycleOwner;
        }
        if (z) {
            nimbleTemplateContext.LLIZLLLIL = true;
        }
        LJ(cardData.starlingData, nimbleTemplateContext, nimbleTemplateContext.LLILZIL);
        nimbleTemplateContext.LLJI = templateData;
        final C14NX c14nxLIZJ = nimbleTemplateContext.LIZJ(templateData.type);
        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
        ExecutorService executorService = C1909880zne.LIZ;
        C1909880zne.LJ(new AwS48S0200100_30(nimbleTemplateContext, (NimbleTemplateContext) jCurrentTimeMillis2, (long) map, (Map<String, String>) 0));
        long jCurrentTimeMillis3 = System.currentTimeMillis();
        C1909880zne.LJ(new AwS431S0200000_30(nimbleTemplateContext, (NimbleTemplateContext) map, (Map<String, String>) 45));
        c14nxLIZJ.LJII(templateData);
        final Layout layout = templateData.layout;
        final View view = c14nxLIZJ.getView();
        if (view.isAttachedToWindow()) {
            if (!(view.getParent() instanceof C14O7)) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    Integer numLIZJ = LIZJ(c14nxLIZJ, layout.margin);
                    Integer numLIZJ2 = LIZJ(c14nxLIZJ, layout.marginLeft);
                    Integer numLIZJ3 = LIZJ(c14nxLIZJ, layout.marginRight);
                    Integer numLIZJ4 = LIZJ(c14nxLIZJ, layout.marginTop);
                    if (numLIZJ4 == null) {
                        numLIZJ4 = numLIZJ;
                    }
                    Integer numLIZJ5 = LIZJ(c14nxLIZJ, layout.marginBottom);
                    if (numLIZJ5 == null) {
                        numLIZJ5 = numLIZJ;
                    }
                    if (numLIZJ2 == null) {
                        num = numLIZJ;
                    } else {
                        num = numLIZJ2;
                    }
                    if (numLIZJ3 == null) {
                        num2 = numLIZJ;
                    } else {
                        num2 = numLIZJ3;
                    }
                    Integer numLIZJ6 = LIZJ(c14nxLIZJ, layout.marginStart);
                    if (numLIZJ6 == null) {
                        if (numLIZJ2 == null) {
                            numLIZJ2 = numLIZJ;
                        }
                    } else {
                        numLIZJ2 = numLIZJ6;
                    }
                    Integer numLIZJ7 = LIZJ(c14nxLIZJ, layout.marginEnd);
                    if (numLIZJ7 == null) {
                        if (numLIZJ3 != null) {
                            numLIZJ = numLIZJ3;
                        }
                    } else {
                        numLIZJ = numLIZJ7;
                    }
                    if (num == null) {
                        if (num2 != null || numLIZJ4 != null || numLIZJ5 != null || numLIZJ2 != null || numLIZJ != null) {
                            iIntValue = marginLayoutParams.leftMargin;
                        }
                    } else {
                        iIntValue = num.intValue();
                    }
                    if (numLIZJ4 != null) {
                        iIntValue2 = numLIZJ4.intValue();
                    } else {
                        iIntValue2 = marginLayoutParams.topMargin;
                    }
                    if (num2 != null) {
                        iIntValue3 = num2.intValue();
                    } else {
                        iIntValue3 = marginLayoutParams.rightMargin;
                    }
                    if (numLIZJ5 != null) {
                        iIntValue4 = numLIZJ5.intValue();
                    } else {
                        iIntValue4 = marginLayoutParams.bottomMargin;
                    }
                    marginLayoutParams.setMargins(iIntValue, iIntValue2, iIntValue3, iIntValue4);
                    if (numLIZJ2 != null) {
                        marginLayoutParams.setMarginStart(numLIZJ2.intValue());
                    }
                    if (numLIZJ != null) {
                        marginLayoutParams.setMarginEnd(numLIZJ.intValue());
                    }
                    C786410Ut5.W5(view, marginLayoutParams);
                }
            }
        } else {
            view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: X.14NI
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view2) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view2) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2;
                    Integer num3;
                    Integer num4;
                    int iIntValue5;
                    int iIntValue6;
                    int iIntValue7;
                    int iIntValue8;
                    view.removeOnAttachStateChangeListener(this);
                    if (!(view.getParent() instanceof C14O7)) {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if ((layoutParams2 instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) != null) {
                            Integer numLIZJ8 = C14NH.LIZJ(c14nxLIZJ, layout.margin);
                            Integer numLIZJ9 = C14NH.LIZJ(c14nxLIZJ, layout.marginLeft);
                            Integer numLIZJ10 = C14NH.LIZJ(c14nxLIZJ, layout.marginRight);
                            Integer numLIZJ11 = C14NH.LIZJ(c14nxLIZJ, layout.marginTop);
                            if (numLIZJ11 == null) {
                                numLIZJ11 = numLIZJ8;
                            }
                            Integer numLIZJ12 = C14NH.LIZJ(c14nxLIZJ, layout.marginBottom);
                            if (numLIZJ12 == null) {
                                numLIZJ12 = numLIZJ8;
                            }
                            if (numLIZJ9 == null) {
                                num3 = numLIZJ8;
                            } else {
                                num3 = numLIZJ9;
                            }
                            if (numLIZJ10 == null) {
                                num4 = numLIZJ8;
                            } else {
                                num4 = numLIZJ10;
                            }
                            Integer numLIZJ13 = C14NH.LIZJ(c14nxLIZJ, layout.marginStart);
                            if (numLIZJ13 == null) {
                                if (numLIZJ9 == null) {
                                    numLIZJ9 = numLIZJ8;
                                }
                            } else {
                                numLIZJ9 = numLIZJ13;
                            }
                            Integer numLIZJ14 = C14NH.LIZJ(c14nxLIZJ, layout.marginEnd);
                            if (numLIZJ14 == null) {
                                if (numLIZJ10 != null) {
                                    numLIZJ8 = numLIZJ10;
                                }
                            } else {
                                numLIZJ8 = numLIZJ14;
                            }
                            if (num3 == null) {
                                if (num4 == null && numLIZJ11 == null && numLIZJ12 == null && numLIZJ9 == null && numLIZJ8 == null) {
                                    return;
                                } else {
                                    iIntValue5 = marginLayoutParams2.leftMargin;
                                }
                            } else {
                                iIntValue5 = num3.intValue();
                            }
                            if (numLIZJ11 != null) {
                                iIntValue6 = numLIZJ11.intValue();
                            } else {
                                iIntValue6 = marginLayoutParams2.topMargin;
                            }
                            if (num4 != null) {
                                iIntValue7 = num4.intValue();
                            } else {
                                iIntValue7 = marginLayoutParams2.rightMargin;
                            }
                            if (numLIZJ12 != null) {
                                iIntValue8 = numLIZJ12.intValue();
                            } else {
                                iIntValue8 = marginLayoutParams2.bottomMargin;
                            }
                            marginLayoutParams2.setMargins(iIntValue5, iIntValue6, iIntValue7, iIntValue8);
                            if (numLIZJ9 != null) {
                                marginLayoutParams2.setMarginStart(numLIZJ9.intValue());
                            }
                            if (numLIZJ8 != null) {
                                marginLayoutParams2.setMarginEnd(numLIZJ8.intValue());
                            }
                            C786410Ut5.W5(view, marginLayoutParams2);
                        }
                    }
                }
            });
        }
        nimbleTemplateContext.LLJIJIL = c14nxLIZJ;
        C14NN.LIZ.getClass();
        C14NN.LIZIZ();
        C1909880zne.LJ(new AwS48S0200100_30(nimbleTemplateContext, (NimbleTemplateContext) (System.currentTimeMillis() - jCurrentTimeMillis3), (long) map, (Map<String, String>) 1));
        return nimbleTemplateContext;
    }
}
