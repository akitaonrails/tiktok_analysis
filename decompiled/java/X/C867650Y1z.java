package X;

import Y.ARunnableS83S0200000_14;
import com.bytedance.im.core.proto.ReferenceInfo;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Y1z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C867650Y1z {
    public static final /* synthetic */ int LIZ = 0;

    public static List LIZ(C0YEM c0yem, String str, C0YUT c0yut) {
        boolean z;
        C869620Y9o c869620Y9oLIZJ = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LIZJ();
        C869580Y9k c869580Y9kLJI = c0yem.LJIIZILJ().LIZIZ().LIZIZ().LJI();
        List<Pair<String, String>> listLIZJ = c869620Y9oLIZJ.LIZJ(str);
        if (listLIZJ != null && !listLIZJ.isEmpty()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Pair<String, String> pair : listLIZJ) {
            try {
                String first = pair.getFirst();
                String second = pair.getSecond();
                Gson gson = C09EF.LIZ;
                C872750YLp c872750YLpNewBuilder = ((ReferenceInfo) GsonProtectorUtils.fromJson(gson, second, ReferenceInfo.class)).newBuilder();
                c872750YLpNewBuilder.LJI = c0yut;
                ReferenceInfo referenceInfoBuild = c872750YLpNewBuilder.build();
                String json = GsonProtectorUtils.toJson(gson, referenceInfoBuild);
                C869590Y9l c869590Y9lLJJJI = c869580Y9kLJI.LJJJI(first);
                if (c869590Y9lLJJJI != null) {
                    c869590Y9lLJJJI.setRefMsg(referenceInfoBuild);
                    arrayList.add(c869590Y9lLJJJI);
                    c869620Y9oLIZJ.LLII(first, c869590Y9lLJJJI.getConversationId(), str, json);
                }
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                c0yem.LIZLLL().LJIIIZ("updateRefMsgListStatus json error", e);
            }
        }
        return arrayList;
    }

    public static final void LIZIZ(C0YEM c0yem, String str, C0YUT c0yut) {
        List listLIZ = LIZ(c0yem, str, c0yut);
        if (listLIZ != null && !((ArrayList) listLIZ).isEmpty()) {
            c0yem.LJIIZILJ().getDomain().LIZ().LJ(new ARunnableS83S0200000_14(c0yem, listLIZ, 1));
        }
    }
}
