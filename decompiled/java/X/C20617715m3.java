package X;

import com.ss.android.ugc.aweme.im.contacts.api.model.IMContact;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.15m3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20617715m3 {
    public final String LIZ;
    public final long LIZIZ;
    public final IMContact LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20617715m3)) {
            return false;
        }
        C20617715m3 c20617715m3 = (C20617715m3) obj;
        return Intrinsics.LJFF(this.LIZ, c20617715m3.LIZ) && this.LIZIZ == c20617715m3.LIZIZ && Intrinsics.LJFF(this.LIZJ, c20617715m3.LIZJ);
    }

    public C20617715m3(String str, long j, IMContact iMContact) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = iMContact;
    }
}
