package Y;

import X.C013C;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.ss.android.ugc.profile.business.avatar.ProfileAvatarAssem;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes20.dex */
public class ALAdapterS0S0500001_19 extends AnimatorListenerAdapter {
    public final int $t;
    public float f5 = 0.9f;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationEnd$0(this, animator);
                break;
            case 1:
                onAnimationEnd$1(this, animator);
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$t) {
            case 0:
                onAnimationStart$0(this, animator);
                break;
            case 1:
                onAnimationStart$1(this, animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public static final void onAnimationEnd$0(ALAdapterS0S0500001_19 aLAdapterS0S0500001_19, Animator animator) {
        ((C013C) aLAdapterS0S0500001_19.l0).element = true;
        if (((C013C) aLAdapterS0S0500001_19.l1).element) {
            ((Function0) aLAdapterS0S0500001_19.l2).invoke();
            ProfileAvatarAssem profileAvatarAssem = (ProfileAvatarAssem) aLAdapterS0S0500001_19.l3;
            View view = (View) aLAdapterS0S0500001_19.l4;
            float f = aLAdapterS0S0500001_19.f5;
            profileAvatarAssem.getClass();
            ProfileAvatarAssem.Tp(view, f);
        }
    }

    public static final void onAnimationEnd$1(ALAdapterS0S0500001_19 aLAdapterS0S0500001_19, Animator animator) {
        ((C013C) aLAdapterS0S0500001_19.l0).element = true;
        if (((C013C) aLAdapterS0S0500001_19.l1).element) {
            ((Function0) aLAdapterS0S0500001_19.l2).invoke();
            ProfileAvatarAssem profileAvatarAssem = (ProfileAvatarAssem) aLAdapterS0S0500001_19.l3;
            View view = (View) aLAdapterS0S0500001_19.l4;
            float f = aLAdapterS0S0500001_19.f5;
            profileAvatarAssem.getClass();
            ProfileAvatarAssem.Tp(view, f);
        }
    }

    public static final void onAnimationStart$0(ALAdapterS0S0500001_19 aLAdapterS0S0500001_19, Animator animator) {
        ((C013C) aLAdapterS0S0500001_19.l0).element = false;
    }

    public static final void onAnimationStart$1(ALAdapterS0S0500001_19 aLAdapterS0S0500001_19, Animator animator) {
        ((C013C) aLAdapterS0S0500001_19.l0).element = false;
    }

    public ALAdapterS0S0500001_19(C013C c013c, C013C c013c2, Function0 function0, ProfileAvatarAssem profileAvatarAssem, View view, int i) {
        this.$t = i;
        this.l0 = c013c;
        this.l1 = c013c2;
        this.l2 = function0;
        this.l3 = profileAvatarAssem;
        this.l4 = view;
    }
}
