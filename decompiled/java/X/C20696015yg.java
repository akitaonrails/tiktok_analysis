package X;

import com.ss.android.ugc.aweme.setting.serverpush.model.PushCategory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15yg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20696015yg {
    public final String LIZ;
    public final List<AbstractC20694715yT> LIZIZ;
    public final PushCategory LIZJ;
    public final String LIZLLL;
    public final boolean LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20696015yg)) {
            return false;
        }
        C20696015yg c20696015yg = (C20696015yg) obj;
        return Intrinsics.LJFF(this.LIZ, c20696015yg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20696015yg.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c20696015yg.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c20696015yg.LIZLLL) && this.LJ == c20696015yg.LJ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20696015yg(String str, List<? extends AbstractC20694715yT> list, PushCategory pushCategory, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = pushCategory;
        this.LIZLLL = str2;
        this.LJ = z;
    }
}
