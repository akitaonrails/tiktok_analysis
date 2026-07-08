package X;

import android.graphics.Bitmap;
import android.os.CancellationSignal;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.gamora.editor.mixediting.resource.feature.cache.AlgorithmResult;
import com.ss.android.ugc.gamora.mixediting.IMixEditingFeatureExtractionService;
import com.ss.android.vesdk.VEUtils;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS582S0100000_3;

/* JADX INFO: renamed from: X.08w8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2277408w8 {
    public static final C2294208yq LJI = new C2294208yq();
    public static final ConcurrentHashMap<String, Pair<String, String>> LJII = new ConcurrentHashMap<>();
    public static final C01GW<Integer> LJIIIIZZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(593));
    public static final Semaphore LJIIIZ = new Semaphore(1);
    public static final C01GW<C2271008v6> LJIIJ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(592));
    public final C2262608tk LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final ConcurrentHashMap<String, AnonymousClass0957<List<C2262108tf>>> LIZLLL = new ConcurrentHashMap<>();
    public volatile C099G LJ;
    public volatile CancellationSignal LJFF;

    public final void LIZIZ() {
        C099G c099g = this.LJ;
        if (c099g != null && c099g.isActive()) {
            c099g.LIZIZ(null);
        }
        Iterator<Map.Entry<String, AnonymousClass0957<List<C2262108tf>>>> it2 = this.LIZLLL.entrySet().iterator();
        while (it2.hasNext()) {
            AnonymousClass0957<List<C2262108tf>> value = it2.next().getValue();
            if (value.isActive()) {
                value.LIZIZ(null);
            }
        }
    }

    public final int[] LJII() {
        long j = this.LIZ.LIZIZ;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_video_extraction_bitmap_downgrade", true, false)) {
            return new int[]{0};
        }
        if (j < 2000) {
            return new int[]{0, (int) j};
        }
        int i = (int) j;
        return new int[]{0, i / 2, i};
    }

    public C2277408w8(C2262608tk c2262608tk) {
        this.LIZ = c2262608tk;
    }

    public static Pair LJIIIZ(VEUtils.VEVideoFileInfo vEVideoFileInfo, int i) {
        int iIntValue;
        int i2;
        int i3;
        int iIntValue2 = 0;
        if (i <= 0) {
            return new Pair(0, 0);
        }
        if (vEVideoFileInfo != null && (i2 = vEVideoFileInfo.width) > 0 && (i3 = vEVideoFileInfo.height) > 0) {
            Pair pairLJIIIIZZ = LJIIIIZZ(i2, i3, i);
            iIntValue2 = ((Number) pairLJIIIIZZ.getFirst()).intValue();
            iIntValue = ((Number) pairLJIIIIZZ.getSecond()).intValue();
        } else {
            iIntValue = 0;
        }
        return new Pair(Integer.valueOf(iIntValue2), Integer.valueOf(iIntValue));
    }

    public static Bitmap LJIIJJI(int i, Bitmap bitmap) {
        String strName;
        if (i <= 0) {
            return bitmap;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            if (width <= i && height <= i) {
                return bitmap;
            }
            Pair pairLJIIIIZZ = LJIIIIZZ(width, height, i);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, ((Number) pairLJIIIIZZ.getFirst()).intValue(), ((Number) pairLJIIIIZZ.getSecond()).intValue(), true);
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("resize from ");
            sbLIZ.append(width);
            sbLIZ.append(" x ");
            sbLIZ.append(height);
            sbLIZ.append('(');
            Bitmap.Config config = bitmap.getConfig();
            if (config != null) {
                strName = config.name();
            } else {
                strName = null;
            }
            sbLIZ.append(strName);
            sbLIZ.append(") to ");
            sbLIZ.append(((Number) pairLJIIIIZZ.getFirst()).intValue());
            sbLIZ.append(" x ");
            sbLIZ.append(((Number) pairLJIIIIZZ.getSecond()).intValue());
            sbLIZ.append(";size from ");
            sbLIZ.append((bitmap.getAllocationByteCount() / 1024.0f) / 1024.0f);
            sbLIZ.append("MB to ");
            sbLIZ.append((bitmapCreateScaledBitmap.getAllocationByteCount() / 1024.0f) / 1024.0f);
            sbLIZ.append("MB");
            C201955140j.LJIIIIZZ(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
            return bitmapCreateScaledBitmap;
        } catch (OutOfMemoryError e) {
            TryCatchGuardChecker.doCheck(e);
            C2269208uo c2269208uo = C2269208uo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("resize bitmap failed ");
            sbLIZ2.append(e);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            int iLIZIZ = C2294208yq.LIZIZ();
            c2269208uo.getClass();
            C2269208uo.LIZ(iLIZIZ, "MixEditingFeatureExtractionTask#resizeBitmap", strLIZIZ);
            return bitmap;
        } catch (RuntimeException e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2269208uo c2269208uo2 = C2269208uo.LIZ;
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("resize bitmap failed ");
            sbLIZ3.append(e2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
            int iLIZIZ2 = C2294208yq.LIZIZ();
            c2269208uo2.getClass();
            C2269208uo.LIZ(iLIZIZ2, "MixEditingFeatureExtractionTask#resizeBitmap", strLIZIZ2);
            return bitmap;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(java.lang.String r18, X.InterfaceC1364105Vn<? super com.ss.android.ugc.effectmanager.effect.model.Effect> r19) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277408w8.LIZJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(java.lang.String r11, X.InterfaceC1364105Vn<? super java.lang.String> r12) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277408w8.LJ(java.lang.String, X.05Vn):java.lang.Object");
    }

    public static Pair LJIIIIZZ(int i, int i2, int i3) {
        int i4;
        if (i3 <= 0) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        if (i <= i3 && i2 <= i3) {
            return new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        }
        float f = i / i2;
        if (f > 1.0f) {
            i4 = (int) (i3 / f);
        } else {
            i4 = i3;
            i3 = (int) (i3 * f);
        }
        return new Pair(Integer.valueOf(i3), Integer.valueOf(i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ba A[PHI: r3
      0x01ba: PHI (r3v14 java.lang.Object) = (r3v7 java.lang.Object), (r3v0 java.lang.Object) binds: [B:58:0x01b4, B:60:0x01b7] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJFF(X.C2262608tk r24, X.C2263508tt r25, X.InterfaceC1364105Vn<? super java.util.List<android.graphics.Bitmap>> r26) {
        /*
            Method dump skipped, instruction units count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277408w8.LJFF(X.08tk, X.08tt, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0085 A[Catch: all -> 0x00ec, TryCatch #4 {all -> 0x00ec, blocks: (B:25:0x007f, B:28:0x0085, B:22:0x0072), top: B:62:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009a A[Catch: all -> 0x00e7, TRY_ENTER, TryCatch #2 {all -> 0x00e7, blocks: (B:33:0x009a, B:35:0x00bd, B:37:0x00d7, B:38:0x00d9), top: B:59:0x0098 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bd A[Catch: all -> 0x00e7, TryCatch #2 {all -> 0x00e7, blocks: (B:33:0x009a, B:35:0x00bd, B:37:0x00d7, B:38:0x00d9), top: B:59:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.AnonymousClass0957<? extends java.util.List<android.graphics.Bitmap>> r27, java.lang.String r28, X.C2263508tt r29, X.InterfaceC1364105Vn<? super java.util.List<X.C2262108tf>> r30) {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2277408w8.LJI(X.0957, java.lang.String, X.08tt, X.05Vn):java.lang.Object");
    }

    public final void LJIIJ(Set<String> set, InterfaceC1337805Lk interfaceC1337805Lk, InterfaceC1337805Lk interfaceC1337805Lk2, C2263508tt c2263508tt) {
        C0MJ8 c0mj8 = C0MJ8.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start feature extraction, algorithms: ");
        sbLIZ.append(set);
        C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2261808tc(set, this, interfaceC1337805Lk, interfaceC1337805Lk2, c2263508tt, null), 3);
    }

    public final Pair<AnonymousClass0957<List<C2262108tf>>, Boolean> LIZLLL(InterfaceC497601wk interfaceC497601wk, String str, InterfaceC1337805Lk interfaceC1337805Lk, InterfaceC1337805Lk interfaceC1337805Lk2, C2263508tt c2263508tt) {
        AlgorithmResult algorithmResult;
        int size;
        AnonymousClass0957<List<C2262108tf>> anonymousClass0957 = this.LIZLLL.get(str);
        if (anonymousClass0957 != null) {
            C0MJ8 c0mj8 = C0MJ8.LIZIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("algorithm = ");
            sbLIZ.append(str);
            sbLIZ.append("; featureExtraction -> use task cache");
            C201955140j.LIZLLL(c0mj8, "MIX_EDITING_FEATURE_EXTRACTION", C2188811AlT.LIZIZ(sbLIZ));
            if (anonymousClass0957.isActive()) {
                return new Pair<>(anonymousClass0957, Boolean.FALSE);
            }
            if (anonymousClass0957.isCompleted() && !anonymousClass0957.isCancelled() && anonymousClass0957.LIZLLL() != null) {
                return new Pair<>(anonymousClass0957, Boolean.TRUE);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C2278108wF c2278108wF = C2278108wF.LIZ;
        C2262608tk c2262608tk = this.LIZ;
        int length = LJII().length;
        c2278108wF.getClass();
        boolean z = true;
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_bach_result_cache_max_count", true) * 1024 * 1024 <= 0) {
            z = false;
        }
        if (z) {
            if (!c2262608tk.LJI && ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LJIIJJI()) {
                C0CHQ.LIZ().LJIIJJI();
                C13SF c13sf = ((C2278708wL) C2278108wF.LIZJ.getValue()).LIZIZ;
                if (c13sf != null) {
                    c13sf.clear();
                }
                ((IMixEditingFeatureExtractionService) ServiceManager.get().getService(IMixEditingFeatureExtractionService.class)).LIZIZ();
            } else if (C041J.LIZ(c2262608tk.LJFF)) {
                C201955140j.LJIIIIZZ(C0MJ8.LIZIZ, "MIX_EDITING_FEATURE_EXTRACTION", "getFeatureExtractionCache by mediaSystemId ");
                C2278708wL c2278708wL = (C2278708wL) C2278108wF.LIZJ.getValue();
                String str2 = c2262608tk.LJFF;
                c2278708wL.getClass();
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str2);
                sbLIZ2.append('_');
                sbLIZ2.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                if (c2278708wL.LIZ.containsKey(strLIZIZ)) {
                    algorithmResult = c2278708wL.LIZ.get(strLIZIZ);
                } else {
                    C13SF c13sf2 = c2278708wL.LIZIZ;
                    if (c13sf2 != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append(str2);
                        sbLIZ3.append('_');
                        sbLIZ3.append(str);
                        String strLJFF = c13sf2.LJFF(C2188811AlT.LIZIZ(sbLIZ3));
                        if (strLJFF != null) {
                            C1227904rF.LIZ.getClass();
                            algorithmResult = (AlgorithmResult) C1227904rF.LIZIZ(strLJFF, AlgorithmResult.class);
                        }
                    }
                }
                if (algorithmResult != null) {
                    if (length != algorithmResult.extractBitmapCount) {
                        C2278708wL c2278708wL2 = (C2278708wL) C2278108wF.LIZJ.getValue();
                        String str3 = c2262608tk.LJFF;
                        C13SF c13sf3 = c2278708wL2.LIZIZ;
                        if (c13sf3 != null) {
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append(str3);
                            sbLIZ4.append('_');
                            sbLIZ4.append(str);
                            c13sf3.remove(C2188811AlT.LIZIZ(sbLIZ4));
                        }
                    } else {
                        List<C2262108tf> list = algorithmResult.results;
                        if (list != null) {
                            C0CHQ.LIZ().LJIIJJI();
                            String str4 = c2263508tt.LIZ;
                            String str5 = c2263508tt.LIZIZ;
                            int i = this.LIZIZ;
                            int i2 = this.LIZJ;
                            List<String> list2 = this.LIZ.LIZLLL;
                            if (list2 != null) {
                                size = list2.size();
                            } else {
                                size = 0;
                            }
                            C2294408ys.LIZ(new C2294508yt(i, i2, size, jCurrentTimeMillis, str4, str5, str, true, true));
                            C099F c099fLIZ = C090F.LIZ(list);
                            this.LIZLLL.put(str, c099fLIZ);
                            return new Pair<>(c099fLIZ, Boolean.TRUE);
                        }
                    }
                }
            }
        }
        C099G c099gLIZIZ = this.LJ;
        if (c099gLIZIZ == null) {
            c099gLIZIZ = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2277808wC(interfaceC1337805Lk, this, c2263508tt, null), 3);
            c099gLIZIZ.LJII(new AwS582S0100000_3(this, 62));
            this.LJ = c099gLIZIZ;
        }
        C099G c099gLIZIZ2 = C23250099c.LIZIZ(interfaceC497601wk, null, null, new C2261908td(interfaceC1337805Lk2, this, c099gLIZIZ, str, c2263508tt, null), 3);
        this.LIZLLL.put(str, c099gLIZIZ2);
        c099gLIZIZ2.LJII(new AwS582S0100000_3(this, 61));
        return new Pair<>(c099gLIZIZ2, Boolean.FALSE);
    }

    public final List<C2262108tf> LIZ(String str, List<Bitmap> list, String str2, long j, int i, int i2, C2262608tk c2262608tk, C2263508tt c2263508tt) {
        AnonymousClass0957<List<C2262108tf>> anonymousClass0957;
        List<C2262108tf> listLIZ;
        if (C2263008to.LIZ()) {
            anonymousClass0957 = this.LIZLLL.get(str2);
        } else {
            anonymousClass0957 = null;
        }
        boolean z = true;
        if (!C0C64.LJIILLIIL().LJIIIZ(31744, "studio_mix_material_enable_serial_call_bach", true, false)) {
            z = false;
        }
        if (z) {
            synchronized (LJI) {
                listLIZ = C2294208yq.LIZ(str, list, str2, j, i, i2, c2262608tk, c2263508tt, anonymousClass0957);
            }
            return listLIZ;
        }
        return C2294208yq.LIZ(str, list, str2, j, i, i2, c2262608tk, c2263508tt, anonymousClass0957);
    }
}
