package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS75S0200000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS192S0000000_6;
import kotlin.jvm.internal.AFwS236S0000000_6;
import kotlin.jvm.internal.AwS21S0010000_6;
import kotlin.jvm.internal.AwS4S0000001_6;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS585S0100000_6;

/* JADX INFO: renamed from: X.0Hxy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458200Hxy implements C0HV6 {
    public final InterfaceC497601wk LIZ;
    public final InterfaceC458260Hy4 LIZIZ;
    public final String LIZJ;
    public final EnumC458500HyS LIZLLL;
    public final C01GW LJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(587));
    public final C01GW LJFF = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(586));
    public final C01GW LJI = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(588));
    public final InterfaceC458280Hy6 LJII;
    public final C2252321DDq LJIIIIZZ;
    public final C2252321DDq LJIIIZ;
    public final C2252321DDq LJIIJ;
    public final C2252321DDq LJIIJJI;
    public final C2252321DDq LJIIL;
    public final C2252321DDq LJIILIIL;
    public final C2252321DDq LJIILJJIL;
    public EnumC458230Hy1 LJIILL;
    public final C2252321DDq LJIILLIIL;
    public final C2252321DDq LJIIZILJ;
    public final C2252321DDq LJIJ;
    public final C01GW LJIJI;
    public final InterfaceC332260D0u LJIJJ;
    public final C01GW LJIJJLI;
    public final InterfaceC332260D0u LJIL;
    public final C2252331DDr LJJ;
    public final C2252331DDr LJJI;
    public final C2252331DDr LJJIFFI;
    public final C2252331DDr LJJII;
    public AnonymousClass0956 LJJIII;
    public Animator LJJIIJ;
    public C458370HyF LJJIIJZLJL;
    public final BPEAHandler LJJIIZ;
    public final BPEAHandler LJJIIZI;
    public boolean LJJIJ;
    public Animator LJJIJIIJI;
    public List<Float> LJJIJIIJIL;
    public long LJJIJIL;

    @Override // X.C0HV6
    public final void LIZJ() {
        this.LJIILL = EnumC458230Hy1.LLILLL;
    }

    @Override // X.C0HV6
    public final void LJIIIIZZ() {
        this.LJIILL = EnumC458230Hy1.LLILZ;
        LJJIJIIJIL(AFwS236S0000000_6.get$arr$(548));
        LJJIJIIJI(AFwS236S0000000_6.get$arr$(549));
        LJ(EnumC430090Gtj.LOCKED);
        LJJIJ(AFwS236S0000000_6.get$arr$(550));
        this.LJIIIIZZ.setValue(Boolean.TRUE);
        this.LIZIZ.LIZJ();
    }

    @Override // X.C0HV6
    public final void LJIJJLI() {
        this.LJIILL = EnumC458230Hy1.LLILLJJLI;
        LJJIJIIJIL(AFwS236S0000000_6.get$arr$(551));
        LJJIJIIJI(AFwS236S0000000_6.get$arr$(552));
        LJ(EnumC430090Gtj.PRESSED);
        LJJIJ(AFwS236S0000000_6.get$arr$(553));
        this.LJIIIIZZ.setValue(Boolean.TRUE);
        this.LIZIZ.LIZ();
    }

    public final InterfaceC458390HyH LJJIFFI() {
        return (InterfaceC458390HyH) this.LJI.getValue();
    }

    public final InterfaceC458410HyJ LJJIIJ() {
        return (InterfaceC458410HyJ) this.LJFF.getValue();
    }

    public final InterfaceC458220Hy0 LJJIIJZLJL() {
        return (InterfaceC458220Hy0) this.LJ.getValue();
    }

    public final void LJJIIZ() {
        if (this.LJJIJ) {
            List<Float> list = this.LJJIJIIJIL;
            Float f = (Float) C13LP.LJJLIIIJL(LJJIIJZLJL().LJFF());
            this.LJJIJIIJIL = C13LP.LJLILLLLZI(Float.valueOf(f != null ? f.floatValue() : 0.0f), list);
            LJJIJIIJI(new AwS585S0100000_6(this, 413));
            C786410Ut5.LJLIIL(50L, this.LJJIIZ, new ARunnableS106S0100000_6(this, 307));
        }
    }

    public final void LJJIJIL() {
        Animator animator = this.LJJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(this, 169));
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.start();
        this.LJJIIJ = valueAnimatorOfInt;
    }

    public static long LJJII() {
        return (C2510109sZ.LIZ() * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) + ((long) 200);
    }

    @Override // X.C0HV6
    public final boolean LIZ() {
        return LJJIIJZLJL().LIZ();
    }

    @Override // X.C0HV6
    public final boolean LJIJ() {
        return LJIILL().LIZ() && (LJIILL() instanceof C458320HyA);
    }

    @Override // X.C0HV6
    public final C2252321DDq LJFF() {
        return this.LJIIIZ;
    }

    @Override // X.C0HV6
    public final C2252331DDr LJI() {
        return this.LJJI;
    }

    @Override // X.C0HV6
    public final InterfaceC332260D0u LJIIIZ() {
        return this.LJIJJ;
    }

    @Override // X.C0HV6
    public final InterfaceC332260D0u LJIILJJIL() {
        return this.LJIL;
    }

    @Override // X.C0HV6
    public final InterfaceC458280Hy6 LJIILL() {
        return this.LJII;
    }

    @Override // X.C0HV6
    public final C2252321DDq LJIILLIIL() {
        return this.LJIILIIL;
    }

    @Override // X.C0HV6
    public final C2252331DDr LJIJI() {
        return this.LJJII;
    }

    @Override // X.C0HV6
    public final C2252321DDq LJJ() {
        return this.LJIJ;
    }

    public static EnumC430090Gtj LJJIJLIJ(InterfaceC458280Hy6 interfaceC458280Hy6) {
        if (interfaceC458280Hy6 instanceof C458290Hy7) {
            return EnumC430090Gtj.DISABLED;
        }
        if (interfaceC458280Hy6 instanceof C458310Hy9) {
            return EnumC430090Gtj.HIDDEN;
        }
        if (interfaceC458280Hy6 instanceof C458320HyA) {
            return EnumC430090Gtj.NORMAL;
        }
        return EnumC430090Gtj.HIDDEN;
    }

    @Override // X.C0HV6
    public final void LIZIZ(Context context) {
        if (!LJJIIJ().LJIIIIZZ()) {
            LJIIL(context);
            return;
        }
        if (!LJJI(context)) {
            return;
        }
        LJJIIJ().LJ("record_panel");
        C458640Hyg.LIZIZ("resume", this.LIZJ);
        LJJIJIIJI(AFwS236S0000000_6.get$arr$(547));
        LJJIFFI().LIZIZ(context);
        LJJIJIL();
    }

    @Override // X.C0HV6
    public final void LJ(EnumC430090Gtj enumC430090Gtj) {
        this.LJIIL.setValue(enumC430090Gtj);
    }

    @Override // X.C0HV6
    public final void LJII(Context context) {
        this.LJJIJ = true;
        this.LJJIJIL = SystemClock.uptimeMillis();
        this.LJJIJIIJIL = C13BV.INSTANCE;
        this.LJJIIZI.removeCallbacksAndMessages(null);
        C786410Ut5.LJLIIL(LJJII(), this.LJJIIZI, new ARunnableS75S0200000_6(this, context, 138));
        LJJIIJZLJL().LIZIZ((int) LJJII());
        LJJIIZ();
        Animator animator = this.LJJIJIIJI;
        if (animator != null) {
            animator.cancel();
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(1);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(this, 170));
        valueAnimatorOfInt.setRepeatMode(1);
        valueAnimatorOfInt.setRepeatCount(-1);
        valueAnimatorOfInt.setInterpolator(new LinearInterpolator());
        valueAnimatorOfInt.start();
        this.LJJIJIIJI = valueAnimatorOfInt;
        LJJIFFI().LIZIZ(context);
        AnonymousClass0956 anonymousClass0956 = this.LJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJIII = null;
        this.LJJIII = C23250099c.LIZLLL(this.LIZ, null, null, new C458210Hxz(this, null), 3);
    }

    @Override // X.C0HV6
    public final boolean LJIIJJI(View view) {
        String strInvoke;
        if (!C0OBG.LIZIZ(view) && C2274381E0m.LIZIZ.LIZIZ(view.getContext(), "dm_voice_message", true)) {
            InterfaceC458280Hy6 interfaceC458280Hy6 = this.LJII;
            if (interfaceC458280Hy6 instanceof C458290Hy7) {
                InterfaceC187200nm interfaceC187200nm = ((C458290Hy7) interfaceC458280Hy6).LIZ;
                if (interfaceC187200nm instanceof C187100nl) {
                    strInvoke = ((C187100nl) interfaceC187200nm).LIZ;
                } else if (interfaceC187200nm instanceof C187000nk) {
                    strInvoke = ((C187000nk) interfaceC187200nm).LIZ.invoke(view.getContext());
                } else {
                    throw new C1954807lC();
                }
                C1389890mGx c1389890mGx = new C1389890mGx(view);
                c1389890mGx.LJIIJ(strInvoke);
                c1389890mGx.LJIIJJI();
            } else {
                Set setLJLIIL = C13LQ.LJLIIL(new EnumC1355290lN9[]{EnumC1355290lN9.MICROPHONE, EnumC1355290lN9.AUDIO_FOCUS});
                BusinessCapabilityService.LIZ.getClass();
                if (C1355270lN7.LIZ(C1355280lN8.LIZ(), setLJLIIL)) {
                    C1389890mGx c1389890mGx2 = new C1389890mGx(view);
                    c1389890mGx2.LJIIIZ(2131832241);
                    c1389890mGx2.LJIIJJI();
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C0HV6
    public final void LJIIL(Context context) {
        C458370HyF c458370HyF;
        String str;
        if (LJJI(context) && (c458370HyF = this.LJJIIJZLJL) != null && (str = c458370HyF.LIZ) != null && str.length() != 0 && new C0VSJ(str).exists()) {
            C458640Hyg.LIZIZ("start", this.LIZJ);
            LJJIIJ().LJIIJ("record_panel", str, null, new C458270Hy5("voice_message_play_entry_finish", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("duration", String.valueOf(C2510109sZ.LIZ())), new Pair("chat_type", this.LIZJ))), new InterfaceC458340HyC() { // from class: X.0Hy2
                @Override // X.InterfaceC458340HyC
                public final void LJJLIIIJ() {
                    Animator animator = this.LIZ.LJJIIJ;
                    if (animator != null) {
                        animator.cancel();
                    }
                    this.LIZ.LJJIJIIJI(AFwS236S0000000_6.get$arr$(542));
                }
            });
            LJJIJIIJI(AFwS236S0000000_6.get$arr$(543));
            LJJIJIL();
            LJJIFFI().LIZIZ(context);
        }
    }

    @Override // X.C0HV6
    public final boolean LJIILIIL(View view) {
        if (((Number) C0AHW.LIZ.getValue()).intValue() != 1 || LJJIIJZLJL().isVESDKReady()) {
            return true;
        }
        C1389890mGx c1389890mGx = new C1389890mGx(view);
        c1389890mGx.LJIIJ(view.getContext().getString(2131835702));
        c1389890mGx.LJIIJJI();
        return false;
    }

    @Override // X.C0HV6
    public final void LJIIZILJ(Context context) {
        LJJIIJ().LIZIZ("record_panel");
        C458640Hyg.LIZIZ("pause", this.LIZJ);
        Animator animator = this.LJJIIJ;
        if (animator != null) {
            animator.cancel();
        }
        LJJIJIIJI(AFwS236S0000000_6.get$arr$(541));
        LJJIFFI().LIZ(context);
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LJ(EnumC1355300lNA.VOICE_MESSAGE, Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS));
        }
    }

    public final boolean LJJI(Context context) {
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        boolean z = true;
        if (businessCapabilityServiceLIZ == null) {
            return true;
        }
        EnumC1355300lNA enumC1355300lNA = EnumC1355300lNA.VOICE_MESSAGE;
        businessCapabilityServiceLIZ.LIZ(enumC1355300lNA);
        if (C1355270lN7.LIZIZ(businessCapabilityServiceLIZ.LJFF(enumC1355300lNA, Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS), new C1360910lWD(Collections.singleton(EnumC1355300lNA.VOICE_CALL), new InterfaceC1360930lWF() { // from class: X.0HyB
            @Override // X.InterfaceC1360930lWF
            public final void LIZ(EnumC1355300lNA enumC1355300lNA2, Set set) {
                C0ZX0 c0zx0 = (C0ZX0) this.LIZ.LJJIIJ().LIZLLL().getValue();
                if (c0zx0 instanceof C0ZX4) {
                    this.LIZ.LJJIIJ().LIZIZ(((C0ZX4) c0zx0).LIZ);
                }
            }
        })))) {
            Activity activityLIZ = C1388190mED.LIZ(context);
            z = false;
            if (activityLIZ == null) {
                return false;
            }
            C1389890mGx c1389890mGx = new C1389890mGx(activityLIZ);
            c1389890mGx.LJIIIZ(2131832241);
            c1389890mGx.LJIIJJI();
        }
        return z;
    }

    public final void LJJIIZI(Context context) {
        this.LJJIJ = false;
        C1481605r4.LIZIZ(new ARunnableS106S0100000_6(this, 309));
        LJJIFFI().LIZ(context);
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LJ(EnumC1355300lNA.VOICE_MESSAGE, Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS));
        }
        AnonymousClass0956 anonymousClass0956 = this.LJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJIII = null;
        C23250099c.LIZLLL(this.LIZ, null, null, new C456620HvQ(this, context, null), 3);
    }

    public final void LJJIJ(Function1<? super C432550Gxh, C432550Gxh> function1) {
        Object value;
        C2252321DDq c2252321DDq = this.LJIIZILJ;
        do {
            value = c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(value, function1.invoke(value)));
    }

    public final void LJJIJIIJI(Function1<? super C432800Gy6, C432800Gy6> function1) {
        Object value;
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) this.LJIJI.getValue();
        do {
            value = interfaceC332260D0u.getValue();
        } while (!interfaceC332260D0u.compareAndSet(value, function1.invoke(value)));
    }

    public final void LJJIJIIJIL(Function1<? super C458250Hy3, C458250Hy3> function1) {
        Object value;
        InterfaceC332260D0u interfaceC332260D0u = (InterfaceC332260D0u) this.LJIJJLI.getValue();
        do {
            value = interfaceC332260D0u.getValue();
        } while (!interfaceC332260D0u.compareAndSet(value, function1.invoke(value)));
    }

    public static InterfaceC456610HvP LJJIII(int i, boolean z) {
        int i2 = i + 1;
        if (z) {
            C0I0B.LJFF.LIZJ();
            return new C456590HvN(new C1258904wF(C894660Z7w.LIZ().getResources().getQuantityString(2131755273, i2, String.valueOf(i2))));
        }
        C0I0B.LJFF.LIZJ();
        return new C456600HvO(new C1258904wF(C894660Z7w.LIZ().getResources().getQuantityString(2131755273, i2, String.valueOf(i2))));
    }

    @Override // X.C0HV6
    public final void LIZLLL(InterfaceC497601wk interfaceC497601wk, C05YD<Boolean> c05yd) {
        if (((Number) C0AHW.LIZ.getValue()).intValue() == 1 && LJIJ()) {
            LJJIIJZLJL().LIZLLL();
        }
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C456560HvK(this, null), 3);
        C23250099c.LIZLLL(interfaceC497601wk, null, null, new C456550HvJ(c05yd, this, null), 3);
    }

    @Override // X.C0HV6
    public final void LJIIJ(Context context, boolean z) {
        long jUptimeMillis;
        LJJIIJ().LJIIIZ();
        LJJIFFI().LIZ(context);
        BusinessCapabilityService.LIZ.getClass();
        BusinessCapabilityService businessCapabilityServiceLIZ = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ != null) {
            businessCapabilityServiceLIZ.LJ(EnumC1355300lNA.VOICE_MESSAGE, Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS));
        }
        C458370HyF c458370HyF = this.LJJIIJZLJL;
        if (c458370HyF != null) {
            jUptimeMillis = c458370HyF.LIZIZ;
        } else {
            jUptimeMillis = SystemClock.uptimeMillis() - this.LJJIJIL;
        }
        LJJIIJ().LJIIIZ();
        this.LJJIJ = false;
        C1481605r4.LIZIZ(new ARunnableS106S0100000_6(this, 309));
        LJJIIJZLJL().reset();
        LJJIFFI().LIZ(context);
        BusinessCapabilityService businessCapabilityServiceLIZ2 = C1355280lN8.LIZ();
        if (businessCapabilityServiceLIZ2 != null) {
            businessCapabilityServiceLIZ2.LJ(EnumC1355300lNA.VOICE_MESSAGE, Collections.singleton(EnumC1355290lN9.AUDIO_FOCUS));
        }
        int iLIZIZ = C814420VxA.LIZIZ(jUptimeMillis / 1000.0f);
        if (z) {
            C458640Hyg.LJFF(this.LJIILL.LL, iLIZIZ, "cancel", this.LIZJ);
        }
        LJJIJIIJIL(AFwS236S0000000_6.get$arr$(544));
        LJJIJIIJI(AFwS236S0000000_6.get$arr$(545));
        LJ(LJJIJLIJ(this.LJII));
        LJJIJ(AFwS236S0000000_6.get$arr$(546));
        C2252321DDq c2252321DDq = this.LJIIJ;
        Boolean bool = Boolean.FALSE;
        c2252321DDq.setValue(bool);
        this.LJJIIJZLJL = null;
        this.LJIILLIIL.setValue(Integer.MAX_VALUE);
        this.LJIIIIZZ.setValue(bool);
        C1481605r4.LIZIZ(new ARunnableS106S0100000_6(this, 308));
        AnonymousClass0956 anonymousClass0956 = this.LJJIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LJJIII = null;
        this.LIZIZ.LIZLLL();
    }

    @Override // X.C0HV6
    public final void LJIJJ(View view, float f) {
        LJJIJIIJI(new AwS4S0000001_6(f, 5));
        boolean z = false;
        if (view.getLayoutDirection() != 1 ? f < C814420VxA.LIZIZ(C418440Gaw.LIZIZ(-100)) : f > C814420VxA.LIZIZ(C418440Gaw.LIZIZ(100))) {
            z = true;
        }
        LJJIJ(new AwS21S0010000_6(z, 26));
        if (z) {
            if (!((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
                this.LJJ.LIZJ(Unit.LIZ);
            }
        } else if (((Boolean) this.LJIIJJI.getValue()).booleanValue()) {
            this.LJJIFFI.LIZJ(Unit.LIZ);
        }
        this.LJIIJ.setValue(Boolean.valueOf(z));
        this.LJJIIJZLJL = null;
    }

    @Override // X.C0HV6
    public final void LJIL(Context context, C0HVB c0hvb) {
        C23250099c.LIZLLL(this.LIZ, null, null, new C456530HvH(this, context, c0hvb, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJIJL(android.content.Context r13, X.InterfaceC1364105Vn<? super X.C458370HyF> r14) {
        /*
            r12 = this;
            r7 = r13
            boolean r0 = r14 instanceof X.C458190Hxx
            if (r0 == 0) goto Lb2
            r11 = r14
            X.0Hxx r11 = (X.C458190Hxx) r11
            int r2 = r11.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb2
            int r2 = r2 - r1
            r11.LLILZIL = r2
        L13:
            java.lang.Object r5 = r11.LLILLL
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r11.LLILZIL
            r2 = 0
            r1 = 0
            r3 = 1
            if (r0 == 0) goto L7c
            if (r0 != r3) goto Lb9
            X.0Hxy r0 = r11.LLILLJJLI
            java.lang.Object r7 = r11.LL
            android.content.Context r7 = (android.content.Context) r7
            X.C155000ia.LIZIZ(r5)
        L2b:
            X.0HyF r5 = (X.C458370HyF) r5
            r0.LJJIIJZLJL = r5
            X.0HyF r1 = r12.LJJIIJZLJL
            if (r1 == 0) goto L53
            java.lang.String r0 = r1.LIZ
            int r0 = r0.length()
            if (r0 != 0) goto L53
            long r5 = r1.LIZIZ
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L53
            android.app.Activity r3 = X.C1388190mED.LIZ(r7)
            if (r3 == 0) goto L53
            X.01zW r1 = new X.01zW
            r0 = 180(0xb4, float:2.52E-43)
            r1.<init>(r3, r0)
            X.C1481605r4.LIZIZ(r1)
        L53:
            X.0HyH r0 = r12.LJJIFFI()
            r0.LIZ(r7)
            X.0lN8 r0 = com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService.LIZ
            r0.getClass()
            com.ss.android.ugc.aweme.im.business.capability.api.conflicts.BusinessCapabilityService r3 = X.C1355280lN8.LIZ()
            if (r3 == 0) goto L70
            X.0lNA r1 = X.EnumC1355300lNA.VOICE_MESSAGE
            X.0lN9 r0 = X.EnumC1355290lN9.AUDIO_FOCUS
            java.util.Set r0 = java.util.Collections.singleton(r0)
            r3.LJ(r1, r0)
        L70:
            X.0956 r0 = r12.LJJIII
            if (r0 == 0) goto L77
            r0.LIZIZ(r2)
        L77:
            r12.LJJIII = r2
            X.0HyF r0 = r12.LJJIIJZLJL
            return r0
        L7c:
            X.C155000ia.LIZIZ(r5)
            boolean r0 = r12.LJJIJ
            if (r0 == 0) goto L53
            r12.LJJIJ = r1
            Y.ARunnableS106S0100000_6 r1 = new Y.ARunnableS106S0100000_6
            r0 = 306(0x132, float:4.29E-43)
            r1.<init>(r12, r0)
            X.C1481605r4.LIZIZ(r1)
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = r12.LJJIIZI
            r0.removeCallbacksAndMessages(r2)
            X.0Hy0 r6 = r12.LJJIIJZLJL()
            long r8 = LJJII()
            r0 = 540(0x21c, float:7.57E-43)
            kotlin.jvm.internal.AFwS236S0000000_6 r10 = kotlin.jvm.internal.AFwS236S0000000_6.get$arr$(r0)
            r11.LL = r7
            r11.LLILLJJLI = r12
            r11.LLILZIL = r3
            java.lang.Object r5 = r6.LJI(r7, r8, r10, r11)
            if (r5 != r4) goto Laf
            return r4
        Laf:
            r0 = r12
            goto L2b
        Lb2:
            X.0Hxx r11 = new X.0Hxx
            r11.<init>(r12, r14)
            goto L13
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C458200Hxy.LJJIJL(android.content.Context, X.05Vn):java.lang.Object");
    }

    public final void LJJIL(Context context, C458370HyF c458370HyF, C0HVB c0hvb) {
        if (c458370HyF.LIZIZ < 1100) {
            LJIIJ(context, false);
            return;
        }
        if (c458370HyF.LIZ.length() != 0 && new C0VSJ(c458370HyF.LIZ).exists() && c458370HyF.LIZIZ >= 1000 && (!c458370HyF.LIZJ.isEmpty()) && c458370HyF.LIZLLL > 0.0f) {
            LJIIJ(context, false);
            C458640Hyg.LJFF(this.LJIILL.LL, C814420VxA.LIZIZ(c458370HyF.LIZIZ / 1000.0f), "send", this.LIZJ);
            this.LIZIZ.LIZIZ(context, c458370HyF, c0hvb);
            return;
        }
        LJIIJ(context, false);
    }

    public C458200Hxy(InterfaceC497601wk interfaceC497601wk, InterfaceC458260Hy4 interfaceC458260Hy4, String str, String str2, EnumC458500HyS enumC458500HyS) {
        this.LIZ = interfaceC497601wk;
        this.LIZIZ = interfaceC458260Hy4;
        this.LIZJ = str2;
        this.LIZLLL = enumC458500HyS;
        InterfaceC458280Hy6 interfaceC458280Hy6LJFF = C458620Hye.LIZ.LJFF(str);
        this.LJII = interfaceC458280Hy6LJFF;
        Boolean bool = Boolean.FALSE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(bool);
        this.LJIIIIZZ = c2252321DDqLIZ;
        this.LJIIIZ = c2252321DDqLIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(bool);
        this.LJIIJ = c2252321DDqLIZ2;
        this.LJIIJJI = c2252321DDqLIZ2;
        C2252321DDq c2252321DDqLIZ3 = C1BNE.LIZ(LJJIJLIJ(interfaceC458280Hy6LJFF));
        this.LJIIL = c2252321DDqLIZ3;
        this.LJIILIIL = c2252321DDqLIZ3;
        this.LJIILJJIL = C1BNE.LIZ(bool);
        this.LJIILL = EnumC458230Hy1.LLILLJJLI;
        this.LJIILLIIL = C1BNE.LIZ(Integer.MAX_VALUE);
        C2252321DDq c2252321DDqLIZ4 = C1BNE.LIZ(new C432550Gxh(false, false));
        this.LJIIZILJ = c2252321DDqLIZ4;
        this.LJIJ = c2252321DDqLIZ4;
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1571));
        this.LJIJI = c01gwLIZIZ;
        this.LJIJJ = (InterfaceC332260D0u) c01gwLIZIZ.getValue();
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(new AwS550S0100000_6(this, 1572));
        this.LJIJJLI = c01gwLIZIZ2;
        this.LJIL = (InterfaceC332260D0u) c01gwLIZIZ2.getValue();
        C2252331DDr c2252331DDrLIZIZ = C09IR.LIZIZ(0, 1, null, 5);
        this.LJJ = c2252331DDrLIZIZ;
        this.LJJI = c2252331DDrLIZIZ;
        C2252331DDr c2252331DDrLIZIZ2 = C09IR.LIZIZ(0, 1, null, 5);
        this.LJJIFFI = c2252331DDrLIZIZ2;
        this.LJJII = c2252331DDrLIZIZ2;
        this.LJJIIZ = new BPEAHandler(Looper.getMainLooper());
        this.LJJIIZI = new BPEAHandler(Looper.getMainLooper());
        this.LJJIJIIJIL = C13BV.INSTANCE;
        this.LJJIJIL = SystemClock.uptimeMillis();
    }
}
