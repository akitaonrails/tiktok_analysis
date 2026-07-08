package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMUser;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mEz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388670mEz {
    public static final /* synthetic */ int LIZLLL = 0;
    public final IMUser LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1388670mEz)) {
            return false;
        }
        C1388670mEz c1388670mEz = (C1388670mEz) obj;
        if (this.LIZIZ == c1388670mEz.LIZIZ && this.LIZJ == c1388670mEz.LIZJ && Intrinsics.LJFF(this.LIZ.getUid(), c1388670mEz.LIZ.getUid()) && Intrinsics.LJFF(this.LIZ.getDisplayName(), c1388670mEz.LIZ.getDisplayName()) && Intrinsics.LJFF(C1388680mF0.LIZ(this.LIZ), C1388680mF0.LIZ(c1388670mEz.LIZ))) {
            return true;
        }
        return false;
    }

    public C1388670mEz(int i, IMUser iMUser, boolean z) {
        this.LIZ = iMUser;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
