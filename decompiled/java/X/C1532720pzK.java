package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0pzK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1532720pzK {
    public static final LinkedHashMap<String, String> LJII;
    public static final Uri LJIIIIZZ;
    public final String LIZ;
    public final String LIZIZ;
    public LinkedHashMap<String, String> LIZJ;
    public final Set<String> LIZLLL;
    public final C1531860pxw LJ;
    public EnumC838370Wuh LJFF;
    public Uri LJI;

    static {
        new C1532730pzL();
        LJII = new LinkedHashMap<>();
        LJIIIIZZ = Uri.EMPTY;
    }

    public final C1531860pxw LIZ() {
        C1531860pxw c1531860pxw = this.LJ;
        if (c1531860pxw != null) {
            return c1531860pxw;
        }
        LinkedHashMap<String, String> linkedHashMapLIZIZ = LIZIZ();
        if (linkedHashMapLIZIZ != null) {
            return new C1531860pxw(linkedHashMapLIZIZ, this.LIZLLL);
        }
        return null;
    }

    public final LinkedHashMap<String, String> LIZIZ() {
        LinkedHashMap<String, String> linkedHashMap = this.LIZJ;
        if (linkedHashMap != null) {
            return linkedHashMap;
        }
        Uri uriLIZLLL = LIZLLL();
        if (uriLIZLLL == null) {
            return null;
        }
        LinkedHashMap<String, String> linkedHashMapLIZ = C1945807jk.LIZ(uriLIZLLL);
        this.LIZJ = linkedHashMapLIZ;
        return linkedHashMapLIZ;
    }

    public final Uri LIZLLL() {
        Object obj;
        Uri uri;
        if (this.LJI == null) {
            String str = this.LIZ;
            if (!(!a0.LJJJIL(str))) {
                str = null;
            }
            if (str != null) {
                try {
                    Uri uri2 = UriProtector.parse(str);
                    boolean zIsHierarchical = uri2.isHierarchical();
                    Uri uri3 = uri2;
                    if (!zIsHierarchical) {
                        uri3 = null;
                    }
                    C189200o6.m2constructorimpl(uri3);
                    obj = uri3;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    obj = c098200Yq;
                }
                boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
                Object obj2 = obj;
                if (zM7isFailureimpl) {
                    obj2 = null;
                }
                uri = (Uri) obj2;
            } else {
                uri = null;
            }
            this.LJI = uri;
            if (uri == null) {
                this.LJI = LJIIIIZZ;
            }
        }
        Uri uri4 = this.LJI;
        if (uri4 != LJIIIIZZ) {
            return uri4;
        }
        return null;
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public final String LIZJ(String str) {
        LinkedHashMap<String, String> linkedHashMapLIZIZ = LIZIZ();
        if (linkedHashMapLIZIZ != null) {
            return linkedHashMapLIZIZ.get(str);
        }
        return null;
    }

    public final boolean equals(Object obj) {
        Set<String> set;
        boolean z;
        boolean z2 = false;
        if (!(obj instanceof C1532720pzK)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C1532720pzK c1532720pzK = (C1532720pzK) obj;
        if (!Intrinsics.LJFF(this.LIZIZ, c1532720pzK.LIZIZ)) {
            return false;
        }
        EnumC838370Wuh enumC838370Wuh = this.LJFF;
        EnumC838370Wuh enumC838370Wuh2 = EnumC838370Wuh.IGNORE;
        if (enumC838370Wuh == enumC838370Wuh2 || c1532720pzK.LJFF == enumC838370Wuh2) {
            return true;
        }
        Set<String> set2 = this.LIZLLL;
        if ((set2 == null || set2.isEmpty()) && (((set = c1532720pzK.LIZLLL) == null || set.isEmpty()) && C1531890pxz.LIZ(this.LJ) && C1531890pxz.LIZ(c1532720pzK.LJ))) {
            if (Intrinsics.LJFF(this.LIZ, c1532720pzK.LIZ)) {
                return true;
            }
            if (this.LIZJ == null && c1532720pzK.LIZJ == null) {
                return false;
            }
        }
        if (this.LIZJ == null && c1532720pzK.LIZJ == null && Intrinsics.LJFF(this.LIZ, c1532720pzK.LIZ)) {
            return true;
        }
        C1531860pxw c1531860pxwLIZ = LIZ();
        C1531860pxw c1531860pxwLIZ2 = c1532720pzK.LIZ();
        if (c1531860pxwLIZ == null) {
            if (c1531860pxwLIZ2 != null) {
                EnumC838370Wuh enumC838370Wuh3 = this.LJFF;
                EnumC838370Wuh enumC838370Wuh4 = EnumC838370Wuh.STRICT;
                if (enumC838370Wuh3 != enumC838370Wuh4 && c1532720pzK.LJFF != enumC838370Wuh4) {
                    z = false;
                } else {
                    z = true;
                }
                if (!c1531860pxwLIZ2.LIZIZ(c1531860pxwLIZ, z)) {
                    return false;
                }
            }
            return true;
        }
        EnumC838370Wuh enumC838370Wuh5 = this.LJFF;
        EnumC838370Wuh enumC838370Wuh6 = EnumC838370Wuh.STRICT;
        if (enumC838370Wuh5 == enumC838370Wuh6 || c1532720pzK.LJFF == enumC838370Wuh6) {
            z2 = true;
        }
        return c1531860pxwLIZ.LIZIZ(c1531860pxwLIZ2, z2);
    }

    public C1532720pzK(String str, String str2, Uri uri, LinkedHashMap<String, String> linkedHashMap, Set<String> set, EnumC838370Wuh enumC838370Wuh, C1531860pxw c1531860pxw) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = linkedHashMap;
        this.LIZLLL = set;
        this.LJ = c1531860pxw;
        this.LJFF = enumC838370Wuh;
        this.LJI = uri;
    }
}
