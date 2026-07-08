package X;

import Y.AAListenerS269S0200000_17;
import Y.AUListenerS224S0200000_17;
import Y.AUListenerS266S0100000_17;
import android.animation.AnimatorSet;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0fG5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1120270fG5 {
    public final Bitmap LIZIZ;
    public final boolean LIZJ;
    public float LJFF;
    public float LJI;
    public int LJII;
    public int LJIIIIZZ;
    public final AnimatorSet LJIIIZ;
    public final C1120290fG7 LJIIJ;
    public final Bitmap LIZ = null;
    public final RectF LIZLLL = new RectF();
    public final RectF LJ = new RectF();

    public C1120270fG5(C1120240fG2 c1120240fG2, Bitmap bitmap, PointF pointF, PointF pointF2, PointF pointF3, boolean z) {
        C1120290fG7 c1120290fG7LIZIZ;
        this.LIZIZ = bitmap;
        this.LIZJ = z;
        this.LJFF = 1.0f;
        this.LJII = 255;
        int iLIZIZ = C814420VxA.LIZIZ((c1120240fG2.getTotalDurationOptimization() / LSPassThroughRecordSizeConfig.DEFAULT) * 60);
        if (z) {
            c1120290fG7LIZIZ = c1120240fG2.LLJJIII.LIZIZ();
        } else {
            c1120290fG7LIZIZ = c1120240fG2.LLJJI.LIZIZ();
        }
        this.LJIIJ = c1120290fG7LIZIZ == null ? new C1120290fG7(pointF, pointF3, pointF2, iLIZIZ) : c1120290fG7LIZIZ;
        int visibility = c1120240fG2.getVisibility();
        c1120240fG2.setVisibility(0);
        C1602160rnK.LIZIZ(visibility, 0, c1120240fG2);
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        C1120340fGC c1120340fGCLIZ = C1120300fG8.LIZ(0, iLIZIZ - 1);
        c1120340fGCLIZ.LIZ(c1120240fG2.LLJIJIL.LIZJ);
        c1120340fGCLIZ.setDuration(c1120240fG2.getTotalDurationOptimization());
        c1120340fGCLIZ.addUpdateListener(new AUListenerS224S0200000_17(this, c1120240fG2, 9));
        c1120340fGCLIZ.addListener(new AAListenerS269S0200000_17(c1120240fG2, this, 6));
        arrayList.add(c1120340fGCLIZ);
        this.LJFF = 0.0f;
        this.LJII = 0;
        this.LJI = 1.0f;
        this.LJIIIIZZ = 0;
        if (!c1120240fG2.LLJIJIL.LJ) {
            C1120340fGC c1120340fGCLIZ2 = C1120300fG8.LIZ(c1120240fG2.getAppearAlphaStart(), c1120240fG2.getAppearAlphaEnd());
            c1120340fGCLIZ2.LIZ(c1120240fG2.LLJIJIL.LIZJ);
            c1120340fGCLIZ2.setDuration(c1120240fG2.getIconAlphaDurationOptimization());
            c1120340fGCLIZ2.addUpdateListener(new AUListenerS266S0100000_17(this, 24));
            arrayList.add(c1120340fGCLIZ2);
            long jNextInt = AbstractC19994813Le.Default.nextInt((int) (c1120240fG2.getTotalDurationOptimization() / 3.0f), (int) (c1120240fG2.getTotalDurationOptimization() * 0.55f));
            C1120340fGC c1120340fGCLIZ3 = C1120300fG8.LIZ(c1120240fG2.getDisAppearAlphaStart(), 0);
            c1120340fGCLIZ3.LIZ(c1120240fG2.LLJIJIL.LIZJ);
            c1120340fGCLIZ3.setDuration(c1120240fG2.getTotalDurationOptimization() - jNextInt);
            c1120340fGCLIZ3.setStartDelay(jNextInt);
            c1120340fGCLIZ3.addUpdateListener(new AUListenerS266S0100000_17(this, 25));
            arrayList.add(c1120340fGCLIZ3);
        } else {
            this.LJIIIIZZ = c1120240fG2.LIZ(255);
        }
        animatorSet.playTogether(arrayList);
        animatorSet.start();
        this.LJIIIZ = animatorSet;
    }
}
