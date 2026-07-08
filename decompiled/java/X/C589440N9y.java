package X;

import android.content.Context;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N9y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C589440N9y {
    public Context LIZ;
    public C0NA0 LIZIZ;
    public C0NAA LIZJ;
    public C0NA1 LIZLLL;
    public C589380N9s LJ;
    public C0NA9 LJFF;
    public C0NAA LJI;
    public long LJIIIIZZ;
    public final CopyOnWriteArraySet<C0NAI> LJII = new CopyOnWriteArraySet<>();
    public final C0NA8 LJIIIZ = new C0NA8(this);

    public final void LIZ(Context context, C0NA0 c0na0) {
        this.LIZ = context;
        this.LIZIZ = c0na0;
        C0NA9 c0na9 = new C0NA9();
        this.LJFF = c0na9;
        C589380N9s c589380N9s = new C589380N9s(c0na9);
        this.LJ = c589380N9s;
        long j = c0na0.LJ;
        if (j > 0) {
            C589370N9r c589370N9r = c589380N9s.LIZIZ;
            c589370N9r.LLILLJJLI = j;
            BPEAHandler bPEAHandler = c0na9.LIZ;
            c589370N9r.LL = bPEAHandler;
            C786410Ut5.LJLIIL(j, bPEAHandler, c589370N9r);
        }
        C0NA1 c0na1 = new C0NA1();
        this.LIZLLL = c0na1;
        C589380N9s c589380N9s2 = this.LJ;
        Map<String, C00ET> map = c0na0.LIZIZ;
        C589250N9f c589250N9f = C589250N9f.LIZ;
        C0NA5 c0na5 = new C0NA5(map, c589250N9f, c0na0.LIZJ.booleanValue());
        c0na1.LIZIZ = c589380N9s2;
        c0na1.LIZ = c0na5;
        for (Map.Entry<String, C00ET> entry : map.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("create(");
            sbLIZ.append(c589250N9f);
            sbLIZ.append("): ");
            sbLIZ.append(entry.getKey());
            sbLIZ.append('-');
            sbLIZ.append(entry.getValue());
            C2188811AlT.LIZIZ(sbLIZ);
            AbstractC589320N9m abstractC589320N9mLIZ = c589250N9f.LIZ(entry.getKey());
            if (abstractC589320N9mLIZ != null) {
                C0NA6 c0na6 = c0na1.LJ;
                C00ET value = entry.getValue();
                abstractC589320N9mLIZ.LIZ = c0na6;
                abstractC589320N9mLIZ.LIZLLL(value);
                c0na1.LIZJ.put(abstractC589320N9mLIZ.LIZIZ(), abstractC589320N9mLIZ);
                List<String> listLIZJ = abstractC589320N9mLIZ.LIZJ();
                if (listLIZJ != null) {
                    Iterator<String> it2 = listLIZJ.iterator();
                    while (it2.hasNext()) {
                        c0na1.LIZIZ.LIZ(it2.next(), abstractC589320N9mLIZ.LIZJ);
                    }
                }
            }
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("CollectManager init, collector size is ");
        sbLIZ2.append(c0na1.LIZJ.size());
        C2188811AlT.LIZIZ(sbLIZ2);
        final C0NAA c0naa = this.LJI;
        if (c0naa == null) {
            c0naa = new C0NAA();
            this.LJI = c0naa;
        }
        this.LIZJ = c0naa;
        C0NA0 c0na02 = this.LIZIZ;
        C0NA7 c0na7 = c0na02.LIZ;
        C0NA9 c0na92 = this.LJFF;
        int i = c0na02.LJII;
        int i2 = c0na02.LJIIIIZZ;
        ArrayList<String> arrayList = c0na02.LJIIIZ;
        C0NA4 c0na4 = new C0NA4(c0na7, c0na92, i, i2, arrayList);
        c0naa.LIZIZ = c0na4;
        for (String str : arrayList) {
            if (((LinkedHashMap) c0naa.LIZJ).get(str) == null) {
                c0naa.LIZJ.put(str, new C0NAB(str));
                C0NAB c0nab = (C0NAB) ((LinkedHashMap) c0naa.LIZJ).get(str);
                if (c0nab != null) {
                    c0nab.LIZIZ();
                }
            }
            C0NAB c0nab2 = (C0NAB) ((LinkedHashMap) c0naa.LIZJ).get(str);
            if (c0nab2 != null) {
                int i3 = c0na4.LIZLLL;
                c0nab2.LJIIIZ = c0nab2.LIZ().getFloat("square_sum_v1", -1.0f);
                float f = c0nab2.LIZ().getFloat("old_square_sum_v1", -1.0f);
                c0nab2.LJIIJ = f;
                if (c0nab2.LJIIIZ == -1.0f) {
                    float f2 = c0nab2.LJII;
                    float f3 = c0nab2.LJFF;
                    c0nab2.LJIIIZ = f2 * f3 * f3;
                }
                if (f == -1.0f && i3 > 0) {
                    float f4 = c0nab2.LJI;
                    c0nab2.LJIIJ = i3 * f4 * f4;
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("OldSquareSumValue=");
                sbLIZ3.append(c0nab2.LJIIJ);
                sbLIZ3.append(", squareSumValue=");
                sbLIZ3.append(c0nab2.LJIIIZ);
                C2188811AlT.LIZIZ(sbLIZ3);
            }
        }
        C786410Ut5.LJLIIL(0L, c0na4.LIZIZ.LIZ, new Runnable() { // from class: X.0NA3
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PredictManager@9140.init$2");
                try {
                    c0naa.LIZIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PredictManager@9140.init$2");
            }
        });
        this.LIZJ.LIZ = this.LJIIIZ;
        InterfaceC589350N9p interfaceC589350N9p = new InterfaceC589350N9p() { // from class: X.0N9x
            @Override // X.InterfaceC589350N9p
            public final void onEvent(C589280N9i c589280N9i) {
                final C589440N9y c589440N9y = this.LIZ;
                c589440N9y.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (jUptimeMillis - c589440N9y.LJIIIIZZ < c589440N9y.LIZIZ.LIZLLL) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("skip prediction for frequency limitation, minInterval=");
                    sbLIZ4.append(c589440N9y.LIZIZ.LIZLLL);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    return;
                }
                c589440N9y.LJIIIIZZ = jUptimeMillis;
                c589440N9y.LJ.LIZIZ(new C589280N9i("on_predict", null));
                C0NA9 c0na93 = c589440N9y.LJFF;
                C786410Ut5.LJLIIL(0L, c0na93.LIZ, new Runnable() { // from class: X.0N9z
                    public final void LIZ() {
                        C0NA1 c0na12 = c589440N9y.LIZLLL;
                        if (c0na12.LIZLLL) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            for (Map.Entry entry2 : ((LinkedHashMap) c0na12.LIZJ).entrySet()) {
                                String str2 = (String) entry2.getKey();
                                for (Map.Entry entry3 : ((HashMap) ((AbstractC589320N9m) entry2.getValue()).LIZIZ).entrySet()) {
                                    if (c0na12.LIZ.LIZIZ) {
                                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                                        sbLIZ5.append(str2);
                                        sbLIZ5.append('_');
                                        sbLIZ5.append((String) entry3.getKey());
                                        linkedHashMap.put(C2188811AlT.LIZIZ(sbLIZ5), entry3.getValue());
                                    } else {
                                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                                    }
                                }
                            }
                            c0na12.LIZLLL = false;
                            C0NAA c0naa2 = c589440N9y.LIZJ;
                            c0naa2.LIZIZ.LIZ.LIZ(linkedHashMap, new C0NA2(c0naa2));
                        }
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("PythiaService@fd67.tryPrediction$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("PythiaService@fd67.tryPrediction$1");
                    }
                });
            }
        };
        for (String str2 : this.LIZIZ.LJFF) {
            if (!Intrinsics.LJFF(str2, "on_predict")) {
                this.LJ.LIZ(str2, interfaceC589350N9p);
            }
        }
    }
}
