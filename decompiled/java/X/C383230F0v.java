package X;

import Y.ALAdapterS2S0100000_5;
import Y.AUListenerS252S0100000_1;
import Y.AUListenerS255S0100000_5;
import Y.AUListenerS64S0101000_2;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0F0v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383230F0v {
    public boolean LIZ;
    public final C01GW LIZIZ;
    public final C01GW LIZJ;
    public final C01GW LIZLLL;
    public final C01GW LJ;
    public final C383200F0s LJFF;

    public final void LIZ(boolean z) {
        long j;
        if (!this.LIZ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        final int height = ((View) this.LIZJ.getValue()).getHeight();
        final View view = (View) this.LIZIZ.getValue();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(-C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)), 0.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.0F0w
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                View view2 = view;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = (int) (height + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                C786410Ut5.W5(view2, layoutParams);
            }
        });
        arrayList.add(valueAnimatorOfFloat);
        View view2 = (View) this.LJ.getValue();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS255S0100000_5(view2, 30));
        arrayList.add(valueAnimatorOfFloat2);
        AnimatorSet animatorSet = new AnimatorSet();
        if (z) {
            j = 1000;
        } else {
            j = 0;
        }
        animatorSet.setDuration(j);
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new ALAdapterS2S0100000_5(this, 25));
        animatorSet.start();
    }

    public C383230F0v(View view, C383040F0c c383040F0c) {
        this.LIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(view, 1190));
        this.LIZJ = C452501pT.LIZIZ(new AwS549S0100000_5(view, 1191));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS549S0100000_5(view, 1193));
        this.LIZLLL = c01gwLIZIZ;
        this.LJ = C452501pT.LIZIZ(new AwS549S0100000_5(view, 1192));
        C383200F0s c383200F0s = new C383200F0s(new AwS584S0100000_5(c383040F0c, 953));
        this.LJFF = c383200F0s;
        RecyclerView recyclerView = (RecyclerView) c01gwLIZIZ.getValue();
        recyclerView.setAdapter(c383200F0s);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 0, false));
        recyclerView.addItemDecoration(new C0DXR() { // from class: X.03In
            public final int LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12));

            @Override // X.C0DXR
            public final void LIZIZ(Rect rect, View view2, RecyclerView recyclerView2, C21673919s1 c21673919s1) {
                if (recyclerView2.getChildAdapterPosition(view2) == 0) {
                    rect.left = this.LL;
                }
                rect.right = this.LL;
            }
        });
        recyclerView.setClipToPadding(false);
    }

    public final void LIZIZ(int i, List list) {
        C383200F0s c383200F0s = this.LJFF;
        ((ArrayList) c383200F0s.LLILLJJLI).clear();
        ((ArrayList) c383200F0s.LLILLJJLI).addAll(list);
        c383200F0s.LLILLL = i;
        c383200F0s.LLILZ = false;
        c383200F0s.notifyDataSetChanged();
        if (list.isEmpty()) {
            LIZ(true);
            return;
        }
        if (this.LIZ) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int height = ((View) this.LIZJ.getValue()).getHeight();
        View view = (View) this.LIZIZ.getValue();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, -C814420VxA.LIZIZ(C418440Gaw.LIZIZ(44)));
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS64S0101000_2(height, view, 1));
        arrayList.add(valueAnimatorOfFloat);
        View view2 = (View) this.LJ.getValue();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.addUpdateListener(new AUListenerS252S0100000_1(view2, 1));
        arrayList.add(valueAnimatorOfFloat2);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(1000L);
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new ALAdapterS2S0100000_5(this, 26));
        animatorSet.start();
    }
}
