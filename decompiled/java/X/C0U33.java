package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS245S0000000_12;

/* JADX INFO: renamed from: X.0U33, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U33 {
    public static final /* synthetic */ int LJFF = 0;
    public int LIZ;
    public volatile int LIZIZ;
    public final C784850UqZ LIZJ;
    public final ConcurrentLinkedDeque<C0U38> LIZLLL;
    public final HashMap<Long, C0U37> LJ;

    public final List<Pair<Long, Integer>> LJ() {
        Collection<C0U37> collectionValues = this.LJ.values();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(collectionValues, 10));
        for (C0U37 c0u37 : collectionValues) {
            arrayList.add(new Pair(Long.valueOf(c0u37.LIZ), Integer.valueOf(Math.min(100, (c0u37.LIZJ * 100) / c0u37.LIZLLL))));
        }
        return arrayList;
    }

    public C0U33(int i) {
        this.LIZ = i;
        C784850UqZ c784850UqZ = new C784850UqZ(InterfaceC766480U4w.LJJL.LIZIZ());
        c784850UqZ.registerOnEvictionListener(AFwS245S0000000_12.get$arr$(194));
        this.LIZJ = c784850UqZ;
        this.LIZLLL = new ConcurrentLinkedDeque<>();
        this.LJ = new HashMap<>();
    }

    public static void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(".tp");
        for (File file : C1697810uHb.LJIIJJI(new C0VSJ(str), new C0VSJ(C2188811AlT.LIZIZ(sbLIZ)))) {
            if (file.exists()) {
                file.delete();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.InterfaceC1364105Vn<? super kotlin.Pair<X.C0U22, ? extends X.EnumC765560U1i>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0U34
            if (r0 == 0) goto L5a
            r4 = r7
            X.0U34 r4 = (X.C0U34) r4
            int r2 = r4.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r4.LLILZ = r2
        L12:
            java.lang.Object r1 = r4.LLILLJJLI
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r4.LLILZ
            r3 = 1
            if (r0 == 0) goto L2a
            if (r0 != r3) goto L60
            X.0U22 r2 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r2, r1)
            return r3
        L2a:
            X.C155000ia.LIZIZ(r1)
            int r0 = r6.LIZIZ
            if (r0 >= 0) goto L34
            r0 = 0
            r6.LIZIZ = r0
        L34:
            int r2 = r6.LIZIZ
            com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMaxDownloadCount r0 = com.bytedance.android.livesdk.livesetting.broadcast.LiveKaraokeMaxDownloadCount.INSTANCE
            int r0 = r0.maxCount()
            r1 = 0
            if (r2 >= r0) goto L70
            java.util.concurrent.ConcurrentLinkedDeque<X.0U38> r0 = r6.LIZLLL
            java.lang.Object r0 = r0.pollFirst()
            X.0U38 r0 = (X.C0U38) r0
            if (r0 == 0) goto L68
            X.0U22 r2 = r0.LIZ
            boolean r1 = r0.LIZJ
            kotlin.jvm.functions.Function2<java.lang.Long, java.lang.Integer, kotlin.Unit> r0 = r0.LIZIZ
            r4.LL = r2
            r4.LLILZ = r3
            java.lang.Object r1 = r6.LIZLLL(r2, r1, r0, r4)
            if (r1 != r5) goto L24
            return r5
        L5a:
            X.0U34 r4 = new X.0U34
            r4.<init>(r6, r7)
            goto L12
        L60:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L68:
            X.0U1i r0 = X.EnumC765560U1i.FAIL
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r0)
            return r3
        L70:
            X.0U1i r0 = X.EnumC765560U1i.FAIL
            kotlin.Pair r3 = new kotlin.Pair
            r3.<init>(r1, r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0U33.LJFF(X.05Vn):java.lang.Object");
    }

    public static void LIZJ(C0U22 c0u22, boolean z) {
        List listLJIIJJI;
        int i = 0;
        if (z) {
            listLJIIJJI = C1697810uHb.LJIIJJI("", "", c0u22.LJIIIZ.LIZ);
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(c0u22.LIZIZ.LIZ, c0u22.LJIIIIZZ.LIZ, c0u22.LJIIIZ.LIZ);
        }
        for (Object obj : listLJIIJJI) {
            int i2 = i + 1;
            if (i >= 0) {
                String str = (String) obj;
                if (i == 2) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    EnumC771350UNp enumC771350UNp = EnumC771350UNp.LIVE_KARAOKE;
                    sbLIZ.append(enumC771350UNp.getFullPath());
                    sbLIZ.append(str);
                    sbLIZ.append(".lrc");
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(enumC771350UNp.getFullPath());
                    sbLIZ2.append(str);
                    sbLIZ2.append(".krc");
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(EnumC771350UNp.LIVE_KARAOKE.getFullPath());
                    sbLIZ3.append(str);
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ3));
                }
                i = i2;
            } else {
                C1697810uHb.LJIJI();
                throw null;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.ArrayList] */
    public final synchronized void LIZ(C0U22 c0u22, boolean z) {
        ?? LJIIJJI;
        if (!z) {
            List listLJIIJJI = C1697810uHb.LJIIJJI(c0u22.LIZIZ, c0u22.LJIIIIZZ, c0u22.LJIIIZ);
            LJIIJJI = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
            Iterator it2 = listLJIIJJI.iterator();
            while (it2.hasNext()) {
                LJIIJJI.add(((C0U3A) it2.next()).LIZ);
            }
        } else {
            LJIIJJI = C1697810uHb.LJIIJJI("", "", c0u22.LJIIIZ.LIZ);
        }
        this.LIZJ.put(Long.valueOf(c0u22.LIZ), LJIIJJI);
    }

    public final Object LIZLLL(C0U22 c0u22, boolean z, Function2<? super Long, ? super Integer, Unit> function2, InterfaceC1364105Vn<? super EnumC765560U1i> interfaceC1364105Vn) {
        return C23250099c.LJI(interfaceC1364105Vn, C0PEM.LIZJ, new C0U32(this, c0u22, function2, z, null));
    }
}
