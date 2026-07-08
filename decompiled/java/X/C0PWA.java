package X;

import android.view.View;
import androidx.lifecycle.LifecycleOwner;

/* JADX INFO: renamed from: X.0PWA, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PWA {
    public final LifecycleOwner LIZ;
    public final View LIZIZ;
    public final Object LIZJ;
    public final Integer LIZLLL;
    public final C646080PVu LJ;
    public final Integer LJFF;
    public final C646120PVy LJI;

    public C0PWA() {
        this(127, null, null, null, null, null, null, null);
    }

    public C0PWA(int i, View view, LifecycleOwner lifecycleOwner, C646120PVy c646120PVy, C646080PVu c646080PVu, Integer num, Integer num2, Object obj) {
        lifecycleOwner = (i & 1) != 0 ? null : lifecycleOwner;
        view = (i & 2) != 0 ? null : view;
        obj = (i & 4) != 0 ? null : obj;
        num = (i & 8) != 0 ? null : num;
        c646080PVu = (i & 16) != 0 ? null : c646080PVu;
        num2 = (i & 32) != 0 ? null : num2;
        c646120PVy = (i & 64) != 0 ? null : c646120PVy;
        this.LIZ = lifecycleOwner;
        this.LIZIZ = view;
        this.LIZJ = obj;
        this.LIZLLL = num;
        this.LJ = c646080PVu;
        this.LJFF = num2;
        this.LJI = c646120PVy;
    }
}
