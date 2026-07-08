package X;

import Y.ALAdapterS6S0100000_9;
import Y.AUListenerS254S0100000_4;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import com.ss.android.ugc.aweme.feed.assem.addyours.AddYoursEntranceButtonAssem;
import com.ss.android.ugc.aweme.inbox.bulletin.assem.bottom.BulletinCreatorInputBaseAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0P4J, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public class C0P4J implements View.OnLayoutChangeListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.$t) {
            case 0:
                onLayoutChange$0(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 1:
                onLayoutChange$1(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
            case 2:
                onLayoutChange$2(this, view, i, i2, i3, i4, i5, i6, i7, i8);
                break;
        }
    }

    public C0P4J(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onLayoutChange$0(C0P4J c0p4j, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(c0p4j);
        C2276471E8n.LIZIZ.d("AddYoursEntranceButtonAssem", "safelyStartAnimator, doOnNextLayout");
        ((AddYoursEntranceButtonAssem) c0p4j.l0).Bp();
        AnimatorSet animatorSet = ((AddYoursEntranceButtonAssem) c0p4j.l0).LLLI;
        if (animatorSet != null) {
            animatorSet.start();
        }
    }

    public static final void onLayoutChange$1(C0P4J c0p4j, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        BulletinCreatorInputBaseAssem bulletinCreatorInputBaseAssem = (BulletinCreatorInputBaseAssem) c0p4j.l0;
        if (!bulletinCreatorInputBaseAssem.LLJLILLLLZIIL || (i9 = i4 - i2) <= 0 || i9 == bulletinCreatorInputBaseAssem.LLJLL) {
            return;
        }
        bulletinCreatorInputBaseAssem.LLJLL = i9;
        View viewFindViewById = bulletinCreatorInputBaseAssem.LJJIJL().findViewById(R.id.evm);
        if (viewFindViewById == null || viewFindViewById.getHeight() == i9) {
            return;
        }
        BulletinCreatorInputBaseAssem bulletinCreatorInputBaseAssem2 = (BulletinCreatorInputBaseAssem) c0p4j.l0;
        bulletinCreatorInputBaseAssem2.getClass();
        if (viewFindViewById.getHeight() != i9) {
            ValueAnimator valueAnimator = bulletinCreatorInputBaseAssem2.LLJLLIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            int height = viewFindViewById.getHeight();
            if (height < 0) {
                height = 0;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(height, i9);
            valueAnimatorOfInt.setDuration(240L);
            valueAnimatorOfInt.setInterpolator(new C12DM());
            valueAnimatorOfInt.addUpdateListener(new AUListenerS254S0100000_4(viewFindViewById, 0));
            valueAnimatorOfInt.addListener(new ALAdapterS6S0100000_9(bulletinCreatorInputBaseAssem2, 3));
            valueAnimatorOfInt.start();
            bulletinCreatorInputBaseAssem2.LLJLLIL = valueAnimatorOfInt;
        }
    }

    public static final void onLayoutChange$2(C0P4J c0p4j, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i4 - i2 != i8 - i6) {
            ((Function0) c0p4j.l0).invoke();
        }
    }
}
