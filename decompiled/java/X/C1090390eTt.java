package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

/* JADX INFO: renamed from: X.0eTt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1090390eTt<T extends ViewGroup.LayoutParams> {
    public T LIZ;
    public int LIZIZ;
    public int LIZJ;

    public Class<? extends ViewGroup.LayoutParams> LIZJ() {
        return ViewGroup.LayoutParams.class;
    }

    public C1090390eTt(T t) {
        LIZIZ(t);
    }

    public void LIZIZ(T t) {
        this.LIZIZ = ((ViewGroup.LayoutParams) t).height;
        this.LIZJ = ((ViewGroup.LayoutParams) t).width;
        this.LIZ = t;
    }

    public boolean LIZ(View view, ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null || this.LIZ != layoutParams || layoutParams.width != this.LIZJ || layoutParams.height != this.LIZIZ) {
            return false;
        }
        return true;
    }
}
