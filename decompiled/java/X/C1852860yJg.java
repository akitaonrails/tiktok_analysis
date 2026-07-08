package X;

import com.ss.android.ugc.aweme.tako.multipletemplate.gallery.TikTokMediaModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yJg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852860yJg {
    public final List<TikTokMediaModel> LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public C1852860yJg() {
        this(null, 0 == true ? 1 : 0, false, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852860yJg)) {
            return false;
        }
        C1852860yJg c1852860yJg = (C1852860yJg) obj;
        return Intrinsics.LJFF(this.LIZ, c1852860yJg.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1852860yJg.LIZIZ) && this.LIZJ == c1852860yJg.LIZJ;
    }

    public static C1852860yJg LIZ(C1852860yJg c1852860yJg, List list) {
        String str = c1852860yJg.LIZIZ;
        boolean z = c1852860yJg.LIZJ;
        c1852860yJg.getClass();
        return new C1852860yJg(list, str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1852860yJg(List<? extends TikTokMediaModel> list, String str, boolean z) {
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = z;
    }

    public /* synthetic */ C1852860yJg(List list, String str, boolean z, int i) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? true : z);
    }
}
