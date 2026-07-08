package X;

import Y.ARunnableS18S1000000_28;
import Y.ARunnableS8S1000000_13;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.journey.intention.IntentionSource;
import com.ss.android.ugc.aweme.journey.intention.IntentionStruct;
import com.ss.android.ugc.aweme.journey.intention.NUIntentionModel;
import defpackage.f9;
import defpackage.g9;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0yl9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1869890yl9 {
    public static NUIntentionModel LIZ;
    public static final List<Runnable> LIZIZ = new ArrayList();

    public static NUIntentionModel LIZ() {
        NUIntentionModel nUIntentionModel = LIZ;
        if (nUIntentionModel != null) {
            return nUIntentionModel;
        }
        try {
            f9 f9Var = f9.LIZ;
            int id = g9.STRATEGY_SCENE_INTENTION_MARK.getId();
            f9Var.getClass();
            String strLIZIZ = f9.LIZIZ(id);
            C1227904rF.LIZ.getClass();
            NUIntentionModel nUIntentionModel2 = (NUIntentionModel) C1227904rF.LIZIZ(strLIZIZ, NUIntentionModel.class);
            LIZ = nUIntentionModel2;
            return nUIntentionModel2;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return new NUIntentionModel(C2097608Jq.LJ());
        }
    }

    public static void LIZIZ(String str) {
        NUIntentionModel nUIntentionModelLIZ = LIZ();
        if (nUIntentionModelLIZ == null) {
            ((ArrayList) LIZIZ).add(new ARunnableS18S1000000_28(str, 0));
            return;
        }
        Map<String, List<IntentionSource>> map = nUIntentionModelLIZ.intentions;
        for (Map.Entry<String, List<IntentionSource>> entry : map.entrySet()) {
            List<IntentionSource> list = map.get(entry.getKey());
            IntentionSource intentionSource = null;
            if (list != null) {
                Iterator<IntentionSource> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    IntentionSource next = it2.next();
                    IntentionSource intentionSource2 = next;
                    if (Intrinsics.LJFF(intentionSource2.type, "af_media_source") && intentionSource2.value.contains(str)) {
                        intentionSource = next;
                        break;
                    }
                }
                IntentionSource intentionSource3 = intentionSource;
                if (intentionSource3 != null) {
                    List<IntentionStruct> list2 = C0CQA.LIZ;
                    C0CQA.LIZIZ(entry.getKey(), intentionSource3.subIntention);
                }
            }
        }
    }

    public static void LIZJ(String str) {
        NUIntentionModel nUIntentionModelLIZ = LIZ();
        if (nUIntentionModelLIZ == null) {
            ((ArrayList) LIZIZ).add(new ARunnableS18S1000000_28(str, 1));
            return;
        }
        Map<String, List<IntentionSource>> map = nUIntentionModelLIZ.intentions;
        for (Map.Entry<String, List<IntentionSource>> entry : map.entrySet()) {
            List<IntentionSource> list = map.get(entry.getKey());
            IntentionSource intentionSource = null;
            if (list != null) {
                Iterator<IntentionSource> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    IntentionSource next = it2.next();
                    IntentionSource intentionSource2 = next;
                    if (Intrinsics.LJFF(intentionSource2.type, "link_contains")) {
                        Iterator<String> it3 = intentionSource2.value.iterator();
                        while (it3.hasNext()) {
                            if (a0.LJJIIZI(str, it3.next(), false)) {
                                intentionSource = next;
                                break;
                            }
                        }
                    }
                }
                IntentionSource intentionSource3 = intentionSource;
                if (intentionSource3 != null) {
                    List<IntentionStruct> list2 = C0CQA.LIZ;
                    C0CQA.LIZIZ(entry.getKey(), intentionSource3.subIntention);
                }
            }
        }
    }

    public static void LIZLLL(String str) {
        NUIntentionModel nUIntentionModelLIZ = LIZ();
        if (nUIntentionModelLIZ == null) {
            ((ArrayList) LIZIZ).add(new ARunnableS18S1000000_28(str, 2));
            return;
        }
        Map<String, List<IntentionSource>> map = nUIntentionModelLIZ.intentions;
        for (Map.Entry<String, List<IntentionSource>> entry : map.entrySet()) {
            List<IntentionSource> list = map.get(entry.getKey());
            IntentionSource intentionSource = null;
            if (list != null) {
                Iterator<IntentionSource> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    IntentionSource next = it2.next();
                    IntentionSource intentionSource2 = next;
                    if (Intrinsics.LJFF(intentionSource2.type, "paid_ads_api") && intentionSource2.value.contains(str)) {
                        intentionSource = next;
                        break;
                    }
                }
                IntentionSource intentionSource3 = intentionSource;
                if (intentionSource3 != null) {
                    List<IntentionStruct> list2 = C0CQA.LIZ;
                    C0CQA.LIZIZ(entry.getKey(), intentionSource3.subIntention);
                }
            }
        }
        C0CQA.LIZIZ("paid_ads", str);
    }

    public static void LJ(String str) {
        NUIntentionModel nUIntentionModelLIZ = LIZ();
        if (nUIntentionModelLIZ == null) {
            ((ArrayList) LIZIZ).add(new ARunnableS8S1000000_13(str, 13));
            return;
        }
        Map<String, List<IntentionSource>> map = nUIntentionModelLIZ.intentions;
        for (Map.Entry<String, List<IntentionSource>> entry : map.entrySet()) {
            List<IntentionSource> list = map.get(entry.getKey());
            IntentionSource intentionSource = null;
            if (list != null) {
                Iterator<IntentionSource> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    IntentionSource next = it2.next();
                    IntentionSource intentionSource2 = next;
                    if (Intrinsics.LJFF(intentionSource2.type, "push_click_label")) {
                        Iterator<String> it3 = intentionSource2.value.iterator();
                        while (it3.hasNext()) {
                            if (a0.LJJIIZI(str, it3.next(), false)) {
                                intentionSource = next;
                                break;
                            }
                        }
                    }
                }
                IntentionSource intentionSource3 = intentionSource;
                if (intentionSource3 != null) {
                    List<IntentionStruct> list2 = C0CQA.LIZ;
                    C0CQA.LIZIZ(entry.getKey(), intentionSource3.subIntention);
                }
            }
        }
    }
}
