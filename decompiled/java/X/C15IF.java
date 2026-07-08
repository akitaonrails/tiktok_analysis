package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.choosemusic.fragment.BaseChooseMusicFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15IF, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public abstract class C15IF {
    public final BaseChooseMusicFragment LIZ;
    public final ConstraintLayout LIZIZ;
    public final C990470bsj LIZJ;
    public final C990390bsb LIZLLL;
    public final FrameLayout LJ;

    public C15IF(View view, BaseChooseMusicFragment baseChooseMusicFragment) {
        this.LIZ = baseChooseMusicFragment;
        this.LIZIZ = (ConstraintLayout) view.findViewById(R.id.tpb);
        this.LIZJ = (C990470bsj) view.findViewById(R.id.l44);
        this.LIZLLL = (C990390bsb) view.findViewById(R.id.l1m);
        this.LJ = (FrameLayout) view.findViewById(R.id.evn);
    }
}
