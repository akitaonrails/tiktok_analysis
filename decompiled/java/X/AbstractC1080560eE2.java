package X;

import android.content.Context;
import android.view.ViewGroup;
import com.bytedance.android.live.layer.BaseLayeredElementManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LayeredElementContext;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0eE2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1080560eE2 extends LayeredElementContext {
    public final BaseLayeredElementManager<? extends LayeredElementContext> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final int LJIIIZ;
    public final float LJIIJ;
    public final boolean LJIIJJI;

    public abstract int LIZ();

    public AbstractC1080560eE2(Context context, ViewGroup viewGroup, DataChannel dataChannel, BaseLayeredElementManager<? extends LayeredElementContext> baseLayeredElementManager) {
        super(context, viewGroup, dataChannel, baseLayeredElementManager);
        this.LIZ = baseLayeredElementManager;
        this.LIZIZ = context.getResources().getDimensionPixelSize(R.dimen.asa);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.asf);
        this.LIZJ = dimensionPixelSize;
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.asg);
        this.LIZLLL = dimensionPixelSize2;
        this.LJ = context.getResources().getDimensionPixelSize(R.dimen.ask);
        this.LJFF = context.getResources().getDimensionPixelSize(R.dimen.asl);
        int dimensionPixelSize3 = context.getResources().getDimensionPixelSize(R.dimen.as8);
        this.LJI = dimensionPixelSize3;
        this.LJII = (((int) C497740JfY.LIZIZ(42.0f)) * 2) + dimensionPixelSize2;
        this.LJIIIIZZ = context.getResources().getDimensionPixelSize(R.dimen.ash);
        this.LJIIIZ = dimensionPixelSize3 + dimensionPixelSize2 + dimensionPixelSize;
        this.LJIIJ = context.getResources().getDimension(R.dimen.atb);
        this.LJIIJJI = C497740JfY.LJJ();
    }
}
