package X;

import android.content.res.Resources;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0R06, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0R06 {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(353));

    public static void LIZ(C1322110kVd c1322110kVd, int i) {
        if (!((Boolean) LIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            float dimension = c1322110kVd.getContext().getResources().getDimension(i);
            C1331100kk8 c1331100kk8 = new C1331100kk8();
            c1331100kk8.LJII(dimension);
            c1322110kVd.getHierarchy().LJJIII(c1331100kk8);
            if (!C0R07.LIZ()) {
                final Float fValueOf = Float.valueOf(dimension);
                c1322110kVd.setOutlineProvider(new ViewOutlineProvider(fValueOf) { // from class: X.0R05
                    public final Float LIZ;
                    public final Float LIZIZ = null;
                    public final Float LIZJ = null;
                    public final Float LIZLLL = null;
                    public final Float LJ = null;
                    public final boolean LJFF = false;
                    public final boolean LJI = false;
                    public final boolean LJII = false;
                    public final boolean LJIIIIZZ = false;
                    public final boolean LJIIIZ = false;
                    public final boolean LJIIJ = false;
                    public final boolean LJIIJJI = false;
                    public final boolean LJIIL = false;

                    {
                        this.LIZ = fValueOf;
                    }

                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        float fFloatValue;
                        int width = view.getWidth();
                        int height = view.getHeight();
                        Float f = this.LIZ;
                        if (f != null) {
                            outline.setRoundRect(0, 0, width, height, f.floatValue());
                            return;
                        }
                        Float f2 = this.LIZIZ;
                        if (f2 == null && (f2 = this.LIZJ) == null && (f2 = this.LIZLLL) == null && (f2 = this.LJ) == null) {
                            fFloatValue = 0.0f;
                        } else {
                            fFloatValue = f2.floatValue();
                        }
                        if (this.LJFF) {
                            outline.setRoundRect(0, 0, width, height + ((int) fFloatValue), fFloatValue);
                            return;
                        }
                        if (this.LJII) {
                            outline.setRoundRect(0, -((int) fFloatValue), width, height, fFloatValue);
                            return;
                        }
                        if (this.LJIIIIZZ) {
                            outline.setRoundRect(0, 0, width + ((int) fFloatValue), height, fFloatValue);
                            return;
                        }
                        if (this.LJI) {
                            outline.setRoundRect(-((int) fFloatValue), 0, width, height, fFloatValue);
                            return;
                        }
                        if (this.LJIIIZ) {
                            int i2 = (int) fFloatValue;
                            outline.setRoundRect(0, 0, width + i2, height + i2, fFloatValue);
                            return;
                        }
                        if (this.LJIIL) {
                            int i3 = (int) fFloatValue;
                            outline.setRoundRect(0, -i3, width + i3, height, fFloatValue);
                        } else if (this.LJIIJ) {
                            int i4 = (int) fFloatValue;
                            outline.setRoundRect(-i4, 0, width, height + i4, fFloatValue);
                        } else {
                            if (!this.LJIIJJI) {
                                return;
                            }
                            int i5 = -((int) fFloatValue);
                            outline.setRoundRect(i5, i5, width, height, fFloatValue);
                        }
                    }
                });
                c1322110kVd.setClipToOutline(true);
            }
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJFF(e, "EffectIconUtil: resource not found!");
        }
    }

    public static void LIZIZ(C1322110kVd c1322110kVd, int i) {
        if (!((Boolean) LIZ.getValue()).booleanValue()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = c1322110kVd.getLayoutParams();
        int i2 = (int) (i * c1322110kVd.getContext().getResources().getDisplayMetrics().density);
        layoutParams.height = i2;
        layoutParams.width = i2;
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1322110kVd);
        c1322110kVd.setLayoutParams(layoutParams);
    }
}
