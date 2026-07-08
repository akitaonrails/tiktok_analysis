package X;

import android.graphics.Bitmap;
import com.bytedance.amg.minigameruntime.api.ScreenShotData;
import com.bytedance.fly_main_color.FlyMainColor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo;
import com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0cIU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1006440cIU {
    public final long LIZ;
    public final GameCardMaterial LIZIZ;
    public final Aweme LIZJ;
    public volatile InterfaceC1006410cIR LJFF;
    public volatile boolean LJI;
    public volatile boolean LJII;
    public volatile boolean LJIIIIZZ;
    public AnonymousClass0956 LJIIJ;
    public AnonymousClass0956 LJIIJJI;
    public volatile boolean LJIIL;
    public volatile long LJIILIIL;
    public final Object LIZLLL = new Object();
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public volatile int LJIIIZ = -1;
    public final C2252331DDr LJIILJJIL = C09IR.LIZ(1, 8, EnumC2252401DDy.SUSPEND);
    public volatile C1006450cIV LJIILL = new C1006450cIV(null, 15);
    public final C2252321DDq LJIILLIIL = C1BNE.LIZ(C1006180cI4.LIZ);
    public final C1006430cIT LJIIZILJ = new InterfaceC1006900cJE() { // from class: X.0cIT
        @Override // X.InterfaceC1006900cJE
        public final void LJII() {
            Object value;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFirstFrame cardId=");
            sbLIZ.append(this.LIZ.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1007120cJa.LIZ();
            this.LIZ.LJ(EnumC1006480cIY.FP_READY, null, null);
            if (!C1006540cIe.LIZJ) {
                C1006540cIe.LIZJ = true;
                C1007120cJa.LIZ();
            }
            C1006440cIU c1006440cIU = this.LIZ;
            InterfaceC1006410cIR interfaceC1006410cIR = c1006440cIU.LJFF;
            if (interfaceC1006410cIR == null) {
                return;
            }
            do {
                value = c1006440cIU.LJIILLIIL.getValue();
                if ((value instanceof C1006190cI5) || (value instanceof C1006160cI2)) {
                    return;
                }
            } while (!c1006440cIU.LJIILLIIL.compareAndSet(value, new AbstractC1006170cI3() { // from class: X.0cI5
            }));
            synchronized (c1006440cIU.LIZLLL) {
                try {
                    if (c1006440cIU.LJI) {
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("triggerSample start cardId=");
                    sbLIZ2.append(c1006440cIU.LIZ);
                    sbLIZ2.append(" force=");
                    sbLIZ2.append(false);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C1007120cJa.LIZ();
                    AnonymousClass0956 anonymousClass0956 = c1006440cIU.LJIIJJI;
                    if (anonymousClass0956 != null) {
                        anonymousClass0956.LIZIZ(null);
                    }
                    c1006440cIU.LJIIJJI = C23250099c.LIZLLL((InterfaceC497601wk) C315130CWx.LIZ.getValue(), C0PEM.LIZ, null, new C1006140cI0(c1006440cIU, interfaceC1006410cIR, null), 2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // X.InterfaceC1006900cJE
        public final void LIZ(int i, String str, boolean z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onLoadComplete cardId=");
            sbLIZ.append(this.LIZ.LIZ);
            sbLIZ.append(" success=");
            sbLIZ.append(z);
            sbLIZ.append(" errorCode=");
            sbLIZ.append(i);
            sbLIZ.append(" errorMsg=");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            C1007120cJa.LIZ();
            if (z) {
                this.LIZ.LJ(EnumC1006480cIY.LOAD_COMPLETE, null, null);
            } else {
                this.LIZ.LJ(EnumC1006480cIY.FAILED, Integer.valueOf(i), str);
            }
        }
    };

    public final void LIZ() {
        if (this.LJIILL.LIZ != EnumC1006480cIY.FP_READY || this.LJIIIIZZ || this.LJI) {
            if (this.LJIIL) {
                this.LJIIL = false;
                C1006530cId.LJFF(this.LIZ);
                return;
            }
            return;
        }
        if (this.LJIIL) {
            return;
        }
        this.LJIIL = true;
        long j = this.LJII ? 0L : C1006570cIh.LIZ().memoryWarningCriticalLingerMsForUndisplayed;
        long j2 = this.LIZ;
        AwS560S0100000_16 awS560S0100000_16 = new AwS560S0100000_16(this, 761);
        ConcurrentHashMap<Long, C1006490cIZ> concurrentHashMap = C1006530cId.LIZ;
        C1006490cIZ c1006490cIZRemove = concurrentHashMap.remove(Long.valueOf(j2));
        if (c1006490cIZRemove != null) {
            c1006490cIZRemove.LJ.set(true);
            C1006530cId.LIZ(c1006490cIZRemove);
        }
        if (j < 0) {
            j = 0;
        }
        C1006490cIZ c1006490cIZ = new C1006490cIZ(j2, j, awS560S0100000_16);
        concurrentHashMap.put(Long.valueOf(j2), c1006490cIZ);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("register cardId=");
        sbLIZ.append(j2);
        sbLIZ.append(" gracePeriodMs=");
        sbLIZ.append(c1006490cIZ.LIZIZ);
        sbLIZ.append(" candidates=");
        sbLIZ.append(concurrentHashMap.size());
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        if (C1006530cId.LIZJ(C1BCA.LJIIIIZZ())) {
            C1006530cId.LIZLLL(c1006490cIZ);
        }
        if (!(!concurrentHashMap.isEmpty()) || C1006530cId.LIZIZ) {
            return;
        }
        C1006530cId.LIZIZ = true;
        C1BCA.LJJ(C1006530cId.LIZJ, true, 0L);
        C1007120cJa.LIZ();
    }

    public final void LIZLLL() {
        FeedSubcardInfo feedSubcardInfo;
        String str;
        if (!this.LJ.compareAndSet(false, true)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startLoad ignored, already started cardId=");
            sbLIZ.append(this.LIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            C1007120cJa.LIZ();
            return;
        }
        this.LJIILIIL = System.currentTimeMillis();
        C1006450cIV c1006450cIV = new C1006450cIV(EnumC1006480cIY.LOADING, 14);
        this.LJIILL = c1006450cIV;
        this.LJIILJJIL.LIZJ(c1006450cIV);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("startLoad begin cardId=");
        sbLIZ2.append(this.LIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C1007120cJa.LIZ();
        List<FeedSubcardInfo> list = this.LIZIZ.feedSubcardInfoList;
        if (list == null || (feedSubcardInfo = (FeedSubcardInfo) C13LP.LJJJLL(list)) == null || (str = feedSubcardInfo.minisSchema) == null || str.length() == 0) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startLoad fail cardId=");
            sbLIZ3.append(this.LIZ);
            sbLIZ3.append(" reason=schemaEmpty");
            C2188811AlT.LIZIZ(sbLIZ3);
            C1007120cJa.LIZ();
            LJ(EnumC1006480cIY.FAILED, -1, "minis schema is empty");
            return;
        }
        AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL((InterfaceC497601wk) C315130CWx.LIZ.getValue(), null, null, new C1006400cIQ(this, str, null), 3);
        synchronized (this.LIZLLL) {
            try {
                if (this.LJI) {
                    anonymousClass0956LIZLLL.LIZIZ(null);
                } else {
                    this.LJIIJ = anonymousClass0956LIZLLL;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final AbstractC1006170cI3 LIZIZ(InterfaceC1006410cIR interfaceC1006410cIR) {
        if (this.LJI) {
            return C1006150cI1.LIZ;
        }
        if (interfaceC1006410cIR.LIZ() != EnumC1006650cIp.FP_ARRIVED) {
            return C1006150cI1.LIZ;
        }
        if (!this.LJI) {
            try {
                ScreenShotData screenShotDataLJFF = interfaceC1006410cIR.LJFF();
                if (screenShotDataLJFF != null) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(screenShotDataLJFF.width, screenShotDataLJFF.height, Bitmap.Config.ARGB_8888);
                    try {
                        screenShotDataLJFF.pixels.rewind();
                        bitmapCreateBitmap.copyPixelsFromBuffer(screenShotDataLJFF.pixels);
                        C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmapCreateBitmap, null));
                        c204674156yLIZ.LJI(100.0f);
                        c204674156yLIZ.LJFF(4.0f);
                        c204674156yLIZ.LJ(0.0f, 0.4f, 0.0f, 1.0f, 100.0f);
                        Integer numLIZIZ = c204674156yLIZ.LIZIZ();
                        if (numLIZIZ != null) {
                            int iIntValue = numLIZIZ.intValue();
                            C2286608xc.LJ(iIntValue);
                            C1006160cI2 c1006160cI2 = new C1006160cI2(iIntValue);
                            if (!bitmapCreateBitmap.isRecycled()) {
                                bitmapCreateBitmap.recycle();
                                BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                            }
                            return c1006160cI2;
                        }
                        C1006150cI1 c1006150cI1 = C1006150cI1.LIZ;
                        if (!bitmapCreateBitmap.isRecycled()) {
                            bitmapCreateBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                        }
                        return c1006150cI1;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        if (!bitmapCreateBitmap.isRecycled()) {
                            bitmapCreateBitmap.recycle();
                            BitmapCrashChecker.recordBitmapRecyclePoint(bitmapCreateBitmap);
                        }
                        throw th;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return C1006150cI1.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(X.EnumC1006610cIl r10) {
        /*
            r9 = this;
            boolean r3 = r9.LJII
            com.ss.android.ugc.aweme.minis.feed.instantplay.model.GameCardMaterial r0 = r9.LIZIZ
            java.util.List<com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo> r0 = r0.feedSubcardInfoList
            r4 = 0
            if (r0 == 0) goto L17
            java.lang.Object r5 = X.C13LP.LJJJLL(r0)
            com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo r5 = (com.ss.android.ugc.aweme.minis.feed.instantplay.model.FeedSubcardInfo) r5
            if (r5 == 0) goto L18
            java.lang.String r2 = r5.clientKey
        L13:
            java.lang.Object r1 = r9.LIZLLL
            monitor-enter(r1)
            goto L1a
        L17:
            r5 = r4
        L18:
            r2 = r4
            goto L13
        L1a:
            boolean r0 = r9.LJI     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L20
            monitor-exit(r1)
            return
        L20:
            r8 = 1
            r9.LJI = r8     // Catch: java.lang.Throwable -> Lb9
            X.0956 r0 = r9.LJIIJ     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L2a
            r0.LIZIZ(r4)     // Catch: java.lang.Throwable -> Lb9
        L2a:
            r9.LJIIJ = r4     // Catch: java.lang.Throwable -> Lb9
            X.0956 r0 = r9.LJIIJJI     // Catch: java.lang.Throwable -> Lb9
            if (r0 == 0) goto L33
            r0.LIZIZ(r4)     // Catch: java.lang.Throwable -> Lb9
        L33:
            r9.LJIIJJI = r4     // Catch: java.lang.Throwable -> Lb9
            X.0cIR r7 = r9.LJFF     // Catch: java.lang.Throwable -> Lb9
            r9.LJFF = r4     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r1)
            java.lang.StringBuilder r6 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "release cardId="
            r6.append(r0)
            long r0 = r9.LIZ
            r6.append(r0)
            java.lang.String r0 = " scene="
            r6.append(r0)
            r6.append(r10)
            java.lang.String r0 = " hadRender="
            r6.append(r0)
            r1 = 0
            if (r7 != 0) goto L59
            r8 = 0
        L59:
            r6.append(r8)
            java.lang.String r0 = " displayed="
            r6.append(r0)
            r6.append(r3)
            X.C2188811AlT.LIZIZ(r6)
            X.C1007120cJa.LIZ()
            if (r7 == 0) goto L74
            X.0cIT r0 = r9.LJIIZILJ
            r7.LJIIIIZZ(r0)
            r7.destroy()
        L74:
            boolean r0 = r9.LJIIL
            if (r0 == 0) goto L7f
            r9.LJIIL = r1
            long r0 = r9.LIZ
            X.C1006530cId.LJFF(r0)
        L7f:
            X.1DDq r0 = r9.LJIILLIIL
            java.lang.Object r0 = r0.getValue()
            boolean r0 = r0 instanceof X.C1006160cI2
            if (r0 != 0) goto L90
            X.1DDq r1 = r9.LJIILLIIL
            X.0cI4 r0 = X.C1006180cI4.LIZ
            r1.setValue(r0)
        L90:
            X.0cIY r0 = X.EnumC1006480cIY.RELEASED
            r9.LJ(r0, r4, r4)
            X.0cIJ r1 = X.C1006330cIJ.LIZ
            if (r5 == 0) goto Lb7
            java.util.Map<java.lang.String, java.lang.String> r0 = r5.extraParams
        L9b:
            r1.getClass()
            X.C1006330cIJ.LIZLLL(r2, r0, r10, r3)
            X.01GW r0 = X.C315130CWx.LIZ
            java.lang.Object r3 = r0.getValue()
            X.01wk r3 = (X.InterfaceC497601wk) r3
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0cC1 r1 = new X.0cC1
            r1.<init>(r9, r4)
            r0 = 2
            X.C23250099c.LIZLLL(r3, r2, r4, r1, r0)
            return
        Lb7:
            r0 = r4
            goto L9b
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb9
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1006440cIU.LIZJ(X.0cIl):void");
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0cIT] */
    public C1006440cIU(long j, GameCardMaterial gameCardMaterial, Aweme aweme) {
        this.LIZ = j;
        this.LIZIZ = gameCardMaterial;
        this.LIZJ = aweme;
    }

    public final void LJ(EnumC1006480cIY enumC1006480cIY, Integer num, String str) {
        Long lValueOf;
        boolean z;
        FeedSubcardInfo feedSubcardInfo;
        Map<String, String> map;
        Map<String, String> map2;
        C1006450cIV c1006450cIV = this.LJIILL;
        EnumC1006480cIY enumC1006480cIY2 = c1006450cIV.LIZ;
        EnumC1006480cIY enumC1006480cIY3 = EnumC1006480cIY.FP_READY;
        if (enumC1006480cIY2 == enumC1006480cIY3 && enumC1006480cIY == EnumC1006480cIY.LOAD_COMPLETE) {
            return;
        }
        long j = this.LJIILIIL;
        if (j > 0) {
            lValueOf = Long.valueOf(System.currentTimeMillis() - j);
        } else {
            lValueOf = c1006450cIV.LIZIZ;
        }
        C1006450cIV c1006450cIV2 = new C1006450cIV(enumC1006480cIY, lValueOf, num, str);
        this.LJIILL = c1006450cIV2;
        this.LJIILJJIL.LIZJ(c1006450cIV2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("preBootState cardId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" status=");
        sbLIZ.append(enumC1006480cIY);
        sbLIZ.append(" durationMs=");
        sbLIZ.append(lValueOf);
        sbLIZ.append(" errorCode=");
        sbLIZ.append(num);
        sbLIZ.append(" errorMsg=");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        C1007120cJa.LIZ();
        EnumC1006480cIY enumC1006480cIY4 = c1006450cIV.LIZ;
        if (enumC1006480cIY4 != enumC1006480cIY3 && enumC1006480cIY4 != EnumC1006480cIY.FAILED) {
            z = false;
        } else {
            z = true;
        }
        List<FeedSubcardInfo> list = this.LIZIZ.feedSubcardInfoList;
        String str2 = null;
        if (list != null) {
            feedSubcardInfo = (FeedSubcardInfo) C13LP.LJJJLL(list);
        } else {
            feedSubcardInfo = null;
        }
        if (!z) {
            if (enumC1006480cIY == enumC1006480cIY3) {
                LIZ();
                C1006330cIJ c1006330cIJ = C1006330cIJ.LIZ;
                if (feedSubcardInfo != null) {
                    str2 = feedSubcardInfo.clientKey;
                    map2 = feedSubcardInfo.extraParams;
                } else {
                    map2 = null;
                }
                C00GC c00gc = C00GC.SUCCESS;
                c1006330cIJ.getClass();
                C1006330cIJ.LJ(str2, map2, c00gc, null, null, lValueOf);
                return;
            }
            if (enumC1006480cIY != EnumC1006480cIY.FAILED) {
                return;
            }
            C1006330cIJ c1006330cIJ2 = C1006330cIJ.LIZ;
            if (feedSubcardInfo != null) {
                str2 = feedSubcardInfo.clientKey;
                map = feedSubcardInfo.extraParams;
            } else {
                map = null;
            }
            C00GC c00gc2 = C00GC.FAIL;
            c1006330cIJ2.getClass();
            C1006330cIJ.LJ(str2, map, c00gc2, num, str, lValueOf);
            C1006540cIe.LIZJ(this.LIZ, EnumC1006610cIl.LOAD_FAILED);
        }
    }
}
