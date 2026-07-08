package X;

import android.content.Context;
import android.graphics.drawable.Animatable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestVoiceWaveAnimationConfigSetting;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import webcast.im.SoundWareEffectExtra;

/* JADX INFO: renamed from: X.0abZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C941390abZ extends FrameLayout {
    public final C1324720kZq LL;
    public final C1324720kZq LLILLJJLI;
    public String LLILLL;
    public String LLILZ;
    public boolean LLILZIL;

    public final void LIZ(SoundWareEffectExtra soundWareEffectExtra) {
        C1324720kZq c1324720kZq;
        InterfaceC1320850kTb controller;
        Animatable animatableLIZ;
        final String str = soundWareEffectExtra.staticImageName;
        InterfaceC1320850kTb controller2 = null;
        if (str != null && !Intrinsics.LJFF(str, this.LLILLL)) {
            this.LLILLL = str;
            if (a0.LJJJIL(str)) {
                C1324720kZq c1324720kZq2 = this.LL;
                if (c1324720kZq2 != null && (controller = c1324720kZq2.getController()) != null && (animatableLIZ = controller.LIZ()) != null) {
                    animatableLIZ.stop();
                }
                C1324720kZq c1324720kZq3 = this.LL;
                if (c1324720kZq3 != null) {
                    c1324720kZq3.setController(null);
                }
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadStaticImage: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("VoiceWaveImageView", C2188811AlT.LIZIZ(sbLIZ));
            C1324720kZq c1324720kZq4 = this.LL;
            if (c1324720kZq4 != null) {
                c1324720kZq4.setController(null);
            }
            C1324720kZq c1324720kZq5 = this.LL;
            if (c1324720kZq5 != null) {
                c1324720kZq5.setImageResource(0);
            }
            final String strLIZ = C053100Hh.LIZ(str);
            if ((!a0.LJJJIL(strLIZ)) && strLIZ != null) {
                C1324610kZf url = C1819620xS4.LIZ().setUrl(strLIZ);
                url.LJIILIIL = Boolean.TRUE;
                url.LJJ = Boolean.FALSE;
                url.LJIIL = new InterfaceC1142670fqD() { // from class: X.0aba
                    @Override // X.InterfaceC1142670fqD
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZIZ(Animatable animatable) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZJ(int i, int i2, String str2) {
                    }

                    @Override // X.InterfaceC1142670fqD
                    public final void LIZLLL(String str2, Exception exc) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("loadStaticImage , imageName = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", exception: ");
                        sbLIZ2.append(exc);
                        C20441214yg.LJ("VoiceWaveImageView", C2188811AlT.LIZIZ(sbLIZ2));
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("loadDynamicImage onFailure, imageName = ");
                        sbLIZ3.append(str);
                        sbLIZ3.append(", url =");
                        sbLIZ3.append(strLIZ);
                        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ3), exc);
                    }
                };
                url.LJIL = true;
                url.LJJI(this.LL);
            }
        }
        final String str2 = soundWareEffectExtra.dynamicImageName;
        if ((!a0.LJJJIL(str2)) && str2 != null && !Intrinsics.LJFF(str2, this.LLILZ)) {
            this.LLILZ = str2;
            if (Intrinsics.LJFF(str2, str2) && (c1324720kZq = this.LLILLJJLI) != null) {
                c1324720kZq.getController();
            }
            this.LLILZ = str2;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("loadDynamicImage: ");
            sbLIZ2.append(str2);
            sbLIZ2.append(", isPlay=");
            sbLIZ2.append(false);
            C20441214yg.LIZIZ("VoiceWaveImageView", C2188811AlT.LIZIZ(sbLIZ2));
            final String strLIZ2 = C053100Hh.LIZ(str2);
            if ((true ^ a0.LJJJIL(strLIZ2)) && strLIZ2 != null) {
                C1320810kTX c1320810kTXLIZJ = C1322200kVm.LIZJ();
                c1320810kTXLIZJ.LJII(strLIZ2);
                C1324720kZq c1324720kZq6 = this.LLILLJJLI;
                if (c1324720kZq6 != null) {
                    controller2 = c1324720kZq6.getController();
                }
                c1320810kTXLIZJ.LJIILJJIL = controller2;
                c1320810kTXLIZJ.LJIIJJI = false;
                c1320810kTXLIZJ.LJIIIIZZ = new C1320700kTM<InterfaceC1330440kj4>() { // from class: X.0ajZ
                    public final /* synthetic */ boolean LIZLLL = false;

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LIZLLL(String str3, Throwable th) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("loadDynamicImage , imageName = ");
                        sbLIZ3.append(str2);
                        sbLIZ3.append(", onFailure: ");
                        sbLIZ3.append(th);
                        C20441214yg.LJ("VoiceWaveImageView", C2188811AlT.LIZIZ(sbLIZ3));
                        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                        sbLIZ4.append("loadDynamicImage onFailure, imageName = ");
                        sbLIZ4.append(str2);
                        sbLIZ4.append(", url =");
                        sbLIZ4.append(strLIZ2);
                        C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ4), th);
                    }

                    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
                    public final void LJ(String str3, Object obj, Animatable animatable) {
                        if (animatable instanceof AnimatedDrawable2) {
                            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                            final InterfaceC1330960kju interfaceC1330960kju = animatedDrawable2.LLILLL;
                            final int i = MultiGuestVoiceWaveAnimationConfigSetting.INSTANCE.getValue().loopCount;
                            animatedDrawable2.LJI(new C1330930kjr<InterfaceC1330960kju>(interfaceC1330960kju, i) { // from class: X.0aja
                                public final int LIZJ;
                                public final int LIZLLL;

                                @Override // X.C1330930kjr, X.InterfaceC1330470kj7
                                public final int getLoopCount() {
                                    return this.LIZLLL;
                                }

                                @Override // X.C1330930kjr, X.InterfaceC1330470kj7
                                public final int LJ(int i2) {
                                    return this.LIZJ;
                                }

                                {
                                    MultiGuestVoiceWaveAnimationConfigSetting multiGuestVoiceWaveAnimationConfigSetting = MultiGuestVoiceWaveAnimationConfigSetting.INSTANCE;
                                    this.LIZJ = multiGuestVoiceWaveAnimationConfigSetting.getValue().frameDurationMs;
                                    this.LIZLLL = multiGuestVoiceWaveAnimationConfigSetting.getValue().loopCount;
                                    this.LIZLLL = i;
                                }
                            });
                            if (this.LIZLLL && !animatedDrawable2.isRunning()) {
                                animatedDrawable2.start();
                                this.LLILZIL = false;
                            }
                            final C941390abZ c941390abZ = this;
                            animatedDrawable2.LJII(new C0I9J() { // from class: X.0abY
                                @Override // X.C0I9J, X.InterfaceC1331000kjy
                                public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i2) {
                                    InterfaceC1320850kTb controller3;
                                    AnimatedDrawable2 animatedDrawable23;
                                    if (animatedDrawable22 == null) {
                                        return;
                                    }
                                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                    sbLIZ3.append("animation frame ");
                                    sbLIZ3.append(i2);
                                    sbLIZ3.append(", frame count ");
                                    sbLIZ3.append(animatedDrawable22.LIZJ());
                                    C20441214yg.LIZIZ("voiceWave_animation", C2188811AlT.LIZIZ(sbLIZ3));
                                    if (i2 == animatedDrawable22.LIZJ() - 1 && c941390abZ.LLILZIL) {
                                        C20441214yg.LIZIZ("VoiceWaveImageView", "stop animation");
                                        C941390abZ c941390abZ2 = c941390abZ;
                                        C1324720kZq c1324720kZq7 = c941390abZ2.LLILLJJLI;
                                        if (c1324720kZq7 != null && (controller3 = c1324720kZq7.getController()) != null) {
                                            Animatable animatableLIZ2 = controller3.LIZ();
                                            if ((animatableLIZ2 instanceof AnimatedDrawable2) && (animatedDrawable23 = (AnimatedDrawable2) animatableLIZ2) != null) {
                                                animatedDrawable23.stop();
                                            }
                                        }
                                        C1324720kZq c1324720kZq8 = c941390abZ2.LLILLJJLI;
                                        if (c1324720kZq8 != null) {
                                            C500260Jjc.LJIILLIIL(c1324720kZq8);
                                        }
                                    }
                                }
                            });
                        }
                    }
                };
                AbstractC1320710kTN abstractC1320710kTNLIZ = c1320810kTXLIZJ.LIZ();
                C1324720kZq c1324720kZq7 = this.LLILLJJLI;
                if (c1324720kZq7 != null) {
                    c1324720kZq7.setController(abstractC1320710kTNLIZ);
                }
                C1324720kZq c1324720kZq8 = this.LLILLJJLI;
                if (c1324720kZq8 != null) {
                    C500260Jjc.LJIILLIIL(c1324720kZq8);
                }
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("dynamicImageView has new controller for ");
                sbLIZ3.append(str2);
                sbLIZ3.append(", but not show");
                C20441214yg.LIZIZ("VoiceWaveImageView", C2188811AlT.LIZIZ(sbLIZ3));
            }
        }
    }

    public C941390abZ(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C1324720kZq c1324720kZq = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq, new FrameLayout.LayoutParams(-1, -1));
        c1324720kZq.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LL = c1324720kZq;
        C1324720kZq c1324720kZq2 = new C1324720kZq(context);
        C786410Ut5.u6(c1324720kZq2, new FrameLayout.LayoutParams(-1, -1));
        c1324720kZq2.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLILLJJLI = c1324720kZq2;
        addView(c1324720kZq);
        addView(c1324720kZq2);
    }
}
