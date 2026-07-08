package X;

import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.model.SearchMixFeed;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS45S0500000_10;

/* JADX INFO: renamed from: X.0PHl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642350PHl {
    public static final C642350PHl LIZ = new C642350PHl();

    public static void LIZ(C0PHT c0pht, List list, EnumC642390PHp enumC642390PHp, C0PSG c0psg, C642360PHm c642360PHm, InterfaceC642370PHn interfaceC642370PHn) {
        C0PCX c0pcx;
        HashMap<String, Object> map;
        HashMap<String, Object> map2;
        C0PHW c0phwLJ;
        C0PHX c0phx;
        C0PHX c0phx2;
        System.currentTimeMillis();
        if (enumC642390PHp == EnumC642390PHp.REBIND) {
            c0pcx = (C0PCX) C0Q3E.LJI().lI1().LIZJ();
        } else {
            c0pcx = null;
        }
        AwS45S0500000_10 awS45S0500000_10 = new AwS45S0500000_10(list, (List<? extends SearchMixFeed>) interfaceC642370PHn, (InterfaceC642370PHn) c0pcx, (C0PCX) c0psg, (C0PSG) c0pht, (C0PHT) 2);
        int i = C642380PHo.LIZ[enumC642390PHp.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (c642360PHm != null) {
                            C0PHR.LIZ.getClass();
                            int i2 = C0PJ7.LIZ[c642360PHm.LIZJ.ordinal()];
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    throw new C1954807lC();
                                }
                                return;
                            }
                            C0PHW c0phw = c0pht.LJ;
                            if (c0phw != null && (c0phwLJ = c0phw.LJ()) != null && (c0phx = c0phwLJ.LIZJ) != null && (c0phx2 = c0phx.LIZLLL) != null) {
                                C0PHX c0phx3 = c0phx2.LIZLLL;
                                C0PHX c0phx4 = c642360PHm.LIZLLL;
                                if (c0phx4 != null) {
                                    int i3 = C0PJ7.LIZIZ[c642360PHm.LIZIZ.ordinal()];
                                    if (i3 != 1) {
                                        if (i3 == 2) {
                                            if (c0phx3 != null) {
                                                c0phx3.LJI(c0phx4);
                                                return;
                                            }
                                            return;
                                        }
                                        throw new C1954807lC();
                                    }
                                    c0phx2.LJI(c0phx4);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new C1954807lC();
                }
                C0PHR.LIZ.getClass();
                C642410PHr c642410PHr = new C642410PHr(c0pht);
                awS45S0500000_10.invoke(c642410PHr);
                c642410PHr.LIZIZ();
                if (C0PHR.LIZIZ) {
                    C0PI1.LIZIZ(c0pht, "append inner stream");
                    return;
                }
                return;
            }
            C0PHR.LIZ.getClass();
            C642400PHq c642400PHq = new C642400PHq(c0pht);
            awS45S0500000_10.invoke(c642400PHq);
            c642400PHq.LIZIZ();
            return;
        }
        C0PHR.LIZ.getClass();
        C0PHT c0pht2 = new C0PHT(null, 511);
        C642400PHq c642400PHq2 = new C642400PHq(c0pht2);
        awS45S0500000_10.invoke(c642400PHq2);
        c642400PHq2.LIZIZ();
        for (C0PHX c0phx5 = c0pht2.LIZ; c0phx5 != null; c0phx5 = c0phx5.LIZLLL) {
            c0phx5.LIZ = c0pht;
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
        if (C0PHR.LIZIZ) {
            C0PI1.LIZ(c0pht, "merge stream");
        }
    }
}
