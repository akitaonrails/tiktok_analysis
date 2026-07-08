package X;

import Y.AAListenerS317S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS550S0100000_6;

/* JADX INFO: renamed from: X.0HAh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C436650HAh extends LinearLayout {
    public final C01GW LL;
    public final C01GW LLILLJJLI;
    public final TuxIconView LLILLL;
    public final TuxIconView LLILZ;
    public boolean LLILZIL;

    private final int getScreenWidth() {
        return ((Number) this.LL.getValue()).intValue();
    }

    public C436650HAh(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LL = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1145));
        this.LLILLJJLI = C452501pT.LIZIZ(new AwS550S0100000_6(context, 1144));
        this.LLILZIL = true;
        View viewInflate = LinearLayout.inflate(context, R.layout.frh, this);
        ((C436680HAk) viewInflate.findViewById(R.id.x5e)).setScrollable(false);
        TuxIconView tuxIconView = (TuxIconView) viewInflate.findViewById(R.id.x5a);
        this.LLILLL = tuxIconView;
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = getScreenWidth();
        }
        TuxIconView tuxIconView2 = (TuxIconView) viewInflate.findViewById(R.id.x5c);
        this.LLILZ = tuxIconView2;
        ViewGroup.LayoutParams layoutParams2 = tuxIconView2.getLayoutParams();
        if (layoutParams2 != null) {
            layoutParams2.width = getScreenWidth();
        }
    }

    public static void LIZIZ(RecyclerView recyclerView, Function1 function1) {
        Bitmap bitmapLIZ;
        if (recyclerView != null) {
            if (recyclerView.isLaidOut() && !recyclerView.isLayoutRequested()) {
                C444880HcU c444880HcU = C0H9N.LIZ;
                try {
                    bitmapLIZ = C19724012Fa.LIZ(recyclerView, Bitmap.Config.ARGB_8888);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    bitmapLIZ = null;
                }
                function1.invoke(bitmapLIZ);
                return;
            }
            recyclerView.addOnLayoutChangeListener(new C0IDO(recyclerView, function1, 1));
        }
    }

    public final void LIZ(View view, long j, Function0<Unit> function0, Function0<Unit> function02) {
        int screenWidth;
        if (((Boolean) this.LLILLJJLI.getValue()).booleanValue()) {
            screenWidth = getScreenWidth();
        } else {
            screenWidth = -getScreenWidth();
        }
        ArrayList arrayList = new ArrayList();
        float f = screenWidth;
        arrayList.add(ObjectAnimator.ofFloat(this.LLILLL, (Property<TuxIconView, Float>) View.TRANSLATION_X, f));
        arrayList.add(ObjectAnimator.ofFloat(this.LLILLL, (Property<TuxIconView, Float>) View.ALPHA, 1.0f, 0.0f));
        arrayList.add(ObjectAnimator.ofFloat(this.LLILZ, (Property<TuxIconView, Float>) View.TRANSLATION_X, f));
        if (view != null) {
            arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f, 1.0f));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setStartDelay(50L);
        animatorSet.setDuration(j);
        animatorSet.setInterpolator(new C21388518n5());
        animatorSet.playTogether(arrayList);
        animatorSet.addListener(new AAListenerS317S0100000_6(function0, 18));
        animatorSet.addListener(new AAListenerS317S0100000_6(function02, 17));
        animatorSet.start();
    }
}
