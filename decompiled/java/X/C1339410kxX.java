package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS53S0300000_20;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.facebook.fresco.animation.drawable.AnimatedDrawable2;
import com.lynx.base.log.LynxLog;
import com.lynx.tasm.LynxError;
import com.lynx.tasm.ui.image.FrescoInlineImageShadowNode;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0kxX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1339410kxX extends C1320700kTM {
    public final int $t;
    public Object l0;

    public static final void LIZIZ$0(C1339410kxX c1339410kxX, String str) {
    }

    public static final void LIZLLL$3(C1339410kxX c1339410kxX, String str, Throwable th) {
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZ(String str, Throwable th) {
        if (7 - this.$t != 0) {
            super.LIZ(str, th);
        } else {
            LIZ$0(this, str, th);
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LIZIZ(String str) {
        switch (this.$t) {
            case 3:
                LIZIZ$0(this, str);
                break;
            case 4:
                LIZIZ$1(this, str);
                break;
            case 5:
            case 6:
            default:
                super.LIZIZ(str);
                break;
            case 7:
                LIZIZ$2(this, str);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final /* bridge */ /* synthetic */ void LIZJ(Object obj, String str) {
        switch (this.$t) {
            case 3:
                LIZJ$0(this, obj, str);
                break;
            case 4:
                LIZJ$1(this, obj, str);
                break;
            case 5:
            case 6:
            default:
                super.LIZJ(obj, str);
                break;
            case 7:
                LIZJ$2(this, obj, str);
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
                LIZLLL$4(this, str, th);
                break;
            case 5:
            default:
                super.LIZLLL(str, th);
                break;
            case 6:
                LIZLLL$5(this, str, th);
                break;
            case 7:
                LIZLLL$6(this, str, th);
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
            case 8:
                LJ$8(this, str, obj, animatable);
                break;
            default:
                super.LJ(str, obj, animatable);
                break;
        }
    }

    @Override // X.C1320700kTM, X.InterfaceC1320650kTH
    public final void LJFF(Object obj, String str) {
        if (7 - this.$t != 0) {
            super.LJFF(obj, str);
        } else {
            LJFF$0(this, obj, str);
        }
    }

    @Override // X.C1320700kTM
    public final void LJI(C1325710kbR c1325710kbR, long j) {
        if (7 - this.$t != 0) {
            super.LJI(c1325710kbR, j);
        } else {
            LJI$0(this, c1325710kbR, j);
        }
    }

    @Override // X.C1320700kTM
    public final void LJIIIIZZ(String str, Object obj, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
        if (7 - this.$t != 0) {
            super.LJIIIIZZ(str, obj, animatable, c1325710kbR, map);
        } else {
            LJIIIIZZ$0(this, str, obj, animatable, c1325710kbR, map);
        }
    }

    public C1339410kxX(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZIZ$1(C1339410kxX c1339410kxX, String str) {
        ((C1325000kaI) c1339410kxX.l0).LLILLL = false;
    }

    public static final void LIZIZ$2(C1339410kxX c1339410kxX, String str) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LIZIZ(str);
        }
    }

    public static final void LIZ$0(C1339410kxX c1339410kxX, String str, Throwable th) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LIZ(str, th);
        }
    }

    public static final void LIZJ$1(C1339410kxX c1339410kxX, Object obj, String str) {
        ((C1325000kaI) c1339410kxX.l0).LLILLL = false;
    }

    public static final void LIZJ$2(C1339410kxX c1339410kxX, Object obj, String str) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LIZJ(obj, str);
        }
    }

    public static final void LIZLLL$0(C1339410kxX c1339410kxX, String str, Throwable th) {
        String message;
        if (th == null) {
            message = "unknown";
        } else {
            message = th.getMessage();
        }
        ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJ(message);
        LynxError lynxError = new LynxError(C846560XIw.LIZIZ(C846560XIw.LIZ(th)), "Failed to load image", "", "error");
        lynxError.LJIIIIZZ(message);
        ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJIIJJI().LJJIFFI(((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJJIZL, "image", lynxError);
    }

    public static final void LIZLLL$1(C1339410kxX c1339410kxX, String str, Throwable th) {
        C1315750kLN c1315750kLN = (C1315750kLN) c1339410kxX.l0;
        c1315750kLN.LJJJLZIJ = false;
        c1315750kLN.LJIJ();
        ((C1315750kLN) c1339410kxX.l0).LJIIIZ(th);
    }

    public static final void LIZLLL$2(C1339410kxX c1339410kxX, String str, Throwable th) {
        ((C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2).LJIIIZ(th);
    }

    public static final void LIZLLL$4(C1339410kxX c1339410kxX, String str, Throwable th) {
        ((C1325000kaI) c1339410kxX.l0).LLILLL = false;
    }

    public static final void LIZLLL$5(C1339410kxX c1339410kxX, String str, Throwable th) {
        C1336260ksS c1336260ksS = ((C1336240ksQ) c1339410kxX.l0).LIZIZ;
        if (c1336260ksS != null) {
            c1336260ksS.LIZIZ();
        }
    }

    public static final void LIZLLL$6(C1339410kxX c1339410kxX, String str, Throwable th) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LIZLLL(str, th);
        }
    }

    public static final void LJFF$0(C1339410kxX c1339410kxX, Object obj, String str) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LJFF(obj, str);
        }
    }

    public static final void LJI$0(C1339410kxX c1339410kxX, C1325710kbR c1325710kbR, long j) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LJI(c1325710kbR, j);
        }
    }

    public static final /* bridge */ /* synthetic */ void LIZJ$0(C1339410kxX c1339410kxX, Object obj, String str) {
    }

    public static final void LJ$0(C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable) {
        if (obj instanceof C1325120kaU) {
            C1323050kX9<Bitmap> c1323050kX9CloneUnderlyingBitmapReference = ((C1325120kaU) obj).cloneUnderlyingBitmapReference();
            if (c1323050kX9CloneUnderlyingBitmapReference == null) {
                ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJ("reference null");
                ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJIIJJI().LJJIFFI(((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJJIZL, "image", new LynxError(30102, "Failed to load image，the reason is get null bitmap reference from response", "", "error"));
                return;
            }
            Bitmap bitmap = c1323050kX9CloneUnderlyingBitmapReference.get();
            if (bitmap == null) {
                ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJ("bitmap null");
                ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJIIJJI().LJJIFFI(((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJJIZL, "image", new LynxError(30102, "Failed to load image，the reason is get null bitmap from response", "", "error"));
                return;
            }
            FrescoInlineImageShadowNode frescoInlineImageShadowNode = (FrescoInlineImageShadowNode) c1339410kxX.l0;
            if (frescoInlineImageShadowNode.LJJJJZ) {
                frescoInlineImageShadowNode.LJJJJ();
                ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJJLL = c1323050kX9CloneUnderlyingBitmapReference;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("clone reference mRef = ");
                sbLIZ.append(((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJJLL.hashCode());
                LynxLog.i("FrescoInlineImageShadowNode", C2188811AlT.LIZIZ(sbLIZ));
            }
            ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJI(bitmap.getWidth(), bitmap.getHeight());
            return;
        }
        if (animatable instanceof AnimatedDrawable2) {
            AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
            int intrinsicWidth = animatedDrawable2.getIntrinsicWidth();
            int intrinsicHeight = animatedDrawable2.getIntrinsicHeight();
            animatedDrawable2.LJI(new C1316320kMI(animatedDrawable2.LLILLL, ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJJLI));
            ((FrescoInlineImageShadowNode) c1339410kxX.l0).LJJJI(intrinsicWidth, intrinsicHeight);
            C1315790kLR.LIZJ(animatedDrawable2);
        }
    }

    public static final void LJ$1(final C1339410kxX c1339410kxX, final String str, Object obj, Animatable animatable) {
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        ((C1315750kLN) c1339410kxX.l0).LJIJ();
        if (((C1315750kLN) c1339410kxX.l0).LJJIFFI) {
            C786410Ut5.LJJZZIII(C1315750kLN.LJJLIIIJILLIZJL, new Runnable() { // from class: X.0kLO
                public final void LIZ() {
                    C1315750kLN c1315750kLN = (C1315750kLN) this.LLILLJJLI.l0;
                    if (c1315750kLN.LJJIIJ) {
                        if (c1315750kLN.LJIILLIIL != null) {
                            boolean zContainsKey = c1315750kLN.LJJJ.containsKey(str);
                            C1315750kLN c1315750kLN2 = (C1315750kLN) this.LLILLJJLI.l0;
                            C1319980kSC<C1331070kk5> c1319980kSC = c1315750kLN2.LJJIL;
                            if (zContainsKey) {
                                c1319980kSC = (C1319980kSC) ((LinkedHashMap) c1315750kLN2.LJJJ).get(str);
                            }
                            if (c1319980kSC != null) {
                                c1319980kSC.LIZJ.getClass();
                                DH dh = c1319980kSC.LIZJ;
                                dh.getClass();
                                C1331070kk5 c1331070kk5 = (C1331070kk5) dh;
                                if (c1331070kk5.LJI.LL != c1331070kk5.LIZ) {
                                    InterfaceC1316210kM7 interfaceC1316210kM7 = ((C1315750kLN) this.LLILLJJLI.l0).LJIILLIIL;
                                    DH dh2 = c1319980kSC.LIZJ;
                                    interfaceC1316210kM7.onDrawableReady(dh2 == 0 ? null : dh2.LIZIZ());
                                }
                            }
                        }
                        Iterator it2 = ((LinkedHashMap) ((C1315750kLN) this.LLILLJJLI.l0).LJJJ).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (((String) entry.getKey()).equals(str)) {
                                break;
                            }
                            C1319980kSC c1319980kSC2 = (C1319980kSC) entry.getValue();
                            c1319980kSC2.LIZIZ = false;
                            if (c1319980kSC2.LIZ) {
                                c1319980kSC2.LIZ = false;
                                ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(c1319980kSC2, 73);
                                if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                                    aRunnableS120S0100000_20.run();
                                } else {
                                    C1301610jyZ.LIZLLL().execute(aRunnableS120S0100000_20);
                                }
                            }
                            it2.remove();
                        }
                    } else {
                        InterfaceC1316210kM7 interfaceC1316210kM72 = c1315750kLN.LJIILLIIL;
                        if (interfaceC1316210kM72 != null) {
                            DH dh3 = c1315750kLN.LJJIL.LIZJ;
                            interfaceC1316210kM72.onDrawableReady(dh3 == 0 ? null : dh3.LIZIZ());
                        }
                        C1319980kSC<C1331070kk5> c1319980kSC3 = ((C1315750kLN) this.LLILLJJLI.l0).LJJIZ;
                        if (c1319980kSC3 != null) {
                            c1319980kSC3.LIZIZ = false;
                            if (c1319980kSC3.LIZ) {
                                c1319980kSC3.LIZ = false;
                                ARunnableS120S0100000_20 aRunnableS120S0100000_202 = new ARunnableS120S0100000_20(c1319980kSC3, 73);
                                if (Looper.getMainLooper().getThread() != C786410Ut5.u3()) {
                                    aRunnableS120S0100000_202.run();
                                } else {
                                    C1301610jyZ.LIZLLL().execute(aRunnableS120S0100000_202);
                                }
                            }
                            ((C1315750kLN) this.LLILLJJLI.l0).LJJIZ = null;
                        }
                    }
                    C1323050kX9<?> c1323050kX9 = ((C1315750kLN) this.LLILLJJLI.l0).LJJJJZI;
                    if (c1323050kX9 != null) {
                        C1323050kX9.LJII(c1323050kX9);
                        ((C1315750kLN) this.LLILLJJLI.l0).LJJJJZI = null;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxImageManager@8c93.initAsyncRequestHolder$1$onFinalImageSet$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxImageManager@8c93.initAsyncRequestHolder$1$onFinalImageSet$1");
                }
            });
        }
        C1315750kLN c1315750kLN = (C1315750kLN) c1339410kxX.l0;
        c1315750kLN.LJJJJLL = animatable;
        c1315750kLN.LJJJLZIJ = false;
        if (interfaceC1330440kj4 instanceof C1325120kaU) {
            C1325120kaU c1325120kaU = (C1325120kaU) interfaceC1330440kj4;
            c1315750kLN.LJJJLL = c1325120kaU.getUnderlyingBitmap();
            if (!((C1315750kLN) c1339410kxX.l0).LJJIFFI) {
                C1315750kLN c1315750kLN2 = (C1315750kLN) c1339410kxX.l0;
                C1323050kX9<?> c1323050kX9 = c1315750kLN2.LJJJJZ;
                if (c1323050kX9 != null) {
                    C1323050kX9.LJII(c1323050kX9);
                    c1315750kLN2.LJJJJZ = null;
                }
            } else {
                C1315750kLN c1315750kLN3 = (C1315750kLN) c1339410kxX.l0;
                c1315750kLN3.LJJJJZI = c1315750kLN3.LJJJJZ;
            }
            ((C1315750kLN) c1339410kxX.l0).LJJJJZ = c1325120kaU.cloneUnderlyingBitmapReference();
        }
        C1315750kLN c1315750kLN4 = (C1315750kLN) c1339410kxX.l0;
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = c1315750kLN4.LJJJI;
        if (c1323050kX92 != null) {
            C1323050kX9.LJII(c1323050kX92);
            c1315750kLN4.LJJJI = null;
        }
        C1315750kLN c1315750kLN5 = (C1315750kLN) c1339410kxX.l0;
        c1315750kLN5.LJJIIZI.LJII(c1315750kLN5.LJFF, c1315750kLN5.LJI, interfaceC1330440kj4, animatable, c1315750kLN5.LJJIJIIJI, true, c1315750kLN5.LJJLI, c1315750kLN5.LJIJ);
    }

    public static final void LJ$2(final C1339410kxX c1339410kxX, final String str, Object obj, Animatable animatable) {
        DH dh;
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        C1315750kLN c1315750kLN = (C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2;
        if (c1315750kLN.LJJLI == -1 && (interfaceC1330440kj4 instanceof AbstractC1327750kej)) {
            c1315750kLN.LJJIIZI.getClass();
            if (C1315720kLK.LJFF((AbstractC1327750kej) interfaceC1330440kj4)) {
                ((C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2).LJJLI = 5;
            }
        }
        if ((interfaceC1330440kj4 instanceof C1325120kaU) && (dh = ((C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2).LJIIJJI.LLILZ) != 0) {
            dh.getClass();
            ((C1331070kk5) dh).LJIJI(((C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2).LJJJJJL);
        }
        if (((C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2).LJJIFFI) {
            C786410Ut5.LJJZZIII(C1315750kLN.LJJLIIIJILLIZJL, new Runnable() { // from class: X.0kLU
                public final void LIZ() {
                    C1315750kLN c1315750kLN2 = (C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2;
                    if (c1315750kLN2.LJJIIJ) {
                        if (c1315750kLN2.LJIILLIIL != null) {
                            boolean zContainsKey = c1315750kLN2.LJIILIIL.containsKey(str);
                            C1315750kLN c1315750kLN3 = (C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2;
                            C1320770kTT<C1331070kk5> c1320770kTT = c1315750kLN3.LJIIJJI;
                            if (zContainsKey) {
                                c1320770kTT = (C1320770kTT) ((LinkedHashMap) c1315750kLN3.LJIILIIL).get(str);
                            }
                            if (c1320770kTT != null) {
                                c1320770kTT.LLILZ.getClass();
                                DH dh2 = c1320770kTT.LLILZ;
                                dh2.getClass();
                                C1331070kk5 c1331070kk5 = (C1331070kk5) dh2;
                                if (c1331070kk5.LJI.LL != c1331070kk5.LIZ) {
                                    ((C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2).LJIILLIIL.onDrawableReady(c1320770kTT.LIZLLL());
                                }
                            }
                        }
                        Iterator it2 = ((LinkedHashMap) ((C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2).LJIILIIL).entrySet().iterator();
                        while (it2.hasNext()) {
                            Map.Entry entry = (Map.Entry) it2.next();
                            if (((String) entry.getKey()).equals(str)) {
                                break;
                            }
                            ((C1320770kTT) entry.getValue()).LJI();
                            it2.remove();
                        }
                    } else {
                        InterfaceC1316210kM7 interfaceC1316210kM7 = c1315750kLN2.LJIILLIIL;
                        if (interfaceC1316210kM7 != null) {
                            interfaceC1316210kM7.onDrawableReady(c1315750kLN2.LJIIJJI.LIZLLL());
                        }
                        C1320770kTT<C1331070kk5> c1320770kTT2 = ((C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2).LJIIL;
                        if (c1320770kTT2 != null) {
                            c1320770kTT2.LJI();
                            ((C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2).LJIIL = null;
                        }
                    }
                    C1315850kLX c1315850kLX = ((C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2).LJIILL;
                    if (c1315850kLX != null) {
                        c1315850kLX.LJI();
                        ((C1315750kLN) ((ARunnableS53S0300000_20) this.LLILLJJLI.l0).l2).LJIILL = null;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("LynxImageManager@8c93.tryFetchImageFromFresco$1$1$onFinalImageSet$1");
                    try {
                        LIZ();
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("LynxImageManager@8c93.tryFetchImageFromFresco$1$1$onFinalImageSet$1");
                }
            });
        }
        C1315750kLN c1315750kLN2 = (C1315750kLN) ((ARunnableS53S0300000_20) c1339410kxX.l0).l2;
        c1315750kLN2.LJJIIZI.LJII(c1315750kLN2.LJFF, c1315750kLN2.LJI, interfaceC1330440kj4, animatable, c1315750kLN2.LJJIJIIJI, true, c1315750kLN2.LJJLI, c1315750kLN2.LJIJ);
    }

    public static final void LJ$3(C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable) {
        ((C1324800kZy) c1339410kxX.l0).LLIZ = true;
    }

    public static final void LJ$4(C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable) {
        Animatable animatableLIZ;
        InterfaceC1330440kj4 interfaceC1330440kj4 = (InterfaceC1330440kj4) obj;
        ((C1325000kaI) c1339410kxX.l0).getClass();
        String url = ((C1325000kaI) c1339410kxX.l0).getUrl();
        if (!TextUtils.isEmpty(url)) {
            C1329340khI c1329340khI = C0QD7.LIZ;
            if (c1329340khI.LIZJ(url) == null && (interfaceC1330440kj4 instanceof C1329380khM)) {
                c1329340khI.LIZ(url, (C1329380khM) interfaceC1330440kj4);
            }
        }
        if (animatable != null) {
            C1325000kaI c1325000kaI = (C1325000kaI) c1339410kxX.l0;
            c1325000kaI.LLILLL = true;
            if (c1325000kaI.LLILLJJLI && c1325000kaI.getController() != null && c1325000kaI.LLILLJJLI && c1325000kaI.LLILLL && c1325000kaI.LLILZ && (animatableLIZ = c1325000kaI.getController().LIZ()) != null && !animatableLIZ.isRunning()) {
                animatableLIZ.start();
                WeakReference<InterfaceC1325010kaJ> weakReference = c1325000kaI.LL;
                if (weakReference != null && weakReference.get() != null) {
                    c1325000kaI.LL.get().LIZ();
                    return;
                }
                return;
            }
            return;
        }
        ((C1325000kaI) c1339410kxX.l0).LLILLL = false;
    }

    public static final void LJ$5(final C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            try {
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                animatedDrawable2.LJI(new C1331020kk0(animatedDrawable2.LLILLL, 1));
                animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.0kuz
                    @Override // X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        ((C2213011BjP) ((InterfaceC1337840kv0) this.LIZ.l0)).LIZIZ();
                    }
                });
                animatable.start();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("frescoOpenGifSplashError: e = ");
                sbLIZ.append(th.toString());
                C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
                C2344809Gs.LJI(th);
            }
        }
    }

    public static final void LJ$6(C1339410kxX c1339410kxX, String str, Object obj, final Animatable animatable) {
        if (!(animatable instanceof AnimatedDrawable2)) {
            C1336260ksS c1336260ksS = ((C1336240ksQ) c1339410kxX.l0).LIZIZ;
            if (c1336260ksS != null) {
                c1336260ksS.LIZIZ();
                return;
            }
            return;
        }
        AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
        ((C1336240ksQ) c1339410kxX.l0).LJIIJ = animatedDrawable2;
        animatedDrawable2.LJI(new C946370ajb(animatedDrawable2.LLILLL, 1));
        if (((C1336240ksQ) c1339410kxX.l0).LJII) {
            animatedDrawable2.LJIIIIZZ(new InterfaceC1331030kk1() { // from class: X.0kOz
                @Override // X.InterfaceC1331030kk1
                public final InterfaceC1330990kjx LIZ(InterfaceC1330960kju interfaceC1330960kju, Object obj2) {
                    return new C1330040kiQ(interfaceC1330960kju);
                }
            });
        }
        final C1336240ksQ c1336240ksQ = (C1336240ksQ) c1339410kxX.l0;
        animatedDrawable2.LJII(new C0I9J(animatable) { // from class: X.0ksR
            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                C1336240ksQ c1336240ksQ2 = this.LIZ;
                int i = c1336240ksQ2.LJIIIZ + 1;
                c1336240ksQ2.LJIIIZ = i;
                if (i == 1) {
                    C1336260ksS c1336260ksS2 = c1336240ksQ2.LIZIZ;
                    if (c1336260ksS2 != null) {
                        c1336260ksS2.LJ();
                        return;
                    }
                    return;
                }
                C1336260ksS c1336260ksS3 = c1336240ksQ2.LIZIZ;
                if (c1336260ksS3 == null) {
                    return;
                }
                c1336260ksS3.LIZLLL();
            }

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                C1336240ksQ c1336240ksQ2 = this.LIZ;
                int i = c1336240ksQ2.LJ;
                if (i == -1 || c1336240ksQ2.LJIIIZ < i) {
                    C786410Ut5.LJLIIL(c1336240ksQ2.LJFF, c1336240ksQ2.LJIIJJI, new ARunnableS120S0100000_20(c1336240ksQ2, 268));
                }
                C1336240ksQ c1336240ksQ3 = this.LIZ;
                int i2 = c1336240ksQ3.LJ;
                if ((i2 == -1 || c1336240ksQ3.LJIIIZ < i2) && !c1336240ksQ3.LJIIL) {
                    C1336260ksS c1336260ksS2 = c1336240ksQ3.LIZIZ;
                    if (c1336260ksS2 != null) {
                        c1336260ksS2.LIZJ();
                        return;
                    }
                    return;
                }
                if (c1336240ksQ3.LJIIL) {
                    C1336260ksS c1336260ksS3 = c1336240ksQ3.LIZIZ;
                    if (c1336260ksS3 == null) {
                        return;
                    }
                    c1336260ksS3.LIZ(c1336240ksQ3.LJIIIZ);
                    return;
                }
                C1336260ksS c1336260ksS4 = c1336240ksQ3.LIZIZ;
                if (c1336260ksS4 == null) {
                    return;
                }
                c1336260ksS4.LJFF(c1336240ksQ3.LJIIIZ);
            }

            @Override // X.C0I9J, X.InterfaceC1331000kjy
            public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                if (this.LIZ.LIZIZ != null && animatedDrawable22 != null) {
                    animatedDrawable22.LIZJ();
                }
            }
        });
    }

    public static final void LJ$7(C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LJ(str, obj, animatable);
        }
    }

    public static final void LJ$8(final C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable) {
        if (animatable != null) {
            try {
                AnimatedDrawable2 animatedDrawable2 = (AnimatedDrawable2) animatable;
                animatedDrawable2.LJI(new C1331020kk0(animatedDrawable2.LLILLL, 1));
                animatedDrawable2.LJII(new InterfaceC1331000kjy() { // from class: X.1BjX
                    @Override // X.InterfaceC1331000kjy
                    public final void LIZIZ(AnimatedDrawable2 animatedDrawable22) {
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZLLL(AnimatedDrawable2 animatedDrawable22, int i) {
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZ(AnimatedDrawable2 animatedDrawable22) {
                        InterfaceC1337840kv0 interfaceC1337840kv0 = (InterfaceC1337840kv0) this.LIZ.l0;
                        if (interfaceC1337840kv0 != null) {
                            C2213011BjP c2213011BjP = (C2213011BjP) interfaceC1337840kv0;
                            if (!c2213011BjP.LIZ) {
                                c2213011BjP.LIZJ.LJII(1);
                                C2212931BjH c2212931BjH = c2213011BjP.LIZJ;
                                c2212931BjH.LJIIIZ(c2212931BjH.LLJLIL.LJII());
                                c2213011BjP.LIZ = true;
                            }
                        }
                    }

                    @Override // X.InterfaceC1331000kjy
                    public final void LIZJ(AnimatedDrawable2 animatedDrawable22) {
                        InterfaceC1337840kv0 interfaceC1337840kv0 = (InterfaceC1337840kv0) this.LIZ.l0;
                        if (interfaceC1337840kv0 != null) {
                            ((C2213011BjP) interfaceC1337840kv0).LIZIZ();
                        }
                    }
                });
                animatable.start();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
            }
        }
    }

    public static final void LJIIIIZZ$0(C1339410kxX c1339410kxX, String str, Object obj, Animatable animatable, C1325710kbR c1325710kbR, Map map) {
        C1320700kTM<InterfaceC1330440kj4> c1320700kTM = ((C680400QmU) c1339410kxX.l0).LJ;
        if (c1320700kTM != null) {
            c1320700kTM.LJ(str, obj, animatable);
        }
    }
}
