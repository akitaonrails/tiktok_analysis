package X;

import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0dL2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046460dL2 implements InterfaceC1046560dLC {
    public final String LIZ;
    public final C1046510dL7 LIZIZ;
    public final View LIZJ;
    public final HashSet<String> LIZLLL;
    public long LJ;
    public long LJFF;
    public final C1046520dL8 LJI;
    public int LJII;
    public boolean LJIIIIZZ;
    public float LJIIJ;
    public final long LJIILL;
    public float LJIIIZ = -1.0f;
    public final Map<String, Float> LJIIJJI = new LinkedHashMap();
    public final long LJIIL = SystemClock.elapsedRealtime();
    public final AtomicLong LJIILIIL = new AtomicLong();
    public final AtomicLong LJIILJJIL = new AtomicLong();

    public final void LIZJ() {
        this.LJ = 0L;
        this.LJFF = SystemClock.elapsedRealtime();
        this.LJIIIIZZ = false;
    }

    @Override // X.InterfaceC1046560dLC
    public final void end() {
        for (Map.Entry entry : ((LinkedHashMap) this.LJIIJJI).entrySet()) {
            String str = (String) entry.getKey();
            float fFloatValue = ((Number) entry.getValue()).floatValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append(',');
            sbLIZ.append(fFloatValue);
            sbLIZ.append(';');
            C2188811AlT.LIZIZ(sbLIZ);
        }
        this.LIZIZ.LJ.LIZIZ(this.LIZ, this.LJIIIZ, this.LJIIJ, SystemClock.elapsedRealtime() - this.LJIIL, this.LJIILIIL.get(), this.LJIILJJIL.get());
    }

    @Override // X.InterfaceC1046560dLC
    public final void polling() {
        String strLIZ = this.LIZIZ.LJ.LIZ();
        if (a0.LJJJIL(strLIZ)) {
            this.LJI.LIZ();
            this.LIZLLL.clear();
            return;
        }
        if (!Intrinsics.LJFF(this.LIZ, strLIZ)) {
            this.LJIILJJIL.incrementAndGet();
        } else if (this.LIZIZ.LJ.isPlaying()) {
            EnumC1046210dKd enumC1046210dKd = EnumC1046210dKd.USE_HALF;
            this.LIZIZ.getClass();
            C1046180dKa.LIZLLL.LIZJ(this.LIZJ, this.LIZLLL, new C1046220dKe(enumC1046210dKd, this.LIZIZ.LIZJ, 4), new InterfaceC1046170dKZ() { // from class: X.0dL6
                @Override // X.InterfaceC1046170dKZ
                public final void LIZ(C1046150dKX c1046150dKX) {
                    C1046460dL2 c1046460dL2 = this.LIZ;
                    c1046460dL2.LIZ(c1046150dKX);
                    if (c1046150dKX.LIZ) {
                        if (c1046460dL2.LJIIIIZZ) {
                            c1046460dL2.LJ = SystemClock.elapsedRealtime() - c1046460dL2.LJFF;
                        } else {
                            c1046460dL2.LJFF = SystemClock.elapsedRealtime();
                            c1046460dL2.LJIIIIZZ = true;
                        }
                        c1046460dL2.LIZIZ(c1046460dL2.LJ, "polling");
                        return;
                    }
                    c1046460dL2.LIZJ();
                }
            });
        } else {
            this.LJIILJJIL.incrementAndGet();
            LIZJ();
        }
        if (this.LJ >= this.LJIILL) {
            this.LJI.LIZ();
        }
    }

    public final void LIZ(C1046150dKX c1046150dKX) {
        this.LJIIIZ = Math.max(this.LJIIIZ, c1046150dKX.LIZLLL);
        this.LJIILIIL.incrementAndGet();
        List<C1046160dKY> list = c1046150dKX.LJ;
        if (list != null) {
            float f = 0.0f;
            for (C1046160dKY c1046160dKY : list) {
                if (Intrinsics.LJFF("desc", c1046160dKY.LIZ) || Intrinsics.LJFF("title", c1046160dKY.LIZ)) {
                    f += c1046160dKY.LIZIZ;
                }
                if (this.LJIIJJI.size() <= 20) {
                    if (c1046160dKY.LIZIZ >= 0.005f) {
                        this.LJIIJJI.put(c1046160dKY.LIZ, Float.valueOf(((float) Math.rint(r1 * r3)) / 100));
                    }
                }
            }
            this.LJIIJ = Math.max(f, this.LJIIJ);
        }
    }

    public final void LIZIZ(long j, String str) {
        for (EnumC1046470dL3 enumC1046470dL3 : this.LIZIZ.LIZ) {
            if (j >= enumC1046470dL3.getDuration() && (this.LJII & enumC1046470dL3.getValue()) == 0) {
                this.LJII |= enumC1046470dL3.getValue();
                this.LIZIZ.LJ.LIZJ(this.LIZ, str, enumC1046470dL3);
            }
        }
    }

    public C1046460dL2(String str, Context context, C1046510dL7 c1046510dL7, View view, HashSet<String> hashSet) {
        long jLongValue;
        this.LIZ = str;
        this.LIZIZ = c1046510dL7;
        this.LIZJ = view;
        this.LIZLLL = hashSet;
        this.LJI = new C1046520dL8(c1046510dL7, this);
        List<EnumC1046470dL3> list = c1046510dL7.LIZ;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<EnumC1046470dL3> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(Long.valueOf(it2.next().getDuration()));
        }
        if (arrayList.isEmpty()) {
            jLongValue = -1;
        } else {
            jLongValue = ((Number) ListProtector.get(arrayList, 0)).longValue();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                long jLongValue2 = ((Number) it3.next()).longValue();
                if (jLongValue < jLongValue2) {
                    jLongValue = jLongValue2;
                }
            }
        }
        this.LJIILL = jLongValue;
    }
}
