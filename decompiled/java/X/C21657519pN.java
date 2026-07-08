package X;

import Y.AAListenerS338S0100000_28;
import Y.AAListenerS343S0100000_33;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.19pN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21657519pN extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C21657619pO<T> LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ AbstractC1863890ybT<T> LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21657519pN(int i, C21657619pO c21657619pO, AbstractC1863890ybT abstractC1863890ybT, C118300cf c118300cf) {
        super(0);
        this.LL = c21657619pO;
        this.LLILLJJLI = c118300cf;
        this.LLILLL = abstractC1863890ybT;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C21657619pO<T> c21657619pO = this.LL;
        int i = this.LLILLJJLI.element;
        LinearLayout linearLayout = this.LLILLL;
        int i2 = this.LLILZ;
        c21657619pO.getClass();
        int iLIZ = i - ((int) C21657619pO.LIZ(linearLayout));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        for (Object obj : c21657619pO.LIZJ) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                C1697810uHb.LJIJI();
                throw null;
            }
            if (i3 < i2) {
                arrayList.add(obj);
            } else if (i3 > i2) {
                arrayList2.add(obj);
            }
            i3 = i4;
        }
        ArrayList arrayList3 = new ArrayList();
        float f = iLIZ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(linearLayout, (Property<LinearLayout, Float>) View.TRANSLATION_X, f);
        objectAnimatorOfFloat.addListener(new AAListenerS338S0100000_28(linearLayout, 2));
        arrayList3.add(objectAnimatorOfFloat);
        if (iLIZ <= 0 ? C426750GoL.LIZLLL(c21657619pO.LIZIZ.getContext()) : !C426750GoL.LIZLLL(c21657619pO.LIZIZ.getContext())) {
            f = -f;
        }
        for (Object obj2 : arrayList) {
            arrayList3.add(ObjectAnimator.ofFloat(obj2, (Property<Object, Float>) View.TRANSLATION_X, f));
            arrayList3.add(ObjectAnimator.ofFloat(obj2, (Property<Object, Float>) View.ALPHA, 0.0f));
        }
        for (Object obj3 : arrayList2) {
            arrayList3.add(ObjectAnimator.ofFloat(obj3, (Property<Object, Float>) View.TRANSLATION_X, -f));
            arrayList3.add(ObjectAnimator.ofFloat(obj3, (Property<Object, Float>) View.ALPHA, 0.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.playTogether(arrayList3);
        animatorSet.addListener(new AAListenerS343S0100000_33(c21657619pO, 15));
        animatorSet.start();
        return Unit.LIZ;
    }
}
