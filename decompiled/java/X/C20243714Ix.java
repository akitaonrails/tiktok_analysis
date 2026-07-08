package X;

import android.animation.Animator;
import android.graphics.Typeface;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;

/* JADX INFO: renamed from: X.14Ix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20243714Ix extends C09AY implements Function2<Boolean, String, Unit> {
    public final /* synthetic */ C1295960jpS LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Animator.AnimatorListener LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20243714Ix(C1295960jpS c1295960jpS, boolean z, Animator.AnimatorListener animatorListener, boolean z2) {
        super(2);
        this.LL = c1295960jpS;
        this.LLILLJJLI = z;
        this.LLILLL = animatorListener;
        this.LLILZ = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Boolean bool, String str) {
        int i;
        final int i2;
        String str2 = str;
        if (bool.booleanValue() && C123100dR.LIZ(str2)) {
            C1295960jpS c1295960jpS = this.LL;
            if (this.LLILLJJLI) {
                i = -1;
            } else {
                i = 0;
            }
            c1295960jpS.setRepeatCount(i);
            Animator.AnimatorListener animatorListener = this.LLILLL;
            if (animatorListener != null) {
                this.LL.addAnimatorListener(animatorListener);
            }
            if (C20242814Io.LIZ().type == 3) {
                C20243314It.LIZ.getClass();
                if (!C20243314It.LIZ()) {
                    if (!this.LLILZ) {
                        final C1295960jpS c1295960jpS2 = this.LL;
                        c1295960jpS2.setTextDelegate(new C1295710jp3(c1295960jpS2) { // from class: X.14Iy
                            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                            /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                            @Override // X.C1295710jp3
                            public final String LIZIZ(String str3, String str4) {
                                if (str4 != null) {
                                    switch (str4.hashCode()) {
                                        case 450514512:
                                            if (str4.equals("replaceText1") && (str4 = C20242814Io.LIZ().replaceText1) == null) {
                                                return "";
                                            }
                                            break;
                                        case 450514513:
                                            if (str4.equals("replaceText2") && (str4 = C20242814Io.LIZ().replaceText2) == null) {
                                                return "";
                                            }
                                            break;
                                        case 450514514:
                                            if (str4.equals("replaceText3") && (str4 = C20242814Io.LIZ().replaceText3) == null) {
                                                return "";
                                            }
                                            break;
                                        case 450514515:
                                            if (str4.equals("replaceText4") && (str4 = C20242814Io.LIZ().replaceText4) == null) {
                                                return "";
                                            }
                                            break;
                                        case 450514516:
                                            if (str4.equals("replaceText5") && (str4 = C20242814Io.LIZ().replaceText5) == null) {
                                                return "";
                                            }
                                            break;
                                    }
                                }
                                return str4;
                            }
                        });
                    }
                    C1295960jpS c1295960jpS3 = this.LL;
                    if (this.LLILZ) {
                        i2 = 600;
                    } else {
                        i2 = 400;
                    }
                    c1295960jpS3.setFontAssetDelegate(new C1295870jpJ(i2) { // from class: X.0jxA
                        public final int LIZ;

                        {
                            this.LIZ = i2;
                        }

                        @Override // X.C1295870jpJ
                        public final Typeface LIZ(String str3, String str4, String str5) {
                            Typeface typefaceLIZIZ = C1697580uHE.LIZIZ(0.0f, this.LIZ, 0.0f, 0.0f, null, 0.0f, 0, null, 253);
                            if (typefaceLIZIZ == null) {
                                return null;
                            }
                            return typefaceLIZIZ;
                        }
                    });
                }
            }
            C1295960jpS c1295960jpS4 = this.LL;
            C1857690yRT.LJIILIIL(c1295960jpS4, str2, new AwS574S0100000_30(c1295960jpS4, 11));
        }
        return Unit.LIZ;
    }
}
