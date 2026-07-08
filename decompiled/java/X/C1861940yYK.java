package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoClientExt;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoMixFeed;
import defpackage.u2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0yYK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1861940yYK {
    public static final HashSet<String> LIZ = new HashSet<>();
    public static final HashMap<String, List<Message>> LIZIZ = new HashMap<>();

    public static boolean LIZIZ() {
        u2 u2VarLJFF;
        return C1860520yW2.LJFF(C1860520yW2.LIZ) || ((u2VarLJFF = C1863380yae.LJJII.LJFF(1, 1L)) != null && u2VarLJFF.LJI);
    }

    public static boolean LIZJ(String str) {
        if (str == null) {
            return false;
        }
        return LIZ.contains(str);
    }

    public static void LIZLLL(List list) {
        TakoClientExt takoClientExt;
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Message message = (Message) obj;
            if (message.msgType == 3 && !message.sender.isSelf) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            TakoMixFeed takoMixFeedLJIIIZ = ((Message) it2.next()).LJIIIZ();
            if (takoMixFeedLJIIIZ != null && (takoClientExt = takoMixFeedLJIIIZ.clientExt) != null && (str = takoClientExt.carryRepeatKey) != null && str.length() > 0) {
                LIZ.add(str);
            }
        }
    }

    public static void LJ(List list) {
        TakoMixFeed takoMixFeedLJIIIZ;
        TakoClientExt takoClientExt;
        String str;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Message) obj).msgType == 3) {
                arrayList.add(obj);
            }
        }
        Message message = (Message) C13LP.LJJJLL(arrayList);
        if (message != null && (takoMixFeedLJIIIZ = message.LJIIIZ()) != null && (takoClientExt = takoMixFeedLJIIIZ.clientExt) != null && (str = takoClientExt.carryRepeatKey) != null) {
            LIZIZ.put(str, arrayList);
        }
    }

    public static boolean LJFF(u2 u2Var) {
        if (!u2Var.LJI && !C1860520yW2.LJFF(C1860520yW2.LIZ)) {
            return true;
        }
        return false;
    }

    public static void LIZ(IMessageAbility iMessageAbility, long j, int i, Function1 function1) {
        u2 u2VarLJFF = C1863380yae.LJJII.LJFF(Integer.valueOf(i), Long.valueOf(j));
        if (u2VarLJFF != null) {
            function1.invoke(u2VarLJFF);
        } else {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C322110Cjx(function1, iMessageAbility, null), 3);
        }
    }
}
