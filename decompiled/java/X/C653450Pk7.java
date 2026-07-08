package X;

import Y.ARunnableS43S0300000_10;
import android.os.Bundle;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.search.common.model.ContinuousLoadingAwemeList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS150S0101000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pk7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C653450Pk7<T> implements InterfaceC650320Pf4<C737030Svd> {
    public AbstractC21673619ry<?> LIZ;
    public List<? extends Aweme> LIZJ;
    public AwS589S0100000_10 LIZLLL;
    public final Map<String, Pair<Integer, Aweme>> LIZIZ = new ConcurrentHashMap();
    public final C01GW LJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(714));

    @Override // X.InterfaceC650320Pf4
    public final Class<C737030Svd> LIZ() {
        return C737030Svd.class;
    }

    public C653450Pk7(AbstractC21673619ry<?> abstractC21673619ry) {
        this.LIZ = abstractC21673619ry;
        C650300Pf2.LIZLLL.LIZ(this);
    }

    @Override // X.InterfaceC650320Pf4
    public final void LIZIZ(C737030Svd c737030Svd) {
        Integer numValueOf;
        Integer numValueOf2;
        Integer numValueOf3;
        C737030Svd c737030Svd2 = c737030Svd;
        if (c737030Svd2.LIZ == 13) {
            IAwemeService iAwemeService = (IAwemeService) this.LJ.getValue();
            String str = (String) c737030Svd2.LIZIZ;
            if (str == null) {
                str = "";
            }
            Aweme awemeLLILZ = iAwemeService.LLILZ(str);
            Iterator<T> it2 = ((ConcurrentHashMap) this.LIZIZ).entrySet().iterator();
            while (it2.hasNext()) {
                Aweme aweme = (Aweme) ((Pair) ((Map.Entry) it2.next()).getValue()).getSecond();
                if (Intrinsics.LJFF(aweme.getAid(), c737030Svd2.LIZIZ)) {
                    Bundle bundle = c737030Svd2.LIZJ;
                    if (bundle != null && (numValueOf3 = Integer.valueOf(bundle.getInt("user_digged"))) != null) {
                        aweme.setUserDigg(numValueOf3.intValue());
                    }
                    if (awemeLLILZ != null) {
                        aweme.setUserDigg(awemeLLILZ.getUserDigg());
                        AwemeStatistics statistics = awemeLLILZ.getStatistics();
                        if (statistics != null) {
                            aweme.getStatistics().setDiggCount(statistics.getDiggCount());
                        }
                    }
                }
            }
            Iterator<T> it3 = C653460Pk8.LIZJ.entrySet().iterator();
            while (it3.hasNext()) {
                List<Aweme> list = ((ContinuousLoadingAwemeList) ((Map.Entry) it3.next()).getValue()).awemeList;
                if (list != null) {
                    for (Aweme aweme2 : list) {
                        if (Intrinsics.LJFF(aweme2.getAid(), c737030Svd2.LIZIZ)) {
                            Bundle bundle2 = c737030Svd2.LIZJ;
                            if (bundle2 != null && (numValueOf2 = Integer.valueOf(bundle2.getInt("user_digged"))) != null) {
                                aweme2.setUserDigg(numValueOf2.intValue());
                            }
                            if (awemeLLILZ != null) {
                                aweme2.setUserDigg(awemeLLILZ.getUserDigg());
                                AwemeStatistics statistics2 = awemeLLILZ.getStatistics();
                                if (statistics2 != null) {
                                    aweme2.getStatistics().setDiggCount(statistics2.getDiggCount());
                                }
                            }
                        }
                    }
                }
            }
            List<? extends Aweme> list2 = this.LIZJ;
            if (list2 != null) {
                for (Aweme aweme3 : (ArrayList) list2) {
                    if (aweme3 != null && Intrinsics.LJFF(aweme3.getAid(), c737030Svd2.LIZIZ)) {
                        Bundle bundle3 = c737030Svd2.LIZJ;
                        if (bundle3 != null && (numValueOf = Integer.valueOf(bundle3.getInt("user_digged"))) != null) {
                            aweme3.setUserDigg(numValueOf.intValue());
                        }
                        if (awemeLLILZ != null) {
                            aweme3.setUserDigg(awemeLLILZ.getUserDigg());
                            AwemeStatistics statistics3 = awemeLLILZ.getStatistics();
                            if (statistics3 != null) {
                                aweme3.getStatistics().setDiggCount(statistics3.getDiggCount());
                            }
                        }
                    }
                }
            }
            Pair pair = (Pair) ((ConcurrentHashMap) this.LIZIZ).get(c737030Svd2.LIZIZ);
            if (pair != null) {
                int iIntValue = ((Number) pair.getFirst()).intValue();
                if (((Boolean) C272430Am1.LIZ.getValue()).booleanValue()) {
                    C0CNO.LIZLLL(0L, new AwS150S0101000_10(this, (C653450Pk7<Object>) iIntValue, 11));
                    return;
                }
                AbstractC21673619ry<?> abstractC21673619ry = this.LIZ;
                if (abstractC21673619ry != null) {
                    abstractC21673619ry.notifyItemChanged(iIntValue);
                }
                AwS589S0100000_10 awS589S0100000_10 = this.LIZLLL;
                if (awS589S0100000_10 == null) {
                    return;
                }
                awS589S0100000_10.invoke(Integer.valueOf(iIntValue));
            }
        }
    }

    public final void LIZJ(List<? extends T> list, Function1<? super T, ? extends Aweme> function1) {
        this.LIZIZ.clear();
        if (list == null) {
            return;
        }
        C823050WQl.LIZJ().execute(new ARunnableS43S0300000_10(function1, list, this, 26));
    }

    public final void LIZLLL(List<? extends T> list, List<? extends T> list2, Function1<? super T, ? extends Aweme> function1) {
        String aid;
        ((ConcurrentHashMap) this.LIZIZ).clear();
        if (list != null) {
            int i = 0;
            for (T t : list) {
                int i2 = i + 1;
                if (i >= 0) {
                    Aweme awemeInvoke = function1.invoke(t);
                    if (awemeInvoke != null && (aid = awemeInvoke.getAid()) != null) {
                        ((ConcurrentHashMap) this.LIZIZ).put(aid, new Pair(Integer.valueOf(i), awemeInvoke));
                        ((IAwemeService) this.LJ.getValue()).LLILLL(awemeInvoke);
                    }
                    i = i2;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        if (list2 != null && (!list2.isEmpty())) {
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list2, 10));
            Iterator<? extends T> it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(function1.invoke(it2.next()));
            }
            this.LIZJ = arrayList;
        }
    }
}
