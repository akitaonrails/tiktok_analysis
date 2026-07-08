package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.191B, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public class C191B extends C191C {
    public final ArrayList<C191C> LLILZIL = new ArrayList<>();

    @Override // X.C191C
    public final void LIZIZ(boolean z) {
        Iterator<C191C> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZIZ(z);
        }
    }

    @Override // X.C191C
    public final C191E LIZJ(boolean z) {
        C191D c191d = new C191D();
        Iterator<C191C> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            ((ArrayList) c191d.LJ).add(it2.next().LIZJ(z));
        }
        return c191d;
    }

    @Override // X.C191C
    public final Animator LIZLLL(boolean z) {
        ArrayList arrayList = new ArrayList();
        Iterator<C191C> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            arrayList.add(it2.next().LIZLLL(z));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        return animatorSet;
    }

    public final void LJI(C191C c191c) {
        this.LLILZIL.add(c191c);
    }

    @Override // X.C191C
    public final void LIZ(View view, View view2, View view3) {
        super.LIZ(view, view2, view3);
        Iterator<C191C> it2 = this.LLILZIL.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(view, view2, view3);
        }
    }
}
