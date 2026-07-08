package X;

import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ml.utils.PitayaResourceHelper;
import com.ss.android.ugc.aweme.tars.impl.TarsOutputStruct;
import com.ss.android.ugc.aweme.tars.settings.TarsConfig;
import com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS201S0000000_14;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pUz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513910pUz implements C0Z0G {
    public static final Keva LJIILIIL = Keva.getRepo("bytenn_model_path");
    public final TarsConfig.TaskConfig LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final String LJII;
    public volatile ByteNNNativeBridge LJIIIIZZ;
    public final C1DEV LJIIIZ;
    public final C01GW LJIIJ;
    public String LJIIJJI;
    public boolean LJIIL;

    @Override // X.C0Z03
    public final boolean LIZLLL() {
        ByteNNNativeBridge byteNNNativeBridge = this.LJIIIIZZ;
        if (byteNNNativeBridge != null) {
            return byteNNNativeBridge.LIZLLL();
        }
        return false;
    }

    @Override // X.C0Z03
    public final boolean LJ() {
        return ((Boolean) C23250099c.LJ(C23271099x.INSTANCE, new C0CU6(this, null))).booleanValue();
    }

    @Override // X.C0Z03
    public final void releaseResource() {
        ByteNNNativeBridge byteNNNativeBridge = this.LJIIIIZZ;
        if (byteNNNativeBridge != null) {
            byteNNNativeBridge.LJ();
        }
    }

    @Override // X.InterfaceC892680Z0g, X.C0Z03
    public final TarsConfig.TaskConfig LJIIIIZZ() {
        return this.LIZ;
    }

    @Override // X.InterfaceC892680Z0g
    public final String getName() {
        return this.LIZIZ;
    }

    public C1513910pUz(TarsConfig.TaskConfig taskConfig) {
        String str;
        int iIntValue;
        int iIntValue2;
        boolean zBooleanValue;
        Boolean boolLJLI;
        TarsConfig.EngineConfig engineConfig;
        Map<String, String> map;
        String str2;
        Boolean boolLJLI2;
        TarsConfig.EngineConfig engineConfig2;
        Map<String, String> map2;
        String str3;
        Integer numLJIIJJI;
        TarsConfig.EngineConfig engineConfig3;
        Map<String, String> map3;
        String str4;
        Integer numLJIIJJI2;
        TarsConfig.EngineConfig engineConfig4;
        Map<String, String> map4;
        this.LIZ = taskConfig;
        this.LIZIZ = taskConfig.task;
        TarsConfig.Engine engine = taskConfig.engine;
        if (engine != null && (engineConfig4 = engine.config) != null && (map4 = engineConfig4.loadParams) != null) {
            str = map4.get("business_name");
        } else {
            str = null;
        }
        this.LIZJ = str == null ? "" : str;
        TarsConfig.Engine engine2 = taskConfig.engine;
        boolean zBooleanValue2 = false;
        if (engine2 != null && (engineConfig3 = engine2.config) != null && (map3 = engineConfig3.loadParams) != null && (str4 = map3.get("forward_type")) != null && (numLJIIJJI2 = C2095008Iq.LJIIJJI(str4)) != null) {
            iIntValue = numLJIIJJI2.intValue();
        } else {
            iIntValue = 0;
        }
        this.LIZLLL = iIntValue;
        TarsConfig.Engine engine3 = taskConfig.engine;
        if (engine3 != null && (engineConfig2 = engine3.config) != null && (map2 = engineConfig2.loadParams) != null && (str3 = map2.get("number_thread")) != null && (numLJIIJJI = C2095008Iq.LJIIJJI(str3)) != null) {
            iIntValue2 = numLJIIJJI.intValue();
        } else {
            iIntValue2 = 1;
        }
        this.LJ = iIntValue2;
        TarsConfig.Engine engine4 = taskConfig.engine;
        if (engine4 != null && (engineConfig = engine4.config) != null && (map = engineConfig.loadParams) != null && (str2 = map.get("model_path_from_keva")) != null && (boolLJLI2 = a0.LJLI(str2)) != null) {
            zBooleanValue = boolLJLI2.booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.LJFF = zBooleanValue;
        String str5 = taskConfig.config.get("run_and_release");
        if (str5 != null && (boolLJLI = a0.LJLI(str5)) != null) {
            zBooleanValue2 = boolLJLI.booleanValue();
        }
        this.LJI = zBooleanValue2;
        this.LJII = C1BWL.LIZ().getCacheDir().getAbsolutePath();
        this.LJIIIZ = C2191201ApK.LIZ();
        this.LJIIJ = C452501pT.LIZIZ(AFwS201S0000000_14.get$arr$(446));
        this.LJIIJJI = "";
        this.LJIIL = true;
    }

    @Override // X.C0Z03
    public final Object LIZ(C0Z01 c0z01) {
        String string = LJIILIIL.getString(this.LIZJ, "");
        if (this.LJFF && (!a0.LJJJIL(string)) && new C0VSJ(string).exists() && new C0VSJ(string).isFile()) {
            return new Pair(true, null);
        }
        return PitayaResourceHelper.LIZ.LIZIZ(this.LIZJ, true, c0z01);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILJJIL(X.InterfaceC1364105Vn<? super com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C1513980pV6
            if (r0 == 0) goto L26
            r7 = r9
            X.0pV6 r7 = (X.C1513980pV6) r7
            int r2 = r7.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L26
            int r2 = r2 - r1
            r7.LLILZ = r2
        L12:
            java.lang.Object r3 = r7.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZ
            r4 = 0
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L3a
            if (r0 == r1) goto L34
            if (r0 != r2) goto L2c
            X.01eN r5 = r7.LL
            goto L5e
        L26:
            X.0pV6 r7 = new X.0pV6
            r7.<init>(r8, r9)
            goto L12
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L34:
            X.01eN r5 = r7.LL
            X.C155000ia.LIZIZ(r3)
            goto L4f
        L3a:
            X.C155000ia.LIZIZ(r3)
            com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge r0 = r8.LJIIIIZZ
            if (r0 == 0) goto L42
            return r0
        L42:
            X.1DEV r5 = r8.LJIIIZ
            r7.LL = r5
            r7.LLILZ = r1
            java.lang.Object r0 = r5.LIZLLL(r4, r7)
            if (r0 != r6) goto L4f
            return r6
        L4f:
            com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge r0 = r8.LJIIIIZZ     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L9e
            r7.LL = r5     // Catch: java.lang.Throwable -> La2
            r7.LLILZ = r2     // Catch: java.lang.Throwable -> La2
            java.lang.Object r3 = r8.LJIILL(r7)     // Catch: java.lang.Throwable -> La2
            if (r3 != r6) goto L61
            return r6
        L5e:
            X.C155000ia.LIZIZ(r3)     // Catch: java.lang.Throwable -> L9c
        L61:
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L9c
            int r0 = r3.length()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L6a
            r1 = 0
        L6a:
            if (r1 != 0) goto L7f
            X.0VSJ r0 = new X.0VSJ     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r0.exists()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L7f
            com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge r0 = new com.tiktok.clientai.android.bytenn.bridge.ByteNNNativeBridge     // Catch: java.lang.Throwable -> L9c
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L9c
            r8.LJIIIIZZ = r0     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L7f:
            X.0Z0u r2 = new X.0Z0u     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "Model file not available and will start to download. Path: {"
            r1.append(r0)     // Catch: java.lang.Throwable -> L9c
            r1.append(r3)     // Catch: java.lang.Throwable -> L9c
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "runtime"
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L9c
            throw r2     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            goto La3
        L9e:
            r5.LIZIZ(r4)
            return r0
        La2:
            r0 = move-exception
        La3:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La2
            r5.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513910pUz.LJIILJJIL(X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILL(X.InterfaceC1364105Vn<? super java.lang.String> r11) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513910pUz.LJIILL(X.05Vn):java.lang.Object");
    }

    @Override // X.C0Z03
    public final Object LIZIZ(InterfaceC882520Yji interfaceC882520Yji, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        if (LJ()) {
            if (interfaceC882520Yji != null) {
                interfaceC882520Yji.onSuccess(null);
            }
        } else {
            PitayaResourceHelper.LIZ(this.LIZJ, interfaceC882520Yji);
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    @Override // X.C0Z0G
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC882480Yje r7, X.InterfaceC1364105Vn<? super kotlin.Unit> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1513970pV5
            if (r0 == 0) goto L52
            r5 = r8
            X.0pV5 r5 = (X.C1513970pV5) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L52
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 == r1) goto L2f
            if (r0 != r2) goto L58
            X.C155000ia.LIZIZ(r4)
        L25:
            boolean r0 = r6.LJI
            if (r0 == 0) goto L2c
            r6.releaseResource()
        L2c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L2f:
            X.C155000ia.LIZIZ(r4)
            goto L25
        L33:
            X.C155000ia.LIZIZ(r4)
            com.ss.android.ugc.aweme.tars.settings.TarsConfig$TaskConfig r0 = r6.LIZ
            boolean r0 = r0.batch
            if (r0 == 0) goto L45
            r5.LLILLL = r1
            java.lang.Object r0 = r6.LJIIL(r7, r5)
            if (r0 != r3) goto L25
            return r3
        L45:
            X.0YkJ r0 = r7.LIZ()
            r5.LLILLL = r2
            java.lang.Object r0 = r6.LJIILIIL(r0, r5)
            if (r0 != r3) goto L25
            return r3
        L52:
            X.0pV5 r5 = new X.0pV5
            r5.<init>(r6, r8)
            goto L12
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513910pUz.LIZJ(X.0Yje, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0090 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0091  */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0Yji, X.0Z08] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [X.0Yji] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.0Yji] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.0Yji] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.0Yji] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    @Override // X.C0Z03
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.C0Z08 r10, X.InterfaceC1364105Vn r11) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513910pUz.LJI(X.0Z08, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0030 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIL(X.InterfaceC882480Yje r7, X.InterfaceC1364105Vn<? super java.lang.Boolean> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.C1513950pV3
            if (r0 == 0) goto L3b
            r5 = r8
            X.0pV3 r5 = (X.C1513950pV3) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L3b
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L33
            if (r0 != r2) goto L46
            X.0YkJ r1 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L24:
            X.0YkJ r1 = r1.LJI
        L26:
            if (r1 == 0) goto L41
            r5.LL = r1
            r5.LLILZ = r2
            java.lang.Object r0 = r6.LJIILIIL(r1, r5)
            if (r0 != r3) goto L24
            return r3
        L33:
            X.C155000ia.LIZIZ(r4)
            X.0YkJ r1 = r7.LIZ()
            goto L26
        L3b:
            X.0pV3 r5 = new X.0pV3
            r5.<init>(r6, r8)
            goto L12
        L41:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L46:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513910pUz.LJIIL(X.0Yje, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIILIIL(X.C882890YkJ r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1513910pUz.LJIILIIL(X.0YkJ, X.05Vn):java.lang.Object");
    }

    public final void LJIILLIIL(C882890YkJ c882890YkJ, Map<String, float[]> map) {
        List listLJJLIIIJILLIZJL;
        int size;
        Set<Map.Entry<String, float[]>> setEntrySet;
        TarsConfig.EngineConfig engineConfig;
        Map<String, String> map2;
        String str;
        Collection<float[]> collectionValues;
        Object objLJJJLIIL;
        if (map != null && (collectionValues = map.values()) != null && (objLJJJLIIL = C13LP.LJJJLIIL(collectionValues)) != null) {
            c882890YkJ.LIZIZ(C2097908Jt.LIZJ(new Pair("float_array_output", objLJJJLIIL)));
            c882890YkJ.LIZIZ(C2097908Jt.LIZJ(new Pair("direct_buffer_data", objLJJJLIIL)));
            c882890YkJ.LIZ(C2097908Jt.LIZJ(new Pair("float_array_output", objLJJJLIIL)));
        }
        TarsConfig.Engine engine = this.LIZ.engine;
        int i = 0;
        if (engine != null && (engineConfig = engine.config) != null && (map2 = engineConfig.inferenceParams) != null && (str = map2.get("output_keys")) != null) {
            listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"|"}, 0, 6);
            if (listLJJLIIIJILLIZJL != null) {
                size = listLJJLIIIJILLIZJL.size();
            }
            if (map == null && (setEntrySet = map.entrySet()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setEntrySet, 10));
                for (Object obj : setEntrySet) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        Map.Entry entry = (Map.Entry) obj;
                        String str2 = (String) entry.getKey();
                        float[] fArr = (float[]) entry.getValue();
                        if (i < size && (listLJJLIIIJILLIZJL == null || (str2 = (String) ListProtector.get(listLJJLIIIJILLIZJL, i)) == null)) {
                            str2 = "";
                        }
                        arrayList.add(new TarsOutputStruct(str2, fArr));
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                c882890YkJ.LIZIZ(C2097908Jt.LIZJ(new Pair("bytenn_output", arrayList)));
                c882890YkJ.LIZ(C2097908Jt.LIZJ(new Pair("bytenn_output", arrayList)));
                return;
            }
        }
        listLJJLIIIJILLIZJL = null;
        size = 0;
        if (map == null) {
        }
    }
}
