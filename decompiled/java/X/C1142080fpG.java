package X;

import com.bytedance.android.livesdk.gift.model.GiftConfigInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ttvideoengine.TTVideoEngine;
import cxo.a4;
import fyo.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0fpG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1142080fpG {
    public TTVideoEngine LIZ;
    public C1142090fpH LIZIZ;
    public int LJI;
    public long LJII;
    public final C1147830fyX LIZJ = new C1147830fyX();
    public String LIZLLL = "";
    public float LJ = 0.2f;
    public final Object LJFF = new Object();
    public final C1142120fpK LJIIIIZZ = new a4() { // from class: X.0fpK
        @Override // cxo.a4
        public final /* synthetic */ void LIZIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // cxo.a4
        public final /* synthetic */ void LJIIIIZZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // cxo.a4
        public final void LJIIIZ(TTVideoEngine tTVideoEngine) {
        }

        @Override // cxo.a4
        public final void LJIIJJI(TTVideoEngine tTVideoEngine, int i, int i2) {
        }

        @Override // cxo.a4
        public final void LJIIL(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // cxo.a4
        public final void LJIILIIL(TTVideoEngine tTVideoEngine) {
        }

        @Override // cxo.a4
        public final void LJIJ(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // cxo.a4
        public final void LJIJI(TTVideoEngine tTVideoEngine, int i) {
        }

        @Override // cxo.a4
        public final void LJIJJLI(int i) {
        }

        @Override // cxo.a4
        public final void LJ(TTVideoEngine tTVideoEngine) {
            if (this.LL.LIZIZ != null) {
                C1142090fpH.LIZJ();
            }
        }

        @Override // cxo.a4
        public final void LJI(e eVar) {
            int i;
            String str;
            if (this.LL.LIZIZ != null) {
                if (eVar != null) {
                    i = eVar.LIZ;
                    str = eVar.LIZLLL;
                } else {
                    i = 0;
                    str = null;
                }
                C1142090fpH.LIZIZ(i, str);
            }
        }

        @Override // cxo.a4
        public final void LJIILL(TTVideoEngine tTVideoEngine) {
            if (this.LL.LIZIZ != null) {
                C1142090fpH.LIZ();
            }
        }

        @Override // cxo.a4
        public final void LIZJ(TTVideoEngine tTVideoEngine, int i) {
            int i2;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 && this.LL.LIZIZ != null) {
                        if (((C1142020fpA) C1142070fpF.LIZLLL.getValue()).LIZJ == EnumC1142140fpM.LOADING) {
                            C20441214yg.LIZIZ("MusicGiftPreviewPlayer", "ignore stale paused callback while loading");
                            return;
                        }
                        AnonymousClass0956 anonymousClass0956 = C1142070fpF.LJFF;
                        if (anonymousClass0956 != null) {
                            anonymousClass0956.LIZIZ(null);
                        }
                        C1142070fpF c1142070fpF = C1142070fpF.LIZ;
                        EnumC1142140fpM enumC1142140fpM = EnumC1142140fpM.PAUSED;
                        c1142070fpF.getClass();
                        C1142070fpF.LJJII(new AwS596S0100000_17(enumC1142140fpM, 402));
                        return;
                    }
                    return;
                }
                if (this.LL.LIZIZ == null) {
                    return;
                }
                C1142090fpH.LIZJ();
                return;
            }
            C1142080fpG c1142080fpG = this.LL;
            synchronized (c1142080fpG.LJFF) {
                try {
                    int i3 = c1142080fpG.LJI;
                    i2 = 0;
                    if (i3 <= 0 || System.currentTimeMillis() > c1142080fpG.LJII) {
                        z = false;
                    }
                    if (z) {
                        i2 = i3 - 1;
                        c1142080fpG.LJI = i2;
                        if (i2 == 0) {
                            c1142080fpG.LJII = 0L;
                        }
                    } else {
                        c1142080fpG.LJI = 0;
                        c1142080fpG.LJII = 0L;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("suppress internal stop, remaining=");
                sbLIZ.append(i2);
                C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            if (c1142080fpG.LIZIZ == null) {
                return;
            }
            C1142090fpH.LIZLLL();
        }
    };

    public final long LIZ() {
        TTVideoEngine tTVideoEngine = this.LIZ;
        if (tTVideoEngine != null) {
            long jLJJJIL = tTVideoEngine.LJJJIL();
            if (jLJJJIL >= 0) {
                return jLJJJIL;
            }
        }
        return 0L;
    }

    public final long LIZIZ() {
        TTVideoEngine tTVideoEngine = this.LIZ;
        if (tTVideoEngine != null) {
            long jLJJJJL = tTVideoEngine.LJJJJL();
            if (jLJJJJL >= 0) {
                return jLJJJJL;
            }
        }
        return 0L;
    }

    public final void LIZJ() {
        TTVideoEngine tTVideoEngine = this.LIZ;
        if (tTVideoEngine != null) {
            tTVideoEngine.release();
        }
        this.LIZ = null;
        this.LIZIZ = null;
        this.LIZJ.LIZJ(true);
        this.LIZJ.LJ = null;
        this.LIZLLL = "";
        this.LJ = 0.2f;
        synchronized (this.LJFF) {
            try {
                this.LJI = 0;
                this.LJII = 0L;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", "release music gift preview audio player");
    }

    public final void LIZLLL() {
        TTVideoEngine tTVideoEngine = this.LIZ;
        if (tTVideoEngine != null) {
            String str = this.LIZLLL;
            if (u.LJJIIJZLJL(str, "http://", true) || u.LJJIIJZLJL(str, "https://", true)) {
                tTVideoEngine.LJIJI(str);
            } else {
                tTVideoEngine.LJIJ(str);
            }
        }
        GiftConfigInfo.RoleConfig roleConfig = C1133150far.LIZ;
        int iLIZ = C1133150far.LIZ(roleConfig != null ? roleConfig.gifter : null);
        float fLIZLLL = C13LZ.LIZLLL(C13LZ.LIZLLL((iLIZ == -1 || iLIZ == 0) ? 1.0f : (float) Math.pow(10.0d, ((double) iLIZ) / 20.0d), 0.0f, 1.0f), 0.0f, 1.0f);
        this.LJ = fLIZLLL;
        TTVideoEngine tTVideoEngine2 = this.LIZ;
        if (tTVideoEngine2 != null) {
            tTVideoEngine2.LJIILLIIL(fLIZLLL, fLIZLLL);
        }
        TTVideoEngine tTVideoEngine3 = this.LIZ;
        if (tTVideoEngine3 != null) {
            tTVideoEngine3.play();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("start playback ");
        sbLIZ.append(LJFF(this.LIZLLL));
        C20441214yg.LIZIZ("MusicGiftPreviewAudioPlayer", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:6:0x0008, B:8:0x0012, B:11:0x001a, B:12:0x0026), top: B:22:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ() {
        /*
            r8 = this;
            com.ss.ttvideoengine.TTVideoEngine r7 = r8.LIZ
            java.lang.Object r6 = r8.LJFF
            monitor-enter(r6)
            r5 = 1
            if (r7 == 0) goto L26
            java.lang.String r0 = r8.LIZLLL     // Catch: java.lang.Throwable -> L52
            boolean r0 = kotlin.text.a0.LJJJIL(r0)     // Catch: java.lang.Throwable -> L52
            r0 = r0 ^ 1
            if (r0 == 0) goto L26
            int r0 = r8.LJI     // Catch: java.lang.Throwable -> L52
            int r4 = r0 + 1
            r0 = 4
            if (r4 <= r0) goto L1a
            r4 = 4
        L1a:
            r8.LJI = r4     // Catch: java.lang.Throwable -> L52
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L52
            r0 = 2000(0x7d0, double:9.88E-321)
            long r2 = r2 + r0
            r8.LJII = r2     // Catch: java.lang.Throwable -> L52
            goto L28
        L26:
            int r4 = r8.LJI     // Catch: java.lang.Throwable -> L52
        L28:
            monitor-exit(r6)
            if (r7 == 0) goto L2e
            r7.stop()
        L2e:
            X.0fyX r0 = r8.LIZJ
            r0.LIZJ(r5)
            java.lang.String r2 = "MusicGiftPreviewAudioPlayer"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "stop playback notifyListener="
            r1.append(r0)
            r0 = 0
            r1.append(r0)
            java.lang.String r0 = " pending="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            X.C20441214yg.LIZIZ(r2, r0)
            return
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L52
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1142080fpG.LJ():void");
    }

    public static String LJFF(String str) {
        int length;
        String str2;
        String string = a0.LJLIIIL(str).toString();
        if (a0.LJJJIL(string)) {
            return "source=empty";
        }
        boolean z = false;
        int iLJJIZ = a0.LJJIZ(string, '?', 0, false, 6);
        List listLJIIJJI = C1697810uHb.LJIIJJI(Integer.valueOf(iLJJIZ), Integer.valueOf(a0.LJJIZ(string, '#', 0, false, 6)));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJIIJJI) {
            if (((Number) obj).intValue() >= 0) {
                arrayList.add(obj);
            }
        }
        Integer num = (Integer) C13LP.LJJLL(arrayList);
        if (num != null) {
            length = num.intValue();
        } else {
            length = string.length();
        }
        String strSubstring = string.substring(0, length);
        if (!u.LJJIIJZLJL(strSubstring, "http://", true) && !u.LJJIIJZLJL(strSubstring, "https://", true)) {
            str2 = "local";
        } else {
            str2 = "remote";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sourceType=");
        sbLIZ.append(str2);
        sbLIZ.append(", baseHash=");
        sbLIZ.append(Integer.toHexString(strSubstring.hashCode()));
        sbLIZ.append(", hasQuery=");
        if (iLJJIZ >= 0) {
            z = true;
        }
        sbLIZ.append(z);
        sbLIZ.append(", length=");
        sbLIZ.append(string.length());
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
