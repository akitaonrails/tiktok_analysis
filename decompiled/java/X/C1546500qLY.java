package X;

import android.util.LruCache;
import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS308S0000000_23;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1546500qLY {
    public static Map LIZLLL() {
        return C1546560qLe.LIZIZ.getValue();
    }

    public static void LJIIIIZZ(String str) {
        Iterator it2;
        C1546510qLZ c1546510qLZ = (C1546510qLZ) LIZLLL().remove(C1541030qCj.LIZ(str));
        if (c1546510qLZ != null) {
            if (!c1546510qLZ.LIZIZ) {
                Iterator<Map.Entry<String, SoftReference<InterfaceC1105930esx>>> it3 = c1546510qLZ.LIZJ.entrySet().iterator();
                while (it3.hasNext()) {
                    InterfaceC1105930esx interfaceC1105930esx = it3.next().getValue().get();
                    if (interfaceC1105930esx != null) {
                        interfaceC1105930esx.release();
                    }
                }
                return;
            }
            Map mapSnapshot = ((LruCache) c1546510qLZ.LJ.getValue()).snapshot();
            if (mapSnapshot != null && (it2 = mapSnapshot.entrySet().iterator()) != null) {
                while (it2.hasNext()) {
                    ((InterfaceC1540940qCa) ((Map.Entry) it2.next()).getValue()).release();
                }
            }
        }
    }

    public static void LIZIZ(String str, String str2) {
        boolean z;
        Iterator it2;
        Map<String, SoftReference<InterfaceC1105930esx>> map;
        Iterator<Map.Entry<String, SoftReference<InterfaceC1105930esx>>> it3;
        C1546510qLZ c1546510qLZ = (C1546510qLZ) LIZLLL().get(C1541030qCj.LIZ(str2));
        if (c1546510qLZ != null) {
            if (c1546510qLZ.LIZIZ) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                if (c1546510qLZ != null && (map = c1546510qLZ.LIZJ) != null && (it3 = map.entrySet().iterator()) != null) {
                    while (it3.hasNext()) {
                        Map.Entry<String, SoftReference<InterfaceC1105930esx>> next = it3.next();
                        if (c1546510qLZ.LJIIIZ.invoke(next.getKey(), str).booleanValue()) {
                            it3.remove();
                            AFwS308S0000000_23 aFwS308S0000000_23 = c1546510qLZ.LJIIJJI;
                            if (aFwS308S0000000_23 != null) {
                                aFwS308S0000000_23.invoke(next.getValue().get(), EnumC1154190g8n.REMOVE_BY_USER);
                            }
                            InterfaceC1105930esx interfaceC1105930esx = next.getValue().get();
                            if (interfaceC1105930esx != null) {
                                interfaceC1105930esx.release();
                            }
                        }
                    }
                    return;
                }
                return;
            }
            Map mapSnapshot = ((LruCache) c1546510qLZ.LJ.getValue()).snapshot();
            if (mapSnapshot != null && (it2 = mapSnapshot.entrySet().iterator()) != null) {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    if (c1546510qLZ.LJIIIZ.invoke(entry.getKey(), str).booleanValue()) {
                        it2.remove();
                        AFwS308S0000000_23 aFwS308S0000000_232 = c1546510qLZ.LJIIJJI;
                        if (aFwS308S0000000_232 != null) {
                            aFwS308S0000000_232.invoke(entry.getValue(), EnumC1154190g8n.REMOVE_BY_USER);
                        }
                        InterfaceC1540940qCa interfaceC1540940qCa = (InterfaceC1540940qCa) entry.getValue();
                        if (interfaceC1540940qCa != null) {
                            interfaceC1540940qCa.release();
                        }
                    }
                }
            }
        }
    }

    public static void LJI(C1546510qLZ c1546510qLZ, Boolean bool) {
        String str;
        if (c1546510qLZ.LIZ) {
            LIZLLL().put(C1541030qCj.LIZ(c1546510qLZ.LJFF), c1546510qLZ);
            if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                str = "jsb";
            } else {
                str = "native";
            }
            C1520080pew.LJFF(null, "container_reuse", "config", str, null, null, C1541030qCj.LIZ(c1546510qLZ.LJFF), null, 177);
        }
    }

    public static /* synthetic */ void LJII(C1546500qLY c1546500qLY, C1546510qLZ c1546510qLZ) {
        Boolean bool = Boolean.FALSE;
        c1546500qLY.getClass();
        LJI(c1546510qLZ, bool);
    }

    public final InterfaceC1105930esx LJ(String str, String str2) {
        boolean z;
        Iterator it2;
        Map<String, SoftReference<InterfaceC1105930esx>> map;
        Iterator<Map.Entry<String, SoftReference<InterfaceC1105930esx>>> it3;
        C1546510qLZ c1546510qLZ = (C1546510qLZ) LIZLLL().get(C1541030qCj.LIZ(str2));
        if (c1546510qLZ != null && c1546510qLZ.LIZIZ) {
            z = true;
        } else {
            z = false;
        }
        Object first = null;
        if (!z) {
            if (c1546510qLZ != null && (map = c1546510qLZ.LIZJ) != null && (it3 = map.entrySet().iterator()) != null) {
                while (it3.hasNext()) {
                    Map.Entry<String, SoftReference<InterfaceC1105930esx>> next = it3.next();
                    Pair pairLJFF = LJFF(this, c1546510qLZ, str, next.getKey(), next.getValue().get());
                    first = pairLJFF.getFirst();
                    if (((Boolean) pairLJFF.getSecond()).booleanValue()) {
                        AFwS308S0000000_23 aFwS308S0000000_23 = c1546510qLZ.LJIIJJI;
                        if (aFwS308S0000000_23 != null) {
                            aFwS308S0000000_23.invoke(first, EnumC1154190g8n.REMOVE_BY_EXPIRED);
                        }
                        it3.remove();
                    }
                    if (first != null) {
                        break;
                    }
                }
            }
        } else {
            Map mapSnapshot = ((LruCache) c1546510qLZ.LJ.getValue()).snapshot();
            if (mapSnapshot != null && (it2 = mapSnapshot.entrySet().iterator()) != null) {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    Pair pairLJFF2 = LJFF(this, c1546510qLZ, str, (String) entry.getKey(), (InterfaceC1105930esx) entry.getValue());
                    first = pairLJFF2.getFirst();
                    if (((Boolean) pairLJFF2.getSecond()).booleanValue()) {
                        AFwS308S0000000_23 aFwS308S0000000_232 = c1546510qLZ.LJIIJJI;
                        if (aFwS308S0000000_232 != null) {
                            aFwS308S0000000_232.invoke(first, EnumC1154190g8n.REMOVE_BY_EXPIRED);
                        }
                        it2.remove();
                    }
                    if (first != null) {
                        break;
                    }
                }
            }
        }
        return (InterfaceC1105930esx) first;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x018b, code lost:
    
        if (r6 != null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x018f  */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.09AY, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v7, types: [X.0qLa, java.lang.Runnable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(java.lang.String r12, java.lang.String r13, X.InterfaceC1105930esx r14) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546500qLY.LIZ(java.lang.String, java.lang.String, X.0esx):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1105930esx LIZJ(android.content.Context r13, java.lang.String r14, java.lang.String r15) {
        /*
            r12 = this;
            r8 = r15
            r7 = r14
            X.0esx r2 = r12.LJ(r7, r8)
            if (r2 == 0) goto L1f
            X.C1541030qCj.LIZIZ(r2, r13)
            r0 = 4
            r2.setOptimization(r0)
            java.lang.String r9 = X.C1541030qCj.LIZ(r8)
            r3 = 0
            java.lang.String r4 = "container_reuse"
            java.lang.String r5 = "use"
            r11 = 137(0x89, float:1.92E-43)
            r6 = r3
            r10 = r3
            X.C1520080pew.LJFF(r3, r4, r5, r6, r7, r8, r9, r10, r11)
        L1f:
            r4 = 0
            if (r2 == 0) goto L52
            r2.LJIIIZ(r13, r4)
            android.view.View r3 = r2.LJII()
            if (r3 == 0) goto L33
            r1 = 2131375409(0x7f0a3531, float:1.8370965E38)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.setTag(r1, r0)
        L33:
            android.view.View r1 = r2.LJII()
            if (r1 == 0) goto L52
            r0 = 2131375408(0x7f0a3530, float:1.8370963E38)
            java.lang.Object r1 = r1.getTag(r0)
        L40:
            boolean r0 = r1 instanceof com.bytedance.lynx.hybrid.performance.CheckCacheExpireHandler
            if (r0 == 0) goto L51
            com.bytedance.lynx.hybrid.performance.CheckCacheExpireHandler r1 = (com.bytedance.lynx.hybrid.performance.CheckCacheExpireHandler) r1
            if (r1 == 0) goto L51
            X.0qLa r0 = r1.LLILZ
            if (r0 == 0) goto L51
            r1.removeCallbacks(r0)
            r1.LLILZ = r4
        L51:
            return r2
        L52:
            r1 = r4
            goto L40
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546500qLY.LIZJ(android.content.Context, java.lang.String, java.lang.String):X.0esx");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LJFF(X.C1546500qLY r7, X.C1546510qLZ r8, java.lang.String r9, java.lang.String r10, X.InterfaceC1105930esx r11) {
        /*
            r7.getClass()
            kotlin.jvm.functions.Function2<? super java.lang.String, ? super java.lang.String, java.lang.Boolean> r0 = r8.LJIIIZ
            java.lang.Object r0 = r0.invoke(r10, r9)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            if (r0 == 0) goto Lb5
            int r1 = r8.LJI
            r0 = -1
            r5 = 1
            if (r1 == r0) goto L64
            long r6 = java.lang.System.currentTimeMillis()
            if (r11 == 0) goto L61
            long r0 = r11.getViewCreatedTime()
        L22:
            long r6 = r6 - r0
            int r0 = r8.LJI
            int r0 = r0 * 1000
            long r1 = (long) r0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L64
            r2 = 1
        L2d:
            if (r11 == 0) goto L5f
            android.view.View r1 = r11.LJII()
            if (r1 == 0) goto L5f
            r0 = 2131375409(0x7f0a3531, float:1.8370965E38)
            java.lang.Object r1 = r1.getTag(r0)
        L3c:
            boolean r0 = r1 instanceof java.lang.Boolean
            if (r0 == 0) goto L5d
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L5d
            boolean r0 = r1.booleanValue()
        L48:
            java.lang.String r4 = "ReUseTool"
            if (r0 == 0) goto L66
            X.0otc r2 = X.C1490740otc.LIZ
            java.lang.String r1 = "the reused view is using"
            X.0otf r0 = X.EnumC1490770otf.I
            r2.LIZ(r1, r0, r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r3, r0)
            return r1
        L5d:
            r0 = 0
            goto L48
        L5f:
            r1 = r3
            goto L3c
        L61:
            r0 = 0
            goto L22
        L64:
            r2 = 0
            goto L2d
        L66:
            if (r11 == 0) goto L7f
            boolean r0 = r11.LJIIJ()
            if (r0 != r5) goto L7f
            X.0otc r2 = X.C1490740otc.LIZ
            java.lang.String r1 = "the reused view has destroyed"
            X.0otf r0 = X.EnumC1490770otf.I
            r2.LIZ(r1, r0, r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r3, r0)
            return r1
        L7f:
            if (r2 != 0) goto La8
            if (r11 == 0) goto L9e
            X.0q70 r0 = r11.LJIILJJIL()
        L87:
            boolean r0 = X.C1540320qBa.LIZ(r0, r3)
            if (r0 != 0) goto La0
            X.0otc r2 = X.C1490740otc.LIZ
            java.lang.String r1 = "the theme of reused view is inconsistent"
            X.0otf r0 = X.EnumC1490770otf.E
            r2.LIZ(r1, r0, r4)
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r3, r0)
            return r1
        L9e:
            r0 = r3
            goto L87
        La0:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r11, r0)
            return r1
        La8:
            if (r11 == 0) goto Lad
            r11.release()
        Lad:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.<init>(r3, r0)
            return r1
        Lb5:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r1.<init>(r3, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1546500qLY.LJFF(X.0qLY, X.0qLZ, java.lang.String, java.lang.String, X.0esx):kotlin.Pair");
    }
}
