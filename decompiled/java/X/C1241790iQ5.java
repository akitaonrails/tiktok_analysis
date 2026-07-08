package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iQ5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1241790iQ5 {
    public final String LIZ;
    public final String LIZIZ;
    public final UrlModel LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1241790iQ5)) {
            return false;
        }
        C1241790iQ5 c1241790iQ5 = (C1241790iQ5) obj;
        return Intrinsics.LJFF(this.LIZ, c1241790iQ5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1241790iQ5.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1241790iQ5.LIZJ);
    }

    public C1241790iQ5(String str, String str2, UrlModel urlModel) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = urlModel;
    }
}
