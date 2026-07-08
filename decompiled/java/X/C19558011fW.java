package X;

import com.ss.android.ugc.aweme.effect.EffectPointModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.11fW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19558011fW {
    public static final C19558011fW LIZ = new C19558011fW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(362));

    public static final boolean LJ(long j) {
        LIZ.getClass();
        if (j >= ((Number) LIZIZ.getValue()).longValue()) {
            return true;
        }
        return false;
    }

    public static boolean LIZLLL(int i, int i2) {
        long jMax = Math.max(i / 5, 1000L);
        if (i2 != 2) {
            if (i2 != 3) {
                return false;
            }
            return LJ((((long) i) - jMax) + ((long) (jMax / 0.5f)));
        }
        return LJ(((long) i) + (jMax * ((long) 2)));
    }

    public static final C1452720nuI LJFF(VideoPublishEditModel videoPublishEditModel, int i) {
        EffectPointModel timeEffect;
        if (videoPublishEditModel == null || (timeEffect = videoPublishEditModel.getTimeEffect()) == null) {
            return null;
        }
        long endPoint = timeEffect.getEndPoint();
        long startPoint = timeEffect.getStartPoint();
        String key = timeEffect.getKey();
        if (Math.abs(startPoint - endPoint) < 1000) {
            long jMax = Math.max(1000L, i / 5);
            long j = i;
            if (startPoint + jMax > j) {
                startPoint = j - jMax;
            }
            endPoint = jMax + startPoint;
        }
        return C1452720nuI.LJFF(startPoint, endPoint, key);
    }

    public static final List<EffectPointModel> LJI(long j, long j2) {
        ArrayList arrayList = new ArrayList();
        EffectPointModel effectPointModel = new EffectPointModel();
        effectPointModel.setUiStartPoint((int) j);
        effectPointModel.setUiEndPoint((int) j2);
        effectPointModel.setCategory("time");
        arrayList.add(effectPointModel);
        return arrayList;
    }

    public static final Pair<Long, Long> LIZIZ(String str, C19559311fj c19559311fj, InterfaceC1452170ntP interfaceC1452170ntP) {
        long jLongValue;
        Long l;
        Long l2;
        long jMax = 0;
        if (interfaceC1452170ntP == null) {
            return new Pair<>(0L, 0L);
        }
        int iMf = interfaceC1452170ntP.mf(interfaceC1452170ntP.LLL());
        if (c19559311fj.LJFF && (l2 = (Long) ((LinkedHashMap) c19559311fj.LIZLLL).get(str)) != null && l2.longValue() > 0) {
            Long l3 = (Long) ((LinkedHashMap) c19559311fj.LIZLLL).get(str);
            if (l3 != null) {
                jLongValue = l3.longValue();
            } else {
                jLongValue = 0;
            }
        } else {
            jLongValue = iMf;
        }
        int iMo51if = interfaceC1452170ntP.mo51if();
        if (c19559311fj.LJFF && (l = (Long) ((LinkedHashMap) c19559311fj.LJ).get(str)) != null && l.longValue() > 0) {
            Long l4 = (Long) ((LinkedHashMap) c19559311fj.LJ).get(str);
            if (l4 != null) {
                jMax = l4.longValue();
            }
        } else {
            LIZ.getClass();
            jMax = Math.max(iMo51if / 5, 1000L);
        }
        long j = iMo51if;
        if (j - jLongValue < jMax) {
            jLongValue = j - jMax;
        }
        c19559311fj.LIZLLL.put(str, Long.valueOf(jLongValue));
        c19559311fj.LJ.put(str, Long.valueOf(jMax));
        return new Pair<>(Long.valueOf(jLongValue), Long.valueOf(jLongValue + jMax));
    }

    public static final boolean LIZJ(C0MS4 c0ms4, AbstractC480450Isl abstractC480450Isl, boolean z) {
        if (c0ms4.getCurrentItem() == abstractC480450Isl.getCount() - 1 && z) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        return (r7 - r8) - r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if (r5 != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        return (r6 + r8) + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r5 != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final float LIZ(com.ss.android.ugc.aweme.effect.EffectPointModel r3, int r4, boolean r5, float r6, float r7, int r8, float r9) {
        /*
            r2 = 0
            if (r3 == 0) goto L5b
            java.lang.String r1 = r3.getKey()
        L7:
            java.lang.String r0 = "2"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r1, r0)
            if (r0 == 0) goto L2e
            X.11fW r0 = X.C19558011fW.LIZ
            r0.getClass()
            X.01GW r0 = X.C19558011fW.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r0 = (long) r4
            long r2 = r2 - r0
            r0 = 2
            long r0 = (long) r0
            long r2 = r2 / r0
            float r1 = (float) r2
            float r1 = r1 / r9
            if (r5 == 0) goto L5d
        L29:
            float r0 = (float) r8
            float r7 = r7 - r0
            float r6 = r7 - r1
        L2d:
            return r6
        L2e:
            if (r3 == 0) goto L34
            java.lang.String r2 = r3.getKey()
        L34:
            java.lang.String r0 = "3"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r2, r0)
            if (r0 == 0) goto L58
            X.11fW r0 = X.C19558011fW.LIZ
            r0.getClass()
            X.01GW r0 = X.C19558011fW.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            long r0 = (long) r4
            long r2 = r2 - r0
            float r1 = (float) r2
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 * r0
            float r1 = r1 / r0
            float r1 = r1 / r9
            if (r5 == 0) goto L5d
            goto L29
        L58:
            if (r5 != 0) goto L2d
            return r7
        L5b:
            r1 = r2
            goto L7
        L5d:
            float r0 = (float) r8
            float r6 = r6 + r0
            float r6 = r6 + r1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19558011fW.LIZ(com.ss.android.ugc.aweme.effect.EffectPointModel, int, boolean, float, float, int, float):float");
    }
}
