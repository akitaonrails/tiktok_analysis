package X;

import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LiveData;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS151S1100000_2;
import kotlin.jvm.internal.AwS403S0200000_2;
import kotlin.jvm.internal.AwS566S0100000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0oEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1465410oEl implements InterfaceC1459100o4a {
    public final C1DRG LIZ;
    public final Function0<VideoPublishEditModel> LIZIZ;
    public volatile String LIZLLL;
    public volatile String LJ;
    public volatile long LJFF;
    public volatile C099G LJI;
    public volatile AnonymousClass0956 LJII;
    public volatile C099F LJIIIIZZ;
    public volatile String LJIIIZ;
    public boolean LJIIJJI;
    public final Object LIZJ = new Object();
    public boolean LJIIJ = true;
    public final List<AVMusic> LJIIL = new ArrayList();
    public final C560530Lyd<String> LJIILIIL = new C560530Lyd<>();
    public final C560530Lyd<Pair<String, Boolean>> LJIILJJIL = new C560530Lyd<>();
    public final C560530Lyd<Unit> LJIILL = new C560530Lyd<>();
    public final C560530Lyd<InterfaceC1154450g9D> LJIILLIIL = new C560530Lyd<>();

    @Override // X.InterfaceC1459100o4a
    public final synchronized void LJIIL() {
        InterfaceC366450EYh interfaceC366450EYhLJIJJ;
        String strVQ0;
        String str = this.LIZLLL;
        if (str == null || str.length() == 0) {
            return;
        }
        if (C273380AnY.LIZ() && (interfaceC366450EYhLJIJJ = LJIJJ()) != null && (strVQ0 = interfaceC366450EYhLJIJJ.VQ0(this.LJIIJJI)) != null && strVQ0.length() > 0) {
            LJJII(strVQ0);
        }
        InterfaceC366450EYh interfaceC366450EYhLJIJJ2 = LJIJJ();
        if (interfaceC366450EYhLJIJJ2 != null) {
            interfaceC366450EYhLJIJJ2.US1(this.LJIIJJI, str);
        }
        this.LIZLLL = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0037  */
    @Override // X.InterfaceC1459100o4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r3 = this;
            kotlin.jvm.internal.AwS566S0100000_22 r1 = new kotlin.jvm.internal.AwS566S0100000_22
            r0 = 1140(0x474, float:1.597E-42)
            r1.<init>(r3, r0)
            X.C01TT.LIZLLL(r1)
            java.lang.Object r2 = r3.LIZJ
            monitor-enter(r2)
            java.lang.String r0 = r3.LJIIIZ     // Catch: java.lang.Throwable -> L4f
            boolean r0 = r3.LJJI(r0)     // Catch: java.lang.Throwable -> L4f
            r1 = 1
            if (r0 != 0) goto L38
            X.099G r0 = r3.LJI     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L21
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L4f
            if (r0 != r1) goto L21
            goto L38
        L21:
            X.0956 r0 = r3.LJII     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L2c
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L4f
            if (r0 != r1) goto L2c
            goto L38
        L2c:
            X.099F r0 = r3.LJIIIIZZ     // Catch: java.lang.Throwable -> L4f
            if (r0 == 0) goto L37
            boolean r0 = r0.isActive()     // Catch: java.lang.Throwable -> L4f
            if (r0 != r1) goto L37
            goto L38
        L37:
            r1 = 0
        L38:
            monitor-exit(r2)
            r3.LJIIJJI()
            if (r1 == 0) goto L4e
            r3.LJ()
            r0 = 0
            r3.LIZLLL = r0
            kotlin.jvm.internal.AwS566S0100000_22 r1 = new kotlin.jvm.internal.AwS566S0100000_22
            r0 = 1141(0x475, float:1.599E-42)
            r1.<init>(r3, r0)
            X.C01TT.LIZLLL(r1)
        L4e:
            return
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465410oEl.LIZIZ():void");
    }

    @Override // X.InterfaceC1459100o4a
    public final void LJIIIIZZ() {
        C1DRG c1drg;
        InterfaceC1461350o8D interfaceC1461350o8D;
        C0EZ1 c0ez1WM2;
        if (this.LJIIJJI || (c1drg = this.LIZ) == null || (interfaceC1461350o8D = (InterfaceC1461350o8D) c1drg.LJIIL(null, InterfaceC1461350o8D.class)) == null || (c0ez1WM2 = interfaceC1461350o8D.WM2()) == null) {
            return;
        }
        c0ez1WM2.pP2();
    }

    @Override // X.InterfaceC1459100o4a
    public final void LJIIJJI() {
        synchronized (this.LIZJ) {
            try {
                this.LJFF++;
                LJIILL();
                C01TT.LIZLLL(new AwS566S0100000_22(this, 1137));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIILL() {
        C099G c099g = this.LJI;
        if (c099g != null) {
            c099g.LIZIZ(null);
        }
        this.LJI = null;
        AnonymousClass0956 anonymousClass0956 = this.LJII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJII = null;
        C099F c099f = this.LJIIIIZZ;
        if (c099f != null && (!c099f.isCompleted())) {
            c099f.LJJLIIIJILLIZJL(Boolean.FALSE);
        }
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
    }

    public final InterfaceC366450EYh LJIJJ() {
        C1DRG c1drg = this.LIZ;
        if (c1drg != null) {
            return (InterfaceC366450EYh) c1drg.LJIIL(null, InterfaceC366450EYh.class);
        }
        return null;
    }

    @Override // X.InterfaceC1459100o4a
    public final boolean LIZJ() {
        LiveData<Boolean> liveDataQ72;
        Boolean value;
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = LJIJJ();
        if (interfaceC366450EYhLJIJJ == null || (liveDataQ72 = interfaceC366450EYhLJIJJ.q72()) == null || (value = liveDataQ72.getValue()) == null) {
            return false;
        }
        return value.booleanValue();
    }

    @Override // X.InterfaceC1459100o4a
    public final void LJ() {
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = LJIJJ();
        if (interfaceC366450EYhLJIJJ != null) {
            interfaceC366450EYhLJIJJ.yS(this.LJIIJJI);
        }
    }

    @Override // X.InterfaceC1459100o4a
    public final String LJIIJ() {
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = LJIJJ();
        if (interfaceC366450EYhLJIJJ != null) {
            return interfaceC366450EYhLJIJJ.gA1(this.LJIIJJI);
        }
        return null;
    }

    @Override // X.InterfaceC1459100o4a
    public final C560530Lyd LIZLLL() {
        return this.LJIILLIIL;
    }

    @Override // X.InterfaceC1459100o4a
    public final C560530Lyd LJI() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC1459100o4a
    public final C560530Lyd LJIIIZ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1459100o4a
    public final C560530Lyd LJIILJJIL() {
        return this.LJIILL;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJJI(java.lang.String r5) {
        /*
            r4 = this;
            r3 = 1
            r1 = 0
            if (r5 == 0) goto L5d
            int r0 = r5.length()
            if (r0 == 0) goto L5d
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = r4.LIZIZ
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            r2 = 0
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L50
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
        L1b:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r1 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            boolean r0 = r4.LJIIJJI
            if (r0 == 0) goto L52
            if (r1 == 0) goto L46
            java.util.List r0 = r1.getMergedMusicList()
            if (r0 == 0) goto L46
            java.util.Iterator r1 = r0.iterator()
        L2f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L46
            java.lang.Object r0 = r1.next()
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = (com.ss.android.ugc.aweme.creative.model.music.AVMusic) r0
            java.lang.String r0 = r0.getMusicId()
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 == 0) goto L2f
        L45:
            return r3
        L46:
            java.lang.String r0 = r4.LJIIIZ
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r5)
            if (r0 != 0) goto L45
            r3 = 0
            return r3
        L50:
            r0 = r2
            goto L1b
        L52:
            if (r1 == 0) goto L58
            java.lang.String r2 = r1.getMusicId()
        L58:
            boolean r3 = kotlin.jvm.internal.Intrinsics.LJFF(r5, r2)
            return r3
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465410oEl.LJJI(java.lang.String):boolean");
    }

    public final void LJJII(String str) {
        if (C273380AnY.LIZ()) {
            InterfaceC366450EYh interfaceC366450EYhLJIJJ = LJIJJ();
            if (interfaceC366450EYhLJIJJ != null) {
                interfaceC366450EYhLJIJJ.ZJ2(str);
                return;
            }
            return;
        }
        this.LJ = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1465410oEl(C1DRG c1drg, Function0<? extends VideoPublishEditModel> function0) {
        this.LIZ = c1drg;
        this.LIZIZ = function0;
    }

    @Override // X.InterfaceC1459100o4a
    public final C099F LIZ(MusicModel musicModel, LifecycleCoroutineScope lifecycleCoroutineScope) {
        C099F c099fLIZIZ = C090F.LIZIZ();
        AVMusic aVMusicLIZ = new C15KP().apply(musicModel);
        if (aVMusicLIZ == null) {
            c099fLIZIZ.LJJLIIIJILLIZJL(Boolean.FALSE);
            return c099fLIZIZ;
        }
        String musicId = aVMusicLIZ.getMusicId();
        synchronized (this.LIZJ) {
            try {
                if (!LJJI(musicId)) {
                    c099fLIZIZ.LJJLIIIJILLIZJL(Boolean.FALSE);
                    return c099fLIZIZ;
                }
                AnonymousClass0956 anonymousClass0956 = this.LJII;
                if (anonymousClass0956 != null) {
                    anonymousClass0956.LIZIZ(null);
                }
                this.LJII = null;
                C099F c099f = this.LJIIIIZZ;
                if (c099f != null && (!c099f.isCompleted())) {
                    c099f.LJJLIIIJILLIZJL(Boolean.FALSE);
                }
                this.LJIIIIZZ = c099fLIZIZ;
                long j = this.LJFF;
                C099G c099gLJJIII = this.LJI;
                if (c099gLJJIII == null) {
                    c099gLJJIII = LJJIII(aVMusicLIZ, lifecycleCoroutineScope, j);
                }
                Pair pair = new Pair(Long.valueOf(j), c099gLJJIII);
                this.LJII = C23250099c.LIZLLL(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C05W8((AnonymousClass0957) pair.getSecond(), this, ((Number) pair.getFirst()).longValue(), musicId, c099fLIZIZ, null), 2);
                return c099fLIZIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b5  */
    @Override // X.InterfaceC1459100o4a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL(boolean r5, boolean r6) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465410oEl.LJIILIIL(boolean, boolean):void");
    }

    public final void LJIILLIIL(long j, String str) {
        boolean zLJJ;
        synchronized (this.LIZJ) {
            try {
                zLJJ = LJJ(j, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIJI(j, str);
        if (!zLJJ) {
            return;
        }
        C01TT.LIZLLL(new AwS566S0100000_22(this, 1138));
    }

    public final void LJIIZILJ(long j, String str) {
        boolean zLJJ;
        synchronized (this.LIZJ) {
            try {
                zLJJ = LJJ(j, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJIJI(j, str);
        if (!zLJJ) {
            return;
        }
        C01TT.LIZLLL(new AwS566S0100000_22(this, 1139));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIJ(java.util.List<? extends com.ss.android.ugc.aweme.creative.model.music.AVMusic> r12, X.InterfaceC1364105Vn<? super kotlin.Pair<? extends java.util.List<X.C0EQL>, X.C05WK>> r13) {
        /*
            r11 = this;
            boolean r0 = X.C273380AnY.LIZ()
            r3 = 0
            if (r0 == 0) goto L35
            X.0EYh r0 = r11.LJIJJ()
            if (r0 == 0) goto L32
            java.lang.String r7 = r0.x41()
        L11:
            if (r7 == 0) goto L33
            int r0 = r7.length()
            if (r0 == 0) goto L33
            r0 = 0
        L1a:
            java.lang.String r8 = "edit_pro_sound"
            java.lang.String r2 = "edit_page_music"
            r10 = r13
            r6 = r12
            if (r0 == 0) goto L38
            X.0EYh r1 = r11.LJIJJ()
            if (r1 == 0) goto L49
            boolean r0 = r11.LJIIJJI
            if (r0 != 0) goto L2d
            r8 = r2
        L2d:
            java.lang.Object r0 = r1.Uu0(r0, r6, r8, r10)
            return r0
        L32:
            r7 = r3
        L33:
            r0 = 1
            goto L1a
        L35:
            java.lang.String r7 = r11.LJ
            goto L11
        L38:
            X.0EYh r4 = r11.LJIJJ()
            if (r4 == 0) goto L49
            boolean r5 = r11.LJIIJJI
            if (r5 != 0) goto L43
            r8 = r2
        L43:
            r9 = 0
            java.lang.Object r0 = r4.nG1(r5, r6, r7, r8, r9, r10)
            return r0
        L49:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465410oEl.LJIJ(java.util.List, X.05Vn):java.lang.Object");
    }

    public final void LJIJI(long j, String str) {
        synchronized (this.LIZJ) {
            try {
                if (LJJ(j, str) && Intrinsics.LJFF(this.LJIIIZ, str)) {
                    this.LJIIIZ = null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final boolean LJJ(long j, String str) {
        if (this.LJFF == j && LJJI(str)) {
            return true;
        }
        return false;
    }

    public final void LJJIFFI(MusicModel musicModel, LifecycleCoroutineScope lifecycleCoroutineScope) {
        AVMusic aVMusicLIZ = new C15KP().apply(musicModel);
        if (aVMusicLIZ == null) {
            return;
        }
        synchronized (this.LIZJ) {
            try {
                long j = this.LJFF;
                this.LJIIIZ = aVMusicLIZ.getMusicId();
                LJJIII(aVMusicLIZ, lifecycleCoroutineScope, j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1459100o4a
    public final void LJFF(MusicModel musicModel, LifecycleCoroutineScope lifecycleCoroutineScope, boolean z) {
        String musicId;
        C01TT.LIZLLL(new AwS566S0100000_22(this, 1147));
        boolean zLIZJ = LIZJ();
        if (z) {
            LJIL(musicModel, lifecycleCoroutineScope, zLIZJ);
            return;
        }
        if (musicModel != null) {
            musicId = musicModel.getMusicId();
        } else {
            musicId = null;
        }
        synchronized (this.LIZJ) {
            try {
                this.LJFF++;
                LJIILL();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (musicId != null && musicId.length() != 0) {
            InterfaceC366450EYh interfaceC366450EYhLJIJJ = LJIJJ();
            if (interfaceC366450EYhLJIJJ != null) {
                interfaceC366450EYhLJIJJ.US1(this.LJIIJJI, musicId);
            }
            if (Intrinsics.LJFF(this.LIZLLL, musicId)) {
                this.LIZLLL = null;
            }
        } else {
            LJIIL();
        }
        C01TT.LIZLLL(new AwS566S0100000_22(this, 1142));
    }

    @Override // X.InterfaceC1459100o4a
    public final void LJII(MusicModel musicModel, LifecycleCoroutineScope lifecycleCoroutineScope, boolean z) {
        String musicId;
        C01TT.LIZLLL(new AwS566S0100000_22(this, 1146));
        AVMusic aVMusicLIZ = new C15KP().apply(musicModel);
        if (aVMusicLIZ == null) {
            return;
        }
        if (z) {
            if (C273380AnY.LIZ()) {
                LJJII(null);
            }
            C01TT.LIZLLL(new AwS403S0200000_2(this, aVMusicLIZ, 86));
            synchronized (this.LIZJ) {
                try {
                    if (!LJJI(aVMusicLIZ.getMusicId())) {
                        return;
                    }
                    LJJIII(aVMusicLIZ, lifecycleCoroutineScope, this.LJFF);
                    LIZ(musicModel, lifecycleCoroutineScope);
                    return;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        }
        if (C273380AnY.LIZ()) {
            LJJII(null);
        }
        synchronized (this.LIZJ) {
            if (musicModel == null) {
                musicId = null;
            } else {
                try {
                    musicId = musicModel.getMusicId();
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (LJJI(musicId)) {
                LJIILL();
            }
        }
        String musicId2 = aVMusicLIZ.getMusicId();
        InterfaceC366450EYh interfaceC366450EYhLJIJJ = LJIJJ();
        if (interfaceC366450EYhLJIJJ != null) {
            interfaceC366450EYhLJIJJ.US1(this.LJIIJJI, musicId2);
        }
        C354270Duj.LIZJ(0L, new AwS151S1100000_2(this, musicId2, 28));
        if (Intrinsics.LJFF(this.LIZLLL, aVMusicLIZ.getMusicId())) {
            this.LIZLLL = null;
        }
    }

    public final void LJIJJLI(long j, String str, boolean z) {
        boolean zLJJ;
        synchronized (this.LIZJ) {
            try {
                zLJJ = LJJ(j, str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (!zLJJ) {
            return;
        }
        C01TT.LIZLLL(new C05W9(this, z, str));
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r7, androidx.lifecycle.LifecycleCoroutineScope r8, boolean r9) {
        /*
            r6 = this;
            r5 = 0
            r1 = 0
            if (r7 == 0) goto L49
            kotlin.jvm.functions.Function0<com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel> r0 = r6.LIZIZ
            java.lang.Object r0 = r0.invoke()
            com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r0 = (com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel) r0
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.creative.model.CreativeModel r0 = r0.creativeModel
            if (r0 == 0) goto L4d
            com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel r0 = r0.musicBuzModel
        L14:
            com.ss.android.ugc.aweme.creative.model.music.AVMusic r0 = com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt.extractAVMusic(r0)
            if (r0 == 0) goto L45
            boolean r0 = r0.hasLyricCopyRight()
            if (r0 == 0) goto L45
            boolean r0 = r7.hasLyricsCopyRight()
            if (r0 == 0) goto L2c
            boolean r0 = r7.isLocalMusic()
            if (r0 == 0) goto L45
        L2c:
            java.lang.String r0 = r6.LIZLLL
            boolean r0 = X.C1533950q1J.LJ(r0)
            if (r0 == 0) goto L45
            if (r9 == 0) goto L43
            boolean r0 = r6.LJIIJ
            if (r0 == 0) goto L43
            r6.LJIIJ = r1
            X.0Lyd<kotlin.Unit> r1 = r6.LJIILL
            kotlin.Unit r0 = kotlin.Unit.LIZ
            r1.LJIIIZ(r0)
        L43:
            if (r7 == 0) goto L49
        L45:
            java.lang.String r5 = r7.getMusicId()
        L49:
            java.lang.Object r4 = r6.LIZJ
            monitor-enter(r4)
            goto L4f
        L4d:
            r0 = r5
            goto L14
        L4f:
            long r2 = r6.LJFF     // Catch: java.lang.Throwable -> L92
            r0 = 1
            long r2 = r2 + r0
            r6.LJFF = r2     // Catch: java.lang.Throwable -> L92
            r6.LJIILL()     // Catch: java.lang.Throwable -> L92
            monitor-exit(r4)
            if (r9 != 0) goto L6a
            r6.LJIIL()
            kotlin.jvm.internal.AwS566S0100000_22 r1 = new kotlin.jvm.internal.AwS566S0100000_22
            r0 = 1143(0x477, float:1.602E-42)
            r1.<init>(r6, r0)
            X.C01TT.LIZLLL(r1)
            return
        L6a:
            if (r5 == 0) goto L87
            int r0 = r5.length()
            if (r0 == 0) goto L87
            boolean r0 = r7.hasLyricsCopyRight()
            if (r0 != 0) goto L83
            kotlin.jvm.internal.AwS566S0100000_22 r1 = new kotlin.jvm.internal.AwS566S0100000_22
            r0 = 1145(0x479, float:1.604E-42)
            r1.<init>(r6, r0)
            X.C01TT.LIZLLL(r1)
            return
        L83:
            r6.LJJIFFI(r7, r8)
            return
        L87:
            kotlin.jvm.internal.AwS566S0100000_22 r1 = new kotlin.jvm.internal.AwS566S0100000_22
            r0 = 1144(0x478, float:1.603E-42)
            r1.<init>(r6, r0)
            X.C01TT.LIZLLL(r1)
            return
        L92:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L92
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1465410oEl.LJIL(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, androidx.lifecycle.LifecycleCoroutineScope, boolean):void");
    }

    public final C099G LJJIII(AVMusic aVMusic, LifecycleCoroutineScope lifecycleCoroutineScope, long j) {
        String musicId = aVMusic.getMusicId();
        this.LJIIIZ = musicId;
        C099G c099gLIZIZ = C23250099c.LIZIZ(lifecycleCoroutineScope, C0PEM.LIZJ, null, new C05O7(this, aVMusic, j, musicId, null), 2);
        this.LJI = c099gLIZIZ;
        return c099gLIZIZ;
    }
}
