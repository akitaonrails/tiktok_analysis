package Y;

import X.C0P0T;
import X.C1391600mJi;
import X.C1C7U;
import X.C259800zU;
import X.C450720Hlu;
import X.EnumC1235690iGF;
import android.content.Context;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.comment.poll.PollCreateFragment;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS415S0200000_14;
import kotlin.jvm.internal.AwS550S0100000_6;
import kotlin.jvm.internal.AwS558S0100000_14;
import kotlin.jvm.internal.AwS585S0100000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public class ARunnableS1S0601000_6 implements Runnable {
    public final int $t;
    public int i6;
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
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        int i;
        Integer num;
        if (!((PollCreateFragment) this.l1).isAdded() || !Intrinsics.LJFF(((PollCreateFragment) this.l1).LLJI, (View) this.l2)) {
            ((PollCreateFragment) this.l1).LLJJJJLIIL = false;
            return;
        }
        int height = ((View) this.l2).getHeight();
        if (height <= 0 || height == (i = this.i6)) {
            ((PollCreateFragment) this.l1).LLJJJJLIIL = false;
            return;
        }
        float f = height - i;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair((View) this.l2, Float.valueOf(f)));
        View view = (View) this.l3;
        if (view != null) {
            arrayList.add(new Pair(view, Float.valueOf(-f)));
        }
        if (((View) this.l4).getVisibility() == 0 && (num = (Integer) this.l5) != null) {
            float fIntValue = num.intValue() - ((View) this.l4).getTop();
            if (fIntValue != 0.0f) {
                arrayList.add(new Pair((View) this.l4, Float.valueOf(fIntValue)));
            }
        }
        ((PollCreateFragment) this.l1).kS((View) this.l2, height - this.i6, arrayList, null, null);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [T, X.0P0T] */
    public final void LIZ$1() {
        if (((Lifecycle) this.l0).getCurrentState() == Lifecycle.State.RESUMED) {
            final C259800zU c259800zU = new C259800zU();
            C450720Hlu c450720Hlu = new C450720Hlu((Context) this.l1);
            View viewFindViewById = ((View) this.l2).findViewById(R.id.y74);
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = viewFindViewById;
            c1391600mJi.LIZLLL = EnumC1235690iGF.START;
            c1391600mJi.LJII = 3000L;
            c1391600mJi.LJIJJ = true;
            c450720Hlu.LJIIJ(this.i6);
            Function0 function0 = (Function0) this.l3;
            if (function0 != null) {
                c450720Hlu.LJIIIZ(true, new ACListenerS110S0200000_6(c259800zU, function0, 19));
            }
            Function0 function02 = (Function0) this.l4;
            if (function02 != null) {
                c450720Hlu.LIZJ(new AwS585S0100000_6(function02, (Function0<Unit>) 218));
            }
            Function0 function03 = (Function0) this.l5;
            if (function03 != null) {
                c450720Hlu.LJ(new AwS550S0100000_6(function03, 875));
            }
            c259800zU.element = c450720Hlu.LIZIZ();
            final Lifecycle lifecycle = (Lifecycle) this.l0;
            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.gamora.editor.toolbar.EditToolbarHelperKt$showPhotoModeAutoCutMessageToolTip$2$lifecycleObserver$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_PAUSE && c259800zU.element.isShowing()) {
                        c259800zU.element.dismiss();
                    }
                    lifecycle.removeObserver(this);
                }
            });
            ((C0P0T) c259800zU.element).show();
        }
    }

    public static final void run$0(ARunnableS1S0601000_6 aRunnableS1S0601000_6) {
        boolean zLIZ;
        C1C7U.LIZ("PollCreateFragment@b279.scheduleAddOptionSpring$$inlined$doOnPreDraw$1");
        try {
            aRunnableS1S0601000_6.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PollCreateFragment@b279.scheduleAddOptionSpring$$inlined$doOnPreDraw$1");
    }

    public static final void run$1(ARunnableS1S0601000_6 aRunnableS1S0601000_6) {
        boolean zLIZ;
        C1C7U.LIZ("EditToolbarHelperKt@3637.showPhotoModeAutoCutMessageToolTip$$inlined$postDelayed$2");
        try {
            aRunnableS1S0601000_6.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("EditToolbarHelperKt@3637.showPhotoModeAutoCutMessageToolTip$$inlined$postDelayed$2");
    }

    public ARunnableS1S0601000_6(Context context, View view, Lifecycle lifecycle, AwS415S0200000_14 awS415S0200000_14, AwS558S0100000_14 awS558S0100000_14, AwS415S0200000_14 awS415S0200000_142, int i) {
        this.$t = i;
        this.l0 = lifecycle;
        this.l1 = context;
        this.l2 = view;
        this.i6 = 2131825366;
        this.l3 = awS415S0200000_14;
        this.l4 = awS558S0100000_14;
        this.l5 = awS415S0200000_142;
    }

    public ARunnableS1S0601000_6(View view, PollCreateFragment pollCreateFragment, View view2, int i, View view3, View view4, Integer num, int i2) {
        this.$t = i2;
        this.l0 = view;
        this.l1 = pollCreateFragment;
        this.l2 = view2;
        this.i6 = i;
        this.l3 = view3;
        this.l4 = view4;
        this.l5 = num;
    }
}
