package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;

/* JADX INFO: renamed from: X.0IE7, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0IE7 extends C1320700kTM {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$1(C0IE7 c0ie7, String str) {
    }

    public static final void LIZIZ$2(C0IE7 c0ie7, String str) {
    }

    public static final void LIZIZ$3(C0IE7 c0ie7, String str) {
    }

    public static final void LIZLLL$1(C0IE7 c0ie7, String str, Throwable th) {
    }

    public static final void LIZLLL$3(C0IE7 c0ie7, String str, Throwable th) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
        switch (this.$t) {
            case 0:
                LIZIZ$0(this, str);
                break;
            case 1:
                LIZIZ$1(this, str);
                break;
            case 2:
            case 4:
            default:
                super.LIZIZ(str);
                break;
            case 3:
                LIZIZ$2(this, str);
                break;
            case 5:
                LIZIZ$3(this, str);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZJ(Object obj, String str) {
        switch (this.$t) {
            case 0:
                LIZJ$0(this, obj, str);
                break;
            case 1:
                LIZJ$1(this, obj, str);
                break;
            case 2:
            case 4:
            default:
                super.LIZJ(obj, str);
                break;
            case 3:
                LIZJ$2(this, obj, str);
                break;
            case 5:
                LIZJ$3(this, obj, str);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZLLL(String str, Throwable th) {
        switch (this.$t) {
            case 0:
                LIZLLL$0(this, str, th);
                break;
            case 1:
                LIZLLL$1(this, str, th);
                break;
            case 2:
                LIZLLL$2(this, str, th);
                break;
            case 3:
                LIZLLL$3(this, str, th);
                break;
            case 4:
            case 6:
            default:
                super.LIZLLL(str, th);
                break;
            case 5:
                LIZLLL$4(this, str, th);
                break;
            case 7:
                LIZLLL$5(this, str, th);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJ(String str, Object obj, Animatable animatable) {
        switch (this.$t) {
            case 0:
                LJ$0(this, str, obj, animatable);
                break;
            case 1:
                LJ$1(this, str, obj, animatable);
                break;
            case 2:
                LJ$2(this, str, obj, animatable);
                break;
            case 3:
                LJ$3(this, str, obj, animatable);
                break;
            case 4:
                LJ$4(this, str, obj, animatable);
                break;
            case 5:
                LJ$5(this, str, obj, animatable);
                break;
            case 6:
                LJ$6(this, str, obj, animatable);
                break;
            case 7:
                LJ$7(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        if (5 - this.$t != 0) {
            super.LJFF(obj, str);
        } else {
            LJFF$0(this, obj, str);
        }
    }

    public C0IE7(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$0(C0IE7 c0ie7, String str) {
        ((C424700Gl2) c0ie7.l0).LLILZIL = false;
    }

    public static final void LIZJ$0(C0IE7 c0ie7, Object obj, String str) {
        ((C424700Gl2) c0ie7.l0).LLILZIL = false;
    }

    public static final void LIZLLL$0(C0IE7 c0ie7, String str, Throwable th) {
        ((C424700Gl2) c0ie7.l0).LLILZIL = false;
    }

    public static final void LIZLLL$2(C0IE7 c0ie7, String str, Throwable th) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Load failed: ");
        sbLIZ.append((Uri) c0ie7.l0);
        sbLIZ.append('\n');
        sbLIZ.append(th);
        C1454250nwl.LIZ("FloatImage", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LIZLLL$4(C0IE7 c0ie7, String str, Throwable th) {
        C0I9I c0i9i = ((C0I97) c0ie7.l0).LJ;
        if (c0i9i != null) {
            c0i9i.LIZIZ(str, th);
        }
        ((C0I97) c0ie7.l0).LIZ();
    }

    public static final void LIZLLL$5(C0IE7 c0ie7, String str, Throwable th) {
        ((C1324720kZq) c0ie7.l0).setTag(Boolean.FALSE);
    }

    public static final void LJFF$0(C0IE7 c0ie7, Object obj, String str) {
        C0I9I c0i9i = ((C0I97) c0ie7.l0).LJ;
        if (c0i9i != null) {
            c0i9i.LIZJ(str);
        }
    }

    public static final /* bridge */ /* synthetic */ void LIZJ$1(C0IE7 c0ie7, Object obj, String str) {
    }

    public static final /* bridge */ /* synthetic */ void LIZJ$2(C0IE7 c0ie7, Object obj, String str) {
    }

    public static final /* bridge */ /* synthetic */ void LIZJ$3(C0IE7 c0ie7, Object obj, String str) {
    }

    public static final void LJ$0(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        Animatable animatableLIZ;
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        String url = ((C424700Gl2) c0ie7.l0).getUrl();
        if (!TextUtils.isEmpty(url)) {
            C1329340khI c1329340khI = C0QD7.LIZ;
            if (c1329340khI.LIZJ(url) == null && (interfaceC1330440kj4 instanceof C1329380khM)) {
                c1329340khI.LIZ(url, (C1329380khM) interfaceC1330440kj4);
            }
        }
        if (animatable != null) {
            C424700Gl2 c424700Gl2 = (C424700Gl2) c0ie7.l0;
            c424700Gl2.LLILZIL = true;
            if (c424700Gl2.LLILZ && c424700Gl2.getController() != null && c424700Gl2.LLILZ && c424700Gl2.LLILZIL && c424700Gl2.LLILZLL && (animatableLIZ = c424700Gl2.getController().LIZ()) != null && !animatableLIZ.isRunning()) {
                animatableLIZ.start();
                return;
            }
            return;
        }
        ((C424700Gl2) c0ie7.l0).LLILZIL = false;
    }

    public static final void LJ$1(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        ((C424620Gku) c0ie7.l0).LLJILJILJ = true;
    }

    public static final void LJ$2(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        Integer numValueOf;
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Load success: ");
        Integer numValueOf2 = null;
        if (interfaceC1330440kj4 != null) {
            numValueOf = Integer.valueOf(interfaceC1330440kj4.getWidth());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append('x');
        if (interfaceC1330440kj4 != null) {
            numValueOf2 = Integer.valueOf(interfaceC1330440kj4.getHeight());
        }
        sbLIZ.append(numValueOf2);
        C1454250nwl.LIZ("FloatImage", C2188811AlT.LIZIZ(sbLIZ));
    }

    public static final void LJ$3(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        ((C424630Gkv) c0ie7.l0).LLILZLL = true;
    }

    public static final void LJ$4(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        C1910890zpH c1910890zpH = (C1910890zpH) ((C0H6T) c0ie7.l0).LJFF.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[ImageDisplayStrategy] onFinalImageSet ");
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(obj);
        sbLIZ.append(", ");
        sbLIZ.append(animatable);
        c1910890zpH.LIZ("ImageDisplayStrategy", C2188811AlT.LIZIZ(sbLIZ));
        ((C0H6T) c0ie7.l0).LJIILIIL = animatable;
        if (animatable != null) {
            animatable.start();
        }
        C0H6T c0h6t = (C0H6T) c0ie7.l0;
        c0h6t.LJI = false;
        c0h6t.LJIIIZ();
    }

    public static final void LJ$5(final C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        if (animatable != null) {
            if ((animatable instanceof AnimatedDrawable2) && ((C0I97) c0ie7.l0).LJII != 0) {
                ((AnimatedDrawable2) animatable).LJII(new C0I9J() { // from class: X.0I9G
                    public int LIZ;

                    @Override // X.C0I9J, X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable2, int i) {
                        if (i == animatedDrawable2.LIZJ() - 1) {
                            int i2 = this.LIZ + 1;
                            this.LIZ = i2;
                            if (i2 >= ((C0I97) this.LIZIZ.l0).LJII) {
                                animatedDrawable2.stop();
                            }
                        }
                    }
                });
            }
            C0I9I c0i9i = ((C0I97) c0ie7.l0).LJ;
            if (c0i9i != null) {
                c0i9i.LIZ(str, interfaceC1330440kj4, animatable);
                return;
            }
            return;
        }
        C0I9I c0i9i2 = ((C0I97) c0ie7.l0).LJ;
        if (c0i9i2 == null) {
            return;
        }
        c0i9i2.LIZ(str, interfaceC1330440kj4, animatable);
    }

    public static final void LJ$6(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        ((C0H6X) c0ie7.l0).invalidate();
    }

    public static final void LJ$7(C0IE7 c0ie7, String str, Object obj, Animatable animatable) {
        ((C1324720kZq) c0ie7.l0).setTag(Boolean.FALSE);
    }
}
