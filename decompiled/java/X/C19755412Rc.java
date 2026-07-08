package X;

import android.animation.ValueAnimator;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.ss.android.ugc.aweme.audiorecord.AudioRecorderParam;
import com.ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Stack;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS199S0000000_12;

/* JADX INFO: renamed from: X.12Rc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19755412Rc implements C0EZA {
    public final InterfaceC1455860nzM LIZ;
    public boolean LIZJ;
    public final InterfaceC1452170ntP LIZLLL;
    public int LJ;
    public final MutableLiveData<C1452730nuJ> LJFF;
    public Point LJII;
    public InterfaceC19755712Rf LJIIIIZZ;
    public InterfaceC19755812Rg LJIIIZ;
    public final C19755612Re LJIIJ;
    public final ValueAnimator LIZIZ = ValueAnimator.ofInt(1, 10);
    public final C01GW LJI = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(369));

    @Override // X.C0EZA
    public final Point LIZ() {
        Point pointLIZLLL;
        InterfaceC19755712Rf interfaceC19755712Rf = this.LJIIIIZZ;
        if (interfaceC19755712Rf == null || (pointLIZLLL = interfaceC19755712Rf.LIZLLL()) == null) {
            return null;
        }
        float x = pointLIZLLL.getX() / this.LJ;
        pointLIZLLL.setY(pointLIZLLL.getY() + 100);
        int y = pointLIZLLL.getY();
        int i = this.LJ;
        if (y > i) {
            pointLIZLLL.setY(i);
        }
        this.LJIIJ.LIZ(x, true);
        InterfaceC19755712Rf interfaceC19755712Rf2 = this.LJIIIIZZ;
        if (interfaceC19755712Rf2 != null) {
            interfaceC19755712Rf2.LJIILL(x);
        }
        InterfaceC19755812Rg interfaceC19755812Rg = this.LJIIIZ;
        if (interfaceC19755812Rg != null) {
            interfaceC19755812Rg.LJIILL(x);
        }
        return pointLIZLLL;
    }

    @Override // X.C0EZA
    public final void LIZLLL() {
        this.LJFF.setValue(C1452730nuJ.LIZ());
        this.LIZIZ.start();
    }

    @Override // X.C0EZA
    public final void LJ() {
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZLLL;
        if (interfaceC1452170ntP == null || this.LJIIIIZZ == null) {
            return;
        }
        if (this.LJII != null) {
            this.LJFF.setValue(C1452730nuJ.LIZLLL(r0.getY()));
            this.LJII = this.LJIIIIZZ.LJ(this.LJII.getY());
        } else {
            int iLLL = interfaceC1452170ntP.LLL();
            if (iLLL < 50) {
                iLLL = 0;
            }
            this.LJII = this.LJIIIIZZ.LJ(iLLL);
        }
    }

    @Override // X.C0EZA
    public final Stack<Point> LJFF() {
        InterfaceC19755712Rf interfaceC19755712Rf = this.LJIIIIZZ;
        if (interfaceC19755712Rf != null) {
            return interfaceC19755712Rf.getStack();
        }
        return null;
    }

    @Override // X.C0EZA
    public final void LJI() {
        if (this.LJII != null) {
            LJIIIIZZ().setValue(Long.valueOf(r0.getY()));
        }
    }

    public final void LJII() {
        this.LJFF.setValue(C1452730nuJ.LIZJ());
        this.LIZIZ.cancel();
    }

    public final MutableLiveData<Long> LJIIIIZZ() {
        return (MutableLiveData) this.LJI.getValue();
    }

    public final void LJIIJ() {
        this.LJIIJ.LIZ(0.0f, true);
        InterfaceC19755712Rf interfaceC19755712Rf = this.LJIIIIZZ;
        if (interfaceC19755712Rf != null) {
            interfaceC19755712Rf.LJIILL(0.0f);
        }
        InterfaceC19755812Rg interfaceC19755812Rg = this.LJIIIZ;
        if (interfaceC19755812Rg != null) {
            interfaceC19755812Rg.LJIILL(0.0f);
        }
    }

    public C19755412Rc(InterfaceC1446740nke interfaceC1446740nke) {
        this.LIZ = interfaceC1446740nke;
        this.LJ = 1;
        this.LJFF = interfaceC1446740nke.vW1();
        InterfaceC1452170ntP value = interfaceC1446740nke.g().getValue();
        this.LIZLLL = value;
        if (value != null) {
            this.LJ = value.getDuration();
        }
        this.LJIIJ = new C19755612Re(this);
    }

    @Override // X.C0EZA
    public final void LIZJ(boolean z) {
        if (!z) {
            this.LJFF.setValue(C1452730nuJ.LIZJ());
        }
        InterfaceC1452170ntP interfaceC1452170ntP = this.LIZLLL;
        if (interfaceC1452170ntP != null) {
            interfaceC1452170ntP.refreshCurrentFrame();
            LJIIIIZZ().setValue(Long.valueOf(interfaceC1452170ntP.LLL()));
        }
    }

    public final void LJIIIZ(final Function1 function1, final Function0 function0, final Function0 function02, final Function0 function03) {
        this.LIZIZ.removeAllUpdateListeners();
        this.LIZIZ.setDuration(1000L);
        this.LIZIZ.setRepeatCount(-1);
        this.LIZIZ.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.12Rd
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C19755412Rc c19755412Rc = this.LL;
                InterfaceC1452170ntP interfaceC1452170ntP = c19755412Rc.LIZLLL;
                if (interfaceC1452170ntP == null) {
                    return;
                }
                c19755412Rc.LJIIIIZZ().setValue(Long.valueOf(interfaceC1452170ntP.LLL()));
                float fLLL = interfaceC1452170ntP.LLL() / interfaceC1452170ntP.getDuration();
                InterfaceC19755712Rf interfaceC19755712Rf = this.LL.LJIIIIZZ;
                if (interfaceC19755712Rf != null) {
                    interfaceC19755712Rf.LJIILL(fLLL);
                }
                InterfaceC19755812Rg interfaceC19755812Rg = this.LL.LJIIIZ;
                if (interfaceC19755812Rg != null) {
                    interfaceC19755812Rg.LJIILL(fLLL);
                }
                if (function0.invoke().booleanValue()) {
                    InterfaceC19755712Rf interfaceC19755712Rf2 = this.LL.LJIIIIZZ;
                    if (interfaceC19755712Rf2 != null) {
                        int iLIZ = interfaceC19755712Rf2.LIZ(interfaceC1452170ntP.LLL(), this.LL.LJII);
                        InterfaceC19755712Rf interfaceC19755712Rf3 = this.LL.LJIIIIZZ;
                        if (interfaceC19755712Rf3 != null) {
                            interfaceC19755712Rf3.LIZIZ();
                        }
                        if (iLIZ == -1) {
                            Point point = this.LL.LJII;
                            if (point != null) {
                                point.setY(interfaceC1452170ntP.LLL());
                            }
                            InterfaceC19755712Rf interfaceC19755712Rf4 = this.LL.LJIIIIZZ;
                            if (interfaceC19755712Rf4 != null) {
                                interfaceC19755712Rf4.LIZIZ();
                            }
                        } else {
                            Point point2 = this.LL.LJII;
                            if (point2 != null) {
                                point2.setY(iLIZ);
                            }
                            InterfaceC19755712Rf interfaceC19755712Rf5 = this.LL.LJIIIIZZ;
                            if (interfaceC19755712Rf5 != null) {
                                interfaceC19755712Rf5.LIZIZ();
                            }
                            function1.invoke(Integer.valueOf(iLIZ));
                        }
                    } else {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } else {
                    this.LL.LJII = null;
                }
                if (interfaceC1452170ntP.LLL() >= this.LL.LJ) {
                    if (function0.invoke().booleanValue()) {
                        function02.invoke();
                        return;
                    }
                    this.LL.LIZIZ.cancel();
                    this.LL.LJIIJ();
                    function03.invoke();
                    if (!this.LL.LIZJ || interfaceC1452170ntP.LLL() != 0) {
                        return;
                    }
                    C19755412Rc c19755412Rc2 = this.LL;
                    if (c19755412Rc2.LJ == 0) {
                        return;
                    }
                    c19755412Rc2.LIZLLL();
                }
            }
        });
    }

    @Override // X.C0EZA
    public final void LIZIZ(int i, boolean z, C0EZE c0eze, Cert cert, VideoPublishEditModel videoPublishEditModel) {
        int iLLL;
        long x;
        int y;
        C348100Dkm c348100DkmLIZIZ;
        NLEEditor nLEEditor;
        float recordVolume;
        if (c0eze != null) {
            if (z) {
                Point point = this.LJII;
                if (point != null) {
                    point.setY(this.LJ);
                }
                c0eze.LIZLLL(cert);
            } else {
                c0eze.LIZLLL(cert);
                InterfaceC1452170ntP interfaceC1452170ntP = this.LIZLLL;
                if (interfaceC1452170ntP != null) {
                    iLLL = interfaceC1452170ntP.LLL();
                } else {
                    iLLL = 0;
                }
                if (i == -1) {
                    i = iLLL;
                }
                Point point2 = this.LJII;
                if (point2 != null) {
                    point2.setY(i);
                }
                this.LJFF.setValue(C1452730nuJ.LIZLLL(i));
                InterfaceC19755712Rf interfaceC19755712Rf = this.LJIIIIZZ;
                if (interfaceC19755712Rf != null) {
                    interfaceC19755712Rf.LJIILL(i / this.LJ);
                }
                InterfaceC19755812Rg interfaceC19755812Rg = this.LJIIIZ;
                if (interfaceC19755812Rg != null) {
                    interfaceC19755812Rg.LJIILL(i / this.LJ);
                }
            }
            String strLIZ = c0eze.LIZ();
            Point point3 = this.LJII;
            if (point3 != null) {
                x = point3.getX();
            } else {
                x = 0;
            }
            Point point4 = this.LJII;
            if (point4 != null) {
                y = point4.getY();
            } else {
                y = this.LJ;
            }
            long j = y;
            if (j > x) {
                InterfaceC1452170ntP interfaceC1452170ntP2 = this.LIZLLL;
                if (interfaceC1452170ntP2 != null && (c348100DkmLIZIZ = C352130DrH.LIZIZ(interfaceC1452170ntP2)) != null && (nLEEditor = c348100DkmLIZIZ.LIZ) != null) {
                    C347650Dk3 c347650Dk3 = new C347650Dk3(EnumC355960DxS.DUB);
                    c347650Dk3.LIZIZ = strLIZ;
                    c347650Dk3.LIZLLL = 0L;
                    c347650Dk3.LJ = j - x;
                    c347650Dk3.LJFF = x;
                    c347650Dk3.LJI = j;
                    AudioRecorderParam veAudioRecorderParam = videoPublishEditModel.getVeAudioRecorderParam();
                    if (veAudioRecorderParam != null) {
                        recordVolume = veAudioRecorderParam.getRecordVolume();
                    } else {
                        recordVolume = 1.0f;
                    }
                    c347650Dk3.LJIIIZ = recordVolume;
                    C349300Dmi.LIZ(nLEEditor, c347650Dk3, videoPublishEditModel);
                }
                InterfaceC19755712Rf interfaceC19755712Rf2 = this.LJIIIIZZ;
                if (interfaceC19755712Rf2 != null) {
                    interfaceC19755712Rf2.LIZIZ();
                    return;
                }
                return;
            }
            InterfaceC19755712Rf interfaceC19755712Rf3 = this.LJIIIIZZ;
            if (interfaceC19755712Rf3 == null) {
                return;
            }
            interfaceC19755712Rf3.LIZLLL();
        }
    }
}
