package X;

import Y.ACListenerS127S0200000_25;
import Y.ACallableS253S0200000_25;
import Y.ALAdapterS9S0110000_25;
import Y.ARunnableS94S0200000_25;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.sticker.view.internal.pager.pages.OriginalFragment;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;

/* JADX INFO: renamed from: X.0sjA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class ViewOnClickListenerC1638020sjA implements View.OnClickListener, InterfaceC1624270sMz {
    public static String LLLIL = "";
    public final Function2<String, String, InterfaceC1638030sjB> LLILLL;
    public final Function0<Drawable> LLILZ;
    public final InterfaceC1624480sNK LLILZIL;
    public final InterfaceC1625410sOp LLILZLL;
    public final InterfaceC1625220sOW LLIZ;
    public final C19GS LLIZLLLIL;
    public final InterfaceC1631100sY0 LLJ;
    public final CreativeModel LLJI;
    public final Scene LLJIJIL;
    public final C1DRG LLJILJIL;
    public final FragmentManager LLJILJILJ;
    public LinearLayout LLJILLL;
    public C1322110kVd LLJJ;
    public TextView LLJJI;
    public TextView LLJJIII;
    public Context LLJJIJI;
    public Effect LLJJIJIL;
    public C1322110kVd LLJJJ;
    public C19518211Xw LLJJJIL;
    public LinearLayout LLJJJJ;
    public C19518211Xw LLJJJJJIL;
    public InterfaceC1638030sjB LLJJJJLIIL;
    public C19518211Xw LLJJL;
    public C424630Gkv LLJJLIIIJLLLLLLLZ;
    public C19518211Xw LLJL;
    public C19518211Xw LLJLIL;
    public C19518211Xw LLJLILLLLZIIL;
    public int LLJLL;
    public C21594319fB LLJLLIL;
    public OriginalFragment LLJLLL;
    public LinearLayout LLJZ;
    public FrameLayout LLJZIJLIL;
    public C418740GbQ LLL;
    public C418740GbQ LLLF;
    public LinearLayout LLLFF;
    public LinearLayout LLLFFI;
    public C1322110kVd LLLFZ;
    public C19518211Xw LLLI;
    public boolean LLLII;
    public FrameLayout LLLIIII;
    public View LLLIIIIL;
    public Effect LLLIIIL;
    public ACListenerS127S0200000_25 LLLIIL;
    public final boolean LL = true;
    public final boolean LLILLJJLI = true;
    public final HashMap<String, InterfaceC1638030sjB> LLJJIJIIJIL = new HashMap<>();
    public final C01GW LLLIILIL = C452501pT.LIZIZ(new AwS569S0100000_25(this, 1203));

    @Override // X.InterfaceC1624270sMz
    public final void LIZ() {
        this.LLJJIJIL = null;
        LinearLayout linearLayout = this.LLJILLL;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
        LinearLayout linearLayout2 = this.LLJJJJ;
        if (linearLayout2 != null) {
            C786410Ut5.LJZL(8, linearLayout2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
    }

    public final View LJ() {
        View view = this.LLLIIIIL;
        if (view != null) {
            return view;
        }
        return null;
    }

    public final void LJIIIIZZ() {
        C19518211Xw c19518211Xw;
        String string;
        String string2;
        C19518211Xw c19518211Xw2;
        String string3;
        String string4;
        InterfaceC1638030sjB interfaceC1638030sjB = this.LLJJJJLIIL;
        String str = "";
        if (interfaceC1638030sjB != null && interfaceC1638030sjB.LIZJ() == 1) {
            InterfaceC1638030sjB interfaceC1638030sjB2 = this.LLJJJJLIIL;
            if (interfaceC1638030sjB2 != null && interfaceC1638030sjB2.getFollowStatus() == 1) {
                C19518211Xw c19518211Xw3 = this.LLJLILLLLZIIL;
                if (c19518211Xw3 != null) {
                    Locale locale = Locale.getDefault();
                    Context context = this.LLJJIJI;
                    if (context != null && (string4 = context.getString(2131834932)) != null) {
                        str = string4;
                    }
                    String strK4 = C786410Ut5.k4(locale, str, Arrays.copyOf(new Object[0], 0));
                    C19518211Xw c19518211Xw4 = this.LLJLILLLLZIIL;
                    if (c19518211Xw4 != null) {
                        c19518211Xw4.setText(strK4);
                    }
                    c19518211Xw3.setBackgroundResource(R.drawable.crd);
                    this.LLJLL = 1;
                    return;
                }
                return;
            }
            InterfaceC1638030sjB interfaceC1638030sjB3 = this.LLJJJJLIIL;
            if (interfaceC1638030sjB3 == null || interfaceC1638030sjB3.getFollowStatus() != 0 || (c19518211Xw2 = this.LLJLILLLLZIIL) == null) {
                return;
            }
            Locale locale2 = Locale.getDefault();
            Context context2 = this.LLJJIJI;
            if (context2 != null && (string3 = context2.getString(2131834735)) != null) {
                str = string3;
            }
            String strK42 = C786410Ut5.k4(locale2, str, Arrays.copyOf(new Object[0], 0));
            C19518211Xw c19518211Xw5 = this.LLJLILLLLZIIL;
            if (c19518211Xw5 != null) {
                c19518211Xw5.setText(strK42);
            }
            c19518211Xw2.setBackgroundResource(R.drawable.crc);
            this.LLJLL = 0;
            return;
        }
        InterfaceC1638030sjB interfaceC1638030sjB4 = this.LLJJJJLIIL;
        if (interfaceC1638030sjB4 != null && interfaceC1638030sjB4.getFollowStatus() == 1) {
            C19518211Xw c19518211Xw6 = this.LLJLILLLLZIIL;
            if (c19518211Xw6 != null) {
                Locale locale3 = Locale.getDefault();
                Context context3 = this.LLJJIJI;
                if (context3 != null && (string2 = context3.getString(R.string.jrk)) != null) {
                    str = string2;
                }
                String strK43 = C786410Ut5.k4(locale3, str, Arrays.copyOf(new Object[0], 0));
                C19518211Xw c19518211Xw7 = this.LLJLILLLLZIIL;
                if (c19518211Xw7 != null) {
                    c19518211Xw7.setText(strK43);
                }
                c19518211Xw6.setBackgroundResource(R.drawable.crd);
                this.LLJLL = 1;
                return;
            }
            return;
        }
        InterfaceC1638030sjB interfaceC1638030sjB5 = this.LLJJJJLIIL;
        if (interfaceC1638030sjB5 == null || interfaceC1638030sjB5.getFollowStatus() != 0 || (c19518211Xw = this.LLJLILLLLZIIL) == null) {
            return;
        }
        Locale locale4 = Locale.getDefault();
        Context context4 = this.LLJJIJI;
        if (context4 != null && (string = context4.getString(R.string.jp2)) != null) {
            str = string;
        }
        String strK44 = C786410Ut5.k4(locale4, str, Arrays.copyOf(new Object[0], 0));
        C19518211Xw c19518211Xw8 = this.LLJLILLLLZIIL;
        if (c19518211Xw8 != null) {
            c19518211Xw8.setText(strK44);
        }
        c19518211Xw.setBackgroundResource(R.drawable.crc);
        this.LLJLL = 0;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destory() {
        LinearLayout linearLayout = this.LLJZ;
        if (linearLayout != null) {
            C786410Ut5.LJZL(8, linearLayout);
        }
    }

    public final FragmentManager LJFF() {
        return C294080Bfq.LIZ() ? this.LLJILJILJ : this.LLIZLLLIL.getSupportFragmentManager();
    }

    @Override // X.InterfaceC1624270sMz
    public final EnumC992590bw9 priority() {
        return EnumC992590bw9.DesignerInfoHandlerPriority;
    }

    @Override // X.InterfaceC1624270sMz
    public final void LIZIZ(View view) {
        this.LLLIIIIL = view;
        Context context = view.getContext();
        this.LLJJIJI = context;
        if (context == null) {
            return;
        }
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.mfq);
        this.LLJJJJ = linearLayout;
        if (this.LLILLJJLI) {
            if (linearLayout != null) {
                C786410Ut5.LJZL(0, linearLayout);
            }
            this.LLLFZ = (C1322110kVd) view.findViewById(R.id.w64);
            this.LLLI = (C19518211Xw) view.findViewById(R.id.w6i);
            this.LLJJJ = (C1322110kVd) view.findViewById(R.id.p82);
            this.LLJJJIL = (C19518211Xw) view.findViewById(R.id.p83);
            this.LLLFFI = (LinearLayout) view.findViewById(R.id.p7b);
            this.LLJJJJJIL = (C19518211Xw) view.findViewById(R.id.pt8);
            this.LLJJL = (C19518211Xw) view.findViewById(R.id.pta);
            this.LLJJLIIIJLLLLLLLZ = (C424630Gkv) view.findViewById(R.id.kh3);
            this.LLJL = (C19518211Xw) view.findViewById(R.id.pt_);
            this.LLJLIL = (C19518211Xw) view.findViewById(R.id.pt6);
            this.LLJZ = (LinearLayout) view.findViewById(R.id.pt9);
            this.LLJLILLLLZIIL = (C19518211Xw) view.findViewById(R.id.iea);
            this.LLJLLIL = (C21594319fB) view.findViewById(R.id.viewpager_sticker);
            this.LLLIIII = (FrameLayout) view.findViewById(R.id.mhh);
            this.LLJZIJLIL = (FrameLayout) view.findViewById(R.id.mg8);
            this.LLLF = (C418740GbQ) view.findViewById(R.id.kh2);
            this.LLL = (C418740GbQ) view.findViewById(R.id.jcl);
            this.LLLFF = (LinearLayout) view.findViewById(R.id.pts);
        } else {
            this.LLJJJ = (C1322110kVd) view.findViewById(R.id.w64);
            this.LLJJJIL = (C19518211Xw) view.findViewById(R.id.w6i);
        }
        C1322110kVd c1322110kVd = this.LLJJJ;
        if (c1322110kVd != null) {
            C201955140j.LIZLLL(C20012313Rx.LIZIZ, "DesignerInfoHandler", "setRadius");
            boolean z = c1322110kVd instanceof C1324800kZy;
            int i = R.dimen.b6;
            if (z) {
                SettingsManager.LIZLLL().getClass();
                if (SettingsManager.LIZ("big_round_corner_radius_change", true)) {
                    i = R.dimen.b7;
                }
                C1324800kZy c1324800kZy = (C1324800kZy) c1322110kVd;
                c1324800kZy.setRectFRadius(c1324800kZy.getResources().getDimension(i));
                int i2 = C1324800kZy.LLJILLL;
                c1324800kZy.setClipStyle(1);
                c1324800kZy.LLJILJIL = true;
            } else {
                C0R06.LIZ(c1322110kVd, R.dimen.b6);
            }
            C0R06.LIZIZ(c1322110kVd, 40);
        }
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.mf_);
        if (linearLayout2 != null) {
            C1652270t69.LIZIZ(48.0f, 48.0f, linearLayout2);
            this.LLJILLL = linearLayout2;
            C1322110kVd c1322110kVd2 = (C1322110kVd) linearLayout2.findViewById(R.id.mfc);
            Drawable drawableInvoke = this.LLILZ.invoke();
            if (drawableInvoke != null) {
                c1322110kVd2.getHierarchy().LJJIFFI(drawableInvoke, InterfaceC1320380kSq.LJI);
            }
            this.LLJJ = c1322110kVd2;
            this.LLJJI = (TextView) linearLayout2.findViewById(R.id.mfe);
            this.LLJJIII = (TextView) linearLayout2.findViewById(R.id.mfb);
            C786410Ut5.R7(linearLayout2, this);
            HandlerHook.viewPost(linearLayout2, new ARunnableS94S0200000_25(this, context, 32));
        }
    }

    @Override // X.InterfaceC1624270sMz
    public final boolean LIZJ(C1627370sRz c1627370sRz) {
        boolean z;
        boolean zLJI = MethodIDManager.LJI(72088);
        Effect effect = c1627370sRz.LIZ;
        this.LLLIIIL = effect;
        if (C1624570sNT.LJIILJJIL(effect)) {
            this.LLJJIJIL = effect;
            LJIIIZ(effect);
            z = true;
        } else {
            LIZ();
            z = false;
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
        return z;
    }

    public final void LJI(boolean z) {
        LIZLLL(false, z);
        if (LJFF().LJJLIIIIJ() > 0) {
            LJFF().LJLLILLLL();
        }
        this.LLLII = false;
        this.LLJ.LIZLLL();
        Effect effect = this.LLLIIIL;
        if (effect == null) {
            effect = null;
        }
        LJIIIZ(effect);
    }

    public final void LJIIIZ(Effect effect) {
        C15O7.LIZJ(new ACallableS253S0200000_25(effect, this, 12)).LJ(new C1698280uIM(this, effect, 2), C15O7.LJIIIIZZ, null);
    }

    public final void LIZLLL(boolean z, boolean z2) {
        float f;
        float f2;
        float f3;
        float f4;
        float fLIZ;
        float fLIZ2;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        long j;
        Scene sceneLLLLIIIILLL;
        Lifecycle lifecycle;
        Lifecycle lifecycle2;
        NavigationScene navigationSceneLIZ;
        FrameLayout frameLayout = this.LLJZIJLIL;
        float[] fArr = new float[2];
        float f10 = 0.0f;
        if (z) {
            f = 0.0f;
        } else {
            f = -C391120FVe.LIZ(C786410Ut5.O3(this.LLIZLLLIL));
        }
        fArr[0] = f;
        if (z) {
            f2 = -C391120FVe.LIZ(C786410Ut5.O3(this.LLIZLLLIL));
        } else {
            f2 = 0.0f;
        }
        fArr[1] = f2;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(frameLayout, "translationX", fArr);
        C21594319fB c21594319fB = this.LLJLLIL;
        float[] fArr2 = new float[2];
        if (z) {
            f3 = 0.0f;
        } else {
            f3 = -C391120FVe.LIZ(C786410Ut5.O3(this.LLIZLLLIL));
        }
        fArr2[0] = f3;
        if (z) {
            f4 = -C391120FVe.LIZ(C786410Ut5.O3(this.LLIZLLLIL));
        } else {
            f4 = 0.0f;
        }
        fArr2[1] = f4;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c21594319fB, "translationX", fArr2);
        LinearLayout linearLayout = this.LLJZ;
        float[] fArr3 = new float[2];
        if (z) {
            fLIZ = C391120FVe.LIZ(C786410Ut5.O3(this.LLIZLLLIL));
        } else {
            fLIZ = 0.0f;
        }
        fArr3[0] = fLIZ;
        if (z) {
            fLIZ2 = 0.0f;
        } else {
            fLIZ2 = C391120FVe.LIZ(C786410Ut5.O3(this.LLIZLLLIL));
        }
        fArr3[1] = fLIZ2;
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(linearLayout, "translationX", fArr3);
        C21594319fB c21594319fB2 = this.LLJLLIL;
        float[] fArr4 = new float[2];
        if (z) {
            f5 = 1.0f;
        } else {
            f5 = 0.0f;
        }
        fArr4[0] = f5;
        if (z) {
            f6 = 0.0f;
        } else {
            f6 = 1.0f;
        }
        fArr4[1] = f6;
        ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(c21594319fB2, "alpha", fArr4);
        FrameLayout frameLayout2 = this.LLJZIJLIL;
        float[] fArr5 = new float[2];
        if (z) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        fArr5[0] = f7;
        if (z) {
            f8 = 0.0f;
        } else {
            f8 = 1.0f;
        }
        fArr5[1] = f8;
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(frameLayout2, "alpha", fArr5);
        LinearLayout linearLayout2 = this.LLJZ;
        float[] fArr6 = new float[2];
        if (z) {
            f9 = 0.0f;
        } else {
            f9 = 1.0f;
        }
        fArr6[0] = f9;
        if (z) {
            f10 = 1.0f;
        }
        fArr6[1] = f10;
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(linearLayout2, "alpha", fArr6);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2, objectAnimatorOfFloat3, objectAnimatorOfFloat4, objectAnimatorOfFloat5, objectAnimatorOfFloat6);
        animatorSet.addListener(new ALAdapterS9S0110000_25(this, z, 2));
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        if (z2) {
            j = 300;
        } else {
            j = 0;
        }
        animatorSet.setDuration(j);
        animatorSet.start();
        LifecycleObserver lifecycleObserver = (LifecycleObserver) this.LLLIILIL.getValue();
        if (lifecycleObserver != null) {
            Scene scene = this.LLJIJIL;
            if (scene != null && (navigationSceneLIZ = C1447800nmM.LIZ(scene)) != null) {
                sceneLLLLIIIILLL = navigationSceneLIZ.LLLLIIIILLL();
            } else {
                sceneLLLLIIIILLL = null;
            }
            if (z) {
                if (sceneLLLLIIIILLL != null && (lifecycle2 = sceneLLLLIIIILLL.getLifecycle()) != null) {
                    lifecycle2.addObserver(lifecycleObserver);
                    return;
                }
                return;
            }
            if (sceneLLLLIIIILLL == null || (lifecycle = sceneLLLLIIIILLL.getLifecycle()) == null) {
                return;
            }
            lifecycle.removeObserver(lifecycleObserver);
        }
    }

    public final void LJII(int i, int i2, String str) {
        C19518211Xw c19518211Xw = this.LLJLILLLLZIIL;
        if (c19518211Xw != null) {
            c19518211Xw.setText(str);
        }
        this.LLJLL = i;
        C19518211Xw c19518211Xw2 = this.LLJLILLLLZIIL;
        if (c19518211Xw2 != null) {
            c19518211Xw2.setBackgroundResource(i2);
        }
    }

    public ViewOnClickListenerC1638020sjA(Function2 function2, Function0 function0, InterfaceC1624480sNK interfaceC1624480sNK, InterfaceC1625410sOp interfaceC1625410sOp, InterfaceC1625220sOW interfaceC1625220sOW, C19GS c19gs, InterfaceC1631100sY0 interfaceC1631100sY0, CreativeModel creativeModel, Scene scene, C1DRG c1drg, FragmentManager fragmentManager) {
        this.LLILLL = function2;
        this.LLILZ = function0;
        this.LLILZIL = interfaceC1624480sNK;
        this.LLILZLL = interfaceC1625410sOp;
        this.LLIZ = interfaceC1625220sOW;
        this.LLIZLLLIL = c19gs;
        this.LLJ = interfaceC1631100sY0;
        this.LLJI = creativeModel;
        this.LLJIJIL = scene;
        this.LLJILJIL = c1drg;
        this.LLJILJILJ = fragmentManager;
    }
}
