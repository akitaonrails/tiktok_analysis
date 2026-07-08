package X;

import com.bytedance.sdk.xbridge.protocol.impl.communication.ravenevent.RavenEvent;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gMW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class C1162700gMW {
    public final String LIZ;
    public final String LIZIZ;
    public long LIZJ;

    public void LIZ(RavenEvent ravenEvent) {
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C1162700gMW)) {
            return false;
        }
        C1162700gMW c1162700gMW = (C1162700gMW) obj;
        if (!Intrinsics.LJFF(this.LIZIZ, c1162700gMW.LIZIZ) || this.LIZIZ.length() <= 0 || !Intrinsics.LJFF(this.LIZ, c1162700gMW.LIZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1162700gMW(String str, long j, int i) {
        String string;
        if ((i & 2) != 0) {
            string = UUID.randomUUID().toString();
        } else {
            string = null;
        }
        this(str, string, (i & 4) != 0 ? -1L : j);
    }

    public C1162700gMW(String str, String str2, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
    }
}
