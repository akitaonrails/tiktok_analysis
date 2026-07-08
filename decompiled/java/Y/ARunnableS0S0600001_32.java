package Y;

import X.AnonymousClass1951;
import X.AnonymousClass1954;
import X.C14K9;
import X.C18007073l;
import X.C195C;
import X.C195I;
import X.C195Z;
import X.C1C7U;
import X.C214795194f;
import X.C786410Ut5;
import X.EnumC214943199x;
import android.view.View;

/* JADX INFO: loaded from: classes33.dex */
public class ARunnableS0S0600001_32 implements Runnable {
    public final int $t;
    public float f6;
    public Object l0;
    public Object l1;
    public Object l2;
    public Object l3;
    public Object l4;
    public Object l5;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (!((C214795194f) this.l0).LIZLLL) {
            C786410Ut5.LJLLLLLL(8, (View) this.l1);
        }
        float f = this.f6;
        if (f > 0.0f) {
            C14K9.LJIJ((View) this.l1, f);
        }
        C195Z.LJ((View) this.l1);
        C195Z.LJ((View) this.l2);
        C195I c195i = (C195I) this.l5;
        if (!c195i.LIZLLL && ((C214795194f) this.l3).LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            c195i.LIZ.getOverlay().remove((View) this.l1);
        }
        C18007073l.LIZ((View) this.l1);
        ((Runnable) this.l4).run();
    }

    public final void LIZ$1() {
        if (!((C214795194f) this.l0).LIZLLL) {
            C786410Ut5.LJLLLLLL(8, (View) this.l1);
        }
        float f = this.f6;
        if (f > 0.0f) {
            C14K9.LJIJ((View) this.l1, f);
        }
        C195Z.LJ((View) this.l1);
        C195Z.LJ((View) this.l2);
        C195C c195c = (C195C) this.l3;
        if (!c195c.LIZLLL && ((C214795194f) this.l4).LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            c195c.LIZ.getOverlay().remove((View) this.l1);
        }
        ((Runnable) this.l5).run();
    }

    public final void LIZ$2() {
        if (!((C214795194f) this.l0).LIZLLL) {
            C786410Ut5.LJLLLLLL(8, (View) this.l1);
        }
        float f = this.f6;
        if (f > 0.0f) {
            C14K9.LJIJ((View) this.l1, f);
        }
        C195Z.LJ((View) this.l1);
        C195Z.LJ((View) this.l2);
        AnonymousClass1951 anonymousClass1951 = (AnonymousClass1951) this.l5;
        if (!anonymousClass1951.LIZLLL && ((C214795194f) this.l3).LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            anonymousClass1951.LIZ.getOverlay().remove((View) this.l1);
        }
        ((Runnable) this.l4).run();
    }

    public static final void run$0(ARunnableS0S0600001_32 aRunnableS0S0600001_32) {
        boolean zLIZ;
        C1C7U.LIZ("SafAnimationResourceExecutor@fd05.executePushChangeDelayable$1");
        try {
            aRunnableS0S0600001_32.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SafAnimationResourceExecutor@fd05.executePushChangeDelayable$1");
    }

    public static final void run$1(ARunnableS0S0600001_32 aRunnableS0S0600001_32) {
        boolean zLIZ;
        C1C7U.LIZ("SAANavigationAnimExecutor@1d16.executePushChangeCancelable$animationEndAction$1");
        try {
            aRunnableS0S0600001_32.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SAANavigationAnimExecutor@1d16.executePushChangeCancelable$animationEndAction$1");
    }

    public static final void run$2(ARunnableS0S0600001_32 aRunnableS0S0600001_32) {
        boolean zLIZ;
        C1C7U.LIZ("AnimationOrAnimatorResourceExecutor@ca39.executePushChangeCancelable$1");
        try {
            aRunnableS0S0600001_32.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("AnimationOrAnimatorResourceExecutor@ca39.executePushChangeCancelable$1");
    }

    public static final void run$3(ARunnableS0S0600001_32 aRunnableS0S0600001_32) {
        C214795194f c214795194f = (C214795194f) aRunnableS0S0600001_32.l0;
        View view = (View) aRunnableS0S0600001_32.l1;
        float f = aRunnableS0S0600001_32.f6;
        View view2 = (View) aRunnableS0S0600001_32.l2;
        AnonymousClass1954 anonymousClass1954 = (AnonymousClass1954) aRunnableS0S0600001_32.l3;
        C214795194f c214795194f2 = (C214795194f) aRunnableS0S0600001_32.l4;
        Runnable runnable = (Runnable) aRunnableS0S0600001_32.l5;
        C1C7U.LIZ("AnimationOrAnimatorResourceExecutor2@82db.executePushChangeCancelable$1L");
        if (!c214795194f.LIZLLL) {
            C786410Ut5.LJLLLLLL(8, view);
        }
        if (f > 0.0f) {
            C14K9.LJIJ(view, f);
        }
        C195Z.LJ(view);
        C195Z.LJ(view2);
        if (!anonymousClass1954.LIZLLL && c214795194f2.LIZJ.value < EnumC214943199x.VIEW_CREATED.value) {
            anonymousClass1954.LIZ.getOverlay().remove(view);
        }
        runnable.run();
        C1C7U.LIZIZ("AnimationOrAnimatorResourceExecutor2@82db.executePushChangeCancelable$1L");
    }

    public ARunnableS0S0600001_32(Object obj, Object obj2, Object obj3, float f, Object obj4, Object obj5, Object obj6, int i) {
        this.$t = i;
        this.l5 = obj;
        this.l0 = obj2;
        this.l1 = obj3;
        this.f6 = f;
        this.l2 = obj4;
        this.l3 = obj5;
        this.l4 = obj6;
    }
}
