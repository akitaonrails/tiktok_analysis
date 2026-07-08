package X;

import Y.ALAdapterS19S0100000_24;
import Y.ARunnableS113S0100000_13;
import Y.ARunnableS124S0100000_24;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.guide.publish.IProGuidePublishService;
import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Field;

/* JADX INFO: renamed from: X.0rZg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1593700rZg {
    public final ViewGroup LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final RemoteImageView LIZLLL;
    public int LJ;
    public int LJFF;
    public ObjectAnimator LJI;
    public AnimatorSet LJII;
    public View LJIIIIZZ;
    public View LJIIIZ;

    public final boolean LIZLLL() {
        return this.LJ == 2;
    }

    public final void LJI() {
        ObjectAnimator objectAnimator = this.LJI;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
        }
        ObjectAnimator objectAnimator2 = this.LJI;
        if (objectAnimator2 != null) {
            objectAnimator2.end();
        }
        ObjectAnimator objectAnimator3 = this.LJI;
        if (objectAnimator3 != null) {
            objectAnimator3.cancel();
        }
        this.LJI = null;
    }

    public static ObjectAnimator LIZIZ(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new C21388418n4());
        objectAnimatorOfPropertyValuesHolder.setDuration(400L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public static ObjectAnimator LIZJ(View view) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat("scaleX", 0.0f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 0.0f, 1.0f));
        objectAnimatorOfPropertyValuesHolder.setInterpolator(new C21388418n4());
        objectAnimatorOfPropertyValuesHolder.setDuration(400L);
        return objectAnimatorOfPropertyValuesHolder;
    }

    public final void LIZ(boolean z) {
        if (this.LJ == 0) {
            return;
        }
        AnimatorSet animatorSet = this.LJII;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
        }
        AnimatorSet animatorSet2 = this.LJII;
        if (animatorSet2 != null) {
            animatorSet2.cancel();
        }
        this.LJII = null;
        LJI();
        if (z) {
            View view = this.LJIIIZ;
            RemoteImageView remoteImageView = this.LIZLLL;
            if (view != null) {
                C786410Ut5.Ob(view, 0.0f);
                C786410Ut5.pc(view, 0.0f);
            }
            if (remoteImageView != null) {
                C786410Ut5.Ob(remoteImageView, 1.0f);
                C786410Ut5.pc(remoteImageView, 1.0f);
            }
            View view2 = this.LJIIIZ;
            RemoteImageView remoteImageView2 = this.LIZLLL;
            if (view2 != null && remoteImageView2 != null) {
                ObjectAnimator objectAnimatorLIZJ = LIZJ(view2);
                ObjectAnimator objectAnimatorLIZIZ = LIZIZ(remoteImageView2);
                AnimatorSet animatorSet3 = new AnimatorSet();
                animatorSet3.play(objectAnimatorLIZJ).with(objectAnimatorLIZIZ);
                animatorSet3.start();
            }
        } else {
            View view3 = this.LJIIIZ;
            if (view3 != null) {
                HandlerHook.viewPost(view3, new ARunnableS113S0100000_13(this, 148));
            }
        }
        ((IProGuidePublishService) ServiceManager.get().getService(IProGuidePublishService.class)).LIZLLL();
    }

    public final void LJFF(boolean z) {
        AnimatorSet animatorSet;
        RemoteImageView remoteImageView = this.LIZLLL;
        View view = this.LJIIIZ;
        if (remoteImageView != null) {
            C786410Ut5.Ob(remoteImageView, 0.0f);
            C786410Ut5.pc(remoteImageView, 0.0f);
        }
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
        }
        if (z) {
            View view2 = this.LJIIIZ;
            if (view2 == null) {
                animatorSet = null;
            } else {
                ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view2, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 1.2f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 1.2f));
                objectAnimatorOfPropertyValuesHolder.setInterpolator(new C21388418n4());
                objectAnimatorOfPropertyValuesHolder.setDuration(150L);
                animatorSet = new AnimatorSet();
                animatorSet.play(objectAnimatorOfPropertyValuesHolder);
            }
            this.LJII = animatorSet;
            if (animatorSet != null) {
                animatorSet.addListener(new ALAdapterS19S0100000_24(this, 2));
            }
            AnimatorSet animatorSet2 = this.LJII;
            if (animatorSet2 != null) {
                animatorSet2.start();
                return;
            }
            return;
        }
        View view3 = this.LJIIIZ;
        if (view3 == null) {
            return;
        }
        HandlerHook.viewPost(view3, new ARunnableS113S0100000_13(this, 149));
    }

    public C1593700rZg(Context context, C1592950rYT c1592950rYT) throws Throwable {
        Object obj;
        this.LIZ = c1592950rYT;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        Context contextN3 = C786410Ut5.N3(context);
        File file = C786450Ut9.LIZJ;
        if (file == null || !C786450Ut9.LJ) {
            try {
                C786450Ut9.LIZJ = contextN3.getFilesDir();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                Context applicationContext = null;
                try {
                    Class<?> cls = Class.forName("android.app.ActivityThread");
                    Object objInvoke = cls.getDeclaredMethod("currentActivityThread", new Class[0]).invoke(null, new Object[0]);
                    Field declaredField = cls.getDeclaredField("mInitialApplication");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(objInvoke);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    PrintStream printStream = System.out;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Error: ");
                    sbLIZ2.append(e.getMessage());
                    printStream.println(C2188811AlT.LIZIZ(sbLIZ2));
                }
                if (obj instanceof Application) {
                    applicationContext = ((Application) obj).getApplicationContext();
                    PrintStream printStream2 = System.out;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Application context obtained through ActivityThread: ");
                    sbLIZ3.append(applicationContext);
                    printStream2.println(C2188811AlT.LIZIZ(sbLIZ3));
                    if (applicationContext != null) {
                        C786450Ut9.LIZJ = applicationContext.getFilesDir();
                        C08RN.LIZ(applicationContext);
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(th.getMessage());
                    sbLIZ4.append(":");
                    sbLIZ4.append(C08RN.LIZJ());
                    sbLIZ4.append(" applicationContext is null");
                    throw new Throwable(C2188811AlT.LIZIZ(sbLIZ4));
                }
                System.out.println("Error: mInitialApplication is not an instance of Application");
                StringBuilder sbLIZ42 = C2188811AlT.LIZ();
                sbLIZ42.append(th.getMessage());
                sbLIZ42.append(":");
                sbLIZ42.append(C08RN.LIZJ());
                sbLIZ42.append(" applicationContext is null");
                throw new Throwable(C2188811AlT.LIZIZ(sbLIZ42));
            }
            file = C786450Ut9.LIZJ;
        }
        sbLIZ.append(file);
        String str = File.separator;
        sbLIZ.append(str);
        sbLIZ.append("superentrance");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        this.LIZIZ = strLIZIZ;
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append(strLIZIZ);
        sbLIZ5.append(str);
        sbLIZ5.append("plusicon.png");
        this.LIZJ = C2188811AlT.LIZIZ(sbLIZ5);
        RemoteImageView remoteImageView = new RemoteImageView(this.LIZ.getContext());
        this.LIZLLL = remoteImageView;
        remoteImageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        C786410Ut5.l(remoteImageView, 8);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C341940Daq.LIZ(45.0d), C341940Daq.LIZ(45.0d));
        layoutParams.gravity = 17;
        RemoteImageView remoteImageView2 = this.LIZLLL;
        if (remoteImageView2 != null) {
            C786410Ut5.f7(remoteImageView2, layoutParams);
        }
        this.LIZ.addView(remoteImageView);
    }

    public final void LJ(final boolean z, final boolean z2) {
        AnimatorSet animatorSet;
        RemoteImageView remoteImageView = this.LIZLLL;
        View view = this.LJIIIZ;
        if (remoteImageView != null) {
            C786410Ut5.Ob(remoteImageView, 0.0f);
            C786410Ut5.pc(remoteImageView, 0.0f);
        }
        if (view != null) {
            C786410Ut5.Ob(view, 1.0f);
            C786410Ut5.pc(view, 1.0f);
        }
        RemoteImageView remoteImageView2 = this.LIZLLL;
        if (remoteImageView2 != null) {
            C786410Ut5.l(remoteImageView2, 0);
        }
        RemoteImageView remoteImageView3 = this.LIZLLL;
        View view2 = this.LJIIIZ;
        if (remoteImageView3 != null && view2 != null) {
            ObjectAnimator objectAnimatorLIZJ = LIZJ(remoteImageView3);
            ObjectAnimator objectAnimatorLIZIZ = LIZIZ(view2);
            animatorSet = new AnimatorSet();
            animatorSet.play(objectAnimatorLIZJ).with(objectAnimatorLIZIZ);
        } else {
            animatorSet = null;
        }
        this.LJII = animatorSet;
        if (animatorSet != null) {
            animatorSet.addListener(new AnimatorListenerAdapter() { // from class: X.0rZe
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C1593700rZg c1593700rZg;
                    RemoteImageView remoteImageView4;
                    super.onAnimationEnd(animator);
                    if (z2) {
                        C1593700rZg c1593700rZg2 = this;
                        RemoteImageView remoteImageView5 = c1593700rZg2.LIZLLL;
                        if (remoteImageView5 == null) {
                            c1593700rZg2.getClass();
                        } else {
                            c1593700rZg2.LJI();
                            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(remoteImageView5, PropertyValuesHolder.ofFloat("scaleX", 1.0f, 0.9f, 1.0f), PropertyValuesHolder.ofFloat("scaleY", 1.0f, 0.9f, 1.0f));
                            c1593700rZg2.LJI = objectAnimatorOfPropertyValuesHolder;
                            if (objectAnimatorOfPropertyValuesHolder != null) {
                                objectAnimatorOfPropertyValuesHolder.setInterpolator(new C21388418n4());
                            }
                            ObjectAnimator objectAnimator = c1593700rZg2.LJI;
                            if (objectAnimator != null) {
                                objectAnimator.setDuration(2000L);
                            }
                            ObjectAnimator objectAnimator2 = c1593700rZg2.LJI;
                            if (objectAnimator2 != null) {
                                objectAnimator2.setRepeatCount(2);
                            }
                            ObjectAnimator objectAnimator3 = c1593700rZg2.LJI;
                            if (objectAnimator3 != null) {
                                objectAnimator3.setRepeatMode(1);
                            }
                            ObjectAnimator objectAnimator4 = c1593700rZg2.LJI;
                            if (objectAnimator4 != null) {
                                C786410Ut5.Pd(objectAnimator4);
                            }
                        }
                    }
                    if (z && (remoteImageView4 = (c1593700rZg = this).LIZLLL) != null) {
                        HandlerHook.viewPostDelay(remoteImageView4, new ARunnableS124S0100000_24(c1593700rZg, 98), Mp4ScreenVideoLoadTimeout.CONTROL);
                    }
                }
            });
        }
        AnimatorSet animatorSet2 = this.LJII;
        if (animatorSet2 != null) {
            animatorSet2.start();
        }
    }
}
