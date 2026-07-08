package X;

import Y.ALAdapterS2S0200000_5;
import Y.AUListenerS255S0100000_5;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.android.livesdk.livesetting.game.DefaultHighLightCutConfig;
import com.bytedance.ies.nle.editor_jni.INLEMediaRuntime;
import com.bytedance.ies.nle.editor_jni.INLEMediaSession;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS549S0100000_5;

/* JADX INFO: renamed from: X.0Er7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377510Er7 {
    public static final /* synthetic */ int LJIIL = 0;
    public final EnumC377550ErB LIZ;
    public final InterfaceC1446740nke LIZIZ;
    public C377520Er8 LIZJ;
    public float LIZLLL;
    public List<? extends View> LJ = C13BV.INSTANCE;
    public View LJFF;
    public C372830EjZ LJI;
    public InterfaceC361710EGb LJII;
    public C0EOK LJIIIIZZ;
    public final boolean LJIIIZ;
    public final C01GW LJIIJ;
    public InterfaceC377530Er9 LJIIJJI;

    public final void LIZIZ() {
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 952);
        float f = this.LIZLLL;
        if (f >= 1.0f) {
            awS549S0100000_5.invoke();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 1.0f);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 16));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0200000_5(this, awS549S0100000_5, 8));
        valueAnimatorOfFloat.start();
    }

    public final void LIZJ() {
        AwS549S0100000_5 awS549S0100000_5 = new AwS549S0100000_5(this, 953);
        float f = this.LIZLLL;
        if (f == 0.0f) {
            awS549S0100000_5.invoke();
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
        valueAnimatorOfFloat.setDuration(DefaultHighLightCutConfig.DEFAULT_CUT_INTERVAL);
        valueAnimatorOfFloat.setInterpolator(C1619980sG4.LIZLLL());
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS255S0100000_5(this, 17));
        valueAnimatorOfFloat.addListener(new ALAdapterS2S0200000_5(this, awS549S0100000_5, 9));
        valueAnimatorOfFloat.start();
    }

    public static void LIZ(List list) {
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            if (view != null) {
                C786410Ut5.T4(view, 1.0f);
                C786410Ut5.LJLLLLLL(0, view);
            }
        }
    }

    public final void LIZLLL(float f) {
        float fLIZIZ;
        INLEMediaRuntime mediaRuntimeApi;
        int iW02;
        int iW022;
        C377520Er8 c377520Er8 = this.LIZJ;
        if (c377520Er8 == null) {
            return;
        }
        this.LIZLLL = f;
        InterfaceC377530Er9 interfaceC377530Er9 = this.LJIIJJI;
        if (interfaceC377530Er9 != null) {
            interfaceC377530Er9.LIZIZ(f);
        }
        View view = this.LJFF;
        if (view != null) {
            float fLIZIZ2 = C372820EjY.LIZIZ(f, c377520Er8.LIZ);
            float fLIZIZ3 = C372820EjY.LIZIZ(f, c377520Er8.LIZIZ);
            float fLIZIZ4 = C372820EjY.LIZIZ(f, c377520Er8.LIZJ);
            if (this.LJIIIZ) {
                C786410Ut5.Ob(view, fLIZIZ2);
                C786410Ut5.pc(view, fLIZIZ3);
                view.setPivotX(view.getWidth() / 2.0f);
                view.setPivotY(view.getHeight() / 2.0f);
                C786410Ut5.ed(view, fLIZIZ4);
                C1447470nlp.LIZIZ(view, C372820EjY.LIZIZ(1 - this.LIZLLL, c377520Er8.LJIIIIZZ));
            } else {
                INLEMediaSession iNLEMediaSession = (INLEMediaSession) this.LJIIJ.getValue();
                if (iNLEMediaSession != null && (mediaRuntimeApi = iNLEMediaSession.getMediaRuntimeApi()) != null) {
                    mediaRuntimeApi.setDisplayState(fLIZIZ2, fLIZIZ3, 0.0f, 0, -((int) fLIZIZ4));
                }
            }
            float f2 = 1;
            this.LIZIZ.Rd0(fLIZIZ2, (view.getWidth() / 2) * (f2 - fLIZIZ2), ((view.getHeight() / 2) * (f2 - fLIZIZ3)) + fLIZIZ4);
            if (this.LIZ == EnumC377550ErB.SLIDE_OUT) {
                float fFloatValue = c377520Er8.LIZJ.getFirst().floatValue();
                InterfaceC361710EGb interfaceC361710EGb = this.LJII;
                if (interfaceC361710EGb != null) {
                    iW02 = interfaceC361710EGb.W02();
                } else {
                    iW02 = 0;
                }
                Float fValueOf = Float.valueOf(fFloatValue - iW02);
                InterfaceC361710EGb interfaceC361710EGb2 = this.LJII;
                if (interfaceC361710EGb2 != null) {
                    iW022 = interfaceC361710EGb2.W02();
                } else {
                    iW022 = 0;
                }
                Pair pair = new Pair(fValueOf, Float.valueOf(-iW022));
                C0EOK c0eok = this.LJIIIIZZ;
                if (c0eok != null) {
                    c0eok.sq(Integer.valueOf((int) (view.getHeight() * fLIZIZ3)), Float.valueOf(C372820EjY.LIZIZ(f, pair)), Float.valueOf(view.getHeight() / 2.0f));
                }
            }
        }
        float fLIZIZ5 = C372820EjY.LIZIZ(f, c377520Er8.LJFF);
        if (this.LIZ == EnumC377550ErB.SLIDE_OUT) {
            fLIZIZ5 = C372820EjY.LIZ(f);
        }
        for (View view2 : this.LJ) {
            if (view2 != null) {
                C786410Ut5.T4(view2, fLIZIZ5);
                C786410Ut5.LJLLLLLL(0, view2);
            }
        }
        C372830EjZ c372830EjZ = this.LJI;
        if (c372830EjZ != null) {
            float fLIZIZ6 = C372820EjY.LIZIZ(f, c377520Er8.LIZLLL);
            C786410Ut5.ed(c372830EjZ.getControlLayout(), fLIZIZ6);
            FrameLayout grabberView = c372830EjZ.getGrabberView();
            if (grabberView != null) {
                C786410Ut5.fd(grabberView, fLIZIZ6);
            }
            if (this.LIZ == EnumC377550ErB.SLIDE_OUT) {
                fLIZIZ = 1 - C372820EjY.LIZ(f);
            } else {
                fLIZIZ = C372820EjY.LIZIZ(f, c377520Er8.LJ);
            }
            C372820EjY.LIZJ(c372830EjZ, fLIZIZ);
        }
    }

    public C377510Er7(EnumC377550ErB enumC377550ErB, InterfaceC1446740nke interfaceC1446740nke) {
        boolean z;
        this.LIZ = enumC377550ErB;
        this.LIZIZ = interfaceC1446740nke;
        if (Build.VERSION.SDK_INT >= 24) {
            z = true;
        } else {
            z = false;
        }
        this.LJIIIZ = z;
        this.LJIIJ = C452501pT.LIZIZ(new AwS549S0100000_5(this, 951));
    }
}
