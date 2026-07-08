package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS75S0200000_6;
import Y.ARunnableS79S0200000_10;
import android.content.Context;
import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.mix.services.IMixFeedService;
import com.ss.android.ugc.aweme.search.ecommerce.usercard.ISearchShowcaseEntranceProvider;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653690PkV {
    public static final C653690PkV LIZ = new C653690PkV();
    public static boolean LIZIZ;
    public static final Map<Integer, Integer> LIZJ;
    public static final Map<Integer, Integer> LIZLLL;
    public static final Map<String, Integer> LJ;
    public static final Map<String, Integer> LJFF;
    public static final Map<Integer, Integer> LJI;
    public static final C01GW LJII;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C0PT9.LIZ()) {
            linkedHashMap.put(Integer.valueOf(R.layout.f48), 4);
        } else {
            linkedHashMap.put(Integer.valueOf(R.layout.f47), 4);
        }
        linkedHashMap.put(Integer.valueOf(R.layout.f49), 4);
        linkedHashMap.put(Integer.valueOf(R.layout.f4_), 4);
        linkedHashMap.put(Integer.valueOf(R.layout.f41), 4);
        linkedHashMap.put(Integer.valueOf(R.layout.f2x), 4);
        linkedHashMap.put(Integer.valueOf(R.layout.f1p), 4);
        linkedHashMap.put(Integer.valueOf(R.layout.evg), 4);
        linkedHashMap.put(Integer.valueOf(R.layout.eae), 4);
        LIZJ = linkedHashMap;
        LIZLLL = C2097608Jq.LJIIIIZZ(new Pair(Integer.valueOf(R.layout.ex4), 1), new Pair(Integer.valueOf(R.layout.ex3), 1), new Pair(Integer.valueOf(R.layout.f1a), 4));
        C13DA c13da = new C13DA();
        c13da.put("search_coin_view", 1);
        c13da.put("search_history_item", 3);
        c13da.put("search_history_view_more_item", 1);
        c13da.put("search_coin_sug_view", 1);
        c13da.put("search_coin_middle_floating_layout", 1);
        if (C301350BrZ.LIZ()) {
            c13da.put("search_item_middle_tako_custom_button", 1);
        }
        if (C301180BrI.LIZ()) {
            c13da.put("search_item_middle_tako_round_button", 1);
            c13da.put("search_item_middle_voice_round_button", 1);
        }
        if (((Number) C0BDD.LIZ.getValue()).intValue() == 1) {
            C653710PkX.LIZ.getClass();
            if (C653710PkX.LIZ()) {
                c13da.put("search_item_middle_tako_round_button_position_exchange", 1);
            } else {
                c13da.put("search_item_middle_tako_round_button", 1);
            }
            c13da.put("search_item_middle_voice_round_button", 1);
        }
        LJ = c13da.build();
        LJFF = C2097908Jt.LIZJ(new Pair("search_activity_fragment_container", 1));
        LJI = C2097908Jt.LIZJ(new Pair(Integer.valueOf(R.layout.d6v), 3));
        LJII = C452501pT.LIZIZ(new C647730Pat());
    }

    public static void LIZ(Context context) {
        for (Map.Entry<Integer, Integer> entry : LJI.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            for (int i = 0; i < iIntValue2; i++) {
                C20673215v0.LJI(iIntValue, context);
                if (!C0BQL.LIZ()) {
                    C653700PkW.LIZIZ.add(Integer.valueOf(iIntValue));
                }
            }
        }
    }

    public static void LIZLLL(Context context) {
        Object c098200Yq;
        if (((Number) C0BDN.LIZ.getValue()).intValue() == 1 && !Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            try {
                c098200Yq = C21172617tM.LJFF.LIZIZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = C823050WQl.LIZLLL();
            }
            ((Executor) c098200Yq).execute(new ARunnableS110S0100000_10(context, 5));
            return;
        }
        LJ(context);
    }

    public static void LJ(Context context) {
        Integer numLJIIJ;
        Integer layoutResId;
        LIZJ(context, LIZLLL);
        if (C07J7.LIZ()) {
            LIZJ.put(Integer.valueOf(R.layout.f1g), 1);
        }
        ISearchShowcaseEntranceProvider iSearchShowcaseEntranceProviderLIZJ = C1202104n5.LIZ().LIZJ();
        if (iSearchShowcaseEntranceProviderLIZJ != null && (layoutResId = iSearchShowcaseEntranceProviderLIZJ.getLayoutResId()) != null) {
            LIZJ.put(Integer.valueOf(layoutResId.intValue()), 1);
        }
        InterfaceC653600PkM interfaceC653600PkMLIZLLL = C1202104n5.LIZ().LIZLLL();
        if (interfaceC653600PkMLIZLLL != null) {
            interfaceC653600PkMLIZLLL.getLayoutId();
            LIZJ.put(Integer.valueOf(R.layout.bsb), 1);
        }
        IMixFeedService iMixFeedService = (IMixFeedService) ServiceManager.get().getService(IMixFeedService.class);
        if (iMixFeedService != null && (numLJIIJ = iMixFeedService.LJIIJ()) != null) {
            LIZJ.put(Integer.valueOf(numLJIIJ.intValue()), 1);
        }
        if (((Boolean) C284390BCr.LIZ.getValue()).booleanValue() && !C648980Pcu.LIZ()) {
            Map<Integer, Integer> map = LIZJ;
            map.put(Integer.valueOf(R.layout.eyh), 2);
            map.put(Integer.valueOf(R.layout.ez8), 2);
            map.put(Integer.valueOf(R.layout.f0o), 4);
            map.put(Integer.valueOf(R.layout.ez_), 1);
            map.put(Integer.valueOf(R.layout.f0_), 2);
            map.put(Integer.valueOf(R.layout.f0a), 1);
            map.put(Integer.valueOf(R.layout.f07), 1);
            map.put(Integer.valueOf(R.layout.f06), 6);
        }
        LIZJ(context, LIZJ);
    }

    public static void LIZIZ(Context context, String str) {
        if (C288080BQw.LIZ()) {
            C21146717pB.LIZLLL(context, str);
            return;
        }
        C20673215v0.LJII(context, str);
        if (C0BQL.LIZ()) {
            return;
        }
        C653700PkW.LIZ.add(str);
    }

    public static void LIZJ(Context context, Map map) {
        Object c098200Yq;
        if (C0BEF.LIZ()) {
            return;
        }
        if (((Number) C0BDN.LIZ.getValue()).intValue() == 1 && !Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())) {
            try {
                c098200Yq = C21172617tM.LJFF.LIZIZ();
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                c098200Yq = C823050WQl.LIZLLL();
            }
            ((Executor) c098200Yq).execute(new ARunnableS79S0200000_10(context, map, 1));
            return;
        }
        LJI(context, map);
    }

    public static void LJFF(Context context, Map map) {
        Object c098200Yq;
        if (C0BEF.LIZ()) {
            return;
        }
        try {
            c098200Yq = C21172617tM.LJFF.LIZIZ();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = C823050WQl.LIZLLL();
        }
        ((Executor) c098200Yq).execute(new ARunnableS75S0200000_6(map, context, 12));
    }

    public static void LJI(Context context, Map map) {
        ArrayList arrayList = new ArrayList();
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            int iIntValue2 = ((Number) entry.getValue()).intValue();
            for (int i = 0; i < iIntValue2; i++) {
                arrayList.add(Integer.valueOf(iIntValue));
            }
        }
        if (((Number) C272650AmN.LIZ.getValue()).intValue() == 1) {
            C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(context, arrayList, 2));
        } else {
            C21146717pB.LJI(context, arrayList);
        }
    }
}
