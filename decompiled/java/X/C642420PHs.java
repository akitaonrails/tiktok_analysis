package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PHs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642420PHs {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(C0PHT c0pht, List list, String str) {
        Object next;
        C0PHX c0phx = null;
        for (C0PHW c0phwLIZLLL = c0pht.LIZLLL(); c0phwLIZLLL != null; c0phwLIZLLL = c0phwLIZLLL.LIZ()) {
            C0PHX c0phx2 = c0phwLIZLLL.LIZJ;
            c0phx2.LJ();
            if (Intrinsics.LJFF(c0phx2.LJIIIZ, str)) {
                c0phx = c0phwLIZLLL.LIZJ;
            }
        }
        if (c0phx != null) {
            c0phx.LJ();
            List<C0PHW> list2 = c0phx.LJIIJJI;
            if (list2 != null) {
                for (C0PHW c0phw : (ArrayList) list2) {
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            next = it2.next();
                            if (Intrinsics.LJFF(((Aweme) next).getAid(), c0phw.LIZ)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    Aweme aweme = (Aweme) next;
                    if (aweme != null) {
                        aweme.getAid();
                    }
                    C642460PHw c642460PHw = new C642460PHw(aweme);
                    C0PHX c0phx3 = c0phw.LIZJ;
                    c0phx3.LJ();
                    String str2 = c0phx3.LJIIIZ;
                    C0P7A c0p7a = c0phw.LIZIZ.LJIIIZ;
                    String str3 = c0phw.LIZ;
                    C640970PCd c640970PCd = c0p7a.LIZ.get(C13LE.LIZ(C642460PHw.class));
                    if (c640970PCd == null) {
                        c640970PCd = new C640970PCd();
                        c0p7a.LIZ.put(C13LE.LIZ(C642460PHw.class), c640970PCd);
                    }
                    HashMap<String, Object> map = c640970PCd.LIZIZ;
                    if (map != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append(str3);
                        sbLIZ.append(str2);
                        map.put(C2188811AlT.LIZIZ(sbLIZ), c642460PHw);
                    }
                }
            }
        }
    }

    public static void LIZ(C0PHT c0pht, List list, EnumC642470PHx enumC642470PHx, Fragment fragment, Context context) {
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        if (list.isEmpty()) {
            return;
        }
        AwS219S0300000_10 awS219S0300000_10 = new AwS219S0300000_10(list, (List<? extends InterfaceC1858000yRy>) fragment, (Fragment) context, (Context) 25);
        int i = C642480PHy.LIZ[enumC642470PHx.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C642410PHr c642410PHr = new C642410PHr(c0pht);
                    awS219S0300000_10.invoke(c642410PHr);
                    c642410PHr.LIZIZ();
                    C0PI0.LIZIZ(c0pht, "append inner stream");
                    return;
                }
                throw new C1954807lC();
            }
            C642400PHq c642400PHq = new C642400PHq(c0pht);
            awS219S0300000_10.invoke(c642400PHq);
            c642400PHq.LIZIZ();
            C0PI0.LIZ(c0pht, "append out stream");
            return;
        }
        C0PHT c0pht2 = new C0PHT(null, 511);
        C642400PHq c642400PHq2 = new C642400PHq(c0pht2);
        awS219S0300000_10.invoke(c642400PHq2);
        c642400PHq2.LIZIZ();
        C0PI0.LIZ(c0pht2, "create stream");
        for (C0PHX c0phx = c0pht2.LIZ; c0phx != null; c0phx = c0phx.LIZLLL) {
            c0phx.LIZ = c0pht;
        }
        c0pht.LIZJ = c0pht2.LIZJ;
        c0pht.LIZLLL = c0pht2.LIZLLL;
        c0pht.LJ = c0pht2.LJ;
        c0pht.LIZ = c0pht2.LIZ;
        c0pht.LIZIZ = c0pht2.LIZIZ;
        for (Map.Entry<C13IQ<?>, C640970PCd> entry : c0pht2.LJIIIZ.LIZ.entrySet()) {
            C13IQ<?> key = entry.getKey();
            if (c0pht.LJIIIZ.LIZ.get(key) == null) {
                c0pht.LJIIIZ.LIZ.put(key, entry.getValue());
            } else {
                for (Map.Entry<String, Object> entry2 : entry.getValue().LIZIZ.entrySet()) {
                    C640970PCd c640970PCd = c0pht.LJIIIZ.LIZ.get(key);
                    if (c640970PCd != null && (map2 = c640970PCd.LIZIZ) != null) {
                        map2.put(entry2.getKey(), entry2.getValue());
                    }
                }
                for (Map.Entry<String, Object> entry3 : entry.getValue().LIZ.entrySet()) {
                    C640970PCd c640970PCd2 = c0pht.LJIIIZ.LIZ.get(key);
                    if (c640970PCd2 != null && (map = c640970PCd2.LIZIZ) != null) {
                        map.put(entry3.getKey(), entry3.getValue());
                    }
                }
            }
        }
        c0pht2.LJIIIZ = c0pht.LJIIIZ;
        c0pht2.LJIIJ = c0pht.LJIIJ;
        C0PI0.LIZ(c0pht, "merge stream");
    }
}
