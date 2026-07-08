package X;

import com.ss.ugc.android.editor.base.resource.ResourceItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E0f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C357590E0f {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final Integer LIZLLL;
    public final Integer LJ;
    public final String LJFF;
    public final List<ResourceItem> LJI;

    /* JADX WARN: Multi-variable type inference failed */
    public C357590E0f() {
        this(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C357590E0f)) {
            return false;
        }
        C357590E0f c357590E0f = (C357590E0f) obj;
        return Intrinsics.LJFF(this.LIZ, c357590E0f.LIZ) && Intrinsics.LJFF(this.LIZIZ, c357590E0f.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c357590E0f.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c357590E0f.LIZLLL) && Intrinsics.LJFF(this.LJ, c357590E0f.LJ) && Intrinsics.LJFF(this.LJFF, c357590E0f.LJFF) && Intrinsics.LJFF(this.LJI, c357590E0f.LJI);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.LJ;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.LJFF;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<ResourceItem> list = this.LJI;
        return iHashCode6 + (list != null ? list.hashCode() : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C357590E0f(String str, String str2, String str3, Integer num, Integer num2, String str4, List<? extends ResourceItem> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = num;
        this.LJ = num2;
        this.LJFF = str4;
        this.LJI = list;
    }

    public /* synthetic */ C357590E0f(String str, String str2, String str3, Integer num, Integer num2, String str4, List list, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : str4, (i & 64) == 0 ? list : null);
    }
}
