package X;

import android.view.View;
import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0R73, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R73 {
    public static final /* synthetic */ int LJI = 0;
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final List<C0R73> LJFF = new ArrayList();

    public final int LIZ(C0R73 c0r73) {
        if (!Intrinsics.LJFF(this.LIZ, c0r73.LIZ)) {
            return -1;
        }
        if (!equals(c0r73) || ((ArrayList) this.LJFF).size() != ((ArrayList) c0r73.LJFF).size()) {
            return 1;
        }
        int size = ((ArrayList) this.LJFF).size();
        for (int i = 0; i < size; i++) {
            int iLIZ = ((C0R73) ListProtector.get(this.LJFF, i)).LIZ((C0R73) ListProtector.get(c0r73.LJFF, i));
            if (iLIZ != 0) {
                return iLIZ;
            }
        }
        return 0;
    }

    public final boolean LIZIZ(View view) {
        int i;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        if (this.LIZJ != view.getHeight() || this.LIZLLL != view.getWidth()) {
            return false;
        }
        int i2 = this.LJ;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
            i = marginLayoutParams.bottomMargin;
        } else {
            i = 0;
        }
        if (i2 != i || this.LIZIZ != view.getVisibility()) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0R73)) {
            return false;
        }
        C0R73 c0r73 = (C0R73) obj;
        if (!Intrinsics.LJFF(this.LIZ, c0r73.LIZ)) {
            return false;
        }
        int i = this.LIZIZ;
        if (i != 0 && c0r73.LIZIZ != 0) {
            return true;
        }
        if (this.LIZJ != c0r73.LIZJ || this.LIZLLL != c0r73.LIZLLL || this.LJ != c0r73.LJ || i != c0r73.LIZIZ) {
            return false;
        }
        return true;
    }

    public C0R73(String str, int i, int i2, int i3, int i4) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }
}
