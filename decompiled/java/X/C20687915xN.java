package X;

import Y.ATListenerS463S0100000_31;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.15xN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20687915xN {
    public final Context LIZ;
    public final ViewGroup LIZIZ;
    public final View LIZJ;

    public final void LIZ(Function0<Unit> function0) {
        C786410Ut5.LJLLLLLL(0, this.LIZJ);
        if (this.LIZJ.getAnimation() == null) {
            this.LIZJ.startAnimation(AnimationUtils.loadAnimation(this.LIZ, R.anim.by));
        }
        function0.invoke();
    }

    public final void LIZIZ(Function0<Unit> function0) {
        this.LIZJ.clearAnimation();
        C786410Ut5.LJLLLLLL(8, this.LIZJ);
        function0.invoke();
    }

    public C20687915xN(Context context, ViewGroup viewGroup) {
        this.LIZ = context;
        this.LIZIZ = viewGroup;
        this.LIZJ = viewGroup.findViewById(R.id.vzd);
        viewGroup.setOnTouchListener(new ATListenerS463S0100000_31(this, 5));
    }
}
