package X;

import X.AbstractC1812110xFx;
import android.app.Activity;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0xFx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public abstract class AbstractC1812110xFx<T extends AbstractC1812110xFx<T>> extends AbstractC1812140xG0<T> {
    public int LIZIZ;
    public Activity LIZJ;
    public long LIZLLL;
    public HashMap<String, String> LJ;
    public EnumC1812050xFr LJFF = EnumC1812050xFr.Default;
    public boolean LJI;

    public abstract T LIZJ();

    public final T LIZLLL(int i) {
        this.LIZIZ = i;
        LIZJ();
        return this;
    }

    public final T LJ(long j) {
        this.LIZLLL = j;
        LIZJ();
        return this;
    }
}
