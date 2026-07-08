package X;

import android.view.View;
import kotlin.jvm.internal.AwS554S0100000_10;

/* JADX INFO: renamed from: X.0PCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C641180PCy implements C0PCT<Float> {
    public float LL;
    public float LLILLJJLI;
    public boolean LLILLL;
    public View LLILZ;

    @Override // X.C0PCT
    public final void LIZ() {
    }

    @Override // X.C0PCT
    public final Float LJJ() {
        return Float.valueOf(this.LLILLJJLI);
    }

    @Override // X.C0PCT
    public final Float LJJI() {
        return Float.valueOf(this.LL);
    }

    @Override // X.C0PCT
    public final boolean LJIILIIL() {
        return this.LLILLL;
    }

    @Override // X.C0PCT
    public final void LJI(View view) throws Throwable {
        this.LLILZ = (View) view.getParent().getParent().getParent();
        AwS554S0100000_10 awS554S0100000_10 = new AwS554S0100000_10(this, 937);
        View view2 = this.LLILZ;
        View view3 = null;
        if (view2 == null) {
            view2 = null;
        }
        if (view2.getHeight() <= 0) {
            View view4 = this.LLILZ;
            if (view4 != null) {
                view3 = view4;
            }
            C430110Gtl.LIZIZ(view3, new AwS554S0100000_10(awS554S0100000_10, 936));
            return;
        }
        awS554S0100000_10.invoke();
    }
}
