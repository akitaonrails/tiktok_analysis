package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0dqr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066190dqr {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(396));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(397));
    public static final ConcurrentHashMap<String, Runnable> LIZJ = new ConcurrentHashMap<>();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(398));
    public static final LruCache<String, LruCache<String, C1066160dqo>> LJ = new LruCache<>(2);
    public static final LruCache<String, LruCache<String, C1066160dqo>> LJFF = new LruCache<>(2);
    public static final ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<C1066180dqq>>> LJI = new ConcurrentHashMap<>();
    public static final Map<String, String> LJII;
    public static final C01GW LJIIIIZZ;

    static {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        Map<String, String> map = C07KF.LIZ;
        Map<String, String> map2 = (Map) c0c64LJIILLIIL.LJJII(Map.class, map, "ec_pdp_header_image_resize", true);
        if (map2 != null) {
            map = map2;
        }
        LJII = map;
        LJIIIIZZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(305));
    }

    public static String LIZIZ(Integer num, String str) {
        EnumC955203oM enumC955203oM;
        String str2 = (String) LJIIIIZZ.getValue();
        Pair<Integer, Integer> pairLIZ = C1743690vTb.LIZ(str);
        String strLJFF = null;
        if (pairLIZ != null) {
            int iIntValue = pairLIZ.getFirst().intValue();
            int iIntValue2 = pairLIZ.getSecond().intValue();
            boolean z = true;
            if (Intrinsics.LJFF(C955103oL.LIZ.getValue(), "SA")) {
                enumC955203oM = EnumC955203oM.TTF;
            } else {
                EnumC955203oM[] enumC955203oMArrValues = EnumC955203oM.values();
                int length = enumC955203oMArrValues.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        enumC955203oM = enumC955203oMArrValues[i];
                        int bizType = enumC955203oM.getBizType();
                        if (num != null && bizType == num.intValue()) {
                            break;
                        }
                        i++;
                    } else {
                        enumC955203oM = EnumC955203oM.TTS;
                        break;
                    }
                }
            }
            if (enumC955203oM != EnumC955203oM.TTF) {
                z = false;
            }
            Pair pairLIZJ = LIZJ(iIntValue, iIntValue2, str2, z);
            strLJFF = C1743690vTb.LJFF(((Number) pairLIZJ.getFirst()).intValue(), ((Number) pairLIZJ.getSecond()).intValue(), str);
            int iHashCode = str2.hashCode();
            if (iHashCode == 2267 ? str2.equals("GB") : iHashCode == 2638 ? str2.equals("SA") : !(iHashCode != 2718 || !str2.equals("US"))) {
                strLJFF = u.LJJIFFI(strLJFF, "resize", "crop", false);
            }
            if (C1066200dqs.LIZ.enable && strLJFF != null) {
                C01GW<C603820NmG<String, C1066220dqu>> c01gw = C1066210dqt.LIZ;
                C1066220dqu c1066220dquLIZJ = c01gw.getValue().LIZJ(str);
                if (c1066220dquLIZJ != null) {
                    c01gw.getValue().LIZLLL(strLJFF, c1066220dquLIZJ);
                }
            }
        }
        return strLJFF;
    }

    public static boolean LIZLLL(String str, String str2) {
        LruCache<String, C1066160dqo> lruCache;
        if (str2 == null || a0.LJJJIL(str2)) {
            return false;
        }
        LruCache<String, C1066160dqo> lruCache2 = LJFF.get(str);
        if ((lruCache2 != null && lruCache2.get(str2) != null) || ((lruCache = LJ.get(str)) != null && lruCache.get(str2) != null)) {
            return true;
        }
        return false;
    }

    public static void LJI(String str, boolean z) {
        if (z) {
            LJ.remove(str);
        }
        LJFF.remove(str);
        LJI.remove(str);
        Runnable runnableRemove = LIZJ.remove(str);
        if (runnableRemove != null) {
            ((Handler) LIZLLL.getValue()).removeCallbacks(runnableRemove);
        }
    }

    public static void LJII(String str, String str2) {
        LruCache<String, C1066160dqo> lruCache;
        if (str2 != null && !a0.LJJJIL(str2) && (lruCache = LJFF.get(str)) != null) {
            lruCache.remove(str2);
        }
    }

    public static Drawable LJIIIIZZ(String str, String str2) {
        boolean z;
        LruCache<String, C1066160dqo> lruCache;
        Drawable drawable;
        C1066160dqo c1066160dqo;
        BitmapDrawable bitmapDrawable;
        Bitmap bitmap;
        if (str2 != null && !a0.LJJJIL(str2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        LruCache<String, C1066160dqo> lruCache2 = LJFF.get(str);
        if ((lruCache2 != null && (c1066160dqo = lruCache2.get(str2)) != null) || ((lruCache = LJ.get(str)) != null && (c1066160dqo = lruCache.get(str2)) != null)) {
            drawable = c1066160dqo.LJI;
        } else {
            drawable = null;
        }
        if ((drawable instanceof BitmapDrawable) && (bitmapDrawable = (BitmapDrawable) drawable) != null && (bitmap = bitmapDrawable.getBitmap()) != null && bitmap.isRecycled()) {
            return null;
        }
        return drawable;
    }

    public static void LIZ(String str, String str2, C1322100kVc c1322100kVc, InterfaceC1320380kSq interfaceC1320380kSq) {
        if (a0.LJJJIL(str2)) {
            return;
        }
        ConcurrentHashMap<String, ConcurrentHashMap<String, CopyOnWriteArrayList<C1066180dqq>>> concurrentHashMap = LJI;
        synchronized (concurrentHashMap) {
            try {
                ConcurrentHashMap<String, CopyOnWriteArrayList<C1066180dqq>> concurrentHashMap2 = concurrentHashMap.get(str);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap<>();
                }
                concurrentHashMap.put(str, concurrentHashMap2);
                c1322100kVc.setTag(-1420091667, str2);
                CopyOnWriteArrayList<C1066180dqq> copyOnWriteArrayList = concurrentHashMap2.get(str2);
                if (copyOnWriteArrayList == null) {
                    copyOnWriteArrayList = new CopyOnWriteArrayList<>();
                }
                C19719612Di.LJJIIJ(copyOnWriteArrayList, new AwS595S0100000_16(c1322100kVc, 249), true);
                copyOnWriteArrayList.add(new C1066180dqq(interfaceC1320380kSq, new WeakReference(c1322100kVc)));
                concurrentHashMap2.put(str2, copyOnWriteArrayList);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static Pair LIZJ(int i, int i2, String str, boolean z) {
        Pair pair;
        List listLJJLIIIJILLIZJL;
        String upperCase = str.toUpperCase(Locale.ROOT);
        if (!z && !Intrinsics.LJFF(upperCase, "GB") && !Intrinsics.LJFF(upperCase, "US")) {
            return new Pair(800, 800);
        }
        if (i == i2) {
            if (z) {
                pair = new Pair(1800, 1800);
            } else {
                pair = new Pair(800, 800);
            }
        } else if (z) {
            pair = new Pair(1350, 1800);
        } else {
            pair = new Pair(800, 1066);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(((Number) pair.getFirst()).intValue());
        sbLIZ.append(':');
        sbLIZ.append(((Number) pair.getSecond()).intValue());
        String str2 = LJII.get(C2188811AlT.LIZIZ(sbLIZ));
        if (str2 != null && (listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str2, new String[]{":"}, 0, 6)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = listLJJLIIIJILLIZJL.iterator();
            while (it2.hasNext()) {
                Integer numLJIIJJI = C2095008Iq.LJIIJJI((String) it2.next());
                if (numLJIIJJI != null) {
                    arrayList.add(numLJIIJJI);
                }
            }
            if (arrayList != null && arrayList.size() == 2) {
                return new Pair(ListProtector.get(arrayList, 0), ListProtector.get(arrayList, 1));
            }
            return pair;
        }
        return pair;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(X.InterfaceC497601wk r12, android.content.Context r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, boolean r18, kotlin.jvm.functions.Function0 r19, boolean r20) {
        /*
            r8 = r14
            if (r8 == 0) goto La6
            boolean r0 = kotlin.text.a0.LJJJIL(r8)
            if (r0 != 0) goto La6
            r9 = r16
            if (r9 == 0) goto La6
            boolean r0 = kotlin.text.a0.LJJJIL(r9)
            if (r0 != 0) goto La6
            r10 = r15
            if (r10 == 0) goto La6
            boolean r0 = kotlin.text.a0.LJJJIL(r10)
            if (r0 != 0) goto La6
            android.util.LruCache<java.lang.String, android.util.LruCache<java.lang.String, X.0dqo>> r1 = X.C1066190dqr.LJFF
            java.lang.Object r5 = r1.get(r8)
            android.util.LruCache r5 = (android.util.LruCache) r5
            if (r5 != 0) goto L37
            android.util.LruCache r5 = new android.util.LruCache
            X.01GW r0 = X.C1066190dqr.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r5.<init>(r0)
        L37:
            r1.put(r8, r5)
            java.lang.Object r7 = r5.get(r9)
            X.0dqo r7 = (X.C1066160dqo) r7
            r4 = 0
            if (r7 != 0) goto L55
            android.util.LruCache<java.lang.String, android.util.LruCache<java.lang.String, X.0dqo>> r0 = X.C1066190dqr.LJ
            java.lang.Object r0 = r0.get(r8)
            android.util.LruCache r0 = (android.util.LruCache) r0
            if (r0 == 0) goto L5c
            java.lang.Object r7 = r0.get(r9)
            X.0dqo r7 = (X.C1066160dqo) r7
            if (r7 == 0) goto L5c
        L55:
            android.graphics.drawable.Drawable r0 = r7.LJI
            if (r0 == 0) goto L5a
            return
        L5a:
            if (r7 != 0) goto L63
        L5c:
            X.0dqo r7 = new X.0dqo
            r11 = r17
            r7.<init>(r8, r9, r10, r11, r12, r13)
        L63:
            r0 = r19
            r7.LJII = r0
            java.lang.String r0 = r7.LIZJ
            boolean r0 = kotlin.text.a0.LJJJIL(r0)
            r6 = r20
            if (r0 != 0) goto L7e
            X.01wk r3 = r7.LJ
            X.1DFB r2 = X.C0PEM.LIZJ
            X.0dqn r1 = new X.0dqn
            r1.<init>(r6, r7, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
        L7e:
            r5.put(r9, r7)
            if (r6 == 0) goto La6
            if (r18 == 0) goto La6
            android.util.LruCache<java.lang.String, android.util.LruCache<java.lang.String, X.0dqo>> r2 = X.C1066190dqr.LJ
            java.lang.Object r1 = r2.get(r8)
            android.util.LruCache r1 = (android.util.LruCache) r1
            if (r1 != 0) goto La0
            android.util.LruCache r1 = new android.util.LruCache
            X.01GW r0 = X.C1066190dqr.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1.<init>(r0)
        La0:
            r2.put(r8, r1)
            r1.put(r9, r7)
        La6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1066190dqr.LJ(X.01wk, android.content.Context, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function0, boolean):void");
    }
}
