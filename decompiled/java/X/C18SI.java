package X;

import android.os.CountDownTimer;
import android.os.SystemClock;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import ge.i;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS44S0010000_32;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS611S0100000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18SI, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18SI extends i<InterfaceC557450Ltf, C18S8, C18S9, C18S7> implements InterfaceC379610EuV, InterfaceC557450Ltf {
    public static final C18SN LLLFF = new Object() { // from class: X.18SN
    };
    public final C1851870yI5 LLJILJILJ;
    public final C1DRG LLJILLL;
    public final MutableLiveData<String> LLJJ;
    public final MutableLiveData<String> LLJJI;
    public final MutableLiveData<Boolean> LLJJIII;
    public final MutableLiveData<Long> LLJJIJI;
    public final MutableLiveData<AbstractC557460Ltg> LLJJIJIIJIL;
    public final MutableLiveData<C006R> LLJJIJIL;
    public final MutableLiveData<Unit> LLJJJ;
    public final MutableLiveData<String> LLJJJIL;
    public EnumC559620LxA LLJJJJ;
    public C18S6 LLJJJJJIL;
    public boolean LLJJJJLIIL;
    public String LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public C18SK LLJL;
    public long LLJLIL;
    public boolean LLJLILLLLZIIL;
    public Long LLJLL;
    public CountDownTimer LLJLLIL;
    public long LLJLLL;
    public boolean LLJZ;
    public final C01GW LLJZIJLIL;
    public final C18SJ LLL;
    public final C01GW LLLF;

    @Override // X.InterfaceC557450Ltf
    public void Hm0() {
        m90(false);
        start();
    }

    @Override // X.InterfaceC557450Ltf
    public void start() {
        this.LLJZ = false;
        CountDownTimer countDownTimer = this.LLJLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLJLILLLLZIIL = false;
        this.LLJLL = null;
        this.LLJJJJJIL = C18S6.START;
        c3(AFwS278S0000000_32.get$arr$(177));
        this.LLJLIL = SystemClock.elapsedRealtime();
        k5().LIZ();
        this.LLJLLIL = new C19LK(this, this.LLJLLL, 2).start();
    }

    public final long C5() {
        Long l = this.LLJLL;
        return l != null ? l.longValue() : SystemClock.elapsedRealtime() - this.LLJLIL;
    }

    @Override // X.InterfaceC557450Ltf
    public void KO0() {
        this.LLJL = C18SK.LLILLL;
        cancel();
    }

    @Override // X.InterfaceC557450Ltf
    public void cancel() {
        CountDownTimer countDownTimer = this.LLJLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLJLLIL = null;
        c3(AFwS278S0000000_32.get$arr$(173));
        F4(SystemClock.elapsedRealtime() - this.LLJLIL);
        boolean z = this.LLJL == C18SK.LLILLL;
        this.LLJL = null;
        if (z) {
            this.LLJJIJIIJIL.postValue(C557520Ltm.LIZ);
        }
        this.LLJJJJJIL = C18S6.STOP;
        c3(AFwS278S0000000_32.get$arr$(174));
        k5().LJJIJIIJIL();
        vt0();
    }

    public final float d5() {
        return ((Number) this.LLJZIJLIL.getValue()).floatValue();
    }

    @Override // X.InterfaceC557450Ltf
    public void i5() {
        C18SL eventHandler$tools_ai_uikit_df_release = this.LLJILJILJ.getEventHandler$tools_ai_uikit_df_release();
        if (eventHandler$tools_ai_uikit_df_release != null) {
            eventHandler$tools_ai_uikit_df_release.i5();
        }
        if (hJ1()) {
            this.LLJL = C18SK.LLILLL;
            cancel();
        } else {
            this.LLJL = C18SK.LL;
            zf();
        }
    }

    public final C18SM k5() {
        return (C18SM) this.LLLF.getValue();
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C18S9> o2() {
        return AFwS223S0000000_32.get$arr$(260);
    }

    @Override // X.InterfaceC557450Ltf
    public void vt0() {
        CountDownTimer countDownTimer = this.LLJLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLJLLIL = null;
        this.LLJJJJJIL = C18S6.STOP;
        this.LLJJIII.postValue(Boolean.FALSE);
        c3(AFwS278S0000000_32.get$arr$(176));
    }

    @Override // X.AbstractC1664470tPp
    public Function0<C18S7> w2() {
        return new AwS576S0100000_32(this, 790);
    }

    @Override // X.AbstractC2255721DQs
    public void onStop() {
        super.onStop();
        if (this.LLJJJJJIL == C18S6.START) {
            this.LLJL = C18SK.LLILLL;
            cancel();
        }
    }

    @Override // X.InterfaceC557450Ltf
    public void zf() {
        this.LLJJLIIIJLLLLLLLZ = SystemClock.elapsedRealtime();
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.LLJLIL;
        F4(jElapsedRealtime);
        this.LLJLL = Long.valueOf(jElapsedRealtime);
        k5().zf();
        this.LLJZ = true;
        this.LLJJIJIIJIL.postValue(C557530Ltn.LIZ);
        vt0();
        CountDownTimer countDownTimer = this.LLJLLIL;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.LLJLLIL = null;
        c3(AFwS278S0000000_32.get$arr$(175));
    }

    public MutableLiveData<Unit> H4() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData Jp1() {
        return this.LLJJIJIIJIL;
    }

    public MutableLiveData<String> K4() {
        return this.LLJJ;
    }

    public MutableLiveData<Long> O4() {
        return this.LLJJIJI;
    }

    public MutableLiveData<AbstractC557460Ltg> P4() {
        return this.LLJJIJIIJIL;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData Po1() {
        return this.LLJJI;
    }

    public MutableLiveData<String> T4() {
        return this.LLJJI;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData Wj1() {
        return this.LLJJJIL;
    }

    public MutableLiveData<String> Z4() {
        return this.LLJJJIL;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData ak2() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC379610EuV
    public C1DRG getDiContainer() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC557450Ltf
    public boolean hJ1() {
        return this.LLJJJJLIIL;
    }

    public MutableLiveData<C006R> n5() {
        return this.LLJJIJIL;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData rR() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData rm2() {
        return this.LLJJ;
    }

    public MutableLiveData<Boolean> t5() {
        return this.LLJJIII;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData wj() {
        return this.LLJJIJI;
    }

    @Override // X.InterfaceC557450Ltf
    public /* bridge */ /* synthetic */ LiveData xP2() {
        return this.LLJJJ;
    }

    @Override // X.InterfaceC557450Ltf
    public void B32(float f) {
        boolean z;
        C18SL eventHandler$tools_ai_uikit_df_release;
        if (f <= (-d5())) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LLJJJJLIIL && (eventHandler$tools_ai_uikit_df_release = this.LLJILJILJ.getEventHandler$tools_ai_uikit_df_release()) != null) {
            eventHandler$tools_ai_uikit_df_release.j5();
        }
        m90(z);
    }

    public final void F4(long j) {
        if (this.LLJLILLLLZIIL || j <= 0) {
            return;
        }
        this.LLJLILLLLZIIL = true;
        this.LLJJIJI.postValue(Long.valueOf(j));
    }

    @Override // X.InterfaceC557450Ltf
    public void Fa1(EnumC559620LxA enumC559620LxA) {
        this.LLJJJJ = enumC559620LxA;
        this.LLJJJJLIIL = false;
        this.LLJJJJJIL = C18S6.STOP;
        this.LLJJIII.setValue(Boolean.TRUE);
        i3(new AwS611S0100000_32(enumC559620LxA, 355));
    }

    @Override // X.InterfaceC557450Ltf
    public void m90(boolean z) {
        this.LLJJJJLIIL = z;
        i3(new AwS44S0010000_32(z, 29));
    }

    public final boolean v5(int i, Exception exc) {
        return C13LQ.LJLIIL(new Integer[]{4000, 4001, 4002, 4003, 4004, 4011}).contains(Integer.valueOf(i));
    }

    public final void x5(C143600gk c143600gk, EnumC992460bvw enumC992460bvw) {
        final long jC5;
        final Long lValueOf;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int iOrdinal = enumC992460bvw.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
                throw new C1954807lC();
            }
            jC5 = C5();
        } else {
            jC5 = jElapsedRealtime - this.LLJLIL;
        }
        int iOrdinal2 = enumC992460bvw.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 != 1 && iOrdinal2 != 2 && iOrdinal2 != 3) {
                throw new C1954807lC();
            }
            lValueOf = Long.valueOf(jElapsedRealtime - this.LLJJLIIIJLLLLLLLZ);
        } else {
            lValueOf = null;
        }
        MutableLiveData<C006R> mutableLiveData = this.LLJJIJIL;
        final int i = c143600gk.LIZ;
        final EnumC0338009w enumC0338009w = c143600gk.LIZIZ;
        mutableLiveData.postValue((C006R) new Object(jC5, lValueOf, i, enumC0338009w) { // from class: X.006R
            public final long LIZ;
            public final Long LIZIZ;
            public final int LIZJ;
            public final EnumC0338009w LIZLLL;

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C006R)) {
                    return false;
                }
                C006R c006r = (C006R) obj;
                return this.LIZ == c006r.LIZ && Intrinsics.LJFF(this.LIZIZ, c006r.LIZIZ) && this.LIZJ == c006r.LIZJ && this.LIZLLL == c006r.LIZLLL;
            }

            public final int hashCode() {
                int iY2 = C786410Ut5.Y2(this.LIZ) * 31;
                Long l = this.LIZIZ;
                return ((((iY2 + (l == null ? 0 : l.hashCode())) * 31) + this.LIZJ) * 31) + this.LIZLLL.hashCode();
            }

            public final String toString() {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("VoiceBoxTrackEvent(voicetime=");
                sbLIZ.append(this.LIZ);
                sbLIZ.append(", costtime=");
                sbLIZ.append(this.LIZIZ);
                sbLIZ.append(", resultcode=");
                sbLIZ.append(this.LIZJ);
                sbLIZ.append(", transresult=");
                sbLIZ.append(this.LIZLLL);
                sbLIZ.append(')');
                return C2188811AlT.LIZIZ(sbLIZ);
            }

            {
                this.LIZ = jC5;
                this.LIZIZ = lValueOf;
                this.LIZJ = i;
                this.LIZLLL = enumC0338009w;
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.18SJ] */
    public C18SI(C19A3 c19a3, C1851870yI5 c1851870yI5, C1DRG c1drg) {
        super(c19a3);
        this.LLJILJILJ = c1851870yI5;
        this.LLJILLL = c1drg;
        this.LLJJ = new MutableLiveData<>();
        this.LLJJI = new MutableLiveData<>();
        this.LLJJIII = new MutableLiveData<>();
        this.LLJJIJI = new MutableLiveData<>();
        this.LLJJIJIIJIL = new MutableLiveData<>();
        this.LLJJIJIL = new MutableLiveData<>();
        this.LLJJJ = new MutableLiveData<>();
        this.LLJJJIL = new MutableLiveData<>();
        this.LLJJJJ = EnumC559620LxA.CLICK;
        this.LLJJJJJIL = C18S6.STOP;
        this.LLJJL = "";
        this.LLJLLL = c1851870yI5.getAsrMaxSpeechDurationLimitMs$tools_ai_uikit_df_release();
        this.LLJZIJLIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 791));
        this.LLL = new InterfaceC1767330w5j() { // from class: X.18SJ
            @Override // X.InterfaceC1767330w5j
            public final void LIZIZ() {
            }

            @Override // X.InterfaceC1767330w5j
            public final void LIZ(String str) {
                boolean z;
                AbstractC557460Ltg c557490Ltj;
                C18SI c18si = this.LIZ;
                c18si.LLJZ = false;
                c18si.LLJJ.postValue(str);
                this.LIZ.C5();
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C18SI c18si2 = this.LIZ;
                    c18si2.LLJL = null;
                    c18si2.x5(C1EPI.LIZIZ(C1EPH.NO_VOICE), EnumC992460bvw.LLILLL);
                    this.LIZ.c3(AFwS278S0000000_32.get$arr$(180));
                    this.LIZ.LLJJIJIIJIL.postValue(C557520Ltm.LIZ);
                    this.LIZ.k5().LJJIJIIJIL();
                    return;
                }
                C18SI c18si3 = this.LIZ;
                C18SK c18sk = c18si3.LLJL;
                c18si3.LLJL = null;
                if (c18sk != null) {
                    c18si3.x5(C1EPI.LIZIZ(C1EPH.SUCCESS), EnumC992460bvw.LLILLJJLI);
                    C18SI c18si4 = this.LIZ;
                    if (str.length() == 0) {
                        str = c18si4.LLJJL;
                    }
                    MutableLiveData<AbstractC557460Ltg> mutableLiveData = this.LIZ.LLJJIJIIJIL;
                    int iOrdinal = c18sk.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            if (iOrdinal == 2) {
                                c557490Ltj = C557520Ltm.LIZ;
                            } else {
                                throw new C1954807lC();
                            }
                        } else {
                            c557490Ltj = new C557500Ltk(str);
                        }
                    } else {
                        c557490Ltj = new C557490Ltj(str);
                    }
                    mutableLiveData.postValue(c557490Ltj);
                    this.LIZ.k5().LJJIJIIJIL();
                }
            }

            @Override // X.InterfaceC1767330w5j
            public final void LIZJ(String str) {
                C18SI c18si = this.LIZ;
                c18si.LLJJL = str;
                c18si.LLJJI.postValue(str);
            }

            @Override // X.InterfaceC1767330w5j
            public final void h8(float f) {
                this.LIZ.c3(new C18SH(f));
            }

            @Override // X.InterfaceC1767330w5j
            public final void J(int i, Exception exc) {
                AbstractC557460Ltg abstractC557460Ltg;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C18SI c18si = this.LIZ;
                long j = jElapsedRealtime - c18si.LLJLIL;
                boolean zV5 = c18si.v5(i, exc);
                C18SI c18si2 = this.LIZ;
                if (!c18si2.LLJZ) {
                    c18si2.F4(j);
                }
                C18SI c18si3 = this.LIZ;
                if (c18si3.LLJZ) {
                    c18si3.x5(C1EPI.LIZ(i), EnumC992460bvw.LLILZ);
                } else {
                    c18si3.x5(C1EPI.LIZ(i), EnumC992460bvw.LL);
                }
                C18SI c18si4 = this.LIZ;
                c18si4.LLJL = null;
                c18si4.LLJJJJJIL = C18S6.STOP;
                c18si4.c3(new AwS44S0010000_32(zV5, 30));
                if (this.LIZ.LLJZ) {
                    abstractC557460Ltg = new AbstractC557460Ltg(i, exc) { // from class: X.0Lth
                        public final int LIZ;
                        public final Exception LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C557470Lth)) {
                                return false;
                            }
                            C557470Lth c557470Lth = (C557470Lth) obj;
                            return this.LIZ == c557470Lth.LIZ && Intrinsics.LJFF(this.LIZIZ, c557470Lth.LIZIZ);
                        }

                        public final int hashCode() {
                            return (this.LIZ * 31) + this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("LoadingError(code=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", e=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = i;
                            this.LIZIZ = exc;
                        }
                    };
                } else {
                    abstractC557460Ltg = new AbstractC557460Ltg(i, exc) { // from class: X.0Lti
                        public final int LIZ;
                        public final Exception LIZIZ;

                        public final boolean equals(Object obj) {
                            if (this == obj) {
                                return true;
                            }
                            if (!(obj instanceof C557480Lti)) {
                                return false;
                            }
                            C557480Lti c557480Lti = (C557480Lti) obj;
                            return this.LIZ == c557480Lti.LIZ && Intrinsics.LJFF(this.LIZIZ, c557480Lti.LIZIZ);
                        }

                        public final int hashCode() {
                            return (this.LIZ * 31) + this.LIZIZ.hashCode();
                        }

                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("RecordingError(code=");
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(", e=");
                            sbLIZ.append(this.LIZIZ);
                            sbLIZ.append(')');
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }

                        {
                            this.LIZ = i;
                            this.LIZIZ = exc;
                        }
                    };
                }
                C18SI c18si5 = this.LIZ;
                c18si5.LLJZ = false;
                c18si5.LLJJIJIIJIL.postValue(abstractC557460Ltg);
                this.LIZ.k5().LJJIJIIJIL();
                this.LIZ.vt0();
            }
        };
        this.LLLF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 792));
    }
}
