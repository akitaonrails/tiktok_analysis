package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.livesetting.rank.LiveRankEntranceSplitSetting;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS571S0100000_27;

/* JADX INFO: renamed from: X.0y2s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1842440y2s {
    public final Function0<InterfaceC1842620y3A> LIZ;
    public final Function0<InterfaceC1842620y3A> LIZIZ;
    public EnumC1100320eju LIZJ;
    public EnumC1100320eju LIZLLL;
    public EnumC1100320eju LJ;
    public long LJFF;
    public boolean LJI;
    public final C054G LJII;
    public AnonymousClass0956 LJIIIIZZ;
    public final long LJIIIZ;
    public final long LJIIJ;
    public final long LJIIJJI;
    public final long LJIIL;
    public final long LJIILIIL;
    public final int LJIILJJIL;
    public final long LJIILL;
    public boolean LJIILLIIL;

    public final void LIZIZ() {
        this.LIZLLL = null;
        this.LJ = null;
        InterfaceC1842620y3A interfaceC1842620y3AInvoke = this.LIZ.invoke();
        if (interfaceC1842620y3AInvoke != null) {
            interfaceC1842620y3AInvoke.v0(false);
        }
        InterfaceC1842620y3A interfaceC1842620y3AInvoke2 = this.LIZIZ.invoke();
        if (interfaceC1842620y3AInvoke2 != null) {
            interfaceC1842620y3AInvoke2.v0(false);
        }
        this.LJFF = 0L;
        this.LJI = false;
    }

    public final void LIZLLL() {
        AnonymousClass0956 anonymousClass0956 = this.LJIIIIZZ;
        if (anonymousClass0956 == null || !anonymousClass0956.isActive()) {
            this.LJIIIIZZ = C23250099c.LIZLLL(this.LJII, null, null, new C863180Xtc(this, null), 3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f2, code lost:
    
        if ((r11 - (r0 != null ? r0.LLLIIL() : 0)) < r14.LJIIJJI) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ() {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1842440y2s.LJ():boolean");
    }

    public final long LIZ(long j) {
        long jLLILIL;
        EnumC1100320eju enumC1100320ejuI0;
        InterfaceC1842620y3A interfaceC1842620y3AInvoke = this.LIZ.invoke();
        long jLLILIL2 = 0;
        if (interfaceC1842620y3AInvoke != null) {
            jLLILIL = interfaceC1842620y3AInvoke.LLILIL();
        } else {
            jLLILIL = 0;
        }
        InterfaceC1842620y3A interfaceC1842620y3AInvoke2 = this.LIZIZ.invoke();
        if (interfaceC1842620y3AInvoke2 != null) {
            jLLILIL2 = interfaceC1842620y3AInvoke2.LLILIL();
        }
        InterfaceC1842620y3A interfaceC1842620y3AInvoke3 = this.LIZ.invoke();
        EnumC1100320eju enumC1100320ejuI02 = null;
        if (interfaceC1842620y3AInvoke3 != null) {
            enumC1100320ejuI0 = interfaceC1842620y3AInvoke3.I0();
        } else {
            enumC1100320ejuI0 = null;
        }
        EnumC1100320eju enumC1100320eju = EnumC1100320eju.EXPAND;
        if (enumC1100320ejuI0 == enumC1100320eju && SystemClock.elapsedRealtime() - jLLILIL < j) {
            return jLLILIL + j;
        }
        InterfaceC1842620y3A interfaceC1842620y3AInvoke4 = this.LIZIZ.invoke();
        if (interfaceC1842620y3AInvoke4 != null) {
            enumC1100320ejuI02 = interfaceC1842620y3AInvoke4.I0();
        }
        if (enumC1100320ejuI02 == enumC1100320eju && SystemClock.elapsedRealtime() - jLLILIL2 < j) {
            return jLLILIL2 + j;
        }
        return SystemClock.elapsedRealtime();
    }

    public C1842440y2s(AwS571S0100000_27 awS571S0100000_27, AwS571S0100000_27 awS571S0100000_272) {
        this.LIZ = awS571S0100000_27;
        this.LIZIZ = awS571S0100000_272;
        C1DFH c1dfh = C0PEM.LIZ;
        this.LJII = C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII());
        this.LJIIIZ = 500L;
        LiveRankEntranceSplitSetting liveRankEntranceSplitSetting = LiveRankEntranceSplitSetting.INSTANCE;
        this.LJIIJ = (((long) liveRankEntranceSplitSetting.getValue().minExpandDurationS) * 1000) + 1400;
        this.LJIIJJI = ((long) liveRankEntranceSplitSetting.getValue().collapseAfterAnimationEndS) * 1000;
        this.LJIIL = ((long) liveRankEntranceSplitSetting.getValue().guideDelayS) * 1000;
        this.LJIILIIL = (((long) liveRankEntranceSplitSetting.getValue().guideExpandDurationS) * 1000) + 1400;
        this.LJIILJJIL = liveRankEntranceSplitSetting.getValue().guideCount;
        this.LJIILL = ((long) liveRankEntranceSplitSetting.getValue().guideIntervalS) * 1000;
    }

    public final void LIZJ(EnumC1100320eju enumC1100320eju, EnumC1100320eju enumC1100320eju2) {
        EnumC1100320eju enumC1100320ejuI0;
        int iIntValue;
        Pair pair;
        if (this.LIZ.invoke() == null && this.LIZIZ.invoke() == null) {
            if (!this.LJIILLIIL) {
                LiveRankEntranceSplitSetting liveRankEntranceSplitSetting = LiveRankEntranceSplitSetting.INSTANCE;
                if (liveRankEntranceSplitSetting.isSplitEnabled() && this.LJIILJJIL > 0) {
                    Integer numLIZIZ = InterfaceC1106030et7.I4.LIZIZ();
                    if (numLIZIZ != null) {
                        iIntValue = numLIZIZ.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    if (iIntValue < this.LJIILJJIL) {
                        long jLongValue = 0;
                        if (this.LJIILL > 0) {
                            Long lLIZIZ = InterfaceC1106030et7.J4.LIZIZ();
                            if (lLIZIZ != null) {
                                jLongValue = lLIZIZ.longValue();
                            }
                            if (System.currentTimeMillis() - jLongValue < this.LJIILL) {
                                return;
                            }
                        }
                        int iSplitStyle = liveRankEntranceSplitSetting.splitStyle();
                        if (iSplitStyle != 1) {
                            if (iSplitStyle == 2) {
                                EnumC1100320eju enumC1100320eju3 = this.LIZJ;
                                EnumC1100320eju enumC1100320eju4 = EnumC1100320eju.EXPAND;
                                if (enumC1100320eju3 != enumC1100320eju4) {
                                    pair = new Pair(enumC1100320eju4, EnumC1100320eju.COLLAPSE);
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        } else {
                            EnumC1100320eju enumC1100320eju5 = this.LIZJ;
                            EnumC1100320eju enumC1100320eju6 = EnumC1100320eju.COLLAPSE;
                            if (enumC1100320eju5 == enumC1100320eju6) {
                                return;
                            } else {
                                pair = new Pair(enumC1100320eju6, EnumC1100320eju.EXPAND);
                            }
                        }
                        this.LJIILLIIL = true;
                        this.LJI = true;
                        EnumC1100320eju enumC1100320eju7 = (EnumC1100320eju) pair.getFirst();
                        EnumC1100320eju enumC1100320eju8 = (EnumC1100320eju) pair.getSecond();
                        long jElapsedRealtime = SystemClock.elapsedRealtime() + this.LJIIL;
                        this.LIZLLL = enumC1100320eju7;
                        this.LJ = enumC1100320eju8;
                        this.LJFF = jElapsedRealtime;
                        LIZLLL();
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        if (this.LIZ.invoke() != null && this.LIZIZ.invoke() != null) {
            if (enumC1100320eju == null && enumC1100320eju2 == null) {
                return;
            }
            InterfaceC1842620y3A interfaceC1842620y3AInvoke = this.LIZ.invoke();
            EnumC1100320eju enumC1100320ejuI02 = null;
            if (interfaceC1842620y3AInvoke != null) {
                enumC1100320ejuI0 = interfaceC1842620y3AInvoke.I0();
            } else {
                enumC1100320ejuI0 = null;
            }
            if (enumC1100320eju == enumC1100320ejuI0) {
                InterfaceC1842620y3A interfaceC1842620y3AInvoke2 = this.LIZIZ.invoke();
                if (interfaceC1842620y3AInvoke2 != null) {
                    enumC1100320ejuI02 = interfaceC1842620y3AInvoke2.I0();
                }
                if (enumC1100320eju2 == enumC1100320ejuI02) {
                    LIZIZ();
                    return;
                }
            }
            this.LIZLLL = enumC1100320eju;
            this.LJ = enumC1100320eju2;
            this.LJFF = LIZ(this.LJIIJ);
            if (!LJ()) {
                LIZLLL();
            }
        }
    }
}
