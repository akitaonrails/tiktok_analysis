package X;

import Y.AfS151S0200000_15;
import android.graphics.drawable.Animatable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.SpeakingVoiceConfig;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS203S0000000_15;
import kotlin.jvm.internal.Intrinsics;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0abP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941290abP {
    public final C1324720kZq LIZ;
    public final boolean LIZIZ;
    public final C941390abZ LIZJ;
    public boolean LIZLLL;
    public C11JF LJ;
    public String LJFF;
    public final C01GW LJI;
    public final C11PQ<SoundWareEffectExtra> LJII;

    public final C941320abS LIZJ() {
        return (C941320abS) this.LJI.getValue();
    }

    public final void LJI() {
        C11JF c11jf = this.LJ;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LJ = null;
    }

    public final void LIZ(final String str) {
        InterfaceC1320850kTb controller;
        if (Intrinsics.LJFF("", str)) {
            this.LIZLLL = true;
            return;
        }
        C500260Jjc.LLFFF(this.LIZ);
        C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
        C1324720kZq c1324720kZq = this.LIZ;
        if (c1324720kZq != null) {
            controller = c1324720kZq.getController();
        } else {
            controller = null;
        }
        c1320810kTXLIZJ.LJIILJJIL = controller;
        String strLIZ = "tiktok_live_interaction_demand_1";
        if (!Boolean.valueOf(this.LIZIZ).booleanValue()) {
            strLIZ = C0IPN.LIZ("tiktok_live_interaction_resource", "tiktok_live_interaction_demand_1");
        } else if (!TextUtils.equals(str, "ttlive_voice_chat_sound_wave_high.webp")) {
            if (TextUtils.equals(str, "ttlive_voice_chat_sound_wave_medium.webp")) {
                strLIZ = "tiktok_live_interaction_normal_3";
            } else {
                strLIZ = "tiktok_live_interaction_normal_1";
            }
        }
        c1320810kTXLIZJ.LJII(C1143780fs0.LJIIJ(strLIZ, str));
        c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0abc
            @Override // X.C1320700kTM, X.InterfaceC1320650kTH
            public final void LJ(String str2, Object obj, Animatable animatable) {
                if (animatable instanceof AnimatedDrawable2) {
                    final C941290abP c941290abP = this.LIZIZ;
                    final String str3 = str;
                    ((AnimatedDrawable2) animatable).LJII(new C0I9J() { // from class: X.0abb
                        @Override // X.C0I9J, X.InterfaceC1331000kjy
                        public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
                            if (animatedDrawable2 != null && i == animatedDrawable2.LIZJ() - 1) {
                                C941290abP c941290abP2 = c941290abP;
                                if (c941290abP2.LIZLLL) {
                                    C1324720kZq c1324720kZq2 = c941290abP2.LIZ;
                                    if (c1324720kZq2 != null) {
                                        c1324720kZq2.setController(null);
                                    }
                                    C500260Jjc.LJIILLIIL(c941290abP.LIZ);
                                }
                                if (!Intrinsics.LJFF(str3, c941290abP.LJFF)) {
                                    C941290abP c941290abP3 = c941290abP;
                                    c941290abP3.LIZ(c941290abP3.LJFF);
                                }
                            }
                        }
                    });
                }
            }
        };
        c1320810kTXLIZJ.LJIIJJI = true;
        AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
        C1324720kZq c1324720kZq2 = this.LIZ;
        if (c1324720kZq2 != null) {
            c1324720kZq2.setController(abstractC1320710kTNLIZ);
        }
    }

    public final String LIZIZ(int i) {
        SpeakingVoiceConfig value = LiveMicVoiceSetting.INSTANCE.getValue();
        if (i <= 20) {
            return "";
        }
        if (i <= value.getLow()) {
            if (Boolean.valueOf(this.LIZIZ).booleanValue()) {
                return "ttlive_voice_chat_sound_wave_low.webp";
            }
            return "ttlive_sound_wavee_anim_low.webp";
        }
        if (i > value.getLow() && i <= value.getHigh()) {
            if (Boolean.valueOf(this.LIZIZ).booleanValue()) {
                return "ttlive_voice_chat_sound_wave_medium.webp";
            }
            return "ttlive_sound_wavee_anim_medium.webp";
        }
        if (Boolean.valueOf(this.LIZIZ).booleanValue()) {
            return "ttlive_voice_chat_sound_wave_high.webp";
        }
        return "ttlive_sound_wavee_anim_high.webp";
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0149  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(int r9) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C941290abP.LIZLLL(int):boolean");
    }

    public final boolean LJ(int i) {
        boolean z;
        InterfaceC1320850kTb controller;
        Animatable animatableLIZ;
        InterfaceC1320850kTb controller2;
        Animatable animatableLIZ2;
        LIZ("");
        boolean z2 = true;
        if (i > 20) {
            z = true;
        } else {
            z = false;
        }
        C941390abZ c941390abZ = this.LIZJ;
        if (c941390abZ != null) {
            if (!z) {
                c941390abZ.LLILZIL = true;
            } else {
                C1324720kZq c1324720kZq = c941390abZ.LLILLJJLI;
                Boolean boolValueOf = null;
                if (c1324720kZq != null && (controller2 = c1324720kZq.getController()) != null && (animatableLIZ2 = controller2.LIZ()) != null) {
                    boolValueOf = Boolean.valueOf(animatableLIZ2.isRunning());
                }
                if (!C500260Jjc.LJJJI(boolValueOf)) {
                    C1324720kZq c1324720kZq2 = c941390abZ.LLILLJJLI;
                    if (c1324720kZq2 == null || c1324720kZq2.getController() == null) {
                        z2 = false;
                    }
                    if (z2) {
                        C20441214yg.LIZIZ("VoiceWaveImageView", " playDynamicImage");
                        C1324720kZq c1324720kZq3 = c941390abZ.LLILLJJLI;
                        if (c1324720kZq3 != null) {
                            C500260Jjc.LLFFF(c1324720kZq3);
                        }
                        C1324720kZq c1324720kZq4 = c941390abZ.LLILLJJLI;
                        if (c1324720kZq4 != null && (controller = c1324720kZq4.getController()) != null && (animatableLIZ = controller.LIZ()) != null) {
                            animatableLIZ.start();
                            return z;
                        }
                    } else {
                        C20441214yg.LIZIZ("VoiceWaveImageView", "playDynamicImage, but not controller");
                        return z;
                    }
                }
            }
        }
        return z;
    }

    public final boolean LJFF(int i, Function0<Unit> function0) {
        if (i <= 20) {
            if (this.LJ != null) {
                return false;
            }
            this.LJ = (C11JF) C19490011Na.LIZJ(1L, TimeUnit.SECONDS).LJIILIIL(new C0UO0()).LJJLL(new AfS151S0200000_15(function0, this, 49), new C09JN() { // from class: X.00LE
                @Override // X.C09JN
                public final /* bridge */ /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("VolumeWaveHandle@c210.setCountDownGoneBorder$2");
                    C1C7U.LIZIZ("VolumeWaveHandle@c210.setCountDownGoneBorder$2");
                }
            });
            return false;
        }
        C11JF c11jf = this.LJ;
        if (c11jf != null) {
            c11jf.dispose();
            this.LJ = null;
            return true;
        }
        return true;
    }

    public /* synthetic */ C941290abP(C1324720kZq c1324720kZq, boolean z, int i) {
        this(c1324720kZq, (i & 2) != 0 ? false : z, null, null);
    }

    public C941290abP(C1324720kZq c1324720kZq, boolean z, C941390abZ c941390abZ, String str) {
        C11PQ<SoundWareEffectExtra> c11pq;
        C080500Rv c080500RvLIZ;
        this.LIZ = c1324720kZq;
        this.LIZIZ = z;
        this.LIZJ = c941390abZ;
        this.LJFF = "ttlive_sound_wavee_anim_low.webp";
        this.LJI = C452501pT.LIZIZ(AFwS203S0000000_15.get$arr$(337));
        if (str != null) {
            InterfaceC927740aFY interfaceC927740aFYLIZIZ = C00S0.LIZIZ();
            if (interfaceC927740aFYLIZIZ != null && (c080500RvLIZ = interfaceC927740aFYLIZIZ.LIZ(str)) != null) {
                c11pq = c080500RvLIZ.LIZ;
            } else {
                c11pq = null;
            }
            this.LJII = c11pq;
        }
    }
}
