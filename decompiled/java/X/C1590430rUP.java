package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.base.ui.CommonPageFragment;

/* JADX INFO: renamed from: X.0rUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1590430rUP {
    public final Class<? extends CommonPageFragment> LIZ;
    public final String LIZIZ;
    public final Bundle LIZJ;
    public float LIZLLL;
    public final int LJ;

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + this.LJ;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1590430rUP) {
            C1590430rUP c1590430rUP = (C1590430rUP) obj;
            if (this.LIZIZ.equals(c1590430rUP.LIZIZ) && this.LJ == c1590430rUP.LJ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C1590430rUP(Class<? extends CommonPageFragment> cls, String str, int i, float f, Bundle bundle) {
        this.LIZ = cls;
        this.LIZIZ = str;
        this.LIZJ = bundle;
        this.LJ = i;
        this.LIZLLL = f;
    }
}
