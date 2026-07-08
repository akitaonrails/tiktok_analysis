package X;

import com.ss.android.ugc.aweme.creative.model.AIGCExtraModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS231S0300000_22;
import kotlin.jvm.internal.AwS388S0200000_22;
import kotlin.jvm.internal.AwS55S0500000_22;

/* JADX INFO: renamed from: X.0nkx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446930nkx {
    public static void LIZJ(Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("gc_mark_provider_");
        sbLIZ.append(C1017903yT.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        if (C1437010nUx.LIZ()) {
            ((ConcurrentHashMap) C1446960nl0.LIZLLL).put(strLIZIZ, new Pair(setSingleton, function1));
        }
    }

    public static void LIZLLL(Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("iptc_provider_");
        sbLIZ.append(C1017903yT.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        if (C306460Bzo.LIZ()) {
            ((ConcurrentHashMap) C1446960nl0.LJ).put(strLIZIZ, new Pair(setSingleton, function1));
        }
    }

    public static void LJ(Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("exif_provider_");
        sbLIZ.append(C1017903yT.LIZ());
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        ((ConcurrentHashMap) C1446960nl0.LIZ).put(strLIZIZ, new Pair(setSingleton, function1));
    }

    public static void LJII(Function1 function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("pass_through_provider_");
        sbLIZ.append(C1017903yT.LIZ());
        ((ConcurrentHashMap) C1446960nl0.LIZJ).put(C2188811AlT.LIZIZ(sbLIZ), function1);
    }

    public static final C443120HZe<EnumC1446970nl1, List<String>, List<String>> LIZ(VideoPublishEditModel videoPublishEditModel, Function1<? super C1446940nky, Unit> function1) {
        EnumC1403260mcW next;
        boolean z;
        EnumC1446970nl1 enumC1446970nl1;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "delay_aigc_safety_provider_register", true, true)) {
            C0CHQ.LIZ().LJJIII();
            C1444300ngi.LIZ();
        }
        C1446940nky c1446940nky = new C1446940nky();
        function1.invoke(c1446940nky);
        ArrayList arrayList = new ArrayList();
        Iterator<EnumC1403260mcW> it2 = EnumC1403260mcW.getEntries().iterator();
        do {
            next = null;
            if (!it2.hasNext()) {
                break;
            }
            next = it2.next();
        } while (!next.getPredicate().invoke(videoPublishEditModel).booleanValue());
        EnumC1403260mcW enumC1403260mcW = next;
        EnumC1446970nl1 enumC1446970nl1LIZ = C1447000nl4.LIZ(new AwS388S0200000_22(enumC1403260mcW, videoPublishEditModel, 303));
        EnumC1446970nl1 enumC1446970nl1LIZ2 = C1447000nl4.LIZ(new AwS231S0300000_22(enumC1403260mcW, (EnumC1403260mcW) videoPublishEditModel, (VideoPublishEditModel) arrayList, (List<String>) 43));
        EnumC1446970nl1 enumC1446970nl1LIZ3 = C1447000nl4.LIZ(new AwS388S0200000_22(enumC1403260mcW, videoPublishEditModel, 304));
        EnumC1446970nl1 enumC1446970nl1LIZ4 = C1447000nl4.LIZ(new AwS388S0200000_22(enumC1403260mcW, videoPublishEditModel, 305));
        AIGCExtraModel aIGCExtraModel = videoPublishEditModel.creativeModel.aigcExtraModel;
        if (enumC1446970nl1LIZ2 == EnumC1446970nl1.AIGC_LABEL_AUTO) {
            z = true;
        } else {
            z = false;
        }
        aIGCExtraModel.aigcEdited = z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) C1446960nl0.LIZJ;
        if (!concurrentHashMap.isEmpty()) {
            for (Map.Entry entry : concurrentHashMap.entrySet()) {
                entry.getKey();
                if (((Boolean) ((Function1) entry.getValue()).invoke(videoPublishEditModel)).booleanValue()) {
                    enumC1446970nl1 = EnumC1446970nl1.AIGC_LABEL_AUTO;
                    break;
                }
            }
            enumC1446970nl1 = EnumC1446970nl1.AIGC_LABEL_UNKNOWN;
        } else {
            enumC1446970nl1 = EnumC1446970nl1.AIGC_LABEL_UNKNOWN;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Pair pair = (Pair) ((ConcurrentHashMap) C1446960nl0.LJFF).get(it3.next());
            if (pair != null) {
                Set set = (Set) pair.getFirst();
                Function1 function12 = (Function1) pair.getSecond();
                if (set.contains(EnumC1403260mcW.ALL) || C13LP.LJJJJ(enumC1403260mcW, set)) {
                    Object objInvoke = function12.invoke(videoPublishEditModel);
                    if (objInvoke != null) {
                        arrayList2.add(objInvoke);
                    }
                }
            }
        }
        List<String> listLJIJJLI = C15438062q.LJIJJLI(arrayList2);
        AIGCExtraModel aIGCExtraModel2 = videoPublishEditModel.creativeModel.aigcExtraModel;
        aIGCExtraModel2.aigcServerTaskIdAcquired = true;
        aIGCExtraModel2.aigcServerTaskIds = listLJIJJLI;
        C443120HZe<EnumC1446970nl1, List<String>, List<String>> c443120HZe = new C443120HZe<>(C1447000nl4.LIZ(new AwS55S0500000_22(enumC1446970nl1LIZ, enumC1446970nl1LIZ2, enumC1446970nl1, enumC1446970nl1LIZ3, enumC1446970nl1LIZ4, 2)), arrayList, listLJIJJLI);
        Iterator<String> it4 = c1446940nky.LIZ.iterator();
        while (it4.hasNext()) {
            ((ConcurrentHashMap) C1446960nl0.LIZIZ).remove(it4.next());
        }
        return c443120HZe;
    }

    public static void LIZIZ(String str, Function1 function1) {
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        C1155804fc c1155804fc = new C1155804fc(str, function1);
        ((ConcurrentHashMap) C1446960nl0.LIZIZ).put(str, new Pair(setSingleton, c1155804fc));
    }

    public static void LJFF(String str, Function1 function1) {
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        ((ConcurrentHashMap) C1446960nl0.LIZIZ).put(str, new Pair(setSingleton, function1));
    }

    public static void LJI(String str, Function1 function1) {
        Set setSingleton = Collections.singleton(EnumC1403260mcW.ALL);
        ((ConcurrentHashMap) C1446960nl0.LJFF).put(str, new Pair(setSingleton, function1));
    }
}
