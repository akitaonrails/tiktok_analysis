package X;

import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS198S0000000_11;

/* JADX INFO: renamed from: X.0Rqm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708540Rqm implements InterfaceC440740HQa {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS198S0000000_11.get$arr$(347));

    public static boolean LIZIZ(float f) {
        if (Math.abs(f) < 0.05f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.InterfaceC440740HQa
    public final void LIZ(View view, float f) {
        C708550Rqn c708550Rqn;
        float f2;
        float f3;
        C708550Rqn c708550Rqn2;
        Object objRemove;
        C708550Rqn c708550Rqn3;
        View viewFindViewById = view.findViewById(R.id.fx4);
        Object tag = view.getTag();
        if (tag instanceof C708550Rqn) {
            c708550Rqn = (C708550Rqn) tag;
        } else {
            c708550Rqn = null;
        }
        if (c708550Rqn != null) {
            f2 = c708550Rqn.LIZ;
            f3 = c708550Rqn.LIZIZ;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        if (f2 < 0.0f) {
            if (f < f2) {
                if (f <= -0.2d && f >= -0.4f) {
                    C786410Ut5.T4(viewFindViewById, (((f - (-0.4f)) / 0.2f) * 1.0f) + 0.0f);
                }
            } else if (LIZIZ(f)) {
                viewFindViewById.animate().alpha(1.0f).setDuration(300L).start();
            } else if (Math.abs(Math.abs(f3) - 1.0f) < 0.1f) {
                C786410Ut5.T4(viewFindViewById, 0.0f);
            }
        } else if (f2 > 0.0f) {
            if (f < f2) {
                if (LIZIZ(f)) {
                    viewFindViewById.animate().alpha(1.0f).setDuration(300L).start();
                } else if (Math.abs(Math.abs(f3) - 1.0f) < 0.1f) {
                    C786410Ut5.T4(viewFindViewById, 0.0f);
                }
            } else {
                double d = f;
                if (0.2d <= d && d <= 0.4d) {
                    C786410Ut5.T4(viewFindViewById, (((0.4f - f) / 0.2f) * 1.0f) + 0.0f);
                }
            }
        }
        if (!Float.isInfinite(f)) {
            Object tag2 = view.getTag();
            if (!(tag2 instanceof C708550Rqn) || (c708550Rqn3 = (C708550Rqn) tag2) == null) {
                C0RD2 c0rd2 = (C0RD2) this.LIZ.getValue();
                if (c0rd2.LIZJ.isEmpty()) {
                    objRemove = c0rd2.LIZIZ.invoke();
                } else {
                    objRemove = ListProtector.remove(c0rd2.LIZJ, 0);
                }
                c708550Rqn3 = (C708550Rqn) objRemove;
                c708550Rqn3.LIZ = f;
            }
            float f4 = c708550Rqn3.LIZIZ;
            if (f4 == Float.POSITIVE_INFINITY) {
                view.setTag(new C708550Rqn(f, f));
            } else {
                view.setTag(new C708550Rqn(f, f4));
            }
        }
        if (LIZIZ(f) || Float.isInfinite(f) || LIZIZ(Math.abs(f) - 1.0f)) {
            Object tag3 = view.getTag();
            if ((tag3 instanceof C708550Rqn) && (c708550Rqn2 = (C708550Rqn) tag3) != null) {
                c708550Rqn2.LIZ = 0.0f;
                c708550Rqn2.LIZIZ = Float.POSITIVE_INFINITY;
                C0RD2 c0rd22 = (C0RD2) this.LIZ.getValue();
                if (c0rd22.LIZJ.size() < c0rd22.LIZ) {
                    c0rd22.LIZJ.add((T) c708550Rqn2);
                }
            }
            view.setTag(null);
        }
    }
}
